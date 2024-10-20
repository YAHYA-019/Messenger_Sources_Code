package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.737, reason: invalid class name */
/* loaded from: 737.class */
public final class AnonymousClass737 implements 6xM {
    public HashSet A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7CF.class, C6zq.class, 7An.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "DrawerPlugin";
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.78L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [X.78L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r311v1, types: [X.78L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r311v4, types: [X.78L, java.lang.Object] */
    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        ImmutableList immutableList;
        78L r311;
        7Ab a5u;
        if (r305 instanceof 7CF) {
            if (!this.A01) {
                this.A01 = true;
            }
            7CF r0 = (7CF) r305;
            78S AUP = c77n.AUP(78S.class);
            11T.A0F(r304, 0);
            11T.A0F(r0, 2);
            11T.A0F(AUP, 3);
            boolean z = AUP.A01;
            if (!z) {
                1Iw r02 = r0.A00;
                String str = r0.A01;
                if (r02 == null || str == null) {
                    ?? obj = new Object();
                    ((78L) obj).A01 = z;
                    ((78L) obj).A00 = AUP.A00;
                    ((78L) obj).A01 = true;
                    c77n.ClL(new 78S((78L) obj));
                    C98a c98a = C98a.A02;
                    A6H a6h = C7yw.A00;
                    11T.A0B(a6h);
                    ImmutableMap immutableMap = RegularImmutableMap.A03;
                    11T.A0A(immutableMap);
                    a5u = new A5u(c98a, a6h, immutableMap);
                } else {
                    a5u = new 7Ab(r02, str);
                }
                7FI.A02(r304, (6Sh) a5u);
                return;
            }
            ?? obj2 = new Object();
            ((78L) obj2).A01 = z;
            immutableList = AUP.A00;
            r311 = obj2;
        } else {
            if (!(r305 instanceof C6zq)) {
                if (r305 instanceof 7An) {
                    if (!this.A01) {
                        this.A01 = true;
                    }
                    78S AUP2 = c77n.AUP(78S.class);
                    11T.A0F(r304, 0);
                    11T.A0F(AUP2, 2);
                    boolean z2 = AUP2.A01;
                    if (z2) {
                        ?? obj3 = new Object();
                        ((78L) obj3).A01 = z2;
                        ((78L) obj3).A00 = AUP2.A00;
                        ((78L) obj3).A01 = false;
                        c77n.ClL(new 78S((78L) obj3));
                        7FI.A00(r304);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.A01) {
                this.A01 = true;
            }
            78S AUP3 = c77n.AUP(78S.class);
            11T.A0F(AUP3, 1);
            ?? obj4 = new Object();
            ((78L) obj4).A01 = AUP3.A01;
            immutableList = AUP3.A00;
            r311 = obj4;
        }
        r311.A00 = immutableList;
        r311.A01 = false;
        c77n.ClL(new 78S(r311));
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
