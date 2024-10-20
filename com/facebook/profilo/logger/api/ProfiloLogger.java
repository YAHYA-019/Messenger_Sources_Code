package com.facebook.profilo.logger.api;

import X.0F2;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* loaded from: ProfiloLogger.class */
public final class ProfiloLogger {
    public static volatile boolean A00;

    public static int classLoadEnd(Class cls) {
        if (!A00) {
            return -1;
        }
        ExternalProvider externalProvider = ExternalProviders.A00;
        if (!TraceEvents.isEnabled(externalProvider.A01) || !ClassId.sInitialized) {
            return -1;
        }
        return externalProvider.A0A().A00(6, 81, 0, 0, ClassId.getClassId(cls));
    }

    public static int classLoadFailed() {
        if (!A00) {
            return -1;
        }
        ExternalProvider externalProvider = ExternalProviders.A00;
        if (TraceEvents.isEnabled(externalProvider.A01) && ClassId.sInitialized) {
            return externalProvider.A0A().A00(6, 82, 0, 0, 0L);
        }
        return -1;
    }

    public static int classLoadStart() {
        if (!A00) {
            return -1;
        }
        ExternalProvider externalProvider = ExternalProviders.A00;
        if (TraceEvents.isEnabled(externalProvider.A01) && ClassId.sInitialized) {
            return externalProvider.A0A().A00(6, 80, 0, 0, 0L);
        }
        return -1;
    }

    public static void installClassLoadTracer() {
        int i = 0;
        String[] strArr = {"com.facebook.profilo.core.ProvidersRegistry", "com.facebook.profilo.core.TraceEvents", "com.facebook.profilo.entries.EntryType", "com.facebook.profilo.logger.ClassLoadLogger", "com.facebook.profilo.logger.BufferLogger", "com.facebook.profilo.logger.Logger", "com.facebook.profilo.logger.MultiBufferLogger", "com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike", "com.facebook.profilo.provider.constants.ExternalProvider", "com.facebook.profilo.provider.constants.ExternalProviders"};
        do {
            try {
                Class.forName(strArr[i]);
            } catch (ClassNotFoundException unused) {
            }
            i++;
        } while (i < 10);
        ProfiloClassLoadTracer.sTracer = new 0F2();
    }
}
