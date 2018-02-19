package managers;

import dataProvider.ConfigFileReader;
import dataProvider.JsonDataReader;

public class FileReaderManager {

	//this is a singleton class
	private static FileReaderManager fileReaderManager_instance = new FileReaderManager();
	private static ConfigFileReader configReader;
	private static JsonDataReader jsonReader;
	
	private FileReaderManager(){
		
	}
	
	public static FileReaderManager getInstance(){
		return fileReaderManager_instance;
	}
	
	public ConfigFileReader getConfigReader(){
		return(configReader==null) ? new ConfigFileReader(): configReader;
	}
	
	public JsonDataReader getJsonReader(){
		return (jsonReader==null) ? new JsonDataReader() : jsonReader;
	}
	
	
}
