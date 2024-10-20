package X;

import android.content.Context;
import com.facebook.messaging.model.messages.MessengerCallLogProperties;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C4l.class */
public final class C4l {
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 83436);
    public final C00i A03 = 1BV.A01((1BY) null, 99984);
    public final C00i A01 = 1BV.A01((1BY) null, 82173);

    public C4l(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(Context context, MessengerCallLogProperties messengerCallLogProperties, ThreadKey threadKey, String str, String str2) {
        ((C7u) this.A03.get()).A01(context, threadKey, null, str2, str, null, messengerCallLogProperties.A09);
    }
}
