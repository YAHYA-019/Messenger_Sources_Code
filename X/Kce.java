package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Kce.class */
public abstract class Kce {
    public static final java.util.Map A00;
    public static final java.util.Map A01;
    public static final java.util.Map A02;

    static {
        HashMap A0u = AnonymousClass001.A0u();
        A00 = A0u;
        HashMap A0u2 = AnonymousClass001.A0u();
        A01 = A0u2;
        Integer A0h = 7zN.A0h();
        A0u.put(A0h, "Too many sessions are running for current app, existing sessions must be resolved first.");
        A0u.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        A0u.put(-3, "Request is otherwise invalid.");
        A0u.put(-4, "Requested session is not found.");
        A0u.put(-5, "Split Install API is not available.");
        A0u.put(-6, "Network error: unable to obtain split details.");
        A0u.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        A0u.put(-8, "Requested session contains modules from an existing active session and also new modules.");
        A0u.put(-9, "Service handling split install has died.");
        A0u.put(-10, "Install failed due to insufficient storage.");
        A0u.put(-11, "Signature verification error when invoking SplitCompat.");
        A0u.put(-12, "Error in SplitCompat emulation.");
        A0u.put(-13, "Error in copying files for SplitCompat.");
        A0u.put(-14, "The Play Store app is either not installed or not the official version.");
        A0u.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        A0u.put(-16, "The download is too large to start over the current connection.");
        A0u.put(-100, "Unknown error processing split install.");
        A0u2.put(A0h, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        A0u2.put(-2, "MODULE_UNAVAILABLE");
        A0u2.put(-3, "INVALID_REQUEST");
        A0u2.put(-4, "DOWNLOAD_NOT_FOUND");
        A0u2.put(-5, "API_NOT_AVAILABLE");
        A0u2.put(-6, "NETWORK_ERROR");
        A0u2.put(-7, "ACCESS_DENIED");
        A0u2.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        A0u2.put(-9, "SERVICE_DIED");
        A0u2.put(-10, "INSUFFICIENT_STORAGE");
        A0u2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        A0u2.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        A0u2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        A0u2.put(-14, "PLAY_STORE_NOT_FOUND");
        A0u2.put(-15, "APP_NOT_OWNED");
        A0u2.put(-16, "DOWNLOAD_TOO_LARGE");
        A02 = JR0.A0v(-100, "INTERNAL_ERROR", A0u2);
        Iterator A0x = AnonymousClass001.A0x(A0u2);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            A02.put(A0z.getValue(), A0z.getKey());
        }
    }
}
