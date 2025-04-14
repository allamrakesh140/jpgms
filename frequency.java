//frequency count 
public class frequency{
public static void main(String []args)
{
String x="He is aboy he studies in nareshit ";
String word[]=x.split(" ");
for(int i=0;i<word.length;i++)
{
//For each word, we initialize frequencycount to 1 because the word is counted at least once (itself).
int frequencycount=1;

}
for(int j=i+1;j<word.length-1;j++)
{
if(word[i].equalsIgnoreCase(word[j]))
{
frequencycount++;
//The word word[j] is then set to null so that it is not counted again in subsequent comparisons
word[j]=null;
}
}
//After the inner loop finishes, we check if word[i] is still not null. This is important because after counting, we set the matched words to null, and we don't want to print them multiple times.
if(word[i]!=null)
{
System.out.println(word[i]+" "+frequencycount);
}
}
}
}