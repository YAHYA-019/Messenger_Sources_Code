package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.facebook.mobileconfig.factory.module.AdminIdMC;

/* renamed from: X.Dfk, reason: case insensitive filesystem */
/* loaded from: Dfk.class */
public abstract class AbstractC2156Dfk extends AbstractC2178Dg6 {
    public int A00;
    public FF6 A01;
    public ERC A02;
    public ERE A03;
    public 2MR A04;
    public Integer A05;
    public float A06;

    public AbstractC2156Dfk(1Iw r302) {
        super(r302);
        this.A05 = 0S2.A00;
        this.A06 = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01a4, code lost:
    
        if (r326 != null) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x006e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.drawable.Drawable A00(X.FF6 r302, X.Fcg r303, X.ERC r304, X.ERE r305, X.EzJ r306, X.ELr r307, X.ETk r308, int r309, boolean r310) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2156Dfk.A00(X.FF6, X.Fcg, X.ERC, X.ERE, X.EzJ, X.ELr, X.ETk, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.ETk, java.lang.Object] */
    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        Drawable A00;
        Drawable.ConstantState constantState;
        2MR r0;
        this.A01.getClass();
        this.A03.getClass();
        this.A02.getClass();
        Fcg fcg = (Fcg) 1Br.A0B(A0M().A03);
        if (fcg == null) {
            return null;
        }
        FF6 ff6 = this.A01;
        ERE ere = this.A03;
        ERC erc = this.A02;
        1Iw r02 = super.A04;
        Resources A0E = 4YU.A0E(r02);
        boolean AZk = ((2yD) 1Bi.A05(1CO.class, AdminIdMC.class)).AZk(72339189275427038L);
        Integer num = this.A05;
        boolean z = num == 0S2.A0C || num == 0S2.A0j || ((r0 = this.A04) != null && ((r0 == 2MR.A1L || r0 == 2MR.A1i || r0 == 2MR.A2A) && num == 0S2.A00));
        2MR r03 = this.A04;
        int A002 = r03 == null ? this.A00 : ezJ.A00(r03);
        ELr eLr = (ELr) r02.A0A(ELr.class);
        boolean A01 = Build.VERSION.SDK_INT >= 31 ? C3283Jpe.A01(eLr) : false;
        ?? obj = new Object();
        ((ETk) obj).A01 = ff6;
        ((ETk) obj).A03 = ere;
        ((ETk) obj).A02 = erc;
        ((ETk) obj).A00 = A002;
        ((ETk) obj).A04 = z;
        ((ETk) obj).A05 = A01;
        if (!AZk || ff6.A00 == null) {
            A00 = A00(ff6, fcg, erc, ere, ezJ, eLr, obj, A002, z);
        } else {
            1Xo r04 = EZq.A00;
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) r04.A02((Object) obj);
            if (constantState2 != null) {
                A00 = constantState2.newDrawable(A0E);
            } else {
                A00 = A00(ff6, fcg, erc, ere, ezJ, eLr, obj, A002, z);
                if (A00 != null && (constantState = A00.getConstantState()) != null) {
                    r04.A04((Object) obj, constantState);
                }
            }
        }
        C2cq A0u = 7zM.A0u(A00, r02, 0);
        A0u.A0k(0.0f);
        A0u.A0j(0.0f);
        A0u.A0z(this.A02.mSizeDp + this.A06);
        A0u.A0l(this.A02.mSizeDp + this.A06);
        A0u.A2b(ImageView.ScaleType.CENTER);
        return A0u;
    }

    public void A0f(3Eh r302) {
        FF6 A0I = A0I(r302);
        if (A0I == null) {
            ((ESq) this).A00 = true;
            A0I = null;
        }
        this.A01 = A0I;
    }
}
