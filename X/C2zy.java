package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.2zy, reason: invalid class name */
/* loaded from: 2zy.class */
public final class C2zy extends AbstractC00401az {
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;
    public final 1tQ A02;
    public final boolean A03;

    public C2zy(1tQ r302, String str) {
        super(str);
        this.A01 = (LightweightQuickPerformanceLogger) C2zx.A02.get();
        this.A03 = C2zx.A01.A41;
        this.A02 = r302;
        this.A00 = str.hashCode();
    }

    @Override // X.AbstractC00401az
    public void A03(String str, JSONObject jSONObject) {
        boolean z = this.A03;
        if (z) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
            int i = this.A00;
            lightweightQuickPerformanceLogger.markerStart(58858759, i, lightweightQuickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
            lightweightQuickPerformanceLogger.markerPoint(58858759, i, "start_put_method");
            lightweightQuickPerformanceLogger.markerAnnotate(58858759, i, "store_type", "json_store");
        }
        this.A02.A06(str, jSONObject);
        if (z) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.A01;
            int i2 = this.A00;
            lightweightQuickPerformanceLogger2.markerPoint(58858759, i2, "end_put_method");
            lightweightQuickPerformanceLogger2.markerEnd(58858759, i2, (short) 2, lightweightQuickPerformanceLogger2.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
        }
    }
}
