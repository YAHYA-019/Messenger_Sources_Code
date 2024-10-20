package com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma;

import X.0DR;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2Dp;
import X.2IA;
import X.2rA;
import X.5Q7;
import X.AKN;
import X.C01g;
import X.C01i;
import X.C06804hy;
import X.C0A2;
import X.I4Y;
import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: XmaReplyMessageSender.class */
public final class XmaReplyMessageSender {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C01i A06;

    public XmaReplyMessageSender(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A02 = 1Lm.A00(context, fbUserSession, 65962);
        this.A01 = 1Bu.A01(context, 115941);
        this.A03 = 1Bu.A01(context, 100216);
        this.A05 = 1Bu.A01(context, 68240);
        this.A06 = C01g.A01(new AKN(this, 0));
        this.A04 = 1Bu.A01(context, 68319);
    }

    private final Object A00(String str, 0DR r303) {
        Uri uri = null;
        try {
            uri = C0A2.A03(str);
        } catch (SecurityException unused) {
        }
        if (uri == null) {
            return null;
        }
        2IA A01 = 2IA.A01(uri);
        5Q7 r0 = new 5Q7();
        ((2rA) r0).A08 = true;
        ((2rA) r0).A0A = true;
        A01.A04 = new C06804hy(r0);
        2Dp A04 = A01.A04();
        I4Y i4y = (I4Y) 1Br.A0B(this.A01);
        11T.A0D(A04);
        return i4y.A01(A04, r303);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0436, code lost:
    
        if (r342 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x055c, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    /* JADX WARN: Type inference failed for: r0v242, types: [X.5g9] */
    /* JADX WARN: Type inference failed for: r0v245, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v276, types: [X.5g9] */
    /* JADX WARN: Type inference failed for: r0v279, types: [java.lang.Number] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(X.C5g8 r302, com.facebook.stickers.model.Sticker r303, com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams r304, java.lang.Long r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, X.0DR r309, long r310, long r312, long r314) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.XmaReplyMessageSender.A01(X.5g8, com.facebook.stickers.model.Sticker, com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, X.0DR, long, long, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x02d9, code lost:
    
        if (r316 == null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    /* JADX WARN: Type inference failed for: r0v180, types: [X.5g9] */
    /* JADX WARN: Type inference failed for: r0v183, types: [java.lang.Number] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(X.C5g8 r302, com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams r303, java.lang.Long r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, X.0DR r309, long r310, long r312, long r314) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.XmaReplyMessageSender.A02(X.5g8, com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0DR, long, long, long):java.lang.Object");
    }
}
