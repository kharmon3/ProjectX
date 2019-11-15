public class Fibonacci
{
    public static int MyFib(int i)
    {
        if (i==0) {
            return 0;
        } else if  (i==1){
            return 1;
        } else {
            return MyFib(i-1) + MyFib(i-2);
        }
    }
}
