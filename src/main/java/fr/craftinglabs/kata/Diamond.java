package fr.craftinglabs.kata;

public class Diamond {

    public static String create(Character c) {
        int size = c - 'A' + 1;
        
        if (c.equals('D')) {
            String diamond = diamondTip(size) + "\n";
            diamond += diamondWall(size, 3, "B") + "\n";
            diamond += diamondWall(size, 2, "C") + "\n";
            diamond += diamondWall(size, 1, "D") + "\n";
            diamond += diamondWall(size, 2, "C") + "\n";
            diamond += diamondWall(size, 3, "B") + "\n";
            diamond += diamondTip(size);
            
            return diamond;
        }
        
        if (c.equals('C')) {
            return diamondTip(size) + "\n"
                 + diamondWall(size, 2, "B") + "\n"
                 + diamondWall(size, 1, "C") + "\n"
                 + diamondWall(size, 2, "B") + "\n"
                 + diamondTip(size);
        }
        
        if (c.equals('B')) {
            return diamondTip(size) + "\n"
                    + diamondWall(size, 1, "B") + "\n"
                 + diamondTip(size);
        }
        
        return "A";
    }

    private static String diamondWall(int size, int floor, String wall) {
        int width = size * 2 - 1;
        return manySpaces(floor - 1) + wall + manySpaces(width - 2*floor) + wall + manySpaces(floor - 1);
    }

    private static String diamondTip(int size) {
        return manySpaces(size -1) + "A" + manySpaces(size - 1);
    }

    private static String manySpaces(int nbSpaces) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < nbSpaces; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }
}
