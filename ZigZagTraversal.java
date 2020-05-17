/*package whatever //do not write package name here */

import java.io.*;

class ZigZagTraversal {
    
    
    public void zigzag(int[][] arr, int rs, int re, int cs,int ce){
        
        if(rs > re || rs - 1 == arr[0].length)
        {
            
            return;
        }
          
          // Print Straight
        for(int i = cs - 1;i < ce;i++){
            
            System.out.print(arr[rs-1][i]);
            
        }
        
        
        
        System.out.println("");
        
        if(re - 1 >= arr.length){
            
            return;
        }
        
       // Print Reverse
        for(int i = ce - 1; i>=cs - 1;i--){
            
            System.out.print(arr[re - 1][i]);
            
        }
        
        System.out.println("");
        
      zigzag(arr, rs + 2, re + 2,cs,ce);
        
        
        
    }
    
    
	public static void main (String[] args) {
		int [][] array = {{1,2,3,11,22},{4,5,6,20,30},{7,8,9,78,45}};
	
	int startrow = 1;
	ZigZagTraversal zzt = new ZigZagTraversal();
	zzt.zigzag(array,startrow,startrow + 1,1,array[0].length);
		
		
	}
}
