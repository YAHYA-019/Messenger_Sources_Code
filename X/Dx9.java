package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.BitSet;

/* loaded from: Dx9.class */
public final class Dx9 extends C1rj {
    public 1Im A00;
    public Boolean A01;
    public boolean A02;

    public Dx9() {
        super("FigRadioButtonComponent");
    }

    public final Object[] A0k() {
        return 7zN.A1b(this.A01, this.A02);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Boolean bool = this.A01;
        boolean z = this.A02;
        Resources A0E = 4YU.A0E(r302);
        Drawable drawable = A0E.getDrawable(2132344844);
        Drawable drawable2 = A0E.getDrawable(2132344843);
        int intrinsicHeight = drawable.getIntrinsicHeight();
        DsA dsA = new DsA(new Dyv(), r302);
        Dyv dyv = dsA.A00;
        dyv.A05 = drawable;
        BitSet bitSet = dsA.A02;
        bitSet.set(0);
        dyv.A06 = drawable2;
        bitSet.set(2);
        dyv.A09 = bool;
        dyv.A0A = Boolean.valueOf(z);
        bitSet.set(1);
        1LI r0 = r302.A02;
        dyv.A08 = r0 == null ? null : ((Dx9) r0).A00;
        dyv.A0B = true;
        dyv.A02 = intrinsicHeight;
        dyv.A07 = ImageView.ScaleType.CENTER;
        C1rs.A03(bitSet, dsA.A03);
        dsA.A0J();
        return dyv;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return DKF.A0P(c1qp);
    }
}
