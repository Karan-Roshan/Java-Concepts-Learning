class errorException extends Exception{

    public errorException(String str) {
        super(str);
    } 
}

class customException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if(j == 0) {
                throw new errorException("I don't want this");
            }
        } 
        catch (errorException e) {
            j = 18/1;
            System.out.println("that's the default output.." + " " + e);
        }
        catch (Exception e) {
            System.out.println("Something Went Wrong.." + e);
        }

        System.out.println(j);
    }
}