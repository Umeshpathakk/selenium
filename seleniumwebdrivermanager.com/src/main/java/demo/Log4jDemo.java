package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//bahut saare import ayenge but sirf log4j wala karna hai


public class Log4jDemo 
{
	//private static Logger logger=LogManager.getLogger(Log4jDemo.class);
static Logger logger=LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args)
	{
		System.out.println("hello world");
		logger.info("info msg");
		logger.error("error msg");
		logger.warn("warning msg");
		logger.fatal("this is a fatal msg");
		System.out.println("complete");
		
	}

}
