package X;

import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.4hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hs.class */
public abstract class AbstractC06744hs {
    public static final 0CS A00;

    static {
        ArrayList arrayList = new ArrayList(4);
        Collections.addAll(arrayList, 2, 7, 4, 5);
        A00 = arrayList;
    }

    public static final int A00(C02353ux c02353ux, C2rD c2rD, 2Ds r303, boolean z) {
        int i;
        int i2;
        if (z && c02353ux != null) {
            int A02 = A02(c2rD, r303);
            0CS r0 = A00;
            2Ds.A03(r303);
            int A01 = r0.contains(Integer.valueOf(r303.A00)) ? A01(c2rD, r303) : 0;
            if (A02 == 90 || A02 == 270 || A01 == 5 || A01 == 7) {
                2Ds.A03(r303);
                i = r303.A01;
                2Ds.A03(r303);
                i2 = r303.A05;
            } else {
                2Ds.A03(r303);
                i = r303.A05;
                2Ds.A03(r303);
                i2 = r303.A01;
            }
            float f = i;
            float f2 = i2;
            float max = Math.max(c02353ux.A03 / f, c02353ux.A02 / f2);
            float f3 = f * max;
            float f4 = c02353ux.A00;
            if (f3 > f4) {
                max = f4 / f;
            }
            if (f2 * max > f4) {
                max = f4 / f2;
            }
            int i3 = (int) (c02353ux.A01 + (max * 8.0f));
            if (i3 <= 8) {
                if (i3 >= 1) {
                    return i3;
                }
                return 1;
            }
        }
        return 8;
    }

    public static final int A01(C2rD c2rD, 2Ds r302) {
        2Ds.A03(r302);
        int i = r302.A00;
        0CS r0 = A00;
        int indexOf = r0.indexOf(Integer.valueOf(i));
        int i2 = 0;
        if (indexOf < 0) {
            throw AnonymousClass001.A0L("Only accepts inverted exif orientations");
        }
        int i3 = c2rD.A00;
        if (i3 != -1) {
            i2 = i3;
        }
        Object obj = r0.get((indexOf + (i2 / 90)) % r0.size());
        11T.A0A(obj);
        return AnonymousClass001.A03(obj);
    }

    public static final int A02(C2rD c2rD, 2Ds r302) {
        int i = 0;
        int i2 = c2rD.A00;
        if (i2 != -2) {
            2Ds.A03(r302);
            int i3 = r302.A02;
            if (i3 == 90 || i3 == 180 || i3 == 270) {
                2Ds.A03(r302);
                i = r302.A02;
            } else {
                i = 0;
            }
            if (i2 != -1) {
                i = (i + i2) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
            }
        }
        return i;
    }
}
