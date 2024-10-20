package X;

import kotlin.jvm.functions.Function1;

/* loaded from: DD1.class */
public final class DD1 extends C00q implements Function1 {
    public final /* synthetic */ AlS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD1(AlS alS) {
        super(1);
        this.this$0 = alS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable, X.D8r, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable, java.util.concurrent.Executor] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.messaging.model.threads.ThreadSummary r0 = (com.facebook.messaging.model.threads.ThreadSummary) r0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.AlS r0 = r0.this$0
            r304 = r0
            int r0 = X.AlS.A0f
            r0 = r304
            com.facebook.auth.usersession.FbUserSession r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L27
            X.7zL.A1C()
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L27:
            r0 = r304
            android.content.Context r0 = r0.requireContext()
            r1 = r305
            r2 = r302
            com.google.common.util.concurrent.SettableFuture r0 = X.BSi.A00(r0, r1, r2)
            r306 = r0
            r0 = 16456(0x4048, float:2.306E-41)
            r307 = r0
            r0 = r301
            X.AlS r0 = r0.this$0
            r303 = r0
            X.D8r r0 = new X.D8r
            r305 = r0
            r0 = r305
            r1 = r303
            r2 = r302
            r3 = r306
            r0.<init>(r1, r2, r3)
            r0 = r307
            java.util.concurrent.Executor r0 = X.7zM.A1E(r0)     // Catch: java.lang.Throwable -> L5f
            r303 = r0
            r0 = r306
            r1 = r305
            r2 = r303
            r0.addListener(r1, r2)
            X.04S r0 = X.04S.A00
            return r0
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DD1.invoke(java.lang.Object):java.lang.Object");
    }
}
