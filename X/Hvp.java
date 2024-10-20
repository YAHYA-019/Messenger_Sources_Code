package X;

import android.content.Context;
import android.telecom.TelecomManager;
import java.lang.reflect.Method;

/* loaded from: Hvp.class */
public final class Hvp {
    public static final void A00(Context context) {
        IDO ido = IDO.A00;
        ido.A03("RtcSelfManagedConnectionManager", "unregisterPhoneAccounts", (Throwable) null);
        try {
            Object systemService = context.getSystemService("telecom");
            if (systemService == null) {
                throw 1BK.A0h();
            }
            TelecomManager telecomManager = (TelecomManager) systemService;
            Method method = TelecomManager.class.getMethod("clearPhoneAccounts", new Class[0]);
            11T.A0A(method);
            method.invoke(telecomManager, new Object[0]);
        } catch (Exception e) {
            ido.A04("RtcSelfManagedConnectionManager", "Failed to unregister phone accounts", e);
        }
    }
}
