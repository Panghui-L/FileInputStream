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
		
		System.out.println("��������Ҫѡ�����ļ����ļ���");
		
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
			System.out.println("��������Ҫ���Ƶ��ļ�����");
		
		  cstr = s.next();//?????
		  
		  
		   
		File cstrfile = new File("E:/2016625lianxi"+"/"+cstr);
		   System.out.println("E:/2016625lianxi"+"/"+cstr);
		if(cstrfile.exists()&&cstrfile.isFile()){
			
			
			System.out.println("$$$$$");
			break;
			
		}
		else{
			
			System.out.println("��������ļ����ֲ���������������");
			
			continue;
		}
			}
		   boolean flag2 = true;
		   String cdirname = null;
		   while(flag2){
		   System.out.println("��������Ҫ���Ƶ��ĸ��ļ���");
		   
		   cdirname = s.next();
		   
		  File checkfile = new File(cdirname);
		   
		    if(checkfile.exists()&&checkfile.isDirectory()){
		    	
		        break;
		    	
		    	
		    }
		    
		    else{
		      	System.out.println("�����д�������������");
		      	
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
		    //�ӿ�  ��������
		    
		    int read = 0;
		    
		    while((read=finput2.read())!=-1){
		    	
		    	    fout2.write(read);
		    	
		    	
		    }
		    
		    fout2.flush();
		    
		    fout2.close();
		    
		    finput2.close();
		    
		  System.out.println("���Ƿ����YES����");
		  
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
				
	         System.out.println("�Բ�����Ҫ�����ļ��в����ļ�����������");
				
				
				continue;
				
			}
			
			
			
		}
		else{
			
			System.out.println("��������ļ��в���������������");
			
			continue;
		}
		
		
		
		
		
		
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
