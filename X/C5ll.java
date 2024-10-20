package X;

import android.content.res.Resources;

/* renamed from: X.5ll, reason: invalid class name */
/* loaded from: 5ll.class */
public final class C5ll implements C5lk {
    public static final C5ll A01 = new Object();
    public static final 1Br A00 = 1Bq.A00(67196);

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger = r0.mResultSet.getNullableInteger(i, 60);
        if (nullableInteger == null) {
            throw 1BK.A0h();
        }
        int intValue = nullableInteger.intValue();
        if (intValue != 4 && intValue != 2 && intValue != 3) {
            return null;
        }
        5wA r02 = new 5wA();
        String string = r0.mResultSet.getString(i, 52);
        if (string == null) {
            string = ((Resources) A00.A00.get()).getString(2131959751);
        }
        11T.A0D(string);
        11T.A0F(string, 0);
        r02.A00 = string;
        return r02;
    }
}
