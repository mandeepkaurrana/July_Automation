package misc;

class A{
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(int a[]) {
		int s=0;
		for(int i:a) {
			s=s+i;
		}
		System.out.println(s);
	}
	void add(int... k) {
		int s=0;
		for(int i:k)			//for(int i=0;i<k.length;i++) //allowed 
		{
			s=s+i;
		}
		System.out.println(s);
	}
}
public class VarArgs {
	public static void main(String[] args) {
		A x=new A();
		x.sum(10,20);
		
		int arr[]= {11,22,33,44,55,66};
		x.sum(arr);
	
		x.add(10,20);	//30
		x.add(10,20,30);	//60
		x.add(10,20,30,40);	//100
		x.add();
		
		
		

	}

}
