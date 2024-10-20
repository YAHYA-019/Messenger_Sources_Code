package com.meta.metaai.shared.litho.ui.particlering;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.DOp;
import kotlin.jvm.functions.Function2;

/* loaded from: ParticleRingView$updateToSparkleType$1.class */
public final class ParticleRingView$updateToSparkleType$1 extends 0DO implements Function2 {
    public final /* synthetic */ int $activeEndPosition;
    public final /* synthetic */ int $activeStartPosition;
    public final /* synthetic */ long $duration;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ DOp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParticleRingView$updateToSparkleType$1(DOp dOp, 0DR r303, int i, int i2, long j) {
        super(2, r303);
        this.this$0 = dOp;
        this.$activeStartPosition = i;
        this.$activeEndPosition = i2;
        this.$duration = j;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new ParticleRingView$updateToSparkleType$1(this.this$0, r303, this.$activeStartPosition, this.$activeEndPosition, this.$duration);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00dd -> B:6:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
