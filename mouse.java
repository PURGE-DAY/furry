import java.lang.Math;

/*
class Mouse 
{
	public static void main(String[] args) 
	{
		int x, y;
		char ch[][]=new char[10][10];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				ch[i][j]='_';
			}
		}

		x=(int)(Math.random()*10);
		y=(int)(Math.random()*10);

		ch[x][y]='#';
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Shortest distance:"+((x+1)+(y+1)));
	}
}
*/

class Abs
{
	public static void main(String[] args)
	{
		int size=(int)(Math.random()*20);
		char ch[][]=new char[size][size];
//------------inserting value--------------------
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				ch[i][j]='-';
			}
		}
//-----------showing value---------------------
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		int x=(int)(Math.random()*size);
		int y=(int)(Math.random()*size);
		
		ch[x][y]='*';
//------------showing after cheese--------------
		System.out.println();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("resultant:"+(x+y-1));
		System.out.println("resultant:"+(x+y-1));
	}
		
}
