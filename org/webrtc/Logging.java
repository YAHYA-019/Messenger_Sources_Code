package org.webrtc;

import X.0Pz;
import X.AnonymousClass001;
import X.H98;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: Logging.class */
public class Logging {
    public static final Logger fallbackLogger = createFallbackLogger();
    public static Loggable loggable;
    public static H98 loggableSeverity;
    public static volatile boolean loggingEnabled;

    public static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void d(String str, String str2) {
        log(H98.LS_INFO, str, str2);
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void e(String str, String str2) {
        log(H98.LS_ERROR, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        H98 h98 = H98.LS_ERROR;
        log(h98, str, str2);
        log(h98, str, th.toString());
        log(h98, str, getStackTraceString(th));
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static void enableLogToDebugOutput(H98 h98) {
        synchronized (Logging.class) {
            if (loggable != null) {
                throw AnonymousClass001.A0N("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
            nativeEnableLogToDebugOutput(h98.ordinal());
            loggingEnabled = true;
        }
    }

    public static void enableTracing(String str, EnumSet enumSet) {
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void injectLoggable(Loggable loggable2, H98 h98) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = h98;
        }
    }

    public static void log(H98 h98, String str, String str2) {
        if (str == null || str2 == null) {
            throw AnonymousClass001.A0L("Logging tag or message may not be null.");
        }
        Loggable loggable2 = loggable;
        if (loggable2 != null) {
            if (h98.ordinal() >= loggableSeverity.ordinal()) {
                loggable2.onLogMessage(str2, h98, str);
            }
        } else if (loggingEnabled) {
            nativeLog(h98.ordinal(), str, str2);
        } else {
            int ordinal = h98.ordinal();
            fallbackLogger.log(ordinal != 3 ? ordinal != 2 ? ordinal != 1 ? Level.FINE : Level.INFO : Level.WARNING : Level.SEVERE, 0Pz.A0j(str, ": ", str2));
        }
    }

    public static native void nativeEnableLogThreads();

    public static native void nativeEnableLogTimeStamps();

    public static native void nativeEnableLogToDebugOutput(int i);

    public static native void nativeLog(int i, String str, String str2);

    public static void v(String str, String str2) {
        log(H98.LS_VERBOSE, str, str2);
    }

    public static void w(String str, String str2) {
        log(H98.LS_WARNING, str, str2);
    }

    public static void w(String str, String str2, Throwable th) {
        H98 h98 = H98.LS_WARNING;
        log(h98, str, str2);
        log(h98, str, th.toString());
        log(h98, str, getStackTraceString(th));
    }
}
