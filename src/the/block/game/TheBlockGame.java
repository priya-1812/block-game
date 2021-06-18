/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.block.game;import java.util.Scanner;
public class TheBlockGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int n=in.nextInt();
            int temp=n;
            int rem,rev=0;
            while(n>0)
            {
                rem=n%10;
                rev=rev*10+rem;
                n/=10;
            }  
            if(rev==temp)
            {
                System.out.println("wins");
            }
            else
            {
                System.out.println("loses");
            }
        }
        t--;
    }
    
}
