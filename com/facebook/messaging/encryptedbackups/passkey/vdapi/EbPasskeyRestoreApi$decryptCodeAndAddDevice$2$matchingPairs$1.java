package com.facebook.messaging.encryptedbackups.passkey.vdapi;

import X.04S;
import X.0DQ;
import X.0DR;
import X.0Ml;
import X.9GV;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: EbPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1.class */
public final class EbPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1 extends 0Ml implements Function2 {
    public final /* synthetic */ List $passkeyAndSecrets;
    public final /* synthetic */ 9GV $vdList;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ EbPasskeyRestoreApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EbPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1(9GV r302, EbPasskeyRestoreApi ebPasskeyRestoreApi, List list, 0DR r305) {
        super(2, r305);
        this.this$0 = ebPasskeyRestoreApi;
        this.$vdList = r302;
        this.$passkeyAndSecrets = list;
    }

    public final 0DR create(Object obj, 0DR r303) {
        EbPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1 ebPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1 = new EbPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1(this.$vdList, this.this$0, this.$passkeyAndSecrets, r303);
        ebPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1.L$0 = obj;
        return ebPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0106 -> B:6:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi$decryptCodeAndAddDevice$2$matchingPairs$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
