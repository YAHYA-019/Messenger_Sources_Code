package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5sy, reason: invalid class name */
/* loaded from: 5sy.class */
public final class C5sy implements 5kK {
    public static final C5sy A00 = new Object();

    public /* bridge */ /* synthetic */ C5fq A4p(C5pu c5pu, 4lD r303, InterfaceC07894l7 interfaceC07894l7, Capabilities capabilities, C5to c5to, int i, int i2) {
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger = r0.mResultSet.getNullableInteger(i, 62);
        C5w5 c5w5 = null;
        if (nullableInteger != null && nullableInteger.intValue() == 1) {
            int integer = r0.mResultSet.getInteger(i, 53);
            String string = r0.mResultSet.getString(i, 52);
            if (string != null) {
                c5w5 = 5uE.A00(string, integer);
            }
        }
        return c5w5;
    }
}
