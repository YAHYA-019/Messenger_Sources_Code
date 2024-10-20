package com.facebook.messaging.inboxsubtabs.plugins.subtabs.itemsupplier;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.1NK;
import X.2S4;
import X.2SO;
import X.2Si;
import X.2Sk;
import X.C3b7;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: InboxSubtabsItemSupplierImplementation.class */
public final class InboxSubtabsItemSupplierImplementation {
    public ListenableFuture A00;
    public ListenableFuture A01;
    public AtomicReference A02;
    public AtomicReference A03;
    public boolean A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 2SO A0E;
    public final 2Si A0F;
    public final 2Sk A0G;
    public final MailboxCallback A0H;
    public final AtomicBoolean A0I;
    public final AtomicReference A0J;
    public final Context A0K;
    public final FbUserSession A0L;
    public final 2S4 A0M;

    public InboxSubtabsItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2S4 r304, 2Si r305, 2Sk r306) {
        11T.A0F(context, 1);
        11T.A0F(r306, 2);
        11T.A0F(r305, 3);
        11T.A0F(fbUserSession, 4);
        11T.A0F(r304, 5);
        this.A0K = context;
        this.A0G = r306;
        this.A0F = r305;
        this.A0L = fbUserSession;
        this.A0M = r304;
        this.A0A = 1Bq.A00(68669);
        this.A07 = 1Bq.A00(65837);
        this.A06 = 1Bu.A01(context, 65841);
        this.A02 = new AtomicReference(null);
        this.A0D = 1Bq.A00(16449);
        this.A0I = new AtomicBoolean(false);
        this.A09 = 1Lm.A00(context, fbUserSession, 68375);
        this.A0B = 1Lm.A00(context, fbUserSession, 68144);
        1Br A00 = 1Bq.A00(33013);
        this.A08 = A00;
        this.A04 = ((FbSharedPreferences) A00.A00.get()).AZn(1NK.A1i, true);
        this.A05 = 1Bq.A00(66481);
        this.A0C = 1Bq.A00(67266);
        this.A0H = new C3b7(this, 20);
        this.A03 = new AtomicReference(null);
        this.A0J = new AtomicReference();
        this.A0E = (2SO) r304.A00(33198);
    }
}
