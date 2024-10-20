package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.collect.ImmutableList;

/* loaded from: C0n.class */
public final class C0n {
    public final 1Br A00 = 7zM.A0M();

    public final void A00(Context context, String str) {
        boolean A1W = 1BL.A1W(context, str);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            throw 1BK.A0h();
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.instagram.android");
        Intent A05 = AbG.A05();
        Uri uri = null;
        try {
            uri = C0A2.A03(0Pz.A0W("https://instagram.com/_u/", str));
        } catch (SecurityException unused) {
        }
        Intent putExtra = A05.setData(uri).putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", A1W);
        11T.A0A(putExtra);
        08O r0 = (08O) 1Br.A0B(this.A00);
        (launchIntentForPackage != null ? r0.A04() : r0.A03()).A0A(context, putExtra);
        AcP acP = (AcP) 1Lm.A05(context, 4YV.A0E(context), 84248);
        if (acP.A0K && acP.A0I() && acP.A0J) {
            CQb A02 = AcP.A02(acP);
            CQb.A06(BOZ.A0M, A02, A02.A07, (ImmutableList) null);
        }
    }
}
