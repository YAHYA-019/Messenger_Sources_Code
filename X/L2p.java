package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: L2p.class */
public final class L2p {
    public final List A00 = AnonymousClass001.A0s();

    public L2p() {
    }

    public /* synthetic */ L2p(List list, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public final int A00() {
        int A0G;
        List list = this.A00;
        if (list.size() <= 0) {
            LDN.A03("Set is empty");
            throw 0Q8.createAndThrow();
        }
        int A0G2 = DKE.A0G(list, 0);
        while (1BK.A1Y(list) && DKE.A0G(list, 0) == A0G2) {
            list.set(0, 0QD.A0F(list));
            list.remove(GOn.A0A(list, 1));
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < size2) {
                    int A0G3 = DKE.A0G(list, i2);
                    int i3 = (i2 + 1) * 2;
                    int i4 = i3 - 1;
                    int A0G4 = DKE.A0G(list, i4);
                    if (i3 >= size || (A0G = DKE.A0G(list, i3)) <= A0G4) {
                        if (A0G4 > A0G3) {
                            list.set(i2, Integer.valueOf(A0G4));
                            list.set(i4, Integer.valueOf(A0G3));
                            i = i4;
                        }
                    } else if (A0G > A0G3) {
                        list.set(i2, Integer.valueOf(A0G));
                        list.set(i3, Integer.valueOf(A0G3));
                        i = i3;
                    }
                }
            }
        }
        return A0G2;
    }

    public final void A01(int i) {
        int i2;
        int A0G;
        List list = this.A00;
        if (1BK.A1Y(list) && (DKE.A0G(list, 0) == i || DKE.A0G(list, AnonymousClass001.A04(list)) == i)) {
            return;
        }
        int size = list.size();
        Integer valueOf = Integer.valueOf(i);
        list.add(valueOf);
        while (size > 0 && i > (A0G = DKE.A0G(list, ((size + 1) >>> 1) - 1))) {
            list.set(size, Integer.valueOf(A0G));
            size = i2;
        }
        list.set(size, valueOf);
    }
}
