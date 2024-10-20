package X;

import android.app.KeyguardManager;
import android.content.Context;

/* loaded from: Kvx.class */
public abstract class Kvx {
    public static final void A00(Context context, C9af c9af) {
        11T.A0H(context, c9af);
        Object systemService = context.getSystemService("keyguard");
        11T.A0I(systemService, GOm.A00(79));
        c9af.A01("is_device_secure_after", (((KeyguardManager) systemService).isDeviceSecure() ? 0S2.A00 : 0S2.A01).intValue() != 0 ? "not_secure" : "secure");
    }

    public static final void A01(Context context, C9af c9af) {
        11T.A0F(context, 0);
        Object systemService = context.getSystemService("keyguard");
        11T.A0I(systemService, GOm.A00(79));
        c9af.A01("is_device_secure_before", (((KeyguardManager) systemService).isDeviceSecure() ? 0S2.A00 : 0S2.A01).intValue() != 0 ? "not_secure" : "secure");
    }
}
