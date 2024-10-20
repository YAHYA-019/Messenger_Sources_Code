package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.List;

/* loaded from: E8i.class */
public final class E8i extends 25G implements C1rk {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Rect A04;
    public 2NI A05;
    public 3wX A06;
    public Eg2 A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public final Eg1 A0C;
    public final DSj A0D;
    public final long A0E;
    public static final 29I A0F = new Fqj();
    public static final 29I A0M = new Fqk();
    public static final 29I A0Q = new Fql();
    public static final 29I A0R = new Fqm();
    public static final 29I A0K = new Fqn();
    public static final 29I A0J = new Fqo();
    public static final 29I A0L = new Fqp();
    public static final 29I A0G = new Fqq();
    public static final 29I A0O = new Fqr();
    public static final 29I A0H = new Fqf();
    public static final 29I A0P = new Fqg();
    public static final 29I A0I = new Fqh();
    public static final 29I A0N = new Fqi();

    public E8i(Eg1 eg1, DSj dSj, long j) {
        super(0S2.A01);
        this.A00 = 0;
        this.A02 = 0;
        this.A0B = true;
        this.A0A = true;
        this.A0E = j;
        this.A0D = dSj;
        this.A0C = eg1;
        29L[] r0 = {DKC.A0d(A0M, this), DKC.A0d(A0F, this), DKC.A0d(A0Q, this), DKC.A0d(A0R, this), DKC.A0d(A0K, this), DKC.A0d(A0J, this), DKC.A0d(A0L, this), DKC.A0d(A0G, this), DKC.A0d(A0O, this), DKC.A0d(A0H, this), DKC.A0d(A0P, this), DKC.A0d(A0I, this), DKC.A0d(A0N, this)};
        int i = 0;
        do {
            A0E(r0[i]);
            i++;
        } while (i < 13);
    }

    public boolean A0F() {
        return true;
    }

    public long A0I() {
        return this.A0E;
    }

    public C1rk A0J() {
        return this;
    }

    public void A0K(2O4 r302) {
        List list = this.A09;
        if (list == null) {
            list = AnonymousClass001.A0t(4);
            this.A09 = list;
        }
        list.add(r302);
    }

    @Override // X.C1rk
    public /* synthetic */ boolean ADe() {
        return false;
    }

    @Override // X.C1rk
    public /* bridge */ /* synthetic */ Object AJK(Context context) {
        return new 33N(context);
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
