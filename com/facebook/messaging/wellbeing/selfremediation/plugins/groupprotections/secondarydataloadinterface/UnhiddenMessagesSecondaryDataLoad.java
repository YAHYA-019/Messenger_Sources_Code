package com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.secondarydataloadinterface;

import X.11T;
import X.2S4;
import X.6iB;
import X.7PA;
import android.content.Context;

/* loaded from: UnhiddenMessagesSecondaryDataLoad.class */
public final class UnhiddenMessagesSecondaryDataLoad {
    public final 2S4 A00;
    public final 6iB A01;
    public final 7PA A02;
    public final Context A03;

    public UnhiddenMessagesSecondaryDataLoad(Context context, 2S4 r303, 6iB r304) {
        11T.A0F(context, 1);
        11T.A0F(r304, 2);
        11T.A0F(r303, 3);
        this.A03 = context;
        this.A01 = r304;
        this.A00 = r303;
        this.A02 = new 7PA(this);
    }
}
