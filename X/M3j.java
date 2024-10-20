package X;

import android.graphics.Path;
import kotlin.jvm.functions.Function1;

/* loaded from: M3j.class */
public abstract class M3j extends C00q implements Function1 {
    public static void A00(Object obj, int i, Object obj2, int i2, int i3) {
        if (i == 0) {
            L8T.A02((L8T) obj2, (L56) obj, Kbe.A01, i2, i3);
            return;
        }
        Kth kth = (Kth) obj2;
        LOR lor = (MLe) obj;
        LPk lPk = kth.A06;
        int i4 = kth.A05;
        int i5 = kth.A04;
        int A02 = 07C.A02(i3, i4, i5) - i4;
        int A022 = 07C.A02(i2, i4, i5) - i4;
        LPk lPk2 = lPk;
        if (A02 < 0 || A02 > A022 || A022 > lPk2.A03.length()) {
            throw AnonymousClass001.A0L(0Pz.A0y("start(", ") or end(", ") is out of range [0..", "], or start > end!", A02, A022, lPk2.A03.length()));
        }
        Path A0B = DKC.A0B();
        LAI lai = lPk2.A01;
        lai.A09.getSelectionPath(A02, A022, A0B);
        int i6 = lai.A06;
        if (i6 != 0 && !A0B.isEmpty()) {
            A0B.offset(0.0f, i6);
        }
        LOR lor2 = new LOR(A0B);
        lor2.A01(KvH.A00(0.0f, kth.A01));
        lor.A03.addPath(lor2.A03, DKH.A00(0L), Float.intBitsToFloat(0));
    }
}
