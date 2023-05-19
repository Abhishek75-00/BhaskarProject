package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Utility {



	public  void CaptureScreen(WebDriver driver, int testid) throws IOException {
		
				TakesScreenshot tsc=(TakesScreenshot)driver;
				
				//Capture screenshot
				File source=tsc.getScreenshotAs(OutputType.FILE);
			    //store location
			
				//File file=new File(System.getProperty("test-output") + "\\Screenshot\\"+testid+".png");
			 	File file=new File(System.getProperty("test-output")+" \\Screenshot\\"+testid+".png");
				//Copy file
			 FileHandler.copy(source, file);
				
				System.out.println("Screen shot captured");
	}
	
//
//
//		        }
//	public static void captureScreen(WebDriver driver,int testId) throws IOException {

		// With img date and time print code below 2 line.
//	
//		Date date = new Date(testCId) ;
//	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
//	        File scrFile = ((TakesScreenshot)Login.driver).getScreenshotAs(OutputType.FILE);
//	   //  The below method will save the screen shot in d drive with name "screenshot.png"
//	        try {
//	            String testname = null;
//				FileUtils.copyFile(scrFile, new File("H:\\Eclipse\\FBMavenProject\\Screenshot_"+testname+"_"+dateFormat.format(date)+".png"));
//	        } catch (IOException e) {
//	        	
//	        }}}
//	        	
		
		



		

	          
	public static void main (String [] args) throws Exception {
//		//Path of the excel file
			File fis=new File("C:\\Users\\Abhishek\\OneDrive\\Desktop\\testingproof.xlsx");
		FileInputStream fs = new FileInputStream(fis);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(2);
		
	int rowCount=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++) {
			XSSFRow row =sheet.getRow(i);
				int cellCount=row.getPhysicalNumberOfCells();
		for(int j=0;j< cellCount;j++) {
			XSSFCell cell=row.getCell(j);
			String cellValue = getCellValue(cell);
			System.out.print("||"+cellValue);
		}
		System.out.println();
		
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		}
		workbook.close();
		fs.close();
		
}

public static String getCellValue(XSSFCell cell) {

switch (cell.getCellType()) {
case NUMERIC:
return String.valueOf(cell.getNumericCellValue());
case BOOLEAN:
return String.valueOf(cell.getBooleanCellValue());
case STRING:
return cell.getStringCellValue() ;
default:
	return cell.getStringCellValue();
}
}}
	



	        
//public  void captureScreen(WebDriver driver, String name) throws Exception {
//////upcasting to driver
//		TakesScreenshot tsc=(TakesScreenshot)driver;
////		
////		//Capture screenshot
//		File source=tsc.getScreenshotAs(OutputType.FILE);
////	    //store location
//	
//		File file=new File(System.getProperty("C:\\Users\\Abhishek\\eclipse-workspace\\FaceBookAutomation\\test-output") + "\\Screenshot\\"+name+".png");
//	 	
//		//Copy file
//	 FileHandler.copy(source, file);
//		
//		System.out.println("Screen shot captured");}}
//}
//
//
//
//}        
	
		        
		        
		        
		


