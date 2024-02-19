public class calc extends ext_calculator{
    public static void main(String[] args)
    {
        calc cal = new calc();
        float n1=10,n2=20,result;
        String op="+";
        switch(op)
        {
            case"+":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"-":result=n1-n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"*":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"/":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
        }
        float s = square(n1);
        System.out.println(s);
        float c = cube(n1);
        System.out.println(c);
    }
}

