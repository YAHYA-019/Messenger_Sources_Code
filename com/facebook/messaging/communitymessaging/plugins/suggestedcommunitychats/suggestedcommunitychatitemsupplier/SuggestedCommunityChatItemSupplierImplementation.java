package com.facebook.messaging.communitymessaging.plugins.suggestedcommunitychats.suggestedcommunitychatitemsupplier;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1F9;
import X.1Lm;
import X.2Si;
import X.2Sk;
import X.8Kf;
import X.9tD;
import X.AnonymousClass001;
import X.BDi;
import X.Czk;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: SuggestedCommunityChatItemSupplierImplementation.class */
public final class SuggestedCommunityChatItemSupplierImplementation {
    public BDi A00;
    public 8Kf A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 2Si A0H;
    public final 2Sk A0I;
    public final MailboxCallback A0J;
    public final 9tD A0K;
    public final boolean A0L;

    public SuggestedCommunityChatItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304, 2Sk r305) {
        1BL.A11(2, r304, context, fbUserSession);
        this.A0I = r305;
        this.A0H = r304;
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A0B = 1Bq.A00(68669);
        this.A0C = 1Bq.A00(68670);
        this.A0F = 1Bq.A00(68470);
        this.A07 = 1Bq.A00(67264);
        this.A08 = 1Bq.A00(67265);
        this.A06 = 1Bu.A00(83118);
        this.A0G = 1Bu.A01(context, 68671);
        this.A0D = 1Bq.A00(16449);
        this.A09 = 1Lm.A00(context, fbUserSession, 33183);
        this.A0E = 1Bq.A00(66774);
        this.A0A = 1Bq.A00(67266);
        this.A0L = AnonymousClass001.A1W(r305.A00(), 1F9.A0I);
        this.A0K = new 9tD(this, 1);
        this.A0J = new Czk(this, 37);
    }
}
