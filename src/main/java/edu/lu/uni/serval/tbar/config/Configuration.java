package edu.lu.uni.serval.tbar.config;

public class Configuration {

    public static String knownBugPositions = "BugPositions.txt";
    public static String suspPositionsFilePath = "SuspiciousCodePositions/";
    public static String failedTestCasesFilePath = "FailedTestCases/";
    public static String faultLocalizationMetric = "Ochiai";
    public static String outputPath = "OUTPUT/";

    public static final String TEMP_FILES_PATH = ".temp/";
    public static final long SHELL_RUN_TIMEOUT = 60 * 5L;

}
