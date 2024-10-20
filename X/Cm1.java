package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.marketplace.meetingplan.deeplink.RemoveMeetingPlanActivity;

/* loaded from: Cm1.class */
public final class Cm1 implements DH7 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ RemoveMeetingPlanActivity A02;

    public Cm1(Context context, FbUserSession fbUserSession, RemoveMeetingPlanActivity removeMeetingPlanActivity) {
        this.A02 = removeMeetingPlanActivity;
        this.A01 = fbUserSession;
        this.A00 = context;
    }

    @Override // X.DH7
    public void BxV() {
        RemoveMeetingPlanActivity removeMeetingPlanActivity = this.A02;
        C5ic A0c = AbJ.A0c();
        Context context = this.A00;
        DR6 A02 = A0c.A02(context);
        A02.A03(context.getString(2131959356));
        A02.A0J(context.getString(2131959355));
        A02.A0G(removeMeetingPlanActivity.A01, context.getString(2131959354));
        A02.A0K(false);
        7zN.A13(A02);
    }

    @Override // X.DH7
    public void onSuccess() {
        this.A02.onBackPressed();
    }
}
