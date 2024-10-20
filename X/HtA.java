package X;

import android.media.MediaCodecInfo;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.ArrayList;

/* loaded from: HtA.class */
public final class HtA {
    public final ArrayList A00(Hqj hqj, I9d i9d, Hqo hqo) {
        return A01(hqj, i9d, hqo, 1280, 2600000, 10, false);
    }

    public final ArrayList A01(Hqj hqj, I9d i9d, Hqo hqo, int i, int i2, int i3, boolean z) {
        boolean z2;
        I4h i4h;
        int i4 = i;
        ArrayList A0z = 7zO.A0z(hqo, 1);
        MediaCodecInfo.CodecCapabilities A00 = ICy.A00();
        int max = (A00 == null || A00.getVideoCapabilities() == null) ? (-1) >>> 1 : Math.max(GOp.A04(A00.getVideoCapabilities().getSupportedHeights()), GOp.A04(A00.getVideoCapabilities().getSupportedWidths()));
        JKc jKc = hqo.A0Y;
        if (i2 > 0 && jKc != null && hqj != null) {
            if (max < i4 && hqo.A01.A07()) {
                i4 = max;
            }
            I7N i7n = new I7N(i4, i2, i3, z);
            Hv3 hv3 = hqo.A01;
            I8v A02 = ICy.A02(hqj, hqo.A0Q, i7n, i9d, hv3.A0K(), hv3.A07());
            if (hqo.A0c) {
                i4h = new I4h(A02, QpB.A02, false, false);
            } else {
                boolean z3 = true;
                long j = hqo.A06;
                if (j < 0) {
                    j = 0;
                }
                long j2 = hqo.A05;
                if (j2 < 0) {
                    j2 = hqj.A07;
                }
                long j3 = j2 - j;
                if (j3 <= 0) {
                    j3 = -1;
                }
                boolean AZk = hv3 instanceof H3x ? 1BK.A0N(((H3x) hv3).A00.A01).AZk(36327018073249702L) : false;
                if (!jKc.ADq() || AZk) {
                    z2 = false;
                } else {
                    z2 = GOp.A1U((j3 > LocationComponentOptions.STALE_STATE_DELAY_MS ? 1 : (j3 == LocationComponentOptions.STALE_STATE_DELAY_MS ? 0 : -1)));
                    if (j3 <= LocationComponentOptions.STALE_STATE_DELAY_MS) {
                        z3 = false;
                    }
                }
                i4h = new I4h(A02, QpB.A05, z2, z3);
            }
            A0z.add(i4h);
        }
        A0z.addAll(A02(i9d, hqo));
        return A0z;
    }

    public final ArrayList A02(I9d i9d, Hqo hqo) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (hqo.A01.A0O() && RiE.A05(i9d, hqo)) {
            A0s.add(new I4h(null, QpB.A02, false, false));
        }
        if (RiE.A06(i9d, hqo)) {
            A0s.add(new I4h(null, QpB.A03, false, false));
        }
        return A0s;
    }
}
