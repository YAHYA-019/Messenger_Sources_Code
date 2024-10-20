package X;

/* renamed from: X.Jcp, reason: case insensitive filesystem */
/* loaded from: Jcp.class */
public final class C2903Jcp extends LPR implements MNa, MNW, ME8 {
    public static final KUD A02 = new Object();
    public MBR A00;
    public boolean A01;

    public static final L5L A00(C2903Jcp c2903Jcp, MKq mKq, C00m c00m) {
        L5L l5l;
        L5L l5l2 = null;
        if (((LPR) c2903Jcp).A08 && c2903Jcp.A01) {
            AbstractC2938JdR A03 = LDX.A03(c2903Jcp);
            if (mKq.BQl() && (l5l = (L5L) c00m.invoke()) != null) {
                L5L BZ3 = A03.BZ3(mKq, false);
                l5l2 = l5l.A02(KvH.A00(BZ3.A01, BZ3.A03));
            }
        }
        return l5l2;
    }

    @Override // X.ME8
    public Object ACX(MKq mKq, 0DR r303, C00m c00m) {
        Object A00 = 2aG.A00(r303, new AJg(mKq, this, new 85O(3, c00m, mKq, this), c00m, (0DR) null, 2, 42));
        if (A00 != 0Ds.A02) {
            A00 = 04S.A00;
        }
        return A00;
    }

    @Override // X.MNa
    public Object BGy() {
        return A02;
    }

    public void CBt(MKq mKq) {
        this.A01 = true;
    }

    public /* synthetic */ void CGF(long j) {
    }
}
