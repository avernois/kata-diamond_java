package fr.craftinglabs.kata.diamond;

public class Diamond {
    
    private static final String END_OF_LINE = "\n";

    public static String create(Character letter) {
        int diamondSize = diamondSizeForChar(letter);
        
        if (diamondSize == 1) return letter.toString();
            
        return buildDiamond(diamondSize);
    }

    private static String buildDiamond(int diamondSize) {
        StringBuilder diamond = new StringBuilder();
        
        diamond.append(firstLine(diamondSize)).append(END_OF_LINE);
        
        for (int depth = 2; depth < diamondWidth(diamondSize) ; depth ++) {
            diamond.append(lineAtDepth(diamondSize, depth));
            diamond.append(END_OF_LINE);
        }
        
        diamond.append(firstLine(diamondSize));
        
        return diamond.toString();
    }

    private static int diamondSizeForChar(Character letter) {
        return letter - 'A' + 1;
    }

    private static String firstLine(int diamondSize) {
        return outsideSpace(diamondSize, 1) + "A" + outsideSpace(diamondSize, 1);
    }
    
    private static String lineAtDepth(int diamondSize, int depth) {
        Character character = getCharacterAtDepth(diamondSize, depth);
        StringBuilder builder = new StringBuilder();
        return builder
                .append(outsideSpace(diamondSize, depth)) 
                .append(character)
                .append(insideSpace(diamondSize, depth))
                .append(character.toString())
                .append(outsideSpace(diamondSize, depth))
                .toString();
    }

    private static Character getCharacterAtDepth(int diamondSize, int depth) {
        return Character.toChars('A' + diamondSize - numberOfOutsideSpaces(diamondSize, depth) - 1)[0];
    }

    private static String insideSpace(int size, int depth) {
        StringBuilder builder = new StringBuilder();
        int width = diamondWidth(size);
        for (int i = 0; i < width - 2 - (2 * numberOfOutsideSpaces(size, depth)); i++) {
            builder.append(" ");
        }
        
        return builder.toString();
    }

    private static int diamondWidth(int size) {
        return size * 2 - 1;
    }

    private static String outsideSpace(int size, int depth) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < numberOfOutsideSpaces(size, depth); i++) {
            builder.append(" ");
        }
        
        return builder.toString();
    }

    private static int numberOfOutsideSpaces(int size, int depth) {
        return Math.abs(size - depth);
    }
}
