public class Aloha{
	public static void main(String[] args) {
		for(int i=0;i<30;i++){
		if (i==10||i==20){
			System.out.println("アロハ");
		} else{   
		System.out.println(i+"Aloha");
		}
		
		}
		System.out.println(args[0]+"さん、アロハ！");
	}
}
