package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Cfd.class */
public final class Cfd implements 1Tu, CallerContextable {
    public static final CallerContext A02 = CallerContext.A06(Cfd.class);
    public static final String __redex_internal_original_name = "MessagingAuthServiceHandler";
    public final 1Rl A00 = AbJ.A0I();
    public final Cgq A01 = (Cgq) 1Bn.A0B(85174);

    public OperationResult BMQ(1TC r302) {
        if (!1BJ.A00(426).equals(r302.A06)) {
            return OperationResult.A01(29B.A0F);
        }
        Bundle bundle = r302.A00;
        RIc rIc = new RIc(bundle.getStringArray("user_ids"), bundle.getStringArray("access_tokens"));
        return OperationResult.A04(this.A00.A08(A02, this.A01, rIc));
    }
}
