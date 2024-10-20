package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: Cp6.class */
public final class Cp6 implements DFb {
    public final 1Br A00;
    public final 1Br A01 = 1Bu.A00(16430);
    public final 1Br A02;
    public final FbUserSession A03;
    public final 1Br A04;

    public Cp6(Context context, FbUserSession fbUserSession) {
        this.A03 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 17016);
        this.A00 = 1Lm.A00(context, fbUserSession, 84219);
        this.A04 = 1Lm.A00(context, fbUserSession, 84176);
    }

    public static final I5k A00(Cp6 cp6) {
        return (I5k) 1Br.A0B(cp6.A04);
    }

    @Override // X.DFb
    public void CNB(RzB rzB) {
        11T.A0F(rzB, 0);
        Qvl qvl = rzB.liveStreamStatus;
        D19 d19 = rzB.optInInfo;
        List list = rzB.acceptedUsers;
        boolean z = true;
        if (list == null || !list.contains(this.A03.A05)) {
            z = false;
        }
        ((Handler) 1Br.A0B(this.A01)).post(new SEH(d19, qvl, this, z));
    }
}
