package Programe2;

public class Findtwomax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]={10,20,40,50,60};
      int maxone=0;
      int maxtwo=0;
      for(int n:a){
    	  if(maxone<n){
    		  maxone=maxtwo;
    		  maxone=n;
    		  
    	  }else
    		  if(maxtwo<n){
    			  maxtwo=n;
    			  
    		  }
    	  }
    	  System.out.println(maxone);
    	  System.out.println(maxone);
    	  
      }
	}


