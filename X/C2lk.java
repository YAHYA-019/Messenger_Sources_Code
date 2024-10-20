package X;

import android.content.Context;

/* renamed from: X.2lk, reason: invalid class name */
/* loaded from: 2lk.class */
public final class C2lk implements C1rk {
    public final int A00;
    public final 1Ii A01;
    public final C2li A02;
    public final Integer A03;
    public final boolean A04;

    public C2lk(1Ii r302, C2li c2li, int i, boolean z) {
        11T.A0F(r302, 3);
        this.A00 = i;
        this.A04 = z;
        this.A01 = r302;
        this.A02 = c2li;
        this.A03 = 0S2.A01;
    }

    @Override // X.C1rk
    public boolean ADe() {
        return this.A04;
    }

    @Override // X.C1rk
    public /* bridge */ /* synthetic */ Object AJK(Context context) {
        11T.A0F(context, 0);
        return this.A02.A7y(context);
    }

    @Override // X.C1rk
    public Object B3t() {
        return this.A02.getClass();
    }

    @Override // X.C1rk
    public 1Ii B3u() {
        return this.A01;
    }

    @Override // X.C1rk
    public Integer B6x() {
        return this.A03;
    }

    @Override // X.C1rk
    public /* synthetic */ C3m7 Brt(int i) {
        return C2m5.A00(this, i);
    }

    @Override // X.C1rk
    public int CXj() {
        return this.A00;
    }
}
