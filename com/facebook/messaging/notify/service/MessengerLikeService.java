package com.facebook.messaging.notify.service;

import X.0FI;
import X.0fH;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.C5dw;
import X.C6D;
import android.content.Intent;
import java.util.concurrent.ExecutionException;

/* loaded from: MessengerLikeService.class */
public final class MessengerLikeService extends C5dw {
    public final 1Br A00;

    /* JADX WARN: Multi-variable type inference failed */
    public MessengerLikeService() {
        super("MessengerLikeService");
        this.A00 = 1Bu.A01(this, 83580);
    }

    @Override // X.C5dw
    public void A02() {
    }

    @Override // X.C5dw
    public void A03(Intent intent) {
        int i;
        int A04 = 0FI.A04(795423738);
        if (intent == null) {
            i = -412340483;
        } else {
            try {
                ((C6D) 1Br.A0B(this.A00)).A00(intent, 1BL.A0E()).get();
            } catch (InterruptedException | ExecutionException e) {
                0fH.A0q("MessengerLikeService", "handling like from notification failed", e);
            }
            i = -111360627;
        }
        0FI.A0A(i, A04);
    }
}
