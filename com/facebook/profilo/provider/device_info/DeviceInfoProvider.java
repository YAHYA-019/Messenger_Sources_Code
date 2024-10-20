package com.facebook.profilo.provider.device_info;

import X.0Gw;
import X.0Pz;
import X.AnonymousClass001;
import X.C05a;
import X.C05c;
import X.C0T5;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;

/* loaded from: DeviceInfoProvider.class */
public final class DeviceInfoProvider extends C0T5 {
    public final Context A00;

    static {
        ProvidersRegistry.A00.A02("device_info");
    }

    public DeviceInfoProvider(Context context) {
        super(null);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null && (context instanceof Application)) {
            this.A00 = context;
        } else {
            this.A00 = applicationContext;
        }
    }

    public static void A00(Buffer buffer, int i, long j) {
        BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, i, 0, j);
    }

    public static void A01(Buffer buffer, String str, String str2, int i) {
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, i, 0, 0L), str), str2);
    }

    @Override // X.C0T5
    public void logOnTraceEnd(TraceContext traceContext, 0Gw r303) {
        Buffer buffer = traceContext.A09;
        A01(buffer, "os_ver", Build.VERSION.RELEASE, 8126483);
        A01(buffer, "device_type", Build.MODEL, 8126478);
        A01(buffer, "brand", Build.BRAND, 8126479);
        A01(buffer, "manufacturer", Build.MANUFACTURER, 8126480);
        Context context = this.A00;
        A01(buffer, "year_class", Integer.toString(C05a.A00(context)), 8126481);
        A01(buffer, "os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126537);
        A00(buffer, 8126503, C05c.A00());
        A00(buffer, 8126502, C05c.A03(context));
        try {
            A01(buffer, "Kernel version", System.getProperty("os.version", "undefined"), 8126527);
        } catch (SecurityException e) {
            Log.w("Profilo/DeviceInfo", 0Pz.A1B("SecurityException: ", e));
        }
        A00(buffer, 8126490, AnonymousClass001.A0E("/proc/sys/kernel/perf_event_paranoid").exists() ? 1L : 0L);
    }
}
