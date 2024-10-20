package com.facebook.messaging.communitymessaging.adminonboarding.bottomsheet;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Bn;
import X.1Br;
import X.1pI;
import X.3GU;
import X.9De;
import X.9Hf;
import X.C1296Ad8;
import X.C37s;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: AdminOnboardingBottomSheetFragment.class */
public final class AdminOnboardingBottomSheetFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public 1pI A01;
    public C1296Ad8 A02;
    public ThreadKey A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public boolean A07;
    public final 1Br A08 = 1BK.A0E();
    public final 9Hf A09 = new 9Hf(this);

    public static final void A05(AdminOnboardingBottomSheetFragment adminOnboardingBottomSheetFragment, String str) {
        String str2;
        C1296Ad8 c1296Ad8 = adminOnboardingBottomSheetFragment.A02;
        if (c1296Ad8 == null) {
            str2 = "communityMessagingLogger";
        } else {
            String valueOf = String.valueOf(adminOnboardingBottomSheetFragment.A05);
            String str3 = adminOnboardingBottomSheetFragment.A06;
            ThreadKey threadKey = adminOnboardingBottomSheetFragment.A03;
            if (threadKey == null) {
                str2 = "threadKey";
            } else {
                String A0w = 1BK.A0w(threadKey);
                Integer num = adminOnboardingBottomSheetFragment.A04;
                if (num != null) {
                    c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, valueOf, str3, A0w, null, null, "admin_onboarding_sheet", str, null, null, 1BK.A1D("entry_point", 3GU.A00(num))));
                    return;
                }
                str2 = Property.SYMBOL_Z_ORDER_SOURCE;
            }
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1287427372);
        super.onCreate(bundle);
        this.A00 = 1BM.A01(this);
        Bundle requireArguments = requireArguments();
        ThreadKey threadKey = (ThreadKey) requireArguments.getParcelable("ARG_THREAD_KEY");
        if (threadKey != null) {
            this.A03 = threadKey;
        }
        this.A05 = Long.valueOf(requireArguments.getLong("ARG_COMMUNITY_ID"));
        this.A06 = requireArguments.getString("ARG_GROUP_ID", ConstantsKt.CAMERA_ID_FRONT);
        0FI.A08(520115509, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        this.A04 = 0S2.A00(3)[requireArguments().getInt("ARG_SOURCE")];
        super.onViewCreated(view, bundle);
        C1296Ad8 c1296Ad8 = (C1296Ad8) 1Bn.A0A(83118);
        this.A02 = c1296Ad8;
        if (c1296Ad8 == null) {
            str = "communityMessagingLogger";
        } else {
            String valueOf = String.valueOf(this.A05);
            String str2 = this.A06;
            ThreadKey threadKey = this.A03;
            if (threadKey == null) {
                str = "threadKey";
            } else {
                String A0w = 1BK.A0w(threadKey);
                Integer num = this.A04;
                if (num != null) {
                    c1296Ad8.A03(new CommunityMessagingLoggerModel(null, null, valueOf, str2, A0w, null, null, "admin_onboarding_sheet", "admin_onboarding_sheet_rendered", null, null, 1BK.A1D("entry_point", 3GU.A00(num))));
                    return;
                }
                str = Property.SYMBOL_Z_ORDER_SOURCE;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
