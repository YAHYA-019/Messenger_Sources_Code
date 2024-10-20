package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.5kz, reason: invalid class name */
/* loaded from: 5kz.class */
public final class C5kz implements C5kd {
    public static final C5kz A00 = new Object();
    public static final C5g3 A01 = C5l0.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        if (c5pu == null) {
            return null;
        }
        1qX r0 = (1qX) c5pu;
        if (r0.mResultSet.getCount() == 0 || c5pu.AXc(0) != 7) {
            return null;
        }
        Integer nullableInteger = r0.mResultSet.getNullableInteger(0, 36);
        if (nullableInteger == null) {
            C5g9 BLI = c5pu.BLI(0);
            if (BLI == null) {
                return null;
            }
            nullableInteger = Integer.valueOf(BLI.A00.optInt(TraceFieldType.ContentType));
            if (nullableInteger == null) {
                return null;
            }
        }
        return new 82R(nullableInteger.intValue(), 0);
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
