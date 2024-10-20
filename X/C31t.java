package X;

import com.facebook.mobileconfig.MobileConfigCxxPerfLogger;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.31t, reason: invalid class name */
/* loaded from: 31t.class */
public final class C31t implements MobileConfigCxxPerfLogger {
    public Random A00 = new Random();
    public final LightweightQuickPerformanceLogger A01;

    public C31t(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A01 = lightweightQuickPerformanceLogger;
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
    public int generateInstanceKey() {
        return this.A00.nextInt((-1) >>> 1);
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
    public void markEvent(int i, String str, int i2, java.util.Map map) {
        EventBuilder markEventBuilder = this.A01.markEventBuilder(i, str);
        markEventBuilder.setLevel(i2);
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            markEventBuilder.annotate(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
        }
        markEventBuilder.report();
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
    public void markerAnnotate(int i, int i2, java.util.Map map) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        for (Map.Entry entry : map.entrySet()) {
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
    public void markerEnd(int i, int i2) {
        this.A01.markerEnd(i, i2, (short) 2);
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
    public void markerPoint(int i, int i2, String str, java.util.Map map) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            lightweightQuickPerformanceLogger.markerPoint(i, i2, AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
        }
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxPerfLogger
    public void markerStart(int i, int i2) {
        this.A01.markerStart(i, i2);
    }
}
