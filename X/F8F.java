package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.guidedaction.GuidedActionItem;

/* loaded from: F8F.class */
public final class F8F {
    public 1BY A00;
    public final C00i A04 = 1BV.A01((1BY) null, 83719);
    public final C15h A06 = G7K.A01(this, 24);
    public final C00i A02 = 1BQ.A02(84955);
    public final C00i A05 = DKG.A0S();
    public final C00i A01 = AbH.A0I();
    public final C00i A03 = 1BQ.A02(66351);

    public F8F(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(FbUserSession fbUserSession, EBN ebn) {
        EBN.A00(fbUserSession, ebn, 0S2.A00);
        7zQ.A16(ebn.getContext(), 2131957542);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.api.negativefeedback.NegativeFeedbackActionMethod$Params, android.os.Parcelable, java.lang.Object] */
    public void A01(FbUserSession fbUserSession, GuidedActionItem guidedActionItem, EBN ebn) {
        EhC ehC = (EhC) this.A06.get();
        String str = guidedActionItem.A08;
        11T.A0F(fbUserSession, 0);
        Bundle A05 = 1BK.A05();
        ?? obj = new Object();
        obj.A00 = str;
        A05.putParcelable("negativeFeedbackActionParams", new OpaqueParcelable((Parcelable) obj));
        1IB A00 = 1Ho.A00(((BlueServiceOperationFactory) 1Br.A0B(ehC.A00)).newInstance(1BJ.A00(50), A05, 1, CallerContext.A0B("NegativeFeedbackPostService"), fbUserSession), true);
        11T.A0A(A00);
        DKF.A0h(this.A05).A04(new C2067Das(new ApO(0, fbUserSession, this, ebn), 0), A00, EKb.A01);
    }
}
