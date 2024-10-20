package com.facebook.messaging.inbox.promotionbanner;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.1Br;
import X.1Iw;
import X.2aI;
import X.AnonymousClass001;
import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.quickpromotion.bottomsheet.QPBottomSheet;
import kotlin.jvm.functions.Function2;

/* loaded from: InboxQPBottomSheetInserter$TriggerBottomSheetRunnable$run$1.class */
public final class InboxQPBottomSheetInserter$TriggerBottomSheetRunnable$run$1 extends 0DO implements Function2 {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ 1Br $qpBottomSheetApi$delegate;
    public final /* synthetic */ 2aI $scope;
    public final /* synthetic */ InterstitialTrigger $trigger;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxQPBottomSheetInserter$TriggerBottomSheetRunnable$run$1(Activity activity, Context context, FbUserSession fbUserSession, InterstitialTrigger interstitialTrigger, 1Br r306, 0DR r307, 2aI r308) {
        super(2, r307);
        this.$fbUserSession = fbUserSession;
        this.$activity = activity;
        this.$context = context;
        this.$scope = r308;
        this.$trigger = interstitialTrigger;
        this.$qpBottomSheetApi$delegate = r306;
    }

    public final 0DR create(Object obj, 0DR r303) {
        FbUserSession fbUserSession = this.$fbUserSession;
        return new InboxQPBottomSheetInserter$TriggerBottomSheetRunnable$run$1(this.$activity, this.$context, fbUserSession, this.$trigger, this.$qpBottomSheetApi$delegate, r303, this.$scope);
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
            QPBottomSheet qPBottomSheet = (QPBottomSheet) this.$qpBottomSheetApi$delegate.A00.get();
            FbUserSession fbUserSession = this.$fbUserSession;
            Activity activity = this.$activity;
            1Iw r02 = new 1Iw(this.$context);
            2aI r03 = this.$scope;
            InterstitialTrigger interstitialTrigger = this.$trigger;
            this.label = 1;
            if (qPBottomSheet.A02(activity, null, fbUserSession, null, interstitialTrigger, r02, this, r03) == r0) {
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
