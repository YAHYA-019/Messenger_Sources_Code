package X;

import android.graphics.drawable.Drawable;
import com.facebook.particles.ParticleSystemView;
import kotlin.jvm.functions.Function2;

/* loaded from: Kor.class */
public final class Kor {
    public final 1Br A00 = 1Bu.A00(131274);

    public final void A00(ParticleSystemView particleSystemView, Function2 function2) {
        11T.A0H(particleSystemView, function2);
        KmO kmO = (KmO) 1Br.A0B(this.A00);
        LXb lXb = kmO.A00;
        if (lXb == null) {
            C00i c00i = kmO.A0A;
            Drawable drawable = 1BL.A0B(((L2y) c00i.get()).A01).getDrawable(2132346872, null);
            C00i c00i2 = kmO.A08;
            float dimension = 1BL.A0B(c00i2).getDimension(2132279619);
            float dimension2 = 1BL.A0B(c00i2).getDimension(2132279618);
            lXb = JR0.A0f(drawable);
            L2y.A00(c00i, lXb);
            LXd.A00(lXb, dimension, dimension2);
            lXb.A00(new LXe(0.5f, 1.0f));
            kmO.A00 = lXb;
        }
        int i = 0;
        do {
            particleSystemView.A02(lXb);
            if (i == 8) {
                function2.invoke(2131886162, Float.valueOf(0.18f));
            }
            i++;
        } while (i < 30);
    }
}
