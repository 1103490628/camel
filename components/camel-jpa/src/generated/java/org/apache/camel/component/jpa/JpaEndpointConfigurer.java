/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jpa;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JpaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "joinTransaction": ((JpaEndpoint) target).setJoinTransaction(property(camelContext, boolean.class, value)); return true;
        case "maximumResults": ((JpaEndpoint) target).setMaximumResults(property(camelContext, int.class, value)); return true;
        case "namedQuery": ((JpaEndpoint) target).setNamedQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "nativeQuery": ((JpaEndpoint) target).setNativeQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "persistenceUnit": ((JpaEndpoint) target).setPersistenceUnit(property(camelContext, java.lang.String.class, value)); return true;
        case "query": ((JpaEndpoint) target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "resultClass": ((JpaEndpoint) target).setResultClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "bridgeErrorHandler": ((JpaEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumeDelete": ((JpaEndpoint) target).setConsumeDelete(property(camelContext, boolean.class, value)); return true;
        case "consumeLockEntity": ((JpaEndpoint) target).setConsumeLockEntity(property(camelContext, boolean.class, value)); return true;
        case "deleteHandler": ((JpaEndpoint) target).setDeleteHandler(property(camelContext, org.apache.camel.component.jpa.DeleteHandler.class, value)); return true;
        case "lockModeType": ((JpaEndpoint) target).setLockModeType(property(camelContext, javax.persistence.LockModeType.class, value)); return true;
        case "maxMessagesPerPoll": ((JpaEndpoint) target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "preDeleteHandler": ((JpaEndpoint) target).setPreDeleteHandler(property(camelContext, org.apache.camel.component.jpa.DeleteHandler.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((JpaEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "skipLockedEntity": ((JpaEndpoint) target).setSkipLockedEntity(property(camelContext, boolean.class, value)); return true;
        case "transacted": ((JpaEndpoint) target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((JpaEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((JpaEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "parameters": ((JpaEndpoint) target).setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "pollStrategy": ((JpaEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "findEntity": ((JpaEndpoint) target).setFindEntity(property(camelContext, boolean.class, value)); return true;
        case "flushOnSend": ((JpaEndpoint) target).setFlushOnSend(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((JpaEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "remove": ((JpaEndpoint) target).setRemove(property(camelContext, boolean.class, value)); return true;
        case "useExecuteUpdate": ((JpaEndpoint) target).setUseExecuteUpdate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usePersist": ((JpaEndpoint) target).setUsePersist(property(camelContext, boolean.class, value)); return true;
        case "usePassedInEntityManager": ((JpaEndpoint) target).setUsePassedInEntityManager(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((JpaEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "entityManagerProperties": ((JpaEndpoint) target).setEntityManagerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sharedEntityManager": ((JpaEndpoint) target).setSharedEntityManager(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((JpaEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((JpaEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((JpaEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((JpaEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((JpaEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((JpaEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((JpaEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((JpaEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((JpaEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((JpaEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((JpaEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((JpaEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((JpaEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((JpaEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((JpaEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "jointransaction": ((JpaEndpoint) target).setJoinTransaction(property(camelContext, boolean.class, value)); return true;
        case "maximumresults": ((JpaEndpoint) target).setMaximumResults(property(camelContext, int.class, value)); return true;
        case "namedquery": ((JpaEndpoint) target).setNamedQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "nativequery": ((JpaEndpoint) target).setNativeQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "persistenceunit": ((JpaEndpoint) target).setPersistenceUnit(property(camelContext, java.lang.String.class, value)); return true;
        case "query": ((JpaEndpoint) target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "resultclass": ((JpaEndpoint) target).setResultClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "bridgeerrorhandler": ((JpaEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumedelete": ((JpaEndpoint) target).setConsumeDelete(property(camelContext, boolean.class, value)); return true;
        case "consumelockentity": ((JpaEndpoint) target).setConsumeLockEntity(property(camelContext, boolean.class, value)); return true;
        case "deletehandler": ((JpaEndpoint) target).setDeleteHandler(property(camelContext, org.apache.camel.component.jpa.DeleteHandler.class, value)); return true;
        case "lockmodetype": ((JpaEndpoint) target).setLockModeType(property(camelContext, javax.persistence.LockModeType.class, value)); return true;
        case "maxmessagesperpoll": ((JpaEndpoint) target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "predeletehandler": ((JpaEndpoint) target).setPreDeleteHandler(property(camelContext, org.apache.camel.component.jpa.DeleteHandler.class, value)); return true;
        case "sendemptymessagewhenidle": ((JpaEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "skiplockedentity": ((JpaEndpoint) target).setSkipLockedEntity(property(camelContext, boolean.class, value)); return true;
        case "transacted": ((JpaEndpoint) target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((JpaEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((JpaEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "parameters": ((JpaEndpoint) target).setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "pollstrategy": ((JpaEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "findentity": ((JpaEndpoint) target).setFindEntity(property(camelContext, boolean.class, value)); return true;
        case "flushonsend": ((JpaEndpoint) target).setFlushOnSend(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((JpaEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "remove": ((JpaEndpoint) target).setRemove(property(camelContext, boolean.class, value)); return true;
        case "useexecuteupdate": ((JpaEndpoint) target).setUseExecuteUpdate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usepersist": ((JpaEndpoint) target).setUsePersist(property(camelContext, boolean.class, value)); return true;
        case "usepassedinentitymanager": ((JpaEndpoint) target).setUsePassedInEntityManager(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((JpaEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "entitymanagerproperties": ((JpaEndpoint) target).setEntityManagerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sharedentitymanager": ((JpaEndpoint) target).setSharedEntityManager(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((JpaEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((JpaEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((JpaEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((JpaEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((JpaEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((JpaEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((JpaEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((JpaEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((JpaEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((JpaEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((JpaEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((JpaEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((JpaEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((JpaEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((JpaEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

