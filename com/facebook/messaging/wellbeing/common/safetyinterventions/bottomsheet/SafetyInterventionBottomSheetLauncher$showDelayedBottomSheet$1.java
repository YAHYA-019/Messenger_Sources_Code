package com.facebook.messaging.wellbeing.common.safetyinterventions.bottomsheet;

import X.04S;
import X.06Z;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.7zP;
import X.AaO;
import X.AnonymousClass001;
import X.AnonymousClass690;
import X.C44k;
import X.C9kW;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import kotlin.jvm.functions.Function2;

/* loaded from: SafetyInterventionBottomSheetLauncher$showDelayedBottomSheet$1.class */
public final class SafetyInterventionBottomSheetLauncher$showDelayedBottomSheet$1 extends 0DO implements Function2 {
    public final /* synthetic */ AaO $bannerActionHandler;
    public final /* synthetic */ AnonymousClass690 $clientBannerModel;
    public final /* synthetic */ long $delayShowDurationInMs;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ Fragment $fragment;
    public final /* synthetic */ 06Z $fragmentManager;
    public final /* synthetic */ ThreadKey $threadKey;
    public final /* synthetic */ ThreadSummary $threadSummary;
    public int label;
    public final /* synthetic */ C9kW this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyInterventionBottomSheetLauncher$showDelayedBottomSheet$1(Fragment fragment, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, AaO aaO, C9kW c9kW, AnonymousClass690 anonymousClass690, 0DR r310, long j) {
        super(2, r310);
        this.$delayShowDurationInMs = j;
        this.$fragment = fragment;
        this.this$0 = c9kW;
        this.$fbUserSession = fbUserSession;
        this.$threadKey = threadKey;
        this.$clientBannerModel = anonymousClass690;
        this.$bannerActionHandler = aaO;
        this.$fragmentManager = r303;
        this.$threadSummary = threadSummary;
    }

    public final 0DR create(Object obj, 0DR r303) {
        long j = this.$delayShowDurationInMs;
        Fragment fragment = this.$fragment;
        C9kW c9kW = this.this$0;
        FbUserSession fbUserSession = this.$fbUserSession;
        ThreadKey threadKey = this.$threadKey;
        AnonymousClass690 anonymousClass690 = this.$clientBannerModel;
        return new SafetyInterventionBottomSheetLauncher$showDelayedBottomSheet$1(fragment, this.$fragmentManager, fbUserSession, threadKey, this.$threadSummary, this.$bannerActionHandler, c9kW, anonymousClass690, r303, j);
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
            if (!C9kW.A04) {
                C9kW.A04 = true;
                long j = this.$delayShowDurationInMs;
                this.label = 1;
                if (C44k.A01(this, j) == r0) {
                    return r0;
                }
            }
            return 04S.A00;
        }
        if (i != 1) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        if (this.$fragment.isHidden()) {
            7zP.A1U(this.this$0.A01);
        } else {
            FbUserSession fbUserSession = this.$fbUserSession;
            AnonymousClass690 anonymousClass690 = this.$clientBannerModel;
            C9kW.A01(this.$fragmentManager, fbUserSession, this.$threadSummary, this.$bannerActionHandler, anonymousClass690);
        }
        return 04S.A00;
    }
}
