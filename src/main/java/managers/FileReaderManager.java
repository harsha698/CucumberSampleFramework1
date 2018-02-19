package managers;

import dataProvider.ConfigFileReader;

public class FileReaderManager {

	//this is a singleton class
	private static FileReaderManager fileReaderManager_instance = new FileReaderManager();
	private static ConfigFileReader configReader;
	
	private FileReaderManager(){
		
	}
	
	public static FileReaderManager getInstance(){
		return fileReaderManager_instance;
	}
	
	public ConfigFileReader getConfigReader(){
		return(configReader==null) ? new ConfigFileReader(): configReader;
	}
	
	
}
