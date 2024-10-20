package X;

import com.facebook.video.engine.api.VideoPlayerParams;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Iz1.class */
public final class Iz1 implements Runnable {
    public static final String __redex_internal_original_name = "PlaybackControllerImpl$6";
    public final /* synthetic */ GPs A00;
    public final /* synthetic */ AtomicReference A01;

    public Iz1(GPs gPs, AtomicReference atomicReference) {
        this.A00 = gPs;
        this.A01 = atomicReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        6U2 r305;
        6UA h2o;
        Object obj;
        Object obj2;
        VideoPlayerParams Ag6;
        String str;
        GPs gPs = this.A00;
        if (gPs.A0B != null) {
            C5nf c5nf = (C5nf) this.A01.get();
            GPs.A04(gPs);
            if (c5nf == null || (obj = c5nf.A01) == null || (obj2 = c5nf.A00) == null || (Ag6 = gPs.A06.Ag6()) == null || (str = Ag6.A0k) == null || !str.equals(obj2)) {
                r305 = gPs.A0B;
                h2o = new H2O(-1);
            } else {
                r305 = gPs.A0B;
                6UA r0 = (6UA) obj;
                int i = r0.A02;
                int i2 = r0.A01;
                int i3 = r0.A00;
                C52j c52j = r0.A03;
                11T.A0F(c52j, 4);
                h2o = new 6UA(c52j, i, i2, i3, false, false);
            }
            r305.A06(h2o);
        }
    }
}
