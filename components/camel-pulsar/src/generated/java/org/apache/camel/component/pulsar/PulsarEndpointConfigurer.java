/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pulsar;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PulsarEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "ackGroupTimeMillis": ((PulsarEndpoint) target).getPulsarConfiguration().setAckGroupTimeMillis(property(camelContext, long.class, value)); return true;
        case "ackTimeoutMillis": ((PulsarEndpoint) target).getPulsarConfiguration().setAckTimeoutMillis(property(camelContext, long.class, value)); return true;
        case "allowManualAcknowledgement": ((PulsarEndpoint) target).getPulsarConfiguration().setAllowManualAcknowledgement(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((PulsarEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerName": ((PulsarEndpoint) target).getPulsarConfiguration().setConsumerName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerNamePrefix": ((PulsarEndpoint) target).getPulsarConfiguration().setConsumerNamePrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerQueueSize": ((PulsarEndpoint) target).getPulsarConfiguration().setConsumerQueueSize(property(camelContext, int.class, value)); return true;
        case "numberOfConsumers": ((PulsarEndpoint) target).getPulsarConfiguration().setNumberOfConsumers(property(camelContext, int.class, value)); return true;
        case "subscriptionInitialPosition": ((PulsarEndpoint) target).getPulsarConfiguration().setSubscriptionInitialPosition(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition.class, value)); return true;
        case "subscriptionName": ((PulsarEndpoint) target).getPulsarConfiguration().setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptionType": ((PulsarEndpoint) target).getPulsarConfiguration().setSubscriptionType(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.class, value)); return true;
        case "exceptionHandler": ((PulsarEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((PulsarEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "batchingEnabled": ((PulsarEndpoint) target).getPulsarConfiguration().setBatchingEnabled(property(camelContext, boolean.class, value)); return true;
        case "batchingMaxMessages": ((PulsarEndpoint) target).getPulsarConfiguration().setBatchingMaxMessages(property(camelContext, int.class, value)); return true;
        case "batchingMaxPublishDelayMicros": ((PulsarEndpoint) target).getPulsarConfiguration().setBatchingMaxPublishDelayMicros(property(camelContext, long.class, value)); return true;
        case "blockIfQueueFull": ((PulsarEndpoint) target).getPulsarConfiguration().setBlockIfQueueFull(property(camelContext, boolean.class, value)); return true;
        case "compressionType": ((PulsarEndpoint) target).getPulsarConfiguration().setCompressionType(property(camelContext, org.apache.pulsar.client.api.CompressionType.class, value)); return true;
        case "initialSequenceId": ((PulsarEndpoint) target).getPulsarConfiguration().setInitialSequenceId(property(camelContext, long.class, value)); return true;
        case "lazyStartProducer": ((PulsarEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxPendingMessages": ((PulsarEndpoint) target).getPulsarConfiguration().setMaxPendingMessages(property(camelContext, int.class, value)); return true;
        case "maxPendingMessagesAcrossPartitions": ((PulsarEndpoint) target).getPulsarConfiguration().setMaxPendingMessagesAcrossPartitions(property(camelContext, int.class, value)); return true;
        case "messageRouter": ((PulsarEndpoint) target).getPulsarConfiguration().setMessageRouter(property(camelContext, org.apache.pulsar.client.api.MessageRouter.class, value)); return true;
        case "messageRoutingMode": ((PulsarEndpoint) target).getPulsarConfiguration().setMessageRoutingMode(property(camelContext, org.apache.pulsar.client.api.MessageRoutingMode.class, value)); return true;
        case "producerName": ((PulsarEndpoint) target).getPulsarConfiguration().setProducerName(property(camelContext, java.lang.String.class, value)); return true;
        case "sendTimeoutMs": ((PulsarEndpoint) target).getPulsarConfiguration().setSendTimeoutMs(property(camelContext, int.class, value)); return true;
        case "basicPropertyBinding": ((PulsarEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((PulsarEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "ackgrouptimemillis": ((PulsarEndpoint) target).getPulsarConfiguration().setAckGroupTimeMillis(property(camelContext, long.class, value)); return true;
        case "acktimeoutmillis": ((PulsarEndpoint) target).getPulsarConfiguration().setAckTimeoutMillis(property(camelContext, long.class, value)); return true;
        case "allowmanualacknowledgement": ((PulsarEndpoint) target).getPulsarConfiguration().setAllowManualAcknowledgement(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((PulsarEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumername": ((PulsarEndpoint) target).getPulsarConfiguration().setConsumerName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumernameprefix": ((PulsarEndpoint) target).getPulsarConfiguration().setConsumerNamePrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerqueuesize": ((PulsarEndpoint) target).getPulsarConfiguration().setConsumerQueueSize(property(camelContext, int.class, value)); return true;
        case "numberofconsumers": ((PulsarEndpoint) target).getPulsarConfiguration().setNumberOfConsumers(property(camelContext, int.class, value)); return true;
        case "subscriptioninitialposition": ((PulsarEndpoint) target).getPulsarConfiguration().setSubscriptionInitialPosition(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition.class, value)); return true;
        case "subscriptionname": ((PulsarEndpoint) target).getPulsarConfiguration().setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptiontype": ((PulsarEndpoint) target).getPulsarConfiguration().setSubscriptionType(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.class, value)); return true;
        case "exceptionhandler": ((PulsarEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((PulsarEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "batchingenabled": ((PulsarEndpoint) target).getPulsarConfiguration().setBatchingEnabled(property(camelContext, boolean.class, value)); return true;
        case "batchingmaxmessages": ((PulsarEndpoint) target).getPulsarConfiguration().setBatchingMaxMessages(property(camelContext, int.class, value)); return true;
        case "batchingmaxpublishdelaymicros": ((PulsarEndpoint) target).getPulsarConfiguration().setBatchingMaxPublishDelayMicros(property(camelContext, long.class, value)); return true;
        case "blockifqueuefull": ((PulsarEndpoint) target).getPulsarConfiguration().setBlockIfQueueFull(property(camelContext, boolean.class, value)); return true;
        case "compressiontype": ((PulsarEndpoint) target).getPulsarConfiguration().setCompressionType(property(camelContext, org.apache.pulsar.client.api.CompressionType.class, value)); return true;
        case "initialsequenceid": ((PulsarEndpoint) target).getPulsarConfiguration().setInitialSequenceId(property(camelContext, long.class, value)); return true;
        case "lazystartproducer": ((PulsarEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxpendingmessages": ((PulsarEndpoint) target).getPulsarConfiguration().setMaxPendingMessages(property(camelContext, int.class, value)); return true;
        case "maxpendingmessagesacrosspartitions": ((PulsarEndpoint) target).getPulsarConfiguration().setMaxPendingMessagesAcrossPartitions(property(camelContext, int.class, value)); return true;
        case "messagerouter": ((PulsarEndpoint) target).getPulsarConfiguration().setMessageRouter(property(camelContext, org.apache.pulsar.client.api.MessageRouter.class, value)); return true;
        case "messageroutingmode": ((PulsarEndpoint) target).getPulsarConfiguration().setMessageRoutingMode(property(camelContext, org.apache.pulsar.client.api.MessageRoutingMode.class, value)); return true;
        case "producername": ((PulsarEndpoint) target).getPulsarConfiguration().setProducerName(property(camelContext, java.lang.String.class, value)); return true;
        case "sendtimeoutms": ((PulsarEndpoint) target).getPulsarConfiguration().setSendTimeoutMs(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding": ((PulsarEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((PulsarEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

