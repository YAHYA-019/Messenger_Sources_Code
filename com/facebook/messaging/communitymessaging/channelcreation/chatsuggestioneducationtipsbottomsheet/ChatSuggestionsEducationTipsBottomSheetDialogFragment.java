package com.facebook.messaging.communitymessaging.channelcreation.chatsuggestioneducationtipsbottomsheet;

import X.11T;
import X.1BV;
import X.1Iw;
import X.1LI;
import X.Bck;
import X.C1296Ad8;
import X.QHm;
import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: ChatSuggestionsEducationTipsBottomSheetDialogFragment.class */
public final class ChatSuggestionsEducationTipsBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public String A00;
    public String A01;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new QHm(new Bck(this), A1F());
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        1BV A00 = 1BV.A00(83118);
        if (this.A01 == null || this.A00 == null) {
            return;
        }
        ((C1296Ad8) A00.get()).A03(new CommunityMessagingLoggerModel(null, null, this.A00, this.A01, null, null, "chat_suggestion_tips", "chat_suggestion_tips_bottom_sheet", "chat_suggestion_tips_bottom_sheet_rendered", "channel_list", null, null));
    }
}
