import java.util.*;
public class ques20 {

        public static void main(String args[])
    {Scanner ob=new Scanner(System.in);
     int save=0;
        System.out.println("enter the number");
        int num=ob.nextInt();
        for(int i=1;i<=num;i++)
        {
        if(num%i==0)
        {
            int count=0;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
                count++;
        }
        if(count==0)
           {  save=i;}


}
       
}System.out.println("largest prime factor: " + save);
       ob.close();

}

}
