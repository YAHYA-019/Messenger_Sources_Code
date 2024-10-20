package X;

import com.facebook.messaging.model.messages.Message;
import com.google.common.base.Platform;
import com.mapbox.mapboxsdk.R;
import java.util.List;

/* renamed from: X.7ft, reason: invalid class name */
/* loaded from: 7ft.class */
public final class C7ft extends C1rj {
    public C65n A00;
    public Message A01;

    public C7ft() {
        super("DialtoneNuxComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A30(2131959647);
        A0L.A1X(2132279359);
        A0L.A2B(C26z.VERTICAL, R.dimen.mapbox_eight_dp);
        A0L.A2z(2132213810);
        A0L.A32(2132279337);
        A0L.A2f();
        A0L.A1v(1LI.A05(r302, C7ft.class, "DialtoneNuxComponent"));
        A0L.A0x(1.0f);
        return A0L.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1803022739) {
            return null;
        }
        C7ft c7ft = (C7ft) r302.A00.A01;
        Message message = c7ft.A01;
        C65n c65n = c7ft.A00;
        String str = message.A1V;
        if (Platform.stringIsNullOrEmpty(str) || C65n.A00(c65n).contains(str)) {
            return null;
        }
        List A00 = C65n.A00(c65n);
        A00.add(str);
        1Ql edit = c65n.A01.edit();
        edit.CaL(RDN.A00, C65n.A03.join(A00.iterator()));
        edit.commit();
        return null;
    }
}
