/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jt400;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Jt400EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "ccsid": ((Jt400Endpoint) target).getConfiguration().setCcsid(property(camelContext, int.class, value)); return true;
        case "format": ((Jt400Endpoint) target).getConfiguration().setFormat(property(camelContext, org.apache.camel.component.jt400.Jt400Configuration.Format.class, value)); return true;
        case "guiAvailable": ((Jt400Endpoint) target).getConfiguration().setGuiAvailable(property(camelContext, boolean.class, value)); return true;
        case "keyed": ((Jt400Endpoint) target).getConfiguration().setKeyed(property(camelContext, boolean.class, value)); return true;
        case "searchKey": ((Jt400Endpoint) target).getConfiguration().setSearchKey(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((Jt400Endpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "readTimeout": ((Jt400Endpoint) target).getConfiguration().setReadTimeout(property(camelContext, int.class, value)); return true;
        case "searchType": ((Jt400Endpoint) target).getConfiguration().setSearchType(property(camelContext, org.apache.camel.component.jt400.Jt400Configuration.SearchType.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((Jt400Endpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((Jt400Endpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((Jt400Endpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((Jt400Endpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((Jt400Endpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputFieldsIdxArray": ((Jt400Endpoint) target).getConfiguration().setOutputFieldsIdxArray(property(camelContext, java.lang.Integer[].class, value)); return true;
        case "outputFieldsLengthArray": ((Jt400Endpoint) target).getConfiguration().setOutputFieldsLengthArray(property(camelContext, java.lang.Integer[].class, value)); return true;
        case "procedureName": ((Jt400Endpoint) target).getConfiguration().setProcedureName(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((Jt400Endpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((Jt400Endpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((Jt400Endpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((Jt400Endpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((Jt400Endpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((Jt400Endpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((Jt400Endpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((Jt400Endpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((Jt400Endpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((Jt400Endpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((Jt400Endpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((Jt400Endpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((Jt400Endpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((Jt400Endpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((Jt400Endpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((Jt400Endpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "secured": ((Jt400Endpoint) target).getConfiguration().setSecured(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "ccsid": ((Jt400Endpoint) target).getConfiguration().setCcsid(property(camelContext, int.class, value)); return true;
        case "format": ((Jt400Endpoint) target).getConfiguration().setFormat(property(camelContext, org.apache.camel.component.jt400.Jt400Configuration.Format.class, value)); return true;
        case "guiavailable": ((Jt400Endpoint) target).getConfiguration().setGuiAvailable(property(camelContext, boolean.class, value)); return true;
        case "keyed": ((Jt400Endpoint) target).getConfiguration().setKeyed(property(camelContext, boolean.class, value)); return true;
        case "searchkey": ((Jt400Endpoint) target).getConfiguration().setSearchKey(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((Jt400Endpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "readtimeout": ((Jt400Endpoint) target).getConfiguration().setReadTimeout(property(camelContext, int.class, value)); return true;
        case "searchtype": ((Jt400Endpoint) target).getConfiguration().setSearchType(property(camelContext, org.apache.camel.component.jt400.Jt400Configuration.SearchType.class, value)); return true;
        case "sendemptymessagewhenidle": ((Jt400Endpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((Jt400Endpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((Jt400Endpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((Jt400Endpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((Jt400Endpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputfieldsidxarray": ((Jt400Endpoint) target).getConfiguration().setOutputFieldsIdxArray(property(camelContext, java.lang.Integer[].class, value)); return true;
        case "outputfieldslengtharray": ((Jt400Endpoint) target).getConfiguration().setOutputFieldsLengthArray(property(camelContext, java.lang.Integer[].class, value)); return true;
        case "procedurename": ((Jt400Endpoint) target).getConfiguration().setProcedureName(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((Jt400Endpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((Jt400Endpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((Jt400Endpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((Jt400Endpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((Jt400Endpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((Jt400Endpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((Jt400Endpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((Jt400Endpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((Jt400Endpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((Jt400Endpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((Jt400Endpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((Jt400Endpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((Jt400Endpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((Jt400Endpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((Jt400Endpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((Jt400Endpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "secured": ((Jt400Endpoint) target).getConfiguration().setSecured(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

