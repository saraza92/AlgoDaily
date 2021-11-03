public class StringToInt {
    public int myAtoi(String s) {
        if(s==null||s.length()==0)
            return 0;
        long result=0;
        char sign = '+';
        char[] schar = s.toCharArray();
        int i=0;
        while(schar[i]==' '){
            i++;
            if(i==s.length())
                return (int) result;
        }
        if(schar[i]=='-'||schar[i]=='+'){
            sign=schar[i];
            i++;
        }
        while(i<s.length()){
            if(!Character.isDigit(schar[i]))
                break;

            result*=10;
            result+=(schar[i]-48);
            if(result>Integer.MAX_VALUE)
                if(sign=='-'){
                    result=Integer.MIN_VALUE;
                    break;
                }
                else{
                    result=Integer.MAX_VALUE;
                }

            i++;

        }
        if(sign=='-'&&result!=Integer.MIN_VALUE)
            result*=-1;
        return (int) result;
    }
}
