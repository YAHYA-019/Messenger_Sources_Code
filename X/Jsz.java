package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import org.json.JSONObject;

/* loaded from: Jsz.class */
public final class Jsz extends C04v {
    public final KNV A00;
    public final C87v A01;
    public final String A02;
    public final String A03;

    public Jsz(KNV knv, C87v c87v, String str, String str2) {
        7zR.A1N(str, str2);
        this.A03 = str;
        this.A00 = knv;
        this.A02 = str2;
        this.A01 = c87v;
    }

    public final String A00() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put(ErrorReportingConstants.USER_ID_KEY, this.A03);
        A12.put("at", this.A00.typeName);
        A12.put("credentialId", this.A02);
        A12.put("prfInput", ((Jt2) this.A01.A00).A00());
        return 11T.A02(A12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsz)) {
                return false;
            }
            Jsz jsz = (Jsz) obj;
            if (!11T.A0O(this.A03, jsz.A03) || this.A00 != jsz.A00 || !11T.A0O(this.A02, jsz.A02) || !11T.A0O(this.A01, jsz.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A07(this.A02, AnonymousClass002.A05(this.A00, 4YV.A02(this.A03))));
    }
}
