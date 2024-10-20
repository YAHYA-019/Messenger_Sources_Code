package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;

/* loaded from: KW2.class */
public abstract class KW2 {
    public static final boolean A00(AutofillData autofillData) {
        if (autofillData == null) {
            return false;
        }
        java.util.Map map = autofillData.A00;
        String A0b = AnonymousClass001.A0b("given-name", map);
        if (A0b != null && A0b.length() != 0) {
            return true;
        }
        String A0b2 = AnonymousClass001.A0b("family-name", map);
        if (A0b2 != null && A0b2.length() != 0) {
            return true;
        }
        String A0b3 = AnonymousClass001.A0b("address-line1", map);
        return (A0b3 == null || A0b3.length() == 0) ? false : true;
    }
}
