package X;

import android.graphics.PointF;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.ContextChain;
import java.util.List;

/* loaded from: Dwj.class */
public final class Dwj extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dwj() {
        super("NTImageComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        GL7 Ay2 = gl7.Ay2(55);
        if (Ay2 == null) {
            return null;
        }
        boolean z = gl7.getBoolean(99, false);
        String BCx = gl7.BCx(56, "COVER");
        int Ad0 = gl7.Ad0(fyG, 78, ActionId.ABORTED, 0);
        ContextChain contextChain = (ContextChain) r302.A0A(ContextChain.class);
        List A00 = EYN.A00(gl7, 89);
        ContextChain contextChain2 = contextChain;
        for (int i = 0; i < A00.size(); i++) {
            String A14 = 1BK.A14(A00, i);
            if (A14 != null) {
                String[] split = A14.split(":");
                if (split.length == 2) {
                    contextChain = new ContextChain(contextChain2, split[0], split[1]);
                    contextChain2 = contextChain;
                }
            }
        }
        C1rs ACl = FJ9.A06(Ay2, fyG).ACl("COVER".equals(gl7.BCx(56, "COVER")) ? new PointF(gl7.Amm(94, 0.5f), gl7.Amm(95, 0.5f)) : null, contextChain, r302, BCx, Ad0);
        ACl.A0F("android.widget.ImageView");
        if (z) {
            C1ti A0v = ACl.A00.A0v();
            A0v.A0A = true;
            29K A02 = C1ti.A02(A0v);
            A02.A03 = 180.0f;
            A02.A0F |= 67108864;
        }
        return ACl.A2V();
    }
}
