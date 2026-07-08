public class DrinkMenu {
    public static void main(String[] args) {
        int option = 2;

        switch(option){
            case 1:
                System.err.println("Black tea");
                break;
            case 2:
                System.err.println("Green tea");
                break;
            case 3:
                System.err.println("Coffee");
            default:
                System.err.println("Unknown option");
        }
    }
    
}
