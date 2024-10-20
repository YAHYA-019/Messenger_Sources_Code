package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.3T0, reason: invalid class name */
/* loaded from: 3T0.class */
public final class C3T0 {
    public final C00i A01 = 1BQ.A02(16634);
    public final C00i A00 = 1BQ.A02(33032);

    public static final C3T0 A00() {
        return new C3T0();
    }

    public static void A01(C3T0 c3t0, String str, java.util.Map map) {
        1UG A00 = 1UD.A00(1BK.A07(c3t0.A01), 1ZG.A03, "messenger_fb4a_reg_experiment");
        if (A00.isSampled()) {
            A00.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
            String A02 = ((1H2) c3t0.A00.get()).A02();
            String str2 = null;
            if (!TextUtils.isEmpty(A02)) {
                try {
                    str2 = 0KC.A00(A02).toUpperCase(Locale.US);
                } catch (RuntimeException unused) {
                }
            }
            A00.A7R("hash_device_id", str2);
            A00.A6J("extra_client_info", map);
            A00.BZL();
        }
    }

    public void A02(Integer num) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(Property.SYMBOL_Z_ORDER_SOURCE, 3GS.A00(num).toLowerCase(Locale.US));
        A01(this, "create_account_clicked", A0u);
    }
}
