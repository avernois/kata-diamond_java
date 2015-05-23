package fr.craftinglabs.kata;

public class Diamond {

    public static String create(Character c) {
        int size = c - 'A' + 1;
        int width = size * 2 - 1;
        
        if (c.equals('D')) {
            String diamond = diamondTip(size) + "\n";
            int floor = 3;
            diamond += manySpaces(floor - 1) + "B" + manySpaces(width - 2*floor) + "B" + manySpaces(floor - 1);
            diamond += "\n";
            floor = 2;
            diamond += manySpaces(floor - 1) + "C" + manySpaces(width - 2*floor) + "C" + manySpaces(floor - 1);
            diamond += "\n";
            floor = 1;
            diamond += manySpaces(floor - 1) + "D" + manySpaces(width - 2*floor) + "D" + manySpaces(floor - 1);
            diamond += "\n";
            floor = 2;
            diamond += manySpaces(floor - 1) + "C" + manySpaces(width - 2*floor) + "C" + manySpaces(floor - 1);
            diamond += "\n";
            floor = 3;
            diamond += manySpaces(floor - 1) + "B" + manySpaces(width - 2*floor) + "B" + manySpaces(floor - 1);
            diamond += "\n";

            diamond += diamondTip(size);
            
            return diamond;
        }
        
        if (c.equals('C')) {
            return diamondTip(size) + "\n"
                 + manySpaces(2 - 1) + "B" + manySpaces(width - 2*2) + "B" + manySpaces(2 - 1) + "\n"
                 + manySpaces(1 - 1) + "C" + manySpaces(width - 2*1) + "C" + manySpaces(0) + "\n"
                 + manySpaces(2 - 1) + "B" + manySpaces(width - 2*2) + "B" + manySpaces(2 - 1) + "\n"
                 + diamondTip(size);
        }
        
        if (c.equals('B')) {
            return diamondTip(size) + "\n"
                 + manySpaces(0) + "B" + manySpaces(width - 2) + "B" + manySpaces(0) + "\n"
                 + diamondTip(size);
        }
        
        return "A";
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
