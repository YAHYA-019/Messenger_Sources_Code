package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.inject.FbInjector;

/* loaded from: Et7.class */
public final class Et7 {
    public final Context A00 = FbInjector.A00();
    public final C00i A01 = AbH.A0D();

    public void A00(String str) {
        Context context = this.A00;
        Intent A0A = 4YU.A0A(context.getPackageManager().checkPermission(AnonymousClass000.A00(15), context.getPackageName()) == 0 ? "android.intent.action.CALL" : "android.intent.action.DIAL");
        A0A.setFlags(268435456);
        Uri uri = null;
        try {
            uri = C0A2.A03(0Pz.A0W("tel:", str != null ? str.replaceAll("#", "%23") : null));
        } catch (SecurityException unused) {
        }
        A0A.setData(uri);
        DKC.A0f(this.A01).A03().A0A(context, A0A);
    }
}
