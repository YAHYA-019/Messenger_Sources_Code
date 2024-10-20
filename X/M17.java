package X;

import android.os.Handler;

/* loaded from: M17.class */
public final class M17 extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M17(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A06 = str;
        this.A05 = obj4;
        this.A02 = obj5;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        String str;
        if (this.A00 != 0) {
            C88u c88u = (C88u) this.A05;
            if (c88u.A02 && (str = c88u.A00) != null && str.length() != 0) {
                C2lh c2lh = (C2lh) this.A04;
                C2lh c2lh2 = (C2lh) this.A02;
                c2lh.A04(new ARE(c2lh2, c88u, this.A06, 1));
                if (AnonymousClass001.A03(c2lh2.A02) < 6) {
                    ((Handler) this.A03).postDelayed((Runnable) this.A01, 4000L);
                }
            }
            return new C4FP(new AQc(this.A01, this.A03, 48));
        }
        LNn lNn = (LNn) this.A01;
        MHv mHv = (MHv) this.A04;
        MJx mJx = (MJx) this.A03;
        String str2 = this.A06;
        Object obj = this.A05;
        Object[] objArr = (Object[]) this.A02;
        boolean z2 = true;
        if (lNn.A01 != mJx) {
            lNn.A01 = mJx;
            z = true;
        } else {
            z = false;
        }
        if (11T.A0O(lNn.A04, str2)) {
            z2 = z;
        } else {
            lNn.A04 = str2;
        }
        lNn.A02 = mHv;
        lNn.A03 = obj;
        lNn.A05 = objArr;
        MEG meg = lNn.A00;
        if (meg != null && z2) {
            meg.D5s();
            lNn.A00 = null;
            LNn.A00(lNn);
        }
        return 04S.A00;
    }
}
