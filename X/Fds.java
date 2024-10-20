package X;

import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Fds.class */
public final class Fds implements 1Tu, CallerContextable {
    public static final CallerContext A02 = CallerContext.A06(Fds.class);
    public static final String __redex_internal_original_name = "UpsellPromoServiceHandler";
    public final C15h A01 = G7K.A01(this, ActionId.MESSENGER_THREAD_LIST_LOADED);
    public final FhD A00 = (FhD) 1Bn.A0A(98820);

    public OperationResult BMQ(1TC r302) {
        if (!"zero_buy_promo".equals(r302.A06)) {
            throw AnonymousClass001.A0T(AbE.A00(ActionId.RTMP_CONNECTION_FAILED));
        }
        Parcelable parcelable = r302.A00.getParcelable("zeroBuyPromoParams");
        FhD fhD = this.A00;
        1Rl r0 = (1Rl) this.A01.get();
        C04033zm c04033zm = new C04033zm();
        c04033zm.A01(0S2.A0C);
        return OperationResult.A04(r0.A07(A02, fhD, c04033zm, parcelable));
    }
}
