package X;

/* renamed from: X.5kp, reason: invalid class name */
/* loaded from: 5kp.class */
public final class C5kp implements C5kd {
    public static final C5kp A00 = new Object();
    public static final C5g3 A01 = C5kq.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        Long nullableLong;
        8Nt r309 = null;
        if (c5pu != null) {
            1qX r0 = (1qX) c5pu;
            if (r0.mResultSet.getCount() != 0 && c5pu.AXc(0) == 7 && (nullableLong = r0.mResultSet.getNullableLong(0, 213)) != null) {
                r309 = new 8Nt(nullableLong.longValue(), r0.mResultSet.getNullableLong(0, 215));
            }
        }
        return r309;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
