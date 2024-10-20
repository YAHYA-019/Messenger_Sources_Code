package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.storage.monitor.fbapps.FBAppsStorageResourceMonitor;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1bd.class */
public final class C00541bd implements 1aR {
    public 1Mw A00;
    public final C00i A01;
    public final AbstractC00401az A02;
    public final C1Zg A03;

    public C00541bd() {
        C1Zg c1Zg = (C1Zg) 1Bn.A0A(33057);
        1Mw r0 = (1Mw) 1Bn.A0A(67127);
        this.A03 = c1Zg;
        this.A02 = c1Zg.A00("max_size");
        this.A00 = r0;
        this.A01 = new 1BQ(68406);
    }

    public void A00(C1c0 c1c0, File file, long j) {
        String absolutePath;
        try {
            try {
                absolutePath = file.getCanonicalPath();
            } catch (IOException unused) {
                absolutePath = file.getAbsolutePath();
            }
            JSONObject D4Q = c1c0.D4Q();
            if (((C1Z7) c1c0.A00).A03) {
                if (j < 0) {
                    j = this.A02.A01(absolutePath).optLong("last_measured_size", -1);
                }
                D4Q.put("last_measured_size", j);
            }
            this.A02.A03(absolutePath, D4Q);
        } catch (JSONException unused2) {
        }
    }

    public /* bridge */ /* synthetic */ void CAv(final 1Z6 r302, 1Yu r303, final File file) {
        String absolutePath;
        final C1Z7 c1z7 = (C1Z7) r303;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) this.A01.get();
        try {
            lightweightQuickPerformanceLogger.markerStart(38469637);
            if (lightweightQuickPerformanceLogger.isMarkerOn(38469637, true)) {
                lightweightQuickPerformanceLogger.markerAnnotate(38469637, "feature", r302.A03);
                lightweightQuickPerformanceLogger.markerAnnotate(38469637, "plugin", "max_size");
            }
            if (c1z7.A03) {
                try {
                    absolutePath = file.getCanonicalPath();
                } catch (IOException unused) {
                    absolutePath = file.getAbsolutePath();
                }
                AbstractC00401az abstractC00401az = this.A02;
                JSONObject A01 = abstractC00401az.A01(absolutePath);
                long j = -1;
                long optLong = A01.optLong("last_measured_size", j);
                C1Zg c1Zg = this.A03;
                if (optLong > (((FBAppsStorageResourceMonitor) c1Zg.A05.get()).A03() ? c1z7.A01 : c1z7.A00)) {
                    try {
                        A01.put("last_measured_size", j);
                        abstractC00401az.A03(absolutePath, A01);
                    } catch (JSONException unused2) {
                    }
                    c1Zg.A02(file);
                    file.mkdirs();
                }
            }
            ((Executor) this.A03.A01.get()).execute(new Runnable() { // from class: X.1da
                public static final String __redex_internal_original_name = "DefaultMaxSizePluginController$1";

                @Override // java.lang.Runnable
                public void run() {
                    this.A00(new C1c0(c1z7, r302.A03), file, -1);
                }
            });
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(38469637, (short) 2);
        }
    }
}
