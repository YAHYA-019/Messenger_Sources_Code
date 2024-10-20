package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: C3K.class */
public final class C3K {
    public final 1Br A00;
    public final 1De A01;

    public C3K(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 83353);
    }

    public final AjA A00(BOp bOp, BOY boy, BOM bom, FbUserSession fbUserSession, ThreadKey threadKey, String str) {
        0DA r0 = new 0DA();
        if (boy == null) {
            boy = ((CHm) 1Br.A0B(this.A00)).A02(fbUserSession, threadKey).A00();
            if (boy == null) {
                boy = BOY.A05;
            }
        }
        r0.A01(boy, Property.SYMBOL_Z_ORDER_SOURCE);
        r0.A01(bOp, "entry_point");
        7zN.A14(r0, "source_owner", 0);
        r0.A07(TraceFieldType.RequestID, str);
        r0.A01(bom, "source_type");
        return r0;
    }
}
