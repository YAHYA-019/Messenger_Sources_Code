package com.facebook.messaging.msys.advancedcrypto.plugins.threadsettingsrow.messageexpiration;

import X.11T;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.2MQ;
import X.4YU;
import X.6qH;
import X.7zT;
import X.AbK;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.C2L;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import X.DHd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsMessageExpirationRow.class */
public final class ThreadSettingsMessageExpirationRow {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final DHd A04;
    public final Context A05;
    public final ThreadKey A06;

    public ThreadSettingsMessageExpirationRow(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DHd dHd) {
        7zT.A1T(context, dHd, fbUserSession);
        11T.A0F(threadKey, 5);
        this.A05 = context;
        this.A04 = dHd;
        this.A03 = threadSummary;
        this.A00 = fbUserSession;
        this.A06 = threadKey;
        this.A01 = 1Bu.A00(82497);
        this.A02 = 1Bu.A00(82500);
    }

    public final Cug A00() {
        CHv cHv = new CHv(2MQ.A37, (C1ut) null);
        CQg A00 = CQg.A00();
        Context context = this.A05;
        CQg.A07(context, A00, 2131959669);
        CQg.A08(BNV.A1P, A00);
        A00.A00 = 1355088881L;
        1Bn.A0A(82496);
        ThreadSummary threadSummary = this.A03;
        int A06 = (int) 4YU.A06(threadSummary != null ? threadSummary.A0F : 0L);
        String A002 = ((C2L) 1Br.A0B(this.A02)).A00(A06, 6qH.A01());
        if (6qH.A01()) {
            int i = 2131965704;
            if (A06 == 0) {
                i = 2131965703;
            }
            A002 = context.getString(i);
            11T.A0D(A002);
        } else if (A06 != 0) {
            A002 = AbK.A13(context, A002, 2131959666);
        }
        A00.A0B = A002;
        A00.A04 = cHv;
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A6I, (C1ut) null, (Boolean) null);
        return CQg.A04(A00, this, 7);
    }
}
