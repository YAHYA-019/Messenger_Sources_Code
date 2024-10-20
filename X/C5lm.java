package X;

import android.content.res.Resources;

/* renamed from: X.5lm, reason: invalid class name */
/* loaded from: 5lm.class */
public final class C5lm implements C5lk {
    public static final C5lm A01 = new Object();
    public static final 1Br A00 = 1Bq.A00(67196);

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        Integer nullableInteger;
        String string;
        Long nullableLong;
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger2 = r0.mResultSet.getNullableInteger(i, 58);
        if ((nullableInteger2 == null || nullableInteger2.intValue() != 2) && ((nullableInteger = r0.mResultSet.getNullableInteger(i, 59)) == null || nullableInteger.intValue() != 2)) {
            return null;
        }
        String string2 = r0.mResultSet.getString(i, 57);
        if (string2 != null && string2.length() != 0 && (string = r0.mResultSet.getString(i, 48)) != null && string.length() != 0 && ((nullableLong = r0.mResultSet.getNullableLong(i, 45)) == null || nullableLong.longValue() > System.currentTimeMillis())) {
            return null;
        }
        5wA r02 = new 5wA();
        String string3 = ((Resources) A00.A00.get()).getString(2131966457);
        11T.A0A(string3);
        r02.A00 = string3;
        return r02;
    }
}
