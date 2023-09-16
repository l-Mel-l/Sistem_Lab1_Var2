import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[1000];
        Random random = new Random();

        int minimum1 = 10001;
        int minimum3 = 10001;
        int minimum7 = 10001;
        int minimum21 = 10001;
        int otvet1 = 0;
        int otvet2 = 0;

        for(int i = 0;i < numbers.length;i++){
            numbers[i] = random.nextInt(10000);
            if (numbers[i] < minimum1) {
                minimum1 = numbers[i];
            }
            if ((numbers[i] % 3 == 0) && (numbers[i] < minimum3)) {
                minimum3 = numbers[i];
            }
            if ((numbers[i] % 7 == 0) && (numbers[i] < minimum7)) {
                minimum7 = numbers[i];
            }
            if ((numbers[i] % 21 == 0) && (numbers[i] < minimum21)) {
                minimum21 = numbers[i];
            }
        }
        

        if(minimum1 != 10001 && minimum21 != 10001){
            otvet1 = minimum1 * minimum21;
        }

        if(minimum3 != 10001 && minimum7 != 10001){
            otvet2 = minimum3 * minimum7;
        }

        if (otvet1 == 0 && otvet2 == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(Math.max(otvet1, otvet2));
        }
    }
}