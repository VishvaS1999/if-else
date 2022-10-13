

public class evenfactor
{
    public static void main(String[] args) {
        int n = 56;

        for (int i = 1; i <= 56; i++)
        {
            if (n % i == 0)
            {
                if (i % 2 == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
