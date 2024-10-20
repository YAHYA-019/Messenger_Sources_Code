package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.FbImageView;

/* renamed from: X.Gnc, reason: case insensitive filesystem */
/* loaded from: Gnc.class */
public final class C2759Gnc extends IFM {
    public FbImageView A00;
    public final C5bb A01;
    public final C00i A02;
    public final C00i A03;
    public final HSs A04;
    public final IWN A05;
    public final Context A06;
    public final C00i A07;
    public final C00i A08;

    public C2759Gnc(ViewGroup viewGroup, AbR abR, Hrw hrw, HSs hSs, IWN iwn, C6x1 c6x1) {
        super(viewGroup, abR, hrw, c6x1);
        Context context = ((IFM) this).A05.getContext();
        this.A06 = context;
        this.A02 = AbF.A0Q(context, 100193);
        this.A08 = AbH.A0Q();
        this.A03 = GOo.A0K();
        1BV A0W = DKD.A0W(context);
        this.A07 = A0W;
        this.A01 = IFM.A03(A0W);
        this.A05 = iwn;
        this.A04 = hSs;
    }

    public static void A00(C2759Gnc c2759Gnc) {
        C1u3 c1u3;
        C1u4 c1u4;
        int AWT;
        boolean As9 = c2759Gnc.A05.As9();
        MigColorScheme A0p = AbF.A0p(c2759Gnc.A07);
        if (c2759Gnc.A00 != null) {
            C00i c00i = c2759Gnc.A03;
            1CO A0e = GOq.A0e(c00i);
            1GD r0 = 1GD.A07;
            if (!A0e.AZr(r0, 36325252842476034L)) {
                GOo.A1E(c2759Gnc.A00, C1u3.A3h, GOn.A0M(c2759Gnc.A08), As9 ? A0p.AZN() : A0p.AWT());
                c2759Gnc.A00.setBackground(As9 ? c2759Gnc.A01 : null);
                return;
            }
            boolean AZr = GOq.A0e(c00i).AZr(r0, 36325252842541571L);
            FbImageView fbImageView = c2759Gnc.A00;
            C1u2 A0M = GOn.A0M(c2759Gnc.A08);
            if (AZr) {
                c1u3 = As9 ? C1u3.A3h : C1u3.A3i;
                c1u4 = C1u4.SIZE_32;
                if (!As9) {
                    AWT = A0p.AZe();
                    fbImageView.setImageDrawable(A0M.A09(c1u3, c1u4, AWT));
                    C5bb c5bb = c2759Gnc.A01;
                    c5bb.A01(A0p.AZL());
                    c2759Gnc.A00.setBackground(c5bb);
                }
            } else {
                c1u3 = As9 ? C1u3.A3h : C1u3.A3i;
                c1u4 = C1u4.SIZE_32;
            }
            AWT = A0p.AWT();
            fbImageView.setImageDrawable(A0M.A09(c1u3, c1u4, AWT));
            C5bb c5bb2 = c2759Gnc.A01;
            c5bb2.A01(A0p.AZL());
            c2759Gnc.A00.setBackground(c5bb2);
        }
    }
}
