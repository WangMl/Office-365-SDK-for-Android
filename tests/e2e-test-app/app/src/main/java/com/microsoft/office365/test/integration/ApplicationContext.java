package com.microsoft.office365.test.integration;

import java.util.concurrent.Future;


import com.microsoft.listservices.SharepointListsClient;
import com.microsoft.office365.test.integration.framework.TestCase;
import com.microsoft.office365.test.integration.framework.TestExecutionCallback;
import com.microsoft.outlookservices.odata.EntityContainerClient;

public class ApplicationContext {
	
    private static TestPlatformContext mTestPlatformContext;
    
    public static void setTestPlatformContext(TestPlatformContext testPlatformContext) {
        mTestPlatformContext = testPlatformContext;
    }
    
	public static void sleep() throws Exception {
	    mTestPlatformContext.sleep(3);
	}
	
	public static void sleep(int seconds) throws Exception {
        mTestPlatformContext.sleep(seconds);
    }
	
	public static Future<Void> showMessage(String message) {
        return mTestPlatformContext.showMessage(message);
    }
    
    public static void executeTest(TestCase testCase, TestExecutionCallback callback) {
        mTestPlatformContext.executeTest(testCase, callback);
    }
    
    public static String getServerUrl() {
        return mTestPlatformContext.getExchangeServerUrl();
    }

    public static EntityContainerClient getMailCalendarContactClient(){
        return mTestPlatformContext.getMailCalendarContactClient();
    }

    public static com.microsoft.sharepointservices.odata.EntityContainerClient getFilesClient(){
        return mTestPlatformContext.getFilesClient();
    }

    public static String getTestMail() { return mTestPlatformContext.getTestMail();}

    public static SharepointListsClient getSharePointListClient(){
        return mTestPlatformContext.getSharePointListClient();
    }

    public static String getTestListName(){
        return mTestPlatformContext.getTestListName();
    }
}
