package pomcommon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @author neerajagarwal
 *
 */

public class DataIO {
		public static String propertyFilePath= File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"testdata"+File.separator+"%22%.properties";
	
	
	
	/**
     * readData From properties file
     * @param property
     * @return text
     */
    public static String getConfig(String property) {
        try {
            Properties prop = ResourceLoader.loadProperties(System.getProperty("user.dir") +File.separator+ "Config.properties");
            return prop.getProperty(property).trim();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
	
	/**
	 * To Overwrite existing value in properties file.
	 * @param property
	 * @param data
	 * @throws Exception
	 */
	public static void overwritePropertiesFile(String property, String data, String fileName) {
		try {
			FileInputStream in = new FileInputStream(System.getProperty("user.dir") + propertyFilePath.replaceAll("%22%", fileName));
		  	Properties props = new Properties();
		  	props.load(in);
		  	in.close();
		  	FileOutputStream out = new FileOutputStream(System.getProperty("user.dir") + propertyFilePath.replaceAll("%22%", fileName));
		  	props.setProperty(property, data);
		  	props.store(out, null);
		  	out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
      } 
    /**
     * readData From properties file
     * @param property
     * @return text
     */
    public static String get(String property, String fileName) {
        try {
          	Properties prop = ResourceLoader.loadProperties(System.getProperty("user.dir") + propertyFilePath.replaceAll("%22%", fileName));
        	return prop.getProperty(property).trim();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static String setPropery(String key, String value, String filename){
		try {
			overwritePropertiesFile(key, value,filename);
		} catch (Exception e) {
			System.out.println(e);
		}
		return value;
	}
    
    
    public static void createTxtFileInDownloadFolder(String fileName){ 
    	try{  
    		PrintWriter writer = new PrintWriter(System.getProperty("user.home")+File.separator+"Downloads" +File.separator + fileName + ".txt", "UTF-8");
    		writer.println("The first line");
    		writer.println("The second line");
    		writer.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
       

}
