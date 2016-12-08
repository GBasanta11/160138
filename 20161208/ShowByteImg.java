import java.io.*;
public class ShowByteImg{
	public static void main(String[] args) {


FileInputStream inFile=null;
try{
	inFile =new FileInputStream("1.jpg");
	//int data=inFile.read();
			int data;
			int n=0;

		while((data = inFile.read())!=-1){
			n++;
			System.out.println("くり返し:"+n+"回です。");

		}

	inFile.close();


}catch(IOException e){
	System.err.println("エラーです。");
	System.exit(1);
}
}
}
