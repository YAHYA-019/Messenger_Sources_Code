package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5ss, reason: invalid class name */
/* loaded from: 5ss.class */
public final class C5ss implements 5kK {
    public static final C5ss A00 = new Object();

    public /* bridge */ /* synthetic */ C5fq A4p(C5pu c5pu, 4lD r303, InterfaceC07894l7 interfaceC07894l7, Capabilities capabilities, C5to c5to, int i, int i2) {
        String string;
        if (c5pu == null) {
            return null;
        }
        1qX r0 = (1qX) c5pu;
        if (r0.mResultSet.getCount() <= 0 || c5pu.AXc(0) != 7 || !11T.A0O(r0.mResultSet.getNullableBoolean(0, 180), true) || (string = r0.mResultSet.getString(0, 182)) == null || string.length() == 0) {
            return null;
        }
        5wA r02 = new 5wA();
        String string2 = r0.mResultSet.getString(0, 182);
        if (string2 == null) {
            throw 1BK.A0e();
        }
        r02.A00 = string2;
        return r02;
    }
}
