package com.facebook.wearable.common.comms.hera.shared.engine;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Ic;
import X.0Id;
import X.0Q8;
import X.0zF;
import X.0zL;
import X.11T;
import X.2aI;
import X.4GE;
import X.AnonymousClass001;
import X.C00m;
import X.C00q;
import X.C0zE;
import X.C15t;
import X.C4G5;
import X.JQy;
import X.JR1;
import X.KGw;
import X.KJb;
import X.KMJ;
import X.Ku0;
import X.LyC;
import X.MRR;
import com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.CallCoreState;
import com.meta.wearable.comms.calling.hera.engine.base.Any;
import com.meta.wearable.comms.calling.hera.engine.base.EngineState;
import com.meta.wearable.comms.calling.hera.engine.base.EngineSubscriber;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: HeraNativeCallEngine$stateFlow$2.class */
public final class HeraNativeCallEngine$stateFlow$2 extends C00q implements C00m {
    public final /* synthetic */ HeraNativeCallEngine this$0;

    /* renamed from: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine$stateFlow$2$1, reason: invalid class name */
    /* loaded from: HeraNativeCallEngine$stateFlow$2$1.class */
    public final class AnonymousClass1 extends 0DO implements Function2 {
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ HeraNativeCallEngine this$0;

        /* renamed from: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine$stateFlow$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: HeraNativeCallEngine$stateFlow$2$1$1.class */
        public final class C00011 extends C00q implements C00m {
            public final /* synthetic */ byte $token;
            public final /* synthetic */ HeraNativeCallEngine this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00011(HeraNativeCallEngine heraNativeCallEngine, byte b) {
                super(0);
                this.this$0 = heraNativeCallEngine;
                this.$token = b;
            }

            @Override // X.C00m
            public /* bridge */ /* synthetic */ Object invoke() {
                m10260invoke();
                return 04S.A00;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10260invoke() {
                this.this$0.getEngine().unsubscribe(this.$token);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HeraNativeCallEngine heraNativeCallEngine, 0DR r303) {
            super(2, r303);
            this.this$0 = heraNativeCallEngine;
        }

        public final 0DR create(Object obj, 0DR r303) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r303);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(4GE r302, 0DR r303) {
            return create(r302, r303).invokeSuspend(04S.A00);
        }

        public final Object invokeSuspend(Object obj) {
            0Ds r0 = 0Ds.A02;
            int i = this.label;
            if (i == 0) {
                0Dt.A00(obj);
                final 4GE r02 = (4GE) this.L$0;
                EngineSubscriber engineSubscriber = new EngineSubscriber() { // from class: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine$stateFlow$2$1$subscriber$1
                    @Override // com.meta.wearable.comms.calling.hera.engine.base.EngineSubscriber
                    public void onStateUpdate(EngineState engineState) {
                        11T.A0F(engineState, 0);
                        r02.D5N(engineState);
                    }
                };
                r02.D5N(this.this$0.getEngine().getStateBlocking());
                C00011 c00011 = new C00011(this.this$0, this.this$0.getEngine().subscribe(engineSubscriber));
                this.label = 1;
                if (C4G5.A00(this, c00011, r02) == r0) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraNativeCallEngine$stateFlow$2(HeraNativeCallEngine heraNativeCallEngine) {
        super(0);
        this.this$0 = heraNativeCallEngine;
    }

    @Override // X.C00m
    public final C15t invoke() {
        KGw kGw;
        0Id A00 = 0Ic.A00(new AnonymousClass1(this.this$0, null));
        2aI r0 = this.this$0.scope;
        if (r0 == null) {
            11T.A0L("scope");
            throw 0Q8.createAndThrow();
        }
        C0zE c0zE = 0zF.A01;
        EngineState engineState = EngineState.DEFAULT_INSTANCE;
        11T.A0A(engineState);
        CallCoreState callCoreState = CallCoreState.DEFAULT_INSTANCE;
        11T.A0A(callCoreState);
        Ku0 ku0 = new Ku0(callCoreState, "CallCoreState");
        MRR mrr = engineState.moduleStates_;
        11T.A0A(mrr);
        Iterator it = mrr.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                break;
            }
            if (!11T.A0O(((Any) it.next()).type_, "CallCoreState")) {
                i = i2 + 1;
            } else if (i2 >= 0) {
                kGw = (KGw) engineState.dynamicMethod(KMJ.A05, (Object) null, (Object) null);
                KJb A002 = KGw.A00(kGw);
                JR1.A0g(A002).Be4(A002, engineState);
                Any A003 = ku0.A00(callCoreState);
                EngineState engineState2 = (EngineState) KGw.A00(kGw);
                A003.getClass();
                MRR mrr2 = engineState2.moduleStates_;
                if (!((LyC) mrr2).A00) {
                    mrr2 = mrr2.Bel(JQy.A0J(mrr2));
                    engineState2.moduleStates_ = mrr2;
                }
                mrr2.set(i2, A003);
            }
        }
        kGw = (KGw) engineState.dynamicMethod(KMJ.A05, (Object) null, (Object) null);
        KJb A004 = KGw.A00(kGw);
        JR1.A0g(A004).Be4(A004, engineState);
        Any A005 = ku0.A00(callCoreState);
        EngineState engineState3 = (EngineState) KGw.A00(kGw);
        A005.getClass();
        MRR mrr3 = engineState3.moduleStates_;
        if (!((LyC) mrr3).A00) {
            mrr3 = mrr3.Bel(JQy.A0J(mrr3));
            engineState3.moduleStates_ = mrr3;
        }
        mrr3.add(A005);
        KJb A05 = kGw.A05();
        11T.A0D(A05);
        return 0zL.A01(A05, r0, A00, c0zE);
    }
}
