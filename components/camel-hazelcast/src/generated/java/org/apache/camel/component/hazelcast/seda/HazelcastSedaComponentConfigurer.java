/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hazelcast.seda;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HazelcastSedaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "hazelcastInstance": ((HazelcastSedaComponent) target).setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastMode": ((HazelcastSedaComponent) target).setHazelcastMode(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((HazelcastSedaComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((HazelcastSedaComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((HazelcastSedaComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "hazelcastinstance": ((HazelcastSedaComponent) target).setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastmode": ((HazelcastSedaComponent) target).setHazelcastMode(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((HazelcastSedaComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((HazelcastSedaComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((HazelcastSedaComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

