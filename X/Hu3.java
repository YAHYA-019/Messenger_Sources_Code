package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.scaledtextureview.ScaledTextureView;

/* loaded from: Hu3.class */
public final class Hu3 {
    public boolean A00;
    public Ida A01;
    public final Context A02;
    public final JI5 A03;
    public final HqT A04;
    public final RTR A05;
    public final IBP A06;
    public final 1Br A07;
    public final 1Br A08;
    public final Object A09;

    public Hu3(JI5 ji5, HqT hqT, RTR rtr) {
        11T.A0F(hqT, 2);
        this.A04 = hqT;
        this.A03 = ji5;
        this.A05 = rtr;
        Context A00 = FbInjector.A00();
        this.A02 = A00;
        this.A08 = 1BK.A0C();
        this.A07 = 1Bu.A00(16454);
        11T.A0A(A00);
        this.A06 = new IBP(A00, hqT);
        this.A09 = AnonymousClass001.A0R();
        this.A01 = null;
    }

    public final Ida A00() {
        Ida ida;
        JGJ jgj;
        synchronized (this) {
            ida = this.A01;
            if (ida == null) {
                IOO ioo = new IOO(7zL.A14(this));
                if (1Br.A06(this.A08).AZk(36313957079194964L)) {
                    new Ie8(GOp.A0p(this.A04.A08));
                } else {
                    jgj = null;
                }
                I3D i3d = I3D.A00;
                Context context = this.A02;
                11T.A09(context);
                Object obj = JOR.A00;
                HqT hqT = this.A04;
                ida = i3d.A00(context, hqT.A07, ioo, jgj, obj);
                Ida.A01(ida).A0P = new IeB(GOp.A0p(hqT.A08));
                ida.A03(hqT.A00);
                this.A01 = ida;
            }
        }
        return ida;
    }

    public final void A01(int i) {
        HqT hqT = this.A04;
        Integer num = hqT.A06;
        if (num == 0S2.A01) {
            0fH.A0g(Integer.valueOf(i), "CameraHost", "setTargetFps in connected state: %d");
            A00().A06(i);
        } else if (num == 0S2.A00) {
            Integer valueOf = Integer.valueOf(i);
            0fH.A0g(valueOf, "CameraHost", "set pending fps in connecting state: %d");
            hqT.A05 = valueOf;
        }
    }

    public final void A02(HqE hqE) {
        ScaledTextureView scaledTextureView;
        synchronized (this.A09) {
            GuJ guJ = JQ1.A00;
            11T.A0B(guJ);
            JQ1 jq1 = (JQ1) JOX.A01(guJ, A00());
            if (hqE == null) {
                0fH.A0j("CameraHost", "setPreviewView: null");
                scaledTextureView = null;
            } else {
                scaledTextureView = hqE.A05;
                if (scaledTextureView != null) {
                    0fH.A0g(scaledTextureView, "CameraHost", "setPreviewView: %s");
                }
            }
            jq1.CtI(scaledTextureView);
        }
    }
}
