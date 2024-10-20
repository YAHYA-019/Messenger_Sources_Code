package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rollcall.model.RollCallArgs;

/* renamed from: X.9gE, reason: invalid class name */
/* loaded from: 9gE.class */
public final class C9gE {
    public C8yy A00;
    public boolean A01;
    public final Context A02;
    public final LiveData A03;
    public final MutableLiveData A04;
    public final FbUserSession A05;
    public final 1Br A06 = 7zM.A0Z();
    public final RollCallArgs A07;

    public C9gE(Context context, FbUserSession fbUserSession, RollCallArgs rollCallArgs) {
        this.A02 = context;
        this.A07 = rollCallArgs;
        this.A05 = fbUserSession;
        MutableLiveData A0H = 7zL.A0H();
        this.A04 = A0H;
        this.A03 = A0H;
    }

    public static final Uri A00(C9gE c9gE, String str) {
        Uri uri;
        String path = c9gE.A02.getCacheDir().getPath();
        11T.A0A(path);
        if (0CU.A0T(str, path, false)) {
            uri = Uri.fromFile(AnonymousClass001.A0E(str));
        } else {
            uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
            if (uri == null) {
                return Uri.parse("");
            }
        }
        return uri;
    }
}
