package com.facebook.messaging.magicwords.plugins.consumption.messagerowdata;

import X.1BK;
import X.1Bq;
import X.1Br;
import X.60I;
import X.60W;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;

/* loaded from: MagicWordsMessageRowData.class */
public final class MagicWordsMessageRowData {
    public final 1Br A00;
    public final 1Br A01;
    public final Message A02;
    public final 60I A03;
    public final Context A04;
    public final 60W A05;

    public MagicWordsMessageRowData(Context context, Message message, 60I r304, 60W r305) {
        1BK.A1K(context, 1, r305);
        this.A04 = context;
        this.A02 = message;
        this.A03 = r304;
        this.A05 = r305;
        this.A01 = 1Bq.A00(67770);
        this.A00 = 1Bq.A00(66467);
    }
}
