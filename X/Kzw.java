package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.facebook.acra.constants.ActionId;
import java.security.NoSuchAlgorithmException;

/* loaded from: Kzw.class */
public final class Kzw {
    public static final Kov A02 = new Kov("ReviewService");
    public L8D A00;
    public final String A01;

    public Kzw(Context context) {
        int length;
        String str;
        this.A01 = context.getPackageName();
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    Kov kov = Kb7.A00;
                    if (android.util.Log.isLoggable("PlayCore", 5)) {
                        JQx.A1Q(kov.A00, " : ", "Phonesky package is not signed -- possibly self-built package. Could not verify.", "PlayCore");
                        return;
                    }
                    return;
                }
                int i = 0;
                do {
                    try {
                        str = JQy.A0t(signatureArr[i].toByteArray());
                    } catch (NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !1BJ.A00(ActionId.MESSENGER_QUEUE_CREATION).equals(str)) {
                            i++;
                        }
                    }
                    this.A00 = new L8D(context, 4YU.A0A("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), A02, Kxh.A00);
                    return;
                } while (i < length);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
