package X;

import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Fdo.class */
public final class Fdo implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "SecuredActionServiceHandler";
    public final Fh7 A01 = (Fh7) 1Bn.A0A(98892);
    public final FhS A00 = (FhS) 1Bn.A0A(98819);
    public final C15h A02 = G7K.A01(this, ActionId.HEADER_DATA_LOADED);

    public OperationResult BMQ(1TC r302) {
        1Ro r309;
        Object A07;
        Bundle bundle = r302.A00;
        String str = r302.A06;
        boolean equals = 1BJ.A00(2019).equals(str);
        if (equals) {
            r309 = null;
        } else {
            Class cls = (Class) bundle.getSerializable("api_method_class");
            if (cls == null) {
                return new OperationResult(new Exception());
            }
            r309 = (1Ro) cls.newInstance();
            if (r309 == null) {
                return new OperationResult(new Exception());
            }
        }
        if (1BJ.A00(2020).equals(str)) {
            A07 = ((1Rl) this.A02.get()).A07(CallerContext.A06(Fdo.class), r309, (C04033zm) null, bundle.getParcelable("request_params"));
        } else {
            if (!1BJ.A00(2021).equals(str)) {
                if (!equals) {
                    throw 0Pz.A05("unknown operation type: ", str);
                }
                return OperationResult.A04(((1Rl) this.A02.get()).A07(CallerContext.A06(Fdo.class), this.A00, (C04033zm) null, Long.valueOf(bundle.getLong("model_version"))));
            }
            A07 = ((1Rl) this.A02.get()).A07(CallerContext.A06(Fdo.class), this.A01, (C04033zm) null, bundle.getParcelable("challenge_params"));
        }
        return A07 instanceof Boolean ? OperationResult.A00 : OperationResult.A04(A07);
    }
}
