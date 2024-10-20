package com.facebook.messaging.quickpromotion.plugins.quickpromotionbottomsheet.threadviewbottomsheet;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.1Bi;
import X.1Iw;
import X.2aI;
import X.2oI;
import X.AnonymousClass000;
import X.C1304Adh;
import X.C1306Adj;
import X.CSK;
import android.app.Activity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.quickpromotion.bottomsheet.QPBottomSheet;
import kotlin.jvm.functions.Function2;

/* loaded from: ThreadviewBottomSheetImplementation$onThreadOpened$1$onChanged$1$1.class */
public final class ThreadviewBottomSheetImplementation$onThreadOpened$1$onChanged$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ QPBottomSheet $qpBottomSheetApi;
    public final /* synthetic */ 2aI $scope;
    public final /* synthetic */ ThreadSummary $threadSummary;
    public final /* synthetic */ InterstitialTrigger $trigger;
    public int label;
    public final /* synthetic */ ThreadviewBottomSheetImplementation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadviewBottomSheetImplementation$onThreadOpened$1$onChanged$1$1(Activity activity, FbUserSession fbUserSession, InterstitialTrigger interstitialTrigger, ThreadSummary threadSummary, ThreadviewBottomSheetImplementation threadviewBottomSheetImplementation, QPBottomSheet qPBottomSheet, 0DR r308, 2aI r309) {
        super(2, r308);
        this.$qpBottomSheetApi = qPBottomSheet;
        this.$fbUserSession = fbUserSession;
        this.$activity = activity;
        this.this$0 = threadviewBottomSheetImplementation;
        this.$scope = r309;
        this.$trigger = interstitialTrigger;
        this.$threadSummary = threadSummary;
    }

    public final 0DR create(Object obj, 0DR r303) {
        QPBottomSheet qPBottomSheet = this.$qpBottomSheetApi;
        FbUserSession fbUserSession = this.$fbUserSession;
        return new ThreadviewBottomSheetImplementation$onThreadOpened$1$onChanged$1$1(this.$activity, fbUserSession, this.$trigger, this.$threadSummary, this.this$0, qPBottomSheet, r303, this.$scope);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            QPBottomSheet qPBottomSheet = this.$qpBottomSheetApi;
            FbUserSession fbUserSession = this.$fbUserSession;
            Activity activity = this.$activity;
            1Iw r02 = new 1Iw(this.this$0.A00.getContext());
            2aI r03 = this.$scope;
            InterstitialTrigger interstitialTrigger = this.$trigger;
            ThreadSummary threadSummary = this.$threadSummary;
            CSK csk = 2oI.A03(threadSummary) ? new CSK(threadSummary, (C1306Adj) 1Bi.A03(82310)) : null;
            ThreadSummary threadSummary2 = this.$threadSummary;
            C1304Adh c1304Adh = 2oI.A03(threadSummary2) ? new C1304Adh(threadSummary2, (C1306Adj) 1Bi.A03(82310)) : null;
            this.label = 1;
            if (qPBottomSheet.A02(activity, csk, fbUserSession, c1304Adh, interstitialTrigger, r02, this, r03) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException(AnonymousClass000.A00(5));
            }
            0Dt.A00(obj);
        }
        return 04S.A00;
    }
}
