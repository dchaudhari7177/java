public class eighteenth {
    public static void main(String[] args) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;

            }
            else
            {
             sum1 =sum1+i;
            }
        }
        System.out.println("Addition of Even numbers from 1 to 100 is"+sum);
        System.out.println("Addition of odd numbers from 1 to 100 is"+sum1);
    }
}
