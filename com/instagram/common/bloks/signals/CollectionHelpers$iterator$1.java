package com.instagram.common.bloks.signals;

import X.04S;
import X.0DQ;
import X.0DR;
import X.0Ml;
import X.Kui;
import kotlin.jvm.functions.Function2;

/* loaded from: CollectionHelpers$iterator$1.class */
public final class CollectionHelpers$iterator$1 extends 0Ml implements Function2 {
    public final /* synthetic */ Kui $map;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionHelpers$iterator$1(Kui kui, 0DR r303) {
        super(2, r303);
        this.$map = kui;
    }

    public final 0DR create(Object obj, 0DR r303) {
        CollectionHelpers$iterator$1 collectionHelpers$iterator$1 = new CollectionHelpers$iterator$1(this.$map, r303);
        collectionHelpers$iterator$1.L$0 = obj;
        return collectionHelpers$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x017c, code lost:
    
        if (r305 == 8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008f -> B:6:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00fe -> B:6:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0162 -> B:18:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0165 -> B:7:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.bloks.signals.CollectionHelpers$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
