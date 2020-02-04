/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.bean.validator;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BeanValidatorComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "ignoreXmlConfiguration": ((BeanValidatorComponent) target).setIgnoreXmlConfiguration(property(camelContext, boolean.class, value)); return true;
        case "validationProviderResolver": ((BeanValidatorComponent) target).setValidationProviderResolver(property(camelContext, javax.validation.ValidationProviderResolver.class, value)); return true;
        case "messageInterpolator": ((BeanValidatorComponent) target).setMessageInterpolator(property(camelContext, javax.validation.MessageInterpolator.class, value)); return true;
        case "traversableResolver": ((BeanValidatorComponent) target).setTraversableResolver(property(camelContext, javax.validation.TraversableResolver.class, value)); return true;
        case "constraintValidatorFactory": ((BeanValidatorComponent) target).setConstraintValidatorFactory(property(camelContext, javax.validation.ConstraintValidatorFactory.class, value)); return true;
        case "basicPropertyBinding": ((BeanValidatorComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((BeanValidatorComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "ignorexmlconfiguration": ((BeanValidatorComponent) target).setIgnoreXmlConfiguration(property(camelContext, boolean.class, value)); return true;
        case "validationproviderresolver": ((BeanValidatorComponent) target).setValidationProviderResolver(property(camelContext, javax.validation.ValidationProviderResolver.class, value)); return true;
        case "messageinterpolator": ((BeanValidatorComponent) target).setMessageInterpolator(property(camelContext, javax.validation.MessageInterpolator.class, value)); return true;
        case "traversableresolver": ((BeanValidatorComponent) target).setTraversableResolver(property(camelContext, javax.validation.TraversableResolver.class, value)); return true;
        case "constraintvalidatorfactory": ((BeanValidatorComponent) target).setConstraintValidatorFactory(property(camelContext, javax.validation.ConstraintValidatorFactory.class, value)); return true;
        case "basicpropertybinding": ((BeanValidatorComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((BeanValidatorComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

