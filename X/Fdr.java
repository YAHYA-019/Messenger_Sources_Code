package X;

import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Fdr.class */
public final class Fdr implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "PostSurveyServiceHandler";
    public final Fh8 A00 = (Fh8) 1Bn.A0A(99692);
    public final Fh9 A01 = (Fh9) 1Bn.A0A(99691);

    public static final Fdr A00() {
        return new Fdr();
    }

    public OperationResult BMQ(1TC r302) {
        Parcelable parcelable;
        1Ro r304;
        String str = r302.A06;
        1Rl r0 = (1Rl) 1Bi.A03(84633);
        if (1BJ.A00(1937).equals(str)) {
            parcelable = r302.A00.getParcelable("postSurveyAnswersParams");
            r304 = this.A00;
        } else {
            if (!1BJ.A00(1938).equals(str)) {
                throw 0Pz.A05("unknown operation type: ", str);
            }
            parcelable = r302.A00.getParcelable("postSurveyImpressionsParams");
            r304 = this.A01;
        }
        r0.A08(CallerContext.A06(Fdr.class), r304, parcelable);
        return OperationResult.A00;
    }
}
