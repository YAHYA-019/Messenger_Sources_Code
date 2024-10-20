package com.facebook.messaging.nativepagereply.plugins.richmedia.keyboard;

import X.06Z;
import X.11T;
import X.1Bq;
import X.1Br;
import X.6RU;
import X.7zM;
import X.7zQ;
import X.AKO;
import X.C92f;
import X.H4B;
import android.content.Context;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: BusinessInboxSendFileKeyboardView.class */
public final class BusinessInboxSendFileKeyboardView extends H4B {
    public 06Z A00;
    public MigColorScheme A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 6RU A04;
    public final LithoView A05;
    public final C92f A06;

    public BusinessInboxSendFileKeyboardView(Context context) {
        super(context, null, 0);
        this.A03 = 7zM.A0f(context);
        this.A02 = 1Bq.A00(68137);
        C92f c92f = new C92f(context);
        this.A06 = c92f;
        LithoView lithoView = (LithoView) 7zM.A0H(c92f, 2131362710);
        this.A05 = lithoView;
        this.A04 = new 6RU(context);
        this.A01 = 7zQ.A0m(this.A03);
        c92f.A01 = new AKO(this, 43);
        A0c(c92f, lithoView);
    }

    @Override // X.H4B
    public void A0f(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        super.A0f(migColorScheme);
        if (migColorScheme.equals(this.A01)) {
            return;
        }
        this.A01 = migColorScheme;
        C92f c92f = this.A06;
        if (migColorScheme.equals(c92f.A00)) {
            return;
        }
        c92f.A00 = migColorScheme;
        C92f.A00(c92f);
    }
}
