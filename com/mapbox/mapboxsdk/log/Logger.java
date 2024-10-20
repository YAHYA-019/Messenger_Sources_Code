package com.mapbox.mapboxsdk.log;

import X.AnonymousClass001;
import android.util.Log;

/* loaded from: Logger.class */
public final class Logger {
    public static final LoggerDefinition DEFAULT;
    public static volatile LoggerDefinition logger;

    static {
        LoggerDefinition loggerDefinition = new LoggerDefinition() { // from class: com.mapbox.mapboxsdk.log.Logger.1
            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void d(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void d(String str, String str2, Throwable th) {
                Log.d(str, str2, th);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void e(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void e(String str, String str2, Throwable th) {
                Log.e(str, str2, th);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void i(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void i(String str, String str2, Throwable th) {
                Log.i(str, str2, th);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void v(String str, String str2) {
                Log.v(str, str2);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void v(String str, String str2, Throwable th) {
                Log.v(str, str2, th);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void w(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // com.mapbox.mapboxsdk.log.LoggerDefinition
            public void w(String str, String str2, Throwable th) {
                Log.w(str, str2, th);
            }
        };
        DEFAULT = loggerDefinition;
        logger = loggerDefinition;
    }

    public static void d(String str, String str2) {
        logger.d(str, str2);
    }

    public static void d(String str, String str2, Throwable th) {
        logger.d(str, str2, th);
    }

    public static void e(String str, String str2) {
        logger.e(str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        logger.e(str, str2, th);
    }

    public static void i(String str, String str2) {
        logger.i(str, str2);
    }

    public static void i(String str, String str2, Throwable th) {
        logger.i(str, str2, th);
    }

    public static void log(int i, String str, String str2) {
        if (i == 2) {
            v(str, str2);
            return;
        }
        if (i == 3) {
            d(str, str2);
            return;
        }
        if (i == 4) {
            i(str, str2);
        } else if (i == 5) {
            w(str, str2);
        } else {
            if (i != 6) {
                throw AnonymousClass001.A0p();
            }
            e(str, str2);
        }
    }

    public static void setLoggerDefinition(LoggerDefinition loggerDefinition) {
        logger = loggerDefinition;
    }

    public static void v(String str, String str2) {
        logger.v(str, str2);
    }

    public static void v(String str, String str2, Throwable th) {
        logger.v(str, str2, th);
    }

    public static void w(String str, String str2) {
        logger.w(str, str2);
    }

    public static void w(String str, String str2, Throwable th) {
        logger.w(str, str2, th);
    }
}
