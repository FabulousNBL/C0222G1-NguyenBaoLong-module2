package _02_loop.exercise;

public class Print20FirstPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int a = 2;
        int n =20;
        System.out.println(" số nguyên tố đầu tiên là:");
        while (count <n){
            boolean check = true;
            for (int i =2; i<a;i++){
                if(a % i ==0){
                    check= false;
                    break;
                }
            }
            if (check){
                System.out.println(a);
                count++;
            }
            a++;
        }
    }
}
