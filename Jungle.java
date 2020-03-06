import java.lang.Math;
class Jungle 
{
	public static void main(String[] args) 
	{
//------------taking size of forest----------------
		int ax=(int)(Math.random()*20);
		int ay=(int)(Math.random()*20);

//-----------creating forest--------------------
		char ch[][]=new char[ax][ay];

//----------creating land-------------------
		for(int i=0;i<ax;i++)
		{
			for(int j=0;j<ay;j++)
			{
				ch[i][j]='-';
			}
		}

//----------displaying land---------------
		for(int i=0;i<ax;i++)
		{
			for(int j=0;j<ay;j++)
			{
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}

		System.out.println();

//---------inserting trees in forest---------------
		int fs=ax*ay;
		for(int j=0;j<fs;j++)
			{
				int m=(int)(Math.random()*ax);
				int n=(int)(Math.random()*ay);
				ch[m][n]='*';
			}
/*------Another method-----------
		for(int i=0;i<ax;i++)
		{
			for(int j=0;j<ay;j++)
			{
				int x=(int)(Math.random()*ax);
				int y=(int)(Math.random()*ay);
				ch[x][y]='*';
			}
		}
*/
//----------Displaying forest with trees--------------
		for(int i=0;i<ax;i++)
		{
			for(int j=0;j<ay;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}

		int arr[]=new int[ax];
		int count=0;

		for(int i=0;i<ax;i++)
		{
			for(int j=0;j<ax;j++)
			{
				if(ch[i][j]=='*')
				{
					count=count+1;
				}
			}
			arr[i]=count;
		}
		
		int min=arr[0];
		
		for(int i=1;i<ax;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}

		System.out.println("min tree is:"+min);
	}
}
