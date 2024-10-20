package com.facebook.messaging.business.plugins.suggestedreply.topsheetcontainer;

import X.06Z;
import X.0DA;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bn;
import X.1Bu;
import X.1UG;
import X.4YU;
import X.5zD;
import X.6Qc;
import X.6Qf;
import X.7zT;
import X.AnonymousClass001;
import X.B44;
import X.BKs;
import X.BOI;
import X.BzF;
import X.CGI;
import X.Rpq;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.plugins.suggestedreply.model.ReplyEntry;
import com.facebook.messaging.business.plugins.suggestedreply.model.SuggestedReplyOpenTopSheetParams;
import com.facebook.messaging.composer.model.ComposerTopSheetOpenParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.HashMap;

/* loaded from: SuggestedReplyTopSheetContainerImplementation.class */
public final class SuggestedReplyTopSheetContainerImplementation {
    public LithoView A00;
    public ComposerTopSheetOpenParams A01;
    public MigColorScheme A02;
    public final Context A03;
    public final 06Z A04;
    public final CGI A05;
    public final 6Qf A06;

    public SuggestedReplyTopSheetContainerImplementation(Context context, 06Z r303, CGI cgi, 6Qc r305, 6Qf r306) {
        7zT.A1W(r305, r306, r303, context);
        11T.A0F(cgi, 5);
        this.A06 = r306;
        this.A04 = r303;
        this.A03 = context;
        this.A05 = cgi;
        this.A02 = 5zD.A00(r305.A00.A0O);
    }

    public static final void A00(FbUserSession fbUserSession, SuggestedReplyTopSheetContainerImplementation suggestedReplyTopSheetContainerImplementation) {
        ComposerTopSheetOpenParams composerTopSheetOpenParams;
        if (suggestedReplyTopSheetContainerImplementation.A00 == null || (composerTopSheetOpenParams = suggestedReplyTopSheetContainerImplementation.A01) == null) {
            return;
        }
        Context context = suggestedReplyTopSheetContainerImplementation.A03;
        6Qf r0 = suggestedReplyTopSheetContainerImplementation.A06;
        if (composerTopSheetOpenParams instanceof SuggestedReplyOpenTopSheetParams) {
            SuggestedReplyOpenTopSheetParams suggestedReplyOpenTopSheetParams = (SuggestedReplyOpenTopSheetParams) composerTopSheetOpenParams;
            BzF bzF = (BzF) 1Bn.A0A(83939);
            LithoView lithoView = suggestedReplyTopSheetContainerImplementation.A00;
            11T.A0D(lithoView);
            MigColorScheme migColorScheme = suggestedReplyTopSheetContainerImplementation.A02;
            06Z r02 = suggestedReplyTopSheetContainerImplementation.A04;
            CGI cgi = suggestedReplyTopSheetContainerImplementation.A05;
            HashMap A0u = AnonymousClass001.A0u();
            BKs bKs = BKs.A03;
            long j = suggestedReplyOpenTopSheetParams.A00;
            A0u.put(bKs, new Rpq(context, fbUserSession, cgi, r0, migColorScheme, j));
            lithoView.A0x(bzF.A00(context, r02, suggestedReplyOpenTopSheetParams, migColorScheme, A0u));
            if (suggestedReplyOpenTopSheetParams.A04) {
                11T.A0D(context);
                B44 b44 = (B44) 1Bu.A06(context, 83375);
                String str = ((ReplyEntry) 4YU.A0q(suggestedReplyOpenTopSheetParams.A02, 0)).A09;
                11T.A0A(str);
                1UG A08 = 1BK.A08(b44.A01(), 1BJ.A00(1061));
                if (A08.isSampled()) {
                    1UG.A02(A08, "biim");
                    0DA r03 = new 0DA();
                    r03.A07("suggestion_source", str);
                    1UG.A01(r03, A08);
                    4YU.A1H(A08, Long.parseLong((String) b44.A02.getValue()));
                    A08.A7R("consumer_id", String.valueOf(j));
                    A08.A5c(BOI.A02, "suggestion_type");
                    A08.BZL();
                }
            }
        }
    }
}
