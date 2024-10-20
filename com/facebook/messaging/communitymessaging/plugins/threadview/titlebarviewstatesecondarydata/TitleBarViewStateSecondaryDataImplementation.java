package com.facebook.messaging.communitymessaging.plugins.threadview.titlebarviewstatesecondarydata;

import X.1BL;
import X.2S4;
import X.6iB;
import X.9Xx;
import X.ILT;
import android.content.Context;
import androidx.lifecycle.Observer;

/* loaded from: TitleBarViewStateSecondaryDataImplementation.class */
public final class TitleBarViewStateSecondaryDataImplementation {
    public final Observer A00;
    public final 9Xx A01;
    public final 6iB A02;
    public final Context A03;
    public final 2S4 A04;

    public TitleBarViewStateSecondaryDataImplementation(Context context, 2S4 r303, 6iB r304) {
        1BL.A1H(context, r304, r303);
        this.A03 = context;
        this.A02 = r304;
        this.A04 = r303;
        this.A00 = new ILT(this, 0);
        this.A01 = (9Xx) r303.A00(67713);
    }
}
