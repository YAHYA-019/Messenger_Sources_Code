package X;

import android.net.Uri;
import android.util.Base64;
import com.facebook.acra.constants.ActionId;

/* loaded from: Kyz.class */
public final class Kyz {
    public static final LAG A00;
    public static final LAG A01;
    public static final LAG A02;
    public static final LAG A03;
    public static final LAG A04;
    public static final LAG A05;
    public static final LAG A06;
    public static final LAG A07;
    public static final LAG A08;
    public static final LAG A09;
    public static final LAG A0A;
    public static final LAG A0B;
    public static final LAG A0C;

    static {
        Uri uri;
        synchronized (Kaw.class) {
            C04r c04r = Kaw.A00;
            uri = (Uri) c04r.get("com.google.android.gms.auth_account");
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                c04r.put("com.google.android.gms.auth_account", uri);
            }
        }
        if (!"".isEmpty()) {
            throw AnonymousClass001.A0N("Cannot set GServices prefix and skip GServices");
        }
        Ki4 ki4 = new Ki4(uri);
        Double valueOf = Double.valueOf(0.0d);
        A00 = new LAG(ki4, valueOf, "getTokenRefactor__account_data_service_sample_percentage");
        Boolean A0K = AnonymousClass001.A0K();
        A01 = new LAG(ki4, A0K, "getTokenRefactor__account_data_service_tokenAPI_usable");
        Long valueOf2 = Long.valueOf(20);
        A02 = new LAG(ki4, valueOf2, "getTokenRefactor__account_manager_timeout_seconds");
        A03 = new LAG(ki4, 4YV.A0j(), "getTokenRefactor__android_id_shift");
        try {
            A04 = new K5M(ki4, Kxd.A00, K5W.A01(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)));
            A05 = new LAG(ki4, A0K, "getTokenRefactor__chimera_get_token_evolved");
            A06 = new LAG(ki4, valueOf2, "getTokenRefactor__clear_token_timeout_seconds");
            A07 = new LAG(ki4, valueOf2, "getTokenRefactor__default_task_timeout_seconds");
            Boolean A0d = 1BK.A0d();
            A08 = new LAG(ki4, A0d, "getTokenRefactor__gaul_accounts_api_evolved");
            A09 = new LAG(ki4, A0d, "getTokenRefactor__gaul_token_api_evolved");
            A0A = new LAG(ki4, Long.valueOf(ActionId.VIDEO_SET_RENDERER_CONTEXT), "getTokenRefactor__get_token_timeout_seconds");
            A0B = new LAG(ki4, A0K, "getTokenRefactor__gms_account_authenticator_evolved");
            A0C = new LAG(ki4, valueOf, "getTokenRefactor__gms_account_authenticator_sample_percentage");
        } catch (Exception unused) {
            throw AnonymousClass001.A0J("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n");
        }
    }
}
