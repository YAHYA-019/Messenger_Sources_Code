package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: J16.class */
public final class J16 implements Runnable {
    public static final String __redex_internal_original_name = "RtcExpressionCircularEffectsAdapter$onBindViewHolder$2";
    public final /* synthetic */ I5A A00;
    public final /* synthetic */ GXq A01;
    public final /* synthetic */ GWo A02;

    public J16(I5A i5a, GXq gXq, GWo gWo) {
        this.A02 = gWo;
        this.A00 = i5a;
        this.A01 = gXq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double d;
        GWo gWo = this.A02;
        FbUserSession A0H = GOo.A0H(gWo);
        IPz iPz = (IPz) 1Lm.A05(gWo.A05, A0H, 114831);
        I5A i5a = this.A00;
        EffectItem A01 = i5a.A01();
        HAR A06 = iPz.A06(A01);
        if (A01 != null) {
            Hwy hwy = (Hwy) 1Br.A0B(iPz.A0G);
            Number A15 = GOn.A15(Long.valueOf(A01.A03()), hwy.A00);
            if (A15 != null) {
                d = A15.doubleValue();
                DKE.A0K(gWo.A0I).post(new J3T(A0H, i5a, A06, this.A01, gWo, d));
            }
        }
        d = 0.0d;
        DKE.A0K(gWo.A0I).post(new J3T(A0H, i5a, A06, this.A01, gWo, d));
    }
}
