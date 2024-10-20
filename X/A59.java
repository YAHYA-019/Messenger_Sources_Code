package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mobileconfig.init.MobileConfigSessionlessInit;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.sdk.mca.MailboxSDK$MentionsParams;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;
import java.util.ArrayList;

/* loaded from: A59.class */
public final class A59 implements 5Q4 {
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
    public final Context A0A;
    public final ThreadKey A0B;
    public final C1AJ A0C;

    /* JADX WARN: Type inference failed for: r0v20, types: [X.1AJ, java.lang.Object] */
    public A59(1De r302, ThreadKey threadKey) {
        this.A00 = r302;
        this.A0B = threadKey;
        1BY r0 = r302.A00;
        this.A09 = 1Bu.A03(r0, 16428);
        this.A06 = 1Bq.A00(68077);
        this.A02 = 1Bu.A03(r0, 68925);
        this.A01 = 1Bu.A03(r0, 115941);
        this.A08 = 1Bq.A00(65630);
        this.A0C = new Object();
        this.A07 = 1Bu.A03(r0, 116182);
        this.A05 = 1BK.A0C();
        this.A04 = 1Bq.A00(68243);
        this.A03 = 1Bq.A00(68926);
        this.A0A = 7zQ.A0I(r0);
    }

    public final void A00(Bitmap bitmap, FbUserSession fbUserSession, ThreadKey threadKey, MailboxCallback mailboxCallback, MailboxSDK$MentionsParams mailboxSDK$MentionsParams, SendTamXMAMessageParams sendTamXMAMessageParams, Number number, String str, String str2, String str3, String str4, String str5, String str6) {
        11T.A0F(fbUserSession, 0);
        1Br.A0C(this.A02);
        int i = 4;
        if (ThreadKey.A0S(threadKey)) {
            i = 15;
        }
        Ilp ilp = new Ilp(fbUserSession, threadKey, mailboxCallback, 5Q5.A00((PrivacyContext) null, (Integer) null, Integer.valueOf(i), number, str2, str4, str3), mailboxSDK$MentionsParams, this, sendTamXMAMessageParams, str5, str6, str);
        if (bitmap != null) {
            ilp.A00("image/jpeg", bitmap);
            return;
        }
        String str7 = sendTamXMAMessageParams.A0E;
        if (!"null".equals(str7) && str7 != null && str7.length() != 0) {
            try {
                Uri A03 = C0A2.A03(str7);
                if (A03 != null) {
                    if (!sendTamXMAMessageParams.A0I) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        A0s.add(7zT.A0C(A03));
                        String str8 = sendTamXMAMessageParams.A0B;
                        if (str8 != null && str8.length() != 0) {
                            try {
                                Uri A032 = C0A2.A03(str8);
                                if (A032 != null) {
                                    A0s.add(7zT.A0C(A032));
                                }
                            } catch (SecurityException unused) {
                            }
                        }
                        ((I4Y) 1Br.A0B(this.A01)).A03(ilp, A0s);
                        return;
                    }
                    if (!1Br.A07(this.A05).AZk(36323019458693266L)) {
                        2EU A033 = ((2DX) 1Br.A0B(this.A08)).A03(1, 1);
                        try {
                            ilp.BMi(11T.A03(A033.A09()), 11T.A03("image/bmp"));
                            A033.close();
                            return;
                        } catch (Throwable th) {
                            2EU.A04(A033);
                            throw th;
                        }
                    }
                }
            } catch (SecurityException unused2) {
            }
        }
        ilp.BMi(C0ty.A00, 11T.A03("image/jpeg"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (((X.7T7) X.1Br.A0B(r301.A04)).A02(((X.5gC) r302).A02) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BQg(X.C5fv r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            boolean r0 = r0 instanceof X.5gC
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0B
            r307 = r0
            r0 = r307
            boolean r0 = r0.A0z()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L51
            r0 = r301
            X.1Br r0 = r0.A04
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.7T7 r0 = (X.7T7) r0
            r304 = r0
            r0 = r302
            r307 = r0
            r0 = r302
            X.5gC r0 = (X.5gC) r0
            java.lang.CharSequence r0 = r0.A02
            r307 = r0
            r0 = r304
            r1 = r307
            boolean r0 = r0.A02(r1)
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L55
        L51:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L55:
            r0 = r302
            X.5gC r0 = (X.5gC) r0
            r302 = r0
            r0 = r302
            X.6Bu r0 = r0.A01
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L6c
            r0 = r303
            if (r0 != 0) goto L6c
            r0 = 1
            r306 = r0
        L6c:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A59.BQg(X.5fv):boolean");
    }

    public void Ckt(ThreadKey threadKey, AnonymousClass539 anonymousClass539, 7TA r304, C5fv c5fv, String str, String str2, boolean z) {
        11T.A0F(threadKey, 0);
        1BL.A1F(r304, c5fv);
        5gC r0 = (5gC) c5fv;
        6Bu r02 = r0.A01;
        if (r02 != null) {
            C7ud c7ud = C7mo.A00;
            String A02 = c7ud.A02(this.A0A, (5Et) 1Br.A0B(this.A07), threadKey, c5fv);
            String str3 = r02.A0J;
            if (!c7ud.A03(this.A0C, str3)) {
                str3 = r02.A07;
            }
            String valueOf = String.valueOf(r02.A01);
            String str4 = r02.A0E;
            String str5 = r02.A0C;
            String str6 = r0.A03;
            MailboxSDK$MentionsParams mailboxSDK$MentionsParams = null;
            SendTamXMAMessageParams sendTamXMAMessageParams = new SendTamXMAMessageParams(null, null, null, null, "none", str3, null, null, null, valueOf, str4, str5, str6, null, null, null, 0, MobileConfigSessionlessInit.SYNC_UPDATE_WAIT_TIME_MS, false);
            CharSequence charSequence = r0.A02;
            Long l = null;
            if (charSequence != null) {
                mailboxSDK$MentionsParams = ((7TG) 1Br.A0B(this.A03)).A00(threadKey, charSequence);
            }
            FbUserSession A03 = 1Br.A03(this.A09);
            A1R a1r = A1R.A00;
            String str7 = ((C5fu) c5fv).A0B;
            if (str7 != null) {
                l = 0CW.A0e(str7);
            }
            A00(null, A03, threadKey, a1r, mailboxSDK$MentionsParams, sendTamXMAMessageParams, l, str6, A02, str, str2, null, null);
        }
    }
}
