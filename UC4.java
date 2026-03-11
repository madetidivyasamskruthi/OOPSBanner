public class UC4 {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", " OOOO   ", " OOOO   ", " PPPPP  ", " SSSSS "),
            String.join("", "O    O  ", "O    O  ", "P    P  ", "S      "),
            String.join("", "O    O  ", "O    O  ", "P    P  ", "S      "),
            String.join("", "O    O  ", "O    O  ", "PPPPP   ", " SSSSS "),
            String.join("", "O    O  ", "O    O  ", "P       ", "     S "),
            String.join("", "O    O  ", "O    O  ", "P       ", "     S "),
            String.join("", " OOOO   ", " OOOO   ", "P       ", " SSSSS ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}