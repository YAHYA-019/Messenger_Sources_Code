package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: E3t.class */
public final class E3t extends FIJ {
    public FIT A00;
    public Ewp A01;
    public FAX A02;
    public FHy A03;
    public final GL7 A04;
    public final 1De A05;

    public E3t(1De r302, GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A05 = r302;
        F9C f9c = (F9C) 7zR.A0o(AbK.A0A(r302), 98361);
        this.A04 = gl7;
        if (f9c != null) {
            Epo epo = f9c.A00;
            this.A02 = epo.A05;
            this.A03 = (FHy) 1Br.A0B(epo.A01);
            this.A00 = (FIT) 1Br.A0B(epo.A02);
            this.A01 = (Ewp) 1Br.A0B(epo.A00);
        }
    }

    public static final GL7 A00(E3t e3t, GL7 gl7, String str) {
        if (gl7 != null && gl7.BDE() == 50595 && str != null) {
            String string = gl7.getString(38);
            FwU ACy = gl7.ACy();
            JSONObject A12 = AnonymousClass001.A12();
            if (string != null) {
                try {
                    A12 = DKC.A1F(string);
                    A12.put("contextID", str);
                } catch (JSONException e) {
                    FIT fit = e3t.A00;
                    if (fit != null) {
                        fit.A0I("json_exception", "Error injecting contextTokenId in NT Context Create Action", e);
                        return gl7;
                    }
                }
            }
            ACy.put(38, A12.toString());
            return ACy;
        }
        return gl7;
    }

    public static final void A01(E3t e3t, GL7 gl7, FyG fyG) {
        if (gl7 != null) {
            FJ9.A0A(gl7, fyG);
            return;
        }
        FIT fit = e3t.A00;
        if (fit != null) {
            fit.A0G("context_create_error", "Error firing onSuccess or onFailure action in NT Context Create Action");
        }
    }
}
