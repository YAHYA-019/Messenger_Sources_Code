package X;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* loaded from: F1l.class */
public final class F1l {
    public static boolean A00(PackageInfo packageInfo, List list) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return false;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            int length = signatureArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return false;
                }
                Signature signature = signatureArr[i2];
                messageDigest.reset();
                messageDigest.update(signature.toByteArray());
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 3);
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (encodeToString.equals(list.get(i3))) {
                        return true;
                    }
                }
                i = i2 + 1;
            }
        } catch (NoSuchAlgorithmException unused) {
            0fH.A0k("Facebook-IntentUriHandler", "Failed to instantiate SHA-1 algorithm.");
            return false;
        }
    }
}
