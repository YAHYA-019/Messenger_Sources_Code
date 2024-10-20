package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: Kkr.class */
public final class Kkr {
    public final Paint A00;
    public final Path A01 = DKC.A0B();
    public final Kgt A04 = Kgt.A00();
    public final Kgt A02 = Kgt.A00();
    public final Kgt A03 = Kgt.A00();

    public Kkr() {
        Paint A09 = DKC.A09();
        this.A00 = A09;
        A09.setAntiAlias(true);
        DKC.A1M(A09);
        A09.setDither(true);
        A09.setColor(-14298266);
        A09.setMaskFilter(new BlurMaskFilter(175.0f, BlurMaskFilter.Blur.NORMAL));
    }
}
