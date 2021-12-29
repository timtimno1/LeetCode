class Solution {
    public String convert(String s, int numRows)
    {
        if(numRows>=s.length() || numRows==1)
            return s;
        StringBuilder output=new StringBuilder(s.length());
        for(int i=0;i<numRows;i++)
        {
            int oft1=2*(numRows-i-1);
            int oft2=2*i;
            int index=i;
            output.append(s.charAt(index));
            while(index<s.length())
            {
                if(oft1>0)
                {
                    index+=oft1;
                    if(index<s.length())
                    {
                        output.append(s.charAt(index));
                    }
                }
                if(oft2>0)
                {
                    index+=oft2;
                    if(index<s.length())
                    {
                        output.append(s.charAt(index));
                    }
                }
             
            }
        }
         return output.toString();
    }
}