package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.BitSet;

/* renamed from: X.2cq, reason: invalid class name */
/* loaded from: 2cq.class */
public final class C2cq extends C1rs {
    public 1Iw A00;
    public C2cp A01;
    public final BitSet A02;
    public final String[] A03;

    public C2cq(1Iw r302, C2cp c2cp, int i) {
        super(c2cp, r302, 0, i);
        this.A03 = new String[]{"drawable"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c2cp;
        this.A00 = r302;
        bitSet.clear();
    }

    public C2cp A2W() {
        C1rs.A05(this.A02, this.A03, 1);
        A0J();
        return this.A01;
    }

    public void A2X() {
        this.A01.A02 = true;
    }

    public final void A2Y() {
        A2b(ImageView.ScaleType.FIT_CENTER);
    }

    public void A2Z(int i) {
        this.A01.A00 = super.A02.A0B(i);
        this.A02.set(0);
    }

    public void A2a(Drawable drawable) {
        this.A01.A00 = drawable;
        this.A02.set(0);
    }

    public void A2b(ImageView.ScaleType scaleType) {
        this.A01.A01 = scaleType;
    }
}
