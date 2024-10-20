package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8vQ, reason: invalid class name */
/* loaded from: 8vQ.class */
public final class C8vQ extends 9Ag {
    public static final List A03;
    public C96i A00;
    public final 1Br A01;
    public final 1Br A02;

    static {
        C96l[] values = C96l.values();
        ArrayList A0s = AnonymousClass001.A0s();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A03 = A0s;
                return;
            }
            C96l c96l = values[i2];
            if (c96l != C96l.A08) {
                A0s.add(c96l);
            }
            i = i2 + 1;
        }
    }

    public C8vQ(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A02 = 1Lm.A01(fbUserSession, 67866);
        this.A01 = 7zM.A0R();
        this.A00 = C96i.A02;
    }
}
