package com.facebook.messaging.msys.thread.aibot.nullstate.animation;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.AnonymousClass001;
import X.C06074fs;
import X.C44k;
import X.JVb;
import kotlin.jvm.functions.Function2;

/* loaded from: AiBotDonutAnimationHandler$startAnimation$1.class */
public final class AiBotDonutAnimationHandler$startAnimation$1 extends 0DO implements Function2 {
    public final /* synthetic */ long $delay;
    public int label;
    public final /* synthetic */ C06074fs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotDonutAnimationHandler$startAnimation$1(C06074fs c06074fs, 0DR r303, long j) {
        super(2, r303);
        this.$delay = j;
        this.this$0 = c06074fs;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AiBotDonutAnimationHandler$startAnimation$1(this.this$0, r303, this.$delay);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            long j = this.$delay;
            this.label = 1;
            if (C44k.A01(this, j) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        C06074fs c06074fs = this.this$0;
        JVb jVb = c06074fs.A00;
        if (jVb != null) {
            jVb.stop();
        }
        JVb jVb2 = c06074fs.A00;
        if (jVb2 != null) {
            jVb2.A01();
        }
        JVb jVb3 = this.this$0.A00;
        if (jVb3 != null) {
            jVb3.start();
        }
        return 04S.A00;
    }
}
