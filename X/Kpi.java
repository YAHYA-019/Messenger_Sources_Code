package X;

import org.json.JSONException;

/* loaded from: Kpi.class */
public final class Kpi {
    public final Kh1 A00;
    public final LUZ A01;
    public final 1Br A02;

    public Kpi(LUZ luz) {
        this.A01 = luz;
        1Br A0D = 1BK.A0D();
        this.A02 = A0D;
        this.A00 = new Kh1(1Br.A02(A0D));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0043. Please report as an issue. */
    public final void postMessage(String str) {
        LUZ luz;
        Kh1 kh1;
        String str2;
        EnumC11554wt enumC11554wt;
        1UG A08;
        0DA r306;
        String str3;
        11T.A0F(str, 0);
        try {
            String optString = DKC.A1F(str).optString("event_name", "UNKNOWN_ERROR");
            LCd.A03("BwPayPalWebMessageListener", 0Pz.A0v("Received message ", str, ", for event ", optString), new Object[0]);
            boolean z = false;
            if (optString != null) {
                switch (optString.hashCode()) {
                    case -1017195997:
                        if (optString.equals("IABPaypalButtonVisible")) {
                            luz = this.A01;
                            z = true;
                            luz.A00(z);
                            return;
                        }
                        break;
                    case -707162418:
                        if (optString.equals("IABPaypalButtonNotVisible")) {
                            luz = this.A01;
                            luz.A00(z);
                            return;
                        }
                        break;
                    case 111025781:
                        if (optString.equals("IABPaypalButtonIframeDetected")) {
                            kh1 = this.A00;
                            str2 = this.A01.A06;
                            AbstractC11534wr.A00 = kh1.A01;
                            enumC11554wt = EnumC11554wt.A0H;
                            KXs.A00(enumC11554wt);
                            A08 = 1BK.A08(kh1.A00, "client_poll_acctlinkingiabinteraction_success");
                            if (A08.isSampled()) {
                                r306 = new 0DA();
                                str3 = "webview";
                                JR2.A0e(r306, str3, str2);
                                JQz.A1C(enumC11554wt, r306, A08, kh1.A01);
                                A08.BZL();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1846120355:
                        if (optString.equals("IABPaypalButtonWillBeClicked")) {
                            LUZ luz2 = this.A01;
                            kh1 = luz2.A02;
                            str2 = luz2.A06;
                            AbstractC11534wr.A00 = kh1.A01;
                            enumC11554wt = EnumC11554wt.A0H;
                            KXs.A00(enumC11554wt);
                            A08 = 1BK.A08(kh1.A00, "client_collapse_acctlinkingiabinteraction_atomic");
                            if (A08.isSampled()) {
                                r306 = new 0DA();
                                str3 = "iab_footer";
                                JR2.A0e(r306, str3, str2);
                                JQz.A1C(enumC11554wt, r306, A08, kh1.A01);
                                A08.BZL();
                                return;
                            }
                            return;
                        }
                        break;
                }
            }
            LCd.A05("BwPayPalWebMessageListener", 0Pz.A0W("Unknown event ", optString), new Object[0]);
        } catch (JSONException unused) {
            LCd.A05("BwPayPalWebMessageListener", 0Pz.A0W("Ill-formatted message ", str), new Object[0]);
        }
    }
}
