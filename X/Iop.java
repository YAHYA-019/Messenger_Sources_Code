package X;

import android.media.ImageReader;

/* loaded from: Iop.class */
public final class Iop implements Runnable {
    public static final String __redex_internal_original_name = "InputFramesProvider$4";
    public final /* synthetic */ IHB A00;

    public Iop(IHB ihb) {
        this.A00 = ihb;
    }

    @Override // java.lang.Runnable
    public void run() {
        IHB ihb = this.A00;
        ImageReader imageReader = ihb.A03;
        if (imageReader == null || imageReader.getWidth() != ihb.A02 || ihb.A03.getHeight() != ihb.A01) {
            IHB.A01(ihb);
            IHB.A00(ihb);
        }
        if (ihb.A06) {
            ihb.A07.open();
        }
    }
}
