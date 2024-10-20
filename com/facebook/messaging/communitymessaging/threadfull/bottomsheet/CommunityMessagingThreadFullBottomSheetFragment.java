package com.facebook.messaging.communitymessaging.threadfull.bottomsheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1pI;
import X.7zR;
import X.9De;
import X.C37s;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.threadfull.model.CommunityMessagingThreadFullData;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: CommunityMessagingThreadFullBottomSheetFragment.class */
public final class CommunityMessagingThreadFullBottomSheetFragment extends MigBottomSheetDialogFragment {
    public 1pI A00;
    public CommunityMessagingThreadFullData A01;

    /* JADX WARN: Multi-variable type inference failed */
    public void A0x() {
        String str;
        String str2;
        super.A0x();
        if (getContext() != null) {
            CommunityMessagingThreadFullData communityMessagingThreadFullData = this.A01;
            if (communityMessagingThreadFullData == null) {
                11T.A0L("threadFullData");
                throw 0Q8.createAndThrow();
            }
            boolean z = communityMessagingThreadFullData.A03;
            if (z || communityMessagingThreadFullData.A04) {
                str = "chat_full_bottom_sheet";
                if (z) {
                    str2 = "create_chat_bottom_sheet_rendered";
                    7zR.A0W().A03(new CommunityMessagingLoggerModel(null, null, String.valueOf(communityMessagingThreadFullData.A00), String.valueOf(communityMessagingThreadFullData.A01), null, null, str, "channel_list", str2, "messenger", null, null));
                }
            } else {
                str = "chat_full_bottom_sheet_for_members";
            }
            str2 = communityMessagingThreadFullData.A04 ? "suggest_chat_bottom_sheet_rendered" : "chat_full_bottom_sheet_rendered";
            7zR.A0W().A03(new CommunityMessagingLoggerModel(null, null, String.valueOf(communityMessagingThreadFullData.A00), String.valueOf(communityMessagingThreadFullData.A01), null, null, str, "channel_list", str2, "messenger", null, null));
        }
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A1K(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.threadfull.bottomsheet.CommunityMessagingThreadFullBottomSheetFragment.A1K(X.1Iw):X.1LI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-2118834343);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("arg_data");
        if (parcelable != null) {
            this.A01 = (CommunityMessagingThreadFullData) parcelable;
            0FI.A08(2026776257, A02);
        } else {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-145609562, A02);
            throw A0h;
        }
    }
}
