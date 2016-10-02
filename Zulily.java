package ungrouped;

import java.io.*;
import java.util.*;
class Zulily {
	public static void main(String [] args) throws Exception{
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
        String str = "000110000100010010100010,000001000000000110001000,000000010000110010010001,100001000000000001110000,100000000000001110000011,010100110000101000000010,000001000110110011000001,001001001000000000010001,000000010010101000010010,100000100000110000101000,000000101000010010000010,000000000000000100010100,001001101100010110101000,101000100110100000000100,000011001000000010000001,010010000001100011010000,111010100010101101001000,000100100000000110001001,100100000100100000000001,001100011001000100000100,010000000100100011000010,000000000001010000010011,100011001010000000001100,001010110000001001100100";
        String [] person = str.split(",");
        int x = 8;
        int y = 15;
        int len = person[0].length();
        int ctr=0;
        //Friends of x and Y stored in an array
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<len;i++)
        {
        	if(person[y].charAt(i)=='1' && i!=x)
                set1.add(i);
        }
        for(int i=0;i<len;i++)
        {
        	if(person[x].charAt(i)=='1' && i!=y)
                set2.add(i);
        }
        /*if(set1.size()>set2.size())
        {
        	set1=set2;	
        	int t=x;
        	x=y;
        	y=t;
        }*/
        TreeSet<Integer> temp = new TreeSet<>();
        TreeSet<Integer> set = new TreeSet<>(set1);
        //System.out.println(set);
        temp=set;
        for(int i=0;i<len;i++)
        {
        	if(person[x].charAt(i)=='1' && i!=y)
            {
            	for(int j=0;j<len;j++)
                {
                    if(person[i].charAt(j)=='1')
                    {
                        if(set.contains(j))
                        {	ctr++;
                        	System.out.println(set);
                        	set.remove(j);
                        }
                    }                    
                }
            }
            set=temp;
        }
        System.out.println(ctr);
    }
}