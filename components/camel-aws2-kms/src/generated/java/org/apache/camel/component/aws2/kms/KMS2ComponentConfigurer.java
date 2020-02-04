/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.kms;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KMS2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((KMS2Component) target).setConfiguration(property(camelContext, org.apache.camel.component.aws2.kms.KMS2Configuration.class, value)); return true;
        case "accessKey": ((KMS2Component) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((KMS2Component) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((KMS2Component) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((KMS2Component) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((KMS2Component) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((KMS2Component) target).setConfiguration(property(camelContext, org.apache.camel.component.aws2.kms.KMS2Configuration.class, value)); return true;
        case "accesskey": ((KMS2Component) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((KMS2Component) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((KMS2Component) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((KMS2Component) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((KMS2Component) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

