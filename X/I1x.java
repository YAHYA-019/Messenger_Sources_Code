package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Iterator;

/* loaded from: I1x.class */
public final class I1x {
    public HZ3 A00;
    public final 1Br A01;
    public final C01i A02 = C01g.A01(new AQt(null, this, 24));

    public I1x(Context context, FbUserSession fbUserSession) {
        this.A01 = 1Lm.A00(context, fbUserSession, 16686);
    }

    public static final HZ3 A00(GsP gsP, Integer num) {
        Object obj;
        Iterator it = 07C.A07(0, 1qX.A00(gsP)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((1qX) gsP).mResultSet.getInteger(AnonymousClass001.A03(obj), 0) == (1 - num.intValue() != 0 ? 2 : 1)) {
                break;
            }
        }
        Number number = (Number) obj;
        if (number == null) {
            return null;
        }
        int intValue = number.intValue();
        String string = ((1qX) gsP).mResultSet.getString(intValue, 1);
        11T.A0A(string);
        11T.A0A(((1qX) gsP).mResultSet.getString(intValue, 2));
        11T.A0A(7zP.A0l(gsP, intValue));
        return new HZ3(string);
    }

    public void A01(JHK jhk) {
        MailboxFeature mailboxFeature = (MailboxFeature) this.A02.getValue();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new Iaj(mailboxFeature, A0P, 1), A0P, false);
        A0P.addResultCallback(new Iaj(jhk, this, 8));
    }
}
