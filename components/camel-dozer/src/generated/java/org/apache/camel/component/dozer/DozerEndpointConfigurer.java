/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dozer;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DozerEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "lazyStartProducer": ((DozerEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mappingConfiguration": ((DozerEndpoint) target).getConfiguration().setMappingConfiguration(property(camelContext, org.apache.camel.converter.dozer.DozerBeanMapperConfiguration.class, value)); return true;
        case "mappingFile": ((DozerEndpoint) target).getConfiguration().setMappingFile(property(camelContext, java.lang.String.class, value)); return true;
        case "marshalId": ((DozerEndpoint) target).getConfiguration().setMarshalId(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceModel": ((DozerEndpoint) target).getConfiguration().setSourceModel(property(camelContext, java.lang.String.class, value)); return true;
        case "targetModel": ((DozerEndpoint) target).getConfiguration().setTargetModel(property(camelContext, java.lang.String.class, value)); return true;
        case "unmarshalId": ((DozerEndpoint) target).getConfiguration().setUnmarshalId(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((DozerEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DozerEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "lazystartproducer": ((DozerEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mappingconfiguration": ((DozerEndpoint) target).getConfiguration().setMappingConfiguration(property(camelContext, org.apache.camel.converter.dozer.DozerBeanMapperConfiguration.class, value)); return true;
        case "mappingfile": ((DozerEndpoint) target).getConfiguration().setMappingFile(property(camelContext, java.lang.String.class, value)); return true;
        case "marshalid": ((DozerEndpoint) target).getConfiguration().setMarshalId(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcemodel": ((DozerEndpoint) target).getConfiguration().setSourceModel(property(camelContext, java.lang.String.class, value)); return true;
        case "targetmodel": ((DozerEndpoint) target).getConfiguration().setTargetModel(property(camelContext, java.lang.String.class, value)); return true;
        case "unmarshalid": ((DozerEndpoint) target).getConfiguration().setUnmarshalId(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((DozerEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DozerEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

