package X;

import android.net.Uri;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: X.4yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4yi.class */
public final class C12044yi {
    public final C0dp A00;
    public final FbSharedPreferences A01;
    public final WeakHashMap A02;

    public C12044yi() {
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        this.A01 = fbSharedPreferences;
        this.A02 = new WeakHashMap();
        this.A00 = c0dp;
    }

    public static 1G2 A00(String str, String str2) {
        1G3 A0D = 4EK.A01.A0D(Uri.encode(str));
        if (str2 != null) {
            A0D = A0D.A0D(0Pz.A0W("/", Uri.encode(str2)));
        }
        return A0D.A0D("/count");
    }

    public static 1G2 A01(String str, String str2) {
        1G3 A0D = 4EK.A01.A0D(Uri.encode(str));
        if (str2 != null) {
            A0D = A0D.A0D(0Pz.A0W("/", Uri.encode(str2)));
        }
        return A0D.A0D("/timestamp");
    }

    public static void A02(C12044yi c12044yi) {
        Iterator it = c12044yi.A02.keySet().iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onUiCounterChanged");
        }
    }

    public int A03(String str, String str2) {
        return this.A01.ArU(A00(str, str2), 0);
    }

    public long A04(String str, String str2) {
        return this.A01.Av1(A01(str, str2), 0L);
    }

    public void A05(String str, String str2) {
        1Ql edit = this.A01.edit();
        edit.Cdj(A00(str, str2));
        edit.Cdj(A01(str, str2));
        edit.commit();
        A02(this);
    }

    public void A06(String str, String str2) {
        int A03 = A03(str, str2);
        1Ql edit = this.A01.edit();
        edit.CaE(A00(str, str2), A03 + 1);
        edit.CaH(A01(str, str2), this.A00.now());
        edit.commit();
        A02(this);
    }
}
