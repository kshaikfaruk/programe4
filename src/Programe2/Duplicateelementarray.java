package Programe2;

public class Duplicateelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]={1,2,3,3,4,4,5,6,7,8,9,10,10};
       for(int i=0;i<=a.length-1;i++){
    	   for(int j=i+1;j<=a.length-1;j++){
    		   if(a[i]==a[j]){
    			   System.out.println("Duplicateelement"+a[i]);
    			   
    		   }
    	   }
       }
	}

}
