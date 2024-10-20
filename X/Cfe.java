package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Cfe.class */
public final class Cfe implements 1Tu, CallerContextable {
    public static final CallerContext A02 = CallerContext.A06(Cfe.class);
    public static final String __redex_internal_original_name = "MessagingInvitesServiceHandler";
    public final 1Rl A00;
    public final Cgr A01;

    public Cfe() {
        1Rl A0I = AbJ.A0I();
        Cgr cgr = (Cgr) 1Bn.A0A(85031);
        this.A00 = A0I;
        this.A01 = cgr;
    }

    public OperationResult BMQ(1TC r302) {
        if (!r302.A06.equals("messenger_invites")) {
            return OperationResult.A01(29B.A0F);
        }
        Bundle bundle = r302.A00;
        RJ3 rj3 = new RJ3(bundle.getString("invite_token"), bundle.getBoolean("is_new_install"));
        return OperationResult.A04(this.A00.A08(A02, this.A01, rj3));
    }
}
