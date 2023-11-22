package practice;

public class Practice4_12 {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 27 ; i++) {
            for (int j = 1; j <= 3; j++) {
                int x = j+1+(i-1)/9*3;
                int y = i%9==0? 9 : i%9 ;
                if(x > 9)
                    break;
                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
            if(i%9==0) System.out.println();
        }
    }
}
