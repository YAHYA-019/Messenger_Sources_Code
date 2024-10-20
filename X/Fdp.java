package X;

import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Fdp.class */
public final class Fdp implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "TessaServiceHandler";
    public final C15h A02 = G7K.A01(this, 125);
    public final FhT A00 = (FhT) 1Bn.A0A(99690);
    public final FhA A01 = (FhA) 1Bn.A0A(99689);

    public OperationResult BMQ(1TC r302) {
        Parcelable parcelable;
        1Rl r308;
        FhT fhT;
        String str = r302.A06;
        if ("post_survey_events".equals(str)) {
            parcelable = r302.A00.getParcelable("surveyEventLoggingParam");
            r308 = (1Rl) this.A02.get();
            fhT = this.A00;
        } else {
            if (!1BJ.A00(521).equals(str)) {
                0fH.A18("Survey Remix: ", "%s: Unknown Operation Type: %s", new Object[]{AnonymousClass001.A0X(this), str});
                return OperationResult.A01(29B.A0H);
            }
            parcelable = r302.A00.getParcelable("surveyResponsePostingParam");
            r308 = (1Rl) this.A02.get();
            fhT = this.A01;
        }
        r308.A08(CallerContext.A06(Fdp.class), fhT, parcelable);
        return OperationResult.A00;
    }
}
