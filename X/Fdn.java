package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.api.negativefeedback.NegativeFeedbackActionMethod$Params;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Fdn.class */
public final class Fdn implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "NegativeFeedbackActionHandler";
    public final 1Br A00;
    public final Fgm A01;
    public final 1De A02;

    public Fdn(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A01 = (Fgm) 1Bn.A0E((Context) null, r0, 98805);
        this.A00 = 1Bu.A03(r0, 16428);
    }

    public OperationResult BMQ(1TC r302) {
        11T.A0F(r302, 0);
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = r302.A00;
        Object A01 = 0Gm.A01(NegativeFeedbackActionMethod$Params.CREATOR, i >= 33 ? (Parcelable) bundle.getParcelable("negativeFeedbackActionParams", Parcelable.class) : bundle.getParcelable("negativeFeedbackActionParams"), NegativeFeedbackActionMethod$Params.class);
        1Rl r0 = (1Rl) 1Bi.A03(84633);
        1Fw.A04((1EZ) 1Br.A0B(this.A00));
        r0.A07(AbH.A0B(this), this.A01, (C04033zm) null, A01);
        OperationResult operationResult = OperationResult.A00;
        11T.A0A(operationResult);
        return operationResult;
    }
}
