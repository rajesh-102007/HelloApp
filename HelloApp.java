/**
 * @author [A Rajesh Kanna]
 * @version 1.0 UC3
 */
class UseCase4 {
    public static void main(String args[]) {
        String name;
        StringBuilder nameBuilder = new StringBuilder();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        } else {
            name = "World"; // Default message
        }

        System.out.println("Hello, " + name + "!");
    }
}