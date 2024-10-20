package X;

import android.content.Context;
import android.view.View;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.callinfo.gen.UserProfile;

/* loaded from: Hp0.class */
public final class Hp0 {
    public final Context A00;
    public final 0QO A01;
    public final 1Br A02;
    public final C15h A03;

    public Hp0(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A02 = 1Bu.A00(115704);
        this.A03 = J5u.A03(this, 56);
        this.A01 = new 0QO(0);
    }

    public final JIi A00(Context context, String str, int i) {
        CallParticipant A03;
        UserProfile userProfile;
        11T.A0F(str, 0);
        0QO r0 = this.A01;
        JIi jIi = (JIi) r0.get(str);
        if (jIi == null || i != GOo.A0V((H5G) jIi).A01) {
            1Br.A0C(this.A02);
            jIi = new H5G(context, 1BK.A0X(str), i, false);
            r0.put(str, jIi);
        }
        CallModel A0V = AbL.A0V(this.A03.get());
        ((View) jIi).setContentDescription((A0V == null || (A03 = IFr.A03(A0V, str)) == null || (userProfile = A03.userProfile) == null) ? null : userProfile.name);
        return jIi;
    }
}
