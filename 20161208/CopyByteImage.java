import java.io.*;
public class CopyByteImage{
	public static void main(String[] args) {
		FileInputStream inFile=null;

try{
	inFile =new FileInputStream("1.jpg");
			FileOutputStream outFile=new FileOutputStream("2.jpg");

			int data;
			int n=0;

		while((data = inFile.read())!=-1){
			n++;
	//	System.out.println("くり返し:"+n+"回です。");
			outFile.write(data);
		}

	inFile.close();


}catch(IOException e){
	System.err.println("エラーです。");
	System.exit(1);
}
}
}

	
