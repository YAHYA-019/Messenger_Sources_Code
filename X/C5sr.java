package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5sr, reason: invalid class name */
/* loaded from: 5sr.class */
public final class C5sr implements 5kK {
    public static final C5sr A00 = new Object();

    public /* bridge */ /* synthetic */ C5fq A4p(C5pu c5pu, 4lD r303, InterfaceC07894l7 interfaceC07894l7, Capabilities capabilities, C5to c5to, int i, int i2) {
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        Integer nullableInteger = r0.mResultSet.getNullableInteger(i, ActionId.ON_VIEW_CREATED_END);
        C5w5 c5w5 = null;
        if (nullableInteger != null) {
            int intValue = nullableInteger.intValue();
            String string = r0.mResultSet.getString(i, 70);
            if (string != null) {
                c5w5 = 5uE.A00(string, intValue);
            }
        }
        return c5w5;
    }
}
