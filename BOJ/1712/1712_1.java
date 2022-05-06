/**
* 메모리: 17664 KB, 시간: 212 ms
* 2022.05.06
* by Alub
*/
import java.util.Scanner;

//1712_손익분기점
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		a = sc.nextInt();  //a=고정비용 
		b = sc.nextInt();  //b=한 대 생산에 들어가는 비
		c = sc.nextInt();  //c=판매비
		
		int result;
		if(b >= c) {
			System.out.println("-1");
		}	else {
			System.out.println( a/ (c-b) + 1);
		}

	
		
	}
	
	
}

