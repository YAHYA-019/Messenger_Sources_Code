package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.base.activity.FbFragmentActivity;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: F2v.class */
public abstract class F2v {
    public static final C00i A00 = 1BQ.A02(49473);

    public static void A00(Context context, FbFragmentActivity fbFragmentActivity, GHY ghy, 53U r304) {
        Integer num;
        if (r304.BNJ("android.permission.CAMERA")) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                if (!packageManager.hasSystemFeature(7zK.A00(9)) && !packageManager.hasSystemFeature(GOm.A00(51)) && !packageManager.hasSystemFeature(GOm.A00(52))) {
                    ghy.Bxk(0S2.A00);
                }
                File A0C = ((AnonymousClass536) A00.get()).A0C(0Pz.A0W("BloksMedia_", DateFormat.getDateTimeInstance().format(new Date())), ".jpg");
                if (A0C != null) {
                    try {
                        11I r0 = new 11I();
                        r0.A04 = A0C;
                        Uri A002 = C10n.A00(context, r0.A08(), new 0SI());
                        fbFragmentActivity.A5D(new C2057Dai(0, fbFragmentActivity, ghy, A0C));
                        try {
                            Intent A0A = 4YU.A0A(AnonymousClass000.A00(45));
                            A0A.putExtra("output", A002);
                            0LS.A08(fbFragmentActivity, A0A, 1);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            ghy.Bxk(0S2.A0N);
                            A0C.delete();
                            return;
                        }
                    } catch (IOException unused2) {
                        ghy.Bxk(0S2.A0N);
                        A0C.delete();
                        return;
                    }
                }
            }
            num = 0S2.A0N;
        } else {
            num = 0S2.A01;
        }
        ghy.Bxk(num);
    }
}
