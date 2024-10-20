package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: L0y.class */
public final class L0y {
    public final long A00;
    public final MMu A01;
    public final MNH A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ LazyListState A08;
    public final /* synthetic */ MNH A09;
    public final /* synthetic */ AXO A0A;
    public final /* synthetic */ MBV A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public L0y(MMu mMu, LazyListState lazyListState, MNH mnh, AXO axo, MBV mbv, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        int i5;
        int A00;
        this.A0C = z;
        this.A09 = mnh;
        this.A05 = i;
        this.A06 = i2;
        this.A0A = axo;
        this.A0B = mbv;
        this.A0D = z2;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = j2;
        this.A08 = lazyListState;
        this.A01 = mMu;
        this.A02 = mnh;
        if (z) {
            i5 = Constraints.A01(j);
            A00 = (-1) >>> 1;
        } else {
            i5 = (-1) >>> 1;
            A00 = Constraints.A00(j);
        }
        this.A00 = LCY.A02(0, i5, 0, A00);
    }

    public static final LN8 A00(L0y l0y, int i, long j) {
        MMu mMu = l0y.A01;
        Object Asl = mMu.Asl(i);
        Object AeO = mMu.AeO(i);
        LPF lpf = l0y.A02;
        HashMap hashMap = lpf.A03;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) hashMap.get(valueOf);
        List list2 = list;
        if (list == null) {
            MJL mjl = lpf.A01;
            Object Asl2 = mjl.Asl(i);
            List D3A = lpf.A02.D3A(Asl2, lpf.A00.A01(Asl2, mjl.AeO(i), i));
            int size = D3A.size();
            ArrayList A0t = AnonymousClass001.A0t(size);
            int i2 = 0;
            while (i2 < size) {
                i2 = MNG.A00(A0t, D3A, i2, j);
            }
            hashMap.put(valueOf, A0t);
            list2 = A0t;
        }
        return new LN8(l0y.A08.A0D, l0y.A0A, l0y.A0B, l0y.A09.AtT(), Asl, AeO, list2, i, i == l0y.A05 + (-1) ? 0 : l0y.A06, l0y.A07, l0y.A0C, l0y.A0D);
    }
}
