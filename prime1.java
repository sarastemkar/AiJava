import java.lang.*;
import java.util.*;

class prime1
{
public static void main(String args [])
{
int i,j;

for(i=3;i<=30;i++);
{	
	for(j=4;j<=i;j++)
	{
	if(i%j==0)
	{
		break;
	}
	System.out.println(i);
	}

}
}
}