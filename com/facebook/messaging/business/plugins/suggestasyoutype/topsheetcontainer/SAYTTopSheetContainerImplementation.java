package com.facebook.messaging.business.plugins.suggestasyoutype.topsheetcontainer;

import X.06Z;
import X.0DA;
import X.1BJ;
import X.1BK;
import X.1BV;
import X.1Bn;
import X.1UG;
import X.2S4;
import X.6Qc;
import X.6Qf;
import X.7zL;
import X.AnonymousClass001;
import X.B45;
import X.BKs;
import X.BOI;
import X.BzF;
import X.C00i;
import X.C0k4;
import X.C6W;
import X.CGH;
import X.COd;
import X.CZE;
import X.CiS;
import X.CiT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.plugins.suggestedreply.model.ReplyEntry;
import com.facebook.messaging.business.plugins.suggestedreply.model.SuggestedReplyOpenTopSheetParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* loaded from: SAYTTopSheetContainerImplementation.class */
public final class SAYTTopSheetContainerImplementation {
    public C00i A00 = 1BV.A00(83809);
    public LithoView A01;
    public SuggestedReplyOpenTopSheetParams A02;
    public MigColorScheme A03;
    public final Context A04;
    public final C00i A05;
    public final COd A06;
    public final 6Qf A07;
    public final 06Z A08;

    public SAYTTopSheetContainerImplementation(Context context, 06Z r303, 2S4 r304, 6Qc r305, 6Qf r306) {
        this.A04 = context;
        this.A03 = r305.A00.A0O.Axg();
        this.A07 = r306;
        this.A08 = r303;
        this.A05 = 7zL.A0R(context, 83940);
        this.A06 = COd.A00(context, r304);
    }

    public static void A00(Context context, FbUserSession fbUserSession, CGH cgh, 6Qf r304, MigColorScheme migColorScheme) {
        r304.BOH("biim_suggest_as_you_type");
        cgh.A00();
        r304.D0K(new CZE(context, fbUserSession, 12), migColorScheme, context.getString(2131966589), context.getString(2131966590));
    }

    public static void A01(FbUserSession fbUserSession, SAYTTopSheetContainerImplementation sAYTTopSheetContainerImplementation, SuggestedReplyOpenTopSheetParams suggestedReplyOpenTopSheetParams) {
        Context context;
        6Qf r0;
        CiT ciS;
        if (sAYTTopSheetContainerImplementation.A01 == null || suggestedReplyOpenTopSheetParams == null || (context = sAYTTopSheetContainerImplementation.A04) == null || (r0 = sAYTTopSheetContainerImplementation.A07) == null) {
            return;
        }
        BzF bzF = (BzF) 1Bn.A0A(83939);
        LithoView lithoView = sAYTTopSheetContainerImplementation.A01;
        MigColorScheme migColorScheme = sAYTTopSheetContainerImplementation.A03;
        06Z r02 = sAYTTopSheetContainerImplementation.A08;
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        while (true) {
            int i2 = i;
            ImmutableList immutableList = suggestedReplyOpenTopSheetParams.A02;
            if (i2 >= immutableList.size()) {
                lithoView.A0x(bzF.A00(context, r02, suggestedReplyOpenTopSheetParams, migColorScheme, A0u));
                C6W c6w = (C6W) sAYTTopSheetContainerImplementation.A05.get();
                long j = suggestedReplyOpenTopSheetParams.A00;
                1UG A08 = 1BK.A08(c6w.A01(), 1BJ.A00(1060));
                if (A08.isSampled()) {
                    1UG.A02(A08, "biim");
                    0DA r03 = new 0DA();
                    r03.A07("suggestion_source", "");
                    1UG.A01(r03, A08);
                    A08.A6H("page_id", c6w.A02());
                    A08.A7R("consumer_id", Long.toString(j));
                    A08.A5c(BOI.A03, "suggestion_type");
                    A08.BZL();
                    return;
                }
                return;
            }
            ReplyEntry replyEntry = (ReplyEntry) immutableList.get(i2);
            if (!A0u.containsKey(replyEntry.A01)) {
                C0k4.A00(sAYTTopSheetContainerImplementation.A02);
                BKs bKs = replyEntry.A01;
                C0k4.A00(bKs);
                CGH cgh = (CGH) sAYTTopSheetContainerImplementation.A00.get();
                long j2 = sAYTTopSheetContainerImplementation.A02.A00;
                B45 b45 = (B45) sAYTTopSheetContainerImplementation.A05.get();
                COd cOd = sAYTTopSheetContainerImplementation.A06;
                MigColorScheme migColorScheme2 = sAYTTopSheetContainerImplementation.A03;
                int ordinal = bKs.ordinal();
                if (ordinal == 2) {
                    ciS = new CiS(context, fbUserSession, b45, cgh, r0, migColorScheme2, j2);
                } else {
                    if (ordinal != 1) {
                        throw AnonymousClass001.A0L("Unknown Reply Type");
                    }
                    ciS = new CiT(context, fbUserSession, b45, cgh, cOd, r0, migColorScheme2, j2);
                }
                A0u.put(bKs, ciS);
            }
            i = i2 + 1;
        }
    }
}
