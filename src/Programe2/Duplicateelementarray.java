package Programe2;

public class Duplicateelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]={1,5,2,5,4,4,6,3,3};
     for(int i=0;i<=a.length-1;i++){
    	 for(int j=i+1;j<=a.length-1;j++){
    		 if(a[i]==a[j]){
    			 
    			 
    		 
    		 System.out.println("duplicateelement"+a[i]);
    	 }
     }
	}

}}
