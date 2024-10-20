package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.5ln, reason: invalid class name */
/* loaded from: 5ln.class */
public final class C5ln implements C5lk {
    public static final C5ln A00 = new Object();

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        Integer nullableInteger;
        String string;
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger2 = r0.mResultSet.getNullableInteger(i, 58);
        C7Ze c7Ze = null;
        if (((nullableInteger2 != null && nullableInteger2.intValue() == 2) || ((nullableInteger = r0.mResultSet.getNullableInteger(i, 59)) != null && nullableInteger.intValue() == 2)) && (string = r0.mResultSet.getString(i, 57)) != null) {
            String A03 = ((0AC) 1Bi.A03(46)).A03(r0.mResultSet.getNullableLong(i, 45), r0.mResultSet.getString(i, 48), r0.mResultSet.getString(i, 49));
            if (A03 != null) {
                String string2 = r0.mResultSet.getString(i, 50);
                if (string2 == null) {
                    string2 = "image/*";
                }
                c7Ze = new C7Ze();
                c7Ze.A08 = string;
                String string3 = r0.mResultSet.getString(i, 52);
                if (string3 == null) {
                    string3 = "";
                }
                c7Ze.A07 = string3;
                Long nullableLong = r0.mResultSet.getNullableLong(i, 25);
                if (nullableLong == null) {
                    nullableLong = 0L;
                }
                c7Ze.A00 = nullableLong.longValue();
                5wW r02 = new 5wW();
                r02.A04(A03);
                Integer nullableInteger3 = r0.mResultSet.getNullableInteger(i, 47);
                if (nullableInteger3 == null) {
                    nullableInteger3 = 0;
                }
                r02.A03 = nullableInteger3.intValue();
                Integer nullableInteger4 = r0.mResultSet.getNullableInteger(i, 46);
                if (nullableInteger4 == null) {
                    nullableInteger4 = 0;
                }
                r02.A02 = nullableInteger4.intValue();
                r02.A02(string2);
                r02.A0H = string2.equals("image/gif");
                c7Ze.A01 = new Photo(r02);
                c7Ze.A02 = 0S2.A0C;
            }
        }
        return c7Ze;
    }
}
