package com.facebook.quickpromotion.filterextensions.impl;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.44I;
import X.44M;
import X.44N;
import X.AnonymousClass001;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: PostLoadInitializer$performPostloadInitialization$1$job$1.class */
public final class PostLoadInitializer$performPostloadInitialization$1$job$1 extends 0DO implements Function2 {
    public final /* synthetic */ List $promotions;
    public final /* synthetic */ PostLoadInitializer $this_runCatching;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostLoadInitializer$performPostloadInitialization$1$job$1(PostLoadInitializer postLoadInitializer, List list, 0DR r304) {
        super(2, r304);
        this.$promotions = list;
        this.$this_runCatching = postLoadInitializer;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new PostLoadInitializer$performPostloadInitialization$1$job$1(this.$this_runCatching, this.$promotions, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Iterator it;
        44N r0;
        0Ds r02 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            it = this.$promotions.iterator();
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            it = (Iterator) this.L$0;
            0Dt.A00(obj);
        }
        while (it.hasNext()) {
            44M r03 = (44M) ((44I) it.next()).A02.getValue();
            if (r03 != null && (r0 = (44N) r03.A01.getValue()) != null) {
                PostLoadInitializer postLoadInitializer = this.$this_runCatching;
                this.L$0 = it;
                this.label = 1;
                if (PostLoadInitializer.A01(postLoadInitializer, r0, this) == r02) {
                    return r02;
                }
            }
        }
        return 04S.A00;
    }
}
