package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.samsung.android.os.SemPerfManager;
import org.json.JSONObject;

/* renamed from: X.2t4, reason: invalid class name */
/* loaded from: 2t4.class */
public final class C2t4 implements 1fG {
    public static boolean A00;

    public static boolean A00(Context context) {
        boolean A01 = C2t5.A01();
        if (A01) {
            A00 = C2t5.A00();
        }
        return A01;
    }

    public 1fB AJ8(C1fI c1fI, C1hi c1hi) {
        int[] AZt = c1fI.AZt(c1hi);
        if (AZt.length == 0) {
            return null;
        }
        boolean z = false;
        if (AZt[0] > 50 && A00) {
            z = true;
        }
        final int i = c1hi.A00;
        final boolean z2 = z;
        return new 3vL(i, z2) { // from class: X.4Et
            public final boolean A00;

            {
                this.A00 = z2;
            }

            public void A04() {
                if (this.A00) {
                    SemPerfManager.onSmoothScrollEvent(false);
                } else {
                    SemPerfManager.onScrollEvent(false);
                }
            }

            public final boolean A05() {
                if (this.A00) {
                    SemPerfManager.onSmoothScrollEvent(true);
                    return true;
                }
                SemPerfManager.onScrollEvent(true);
                return true;
            }
        };
    }

    public int B3C() {
        return 3;
    }

    public int B3D() {
        return 2;
    }

    public String toString() {
        String str = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "samsung");
            jSONObject.put("framework", "SemPerfManager");
            jSONObject.put("extra", A00 ? "partial" : str);
            jSONObject.put("access", C2t5.A00.A04());
            str = jSONObject.toString();
        } catch (Exception unused) {
        }
        return str;
    }
}
