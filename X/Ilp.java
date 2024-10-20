package X;

import android.graphics.Bitmap;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.sdk.mca.MailboxSDK$MentionsParams;
import com.facebook.sdk.mca.MailboxSDK$XMASendOptions;
import com.facebook.sdk.mca.MailboxSDK$XMASenderCopyOptions;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;
import java.io.ByteArrayOutputStream;

/* loaded from: Ilp.class */
public final class Ilp implements JJP {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ MailboxCallback A02;
    public final /* synthetic */ LoggingOption A03;
    public final /* synthetic */ MailboxSDK$MentionsParams A04;
    public final /* synthetic */ A59 A05;
    public final /* synthetic */ SendTamXMAMessageParams A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public Ilp(FbUserSession fbUserSession, ThreadKey threadKey, MailboxCallback mailboxCallback, LoggingOption loggingOption, MailboxSDK$MentionsParams mailboxSDK$MentionsParams, A59 a59, SendTamXMAMessageParams sendTamXMAMessageParams, String str, String str2, String str3) {
        this.A06 = sendTamXMAMessageParams;
        this.A09 = str;
        this.A08 = str2;
        this.A05 = a59;
        this.A00 = fbUserSession;
        this.A01 = threadKey;
        this.A07 = str3;
        this.A03 = loggingOption;
        this.A04 = mailboxSDK$MentionsParams;
        this.A02 = mailboxCallback;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.sdk.mca.MailboxSDK$XMASendOptions] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.facebook.sdk.mca.MailboxSDK$XMASenderCopyOptions, java.lang.Object] */
    public final void A00(String str, Bitmap bitmap) {
        ?? obj = new Object();
        SendTamXMAMessageParams sendTamXMAMessageParams = this.A06;
        boolean z = sendTamXMAMessageParams.A0I;
        String str2 = this.A09;
        obj.gatingType = Integer.valueOf(C7ud.A00(str2, z));
        obj.gatingTitle = C7ud.A01(str2, this.A08, z);
        ?? obj2 = new Object();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = sendTamXMAMessageParams.A00;
        int i2 = 80;
        if (i == 3003) {
            i2 = 40;
        }
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        11T.A0D(byteArray);
        if (AnonymousClass001.A1O(byteArray.length)) {
            byteArray = 2yD.A03(1Br.A07(this.A05.A05), 36316439579797681L) ? null : DKC.A1a("no preview but will deliver", C03r.A05);
        }
        obj2.previewData = byteArray;
        obj2.targetExpiryTimestampMs = sendTamXMAMessageParams.A05;
        obj2.defaultCta = sendTamXMAMessageParams.A0A;
        obj2.previewHeight = bitmap != null ? Integer.valueOf(bitmap.getHeight()) : null;
        obj2.previewWidth = bitmap != null ? Integer.valueOf(bitmap.getWidth()) : null;
        obj2.previewMimeType = str;
        obj2.titleText = sendTamXMAMessageParams.A0D;
        obj2.subtitleText = sendTamXMAMessageParams.A0G;
        obj2.xmaDataClass = null;
        int i3 = 0;
        if (i == 3003) {
            i3 = 2;
        }
        FbUserSession fbUserSession = this.A00;
        A59 a59 = this.A05;
        5P8 r0 = (5P8) 4YU.A0n(fbUserSession, a59.A00, 65961);
        1Br.A0C(a59.A06);
        r0.A0O(this.A03, this.A04, (MailboxSDK$XMASendOptions) obj, (MailboxSDK$XMASenderCopyOptions) obj2, 1BK.A0n(AbstractC00603o4.A00(41)), 5QA.A00(this.A01), this.A07, "", i3).A00(this.A02);
    }

    public void BM3(Throwable th) {
        0fH.A0k("XmaMessageSendBinder", AnonymousClass001.A0Z(th, " Fail to fetch preview. ", AnonymousClass001.A0k()));
        2EU A03 = ((2DX) 1Br.A0B(this.A05.A08)).A03(1, 1);
        try {
            BMi(11T.A03(A03.A09()), 11T.A03("image/jpeg"));
            A03.close();
        } catch (Throwable th2) {
            2EU.A04(A03);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r307 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BMi(java.util.List r302, java.util.List r303) {
        /*
            r301 = this;
            r0 = r303
            boolean r0 = X.7zP.A1X(r0)
            r304 = r0
            r0 = r303
            boolean r0 = X.1BK.A1Y(r0)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L1f
            r0 = r303
            r1 = r304
            java.lang.String r0 = X.1BK.A14(r0, r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L24
        L1f:
            java.lang.String r0 = "image/jpeg"
            r307 = r0
        L24:
            r0 = r302
            boolean r0 = X.1BK.A1Y(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3b
            r0 = r302
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r306 = r0
        L3b:
            r0 = r301
            r1 = r307
            r2 = r306
            r0.A00(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ilp.BMi(java.util.List, java.util.List):void");
    }
}
