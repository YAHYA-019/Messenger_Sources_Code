package com.facebook.messaging.msys.thread.writewithai.viewmodel;

import X.04S;
import X.0DO;
import X.0DR;
import X.8DO;
import X.AnonymousClass001;
import X.C0Bd;

/* loaded from: WriteWithAiViewModel$1.class */
public final class WriteWithAiViewModel$1 extends 0DO implements C0Bd {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ 8DO this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteWithAiViewModel$1(8DO r302, 0DR r303) {
        super(3, r303);
        this.this$0 = r302;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A03 = AnonymousClass001.A03(obj2);
        WriteWithAiViewModel$1 writeWithAiViewModel$1 = new WriteWithAiViewModel$1(this.this$0, (0DR) obj3);
        writeWithAiViewModel$1.L$0 = obj;
        writeWithAiViewModel$1.I$0 = A03;
        return writeWithAiViewModel$1.invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (r0 == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            r303 = r0
            r0 = r301
            int r0 = r0.label
            r304 = r0
            r0 = r304
            if (r0 != 0) goto Ld4
            r0 = r302
            X.0Dt.A00(r0)
            r0 = r301
            java.lang.Object r0 = r0.L$0
            X.8Lr r0 = (X.8Lr) r0
            r305 = r0
            r0 = r301
            int r0 = r0.I$0
            r306 = r0
            r0 = r301
            X.8DO r0 = r0.this$0
            r307 = r0
            r0 = r307
            X.0Xs r0 = r0.A0A
            r303 = r0
        L2a:
            r0 = r303
            java.lang.Object r0 = r0.getValue()
            r308 = r0
            r0 = r308
            r309 = r0
            r0 = r308
            X.8LA r0 = (X.8LA) r0
            r309 = r0
            r0 = r305
            boolean r0 = r0.A01
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L51
            r0 = 0
            r311 = r0
            r0 = r306
            if (r0 != 0) goto L54
        L51:
            r0 = 1
            r311 = r0
        L54:
            r0 = r305
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            r312 = r0
            r0 = r307
            X.AsO r0 = r0.A02()
            r313 = r0
            r0 = r313
            if (r0 == 0) goto Lce
            r0 = r313
            java.lang.Object r0 = r0.A00
            X.8Jr r0 = (X.8Jr) r0
            r313 = r0
            r0 = r313
            if (r0 == 0) goto Lce
            r0 = r313
            java.lang.String r0 = r0.A01
            r314 = r0
        L80:
            r0 = r309
            X.95m r0 = r0.A00
            r315 = r0
            r0 = r309
            java.util.List r0 = r0.A03
            r316 = r0
            r0 = r309
            java.lang.CharSequence r0 = r0.A01
            r317 = r0
            r0 = 1
            r1 = r315
            r2 = r312
            r3 = r316
            X.7zS.A17(r0, r1, r2, r3)
            X.8LA r0 = new X.8LA
            r309 = r0
            r0 = r309
            r1 = r315
            r2 = r317
            r3 = r314
            r4 = r312
            r5 = r316
            r6 = r310
            r7 = r310
            r8 = r310
            r9 = r311
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r303
            r1 = r308
            r2 = r309
            boolean r0 = r0.AGt(r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2a
            X.04S r0 = X.04S.A00
            return r0
        Lce:
            r0 = 0
            r314 = r0
            goto L80
        Ld4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.writewithai.viewmodel.WriteWithAiViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
