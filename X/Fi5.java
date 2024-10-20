package X;

import com.facebook.auth.protocol.GetLoggedInUserGraphQLResult;
import com.facebook.common.util.TriState;
import com.facebook.user.model.User;
import java.util.Collections;

/* loaded from: Fi5.class */
public final class Fi5 implements 4qU {
    public final /* synthetic */ C09764rg A00;

    public Fi5(C09764rg c09764rg) {
        this.A00 = c09764rg;
    }

    public Iterable B0L() {
        return Collections.singletonList(new C4r6(TriState.UNSET, DKC.A0S(this.A00.A00), null, null, "getLoggedInUser"));
    }

    public void CA9(java.util.Map map) {
        try {
            GetLoggedInUserGraphQLResult getLoggedInUserGraphQLResult = (GetLoggedInUserGraphQLResult) map.get("getLoggedInUser");
            1Kh r0 = new 1Kh();
            r0.A03(getLoggedInUserGraphQLResult.A00);
            C09764rg c09764rg = this.A00;
            ((Ewu) c09764rg.A02.get()).A00();
            ((1Ew) c09764rg.A01.get()).CjX(new User(r0));
        } catch (Exception e) {
            Ewu ewu = (Ewu) this.A00.A02.get();
            e.getCause();
            ewu.A00();
        }
    }
}
