package X;

/* renamed from: X.5kn, reason: invalid class name */
/* loaded from: 5kn.class */
public final class C5kn implements C5kd {
    public static final C5kn A01 = new Object();
    public static final 1Br A00 = 1Bq.A00(16385);
    public static final C5g3 A02 = C5ko.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A02;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        String string;
        Integer nullableInteger;
        Integer num;
        11T.A0F(c5to, 5);
        C82a c82a = null;
        if (c5pu != null) {
            1qX r0 = (1qX) c5pu;
            if (r0.mResultSet.getCount() != 0 && c5pu.AXc(0) == 7 && (string = r0.mResultSet.getString(0, 79)) != null && (nullableInteger = r0.mResultSet.getNullableInteger(0, 194)) != null) {
                int intValue = nullableInteger.intValue();
                if (intValue == 1) {
                    num = 0S2.A00;
                } else if (intValue == 2) {
                    num = 0S2.A01;
                } else if (intValue == 4) {
                    num = 0S2.A0C;
                }
                if (1Br.A07(A00).AZk(c5to.A01 == 1 ? 36325690928812944L : 36325690928944018L)) {
                    c82a = new C82a(string, num);
                }
            }
        }
        return c82a;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
