public class exceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            System.out.println(j);
        } 
        catch (Exception e) {
            System.out.println("Something went wrong..." + " " + e);
        }

        System.out.println("End Here");
    }
}
