package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: X.0sH, reason: invalid class name */
/* loaded from: 0sH.class */
public final class C0sH extends 10E {
    public C0sH() {
        ((10E) this).A00 = 0S2.A01;
    }

    public Boolean A00(Context context, Uri uri) {
        boolean z;
        0EV r0 = new 0EV();
        r0.A01 = 02P.A00();
        0EW A00 = r0.A00();
        try {
            String authority = uri.getAuthority();
            String scheme = uri.getScheme();
            0EY r305 = null;
            if (authority == null) {
                uri.getHost();
            } else if (scheme != null && scheme.equals("content")) {
                ProviderInfo A002 = 0EB.A00(context, authority, 0);
                if (A002 == null) {
                    throw AnonymousClass001.A0V(0Pz.A0W("Unable to get providerInfo for authority ", authority));
                }
                r305 = 0EY.A01(context, ((PackageItemInfo) A002).packageName, true);
            }
            0EW.A01(context, (C0w6) null, r305, A00);
            z = true;
        } catch (SecurityException unused) {
            z = false;
        }
        return Boolean.valueOf(!z);
    }
}
