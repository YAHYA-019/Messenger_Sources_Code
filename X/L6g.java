package X;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: L6g.class */
public abstract class L6g {
    public static final Set A00 = Collections.emptySet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.Set] */
    public static LaS A00(5Lo r301, C6W0 c6w0, String str, boolean z, boolean z2, boolean z3) {
        HashSet A0v;
        if (r301 == null) {
            return null;
        }
        List A002 = L0w.A00(c6w0.A0R);
        if (!A002.isEmpty()) {
            A0v = AnonymousClass001.A0v();
            int size = A002.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                DrmInitData drmInitData = ((6Cu) A002.get(i2)).A03.A0O;
                if (drmInitData != null) {
                    for (DrmInitData.SchemeData schemeData : drmInitData.A03) {
                        if (schemeData.A04 != null) {
                            A0v.add(schemeData.A03);
                        }
                    }
                }
                i = i2 + 1;
            }
        } else {
            A0v = A00;
        }
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            C51f.A01("DrmSessionManagerHelper", "DRM scheme %s for vid=%s", it.next().toString(), str);
        }
        if (A0v.isEmpty()) {
            C51f.A01("DrmSessionManagerHelper", "Not a protected video for vid=%s", str);
            return null;
        }
        if (A0v.contains(6Za.A04)) {
            return A01(new LaY(r301, str, z, z2, z3));
        }
        throw new 5Mq();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.MFu] */
    public static LaS A01(MCi mCi) {
        boolean A02 = 5N4.A02(5N3.A1M);
        HashMap A0u = AnonymousClass001.A0u();
        UUID uuid = 6Za.A04;
        Object obj = LaX.A03;
        6ZF r0 = new 6ZF(-1);
        int[] iArr = new int[0];
        String str = "";
        if (A02) {
            obj = new Object();
            uuid.getClass();
        } else {
            uuid.getClass();
            obj.getClass();
            str = "L3";
        }
        return new LaS(obj, mCi, r0, str, A0u, uuid, iArr);
    }
}
