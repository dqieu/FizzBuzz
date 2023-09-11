public class Reduce {
    public static void main(String[] args) {
        int outp = 0;
        int i = 100;
        while(i != 0){
            boolean divisibleBy2 = i % 2 == 0;
            if(divisibleBy2){
                i = i/2;
                outp++;
            }
            else{
                i--;
                outp++;
            }
        }
        System.out.println(outp);
    }
}
