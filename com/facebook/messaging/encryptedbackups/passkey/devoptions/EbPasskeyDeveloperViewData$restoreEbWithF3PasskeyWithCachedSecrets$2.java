package com.facebook.messaging.encryptedbackups.passkey.devoptions;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: EbPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2.class */
public final class EbPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2 extends 0DO implements Function2 {
    public final /* synthetic */ List $passkeysAndSecrets;
    public final /* synthetic */ String $userId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ EbPasskeyDeveloperViewData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EbPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2(EbPasskeyDeveloperViewData ebPasskeyDeveloperViewData, String str, List list, 0DR r305) {
        super(2, r305);
        this.this$0 = ebPasskeyDeveloperViewData;
        this.$passkeysAndSecrets = list;
        this.$userId = str;
    }

    public final 0DR create(Object obj, 0DR r303) {
        EbPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2 ebPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2 = new EbPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2(this.this$0, this.$userId, this.$passkeysAndSecrets, r303);
        ebPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2.L$0 = obj;
        return ebPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f4, code lost:
    
        if (r302 != r0) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bd  */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.2b1] */
    /* JADX WARN: Type inference failed for: r0v70, types: [X.2b1] */
    /* JADX WARN: Type inference failed for: r0v73, types: [X.2b1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.devoptions.EbPasskeyDeveloperViewData$restoreEbWithF3PasskeyWithCachedSecrets$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
