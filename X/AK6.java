package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import kotlin.jvm.functions.Function1;

/* loaded from: AK6.class */
public final class AK6 extends 01I implements Function1 {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AK6(java.lang.Object r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r304 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r303
            switch(r0) {
                case 0: goto L46;
                case 1: goto L58;
                default: goto L20;
            }
        L20:
            java.lang.Class<X.6rJ> r0 = X.6rJ.class
            r305 = r0
            r0 = 1
            r306 = r0
            java.lang.String r0 = "getMessageSender"
            r307 = r0
            r0 = 1137(0x471, float:1.593E-42)
            r308 = r0
            r0 = r308
            java.lang.String r0 = X.4YT.A00(r0)
            r309 = r0
        L37:
            r0 = r304
            r1 = r306
            r2 = r302
            r3 = r305
            r4 = r307
            r5 = r309
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L46:
            java.lang.Class<X.7Er> r0 = X.7Er.class
            r305 = r0
            r0 = 1
            r306 = r0
            java.lang.String r0 = "criticalPathAwareSubmitWithDedupOption"
            r307 = r0
            java.lang.String r0 = "criticalPathAwareSubmitWithDedupOption(J)V"
            r309 = r0
            goto L37
        L58:
            java.lang.Class<X.9ma> r0 = X.C9ma.class
            r305 = r0
            r0 = 1
            r306 = r0
            java.lang.String r0 = "confirmPermissions"
            r307 = r0
            java.lang.String r0 = "confirmPermissions(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r309 = r0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AK6.<init>(java.lang.Object, int):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                long A05 = AnonymousClass001.A05(obj);
                7Er r0 = (7Er) ((01K) this).receiver;
                1QB r02 = (1QB) 1Bu.A06(r0.A01, 65841);
                1Qc r03 = (1Qc) 1Br.A0B(r0.A02);
                r02.A02(new 7Fu(r0, A05));
                r02.A03(ServerW3CShippingAddressConstants.DEFAULT);
                r02.A04("UpdateThreadSessionId");
                r03.A03(r02.A01(), "KeepExisting");
                return 04S.A00;
            case 1:
                C9ma c9ma = (C9ma) ((01K) this).receiver;
                C2s7 A0d = 7zV.A0d((0DR) obj);
                ((53U) c9ma.A0W.getValue()).AHP(new BHq(A0d, c9ma, 0), AnonymousClass000.A00(48));
                return A0d.A0C();
            default:
                ThreadKey threadKey = (ThreadKey) obj;
                11T.A0F(threadKey, 0);
                return ((6rJ) ((01K) this).receiver).A0H(threadKey);
        }
    }
}
