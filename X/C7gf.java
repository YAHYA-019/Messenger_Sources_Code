package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7gf, reason: invalid class name */
/* loaded from: 7gf.class */
public final class C7gf extends Gzi {
    @Override // X.Gzi, X.AnonymousClass469
    public Uri A01(Context context) {
        11T.A0F(context, 0);
        File file = (File) this.A02.A00();
        if (file == null) {
            return null;
        }
        try {
            11I r0 = new 11I();
            r0.A04 = file;
            Uri A00 = C10n.A00(context, r0.A08(), new 0SI());
            context.grantUriPermission("com.android.systemui", A00, 1);
            return A00;
        } catch (IOException e) {
            0fH.A0r("RemoteNotificationSound", "Error sharing remote notification sound uri", e);
            return null;
        }
    }
}
