package X;

import android.content.res.Resources;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;

/* loaded from: C2v.class */
public final class C2v {
    public final C00i A01 = 1BQ.A00();
    public final C00i A00 = FbInjector.A00;

    public Message A00(Message message) {
        5PR r0;
        5PI A0d;
        Resources A0B;
        int i;
        if (1BK.A0N(this.A01).AZk(36310508218941749L) && (r0 = message.A0B) != 5PR.A06) {
            int ordinal = r0.ordinal();
            if (ordinal == 1) {
                A0d = AbF.A0d(message);
                A0B = 1BL.A0B(this.A00);
                i = 2131955916;
            } else if (ordinal == 2) {
                A0d = AbF.A0d(message);
                A0B = 1BL.A0B(this.A00);
                i = 2131955917;
            } else if (ordinal == 3) {
                A0d = AbF.A0d(message);
                A0B = 1BL.A0B(this.A00);
                i = 2131955918;
            }
            5PI.A00(A0d, A0B.getString(i));
            message = 4YU.A0U(A0d);
        }
        return message;
    }
}
