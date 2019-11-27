
public class Number_pattern {

	public static void main(String[] args) {
		int i,j, k;
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
		for(i=1;i<=5;i++)
		{
			System.out.print("5 ");
		}
		System.out.print("\n");
		for(i=4;i>=1;i--)
		{
			for(j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			} 
			System.out.print("\n");


	}

}
}
