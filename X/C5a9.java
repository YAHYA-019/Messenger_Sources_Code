package X;

import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* renamed from: X.5a9, reason: invalid class name */
/* loaded from: 5a9.class */
public final class C5a9 {
    public final 1Br A00 = 1Bu.A00(33259);

    public final C5aA A00(MessagingNotification messagingNotification) {
        11T.A0F(messagingNotification, 0);
        PushProperty pushProperty = messagingNotification.A02;
        return new C5aA(((C4Nz) this.A00.A00.get()).A02(pushProperty != null ? pushProperty.A00 : 0));
    }

    public final C5aA A01(PushProperty pushProperty) {
        return new C5aA(((C4Nz) this.A00.A00.get()).A02(pushProperty.A00));
    }
}
