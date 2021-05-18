 import java.util.*;
class pattern3
{
	public static void main(String[] a)
	{
		String name;
		Scanner s=new Scanner(System.in);
		name=s.next();     //name
		int l;
		l=name.length();    //length of name
		int nl=l+3;         //get the total lenth thats names length and "  +"
                int nll=22-nl;      //i will remove that from that row count
		for(int i=9;i>0;i--)
		{
			if(i==1||i==9)
			{
				System.out.println("+--------------------+");
			}
			else
			{
				for(int j=1;j<23;j++)
				{
					if(j==1||j==22) 
					{
						System.out.print("|");
					}
					else
					{
	
						if(i==3 && j==nll+1)
						{
							System.out.print(name+"  "+"|");
							break;	
						}
						else
						{
				
							System.out.print(" ");
						}
						
					}
				
				}
				System.out.println();
			}
		}
	}
}