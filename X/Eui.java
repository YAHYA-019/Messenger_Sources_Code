package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.runtimepermissions.devicepermissionkit.katana.location.DPKDetectFromBackgroundActivity;

/* loaded from: Eui.class */
public final class Eui {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;
    public final 1Br A03;

    public Eui(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 49478);
        this.A01 = 1Bq.A00(67262);
        this.A03 = 1Bu.A03(r0, 116306);
    }

    public void A00(Activity activity, GGR ggr, Integer num) {
        FEJ fej = (FEJ) 1Hv.A02(activity, 99890);
        1Rv r0 = (1Rv) 1Br.A0B(this.A01);
        11T.A0F(r0, 0);
        EmG emG = new EmG(r0, fej, num);
        DPKDetectFromBackgroundActivity.A01 = ggr;
        DPKDetectFromBackgroundActivity.A00 = emG;
        Context context = fej.A00;
        0LS.A0A(context, C3o5.A0D(context, DPKDetectFromBackgroundActivity.class));
    }
}
