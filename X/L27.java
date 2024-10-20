package X;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Arrays;
import java.util.List;

/* loaded from: L27.class */
public final class L27 {
    public static final Pair A02 = GOn.A0G(7zN.A0h(), "TRUSTED");
    public static final List A03 = Arrays.asList("StellaCallingService", "StellaMessagingService", "StellaContactsService");
    public C00i A00;
    public final 0EW A01;

    public L27(0EW r302) {
        this.A01 = r302;
    }

    public Pair A00(Context context, Intent intent, FbUserSession fbUserSession) {
        String A00;
        0fH.A0l("StellaTrustedCallerHelper", "Checking whether intent is trusted or not");
        this.A00 = 1BV.A00(49702);
        0fH.A0l("StellaTrustedCallerHelper", "Checking whether intent is trusted or not");
        Integer num = 8;
        if (!this.A01.A02(context, intent, (C0w6) null)) {
            A00 = "Caller app is not trusted";
        } else {
            if (((1G1) fbUserSession).A07) {
                num = 14;
                A00 = "App is not logged in";
                return GOn.A0G(num, A00);
            }
            C00i c00i = this.A00;
            c00i.getClass();
            if (((5O1) c00i.get()).A00()) {
                return A02;
            }
            A00 = 4YT.A00(805);
        }
        0fH.A0n("StellaTrustedCallerHelper", A00);
        return GOn.A0G(num, A00);
    }
}
