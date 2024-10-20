package X;

import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.2gv, reason: invalid class name */
/* loaded from: 2gv.class */
public final class C2gv extends 2UP {
    public static final StaticUnitConfig A06 = new StaticUnitConfig(0S2.A0Y, "128950834329188", 2T7.A00("128950834329188"), true);
    public final 3xN A00;
    public final C2gy A01;
    public final HeterogeneousMap A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final ImmutableList A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2gv(StaticUnitConfig staticUnitConfig, 3xN r303, C2gy c2gy, HeterogeneousMap heterogeneousMap, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3) {
        super((C2gu) null, staticUnitConfig);
        11T.A0F(staticUnitConfig, 1);
        this.A01 = c2gy;
        this.A00 = r303;
        this.A02 = heterogeneousMap;
        if (immutableList == null) {
            immutableList = ImmutableList.of();
            11T.A0A(immutableList);
        }
        this.A03 = immutableList;
        if (immutableList2 == null) {
            immutableList2 = ImmutableList.of();
            11T.A0A(immutableList2);
        }
        this.A04 = immutableList2;
        if (immutableList3 == null) {
            immutableList3 = ImmutableList.of();
            11T.A0A(immutableList3);
        }
        this.A05 = immutableList3;
    }

    public 2hJ AsW() {
        return 2hJ.A0c;
    }

    public String BKC() {
        return "MONTAGE_AND_ACTIVE_NOW";
    }

    public boolean BMu() {
        return !this.A03.isEmpty();
    }

    public void BP7(int i) {
        super/*X.2UQ*/.BP7(i);
        1Du it = this.A03.iterator();
        while (it.hasNext()) {
            ((2UQ) it.next()).BP7(i);
        }
    }

    public void BPB(int i) {
        super/*X.2UQ*/.BPB(i);
        C2gy c2gy = this.A01;
        if (c2gy != null) {
            c2gy.BPB(i);
        }
        1Du it = this.A03.iterator();
        while (it.hasNext()) {
            ((2UQ) it.next()).BPB(i);
        }
    }

    public boolean BVb(2UR r302) {
        11T.A0F(r302, 0);
        boolean z = false;
        if (!11T.A0O(r302.getClass(), C2gv.class)) {
            return false;
        }
        C2gv c2gv = (C2gv) r302;
        ImmutableList immutableList = this.A03;
        ImmutableList immutableList2 = c2gv.A03;
        11T.A0F(immutableList, 0);
        11T.A0F(immutableList2, 1);
        if (immutableList.size() == immutableList2.size()) {
            Collection A07 = 07C.A07(0, immutableList.size());
            if (!(A07 instanceof Collection) || !A07.isEmpty()) {
                07I it = A07.iterator();
                while (it.hasNext()) {
                    int A00 = it.A00();
                    2UR r0 = (2UR) immutableList.get(A00);
                    Object obj = immutableList2.get(A00);
                    11T.A0A(obj);
                    if (!r0.BVb((2UR) obj)) {
                        return false;
                    }
                }
            }
            if (11T.A0O(this.A04, c2gv.A04) && 11T.A0O(this.A01, c2gv.A01) && 11T.A0O(this.A05, c2gv.A05)) {
                z = true;
            }
        }
        return z;
    }
}
