package fr.craftinglabs.kata;

public class Diamond {

    public static String create(Character c) {
        int size = c - 'A' + 1;
        
        if(size == 1) return "A";
        
        String diamond = diamondTip(size) + "\n";
        
        for (int floor = size - 2; floor >= -(size - 2) ; floor --) {
            diamond += diamondWall(size, floor)  + "\n";
        }
        
        diamond += diamondTip(size);
        
        return diamond;
    }        

    private static String diamondWall(int size, int floor) {
        int width = size * 2 - 1;
        int absoluteFloor = Math.abs(floor);
        
        Character w = Character.toChars('A' + size - absoluteFloor -1)[0]; 
        return manySpaces(absoluteFloor) + w + manySpaces(width - 2*(absoluteFloor + 1)) + w + manySpaces(absoluteFloor);
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
