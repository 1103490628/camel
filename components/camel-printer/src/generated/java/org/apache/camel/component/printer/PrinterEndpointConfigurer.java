/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.printer;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PrinterEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "copies": ((PrinterEndpoint) target).getConfig().setCopies(property(camelContext, int.class, value)); return true;
        case "docFlavor": ((PrinterEndpoint) target).getConfig().setDocFlavor(property(camelContext, javax.print.DocFlavor.class, value)); return true;
        case "flavor": ((PrinterEndpoint) target).getConfig().setFlavor(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((PrinterEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mediaSize": ((PrinterEndpoint) target).getConfig().setMediaSize(property(camelContext, java.lang.String.class, value)); return true;
        case "mediaTray": ((PrinterEndpoint) target).getConfig().setMediaTray(property(camelContext, java.lang.String.class, value)); return true;
        case "mimeType": ((PrinterEndpoint) target).getConfig().setMimeType(property(camelContext, java.lang.String.class, value)); return true;
        case "orientation": ((PrinterEndpoint) target).getConfig().setOrientation(property(camelContext, java.lang.String.class, value)); return true;
        case "printerPrefix": ((PrinterEndpoint) target).getConfig().setPrinterPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "sendToPrinter": ((PrinterEndpoint) target).getConfig().setSendToPrinter(property(camelContext, boolean.class, value)); return true;
        case "sides": ((PrinterEndpoint) target).getConfig().setSides(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((PrinterEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((PrinterEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "copies": ((PrinterEndpoint) target).getConfig().setCopies(property(camelContext, int.class, value)); return true;
        case "docflavor": ((PrinterEndpoint) target).getConfig().setDocFlavor(property(camelContext, javax.print.DocFlavor.class, value)); return true;
        case "flavor": ((PrinterEndpoint) target).getConfig().setFlavor(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((PrinterEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mediasize": ((PrinterEndpoint) target).getConfig().setMediaSize(property(camelContext, java.lang.String.class, value)); return true;
        case "mediatray": ((PrinterEndpoint) target).getConfig().setMediaTray(property(camelContext, java.lang.String.class, value)); return true;
        case "mimetype": ((PrinterEndpoint) target).getConfig().setMimeType(property(camelContext, java.lang.String.class, value)); return true;
        case "orientation": ((PrinterEndpoint) target).getConfig().setOrientation(property(camelContext, java.lang.String.class, value)); return true;
        case "printerprefix": ((PrinterEndpoint) target).getConfig().setPrinterPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "sendtoprinter": ((PrinterEndpoint) target).getConfig().setSendToPrinter(property(camelContext, boolean.class, value)); return true;
        case "sides": ((PrinterEndpoint) target).getConfig().setSides(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((PrinterEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((PrinterEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

