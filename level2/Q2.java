import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        String[] names={"Amar", "Akbar","Antony"};
        int[] age= new int[3];
        double[] height=new double[3];

        for(int i=0;i<3;i++)
        {
            System.out.println("Enter age of "+ names[i]);
            age[i]=input.nextInt();
            System.out.println("Enter height:");
            height[i]=input.nextDouble();
        }
        int youngest=0,tallest=0;
        for(int i=1; i<3;i++)
        {
            if(age[i]<age[youngest])
                youngest=i;
            if(height[i]>height[tallest])
                tallest=i;
        }
        System.out.println("Youngest friend is: "+ names[youngest]);
        System.out.println("Tallest friend is: "+ names[tallest]);
        
        input.close();
    }
}
