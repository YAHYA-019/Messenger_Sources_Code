package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Dfg, reason: case insensitive filesystem */
/* loaded from: Dfg.class */
public final class C2152Dfg extends AbstractC2178Dg6 {
    public int A00;
    public int A01;
    public Drawable A02;
    public EP4 A03;
    public F6u A04;
    public CharSequence A05;
    public Integer A06;
    public Integer A07;
    public boolean A08;
    public final C1qo A09;

    public C2152Dfg(1Iw r302) {
        super(r302);
        C1qo c1qo = r302.A0E;
        11T.A0A(c1qo);
        this.A09 = c1qo;
        this.A04 = F6u.A0I;
        this.A08 = true;
        this.A07 = 0S2.A00;
    }

    @Override // X.AbstractC2178Dg6
    public /* bridge */ /* synthetic */ AbstractC2178Dg6 A0K(C26z c26z, int i) {
        A0j(c26z, i);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0156, code lost:
    
        if (r0 == X.0S2.A0j) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023f, code lost:
    
        if (r324 > 1.0f) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0513  */
    @Override // X.AbstractC2178Dg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1rs A0N(X.EzJ r302) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2152Dfg.A0N(X.EzJ):X.1rs");
    }

    public C2152Dfg A0f(int i) {
        String A0D = this.A09.A0D(i);
        if (A0D != null) {
            this.A05 = A0D;
        }
        return this;
    }

    public final void A0g(F6u f6u) {
        this.A04 = f6u;
    }

    public void A0h(C26z c26z, float f) {
        11T.A0F(c26z, 0);
        A0j(c26z, this.A09.A02(f));
    }

    public void A0i(C26z c26z, float f) {
        AbstractC2178Dg6.A0B(this, super.A05, c26z, f);
    }

    public void A0j(C26z c26z, int i) {
        int A0C = DKE.A0C(c26z);
        if (A0C == 1) {
            this.A01 = i;
            return;
        }
        if (A0C != 3) {
            if (A0C != 7) {
                if (A0C == 8) {
                    this.A01 = i;
                    this.A00 = i;
                    super.A0K(C26z.START, i);
                    c26z = C26z.END;
                }
                super.A0K(c26z, i);
                return;
            }
            this.A01 = i;
        }
        this.A00 = i;
    }

    public void A0k(C26z c26z, int i) {
        A0j(c26z, this.A09.A06(i));
    }

    @Override // X.AbstractC2178Dg6
    public int AZ1(EzJ ezJ) {
        11T.A0F(ezJ, 0);
        1Iw r0 = super.A04;
        FAL fal = ezJ.A04;
        EP4 ep4 = this.A03;
        if (ep4 != null) {
            return Qzg.A00(fal, ep4, r0);
        }
        throw 1BK.A0h();
    }
}
