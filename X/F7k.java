package X;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* loaded from: F7k.class */
public final class F7k {
    public 1BY A00;
    public final FAJ A01 = (FAJ) 1Bn.A0B(100122);
    public final FFh A02 = (FFh) 1Bi.A03(100123);

    public F7k(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static final F7k A00(1BO r301) {
        return new F7k(r301);
    }

    public void A01(String str) {
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.put("attempt_count", str);
        A0c.put("request_code_used_prefill_phone_number", "");
        A0c.put("request_code_used_prefill_country_code", "");
        FAJ.A00(this.A01, "request_code_submit", A0c.build());
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("attempt_count", str);
        A0u.put("used_prefill_phone_number", "");
        A0u.put("used_prefill_country_code", "");
        this.A02.A03("request_code", "phone_confirmation_request_code_ok_click", A0u);
    }
}
