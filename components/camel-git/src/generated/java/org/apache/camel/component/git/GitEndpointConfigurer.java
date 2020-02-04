/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.git;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GitEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "branchName": ((GitEndpoint) target).setBranchName(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((GitEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "remoteName": ((GitEndpoint) target).setRemoteName(property(camelContext, java.lang.String.class, value)); return true;
        case "remotePath": ((GitEndpoint) target).setRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "tagName": ((GitEndpoint) target).setTagName(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((GitEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((GitEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "type": ((GitEndpoint) target).setType(property(camelContext, org.apache.camel.component.git.consumer.GitType.class, value)); return true;
        case "exceptionHandler": ((GitEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GitEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "allowEmpty": ((GitEndpoint) target).setAllowEmpty(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((GitEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((GitEndpoint) target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((GitEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GitEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "branchname": ((GitEndpoint) target).setBranchName(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((GitEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "remotename": ((GitEndpoint) target).setRemoteName(property(camelContext, java.lang.String.class, value)); return true;
        case "remotepath": ((GitEndpoint) target).setRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "tagname": ((GitEndpoint) target).setTagName(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((GitEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((GitEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "type": ((GitEndpoint) target).setType(property(camelContext, org.apache.camel.component.git.consumer.GitType.class, value)); return true;
        case "exceptionhandler": ((GitEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GitEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "allowempty": ((GitEndpoint) target).setAllowEmpty(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((GitEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((GitEndpoint) target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((GitEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GitEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

