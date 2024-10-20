package com.facebook.messaging.wellbeing.enforcementfairness.event.handler.education.safetyintervention.interstitial;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Xs;
import X.0zU;
import X.2Zm;
import X.2sA;
import X.2sB;
import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: EducationSafetyInterventionInterstitialEventHandler$onVisible$1.class */
public final class EducationSafetyInterventionInterstitialEventHandler$onVisible$1 extends 0DO implements Function2 {
    public int label;
    public final /* synthetic */ 2Zm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationSafetyInterventionInterstitialEventHandler$onVisible$1(2Zm r302, 0DR r303) {
        super(2, r303);
        this.this$0 = r302;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new EducationSafetyInterventionInterstitialEventHandler$onVisible$1(this.this$0, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EducationSafetyInterventionInterstitialEventHandler$onVisible$1(this.this$0, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            2Zm r02 = this.this$0;
            List list = 2Zm.A09;
            0Xs r03 = ((2sA) r02.A05.A00.get()).A00;
            final 2Zm r04 = this.this$0;
            final 2sB r05 = new 2sB(r04);
            this.label = 1;
            if (r03.collect(new 0zU() { // from class: com.facebook.messaging.wellbeing.enforcementfairness.event.handler.education.safetyintervention.interstitial.EducationSafetyInterventionInterstitialEventHandler$onVisible$1$invokeSuspend$$inlined$mapNotNull$1$2
                /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r302, X.0DR r303) {
                    /*
                        Method dump skipped, instructions count: 392
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.enforcementfairness.event.handler.education.safetyintervention.interstitial.EducationSafetyInterventionInterstitialEventHandler$onVisible$1$invokeSuspend$$inlined$mapNotNull$1$2.emit(java.lang.Object, X.0DR):java.lang.Object");
                }
            }, this) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0N(AnonymousClass000.A00(5));
            }
            0Dt.A00(obj);
        }
        return 04S.A00;
    }
}
