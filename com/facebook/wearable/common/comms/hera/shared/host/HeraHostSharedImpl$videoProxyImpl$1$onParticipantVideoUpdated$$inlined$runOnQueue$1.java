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

/* loaded from: HeraHostSharedImpl$videoProxyImpl$1$onParticipantVideoUpdated$$inlined$runOnQueue$1.class */
public final class HeraHostSharedImpl$videoProxyImpl$1$onParticipantVideoUpdated$$inlined$runOnQueue$1 extends 0DO implements Function2 {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ String $participantId$inlined;
    public int label;
    public final /* synthetic */ HeraHostSharedImpl$videoProxyImpl$1 this$0;
    public final /* synthetic */ HeraHostSharedImpl this$0$inline_fun;
    public final /* synthetic */ HeraHostSharedImpl this$1$inlined;

    /* renamed from: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$videoProxyImpl$1$onParticipantVideoUpdated$$inlined$runOnQueue$1$1, reason: invalid class name */
    /* loaded from: HeraHostSharedImpl$videoProxyImpl$1$onParticipantVideoUpdated$$inlined$runOnQueue$1$1.class */
    public final class AnonymousClass1 extends 0DO implements Function1 {
        public final /* synthetic */ boolean $enabled$inlined;
        public final /* synthetic */ String $participantId$inlined;
        public int label;
        public final /* synthetic */ HeraHostSharedImpl$videoProxyImpl$1 this$0;
        public final /* synthetic */ HeraHostSharedImpl this$1$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(0DR r302, boolean z, HeraHostSharedImpl$videoProxyImpl$1 heraHostSharedImpl$videoProxyImpl$1, String str, HeraHostSharedImpl heraHostSharedImpl) {
            super(1, r302);
            this.$enabled$inlined = z;
            this.this$0 = heraHostSharedImpl$videoProxyImpl$1;
            this.$participantId$inlined = str;
            this.this$1$inlined = heraHostSharedImpl;
        }

        public final 0DR create(0DR r302) {
            return new AnonymousClass1(r302, this.$enabled$inlined, this.this$0, this.$participantId$inlined, this.this$1$inlined);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(0DR r302) {
            return create(r302).invokeSuspend(04S.A00);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r302) {
            /*
                r301 = this;
                X.0Ds r0 = X.0Ds.A02
                r303 = r0
                r0 = r301
                int r0 = r0.label
                r304 = r0
                r0 = 2
                r305 = r0
                r0 = 1
                r306 = r0
                r0 = r304
                if (r0 == 0) goto L23
                r0 = r304
                r1 = r306
                if (r0 == r1) goto Lc4
                r0 = r304
                r1 = r305
                if (r0 == r1) goto Lc4
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
                throw r0
            L23:
                r0 = r302
                X.0Dt.A00(r0)
                r0 = r301
                boolean r0 = r0.$enabled$inlined
                r307 = r0
                r0 = r301
                com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$videoProxyImpl$1 r0 = r0.this$0
                r308 = r0
                r0 = r308
                java.util.Set r0 = r0.participantsWithActiveVideo
                r309 = r0
                r0 = r307
                if (r0 == 0) goto L85
                r0 = r309
                int r0 = r0.size()
                r307 = r0
                r0 = r301
                com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$videoProxyImpl$1 r0 = r0.this$0
                java.util.Set r0 = r0.participantsWithActiveVideo
                r309 = r0
                r0 = r301
                java.lang.String r0 = r0.$participantId$inlined
                r308 = r0
                r0 = r309
                r1 = r308
                boolean r0 = r0.add(r1)
                r0 = r307
                if (r0 != 0) goto Lc8
                r0 = r301
                com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl r0 = r0.this$1$inlined
                com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager r0 = r0.videoStreamsManager
                r308 = r0
                r0 = r301
                r1 = r306
                r0.label = r1
                r0 = r308
                r1 = r301
                java.lang.Object r0 = r0.startPeerVideoMixer(r1)
                r308 = r0
            L7d:
                r0 = r308
                r1 = r303
                if (r0 != r1) goto Lc8
                r0 = r303
                return r0
            L85:
                r0 = r301
                java.lang.String r0 = r0.$participantId$inlined
                r308 = r0
                r0 = r309
                r1 = r308
                boolean r0 = r0.remove(r1)
                r0 = r301
                com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$videoProxyImpl$1 r0 = r0.this$0
                java.util.Set r0 = r0.participantsWithActiveVideo
                r308 = r0
                r0 = r308
                boolean r0 = r0.isEmpty()
                r304 = r0
                r0 = r304
                if (r0 == 0) goto Lc8
                r0 = r301
                com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl r0 = r0.this$1$inlined
                com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager r0 = r0.videoStreamsManager
                r308 = r0
                r0 = r301
                r1 = r305
                r0.label = r1
                r0 = r308
                r1 = r301
                java.lang.Object r0 = r0.stopPeerVideoMixer(r1)
                r308 = r0
                goto L7d
            Lc4:
                r0 = r302
                X.0Dt.A00(r0)
            Lc8:
                X.04S r0 = X.04S.A00
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$videoProxyImpl$1$onParticipantVideoUpdated$$inlined$runOnQueue$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraHostSharedImpl$videoProxyImpl$1$onParticipantVideoUpdated$$inlined$runOnQueue$1(HeraHostSharedImpl heraHostSharedImpl, 0DR r303, boolean z, HeraHostSharedImpl$videoProxyImpl$1 heraHostSharedImpl$videoProxyImpl$1, String str, HeraHostSharedImpl heraHostSharedImpl2) {
        super(2, r303);
        this.this$0$inline_fun = heraHostSharedImpl;
        this.$enabled$inlined = z;
        this.this$0 = heraHostSharedImpl$videoProxyImpl$1;
        this.$participantId$inlined = str;
        this.this$1$inlined = heraHostSharedImpl2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new HeraHostSharedImpl$videoProxyImpl$1$onParticipantVideoUpdated$$inlined$runOnQueue$1(this.this$0$inline_fun, r303, this.$enabled$inlined, this.this$0, this.$participantId$inlined, this.this$1$inlined);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$enabled$inlined, this.this$0, this.$participantId$inlined, this.this$1$inlined);
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
