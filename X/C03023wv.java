package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.3wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wv.class */
public final class C03023wv implements 1fG {
    public static boolean A00(Context context) {
        return C03033ww.A00();
    }

    public 1fB AJ8(C1fI c1fI, C1hi c1hi) {
        int[] AZt = c1fI.AZt(c1hi);
        if (AZt.length == 0) {
            return null;
        }
        int i = 4112;
        if (AZt[0] >= 90) {
            i = 4099;
        }
        AZt[0] = i;
        return new 4QC(new C03033ww(), AZt, c1hi.A00);
    }

    public int B3C() {
        return 6;
    }

    public int B3D() {
        return 8;
    }

    public String toString() {
        String str = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "huawei");
            jSONObject.put("framework", "UniPerf");
            jSONObject.put("extra", str);
            jSONObject.put("access", C03033ww.A02.A04());
            str = jSONObject.toString();
        } catch (Exception unused) {
        }
        return str;
    }
}
