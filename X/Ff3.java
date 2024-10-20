package X;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ff3.class */
public final class Ff3 implements 5SG {
    public String A00;
    public final /* synthetic */ 4Yx A01;

    public Ff3(4Yx r302, String str) {
        this.A01 = r302;
        this.A00 = str;
    }

    public void Bxs(int i, Throwable th) {
        4Yx r0 = this.A01;
        int i2 = 4Yx.A0B;
        synchronized (r0.A08) {
            4Yy r02 = r0.A01;
            if (r02.A01 == this) {
                r02.A01 = null;
                r0.A02.A03(r0.A00.now(), false);
            } else {
                r0.A03.A02("onFailure_JioHeaderPing", this.A00);
            }
        }
        r0.A04.A00("ZeroHeaderRequestController-JioMsisdnFetchFailure", DKE.A12(th), th);
    }

    public void COq(String str, int i) {
        4Yx r0 = this.A01;
        int i2 = 4Yx.A0B;
        synchronized (r0.A08) {
            4Yy r02 = r0.A01;
            if (r02.A01 != this) {
                r0.A03.A02("onSuccess_JioHeaderPing", this.A00);
                return;
            }
            r02.A01 = null;
            String str2 = this.A00;
            if (str == null || i != 200) {
                r0.A03.A04("jio_header_ping_failed", str2, i, (Throwable) null);
                r0.A02.A03(r0.A00.now(), false);
                return;
            }
            4Ys r03 = r0.A03;
            r03.A04("jio_header_ping_success", str2, i, (Throwable) null);
            try {
                JSONObject A1F = DKC.A1F(str);
                4Yt r04 = r0.A02;
                try {
                    A1F.getString("unique1");
                } catch (JSONException unused) {
                }
                try {
                    A1F.getString("unique2");
                } catch (JSONException unused2) {
                }
                try {
                    A1F.getString("unique3");
                } catch (JSONException unused3) {
                }
                try {
                    A1F.getString("unique4");
                } catch (JSONException unused4) {
                }
                try {
                    A1F.getString("signature1");
                } catch (JSONException unused5) {
                }
                try {
                    A1F.getString("signature2");
                } catch (JSONException unused6) {
                }
                try {
                    A1F.getString("msisdn");
                } catch (JSONException unused7) {
                }
                try {
                    A1F.getString("info");
                } catch (JSONException unused8) {
                }
                try {
                    A1F.getString("maskedPhoneNumber");
                } catch (JSONException unused9) {
                }
                r04.A01.A04 = r04.A00.now();
                4Yt.A02(r04);
                r03.A00.A02(str2, 0S2.A1J, "jio");
                4Yn r05 = r03.A01;
                r05.A03("jio_header_data_stored");
                r05.A01();
                r04.A03(r0.A00.now(), true);
                4Yx.A02(r0);
                4Yx.A03(r0);
            } catch (JSONException e) {
                r03.A00.A01(0S2.A02, str2, e.getMessage(), (String) null);
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("error_message", e.getMessage());
                4Yn r06 = r03.A01;
                r06.A04("jio_header_data_parse_error", A0u);
                r06.A00();
                r0.A04.A00("ZeroHeaderRequestController-JioMsisdnParseError", DKE.A12(e), e);
                r0.A02.A03(r0.A00.now(), false);
                4Yx.A01(r0);
            }
        }
    }
}
