package com.facebook.messaging.notify.service;

import X.0FI;
import X.0fH;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.4YT;
import X.C5dw;
import X.CFd;
import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import java.util.concurrent.ExecutionException;

/* loaded from: MessengerDirectReplyService.class */
public final class MessengerDirectReplyService extends C5dw {
    public final 1Br A00;
    public final 1Br A01;

    /* JADX WARN: Multi-variable type inference failed */
    public MessengerDirectReplyService() {
        super("MessengerDirectReplyService");
        this.A00 = 1Bu.A00(83289);
        this.A01 = 1Bu.A01(this, 83579);
    }

    @Override // X.C5dw
    public void A02() {
    }

    @Override // X.C5dw
    public void A03(Intent intent) {
        int i;
        CharSequence charSequence;
        int A04 = 0FI.A04(-1120866233);
        if (intent == null) {
            i = -309028365;
        } else {
            1Br.A0C(this.A00);
            String A00 = 4YT.A00(ActionId.MESSENGER_QUEUE_CREATION);
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent == null || (charSequence = resultsFromIntent.getCharSequence(A00)) == null || charSequence.length() == 0) {
                i = -1355750470;
            } else {
                try {
                    CFd.A00(intent, 1BL.A0E(), (CFd) 1Br.A0B(this.A01), charSequence.toString(), "direct_reply_intent", true).get();
                } catch (InterruptedException | ExecutionException e) {
                    0fH.A0q("MessengerDirectReplyService", "handling direct reply from notification failed", e);
                }
                i = 450946782;
            }
        }
        0FI.A0A(i, A04);
    }
}
