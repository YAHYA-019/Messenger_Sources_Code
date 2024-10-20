package X;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.Gnb, reason: case insensitive filesystem */
/* loaded from: Gnb.class */
public final class C2758Gnb extends IFM {
    public int A00;
    public 1BY A01;
    public Hm5 A02;
    public List A03;
    public boolean A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;

    public C2758Gnb(ViewGroup viewGroup, 1BO r303, Hrw hrw, Hm5 hm5, C6x1 c6x1) {
        super(viewGroup, hrw, c6x1);
        this.A07 = 7zN.A0D(115510);
        this.A06 = 1BQ.A02(115988);
        this.A05 = AbH.A0S();
        this.A00 = 0;
        this.A04 = false;
        this.A01 = 7zL.A0Q(r303);
        this.A02 = hm5;
    }

    public static void A00(C2758Gnb c2758Gnb) {
        if (c2758Gnb.A09() != null) {
            String str = ((Hiq) c2758Gnb.A03.get(c2758Gnb.A00)).A06;
            ((TextView) c2758Gnb.A09()).setText(str);
            c2758Gnb.A09().setContentDescription(str);
        }
    }
}
