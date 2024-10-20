package X;

import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;

/* loaded from: BRy.class */
public abstract class BRy {
    public static boolean A00(FirstPartySsoSessionInfo firstPartySsoSessionInfo) {
        if (1JF.A0B(firstPartySsoSessionInfo.A05)) {
            return (1JF.A0B(firstPartySsoSessionInfo.A00("secret")) || 1JF.A0B(firstPartySsoSessionInfo.A00("machine_id"))) ? false : true;
        }
        return true;
    }
}
