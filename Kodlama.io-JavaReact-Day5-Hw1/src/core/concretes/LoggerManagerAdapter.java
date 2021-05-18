package core.concretes;

import GoogleAuth.GoogleLogger;
import core.abstracts.LoggerService;

public class LoggerManagerAdapter implements LoggerService {

	@Override
	public void log() {
		GoogleLogger googleLogger = new GoogleLogger();
		googleLogger.register();
		googleLogger.login();
		
	}
	
}
