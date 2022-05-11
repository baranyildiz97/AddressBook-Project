//151805042 BARAN YILDIZ

package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class FileOps implements Ops{

	
	// Add data to database
	@Override
	public void addDatabase(int id, String name, String street, String city, String gender, String zip, File file)throws IOException  
	{
		try {
			PrintWriter pw=new PrintWriter(new FileOutputStream(file,true));
		      pw.append(id+","+name+","+street+","+city+","+gender+","+zip+"\n");
		      pw.close();
		}
		catch (Exception e) {
			Alert er =new Alert(AlertType.ERROR);
			er.setTitle("Error");
			er.setHeaderText("An error occured");
			
		}
		  
		
	}
	
	
	// Update data on database
	@Override
	public void updateDatabase(int id, File f,String [] update){
		
		 StringBuffer sb=new StringBuffer();
	        try
	        {
	            BufferedReader br=new BufferedReader(new FileReader("DataBase.txt"));
	            String s="";
	            while((s=br.readLine())!=null)
	            {
	                String data[]=new String[6];
	                data=s.split(",");
	                if(id==Integer.parseInt(data[0]))
	                {
	                    String row=data[0]+",";
	                    for(int i=0;i<5;i++)
	                    {
	                            row=row+update[i]+",";
	                    }
	                    sb.append(row);
	                    sb.append("\n");
	                }
	                else
	                {
	                    sb.append(s);
	                    sb.append("\n");
	                }
	            }
	            

	   
	        // Database creation successfully
	        PrintWriter pw=new PrintWriter(new FileOutputStream(f,false));
	        pw.print(sb.toString());
	        pw.close();
	        Alert suc=new Alert(AlertType.CONFIRMATION);
	        suc.setTitle("Success");
	        suc.setHeaderText("Update successful");
	        suc.show();
	        }
	        catch(Exception e)
	        {
	        	Alert error=new Alert(AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("An error occured");
	        }
    
	}
                
          
}



	

