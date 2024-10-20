package X;

import com.facebook.messaging.montage.model.art.EffectItem;
import java.util.List;

/* loaded from: Ixx.class */
public final class Ixx implements Runnable {
    public static final String __redex_internal_original_name = "RtcCircularEffectViewHolder$setData$1";
    public final /* synthetic */ I5A A00;
    public final /* synthetic */ GXq A01;

    public Ixx(I5A i5a, GXq gXq) {
        this.A01 = gXq;
        this.A00 = i5a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double d;
        GXq gXq = this.A01;
        List list = C2lb.A0J;
        IPz iPz = (IPz) 1Lm.A05(gXq.A01, 1Fw.A04(gXq.A08), 114831);
        EffectItem A01 = this.A00.A01();
        HAR A06 = iPz.A06(A01);
        if (A01 != null) {
            Hwy hwy = (Hwy) 1Br.A0B(iPz.A0G);
            Number A15 = GOn.A15(Long.valueOf(A01.A03()), hwy.A00);
            if (A15 != null) {
                d = A15.doubleValue();
                DKE.A0K(gXq.A0G).post(new J14(A06, gXq, d));
            }
        }
        d = 0.0d;
        DKE.A0K(gXq.A0G).post(new J14(A06, gXq, d));
    }
}
