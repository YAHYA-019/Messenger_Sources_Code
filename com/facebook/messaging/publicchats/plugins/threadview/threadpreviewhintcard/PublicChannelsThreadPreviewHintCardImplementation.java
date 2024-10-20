package com.facebook.messaging.publicchats.plugins.threadview.threadpreviewhintcard;

import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.21E;
import X.2oI;
import X.4YT;
import X.4YV;
import X.5Aw;
import X.63D;
import X.6IU;
import X.6IV;
import X.7zM;
import X.8Ad;
import X.8JJ;
import X.AbG;
import X.AbI;
import X.AbM;
import X.AnonymousClass001;
import X.BDc;
import X.C00i;
import X.C00m;
import X.C3o5;
import X.C6mh;
import X.CZB;
import X.CZF;
import X.Czk;
import X.MRk;
import X.Rjp;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.GroupThreadData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: PublicChannelsThreadPreviewHintCardImplementation.class */
public final class PublicChannelsThreadPreviewHintCardImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final ThreadSummary A09;
    public final 63D A0A;
    public final ThreadViewParams A0B;
    public final 6IV A0C;
    public final MigColorScheme A0D;
    public final CharSequence A0E;

    public PublicChannelsThreadPreviewHintCardImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, 63D r305, ThreadViewParams threadViewParams, 6IV r307, MigColorScheme migColorScheme) {
        Spanned spannableStringBuilder;
        String str;
        C3o5.A0k(context, 1, migColorScheme);
        11T.A0F(fbUserSession, 7);
        this.A00 = context;
        this.A09 = threadSummary;
        this.A0A = r305;
        this.A0B = threadViewParams;
        this.A0D = migColorScheme;
        this.A0C = r307;
        this.A01 = fbUserSession;
        this.A03 = 1Bq.A00(82310);
        this.A02 = AbG.A0X();
        this.A06 = 1Bq.A00(66640);
        this.A05 = 1Bq.A00(17047);
        this.A07 = 7zM.A0O();
        1Br A00 = 1Bq.A00(68470);
        this.A04 = A00;
        this.A08 = 1Bq.A00(67708);
        if (4YV.A0W(A00).AZk(36320279272701159L)) {
            boolean z = true;
            if (threadViewParams != null && (str = threadViewParams.A0D) != null && str.length() > 0) {
                spannableStringBuilder = ((8Ad) 1Br.A0B(this.A08)).A00(this.A00, this.A0D, "[creator_name]", str, (C00m) null, 2131967046, !threadViewParams.A0P ? false : z, false);
                this.A0E = spannableStringBuilder;
            }
        }
        spannableStringBuilder = new SpannableStringBuilder(context.getString(2oI.A07(this.A09) ? 2131967050 : 2131967047));
        this.A0E = spannableStringBuilder;
    }

    public static final 8JJ A00(PublicChannelsThreadPreviewHintCardImplementation publicChannelsThreadPreviewHintCardImplementation, boolean z) {
        String A0u;
        Rjp A00;
        boolean z2;
        GroupThreadData AoK;
        6IU r0;
        if (A04(publicChannelsThreadPreviewHintCardImplementation)) {
            Context context = publicChannelsThreadPreviewHintCardImplementation.A00;
            int i = 2131955772;
            if (z) {
                i = 2131955775;
            }
            return new 8JJ(new CZB(1, publicChannelsThreadPreviewHintCardImplementation, z), (z && (r0 = publicChannelsThreadPreviewHintCardImplementation.A0C) != null && r0.A00.A01) ? 5Aw.A03 : 5Aw.A02, 1BK.A0u(context, i), true, z);
        }
        ThreadSummary threadSummary = publicChannelsThreadPreviewHintCardImplementation.A09;
        if (threadSummary == null || (AoK = threadSummary.AoK()) == null || !AoK.A0F) {
            boolean A03 = A03(publicChannelsThreadPreviewHintCardImplementation);
            Context context2 = publicChannelsThreadPreviewHintCardImplementation.A00;
            if (!A03) {
                String A0u2 = 1BK.A0u(context2, 2131955775);
                CZF A002 = CZF.A00(publicChannelsThreadPreviewHintCardImplementation, 46);
                6IU r02 = publicChannelsThreadPreviewHintCardImplementation.A0C;
                return new 8JJ(A002, (r02 == null || !r02.A00.A01) ? 5Aw.A02 : 5Aw.A03, A0u2, true, true);
            }
            A0u = 1BK.A0u(context2, 2131957454);
            A00 = CZF.A00(publicChannelsThreadPreviewHintCardImplementation, 45);
            z2 = true;
        } else {
            A0u = 1BK.A0u(publicChannelsThreadPreviewHintCardImplementation.A00, 2131957453);
            A00 = Rjp.A00;
            z2 = false;
        }
        return new 8JJ(A00, 5Aw.A02, A0u, z2, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r301 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A01(com.facebook.messaging.publicchats.plugins.threadview.threadpreviewhintcard.PublicChannelsThreadPreviewHintCardImplementation r301) {
        /*
            r0 = r301
            com.facebook.messaging.threadview.params.ThreadViewParams r0 = r0.A0B
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L24
            r0 = r301
            com.facebook.messaging.threadview.params.ThreadPreviewParams r0 = r0.A09
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L24
            r0 = r301
            X.Mfu r0 = r0.A01
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L24
            r0 = r301
            java.lang.String r0 = r0.mValue
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L2f
        L24:
            X.Mfu r0 = X.EnumC3499Mfu.A0s
            java.lang.String r0 = r0.mValue
            r301 = r0
            r0 = r301
            X.11T.A0A(r0)
        L2f:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.publicchats.plugins.threadview.threadpreviewhintcard.PublicChannelsThreadPreviewHintCardImplementation.A01(com.facebook.messaging.publicchats.plugins.threadview.threadpreviewhintcard.PublicChannelsThreadPreviewHintCardImplementation):java.lang.String");
    }

    public static final void A02(PublicChannelsThreadPreviewHintCardImplementation publicChannelsThreadPreviewHintCardImplementation) {
        ThreadSummary threadSummary = publicChannelsThreadPreviewHintCardImplementation.A09;
        if (threadSummary != null) {
            C00i c00i = publicChannelsThreadPreviewHintCardImplementation.A06.A00;
            C6mh c6mh = (C6mh) c00i.get();
            C6mh.A00(c6mh).markerStart(946996509, true);
            C6mh.A00(c6mh).markerAnnotate(946996509, 1BJ.A00(ActionId.OFFLINE), 2oI.A07(threadSummary) ? "social" : 2oI.A06(threadSummary) ? "broadcast" : "default");
            C6mh.A00(c6mh).markerAnnotate(946996509, 4YT.A00(1182), ConstantsKt.CAMERA_ID_BACK);
            ((C6mh) c00i.get()).A06(threadSummary, "attempt_to_join_channel_started");
            if (threadSummary.A2Q) {
                if (2oI.A07(threadSummary)) {
                    AbM.A0Z(publicChannelsThreadPreviewHintCardImplementation.A03).A0F(threadSummary.A0n.A04, A01(publicChannelsThreadPreviewHintCardImplementation));
                } else if (2oI.A06(threadSummary)) {
                    AbI.A0b(publicChannelsThreadPreviewHintCardImplementation.A02).A0J(threadSummary.A0n.A04, A01(publicChannelsThreadPreviewHintCardImplementation));
                }
            }
            ((BDc) 1Lm.A05(publicChannelsThreadPreviewHintCardImplementation.A00, publicChannelsThreadPreviewHintCardImplementation.A01, 68468)).A00((MailboxCallback) null, Czk.A00(publicChannelsThreadPreviewHintCardImplementation, 87), A01(publicChannelsThreadPreviewHintCardImplementation), threadSummary.A0n.A04);
        }
    }

    public static final boolean A03(PublicChannelsThreadPreviewHintCardImplementation publicChannelsThreadPreviewHintCardImplementation) {
        GroupThreadData AoK;
        ThreadSummary threadSummary = publicChannelsThreadPreviewHintCardImplementation.A09;
        return AnonymousClass001.A1W((threadSummary == null || (AoK = threadSummary.AoK()) == null) ? null : AoK.A05, 21E.A02);
    }

    public static final boolean A04(PublicChannelsThreadPreviewHintCardImplementation publicChannelsThreadPreviewHintCardImplementation) {
        ThreadSummary threadSummary = publicChannelsThreadPreviewHintCardImplementation.A09;
        if (threadSummary == null || !threadSummary.A2Q) {
            return 11T.A0O(A01(publicChannelsThreadPreviewHintCardImplementation), MRk.A00(6)) && 4YV.A0W(publicChannelsThreadPreviewHintCardImplementation.A04).AZk(36320279272766696L);
        }
        return true;
    }
}
