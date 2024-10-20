package X;

import android.content.res.Resources;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5kb, reason: invalid class name */
/* loaded from: 5kb.class */
public final class C5kb implements 5kK {
    public static final C5kb A00 = new Object();

    public /* bridge */ /* synthetic */ C5fq A4p(C5pu c5pu, 4lD r303, InterfaceC07894l7 interfaceC07894l7, Capabilities capabilities, C5to c5to, int i, int i2) {
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        String str = null;
        if (!r0.mResultSet.getBoolean(i, 20) || !C5u4.A01(r303, i)) {
            return null;
        }
        String string = r0.mResultSet.getString(i, 70);
        if (string != null && string.length() != 0) {
            str = string;
        }
        Resources resources = (Resources) 1Bi.A03(67196);
        5wA r02 = new 5wA();
        if (str == null) {
            str = 4YU.A0t(resources, 2131955631);
        }
        r02.A00 = str;
        return r02;
    }
}
