/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.snmp;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SnmpEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "oids": ((SnmpEndpoint) target).setOids(property(camelContext, org.apache.camel.component.snmp.OIDList.class, value)); return true;
        case "protocol": ((SnmpEndpoint) target).setProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "retries": ((SnmpEndpoint) target).setRetries(property(camelContext, int.class, value)); return true;
        case "snmpCommunity": ((SnmpEndpoint) target).setSnmpCommunity(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpContextEngineId": ((SnmpEndpoint) target).setSnmpContextEngineId(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpContextName": ((SnmpEndpoint) target).setSnmpContextName(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpVersion": ((SnmpEndpoint) target).setSnmpVersion(property(camelContext, int.class, value)); return true;
        case "timeout": ((SnmpEndpoint) target).setTimeout(property(camelContext, int.class, value)); return true;
        case "type": ((SnmpEndpoint) target).setType(property(camelContext, org.apache.camel.component.snmp.SnmpActionType.class, value)); return true;
        case "bridgeErrorHandler": ((SnmpEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": ((SnmpEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((SnmpEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "treeList": ((SnmpEndpoint) target).setTreeList(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((SnmpEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((SnmpEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((SnmpEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((SnmpEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((SnmpEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((SnmpEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((SnmpEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((SnmpEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((SnmpEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "greedy": ((SnmpEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((SnmpEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((SnmpEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((SnmpEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((SnmpEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((SnmpEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((SnmpEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((SnmpEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((SnmpEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((SnmpEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "authenticationPassphrase": ((SnmpEndpoint) target).setAuthenticationPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "authenticationProtocol": ((SnmpEndpoint) target).setAuthenticationProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "privacyPassphrase": ((SnmpEndpoint) target).setPrivacyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "privacyProtocol": ((SnmpEndpoint) target).setPrivacyProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "securityLevel": ((SnmpEndpoint) target).setSecurityLevel(property(camelContext, int.class, value)); return true;
        case "securityName": ((SnmpEndpoint) target).setSecurityName(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "oids": ((SnmpEndpoint) target).setOids(property(camelContext, org.apache.camel.component.snmp.OIDList.class, value)); return true;
        case "protocol": ((SnmpEndpoint) target).setProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "retries": ((SnmpEndpoint) target).setRetries(property(camelContext, int.class, value)); return true;
        case "snmpcommunity": ((SnmpEndpoint) target).setSnmpCommunity(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpcontextengineid": ((SnmpEndpoint) target).setSnmpContextEngineId(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpcontextname": ((SnmpEndpoint) target).setSnmpContextName(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpversion": ((SnmpEndpoint) target).setSnmpVersion(property(camelContext, int.class, value)); return true;
        case "timeout": ((SnmpEndpoint) target).setTimeout(property(camelContext, int.class, value)); return true;
        case "type": ((SnmpEndpoint) target).setType(property(camelContext, org.apache.camel.component.snmp.SnmpActionType.class, value)); return true;
        case "bridgeerrorhandler": ((SnmpEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": ((SnmpEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "sendemptymessagewhenidle": ((SnmpEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "treelist": ((SnmpEndpoint) target).setTreeList(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((SnmpEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((SnmpEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((SnmpEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((SnmpEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((SnmpEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((SnmpEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((SnmpEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((SnmpEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((SnmpEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "greedy": ((SnmpEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((SnmpEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((SnmpEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((SnmpEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((SnmpEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((SnmpEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((SnmpEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((SnmpEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((SnmpEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((SnmpEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "authenticationpassphrase": ((SnmpEndpoint) target).setAuthenticationPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "authenticationprotocol": ((SnmpEndpoint) target).setAuthenticationProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "privacypassphrase": ((SnmpEndpoint) target).setPrivacyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "privacyprotocol": ((SnmpEndpoint) target).setPrivacyProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "securitylevel": ((SnmpEndpoint) target).setSecurityLevel(property(camelContext, int.class, value)); return true;
        case "securityname": ((SnmpEndpoint) target).setSecurityName(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

