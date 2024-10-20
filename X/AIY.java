package X;

import com.facebook.common.concurrent.kotlin.CompletableFutureExtensionsKt;
import com.facebook.messaging.encryptedbackups.passkey.util.EbApiResultExtensionsKt;
import com.facebook.messaging.sharedalbum.repository.RepositoryHelperKt;

/* loaded from: AIY.class */
public final class AIY extends 0DP {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIY(int i, 0DR r303) {
        super(r303);
        this.A02 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.AIY) r302).A02 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.AIY
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.AIY r0 = (X.AIY) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A02
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r301
            if (r0 == r1) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIY.A01(int, java.lang.Object):boolean");
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A02;
        this.A01 = obj;
        this.A00 |= (-1) << (-1);
        switch (i) {
            case 0:
                return CompletableFutureExtensionsKt.A01(null, this);
            case 1:
                return EbApiResultExtensionsKt.A00(null, this);
            case 2:
                return RepositoryHelperKt.A03(null, null, this);
            default:
                return C44k.A02(this);
        }
    }
}
