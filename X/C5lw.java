package X;

import com.facebook.msys.mci.CQLResultSet;

/* renamed from: X.5lw, reason: invalid class name */
/* loaded from: 5lw.class */
public final class C5lw implements C5kd {
    public final C5li A01;
    public final C5g3 A00 = C5lx.A00;
    public final Integer A02 = 42;

    public C5lw(C5li c5li) {
        this.A01 = c5li;
    }

    public 5uW A00(4lD r302, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, int i) {
        CQLResultSet cQLResultSet;
        int i2;
        Integer nullableInteger;
        Integer nullableInteger2;
        String string;
        Integer nullableInteger3;
        11T.A0F(r302, 0);
        11T.A0F(interfaceC07894l7, 2);
        11T.A0F(c4l9, 3);
        1qX r0 = (1qX) r302;
        int integer = r0.mResultSet.getInteger(i, 56);
        Integer num = integer != 0 ? (integer == 1 || integer == 2) ? 0S2.A01 : integer != 3 ? integer != 4 ? 0S2.A0Y : 0S2.A00 : 0S2.A0C : 0S2.A0N;
        C5li c5li = this.A01;
        String valueOf = String.valueOf(r0.mResultSet.getLong(i, 68));
        boolean z = false;
        1Bu.A06(c5li.A00, 67462);
        int A01 = C5tq.A01(interfaceC07894l7, valueOf);
        if (A01 == -1) {
            A01 = C5tq.A00(c4l9, valueOf);
            if (A01 != -1) {
                cQLResultSet = ((1qX) c4l9).mResultSet;
                i2 = 4;
            }
            String Ax2 = r302.Ax2(i);
            11T.A0A(Ax2);
            nullableInteger = r0.mResultSet.getNullableInteger(i, 58);
            boolean z2 = false;
            if (((nullableInteger != null && nullableInteger.intValue() == 7) || ((nullableInteger2 = r0.mResultSet.getNullableInteger(i, 59)) != null && nullableInteger2.intValue() == 7)) && ((string = r0.mResultSet.getString(i, 52)) == null || string.length() == 0 || (nullableInteger3 = r0.mResultSet.getNullableInteger(i, 60)) == null || nullableInteger3.intValue() != 1)) {
                z2 = true;
            }
            return new 5uW(num, Ax2, z, z2);
        }
        cQLResultSet = ((1qX) interfaceC07894l7).mResultSet;
        i2 = 26;
        z = cQLResultSet.getBoolean(A01, i2);
        String Ax22 = r302.Ax2(i);
        11T.A0A(Ax22);
        nullableInteger = r0.mResultSet.getNullableInteger(i, 58);
        boolean z22 = false;
        if (nullableInteger != null) {
            z22 = true;
            return new 5uW(num, Ax22, z, z22);
        }
        z22 = true;
        return new 5uW(num, Ax22, z, z22);
    }

    @Override // X.C5kd
    public C5g3 Asj() {
        return this.A00;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        return A00(r303, c4l9, interfaceC07894l7, i);
    }

    @Override // X.C5kd
    public Integer B7X() {
        return this.A02;
    }
}
