package X;

/* renamed from: X.5kt, reason: invalid class name */
/* loaded from: 5kt.class */
public final class C5kt implements C5kd {
    public static final C5kt A00 = new Object();
    public static final C5g3 A01 = C5ku.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        C5g9 A02;
        11T.A0F(r306, 4);
        5uM r0 = (5uM) r306;
        C5g9 B6D = r0.A01.B6D(r0.A00);
        if (B6D == null || (A02 = B6D.A02(C5we.class, "memories")) == null) {
            return null;
        }
        String A0J = ((5Ou) 1Bi.A03(49709)).A0J(0S2.A04, new C5g9(A02.A00).A00.optLong("original_message_creation_ts"));
        11T.A0A(A0J);
        return new C82c(A0J, 4);
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
