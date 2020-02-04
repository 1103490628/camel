/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.openstack.keystone;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KeystoneEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "config": ((KeystoneEndpoint) target).setConfig(property(camelContext, org.openstack4j.core.transport.Config.class, value)); return true;
        case "domain": ((KeystoneEndpoint) target).setDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((KeystoneEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KeystoneEndpoint) target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KeystoneEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "project": ((KeystoneEndpoint) target).setProject(property(camelContext, java.lang.String.class, value)); return true;
        case "subsystem": ((KeystoneEndpoint) target).setSubsystem(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((KeystoneEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((KeystoneEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((KeystoneEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "config": ((KeystoneEndpoint) target).setConfig(property(camelContext, org.openstack4j.core.transport.Config.class, value)); return true;
        case "domain": ((KeystoneEndpoint) target).setDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((KeystoneEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KeystoneEndpoint) target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KeystoneEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "project": ((KeystoneEndpoint) target).setProject(property(camelContext, java.lang.String.class, value)); return true;
        case "subsystem": ((KeystoneEndpoint) target).setSubsystem(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((KeystoneEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((KeystoneEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((KeystoneEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

