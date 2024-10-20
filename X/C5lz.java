package X;

/* renamed from: X.5lz, reason: invalid class name */
/* loaded from: 5lz.class */
public final class C5lz implements C5kd {
    public static final C5lz A00 = new Object();
    public static final C5g3 A01 = C5m0.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        Long nullableLong;
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger = r0.mResultSet.getNullableInteger(i, 59);
        8Nr r312 = null;
        if (nullableInteger != null && nullableInteger.intValue() == 16 && (nullableLong = r0.mResultSet.getNullableLong(i, 40)) != null) {
            r312 = new 8Nr(nullableLong.longValue());
        }
        return r312;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
