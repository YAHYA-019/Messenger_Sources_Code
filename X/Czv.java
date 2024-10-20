package X;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: Czv.class */
public final class Czv implements 2Ti {
    public final /* synthetic */ DFp A00;
    public final /* synthetic */ C8Z A01;

    public Czv(DFp dFp, C8Z c8z) {
        this.A01 = c8z;
        this.A00 = dFp;
    }

    public final void CND() {
        String str;
        C8Z c8z = this.A01;
        C00i c00i = c8z.A06.A00;
        ViewerContext Aue = ((1EZ) c00i.get()).Aue();
        if (Aue == null || (str = Aue.mUserId) == null) {
            return;
        }
        long parseLong = Long.parseLong(str);
        DFp dFp = this.A00;
        if (parseLong != Long.parseLong(ConstantsKt.CAMERA_ID_FRONT)) {
            1Kd.A0E(new D4o(dFp, c8z, 8), ((2Tj) 1Lm.A05(c8z.A02, 1Fw.A06(c00i.get()), 33122)).A04(parseLong));
        }
    }
}
