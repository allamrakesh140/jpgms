import java.util.HashSet;
public class hashset1{
public static void main(String []args)
{
HashSet<Integer> hs=new HashSet<Integer>();
hs.add(10);
hs.add(11);
hs.add(23);
hs.add(10);
//duplocates are not allowed
hs.add(10);
hs.add(null);
hs.add(null);
System.out.println("elements in the hashset:"+hs);
}
}