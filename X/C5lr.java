package X;

/* renamed from: X.5lr, reason: invalid class name */
/* loaded from: 5lr.class */
public final class C5lr implements C5lk {
    public static final C5lr A00 = new Object();

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        Integer nullableInteger;
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        if (r0.mResultSet.getString(i, 57) == null || (nullableInteger = r0.mResultSet.getNullableInteger(i, 41)) == null || nullableInteger.intValue() != 4 || r0.mResultSet.getNullableLong(i, 40) == null) {
            return null;
        }
        C5w5 c5w5 = new C5w5();
        Long nullableLong = r0.mResultSet.getNullableLong(i, 40);
        if (nullableLong == null) {
            throw 1BK.A0e();
        }
        c5w5.A06(String.valueOf(nullableLong.longValue()));
        return c5w5;
    }
}
