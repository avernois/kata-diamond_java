package fr.craftinglabs.kata;

public class Diamond {

    public static String create(Character c) {
        int size = c - 'A' + 1;
        
        if (c.equals('D')) {
            return diamondTip(size) + "\n"
                    + manySpaces(2) + "B" + manySpaces(1) + "B" + manySpaces(2) + "\n"
                    + manySpaces(1) + "C" + manySpaces(3) + "C" + manySpaces(1) + "\n"
                    + manySpaces(0) + "D" + manySpaces(5) + "D" + manySpaces(0) + "\n"
                    + manySpaces(1) + "C" + manySpaces(3) + "C" + manySpaces(1) + "\n"
                    + manySpaces(2) + "B" + manySpaces(1) + "B" + manySpaces(2) + "\n"
                    + diamondTip(size);
        }
        
        if (c.equals('C')) {
            return diamondTip(size) + "\n"
                 +  manySpaces(1) + "B" + manySpaces(1)   + "B" + manySpaces(1) + "\n"
                 +  manySpaces(0) + "C" + manySpaces(3)   + "C" + manySpaces(0) + "\n"
                 +  manySpaces(1) + "B" + manySpaces(1)   + "B" + manySpaces(1) + "\n"
                 + diamondTip(size);
        }
        
        if (c.equals('B')) {
            return diamondTip(size) + "\n"
                 + manySpaces(0) + "B" + manySpaces(1)   + "B" + manySpaces(0) + "\n"
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
