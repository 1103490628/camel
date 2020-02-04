/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.lambda;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class LambdaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((LambdaComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.lambda.LambdaConfiguration.class, value)); return true;
        case "accessKey": ((LambdaComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((LambdaComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((LambdaComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((LambdaComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((LambdaComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((LambdaComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.lambda.LambdaConfiguration.class, value)); return true;
        case "accesskey": ((LambdaComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((LambdaComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((LambdaComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((LambdaComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((LambdaComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

