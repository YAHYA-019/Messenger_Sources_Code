package X;

import com.facebook.common.dextricks.LogcatReader;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4o3.class */
public final class C08804o3 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A03;
    public final java.util.Map A05;
    public final java.util.Map A07;
    public final Set A08;
    public final 1Br A09 = 1Bq.A00(16520);
    public final 1Br A04 = 1Bu.A00(85043);
    public final 1Br A02 = 1Bq.A00(66266);
    public final java.util.Map A06 = new HashMap();

    public C08804o3() {
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        11T.A0A(newSetFromMap);
        this.A08 = newSetFromMap;
        this.A05 = new ConcurrentHashMap();
        this.A07 = new ConcurrentHashMap();
        this.A03 = 1Bu.A00(84577);
        this.A01 = 1Bq.A00(65839);
        this.A00 = 1Bq.A00(66370);
        A00(this).setMissingConfigSampleRate(5505060, 25000);
        A00(this).setMissingConfigSampleRate(5505025, LogcatReader.DEFAULT_WAIT_TIME);
    }

    public static final QuickPerformanceLogger A00(C08804o3 c08804o3) {
        return (QuickPerformanceLogger) c08804o3.A09.A00.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (r311 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C08804o3 r301, com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303, java.lang.String r304, int r305, long r306) {
        /*
            r0 = r303
            int r0 = r0.hashCode()
            r308 = r0
            r0 = r301
            com.facebook.quicklog.QuickPerformanceLogger r0 = A00(r0)
            r1 = r305
            r2 = r308
            r0.markerStart(r1, r2)
            r0 = r301
            com.facebook.quicklog.QuickPerformanceLogger r0 = A00(r0)
            r309 = r0
            java.lang.String r0 = "send_type"
            r310 = r0
            r0 = r309
            r1 = r305
            r2 = r308
            r3 = r310
            r4 = r304
            r0.markerAnnotate(r1, r2, r3, r4)
            r0 = r302
            if (r0 == 0) goto L46
            r0 = r302
            X.1yg r0 = r0.A06
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L46
            r0 = r310
            java.lang.String r0 = r0.toString()
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L4a
        L46:
            java.lang.String r0 = "UNKNOWN"
            r311 = r0
        L4a:
            r0 = 0
            r312 = r0
            r0 = r306
            r1 = r312
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r314 = r0
            r0 = r314
            if (r0 == 0) goto L81
            r0 = r301
            com.facebook.quicklog.QuickPerformanceLogger r0 = A00(r0)
            r315 = r0
            r0 = r306
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r309 = r0
            r0 = r315
            r1 = r305
            r2 = r308
            java.lang.String r3 = "group_id"
            r4 = r309
            r0.markerAnnotate(r1, r2, r3, r4)
            X.1yg r0 = X.C1yg.COMMUNITY_CHANNEL
            r310 = r0
            r0 = r310
            java.lang.String r0 = r0.toString()
            r311 = r0
        L81:
            r0 = r301
            com.facebook.quicklog.QuickPerformanceLogger r0 = A00(r0)
            r1 = r305
            r2 = r308
            java.lang.String r3 = "thread_type"
            r4 = r311
            r0.markerAnnotate(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08804o3.A01(X.4o3, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, java.lang.String, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00e1, code lost:
    
        if (r327 == null) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Throwable, com.facebook.quicklog.QuickPerformanceLogger] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.C08804o3 r301, com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, int r306, int r307, int r308, long r309, long r311, long r313, boolean r315) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08804o3.A02(X.4o3, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, java.lang.String, java.lang.String, int, int, int, long, long, long, boolean):void");
    }

    public static final void A03(C08804o3 c08804o3, String str) {
        int hashCode = str.hashCode();
        QuickPerformanceLogger A00 = A00(c08804o3);
        C00i c00i = c08804o3.A03.A00;
        c00i.get();
        java.util.Map map = C08814o4.A00;
        11T.A0F(map, 1);
        Integer valueOf = Integer.valueOf(hashCode);
        Number number = (Number) map.get(valueOf);
        A00.markerAnnotate(5505076, hashCode, "render_message_list_count", number != null ? number.intValue() : 0);
        if (c08804o3.A05.get(str) != null) {
            QuickPerformanceLogger A002 = A00(c08804o3);
            c00i.get();
            Number A0o = 1BK.A0o(valueOf, map);
            A002.markerAnnotate(231283540, hashCode, "render_message_list_count", A0o != null ? A0o.intValue() : 0);
        }
    }

    public final void A04(String str, String str2) {
        11T.A0F(str2, 1);
        if (str != null) {
            QuickPerformanceLogger A00 = A00(this);
            int hashCode = str.hashCode();
            A00.markerPoint(5505076, hashCode, str2);
            if (this.A05.get(str) != null) {
                A00(this).markerPoint(231283540, hashCode, str2);
            }
        }
    }
}
