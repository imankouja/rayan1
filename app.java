
package boygirl;

import java.io.*;
import java.util.Scanner;

public class BoyGirl {

    public static void main(String[] args) {
        int i=0, nbboy=0,nbgirl=0,sumboy=0,sumgirl=0;
        try{
            File girlboy =new File("a5.txt");
            Scanner in=new Scanner(girlboy);
            
            while(in.hasNext()){
                String In=in.next();
                if(i%2==0){
                    nbboy++;
                    sumboy+=in.nextInt();
                }
                else {
                    nbgirl++;
                    sumgirl+=in.nextInt();
            }
                i++;
            }
            in.close();
            System.out.println(nbboy+" boys"+nbgirl+" girls");
            System.out.print("Difference between boys' and girls' sum  "+  Math.abs(sumboy-sumgirl));
        }
        catch( FileNotFoundException e){
            
        System.out.print(e);}
        
    }
    
}
