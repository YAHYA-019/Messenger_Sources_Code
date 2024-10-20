package X;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: X.7sn, reason: invalid class name */
/* loaded from: 7sn.class */
public abstract class C7sn {
    public static LocaleList A00(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void A01(LocaleList localeList, Object obj) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
