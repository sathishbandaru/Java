public class FinalKeyword {
    public static void main(String[] args) {
        final int x = 200;
        try { 
            // x = 300; //error: cannot assign a value to final variable x
        } catch (Exception e) {
            System.out.println("error : "+e);
        }
        finally{
            System.out.println("in finally block");
        }
    }
}
