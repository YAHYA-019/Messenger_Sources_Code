package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: E8h.class */
public final class E8h extends 25G implements C1rk {
    public static final 29I A0B = new Fqb();
    public static final 29I A0C = new Fqc();
    public static final 29I A0D = new Fqd();
    public static final 29I A0E = new Fqe();
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public View.OnClickListener A04;
    public DLQ A05;
    public EkE A06;
    public boolean A07;
    public boolean A08;
    public final long A09;
    public final FyG A0A;

    /* JADX WARN: Type inference failed for: r0v27, types: [X.EkE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.29I, java.lang.Object] */
    public E8h(FyG fyG, long j, boolean z) {
        super(0S2.A01);
        this.A09 = j;
        this.A00 = -1;
        this.A07 = true;
        29L[] r0 = {DKC.A0d(A0B, this), DKC.A0d(A0C, this), DKC.A0d(A0E, this), DKC.A0d(A0D, this)};
        int i = 0;
        do {
            A0E(r0[i]);
            i++;
        } while (i < 4);
        this.A01 = 0;
        this.A06 = new Object();
        this.A0A = fyG;
        29L[] r02 = {DKC.A0d(new Fr7(this.A09), this), DKC.A0d((29I) new Object(), this)};
        int i2 = 0;
        do {
            A0E(r02[i2]);
            i2++;
        } while (i2 < 2);
        if (z) {
            return;
        }
        DKD.A1J(new Fqz(this), this);
    }

    public long A0I() {
        return this.A09;
    }

    public C1rk A0J() {
        return this;
    }

    @Override // X.C1rk
    public /* synthetic */ boolean ADe() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.E8c, android.view.View, java.lang.Object, X.E8Z] */
    @Override // X.C1rk
    public /* bridge */ /* synthetic */ Object AJK(Context context) {
        11T.A0F(context, 1);
        ?? e8c = new E8c(context);
        e8c.A00 = new Equ(e8c);
        return e8c;
    }

    @Override // X.C1rk
    public /* synthetic */ Object B3t() {
        return getClass();
    }

    @Override // X.C1rk
    public /* synthetic */ 1Ii B3u() {
        return C29N.A00;
    }

    @Override // X.C1rk
    public /* synthetic */ C3m7 Brt(int i) {
        return C2m5.A00(this, i);
    }

    @Override // X.C1rk
    public /* synthetic */ int CXj() {
        return 3;
    }
}
