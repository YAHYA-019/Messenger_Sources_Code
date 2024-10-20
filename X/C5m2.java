package X;

/* renamed from: X.5m2, reason: invalid class name */
/* loaded from: 5m2.class */
public final class C5m2 implements C5kd {
    public static final C5m2 A00 = new Object();
    public static final C5g3 A01 = C5m3.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        String string;
        String string2;
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger = r0.mResultSet.getNullableInteger(i, 62);
        7Gr r312 = null;
        if (nullableInteger != null && nullableInteger.intValue() == 1 && (string = r0.mResultSet.getString(i, 54)) != null && (string2 = r0.mResultSet.getString(i, 57)) != null) {
            r312 = new 7Gr(string, string2, !r0.mResultSet.getBoolean(i, 63));
        }
        return r312;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
