package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: A9e.class */
public final class A9e implements C5kd {
    public static final A9e A01 = new Object();
    public static final 1Br A00 = 1BK.A0C();
    public static final C5g3 A02 = C5kw.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A02;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        6Eu r309 = null;
        if (c5pu != null) {
            1qX r0 = (1qX) c5pu;
            if (1qX.A00(r0) != 0 && c5pu.AXc(0) == 7) {
                Integer nullableInteger = r0.mResultSet.getNullableInteger(0, 36);
                if (nullableInteger == null) {
                    C5g9 BLI = c5pu.BLI(0);
                    if (BLI != null) {
                        nullableInteger = Integer.valueOf(BLI.A00.optInt(TraceFieldType.ContentType));
                    }
                }
                if (nullableInteger != null && nullableInteger.intValue() == 3008 && 1Br.A07(A00).AZk(36322796134746077L)) {
                    r309 = 6Eu.A00;
                }
            }
        }
        return r309;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
