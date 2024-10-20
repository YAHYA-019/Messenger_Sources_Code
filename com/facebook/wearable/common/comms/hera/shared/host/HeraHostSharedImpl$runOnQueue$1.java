package com.facebook.wearable.common.comms.hera.shared.host;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.2aI;
import X.AnonymousClass001;
import com.facebook.wearable.common.util.queue.JobQueue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: HeraHostSharedImpl$runOnQueue$1.class */
public final class HeraHostSharedImpl$runOnQueue$1 extends 0DO implements Function2 {
    public final /* synthetic */ Function1 $job;
    public int label;
    public final /* synthetic */ HeraHostSharedImpl this$0;

    /* renamed from: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$runOnQueue$1$1, reason: invalid class name */
    /* loaded from: HeraHostSharedImpl$runOnQueue$1$1.class */
    public final class AnonymousClass1 extends 0DO implements Function1 {
        public final /* synthetic */ Function1 $job;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function1 function1, 0DR r303) {
            super(1, r303);
            this.$job = function1;
        }

        public final 0DR create(0DR r302) {
            return new AnonymousClass1(this.$job, r302);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(0DR r302) {
            return new AnonymousClass1(this.$job, r302).invokeSuspend(04S.A00);
        }

        public final Object invokeSuspend(Object obj) {
            0Ds r0 = 0Ds.A02;
            int i = this.label;
            if (i == 0) {
                0Dt.A00(obj);
                Function1 function1 = this.$job;
                this.label = 1;
                if (function1.invoke(this) == r0) {
                    return r0;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
            }
            return 04S.A00;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$job.invoke(this);
            return 04S.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraHostSharedImpl$runOnQueue$1(HeraHostSharedImpl heraHostSharedImpl, Function1 function1, 0DR r304) {
        super(2, r304);
        this.this$0 = heraHostSharedImpl;
        this.$job = function1;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new HeraHostSharedImpl$runOnQueue$1(this.this$0, this.$job, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(2aI r302, 0DR r303) {
        return create(r302, r303).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            JobQueue jobQueue = this.this$0.queue;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$job, null);
            this.label = 1;
            if (jobQueue.A00(this, anonymousClass1) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return 04S.A00;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        this.this$0.queue.A00(this, new AnonymousClass1(this.$job, null));
        return 04S.A00;
    }
}
