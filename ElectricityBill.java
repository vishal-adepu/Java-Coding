import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt(); 
        double bill=0;

        if(N <= 50)
            bill= N*0.5 ;
        else if(N>=51 && N<=150)
            bill= (0.5*50)+((N-50)*0.75) ;
        else if(N>=151 && N<=250)
            bill= (0.5*50)+(0.75*100)+((N-150)*1.20) ;
        else if(N> 250)
            bill = (0.5*50)+(0.75*100)+(1.20*100)+((N-250)*1.50) ;

        
         double  billWithSurcharge=   (bill + 0.2*bill);
         System.out.println((int)billWithSurcharge);

        
    }
}
