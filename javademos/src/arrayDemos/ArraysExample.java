package arrayDemos;

public class ArraysExample {
	//Array-data structure-that stores elements of the same type
	//How to declare an array  ?--datatype[] arrayName;
	public static void main(String[] args) {
		int[] num=new int[5];//The length of the array cannot be changed after it is created 
		//Display the arrays length i.e.,the number of elements we put into the array  
		int length=num.length;
		System.out.println("The size of an array is: "+num.length);
		
		//initializing array and accessing its elements
		num[0]=23;
		num[1]=32;
		num[2]=43;
		num[3]=56;
		num[4]=65;
		
		String[] seasons=new String[] {"winter","spring","summer","autumn"};
		
		int[] values= {1,2,3,4,5};
		int sumOfElements=0;
		System.out.println(num[2]);
		System.out.println(seasons[3]);
		
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		
		//loop through each index in the array and add all elements 
		//store in sumOfElements
		  for(int i=0;i<num.length; i++) {
			  sumOfElements+=num[i];
	        }
	            
	            System.out.println(sumOfElements);
	            double ave=sumOfElements/num.length;
	            System.out.println(ave);
	            
	            int[] valuesOffive= {12,15,30,75,42,69};
	            int maxElement=valuesOffive[0];
	            for(int i=1;i<valuesOffive.length;i++) {
	            	if(valuesOffive[i]>maxElement) {
	            		maxElement=valuesOffive[i];
	            	}
	            }
	            
	         
	        }
	
	
		
	}
	
	
	

