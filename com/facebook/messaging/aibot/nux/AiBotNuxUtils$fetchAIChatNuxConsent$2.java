package com.facebook.messaging.aibot.nux;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.11T;
import X.1Br;
import X.2Zo;
import X.2aI;
import X.2aK;
import X.4nD;
import X.AJW;
import X.AnonymousClass001;
import X.AnonymousClass969;
import X.C54U;
import X.C77c;
import android.content.Context;
import com.facebook.messaging.aibot.nux.model.AiBotNuxStatus;
import com.facebook.messaging.msys.thread.aibot.repository.MetaAiRepository;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AiBotNuxUtils$fetchAIChatNuxConsent$2.class */
public final class AiBotNuxUtils$fetchAIChatNuxConsent$2 extends 0DO implements Function2 {
    public final /* synthetic */ Function1 $callback;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $forBlockingNux;
    public final /* synthetic */ AnonymousClass969 $querySurface;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C77c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotNuxUtils$fetchAIChatNuxConsent$2(Context context, C77c c77c, AnonymousClass969 anonymousClass969, 0DR r305, Function1 function1, boolean z) {
        super(2, r305);
        this.this$0 = c77c;
        this.$context = context;
        this.$querySurface = anonymousClass969;
        this.$forBlockingNux = z;
        this.$callback = function1;
    }

    public final 0DR create(Object obj, 0DR r303) {
        C77c c77c = this.this$0;
        AiBotNuxUtils$fetchAIChatNuxConsent$2 aiBotNuxUtils$fetchAIChatNuxConsent$2 = new AiBotNuxUtils$fetchAIChatNuxConsent$2(this.$context, c77c, this.$querySurface, r303, this.$callback, this.$forBlockingNux);
        aiBotNuxUtils$fetchAIChatNuxConsent$2.L$0 = obj;
        return aiBotNuxUtils$fetchAIChatNuxConsent$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        2aI r306;
        AiBotNuxStatus aiBotNuxStatus;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            r306 = (2aI) this.L$0;
            MetaAiRepository metaAiRepository = (MetaAiRepository) 1Br.A0B(this.this$0.A03);
            Context context = this.$context;
            this.L$0 = r306;
            this.label = 1;
            obj = metaAiRepository.A02(context, this, false);
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            r306 = (2aI) this.L$0;
            0Dt.A00(obj);
        }
        4nD r02 = (4nD) obj;
        C54U c54u = r02.A00;
        C77c c77c = this.this$0;
        Context context2 = this.$context;
        AnonymousClass969 anonymousClass969 = this.$querySurface;
        boolean z = this.$forBlockingNux;
        if (c54u != null) {
            aiBotNuxStatus = new AiBotNuxStatus(C77c.A05(context2, c77c, anonymousClass969, c54u, z), r02.A01);
        } else {
            11T.A0F(context2, 0);
            aiBotNuxStatus = new AiBotNuxStatus(z ? c77c.A08(context2, anonymousClass969) : C77c.A00(context2, c77c, anonymousClass969), false);
        }
        2aK.A03((Integer) null, 2Zo.A04(false), new AJW(aiBotNuxStatus, this.$callback, null, 7), r306, 2);
        return 04S.A00;
    }
}
