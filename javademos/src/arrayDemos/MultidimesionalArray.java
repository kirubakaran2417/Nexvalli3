package arrayDemos;

public class MultidimesionalArray {
		public static void main(String[] args) {
			   //multi dimensional array
            int[][] nestedArray= {
            		{1,2,3},     //0
            		{4,5,6},    //1
            		{7,8,9}     //2
            };
            
            
            //Loop through each row
            for(int i=0;i<nestedArray.length;i++) {
            	//Loop through each column in the current row
            	for(int j=0;j<nestedArray[i].length;j++) {
            		System.out.print(nestedArray[i][j]+" ");
            	}
            	System.out.println();
            }
		}
}
