package X;

import android.view.View;
import java.util.BitSet;

/* renamed from: X.Dfs, reason: case insensitive filesystem */
/* loaded from: Dfs.class */
public final class C2164Dfs extends AbstractC2178Dg6 implements GKV {
    public int A00;
    public int A01;
    public View.OnClickListener A02;
    public REF A03;
    public C2179Dg7 A04;
    public C2180Dg8 A05;
    public Runnable A06;

    public C2164Dfs(1Iw r302) {
        super(r302);
        this.A05 = new C2180Dg8();
        this.A01 = 1;
        this.A00 = 1;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        C2180Dg8 c2180Dg8 = this.A05;
        ((EnN) c2180Dg8).A00 = this.A01;
        this.A05 = c2180Dg8;
        C2179Dg7 c2179Dg7 = this.A04;
        if (c2179Dg7 != null) {
            ((EnN) c2179Dg7).A00 = this.A00;
            this.A04 = c2179Dg7;
        }
        Ecz ecz = null;
        REF ref = this.A03;
        if (ref != null) {
            GKV gkv = ref.A00;
            gkv.A7v(C1ro.CENTER);
            ecz = new Ecz(gkv);
        }
        C1rs qb4 = new QB4(new QK4(), super.A04);
        C2180Dg8 c2180Dg82 = this.A05;
        QK4 qk4 = ((QB4) qb4).A00;
        qk4.A04 = c2180Dg82;
        BitSet bitSet = ((QB4) qb4).A02;
        bitSet.set(1);
        qk4.A03 = this.A04;
        qk4.A01 = ecz;
        qk4.A00 = this.A02;
        qk4.A05 = this.A06;
        qk4.A02 = ezJ;
        bitSet.set(0);
        return qb4;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.Dg7, X.EnN] */
    public void A0f(int i) {
        String A0D = super.A05.A0D(i);
        if (A0D == null) {
            ((ESq) this).A00 = true;
            return;
        }
        ?? enN = new EnN();
        ((EnN) enN).A02 = A0D;
        ((EnN) enN).A03 = true;
        this.A04 = enN;
    }

    public /* bridge */ /* synthetic */ void A0g(int i) {
        String A0D = super.A05.A0D(i);
        if (A0D == null) {
            ((ESq) this).A00 = true;
            return;
        }
        C2180Dg8 c2180Dg8 = this.A05;
        ((EnN) c2180Dg8).A02 = A0D;
        ((EnN) c2180Dg8).A03 = true;
    }

    public void A0h(REF ref) {
        this.A03 = ref;
    }

    public /* bridge */ /* synthetic */ void A0i(CharSequence charSequence) {
        C2180Dg8 c2180Dg8 = this.A05;
        if (charSequence == null) {
            ((ESq) this).A00 = true;
            charSequence = null;
        }
        ((EnN) c2180Dg8).A02 = charSequence;
    }
}
