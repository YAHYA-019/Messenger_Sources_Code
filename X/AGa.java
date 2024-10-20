package X;

import android.view.ViewGroup;
import com.facebook.particles.ParticleSystemView;

/* loaded from: AGa.class */
public final class AGa implements Runnable {
    public static final String __redex_internal_original_name = "ThreadViewEffectsControllerHandler$playEffect$1";
    public final /* synthetic */ C5fv A00;
    public final /* synthetic */ A7d A01;
    public final /* synthetic */ C6jn A02;

    public AGa(C5fv c5fv, A7d a7d, C6jn c6jn) {
        this.A01 = a7d;
        this.A02 = c6jn;
        this.A00 = c5fv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AYw aYw;
        A7d a7d = this.A01;
        6sX r0 = a7d.A05;
        7zS.A1H(r0.A03);
        if (r0.A02) {
            ParticleSystemView particleSystemView = r0.A01;
            if (particleSystemView == null) {
                ViewGroup viewGroup = r0.A00;
                if (viewGroup == null) {
                    return;
                }
                ParticleSystemView particleSystemView2 = new ParticleSystemView(viewGroup.getContext());
                r0.A01 = particleSystemView2;
                viewGroup.addView(particleSystemView2);
                particleSystemView = r0.A01;
                if (particleSystemView == null) {
                    return;
                }
            }
            9MQ r02 = (9MQ) a7d.A06.getValue();
            C6jn c6jn = this.A02;
            C5fv c5fv = this.A00;
            AW6 aw6 = new AW6(particleSystemView, a7d, 37);
            11T.A0F(c5fv, 2);
            C01i c01i = (C01i) ((java.util.Map) r02.A00.getValue()).get(c6jn);
            if (c01i == null || (aYw = (AYw) c01i.getValue()) == null) {
                0fH.A0j("LazyParticleEffectPlayer", AnonymousClass001.A0Z(c6jn, "No runner found for particle effect: ", AnonymousClass001.A0k()));
            } else {
                aYw.Ciq(particleSystemView, c5fv, aw6);
            }
        }
    }
}
