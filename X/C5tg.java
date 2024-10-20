package X;

/* renamed from: X.5tg, reason: invalid class name */
/* loaded from: 5tg.class */
public final class C5tg implements C5kd {
    public static final C5tg A00 = new Object();
    public static final C5g3 A01 = C5th.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        Integer nullableInteger;
        11T.A0F(interfaceC07894l7, 2);
        1qX r0 = (1qX) interfaceC07894l7;
        boolean z = false;
        if (r0.mResultSet.getCount() == 2) {
            int count = r0.mResultSet.getCount();
            boolean z2 = false;
            while (z < count) {
                if (!r0.mResultSet.getBoolean(z ? 1 : 0, 26) && (nullableInteger = r0.mResultSet.getNullableInteger(z ? 1 : 0, 24)) != null && nullableInteger.intValue() == 4) {
                    z2 = true;
                }
                z = (z ? 1 : 0) + 1;
            }
            z = z2;
        }
        return new 5uR(z);
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
