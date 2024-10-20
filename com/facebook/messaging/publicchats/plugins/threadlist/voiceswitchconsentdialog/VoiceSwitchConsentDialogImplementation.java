package com.facebook.messaging.publicchats.plugins.threadlist.voiceswitchconsentdialog;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2SG;
import X.2YQ;
import X.5SW;
import X.7ND;
import X.C2gi;
import X.C6el;
import X.C6en;
import X.CQo;
import X.MRk;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* loaded from: VoiceSwitchConsentDialogImplementation.class */
public final class VoiceSwitchConsentDialogImplementation {
    public static final 1Br A06 = 1Bu.A00(67527);
    public static final 1Br A07 = 1BK.A0E();
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final C2gi A03;
    public final FbUserSession A04;
    public final 2YQ A05;

    public VoiceSwitchConsentDialogImplementation(Context context, FbUserSession fbUserSession, 2YQ r304, C2gi c2gi) {
        1BL.A11(1, context, r304, fbUserSession);
        this.A00 = context;
        this.A03 = c2gi;
        this.A05 = r304;
        this.A04 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 33197);
        this.A01 = 1Bq.A00(82689);
    }

    public static final void A00(VoiceSwitchConsentDialogImplementation voiceSwitchConsentDialogImplementation) {
        C2gi c2gi = voiceSwitchConsentDialogImplementation.A03;
        ThreadSummary threadSummary = c2gi.A01;
        if (threadSummary != null) {
            C6el c6el = new C6el();
            ThreadKey threadKey = threadSummary.A0n;
            c6el.A00(threadKey);
            c6el.A06 = 7ND.A01(c2gi, (String) null, "thread_list");
            5SW r0 = 5SW.A1u;
            c6el.A02(r0);
            c6el.A0B = C6en.A02;
            c6el.A0U = true;
            ThreadViewParams threadViewParams = new ThreadViewParams(c6el);
            ((CQo) 1Br.A0B(voiceSwitchConsentDialogImplementation.A01)).A0O(((2SG) 1Br.A0B(voiceSwitchConsentDialogImplementation.A02)).A00, r0, Long.valueOf(threadKey.A04), MRk.A00(0));
            voiceSwitchConsentDialogImplementation.A05.CWM(c2gi, threadViewParams);
        }
    }
}
