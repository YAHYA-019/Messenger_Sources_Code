package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: I7z.class */
public final class I7z {
    public static QuickPerformanceLogger A00;
    public static final I7z A01 = new Object();

    public static final void A00() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(805185511, (short) 87);
        }
        A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r306 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(android.content.Context r302, X.I4m r303, java.lang.String r304) {
        /*
            r301 = this;
            r0 = r303
            android.net.Uri r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L17
            r0 = r305
            java.lang.String r0 = r0.toString()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L39
        L17:
            r0 = r303
            int r0 = r0.A00
            r307 = r0
            r0 = r302
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L34
            r305 = r0
            r0 = r305
            r1 = r307
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L34
            r306 = r0
            r0 = r306
            X.11T.A0D(r0)     // Catch: android.content.res.Resources.NotFoundException -> L34
            goto L39
        L34:
            java.lang.String r0 = "Unknown"
            r306 = r0
        L39:
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.I7z.A00
            r308 = r0
            r0 = 805185511(0x2ffe27e7, float:4.6230683E-10)
            r309 = r0
            r0 = r308
            if (r0 == 0) goto L58
            java.lang.String r0 = "LastToneName"
            r305 = r0
            r0 = r308
            r1 = r309
            r2 = r305
            r3 = r306
            r0.markerAnnotate(r1, r2, r3)
        L58:
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.I7z.A00
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L72
            java.lang.String r0 = "PlayerName"
            r305 = r0
            r0 = r308
            r1 = r309
            r2 = r305
            r3 = r304
            r0.markerAnnotate(r1, r2, r3)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7z.A01(android.content.Context, X.I4m, java.lang.String):void");
    }
}
