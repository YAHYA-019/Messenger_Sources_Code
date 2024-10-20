package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator;

/* renamed from: X.5pj, reason: invalid class name */
/* loaded from: 5pj.class */
public final class C5pj extends AbstractMsysMessagesCollectionTranslator {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;

    public C5pj(1BO r302, FbUserSession fbUserSession) {
        super((5HV) 1Bi.A03(49642));
        this.A04 = new 1BV((1BY) null, 49982);
        this.A03 = new 1BV((1BY) null, 49983);
        this.A02 = new 1BQ(46);
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
    }

    public static int A03(Integer num) {
        int intValue = num.intValue();
        int i = 2;
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    return 3;
                }
                if (intValue == 4) {
                    return 1;
                }
                if (intValue != 6) {
                    switch (intValue) {
                        case 10:
                            i = 5;
                            break;
                        case 11:
                            break;
                        case 12:
                            break;
                        default:
                            return 0;
                    }
                }
            }
            return 4;
        }
        return i;
    }
}
