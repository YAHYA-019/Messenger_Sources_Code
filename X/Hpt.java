package X;

import android.app.Activity;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hpt.class */
public final class Hpt {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final FbUserSession A04;
    public final 1De A05;

    public Hpt(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        this.A04 = fbUserSession;
        1BY r0 = r303.A00;
        this.A00 = 1Lm.A03(fbUserSession, r0, 33088);
        this.A03 = 1Bu.A03(r0, 115475);
        this.A02 = 1Bu.A03(r0, 67784);
        this.A01 = 1Bu.A03(r0, 16981);
    }

    public final void A00(Activity activity, View view, Integer num, boolean z) {
        11T.A0F(view, 0);
        C00i c00i = this.A03.A00;
        if (1Br.A07(((HVz) c00i.get()).A00).AZk(36320803255697111L)) {
            AnonymousClass001.A07().postDelayed(new J2x(activity, view, this, num, z), (long) 1Br.A07(((HVz) c00i.get()).A00).Ai7(37165228185748049L));
        }
    }
}
