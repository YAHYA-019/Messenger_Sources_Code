package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.2w9, reason: invalid class name */
/* loaded from: 2w9.class */
public final class C2w9 {
    public 3Fe A00;
    public String A01;
    public final 1Br A04 = 1Bq.A00(16385);
    public final 1Br A03 = 1Bq.A00(16511);
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final Runnable A05 = new 2wA(this);

    public static final String A00(C2w9 c2w9, String str) {
        String str2;
        Uri A01 = C0A2.A01(new AnonymousClass488(1Br.A04(c2w9.A03), AnonymousClass000.A00(ActionId.OFFLINE)), str);
        if (A01 == null) {
            return null;
        }
        String scheme = A01.getScheme();
        if (scheme == null || !scheme.equals("fbrpc")) {
            str2 = 0CV.A0b(str, "https://l.", false) ? "u" : "target_url";
            return str;
        }
        str = A01.getQueryParameter(str2);
        return str;
    }
}
