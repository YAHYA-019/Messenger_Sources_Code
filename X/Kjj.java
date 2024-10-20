package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.facebook.acra.constants.ActionId;
import java.security.NoSuchAlgorithmException;

/* loaded from: Kjj.class */
public final class Kjj {
    public final Kox A00;
    public final L8E A01;
    public final String A02;

    public Kjj(Context context, Kox kox) {
        int length;
        String str;
        this.A02 = context.getPackageName();
        this.A00 = kox;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (length = signatureArr.length) != 0) {
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
                        this.A01 = new L8E(context, Kb6.A00, Kxg.A00, kox);
                        return;
                    } while (i < length);
                }
                Kox kox2 = Kb8.A00;
                if (android.util.Log.isLoggable("PlayCore", 5)) {
                    JQx.A1Q(kox2.A00, " : ", "Phonesky package is not signed -- possibly self-built package. Could not verify.", "PlayCore");
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", 0Pz.A0j(kox.A00, " : ", "Phonesky is not installed."));
        }
    }
}
