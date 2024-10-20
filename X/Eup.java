package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.mapbox.mapboxsdk.BuildConfig;

/* loaded from: Eup.class */
public final class Eup {
    public final 1Br A00 = 1Bq.A00(83426);
    public final 1Br A04 = 1Bu.A00(100159);
    public final 1Br A03 = 1BK.A0C();
    public final 1Br A01 = AbG.A0M();
    public final 1Br A02 = 1Bq.A00(83605);

    public final String A00(C0et c0et, 1Ln r303, String str) {
        String A0W;
        11T.A0F(c0et, 0);
        if (1Br.A07(this.A03).AZk(2342153629115154891L)) {
            if (c0et == C0et.A0P) {
                c0et = C0et.A0C;
            }
            str = "";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        if (c0et == C0et.A0P) {
            A0W = "Orca-Android";
        } else {
            String name = c0et.name();
            A0W = (name == null || name.length() == 0) ? "" : 0CV.A0W(0CV.A0W(1JF.A06(name), "/", "-"), ";", "-");
        }
        A0k.append(" [");
        A0k.append(StringFormatUtil.formatStrLocaleSafe("%s/%s;", "FB_IAB", A0W));
        if (r303 != null) {
            A0k.append(StringFormatUtil.formatStrLocaleSafe("%s/%s;", "FBAV", BuildConfig.VERSION_NAME.length() == 0 ? "" : 0CV.A0W(0CV.A0W(1JF.A06(BuildConfig.VERSION_NAME), "/", "-"), ";", "-")));
        }
        if (str != null && str.length() != 0) {
            A0k.append(str);
        }
        A0k.append("]");
        return 11T.A02(A0k);
    }
}
