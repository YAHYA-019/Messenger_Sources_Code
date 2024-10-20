package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.206, reason: invalid class name */
/* loaded from: 206.class */
public final class AnonymousClass206 extends MailboxFeature {
    public static C1qL A00 = new 38C(0);

    public void A00(MailboxCallback mailboxCallback, List list) {
        1Um A0R = 1BL.A0R(this);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0R, mailboxCallback);
        1Um.A00(A0R, new A0C(1, this, A0Q, list), A0Q);
    }
}
