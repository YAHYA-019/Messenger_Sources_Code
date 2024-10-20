package com.facebook.messaging.media.send;

import X.1BK;
import X.1BP;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1HG;
import X.5HP;
import X.5HW;
import X.5Pz;
import X.7zL;
import X.7zM;
import X.7zP;
import X.7zQ;
import X.9wC;
import X.AbG;
import X.AbJ;
import X.AbN;
import X.Bf1;
import X.C7l6;
import X.Hsl;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: MediaMessageFactory.class */
public final class MediaMessageFactory {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
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
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final Context A0K;
    public final 1BP A0L;

    public MediaMessageFactory(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 84734);
        this.A03 = AbG.A0M();
        this.A05 = 1Bu.A03(r0, 82478);
        this.A07 = 1Bq.A00(49642);
        this.A08 = 1Bq.A00(50135);
        this.A0A = 1Bu.A03(r0, 67783);
        this.A0E = 1Bu.A03(r0, 116182);
        this.A0C = 1Bu.A03(r0, 115935);
        this.A0D = 1Bq.A00(67858);
        Context A0I = 7zQ.A0I(r0);
        this.A0K = A0I;
        this.A0F = 1HG.A00(A0I, 65898);
        this.A09 = 1Bu.A03(r0, 85055);
        this.A04 = 1BK.A0E();
        this.A0L = FbInjector.A00;
        this.A0G = 1HG.A00(7zL.A09(), 99435);
        this.A0I = 1Bq.A00(115303);
        this.A0J = 1Bu.A03(r0, 116004);
        this.A0H = 7zM.A0P();
        this.A06 = 1Bq.A00(16486);
        this.A0B = 1Bq.A00(85048);
        this.A02 = 1Bq.A00(66265);
    }

    public static final int A00(MediaResource mediaResource) {
        5HP r0 = mediaResource.A0Q;
        if (r0 == null) {
            return 0;
        }
        C7l6 c7l6 = C7l6.$redex_init_class;
        switch (r0.ordinal()) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 10:
                return 3;
            case 13:
                return 10;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r327 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.2FT A01(android.content.Context r301, com.facebook.auth.usersession.FbUserSession r302, X.5Pz r303, com.facebook.messaging.media.send.MediaMessageFactory r304, com.facebook.messaging.model.threadkey.ThreadKey r305, com.facebook.messaging.model.threads.ThreadSummary r306, com.facebook.share.model.ComposerAppAttribution r307, com.facebook.xapp.messaging.capability.vector.Capabilities r308, com.google.common.collect.ImmutableMap r309, com.google.common.collect.ImmutableMap r310, java.lang.String r311, java.lang.String r312, java.util.List r313, int r314) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.send.MediaMessageFactory.A01(android.content.Context, com.facebook.auth.usersession.FbUserSession, X.5Pz, com.facebook.messaging.media.send.MediaMessageFactory, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.share.model.ComposerAppAttribution, com.facebook.xapp.messaging.capability.vector.Capabilities, com.google.common.collect.ImmutableMap, com.google.common.collect.ImmutableMap, java.lang.String, java.lang.String, java.util.List, int):X.2FT");
    }

    public static final void A02(5Pz r301, MediaMessageFactory mediaMessageFactory, Throwable th) {
        MessagingPerformanceLogger.A08((MessagingPerformanceLogger) 1Br.A0B(mediaMessageFactory.A0B)).markerEnd(5512262, (short) 3);
        if (th instanceof 5HW) {
            ((Hsl) 1Br.A0B(mediaMessageFactory.A0J)).A01(new 9wC(0), r301.toString());
            return;
        }
        AbN.A1Q(AbJ.A0k(mediaMessageFactory.A0G), 2131956593);
        1Br.A04(mediaMessageFactory.A03).softReport("MediaMessageFactory", "Error Loading Media", th);
        7zP.A0e(((Bf1) 1Br.A0B(mediaMessageFactory.A09)).A00).markerEnd(5505172, (short) 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A03(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, X.5Pz r304, com.facebook.messaging.model.threadkey.ThreadKey r305, com.facebook.messaging.model.threads.ThreadSummary r306, com.facebook.share.model.ComposerAppAttribution r307, com.facebook.xapp.messaging.capability.vector.Capabilities r308, com.google.common.collect.ImmutableMap r309, com.google.common.collect.ImmutableMap r310, java.lang.String r311, java.lang.String r312, java.util.List r313, X.0DR r314, int r315) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.send.MediaMessageFactory.A03(android.content.Context, com.facebook.auth.usersession.FbUserSession, X.5Pz, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.share.model.ComposerAppAttribution, com.facebook.xapp.messaging.capability.vector.Capabilities, com.google.common.collect.ImmutableMap, com.google.common.collect.ImmutableMap, java.lang.String, java.lang.String, java.util.List, X.0DR, int):java.lang.Object");
    }
}
