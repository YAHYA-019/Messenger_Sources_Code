package X;

import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Cfa.class */
public final class Cfa implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "RegistrationHandler";
    public final C00i A00 = 1BV.A00(100156);
    public final C00i A01 = 1BV.A00(98815);
    public final Cgo A02 = (Cgo) 1Bn.A0A(85205);
    public final C15h A03 = DBe.A00(this, ActionId.VIEW_DID_APPEAR_BEGIN);

    public OperationResult BMQ(1TC r302) {
        Object A08;
        String str = r302.A06;
        if (1BJ.A00(537).equals(str)) {
            A08 = ((1Rl) this.A03.get()).A0A((1Ro) this.A00.get(), r302.A00.getParcelable(AbstractC00603o4.A00(613)));
        } else {
            if (1BJ.A00(2114).equals(str)) {
                ((1Rl) this.A03.get()).A0A((1Ro) this.A01.get(), r302.A00.getParcelable("unregisterPushTokenParams"));
                return OperationResult.A00;
            }
            if (!1BJ.A00(538).equals(str)) {
                throw new Exception("Unknown type");
            }
            Parcelable parcelable = r302.A00.getParcelable(AbstractC00603o4.A00(612));
            A08 = ((1Rl) this.A03.get()).A08(CallerContext.A09(getClass(), 1BJ.A00(27)), this.A02, parcelable);
        }
        return OperationResult.A04(A08);
    }
}
