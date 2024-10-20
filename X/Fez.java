package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Fez.class */
public final class Fez implements MFI {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FFI A01;
    public final /* synthetic */ Integer A02;

    public Fez(FbUserSession fbUserSession, FFI ffi, Integer num) {
        this.A01 = ffi;
        this.A00 = fbUserSession;
        this.A02 = num;
    }

    public boolean BuA(Fik fik) {
        String str;
        EvP evP = (EvP) this.A01.A00.get();
        FbUserSession fbUserSession = this.A00;
        Integer num = this.A02;
        11T.A0F(fbUserSession, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        switch (num.intValue()) {
            case 1:
                str = "CARRIER_NOTIFICATION_NEAR_EXPIRY";
                break;
            case 2:
                str = "CARRIER_NOTIFICATION_SIM_TOPUP";
                break;
            default:
                str = "CARRIER_NOTIFICATION_LOW_BALANCE";
                break;
        }
        A0M.A05("feature", str);
        1FV A09 = 7zT.A09(evP.A06).A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "CarrierInsightsNotifyServerGraphQLQuery", (String) null, "fbandroid", -1802424252, 0, 323100192L, 323100192L, false, true)));
        1Br.A0D(evP.A03, FwL.A00(evP, 10), A09);
        return false;
    }
}
