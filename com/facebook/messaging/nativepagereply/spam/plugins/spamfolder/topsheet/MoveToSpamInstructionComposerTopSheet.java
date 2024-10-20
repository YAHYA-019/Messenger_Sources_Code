package com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.topsheet;

import X.0Dc;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.2KD;
import X.2cK;
import X.2cM;
import X.4YU;
import X.6Qf;
import X.7zL;
import X.7zR;
import X.7zS;
import X.AbK;
import X.C26z;
import X.C6nh;
import X.CFx;
import X.CZ3;
import X.EC2;
import android.content.Context;
import android.text.SpannableString;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MoveToSpamInstructionComposerTopSheet.class */
public final class MoveToSpamInstructionComposerTopSheet {
    public LithoView A00;
    public ThreadViewColorScheme A01;

    public static final void A00(Context context, FbUserSession fbUserSession, 6Qf r303, ThreadKey threadKey, MoveToSpamInstructionComposerTopSheet moveToSpamInstructionComposerTopSheet) {
        MigColorScheme migColorScheme;
        if (threadKey != null) {
            1Iw A0W = 7zL.A0W(context);
            ThreadViewColorScheme threadViewColorScheme = moveToSpamInstructionComposerTopSheet.A01;
            if (threadViewColorScheme == null || (migColorScheme = threadViewColorScheme.A0F) == null) {
                return;
            }
            String A0u = 1BK.A0u(context, 2131960483);
            String A0u2 = 1BK.A0u(context, 2131960482);
            CZ3 cz3 = new CZ3(2, A0W, fbUserSession, r303, migColorScheme, moveToSpamInstructionComposerTopSheet, threadKey);
            1Bn.A0A(67680);
            Context A0A = 7zL.A0A(A0W);
            EC2 A00 = CFx.A00(A0A, cz3, migColorScheme, A0u2, (String) null);
            0Dc A0F = 7zS.A0F(A0A, A0u);
            7zR.A16(A0F, A00);
            SpannableString A0A2 = 7zS.A0A(A0F, A0u2);
            2cM A01 = 2cK.A01(A0W, (String) null, 0);
            11T.A0F(A0W, 0);
            C6nh c6nh = new C6nh(A0W);
            C26z c26z = C26z.TOP;
            c6nh.A08(c26z, migColorScheme.Atp());
            c6nh.A07(c26z, 0.5f);
            A01.A1h(c6nh.A01());
            2KD A0i = AbK.A0i(A0W, migColorScheme);
            A0i.A2z(A0A2);
            A0i.A2S(A0A2);
            A0i.A2i();
            A0i.A2d();
            A0i.A25(c26z, 12.0f);
            A0i.A25(C26z.START, 16.0f);
            A0i.A1A(4.0f);
            A0i.A25(C26z.END, 16.0f);
            A0i.A0L();
            A0i.A2X();
            4YU.A1K(A01, A0i);
            1LI r0 = A01.A00;
            LithoView lithoView = moveToSpamInstructionComposerTopSheet.A00;
            if (lithoView != null) {
                lithoView.A0x(r0);
            }
        }
    }
}
