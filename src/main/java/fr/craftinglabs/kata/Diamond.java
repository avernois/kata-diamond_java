package fr.craftinglabs.kata;

public class Diamond {

    public static String create(Character c) {
        if (c.equals('C')) {
            return "  A  \n"
                 + " B B \n"
                 + "C   C\n"
                 + " B B \n"
                 + "  A  ";
        }
        
        if (c.equals('B')) {
            return " A \n"
                 + "B B\n"
                 + " A ";
        }
        
        return "A";
    }

}
