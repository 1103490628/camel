/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.ecs;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ECSEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "accessKey": ((ECSEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "ecsClient": ((ECSEndpoint) target).getConfiguration().setEcsClient(property(camelContext, com.amazonaws.services.ecs.AmazonECS.class, value)); return true;
        case "lazyStartProducer": ((ECSEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((ECSEndpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.ecs.ECSOperations.class, value)); return true;
        case "proxyHost": ((ECSEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((ECSEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyProtocol": ((ECSEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((ECSEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((ECSEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((ECSEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((ECSEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesskey": ((ECSEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "ecsclient": ((ECSEndpoint) target).getConfiguration().setEcsClient(property(camelContext, com.amazonaws.services.ecs.AmazonECS.class, value)); return true;
        case "lazystartproducer": ((ECSEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((ECSEndpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.ecs.ECSOperations.class, value)); return true;
        case "proxyhost": ((ECSEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((ECSEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol": ((ECSEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((ECSEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((ECSEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((ECSEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((ECSEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

