package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;

/* loaded from: L6D.class */
public final class L6D {
    public static final String A00(SparseArray sparseArray) {
        boolean z = sparseArray.get(10) instanceof Country;
        Object obj = sparseArray.get(10);
        if (!z) {
            DKC.A1U(obj);
            return (String) obj;
        }
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.common.locale.Country");
        String country = ((LocaleMember) obj).A00.getCountry();
        11T.A0D(country);
        return country;
    }

    public static final String A01(SparseArray sparseArray) {
        String obj = sparseArray.get(13).toString();
        if (obj != null) {
            return 0CV.A0W(obj, "\\s+", "");
        }
        throw 1BK.A0h();
    }
}
