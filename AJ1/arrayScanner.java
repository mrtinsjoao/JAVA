import java.util.Scanner;

public class arrayScanner {
		public static void main(String[] args) {
			int[][] teste = new int [2][2];
			int i,j;
			Scanner digite = new Scanner(System.in);
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					teste[i][j] = digite.nextInt();  
				}
			}
			
			digite.close();
			
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					System.out.printf("%d\t", teste[i][j]);  
				}
				System.out.println();
			}
			
			
		}
}
