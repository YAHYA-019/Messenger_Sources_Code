package X;

/* renamed from: X.5t6, reason: invalid class name */
/* loaded from: 5t6.class */
public final class C5t6 implements C5lk {
    public static final C5t6 A00 = new Object();

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        if (c5pu == null) {
            return null;
        }
        1qX r0 = (1qX) c5pu;
        if (r0.mResultSet.getCount() == 0 || c5pu.AXc(0) != 7 || 11T.A0O(r0.mResultSet.getNullableBoolean(0, 180), false)) {
            return null;
        }
        5wA r02 = new 5wA();
        String string = r0.mResultSet.getString(0, 182);
        if (string == null) {
            string = "";
        }
        r02.A00 = string;
        return r02;
    }
}
