package X;

import com.facebook.messaging.neue.nux.phoneconfirmation.ConfirmPhoneFragment;
import com.facebook.messaging.phoneconfirmation.protocol.RequestConfirmationCodeParams;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* loaded from: Ert.class */
public final class Ert {
    public final /* synthetic */ ConfirmPhoneFragment A00;

    public Ert(ConfirmPhoneFragment confirmPhoneFragment) {
        this.A00 = confirmPhoneFragment;
    }

    public void A00() {
        ConfirmPhoneFragment confirmPhoneFragment = this.A00;
        confirmPhoneFragment.A00++;
        if (confirmPhoneFragment.A04.A1S()) {
            return;
        }
        JgM jgM = confirmPhoneFragment.A07.A00;
        if (jgM == null || !jgM.A1S()) {
            C1F c1f = confirmPhoneFragment.A0O;
            11T.A0F("", 0);
            String BD0 = 1Br.A09(c1f.A00).BD0(1NK.A6B);
            String str = BD0 != null ? BD0 : "";
            String A00 = c1f.A00("");
            String A04 = confirmPhoneFragment.A09.A00.A04(C1fe.A2U);
            String str2 = confirmPhoneFragment.A0E;
            String str3 = confirmPhoneFragment.A0D;
            RequestConfirmationCodeParams requestConfirmationCodeParams = confirmPhoneFragment.A08;
            RequestConfirmationCodeParams A002 = RequestConfirmationCodeParams.A00(str, A00, A04, str2, str3, requestConfirmationCodeParams == null ? 1 : requestConfirmationCodeParams.A00 + 1);
            confirmPhoneFragment.A08 = A002;
            confirmPhoneFragment.A07.A02(A002);
            ImmutableMap.Builder A0c = 1BK.A0c();
            HashMap A0u = AnonymousClass001.A0u();
            A0c.put("attempt_count", Integer.toString(confirmPhoneFragment.A08.A00));
            A0u.put("attempt_count", String.valueOf(confirmPhoneFragment.A08.A00));
            FAJ.A00(confirmPhoneFragment.A06, "confirm_phone_request_code", A0c.build());
            confirmPhoneFragment.A0N.A03("confirm_phone", "phone_confirmation_confirm_code_send_again_click", A0u);
            if (confirmPhoneFragment.A00 >= 1) {
                confirmPhoneFragment.A0F = true;
            }
            confirmPhoneFragment.A01 = 1BL.A08(confirmPhoneFragment.A0I);
            ConfirmPhoneFragment.A03(confirmPhoneFragment);
        }
    }
}
