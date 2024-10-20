package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.Dfq, reason: case insensitive filesystem */
/* loaded from: Dfq.class */
public abstract class AbstractC2162Dfq extends AbstractC2178Dg6 implements GLn {
    public FF6 A00;
    public ERE A01;
    public ENn A02;
    public ENu A03;
    public ENO A04;
    public F6n A05;
    public 1Im A06;
    public CharSequence A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public static final ERC A0D = ERC.A03;
    public static final FFO A0C = new EvX(0S2.A00).A00();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2162Dfq(1Iw r302) {
        super(r302);
        11T.A0F(r302, 1);
        this.A05 = F6n.A0C;
        this.A0A = true;
        this.A04 = ENO.A03;
        this.A02 = ENn.A03;
        this.A03 = ENu.A02;
        this.A01 = ERE.A01;
    }

    private final Drawable A00(FF6 ff6, ERC erc, ERE ere, 1Iw r305) {
        Fcg fcg;
        Drawable drawable = null;
        if (ff6 != null && (fcg = (Fcg) 1Br.A0B(A0M().A03)) != null) {
            Context context = r305.A0D;
            3Eh r0 = ff6.A00;
            if (r0 == null) {
                return fcg.A07(context, erc, ere, ff6.A01);
            }
            drawable = fcg.A06(context, r0, erc, ere);
        }
        return drawable;
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0J(int i) {
        this.A07 = 4YU.A0E(super.A04).getString(i);
        return this;
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0L(CharSequence charSequence) {
        this.A07 = charSequence;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x05fd, code lost:
    
        if (r0 == X.ENu.A03) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d9  */
    /* JADX WARN: Type inference failed for: r0v261, types: [java.lang.CharSequence] */
    @Override // X.AbstractC2178Dg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1rs A0N(X.EzJ r302) {
        /*
            Method dump skipped, instructions count: 1663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2162Dfq.A0N(X.EzJ):X.1rs");
    }

    public final void A0f(int i) {
        this.A08 = super.A05.A0D(i);
        this.A09 = true;
    }

    public final void A0g(3Eh r302) {
        this.A00 = A0I(r302);
    }

    public final void A0h(String str) {
        this.A08 = str;
        this.A09 = false;
    }

    @Override // X.GLn
    public ENu BDD() {
        return this.A03;
    }

    @Override // X.GLn
    public ENO BKl() {
        return this.A04;
    }
}
