package X;

/* renamed from: X.5t0, reason: invalid class name */
/* loaded from: 5t0.class */
public final class C5t0 implements C5lk {
    public static final C5t0 A00 = new Object();

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        int integer = r0.mResultSet.getInteger(i, 53);
        String string = r0.mResultSet.getString(i, 52);
        if (string == null) {
            return null;
        }
        return 5uE.A00(string, integer);
    }
}
