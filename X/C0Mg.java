package X;

import android.os.Bundle;

/* renamed from: X.0Mg, reason: invalid class name */
/* loaded from: 0Mg.class */
public abstract class C0Mg {
    public static final C0Mg A03 = new C0tz(0);
    public static final C0Mg A01 = new C0tz(1);
    public static final C0Mg A00 = new C0tz(2);
    public static final C0Mg A02 = new C0tz(3);

    public abstract Class A00();

    public void A01(Bundle bundle, 0Mi r303, String str, String str2) {
        Object string;
        try {
            switch (((C0tz) this).A00) {
                case 0:
                    string = bundle.getString(str, null);
                    break;
                case 1:
                    string = Integer.valueOf(bundle.getInt(str, 0));
                    break;
                case 2:
                    string = Boolean.valueOf(bundle.getBoolean(str, false));
                    break;
                case 3:
                    string = Long.valueOf(bundle.getLong(str, Long.MAX_VALUE));
                    break;
                default:
                    string = null;
                    break;
            }
            0fH.A0f(string, str, "KeyValueWrapper", "bundleToPreferences got %s for key %s");
            A03(r303, string, str2);
        } catch (ClassCastException e) {
            0fH.A0r("KeyValueWrapper", "bundleToPreferences got ClassCastException", e);
        }
    }

    public abstract void A02(Bundle bundle, Object obj, String str);

    public abstract void A03(0Mi r1, Object obj, String str);

    public abstract void A04(16W r1, C09D c09d, Object obj, String str);
}
