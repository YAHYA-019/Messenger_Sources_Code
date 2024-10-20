package com.facebook.messaging.notify.logging;

import X.08O;
import X.1BQ;
import X.C00i;
import X.C4Dm;
import X.C5dw;
import X.C5dx;
import android.content.Intent;

/* loaded from: MessagesSystemTrayLogService.class */
public class MessagesSystemTrayLogService extends C5dw {
    public C5dx A00;
    public final C4Dm A01;
    public final C00i A02;

    public MessagesSystemTrayLogService() {
        super("MessagesSystemTrayLogService");
        this.A02 = new 1BQ(6);
        this.A01 = C4Dm.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(Intent intent, MessagesSystemTrayLogService messagesSystemTrayLogService, Integer num, int i) {
        if (num.intValue() == 1) {
            messagesSystemTrayLogService.sendBroadcast(intent);
        } else {
            intent.addFlags(i);
            ((08O) messagesSystemTrayLogService.A02.get()).A06().A0A(messagesSystemTrayLogService, intent);
        }
    }
}
