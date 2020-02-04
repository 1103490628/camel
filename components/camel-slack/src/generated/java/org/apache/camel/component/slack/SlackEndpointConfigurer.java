/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.slack;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SlackEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "bridgeErrorHandler": ((SlackEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "maxResults": ((SlackEndpoint) target).setMaxResults(property(camelContext, java.lang.String.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((SlackEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serverUrl": ((SlackEndpoint) target).setServerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "token": ((SlackEndpoint) target).setToken(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((SlackEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((SlackEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((SlackEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "iconEmoji": ((SlackEndpoint) target).setIconEmoji(property(camelContext, java.lang.String.class, value)); return true;
        case "iconUrl": ((SlackEndpoint) target).setIconUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((SlackEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "username": ((SlackEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "webhookUrl": ((SlackEndpoint) target).setWebhookUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((SlackEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((SlackEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((SlackEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((SlackEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((SlackEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((SlackEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((SlackEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((SlackEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((SlackEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((SlackEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((SlackEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((SlackEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((SlackEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((SlackEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((SlackEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((SlackEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "bridgeerrorhandler": ((SlackEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "maxresults": ((SlackEndpoint) target).setMaxResults(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle": ((SlackEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serverurl": ((SlackEndpoint) target).setServerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "token": ((SlackEndpoint) target).setToken(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((SlackEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((SlackEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((SlackEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "iconemoji": ((SlackEndpoint) target).setIconEmoji(property(camelContext, java.lang.String.class, value)); return true;
        case "iconurl": ((SlackEndpoint) target).setIconUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((SlackEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "username": ((SlackEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "webhookurl": ((SlackEndpoint) target).setWebhookUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((SlackEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((SlackEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((SlackEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((SlackEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((SlackEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((SlackEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((SlackEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((SlackEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((SlackEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((SlackEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((SlackEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((SlackEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((SlackEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((SlackEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((SlackEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((SlackEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

