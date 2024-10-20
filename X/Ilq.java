package X;

import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;
import java.util.List;

/* loaded from: Ilq.class */
public final class Ilq implements JJP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6AO A01;
    public final /* synthetic */ 7TA A02;
    public final /* synthetic */ AnonymousClass729 A03;
    public final /* synthetic */ SendTamXMAMessageParams A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ List A0G;

    public Ilq(6AO r302, 7TA r303, AnonymousClass729 anonymousClass729, SendTamXMAMessageParams sendTamXMAMessageParams, Boolean bool, Long l, Number number, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, long j) {
        this.A07 = number;
        this.A03 = anonymousClass729;
        this.A05 = bool;
        this.A04 = sendTamXMAMessageParams;
        this.A0B = str;
        this.A00 = j;
        this.A02 = r303;
        this.A09 = str2;
        this.A0F = str3;
        this.A0E = str4;
        this.A0A = str5;
        this.A0D = str6;
        this.A0C = str7;
        this.A06 = l;
        this.A01 = r302;
        this.A08 = str8;
        this.A0G = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(android.graphics.Bitmap r302, android.graphics.Bitmap r303, java.lang.Number r304, java.lang.String r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ilq.A00(android.graphics.Bitmap, android.graphics.Bitmap, java.lang.Number, java.lang.String, java.lang.String):void");
    }

    public void BM3(Throwable th) {
        0fH.A0k("XmaMessageSendBinder", AnonymousClass001.A0Z(th, " Fail to fetch preview. ", AnonymousClass001.A0k()));
        2EU A03 = ((2DX) 1Br.A0B(this.A03.A06)).A03(1, 1);
        try {
            BMi(11T.A03(A03.A09()), 11T.A03("image/jpeg"));
            A03.close();
        } catch (Throwable th2) {
            2EU.A04(A03);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r307 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BMi(java.util.List r302, java.util.List r303) {
        /*
            r301 = this;
            r0 = 1
            r304 = r0
            r0 = r303
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r303
            boolean r0 = X.1BK.A1Y(r0)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L21
            r0 = r303
            r1 = 0
            java.lang.String r0 = X.1BK.A14(r0, r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L26
        L21:
            java.lang.String r0 = "image/jpeg"
            r307 = r0
        L26:
            r0 = r302
            int r0 = r0.size()
            r305 = r0
            r0 = r305
            r1 = r304
            if (r0 <= r1) goto L87
            r0 = r302
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r308 = r0
        L40:
            r0 = r303
            int r0 = r0.size()
            r305 = r0
            r0 = r305
            r1 = r304
            if (r0 <= r1) goto L81
            r0 = r303
            r1 = r304
            java.lang.String r0 = X.1BK.A14(r0, r1)
            r309 = r0
        L55:
            r0 = r302
            boolean r0 = X.1BK.A1Y(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L6c
            r0 = r302
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r306 = r0
        L6c:
            r0 = r301
            java.lang.Number r0 = r0.A07
            r310 = r0
            r0 = r301
            r1 = r306
            r2 = r308
            r3 = r310
            r4 = r307
            r5 = r309
            r0.A00(r1, r2, r3, r4, r5)
            return
        L81:
            r0 = 0
            r309 = r0
            goto L55
        L87:
            r0 = 0
            r308 = r0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ilq.BMi(java.util.List, java.util.List):void");
    }
}
