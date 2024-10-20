package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.google.common.collect.ImmutableList;

/* renamed from: X.640, reason: invalid class name */
/* loaded from: 640.class */
public final class AnonymousClass640 {
    public final FbUserSession A00;
    public final C00i A01;
    public final 1De A02;
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
    public final C15h A0G;

    public AnonymousClass640(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A00 = fbUserSession;
        this.A06 = 1Bq.A00(114757);
        this.A09 = 1Bq.A00(32769);
        this.A0A = 1Bq.A00(32770);
        this.A03 = 1Bq.A00(49420);
        this.A07 = 1Bq.A00(49949);
        this.A0G = new C15h() { // from class: X.641
            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                Context A002 = FbInjector.A00();
                11T.A0D(A002);
                11T.A0F(A002, 1);
                return 1Hv.A02(A002, 32912);
            }
        };
        1BY r0 = r303.A00;
        this.A0B = 1Bu.A03(r0, 49935);
        this.A05 = 1Bq.A00(83603);
        this.A0F = 1Bu.A03(r0, 67808);
        this.A0C = 1Bu.A03(r0, 82479);
        this.A0E = 1Bq.A00(68021);
        this.A08 = 1Bq.A00(115111);
        this.A04 = 1Bq.A00(68470);
        this.A0D = 1Bq.A00(16385);
        this.A01 = 1Lm.A03(fbUserSession, r0, 49936);
    }

    public static final boolean A00(AnonymousClass622 anonymousClass622) {
        6Ay BCm;
        5Pm r0;
        6Ay BCm2;
        ImmutableList BDF;
        Message message = anonymousClass622.A03;
        if (C1q7.A0f(message)) {
            return false;
        }
        if ((message != null && (r0 = message.A08) != null && (BCm2 = r0.BCm()) != null && (BDF = BCm2.BDF()) != null && BDF.contains(GraphQLStoryAttachmentStyle.A0i)) || C1q7.A0p(message)) {
            return false;
        }
        5Pm r02 = message.A08;
        return (r02 == null || (BCm = r02.BCm()) == null || !BCm.BDF().contains(GraphQLStoryAttachmentStyle.A0M)) && !C1q7.A0q(message);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (((X.C60i) r301.A01.get()).A02(r302.A03) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A01(X.AnonymousClass622 r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            java.lang.Integer r0 = r0.A0E
            r303 = r0
            r0 = r303
            boolean r0 = X.62G.A01(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L36
            r0 = r302
            com.facebook.messaging.model.messages.Message r0 = r0.A03
            r305 = r0
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.60i r0 = (X.C60i) r0
            r303 = r0
            r0 = r303
            r1 = r305
            boolean r0 = r0.A02(r1)
            r306 = r0
            r0 = 2130971122(0x7f0409f2, float:1.7550973E38)
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L39
        L36:
            r0 = 2130971123(0x7f0409f3, float:1.7550975E38)
            r304 = r0
        L39:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass640.A01(X.622):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:
    
        if ("256002347743983".equals("638638284359690") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02(X.AnonymousClass622 r302) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass640.A02(X.622):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (X.1Br.A07(((X.C7py) X.1Br.A0B(r301.A08)).A01).AZk(36325351625871999L) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(X.AnonymousClass622 r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.messaging.model.messages.Message r0 = r0.A03
            r303 = r0
            r0 = r303
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0V
            r304 = r0
            r0 = r304
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0q(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lca
            r0 = r301
            X.1Br r0 = r0.A03
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.4ys r0 = (X.C12114ys) r0
            r304 = r0
            r0 = r304
            r1 = r303
            boolean r0 = r0.A0H(r1)
            r305 = r0
        L27:
            r0 = r305
            if (r0 != 0) goto L54
            r0 = r301
            X.1Br r0 = r0.A0A
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.3oZ r0 = (X.C00663oZ) r0
            r304 = r0
            r0 = r304
            r1 = r303
            boolean r0 = r0.A05(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L54
            r0 = r301
            r1 = r302
            boolean r0 = r0.A05(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lc2
        L54:
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto Lc2
            r0 = r303
            X.1Du r0 = r0.iterator()
            r303 = r0
        L78:
            r0 = r303
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lc2
            r0 = r303
            java.lang.Object r0 = r0.next()
            com.facebook.messaging.model.attachment.Attachment r0 = (com.facebook.messaging.model.attachment.Attachment) r0
            java.lang.String r0 = r0.A0H
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L78
            r0 = r301
            X.1Br r0 = r0.A08
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.7py r0 = (X.C7py) r0
            X.1Br r0 = r0.A01
            r304 = r0
            r0 = r304
            X.2yD r0 = X.1Br.A07(r0)
            r306 = r0
            r0 = 36325351625871999(0x810db70000527f, double:3.035636866427411E-306)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = 1
            r305 = r0
            r0 = r309
            if (r0 != 0) goto Lc7
        Lc2:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        Lc7:
            r0 = r305
            return r0
        Lca:
            r0 = r302
            boolean r0 = r0.A03()
            r305 = r0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass640.A03(X.622):boolean");
    }

    public final boolean A04(AnonymousClass622 anonymousClass622) {
        11T.A0F(anonymousClass622, 0);
        1Br A03 = 1Lm.A03(this.A00, this.A02.A00, 49957);
        if (!anonymousClass622.A04()) {
            anonymousClass622.A03();
        }
        if (((66K) A03.A00.get()).A02()) {
            return true;
        }
        return ((2yD) ((C66Z) this.A0C.A00.get()).A01.A00.get()).AZk(2342155304139952331L) && anonymousClass622.A0l;
    }

    public final boolean A05(AnonymousClass622 anonymousClass622) {
        String str;
        SentShareAttachment sentShareAttachment;
        Message message = anonymousClass622.A03;
        5Pm r0 = message.A08;
        if (r0 == null) {
            return false;
        }
        if (C00653oY.A00((C00653oY) this.A09.A00.get(), message) == C5ak.PAYMENT && (sentShareAttachment = message.A0R) != null && sentShareAttachment.A03 != null) {
            return false;
        }
        if (!((C00663oZ) this.A0A.A00.get()).A05(message) || BXU.A00(GraphQLStoryAttachmentStyle.A05, r0)) {
            return !(anonymousClass622.A04.A03("DISABLE_LINKS") || anonymousClass622.A0l) || anonymousClass622.A0Z || (str = message.A0F().A00) == null || str.length() == 0 || !((C66Z) this.A0C.A00.get()).A00();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (X.C1q7.A0H(r0) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A06(X.AnonymousClass622 r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.messaging.model.messages.Message r0 = r0.A03
            r303 = r0
            r0 = r303
            boolean r0 = X.C1q7.A0D(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L41
            r0 = r303
            java.lang.String r0 = r0.A1m
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L41
            r0 = r301
            X.1Br r0 = r0.A07
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.64N r0 = (X.64N) r0
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.A01(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L41
            r0 = r303
            boolean r0 = X.C1q7.A0H(r0)
            r304 = r0
            r0 = 1
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L46
        L41:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L46:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass640.A06(X.622):boolean");
    }
}
