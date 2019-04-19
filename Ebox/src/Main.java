import java.util.*; 

import java.util.ArrayList;
import java.util.HashMap; 
import java.util.Map; 
public class Main
{ public static void main(String[] args) 
{ Scanner s=new Scanner(System.in); 
int n=s.nextInt();
	String[] s1=new String[n]; 
	for(int i=0;i<n;i++) 
	{ s1[i]=s.next(); 
	} 
	HashMap<String, String> hm = new HashMap<String, String>(); 
	hm = UserMainCode.putvalues(s1); 
	for(Map.Entry<String, String> ans: hm.entrySet())
	{
		System.out.println(ans.getKey()+":"+ans.getValue()); 
	} }


public static class UserMainCode
{ public static HashMap<String, String> putvalues(String[] s1) 
{
	HashMap<String, String> hm = new HashMap<String, String>(); 
	ArrayList<String> lst1 = new ArrayList<String>();
	ArrayList<String> lst2 = new ArrayList<String>();
	for(String s : s1) lst1.add(s.toUpperCase().substring(0,3)); 
	for(String s : s1) lst2.add(s); 
	for(int i=0;i<s1.length;i++)
	{ hm.put(lst1.get(i),lst2.get(i)); }
	return hm; }
	}
}