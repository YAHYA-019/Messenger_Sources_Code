package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: A07.class */
public final class A07 implements MailboxCallback {
    public final Message A00;
    public final NavigationTrigger A01;
    public final /* synthetic */ C9kf A02;

    public A07(Message message, C9kf c9kf, NavigationTrigger navigationTrigger) {
        11T.A0F(message, 2);
        this.A02 = c9kf;
        this.A00 = message;
        this.A01 = navigationTrigger;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        9fL r0 = (9fL) obj;
        11T.A0F(r0, 0);
        Number number = r0.A00;
        if (number != null) {
            long longValue = number.longValue();
            C9kf c9kf = this.A02;
            C9kf.A01(c9kf, 83U.A01(c9kf, this, 6), longValue);
        }
    }
}
