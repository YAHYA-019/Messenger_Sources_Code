package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Jv1.class */
public final class Jv1 extends 1LV {
    public static final AtomicInteger A01 = DKD.A14();
    public final LightweightQuickPerformanceLogger A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Jv1(com.facebook.quicklog.LightweightQuickPerformanceLogger r302, X.1Lq r303) {
        /*
            r301 = this;
            r0 = r303
            r1 = 2
            X.11T.A0F(r0, r1)
            r0 = r303
            java.lang.String[] r0 = r0.events
            r304 = r0
            r0 = r304
            int r0 = r0.length
            r305 = r0
            r0 = r304
            r1 = r305
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r306 = r0
            r0 = r301
            r1 = r306
            r0.<init>(r1)
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jv1.<init>(com.facebook.quicklog.LightweightQuickPerformanceLogger, X.1Lq):void");
    }

    public static final KOH A01(String str) {
        switch (str.hashCode()) {
            case -1298290464:
                if (str.equals("Litho.Resolve.ComponentRendered")) {
                    return KOH.A03;
                }
                return null;
            case 238438621:
                if (str.equals("RenderCore.RenderUnit.Mounted")) {
                    return KOH.A02;
                }
                return null;
            case 542663853:
                if (str.equals("Litho.ComponentTree.Layout")) {
                    return KOH.A04;
                }
                return null;
            case 781732041:
                if (str.equals("Litho.ComponentTree.Resolve")) {
                    return KOH.A05;
                }
                return null;
            default:
                return null;
        }
    }

    public void A02(JSi jSi) {
        KOH A012;
        if (!(jSi instanceof Jux) || (A012 = A01(jSi.A03)) == null) {
            return;
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        int i = A012.id;
        java.util.Map map = jSi.A04;
        Object obj = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        EventBuilder markEventBuilder = lightweightQuickPerformanceLogger.markEventBuilder(i, (String) (obj != null ? obj : "unknown"));
        String[] strArr = A012.attrs;
        int length = strArr.length;
        int i2 = 0;
        if (length == 0) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                markEventBuilder.annotate(AnonymousClass001.A0j(A0z), String.valueOf(A0z.getValue()));
            }
            markEventBuilder.annotate("thread", jSi.A02);
            markEventBuilder.report();
        }
        do {
            String str = strArr[i2];
            markEventBuilder.annotate(str, String.valueOf(map.get(str)));
            i2++;
        } while (i2 < length);
        markEventBuilder.annotate("thread", jSi.A02);
        markEventBuilder.report();
    }

    public /* bridge */ /* synthetic */ Kt7 A03(String str) {
        KOH A012 = A01(str);
        Kt7 kt7 = null;
        if (A012 != null) {
            int andIncrement = A01.getAndIncrement();
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            lightweightQuickPerformanceLogger.markerStart(A012.id, andIncrement, -1, TimeUnit.MILLISECONDS);
            if (lightweightQuickPerformanceLogger.isMarkerOn(A012.id, andIncrement, false)) {
                kt7 = new Kt7(A012, andIncrement);
            }
        }
        return kt7;
    }

    public /* bridge */ /* synthetic */ void A04(JSk jSk, Object obj) {
        Kt7 kt7 = (Kt7) obj;
        if (kt7 != null) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            KOH koh = kt7.A01;
            int i = koh.id;
            int i2 = kt7.A00;
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "thread", ((JSi) jSk).A02);
            lightweightQuickPerformanceLogger.markerAnnotate(koh.id, i2, "duration", TimeUnit.NANOSECONDS.toMillis(jSk.A00));
            String[] strArr = koh.attrs;
            int length = strArr.length;
            int i3 = 0;
            if (length == 0) {
                Iterator A0y = AnonymousClass001.A0y(((JSi) jSk).A04);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    lightweightQuickPerformanceLogger.markerAnnotate(koh.id, i2, AnonymousClass001.A0j(A0z), String.valueOf(A0z.getValue()));
                }
                lightweightQuickPerformanceLogger.markerAnnotate(koh.id, i2, "asl_session_id", C0ft.A02());
                lightweightQuickPerformanceLogger.markerEnd(koh.id, i2, (short) 2);
            }
            do {
                String str = strArr[i3];
                lightweightQuickPerformanceLogger.markerAnnotate(koh.id, i2, str, String.valueOf(((JSi) jSk).A04.get(str)));
                i3++;
            } while (i3 < length);
            lightweightQuickPerformanceLogger.markerAnnotate(koh.id, i2, "asl_session_id", C0ft.A02());
            lightweightQuickPerformanceLogger.markerEnd(koh.id, i2, (short) 2);
        }
    }
}
