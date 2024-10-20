package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messengercar.CarNotificationService;

/* loaded from: D8j.class */
public final class D8j implements Runnable {
    public static final String __redex_internal_original_name = "CarNotificationService$1";
    public final /* synthetic */ Message A00;
    public final /* synthetic */ CarNotificationService A01;

    public D8j(Message message, CarNotificationService carNotificationService) {
        this.A01 = carNotificationService;
        this.A00 = message;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A04.A0H(5Pz.A0u, this.A00, NavigationTrigger.A03("android_auto_reply"), ErrorReportingConstants.APP_NAME_KEY);
    }
}
