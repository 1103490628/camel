/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.pubsub;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GooglePubsubComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "connectionFactory": ((GooglePubsubComponent) target).setConnectionFactory(property(camelContext, org.apache.camel.component.google.pubsub.GooglePubsubConnectionFactory.class, value)); return true;
        case "basicPropertyBinding": ((GooglePubsubComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((GooglePubsubComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((GooglePubsubComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "connectionfactory": ((GooglePubsubComponent) target).setConnectionFactory(property(camelContext, org.apache.camel.component.google.pubsub.GooglePubsubConnectionFactory.class, value)); return true;
        case "basicpropertybinding": ((GooglePubsubComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((GooglePubsubComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((GooglePubsubComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

