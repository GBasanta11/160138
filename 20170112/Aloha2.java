public class Aloha{
	public static void main(String[] args) {

		Alohaman am= new Alohaman();
		am.sayAloha(300, 10);
	}
}

class Alohaman{
	private String msg;
	private String msg2;

public Alohaman(){
this.msg = "NAMASTE";
this.msg2="Hello";

}
public void sayAloha(){
System.out.println(this.msg);
}
public void sayAloha(int n){
	for (int i=0;  i<n;   i++) {
	System.out.println(i + this.msg);
	
	}
}
public void sayAloha(int n,  int x) {
		for(int i = 0;  i < n;  i++) {
			if(i%x == 0) {
				System.out.println(i+this.msg2);
			} else {
				System.out.println(i+this.msg);
			}
		}
}
}