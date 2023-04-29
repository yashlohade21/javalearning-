public class TryCatchWithEh {
    public static void main(String args[]){
        int number, InvalidCount = 0, validCount = 0;
        for(int i = 0; i < args.length; i++){
            try{
                number = Integer.parseInt(args[i]);
            }catch(NumberFormatException e){
                InvalidCount++;
                System.out.println("Invalid Number at " + i + args);
            }
            validCount++;
            System.out.println("Valid Number at " + i + " " + args);
        }
        System.out.println("Invaild Number: " + InvalidCount);
        System.out.println("Valid Number: " + validCount);
    }
}
