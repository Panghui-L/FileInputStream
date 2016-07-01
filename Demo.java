package com.orilore.gb.main2;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
	    boolean flag = true;	
		
	    while(flag){
		
		System.out.println("请输入您要选择复制文件的文件夹");
		
		String inputdirname = s.next();
		
		File file = new File(inputdirname);
		
		if(file.exists()){
			
			if(file.isDirectory()){
				
			File[] files =   file.listFiles();
		
			for(File f:files){
				
			  if(f.isFile()){
				  
				   System.out.println(f.getName());
				  
				  
			  }	
				
				
			}
			boolean flag1 = true;
			String cstr = null;
			while(flag1){
			System.out.println("请输入您要复制的文件名字");
		
		  cstr = s.next();//?????
		  
		  
		   
		File cstrfile = new File("E:/2016625lianxi"+"/"+cstr);
		   System.out.println("E:/2016625lianxi"+"/"+cstr);
		if(cstrfile.exists()&&cstrfile.isFile()){
			
			
			System.out.println("$$$$$");
			break;
			
		}
		else{
			
			System.out.println("您输入的文件名字不存在请重新输入");
			
			continue;
		}
			}
		   boolean flag2 = true;
		   String cdirname = null;
		   while(flag2){
		   System.out.println("请输入您要复制到哪个文件夹");
		   
		   cdirname = s.next();
		   
		  File checkfile = new File(cdirname);
		   
		    if(checkfile.exists()&&checkfile.isDirectory()){
		    	
		        break;
		    	
		    	
		    }
		    
		    else{
		      	System.out.println("输入有错误请重新输入");
		      	
		      	continue;
		    	
		    }
		   }
		   
		  try {
			FileInputStream finput = new FileInputStream(inputdirname+"/"+cstr);
			BufferedInputStream finput1 = new BufferedInputStream(finput);
			ObjectInputStream finput2 = new ObjectInputStream(finput1);
		 
		    FileOutputStream fout = new FileOutputStream(cdirname+"/"+cstr);
		    BufferedOutputStream fout1 = new  BufferedOutputStream(fout);
		    ObjectOutputStream fout2 = new ObjectOutputStream(fout1);
		    //加快  批量处理
		    
		    int read = 0;
		    
		    while((read=finput2.read())!=-1){
		    	
		    	    fout2.write(read);
		    	
		    	
		    }
		    
		    fout2.flush();
		    
		    fout2.close();
		    
		    finput2.close();
		    
		  System.out.println("您是否继续YES继续");
		  
		  String userinput = s.next();
		  
		  if(!"yes".equalsIgnoreCase(userinput)){
			  
							break;
			  
			  
		  }
		  
		  
		    
		    
		    
		    
		  
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

				break;
				
				
				
			}
			
			else{
				
	         System.out.println("对不起我要的是文件夹不是文件请重新输入");
				
				
				continue;
				
			}
			
			
			
		}
		else{
			
			System.out.println("您输入的文件夹不存在请重新输入");
			
			continue;
		}
		
		
		
		
		
		
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
