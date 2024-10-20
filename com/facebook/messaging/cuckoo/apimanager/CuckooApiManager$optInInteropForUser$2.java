package com.facebook.messaging.cuckoo.apimanager;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: CuckooApiManager$optInInteropForUser$2.class */
public final class CuckooApiManager$optInInteropForUser$2 extends 0DO implements Function2 {
    public final /* synthetic */ List $allowedIntegratorList;
    public final /* synthetic */ String $interopUsername;
    public final /* synthetic */ boolean $optInWithServerData;
    public int label;
    public final /* synthetic */ CuckooApiManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuckooApiManager$optInInteropForUser$2(CuckooApiManager cuckooApiManager, String str, List list, 0DR r305, boolean z) {
        super(2, r305);
        this.this$0 = cuckooApiManager;
        this.$allowedIntegratorList = list;
        this.$interopUsername = str;
        this.$optInWithServerData = z;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new CuckooApiManager$optInInteropForUser$2(this.this$0, this.$interopUsername, this.$allowedIntegratorList, r303, this.$optInWithServerData);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.cuckoo.apimanager.CuckooApiManager$optInInteropForUser$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
