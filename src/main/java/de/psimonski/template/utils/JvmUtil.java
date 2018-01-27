package de.psimonski.template.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.NumberFormat;

public class JvmUtil {

    private static Log LOG = LogFactory.getLog(JvmUtil.class);

    public static void logMemoryOutput() {
        Runtime runtime = Runtime.getRuntime();
        final NumberFormat format = NumberFormat.getInstance();
        final long maxMemory = runtime.maxMemory();
        final long allocatedMemory = runtime.totalMemory();
        final long freeMemory = runtime.freeMemory();
        final long mb = 1024 * 1024;
        final String mega = " MB";
        LOG.info("========================== Memory Info ==========================");
        LOG.info("Free memory: " + format.format(freeMemory / mb) + mega);
        LOG.info("Allocated memory: " + format.format(allocatedMemory / mb) + mega);
        LOG.info("Max memory: " + format.format(maxMemory / mb) + mega);
        LOG.info("Total free memory: " + format.format((freeMemory + (maxMemory - allocatedMemory)) / mb) + mega);
        LOG.info("=================================================================\n");
    }

}