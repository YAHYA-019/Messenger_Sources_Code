package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5sz, reason: invalid class name */
/* loaded from: 5sz.class */
public final class C5sz implements 5kK {
    public static final C5sz A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v26, types: [X.5fq, X.5qu] */
    public /* bridge */ /* synthetic */ C5fq A4p(C5pu c5pu, 4lD r303, InterfaceC07894l7 interfaceC07894l7, Capabilities capabilities, C5to c5to, int i, int i2) {
        String string;
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger = r0.mResultSet.getNullableInteger(i, 62);
        if (nullableInteger == null || nullableInteger.intValue() != 1 || (string = r0.mResultSet.getString(i, 52)) == null || string.length() == 0) {
            return null;
        }
        ?? c5fq = new C5fq();
        c5fq.A02 = r0.mResultSet.getString(i, 52);
        return c5fq;
    }
}
