package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;

/* loaded from: KW3.class */
public abstract class KW3 {
    public static final boolean A00(C11424wg c11424wg, AutofillData autofillData) {
        boolean z = false;
        1BK.A1M(autofillData, c11424wg);
        String str = c11424wg.A03.A00;
        boolean z2 = false;
        if (str != null) {
            CharSequence charSequence = (CharSequence) JQz.A0v(autofillData).get(str);
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            z = !z2;
        }
        return z;
    }
}
