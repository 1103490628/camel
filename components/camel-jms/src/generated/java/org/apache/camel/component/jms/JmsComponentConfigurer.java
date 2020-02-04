/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jms;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JmsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "allowAutoWiredConnectionFactory": ((JmsComponent) target).setAllowAutoWiredConnectionFactory(property(camelContext, boolean.class, value)); return true;
        case "allowAutoWiredDestinationResolver": ((JmsComponent) target).setAllowAutoWiredDestinationResolver(property(camelContext, boolean.class, value)); return true;
        case "configuration": ((JmsComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.jms.JmsConfiguration.class, value)); return true;
        case "acceptMessagesWhileStopping": ((JmsComponent) target).setAcceptMessagesWhileStopping(property(camelContext, boolean.class, value)); return true;
        case "allowReplyManagerQuickStop": ((JmsComponent) target).setAllowReplyManagerQuickStop(property(camelContext, boolean.class, value)); return true;
        case "acknowledgementMode": ((JmsComponent) target).setAcknowledgementMode(property(camelContext, int.class, value)); return true;
        case "eagerPoisonBody": ((JmsComponent) target).setEagerPoisonBody(property(camelContext, java.lang.String.class, value)); return true;
        case "eagerLoadingOfProperties": ((JmsComponent) target).setEagerLoadingOfProperties(property(camelContext, boolean.class, value)); return true;
        case "acknowledgementModeName": ((JmsComponent) target).setAcknowledgementModeName(property(camelContext, java.lang.String.class, value)); return true;
        case "autoStartup": ((JmsComponent) target).setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "cacheLevel": ((JmsComponent) target).setCacheLevel(property(camelContext, int.class, value)); return true;
        case "cacheLevelName": ((JmsComponent) target).setCacheLevelName(property(camelContext, java.lang.String.class, value)); return true;
        case "replyToCacheLevelName": ((JmsComponent) target).setReplyToCacheLevelName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientId": ((JmsComponent) target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "concurrentConsumers": ((JmsComponent) target).setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replyToConcurrentConsumers": ((JmsComponent) target).setReplyToConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "connectionFactory": ((JmsComponent) target).setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "username": ((JmsComponent) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((JmsComponent) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "deliveryPersistent": ((JmsComponent) target).setDeliveryPersistent(property(camelContext, boolean.class, value)); return true;
        case "deliveryMode": ((JmsComponent) target).setDeliveryMode(property(camelContext, java.lang.Integer.class, value)); return true;
        case "durableSubscriptionName": ((JmsComponent) target).setDurableSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionListener": ((JmsComponent) target).setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "errorHandler": ((JmsComponent) target).setErrorHandler(property(camelContext, org.springframework.util.ErrorHandler.class, value)); return true;
        case "errorHandlerLoggingLevel": ((JmsComponent) target).setErrorHandlerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "errorHandlerLogStackTrace": ((JmsComponent) target).setErrorHandlerLogStackTrace(property(camelContext, boolean.class, value)); return true;
        case "explicitQosEnabled": ((JmsComponent) target).setExplicitQosEnabled(property(camelContext, boolean.class, value)); return true;
        case "exposeListenerSession": ((JmsComponent) target).setExposeListenerSession(property(camelContext, boolean.class, value)); return true;
        case "idleTaskExecutionLimit": ((JmsComponent) target).setIdleTaskExecutionLimit(property(camelContext, int.class, value)); return true;
        case "idleConsumerLimit": ((JmsComponent) target).setIdleConsumerLimit(property(camelContext, int.class, value)); return true;
        case "maxConcurrentConsumers": ((JmsComponent) target).setMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replyToMaxConcurrentConsumers": ((JmsComponent) target).setReplyToMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replyOnTimeoutToMaxConcurrentConsumers": ((JmsComponent) target).setReplyOnTimeoutToMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "maxMessagesPerTask": ((JmsComponent) target).setMaxMessagesPerTask(property(camelContext, int.class, value)); return true;
        case "messageConverter": ((JmsComponent) target).setMessageConverter(property(camelContext, org.springframework.jms.support.converter.MessageConverter.class, value)); return true;
        case "mapJmsMessage": ((JmsComponent) target).setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "messageIdEnabled": ((JmsComponent) target).setMessageIdEnabled(property(camelContext, boolean.class, value)); return true;
        case "messageTimestampEnabled": ((JmsComponent) target).setMessageTimestampEnabled(property(camelContext, boolean.class, value)); return true;
        case "alwaysCopyMessage": ((JmsComponent) target).setAlwaysCopyMessage(property(camelContext, boolean.class, value)); return true;
        case "useMessageIDAsCorrelationID": ((JmsComponent) target).setUseMessageIDAsCorrelationID(property(camelContext, boolean.class, value)); return true;
        case "priority": ((JmsComponent) target).setPriority(property(camelContext, int.class, value)); return true;
        case "pubSubNoLocal": ((JmsComponent) target).setPubSubNoLocal(property(camelContext, boolean.class, value)); return true;
        case "receiveTimeout": ((JmsComponent) target).setReceiveTimeout(property(camelContext, long.class, value)); return true;
        case "recoveryInterval": ((JmsComponent) target).setRecoveryInterval(property(camelContext, long.class, value)); return true;
        case "taskExecutor": ((JmsComponent) target).setTaskExecutor(property(camelContext, org.springframework.core.task.TaskExecutor.class, value)); return true;
        case "timeToLive": ((JmsComponent) target).setTimeToLive(property(camelContext, long.class, value)); return true;
        case "transacted": ((JmsComponent) target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "lazyCreateTransactionManager": ((JmsComponent) target).setLazyCreateTransactionManager(property(camelContext, boolean.class, value)); return true;
        case "transactionManager": ((JmsComponent) target).setTransactionManager(property(camelContext, org.springframework.transaction.PlatformTransactionManager.class, value)); return true;
        case "transactionName": ((JmsComponent) target).setTransactionName(property(camelContext, java.lang.String.class, value)); return true;
        case "transactionTimeout": ((JmsComponent) target).setTransactionTimeout(property(camelContext, int.class, value)); return true;
        case "testConnectionOnStartup": ((JmsComponent) target).setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "asyncStartListener": ((JmsComponent) target).setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncStopListener": ((JmsComponent) target).setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "forceSendOriginalMessage": ((JmsComponent) target).setForceSendOriginalMessage(property(camelContext, boolean.class, value)); return true;
        case "requestTimeout": ((JmsComponent) target).setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "requestTimeoutCheckerInterval": ((JmsComponent) target).setRequestTimeoutCheckerInterval(property(camelContext, long.class, value)); return true;
        case "transferExchange": ((JmsComponent) target).setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "transferException": ((JmsComponent) target).setTransferException(property(camelContext, boolean.class, value)); return true;
        case "jmsOperations": ((JmsComponent) target).setJmsOperations(property(camelContext, org.springframework.jms.core.JmsOperations.class, value)); return true;
        case "destinationResolver": ((JmsComponent) target).setDestinationResolver(property(camelContext, org.springframework.jms.support.destination.DestinationResolver.class, value)); return true;
        case "replyToType": ((JmsComponent) target).setReplyToType(property(camelContext, org.apache.camel.component.jms.ReplyToType.class, value)); return true;
        case "preserveMessageQos": ((JmsComponent) target).setPreserveMessageQos(property(camelContext, boolean.class, value)); return true;
        case "asyncConsumer": ((JmsComponent) target).setAsyncConsumer(property(camelContext, boolean.class, value)); return true;
        case "allowNullBody": ((JmsComponent) target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "includeSentJMSMessageID": ((JmsComponent) target).setIncludeSentJMSMessageID(property(camelContext, boolean.class, value)); return true;
        case "includeAllJMSXProperties": ((JmsComponent) target).setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "defaultTaskExecutorType": ((JmsComponent) target).setDefaultTaskExecutorType(property(camelContext, org.apache.camel.component.jms.DefaultTaskExecutorType.class, value)); return true;
        case "jmsKeyFormatStrategy": ((JmsComponent) target).setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "allowAdditionalHeaders": ((JmsComponent) target).setAllowAdditionalHeaders(property(camelContext, java.lang.String.class, value)); return true;
        case "queueBrowseStrategy": ((JmsComponent) target).setQueueBrowseStrategy(property(camelContext, org.apache.camel.component.jms.QueueBrowseStrategy.class, value)); return true;
        case "messageCreatedStrategy": ((JmsComponent) target).setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.jms.MessageCreatedStrategy.class, value)); return true;
        case "waitForProvisionCorrelationToBeUpdatedCounter": ((JmsComponent) target).setWaitForProvisionCorrelationToBeUpdatedCounter(property(camelContext, int.class, value)); return true;
        case "waitForProvisionCorrelationToBeUpdatedThreadSleepingTime": ((JmsComponent) target).setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime(property(camelContext, long.class, value)); return true;
        case "correlationProperty": ((JmsComponent) target).setCorrelationProperty(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptionDurable": ((JmsComponent) target).setSubscriptionDurable(property(camelContext, boolean.class, value)); return true;
        case "subscriptionShared": ((JmsComponent) target).setSubscriptionShared(property(camelContext, boolean.class, value)); return true;
        case "subscriptionName": ((JmsComponent) target).setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "streamMessageTypeEnabled": ((JmsComponent) target).setStreamMessageTypeEnabled(property(camelContext, boolean.class, value)); return true;
        case "formatDateHeadersToIso8601": ((JmsComponent) target).setFormatDateHeadersToIso8601(property(camelContext, boolean.class, value)); return true;
        case "headerFilterStrategy": ((JmsComponent) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "basicPropertyBinding": ((JmsComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((JmsComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((JmsComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "allowautowiredconnectionfactory": ((JmsComponent) target).setAllowAutoWiredConnectionFactory(property(camelContext, boolean.class, value)); return true;
        case "allowautowireddestinationresolver": ((JmsComponent) target).setAllowAutoWiredDestinationResolver(property(camelContext, boolean.class, value)); return true;
        case "configuration": ((JmsComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.jms.JmsConfiguration.class, value)); return true;
        case "acceptmessageswhilestopping": ((JmsComponent) target).setAcceptMessagesWhileStopping(property(camelContext, boolean.class, value)); return true;
        case "allowreplymanagerquickstop": ((JmsComponent) target).setAllowReplyManagerQuickStop(property(camelContext, boolean.class, value)); return true;
        case "acknowledgementmode": ((JmsComponent) target).setAcknowledgementMode(property(camelContext, int.class, value)); return true;
        case "eagerpoisonbody": ((JmsComponent) target).setEagerPoisonBody(property(camelContext, java.lang.String.class, value)); return true;
        case "eagerloadingofproperties": ((JmsComponent) target).setEagerLoadingOfProperties(property(camelContext, boolean.class, value)); return true;
        case "acknowledgementmodename": ((JmsComponent) target).setAcknowledgementModeName(property(camelContext, java.lang.String.class, value)); return true;
        case "autostartup": ((JmsComponent) target).setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "cachelevel": ((JmsComponent) target).setCacheLevel(property(camelContext, int.class, value)); return true;
        case "cachelevelname": ((JmsComponent) target).setCacheLevelName(property(camelContext, java.lang.String.class, value)); return true;
        case "replytocachelevelname": ((JmsComponent) target).setReplyToCacheLevelName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid": ((JmsComponent) target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "concurrentconsumers": ((JmsComponent) target).setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytoconcurrentconsumers": ((JmsComponent) target).setReplyToConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "connectionfactory": ((JmsComponent) target).setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "username": ((JmsComponent) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((JmsComponent) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "deliverypersistent": ((JmsComponent) target).setDeliveryPersistent(property(camelContext, boolean.class, value)); return true;
        case "deliverymode": ((JmsComponent) target).setDeliveryMode(property(camelContext, java.lang.Integer.class, value)); return true;
        case "durablesubscriptionname": ((JmsComponent) target).setDurableSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionlistener": ((JmsComponent) target).setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "errorhandler": ((JmsComponent) target).setErrorHandler(property(camelContext, org.springframework.util.ErrorHandler.class, value)); return true;
        case "errorhandlerlogginglevel": ((JmsComponent) target).setErrorHandlerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "errorhandlerlogstacktrace": ((JmsComponent) target).setErrorHandlerLogStackTrace(property(camelContext, boolean.class, value)); return true;
        case "explicitqosenabled": ((JmsComponent) target).setExplicitQosEnabled(property(camelContext, boolean.class, value)); return true;
        case "exposelistenersession": ((JmsComponent) target).setExposeListenerSession(property(camelContext, boolean.class, value)); return true;
        case "idletaskexecutionlimit": ((JmsComponent) target).setIdleTaskExecutionLimit(property(camelContext, int.class, value)); return true;
        case "idleconsumerlimit": ((JmsComponent) target).setIdleConsumerLimit(property(camelContext, int.class, value)); return true;
        case "maxconcurrentconsumers": ((JmsComponent) target).setMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytomaxconcurrentconsumers": ((JmsComponent) target).setReplyToMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replyontimeouttomaxconcurrentconsumers": ((JmsComponent) target).setReplyOnTimeoutToMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "maxmessagespertask": ((JmsComponent) target).setMaxMessagesPerTask(property(camelContext, int.class, value)); return true;
        case "messageconverter": ((JmsComponent) target).setMessageConverter(property(camelContext, org.springframework.jms.support.converter.MessageConverter.class, value)); return true;
        case "mapjmsmessage": ((JmsComponent) target).setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "messageidenabled": ((JmsComponent) target).setMessageIdEnabled(property(camelContext, boolean.class, value)); return true;
        case "messagetimestampenabled": ((JmsComponent) target).setMessageTimestampEnabled(property(camelContext, boolean.class, value)); return true;
        case "alwayscopymessage": ((JmsComponent) target).setAlwaysCopyMessage(property(camelContext, boolean.class, value)); return true;
        case "usemessageidascorrelationid": ((JmsComponent) target).setUseMessageIDAsCorrelationID(property(camelContext, boolean.class, value)); return true;
        case "priority": ((JmsComponent) target).setPriority(property(camelContext, int.class, value)); return true;
        case "pubsubnolocal": ((JmsComponent) target).setPubSubNoLocal(property(camelContext, boolean.class, value)); return true;
        case "receivetimeout": ((JmsComponent) target).setReceiveTimeout(property(camelContext, long.class, value)); return true;
        case "recoveryinterval": ((JmsComponent) target).setRecoveryInterval(property(camelContext, long.class, value)); return true;
        case "taskexecutor": ((JmsComponent) target).setTaskExecutor(property(camelContext, org.springframework.core.task.TaskExecutor.class, value)); return true;
        case "timetolive": ((JmsComponent) target).setTimeToLive(property(camelContext, long.class, value)); return true;
        case "transacted": ((JmsComponent) target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "lazycreatetransactionmanager": ((JmsComponent) target).setLazyCreateTransactionManager(property(camelContext, boolean.class, value)); return true;
        case "transactionmanager": ((JmsComponent) target).setTransactionManager(property(camelContext, org.springframework.transaction.PlatformTransactionManager.class, value)); return true;
        case "transactionname": ((JmsComponent) target).setTransactionName(property(camelContext, java.lang.String.class, value)); return true;
        case "transactiontimeout": ((JmsComponent) target).setTransactionTimeout(property(camelContext, int.class, value)); return true;
        case "testconnectiononstartup": ((JmsComponent) target).setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "asyncstartlistener": ((JmsComponent) target).setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncstoplistener": ((JmsComponent) target).setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "forcesendoriginalmessage": ((JmsComponent) target).setForceSendOriginalMessage(property(camelContext, boolean.class, value)); return true;
        case "requesttimeout": ((JmsComponent) target).setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "requesttimeoutcheckerinterval": ((JmsComponent) target).setRequestTimeoutCheckerInterval(property(camelContext, long.class, value)); return true;
        case "transferexchange": ((JmsComponent) target).setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "transferexception": ((JmsComponent) target).setTransferException(property(camelContext, boolean.class, value)); return true;
        case "jmsoperations": ((JmsComponent) target).setJmsOperations(property(camelContext, org.springframework.jms.core.JmsOperations.class, value)); return true;
        case "destinationresolver": ((JmsComponent) target).setDestinationResolver(property(camelContext, org.springframework.jms.support.destination.DestinationResolver.class, value)); return true;
        case "replytotype": ((JmsComponent) target).setReplyToType(property(camelContext, org.apache.camel.component.jms.ReplyToType.class, value)); return true;
        case "preservemessageqos": ((JmsComponent) target).setPreserveMessageQos(property(camelContext, boolean.class, value)); return true;
        case "asyncconsumer": ((JmsComponent) target).setAsyncConsumer(property(camelContext, boolean.class, value)); return true;
        case "allownullbody": ((JmsComponent) target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "includesentjmsmessageid": ((JmsComponent) target).setIncludeSentJMSMessageID(property(camelContext, boolean.class, value)); return true;
        case "includealljmsxproperties": ((JmsComponent) target).setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "defaulttaskexecutortype": ((JmsComponent) target).setDefaultTaskExecutorType(property(camelContext, org.apache.camel.component.jms.DefaultTaskExecutorType.class, value)); return true;
        case "jmskeyformatstrategy": ((JmsComponent) target).setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "allowadditionalheaders": ((JmsComponent) target).setAllowAdditionalHeaders(property(camelContext, java.lang.String.class, value)); return true;
        case "queuebrowsestrategy": ((JmsComponent) target).setQueueBrowseStrategy(property(camelContext, org.apache.camel.component.jms.QueueBrowseStrategy.class, value)); return true;
        case "messagecreatedstrategy": ((JmsComponent) target).setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.jms.MessageCreatedStrategy.class, value)); return true;
        case "waitforprovisioncorrelationtobeupdatedcounter": ((JmsComponent) target).setWaitForProvisionCorrelationToBeUpdatedCounter(property(camelContext, int.class, value)); return true;
        case "waitforprovisioncorrelationtobeupdatedthreadsleepingtime": ((JmsComponent) target).setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime(property(camelContext, long.class, value)); return true;
        case "correlationproperty": ((JmsComponent) target).setCorrelationProperty(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptiondurable": ((JmsComponent) target).setSubscriptionDurable(property(camelContext, boolean.class, value)); return true;
        case "subscriptionshared": ((JmsComponent) target).setSubscriptionShared(property(camelContext, boolean.class, value)); return true;
        case "subscriptionname": ((JmsComponent) target).setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "streammessagetypeenabled": ((JmsComponent) target).setStreamMessageTypeEnabled(property(camelContext, boolean.class, value)); return true;
        case "formatdateheaderstoiso8601": ((JmsComponent) target).setFormatDateHeadersToIso8601(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy": ((JmsComponent) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "basicpropertybinding": ((JmsComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((JmsComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((JmsComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

