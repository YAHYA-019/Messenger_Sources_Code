package com.facebook.android.instantexperiences.autofill.model;

import X.LGo;
import X.Lyd;
import android.os.Parcelable;
import java.util.Set;

/* loaded from: AddressAutofillData.class */
public final class AddressAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A00 = new Lyd(0);
    public static final Parcelable.Creator CREATOR = LGo.A00(90);

    public static final boolean A00(String str, StringBuilder sb) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (sb.length() > 0) {
            sb.append(" ");
        }
        sb.append(str);
        return true;
    }
}
