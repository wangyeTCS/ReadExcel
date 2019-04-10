import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
// import Apache Poi for reading / writing Excel files
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.io.*;


public class EmployeeSort 
{
    private static String tempId=null;
    private static String tempFN=null;
    private static String tempLN=null;
    private static String tempJT=null;
    private static String str1=null;

	 
    
	public static void main(String[] args) throws IOException
	
	{
		FileInputStream file= new FileInputStream( "C:\\Users\\Ye Wang\\eclipse-workspace\\Assignmen2edition\\Employee.xls" ); //read excel sheet
		
		Workbook workbook= new HSSFWorkbook(file);// create a workbook to hold excel sheet
		Sheet sheet=workbook.getSheetAt(0);// read from very first sheet of the excel file
		
		Iterator <Row> rowIterator=sheet.iterator();
		// To check through all the rows in excel sheet
		
		 ArrayList <Employee> EmployeeList= new ArrayList();
		 
		 
		while (rowIterator.hasNext())
		{
			 Row row = rowIterator.next();
			 Iterator <Cell> cellIterator= row.cellIterator();
			 //go through each column of the row
			 while(cellIterator.hasNext())
			 {
				 Cell cell=cellIterator.next();
				 
				 if (cell.getCellTypeEnum() == CellType.NUMERIC)
				 {
					 int id1=0;
					 id1=(int)cell.getNumericCellValue();
					 tempId=Integer.toString(id1);// conver int value ID to string
				 }
				 else 
				 {    
					 if(str1==null)
					 {
						 str1=cell.getStringCellValue()+"\t/";
					 }
					 else
					 {
						 str1+=cell.getStringCellValue()+"\t/";
					 }
					
				 
				
				 }
				 
				 
			 

	           }
			 
			 
			 String [] temp=str1.split("/");
			 tempFN=temp[0];
			 tempLN=temp[1];
			 tempJT=temp[2];
			 
			 
			 Employee emp=new Employee(tempId,tempFN,tempLN,tempJT);
			 
			 EmployeeList.add(emp);
		}
		
		
		         Collections.sort(EmployeeList);// sort the object list
		         
		         
		         FileOutputStream fos=new FileOutputStream("sortedEmployee.txt");
		         PrintWriter pw= new PrintWriter(fos);
		         
		        	 Iterator<Employee> itr=EmployeeList.iterator();
		        	   while (itr.hasNext()) 
		        	   {
		        	        pw.println(itr.next().toString());
		                   
		        	   }
		        
		         
		        pw.close();
		
	}
}
	
