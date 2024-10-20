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

/* loaded from: HeraHostSharedImpl$onRemoteAvailability$$inlined$runOnQueue$1.class */
public final class HeraHostSharedImpl$onRemoteAvailability$$inlined$runOnQueue$1 extends 0DO implements Function2 {
    public final /* synthetic */ boolean $available$inlined;
    public final /* synthetic */ int $remoteId$inlined;
    public int label;
    public final /* synthetic */ HeraHostSharedImpl this$0;
    public final /* synthetic */ HeraHostSharedImpl this$0$inline_fun;

    /* renamed from: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$onRemoteAvailability$$inlined$runOnQueue$1$1, reason: invalid class name */
    /* loaded from: HeraHostSharedImpl$onRemoteAvailability$$inlined$runOnQueue$1$1.class */
    public final class AnonymousClass1 extends 0DO implements Function1 {
        public final /* synthetic */ boolean $available$inlined;
        public final /* synthetic */ int $remoteId$inlined;
        public int label;
        public final /* synthetic */ HeraHostSharedImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(0DR r302, HeraHostSharedImpl heraHostSharedImpl, int i, boolean z) {
            super(1, r302);
            this.this$0 = heraHostSharedImpl;
            this.$remoteId$inlined = i;
            this.$available$inlined = z;
        }

        public final 0DR create(0DR r302) {
            return new AnonymousClass1(r302, this.this$0, this.$remoteId$inlined, this.$available$inlined);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(0DR r302) {
            return create(r302).invokeSuspend(04S.A00);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r302) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$onRemoteAvailability$$inlined$runOnQueue$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraHostSharedImpl$onRemoteAvailability$$inlined$runOnQueue$1(HeraHostSharedImpl heraHostSharedImpl, 0DR r303, HeraHostSharedImpl heraHostSharedImpl2, int i, boolean z) {
        super(2, r303);
        this.this$0$inline_fun = heraHostSharedImpl;
        this.this$0 = heraHostSharedImpl2;
        this.$remoteId$inlined = i;
        this.$available$inlined = z;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new HeraHostSharedImpl$onRemoteAvailability$$inlined$runOnQueue$1(this.this$0$inline_fun, r303, this.this$0, this.$remoteId$inlined, this.$available$inlined);
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
            JobQueue jobQueue = this.this$0$inline_fun.queue;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.this$0, this.$remoteId$inlined, this.$available$inlined);
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
}
