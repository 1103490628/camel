/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.robotframework;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RobotFrameworkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "argumentFile": ((RobotFrameworkEndpoint) target).getConfiguration().setArgumentFile(property(camelContext, java.io.File.class, value)); return true;
        case "combinedTagStats": ((RobotFrameworkEndpoint) target).getConfiguration().setCombinedTagStats(property(camelContext, java.lang.String.class, value)); return true;
        case "contentCache": ((RobotFrameworkEndpoint) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "criticalTags": ((RobotFrameworkEndpoint) target).getConfiguration().setCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "debugFile": ((RobotFrameworkEndpoint) target).getConfiguration().setDebugFile(property(camelContext, java.io.File.class, value)); return true;
        case "document": ((RobotFrameworkEndpoint) target).getConfiguration().setDocument(property(camelContext, java.lang.String.class, value)); return true;
        case "dryrun": ((RobotFrameworkEndpoint) target).getConfiguration().setDryrun(property(camelContext, boolean.class, value)); return true;
        case "excludes": ((RobotFrameworkEndpoint) target).getConfiguration().setExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "exitOnFailure": ((RobotFrameworkEndpoint) target).getConfiguration().setExitOnFailure(property(camelContext, boolean.class, value)); return true;
        case "includes": ((RobotFrameworkEndpoint) target).getConfiguration().setIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "listener": ((RobotFrameworkEndpoint) target).getConfiguration().setListener(property(camelContext, java.lang.String.class, value)); return true;
        case "listeners": ((RobotFrameworkEndpoint) target).getConfiguration().setListeners(property(camelContext, java.lang.String.class, value)); return true;
        case "log": ((RobotFrameworkEndpoint) target).getConfiguration().setLog(property(camelContext, java.io.File.class, value)); return true;
        case "logLevel": ((RobotFrameworkEndpoint) target).getConfiguration().setLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logTitle": ((RobotFrameworkEndpoint) target).getConfiguration().setLogTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "metadata": ((RobotFrameworkEndpoint) target).getConfiguration().setMetadata(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorColors": ((RobotFrameworkEndpoint) target).getConfiguration().setMonitorColors(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorWidth": ((RobotFrameworkEndpoint) target).getConfiguration().setMonitorWidth(property(camelContext, java.lang.String.class, value)); return true;
        case "name": ((RobotFrameworkEndpoint) target).getConfiguration().setName(property(camelContext, java.lang.String.class, value)); return true;
        case "nonCriticalTags": ((RobotFrameworkEndpoint) target).getConfiguration().setNonCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "noStatusReturnCode": ((RobotFrameworkEndpoint) target).getConfiguration().setNoStatusReturnCode(property(camelContext, boolean.class, value)); return true;
        case "output": ((RobotFrameworkEndpoint) target).getConfiguration().setOutput(property(camelContext, java.io.File.class, value)); return true;
        case "outputDirectory": ((RobotFrameworkEndpoint) target).getConfiguration().setOutputDirectory(property(camelContext, java.io.File.class, value)); return true;
        case "randomize": ((RobotFrameworkEndpoint) target).getConfiguration().setRandomize(property(camelContext, java.lang.String.class, value)); return true;
        case "report": ((RobotFrameworkEndpoint) target).getConfiguration().setReport(property(camelContext, java.io.File.class, value)); return true;
        case "reportBackground": ((RobotFrameworkEndpoint) target).getConfiguration().setReportBackground(property(camelContext, java.lang.String.class, value)); return true;
        case "reportTitle": ((RobotFrameworkEndpoint) target).getConfiguration().setReportTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "runEmptySuite": ((RobotFrameworkEndpoint) target).getConfiguration().setRunEmptySuite(property(camelContext, boolean.class, value)); return true;
        case "runFailed": ((RobotFrameworkEndpoint) target).getConfiguration().setRunFailed(property(camelContext, java.io.File.class, value)); return true;
        case "runMode": ((RobotFrameworkEndpoint) target).getConfiguration().setRunMode(property(camelContext, java.lang.String.class, value)); return true;
        case "skipTeardownOnExit": ((RobotFrameworkEndpoint) target).getConfiguration().setSkipTeardownOnExit(property(camelContext, boolean.class, value)); return true;
        case "splitOutputs": ((RobotFrameworkEndpoint) target).getConfiguration().setSplitOutputs(property(camelContext, java.lang.String.class, value)); return true;
        case "suites": ((RobotFrameworkEndpoint) target).getConfiguration().setSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "suiteStatLevel": ((RobotFrameworkEndpoint) target).getConfiguration().setSuiteStatLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "summaryTitle": ((RobotFrameworkEndpoint) target).getConfiguration().setSummaryTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "tagDocs": ((RobotFrameworkEndpoint) target).getConfiguration().setTagDocs(property(camelContext, java.lang.String.class, value)); return true;
        case "tags": ((RobotFrameworkEndpoint) target).getConfiguration().setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "tagStatExcludes": ((RobotFrameworkEndpoint) target).getConfiguration().setTagStatExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagStatIncludes": ((RobotFrameworkEndpoint) target).getConfiguration().setTagStatIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagStatLinks": ((RobotFrameworkEndpoint) target).getConfiguration().setTagStatLinks(property(camelContext, java.lang.String.class, value)); return true;
        case "tests": ((RobotFrameworkEndpoint) target).getConfiguration().setTests(property(camelContext, java.lang.String.class, value)); return true;
        case "timestampOutputs": ((RobotFrameworkEndpoint) target).getConfiguration().setTimestampOutputs(property(camelContext, boolean.class, value)); return true;
        case "variableFiles": ((RobotFrameworkEndpoint) target).getConfiguration().setVariableFiles(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": ((RobotFrameworkEndpoint) target).getConfiguration().setVariables(property(camelContext, java.lang.String.class, value)); return true;
        case "warnOnSkippedFiles": ((RobotFrameworkEndpoint) target).getConfiguration().setWarnOnSkippedFiles(property(camelContext, boolean.class, value)); return true;
        case "xunitFile": ((RobotFrameworkEndpoint) target).getConfiguration().setXunitFile(property(camelContext, java.io.File.class, value)); return true;
        case "bridgeErrorHandler": ((RobotFrameworkEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((RobotFrameworkEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((RobotFrameworkEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((RobotFrameworkEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((RobotFrameworkEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((RobotFrameworkEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((RobotFrameworkEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((RobotFrameworkEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((RobotFrameworkEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((RobotFrameworkEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((RobotFrameworkEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((RobotFrameworkEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((RobotFrameworkEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((RobotFrameworkEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((RobotFrameworkEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((RobotFrameworkEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((RobotFrameworkEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((RobotFrameworkEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((RobotFrameworkEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((RobotFrameworkEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((RobotFrameworkEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((RobotFrameworkEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "argumentfile": ((RobotFrameworkEndpoint) target).getConfiguration().setArgumentFile(property(camelContext, java.io.File.class, value)); return true;
        case "combinedtagstats": ((RobotFrameworkEndpoint) target).getConfiguration().setCombinedTagStats(property(camelContext, java.lang.String.class, value)); return true;
        case "contentcache": ((RobotFrameworkEndpoint) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "criticaltags": ((RobotFrameworkEndpoint) target).getConfiguration().setCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "debugfile": ((RobotFrameworkEndpoint) target).getConfiguration().setDebugFile(property(camelContext, java.io.File.class, value)); return true;
        case "document": ((RobotFrameworkEndpoint) target).getConfiguration().setDocument(property(camelContext, java.lang.String.class, value)); return true;
        case "dryrun": ((RobotFrameworkEndpoint) target).getConfiguration().setDryrun(property(camelContext, boolean.class, value)); return true;
        case "excludes": ((RobotFrameworkEndpoint) target).getConfiguration().setExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "exitonfailure": ((RobotFrameworkEndpoint) target).getConfiguration().setExitOnFailure(property(camelContext, boolean.class, value)); return true;
        case "includes": ((RobotFrameworkEndpoint) target).getConfiguration().setIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "listener": ((RobotFrameworkEndpoint) target).getConfiguration().setListener(property(camelContext, java.lang.String.class, value)); return true;
        case "listeners": ((RobotFrameworkEndpoint) target).getConfiguration().setListeners(property(camelContext, java.lang.String.class, value)); return true;
        case "log": ((RobotFrameworkEndpoint) target).getConfiguration().setLog(property(camelContext, java.io.File.class, value)); return true;
        case "loglevel": ((RobotFrameworkEndpoint) target).getConfiguration().setLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logtitle": ((RobotFrameworkEndpoint) target).getConfiguration().setLogTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "metadata": ((RobotFrameworkEndpoint) target).getConfiguration().setMetadata(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorcolors": ((RobotFrameworkEndpoint) target).getConfiguration().setMonitorColors(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorwidth": ((RobotFrameworkEndpoint) target).getConfiguration().setMonitorWidth(property(camelContext, java.lang.String.class, value)); return true;
        case "name": ((RobotFrameworkEndpoint) target).getConfiguration().setName(property(camelContext, java.lang.String.class, value)); return true;
        case "noncriticaltags": ((RobotFrameworkEndpoint) target).getConfiguration().setNonCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "nostatusreturncode": ((RobotFrameworkEndpoint) target).getConfiguration().setNoStatusReturnCode(property(camelContext, boolean.class, value)); return true;
        case "output": ((RobotFrameworkEndpoint) target).getConfiguration().setOutput(property(camelContext, java.io.File.class, value)); return true;
        case "outputdirectory": ((RobotFrameworkEndpoint) target).getConfiguration().setOutputDirectory(property(camelContext, java.io.File.class, value)); return true;
        case "randomize": ((RobotFrameworkEndpoint) target).getConfiguration().setRandomize(property(camelContext, java.lang.String.class, value)); return true;
        case "report": ((RobotFrameworkEndpoint) target).getConfiguration().setReport(property(camelContext, java.io.File.class, value)); return true;
        case "reportbackground": ((RobotFrameworkEndpoint) target).getConfiguration().setReportBackground(property(camelContext, java.lang.String.class, value)); return true;
        case "reporttitle": ((RobotFrameworkEndpoint) target).getConfiguration().setReportTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "runemptysuite": ((RobotFrameworkEndpoint) target).getConfiguration().setRunEmptySuite(property(camelContext, boolean.class, value)); return true;
        case "runfailed": ((RobotFrameworkEndpoint) target).getConfiguration().setRunFailed(property(camelContext, java.io.File.class, value)); return true;
        case "runmode": ((RobotFrameworkEndpoint) target).getConfiguration().setRunMode(property(camelContext, java.lang.String.class, value)); return true;
        case "skipteardownonexit": ((RobotFrameworkEndpoint) target).getConfiguration().setSkipTeardownOnExit(property(camelContext, boolean.class, value)); return true;
        case "splitoutputs": ((RobotFrameworkEndpoint) target).getConfiguration().setSplitOutputs(property(camelContext, java.lang.String.class, value)); return true;
        case "suites": ((RobotFrameworkEndpoint) target).getConfiguration().setSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "suitestatlevel": ((RobotFrameworkEndpoint) target).getConfiguration().setSuiteStatLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "summarytitle": ((RobotFrameworkEndpoint) target).getConfiguration().setSummaryTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "tagdocs": ((RobotFrameworkEndpoint) target).getConfiguration().setTagDocs(property(camelContext, java.lang.String.class, value)); return true;
        case "tags": ((RobotFrameworkEndpoint) target).getConfiguration().setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatexcludes": ((RobotFrameworkEndpoint) target).getConfiguration().setTagStatExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatincludes": ((RobotFrameworkEndpoint) target).getConfiguration().setTagStatIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatlinks": ((RobotFrameworkEndpoint) target).getConfiguration().setTagStatLinks(property(camelContext, java.lang.String.class, value)); return true;
        case "tests": ((RobotFrameworkEndpoint) target).getConfiguration().setTests(property(camelContext, java.lang.String.class, value)); return true;
        case "timestampoutputs": ((RobotFrameworkEndpoint) target).getConfiguration().setTimestampOutputs(property(camelContext, boolean.class, value)); return true;
        case "variablefiles": ((RobotFrameworkEndpoint) target).getConfiguration().setVariableFiles(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": ((RobotFrameworkEndpoint) target).getConfiguration().setVariables(property(camelContext, java.lang.String.class, value)); return true;
        case "warnonskippedfiles": ((RobotFrameworkEndpoint) target).getConfiguration().setWarnOnSkippedFiles(property(camelContext, boolean.class, value)); return true;
        case "xunitfile": ((RobotFrameworkEndpoint) target).getConfiguration().setXunitFile(property(camelContext, java.io.File.class, value)); return true;
        case "bridgeerrorhandler": ((RobotFrameworkEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((RobotFrameworkEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((RobotFrameworkEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((RobotFrameworkEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((RobotFrameworkEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((RobotFrameworkEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((RobotFrameworkEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((RobotFrameworkEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((RobotFrameworkEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((RobotFrameworkEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((RobotFrameworkEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((RobotFrameworkEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((RobotFrameworkEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((RobotFrameworkEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((RobotFrameworkEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((RobotFrameworkEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((RobotFrameworkEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((RobotFrameworkEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((RobotFrameworkEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((RobotFrameworkEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((RobotFrameworkEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((RobotFrameworkEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

