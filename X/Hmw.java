package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Hmw.class */
public final class Hmw {
    public final 1Br A00 = 7zM.A0S();

    public final void A00(PlayerOrigin playerOrigin, String str, java.util.Map map, int i) {
        C00j.A05("FbGrootTransitionPerfLogger.startTransitionMarker", -847169685);
        try {
            C00i c00i = this.A00.A00;
            QuickPerformanceLogger A0V = 1BK.A0V(c00i);
            int i2 = 0;
            int length = str.length();
            if (length != 0) {
                i2 = str.hashCode();
            }
            if (!A0V.isMarkerOn(i, i2)) {
                QuickPerformanceLogger A0V2 = 1BK.A0V(c00i);
                int i3 = 0;
                if (length != 0) {
                    i3 = str.hashCode();
                }
                A0V2.markerStart(i, i3);
            }
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                String A0j = AnonymousClass001.A0j(A0z);
                String A16 = 1BK.A16(A0z);
                QuickPerformanceLogger A0V3 = 1BK.A0V(c00i);
                int i4 = 0;
                if (length != 0) {
                    i4 = str.hashCode();
                }
                A0V3.markerAnnotate(i, i4, A0j, A16);
            }
            if (!map.containsKey("upstreamPlayerSource")) {
                QuickPerformanceLogger A0V4 = 1BK.A0V(c00i);
                int i5 = 0;
                if (length != 0) {
                    i5 = str.hashCode();
                }
                A0V4.markerAnnotate(i, i5, "upstreamPlayerSource", playerOrigin.A00);
            }
            C00j.A01(-1413377814);
        } catch (Throwable th) {
            C00j.A01(1879090623);
            throw th;
        }
    }
}
