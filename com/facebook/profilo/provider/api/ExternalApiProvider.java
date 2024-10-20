package com.facebook.profilo.provider.api;

import X.0FI;
import X.0Gw;
import X.0Pz;
import X.C0lu;
import android.util.Log;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* loaded from: ExternalApiProvider.class */
public final class ExternalApiProvider extends C0lu {
    public static final int PROVIDERS_MASK;
    public static final ExternalProvider[] PROVIDERS_TO_REGISTER;

    static {
        int i = 0;
        ExternalProvider[] externalProviderArr = {ExternalProviders.A00, ExternalProviders.A01};
        PROVIDERS_TO_REGISTER = externalProviderArr;
        int i2 = 0;
        do {
            i2 |= externalProviderArr[i].A01;
            i++;
        } while (i < 2);
        PROVIDERS_MASK = i2;
    }

    public ExternalApiProvider() {
        super("profilo_apiimpl");
        A06();
    }

    public static native void addLogger(String str, MultiBufferLogger multiBufferLogger);

    @Override // X.C0lu
    public void disable() {
        0FI.A09(-454096347, 0FI.A03(-2142347049));
    }

    @Override // X.C0lu
    public void enable() {
        0FI.A09(-1163784042, 0FI.A03(-1353531035));
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDERS_MASK;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        return PROVIDERS_MASK & TraceEvents.sProviders;
    }

    @Override // X.C0lu
    public void onTraceStarted(TraceContext traceContext, 0Gw r303) {
        int A03 = 0FI.A03(-1673852710);
        ExternalProvider[] externalProviderArr = PROVIDERS_TO_REGISTER;
        int i = 0;
        do {
            ExternalProvider externalProvider = externalProviderArr[i];
            if ((traceContext.A02 & externalProvider.A01) != 0) {
                MultiBufferLogger multiBufferLogger = externalProvider.A0A().A00;
                if (multiBufferLogger == null) {
                    Log.w("Profilo/ExternalApi", 0Pz.A0j("logger for ", externalProvider.A02, " is null, is that provider initialized before ExternalApiProvider?"));
                } else {
                    addLogger(externalProvider.A02, multiBufferLogger);
                }
            }
            i++;
        } while (i < 2);
        0FI.A09(-2114073775, A03);
    }
}
