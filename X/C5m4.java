package X;

/* renamed from: X.5m4, reason: invalid class name */
/* loaded from: 5m4.class */
public final class C5m4 implements C5kd {
    public static final C5m4 A00 = new Object();
    public static final C5g3 A01 = C5m5.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        11T.A0F(r303, 0);
        82X r311 = null;
        if (c5pu != null) {
            String string = ((1qX) r303).mResultSet.getString(i, 70);
            if (string == null) {
                string = "";
            }
            String obj = 0CU.A06(string).toString();
            if (obj.length() > 0 && ((1qX) c5pu).mResultSet.getCount() > 0) {
                r311 = new 82X(obj);
            }
        }
        return r311;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
