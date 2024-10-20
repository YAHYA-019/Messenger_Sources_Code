package com.facebook.messaging.threadview.plugins.instantgames.messagerowdata;

import X.1BL;
import X.1Br;
import X.1CO;
import X.1GD;
import X.60W;
import X.7zM;
import X.7zR;
import X.C22a;
import com.facebook.messaging.model.messages.Message;
import java.util.List;

/* loaded from: InstantGamesRowData.class */
public final class InstantGamesRowData {
    public final 1Br A00;
    public final Message A01;
    public final List A02;
    public final 60W A03;
    public final 1CO A04;

    public InstantGamesRowData(Message message, 60W r303) {
        1BL.A1F(message, r303);
        this.A01 = message;
        this.A03 = r303;
        this.A00 = 7zM.A0X();
        1CO A0i = 7zR.A0i();
        this.A04 = A0i;
        this.A02 = ((C22a) 1Br.A0B(this.A00)).AjV(A0i.BDB(1GD.A07, 72902508594528336L));
    }
}
