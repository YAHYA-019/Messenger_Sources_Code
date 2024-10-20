package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.3vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vw.class */
public final class C02693vw implements 1fG {
    public static boolean A00;

    public static boolean A00(Context context) {
        boolean A03 = C02703vx.A03();
        if (A03) {
            A00 = C02703vx.A02();
        }
        return A03;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.3vx, java.lang.Object] */
    public 1fB AJ8(C1fI c1fI, C1hi c1hi) {
        int[] AZt = c1fI.AZt(c1hi);
        if (AZt.length == 0) {
            return null;
        }
        boolean z = false;
        if (AZt[0] > 50 && A00) {
            z = true;
        }
        return new 4QD((C02703vx) new Object(), c1hi.A00, z);
    }

    public int B3C() {
        return 4;
    }

    public int B3D() {
        return 2;
    }

    public String toString() {
        String str = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "samsung");
            jSONObject.put("framework", "DVFSHelper");
            jSONObject.put("extra", A00 ? "partial" : str);
            jSONObject.put("access", C02703vx.A00.A04());
            str = jSONObject.toString();
        } catch (Exception unused) {
        }
        return str;
    }
}
