package X;

import android.graphics.drawable.Drawable;
import com.facebook.particles.ParticleSystemView;

/* loaded from: Kot.class */
public final class Kot {
    public final 1Br A00 = 1Bu.A00(131274);

    public final void A00(ParticleSystemView particleSystemView) {
        11T.A0F(particleSystemView, 0);
        KmO kmO = (KmO) 1Br.A0B(this.A00);
        LXb lXb = kmO.A01;
        if (lXb == null) {
            C00i c00i = kmO.A0A;
            Drawable drawable = 1BL.A0B(((L2y) c00i.get()).A01).getDrawable(2131230781, null);
            C00i c00i2 = kmO.A08;
            float dimension = 1BL.A0B(c00i2).getDimension(2132279619);
            float dimension2 = 1BL.A0B(c00i2).getDimension(2132279618);
            lXb = JR0.A0f(drawable);
            L2y.A00(c00i, lXb);
            LXd.A00(lXb, dimension, dimension2);
            lXb.A00(new LXe(0.5f, 1.0f));
            kmO.A01 = lXb;
        }
        int i = 0;
        do {
            particleSystemView.A02(lXb);
            i++;
        } while (i < 20);
    }
}
