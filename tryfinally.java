public class tryfinally {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = i / j;
        }
        catch(Exception e) {
            System.out.println("Something Went Wrong..");
        }
        finally {
            System.out.println("End");
        }
    }
}
