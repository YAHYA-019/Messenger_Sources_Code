package X;

import android.net.Uri;
import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.ChatTemplate;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Axz, reason: case insensitive filesystem */
/* loaded from: Axz.class */
public final class C1970Axz extends 1LH {
    public final ChatTemplate A00;
    public final Bcs A01;
    public final MigColorScheme A02;

    public C1970Axz(ChatTemplate chatTemplate, Bcs bcs, MigColorScheme migColorScheme) {
        7zR.A1O(chatTemplate, bcs);
        this.A02 = migColorScheme;
        this.A00 = chatTemplate;
        this.A01 = bcs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r306 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C2lh r301, X.C1970Axz r302) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1970Axz.A01(X.2lh, X.Axz):void");
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, new DCw(this, 30));
        2lQ r0 = 2lO.A02;
        ChatTemplate chatTemplate = this.A00;
        boolean z = chatTemplate.A04;
        AR7 ar7 = new AR7(A00, this, 9);
        Integer num = 0S2.A1G;
        if (!z) {
            ar7 = null;
        }
        2lO A0L = 4YV.A0L((2lO) null, num, ar7, 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        1Iw r02 = A0L2.A00;
        MigColorScheme migColorScheme = this.A02;
        C2sS A002 = C2rr.A00(r02);
        A002.A2Y(C2q0.A05);
        2RH r03 = 2RH.A03;
        7zO.A1K(A002, r03);
        7zO.A1I(A002, r03);
        A002.A2Z(migColorScheme);
        Uri uri = null;
        try {
            uri = C0A2.A03(chatTemplate.A03);
        } catch (SecurityException unused) {
        }
        A002.A2X(uri);
        A0L2.A00(A002.A2W());
        2lO A0X = 7zQ.A0X((2lO) null, 0S2.A01, 1.0f);
        C2sn A0U = 7zQ.A0U(r02);
        1Iw r04 = A0U.A00;
        2KD A01 = 2K3.A01(r04, 0);
        7zQ.A1W(A01, chatTemplate.A02);
        A01.A2x(migColorScheme);
        2KD A0d = 7zR.A0d(r04, A0U, A01, 0);
        7zQ.A1S(A0d, chatTemplate.A01);
        A0d.A2x(migColorScheme);
        4YU.A1N(A0d, 2RH.A07);
        7zQ.A1E(A0d.A2W(), A0U, A0L2, A0X);
        AwZ A003 = Dyc.A00(A0L2.AeS());
        A003.A2Y(7zP.A1V(A00));
        A003.A2Z(z);
        A003.A2X(migColorScheme);
        A003.A01.A00 = z ? 7zO.A0U(new AR7(A00, this, 8)) : null;
        7zO.A1L(A003, r03);
        A0L2.A00(A003.A2W());
        return C2so.A0M(A0L2, c2k5, A0L);
    }
}
