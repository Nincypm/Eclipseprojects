package pkg;

public class Operators {

	public static void main(String[] args) {

		System.out.println("------Arithmetic Operators------");
		
		
		int a=40,b=20;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//remainder
		
		System.out.println("-------Assignment Operators-------");
		int c=b;
		System.out.println(a+=b);//a=a+b
		System.out.println(a-=b);//a=a-b
		System.out.println(a*=b);//a=a*b
		System.out.println(a/=b);//a=a/b
		System.out.println(a%=b);//a=a%b
		
		
		System.out.println("------Relational Operators--------");
		int x=10,y=20;
		System.out.println(x==y);
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x!=y);
        
        System.out.println("-------Logical Operators----------");
        
        String username="nincy";
        String password="Nincy123";
        
        System.out.println(username=="nincy" && password=="Nincy123");
        System.out.println(username=="nincy" && password=="nincy123");
        System.out.println(username=="Ninc" && password=="Nincy123");
        System.out.println(username=="nincy" || password=="Nincy12");
        System.out.println(username=="nincy" || password=="Nincy123");
        System.out.println(username=="ncy" || password=="Nincy123");
        System.out.println(username=="incy" || password=="Nincy1");
        System.out.println(!(username=="nincy"));
        System.out.println(!(password=="Nincy123"));
        System.out.println(username=="abd" && password=="nic123");
        
        
        System.out.println("--------unary operators---------");
        //++ increment by 1
        //-- decrement by 1
        
        int v3=5;
        System.out.println(v3++);//5
        System.out.println(v3);//6
        System.out.println(++v3);//7
        System.out.println(v3--);//7
        System.out.println(v3);//6
        System.out.println(--v3);//5
        
		System.out.println("--------ternary operators---------");
		//variable=condition?exp1:exp2;
		String ans=x>y?"x is greater":"y is greater";
		System.out.println(ans);
		
		
		
		
		
	}

}
