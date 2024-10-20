package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharing.broadcastflow.model.SendState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Bzh.class */
public final class Bzh {
    public AnonymousClass555 A00(Context context, ThreadKey threadKey, Csv csv, Csw csw, SendState sendState, DID did, DIq dIq, MigColorScheme migColorScheme, String str) {
        CharSequence text;
        C4u c4u = (C4u) 1Bn.A0A(84101);
        int ordinal = sendState.ordinal();
        boolean z = true;
        if (ordinal == 7) {
            text = context.getText(2131965752);
        } else {
            if (ordinal == 2 || ordinal == 13 || ordinal == 12) {
                if (sendState != SendState.CHECKED) {
                    z = false;
                }
                return 5A0.A00(new RsH(threadKey, csv, csw, did, dIq, this, str), migColorScheme, z);
            }
            if (ordinal != 1) {
                throw 1BK.A0i("Invalid SendState ", sendState.name());
            }
            text = "";
        }
        c4u.A02 = text;
        c4u.A03 = false;
        c4u.A01 = migColorScheme;
        return c4u.A00();
    }
}
