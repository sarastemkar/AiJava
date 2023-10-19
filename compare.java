import java.lang.*;

class compare
{
public static boolean strcmp(String s,String d)
{
int flag=1;

if(s.length()!=d.length())
return false;

int maxlen = s.length();
char[] arr1 = new char[maxlen];
char[] arr2 = new char[maxlen];

for ( int i=0;i<s.length();i++)
arr1[i] = s.charAt(i);

for(int i=0;i<s.length();i++)
arr2[i] = d.charAt(i);



for(int i=0;i<maxlen;i++)
{
if(arr1[i]!=arr2[i])
{
flag=0;
return false;
}
}

return true;

}}
 