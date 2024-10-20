package X;

import android.net.Uri;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* renamed from: X.5lp, reason: invalid class name */
/* loaded from: 5lp.class */
public final class C5lp implements C5lk {
    public static final C5lp A00 = new Object();
    public static final Set A01 = 02H.A02(new Integer[]{1, 6, 3});

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        if (r0.mResultSet.getString(i, 57) == null || !0QD.A0k(A01, r0.mResultSet.getNullableInteger(i, 41)) || r0.mResultSet.getString(i, 48) == null) {
            return null;
        }
        C5fp c5fp = new C5fp();
        Uri A02 = ((5wX) 1Bi.A03(67176)).A02(r303, i);
        if (A02 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        String obj = A02.toString();
        11T.A0A(obj);
        5wW r02 = new 5wW();
        String string = r0.mResultSet.getString(i, 57);
        if (string == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        r02.A01(string);
        String string2 = r0.mResultSet.getString(i, 50);
        r02.A0H = string2 != null ? 0CU.A0T(string2, "gif", false) : false;
        String string3 = r0.mResultSet.getString(i, 50);
        if (string3 == null) {
            string3 = "";
        }
        r02.A02(string3);
        r02.A03(obj);
        Integer nullableInteger = r0.mResultSet.getNullableInteger(i, 46);
        if (nullableInteger == null) {
            nullableInteger = 0;
        }
        r02.A00 = nullableInteger.intValue();
        Integer nullableInteger2 = r0.mResultSet.getNullableInteger(i, 47);
        if (nullableInteger2 == null) {
            nullableInteger2 = 0;
        }
        r02.A01 = nullableInteger2.intValue();
        r02.A04(obj);
        Integer nullableInteger3 = r0.mResultSet.getNullableInteger(i, 46);
        if (nullableInteger3 == null) {
            nullableInteger3 = 0;
        }
        r02.A02 = nullableInteger3.intValue();
        Integer nullableInteger4 = r0.mResultSet.getNullableInteger(i, 47);
        if (nullableInteger4 == null) {
            nullableInteger4 = 0;
        }
        r02.A03 = nullableInteger4.intValue();
        ImmutableList of = ImmutableList.of((Object) new Photo(r02));
        11T.A0A(of);
        c5fp.A00 = of;
        return c5fp;
    }
}
