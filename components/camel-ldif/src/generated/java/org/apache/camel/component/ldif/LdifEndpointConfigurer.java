/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ldif;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class LdifEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "lazyStartProducer": ((LdifEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((LdifEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((LdifEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "lazystartproducer": ((LdifEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((LdifEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((LdifEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

