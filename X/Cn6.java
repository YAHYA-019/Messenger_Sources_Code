package X;

import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.pausechat.fragment.PauseChatBottomSheet;
import com.facebook.messaging.communitymessaging.pausechat.fragment.PauseChatBottomSheetParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.mutators.DeleteThreadDialogFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: Cn6.class */
public final class Cn6 implements DFR {
    public final /* synthetic */ ThreadSummary A00;
    public final /* synthetic */ DeleteThreadDialogFragment A01;

    public Cn6(ThreadSummary threadSummary, DeleteThreadDialogFragment deleteThreadDialogFragment) {
        this.A01 = deleteThreadDialogFragment;
        this.A00 = threadSummary;
    }

    public final void C8q(CfG cfG) {
        9Ba r0 = PauseChatBottomSheet.A06;
        06Z parentFragmentManager = this.A01.getParentFragmentManager();
        ThreadSummary threadSummary = this.A00;
        ThreadKey A0f = AbF.A0f(threadSummary);
        String str = threadSummary.A20;
        if (str == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ThreadKey threadKey = threadSummary.A0l;
        if (threadKey == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String A0w = 1BK.A0w(threadKey);
        long j = threadSummary.A06;
        PauseChatBottomSheetParams pauseChatBottomSheetParams = new PauseChatBottomSheetParams(A0f, str, A0w, "delete_chat_options", j);
        2Ov baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
        7zT.A1B(baseMigBottomSheetDialogFragment, "bottom_sheet_params", pauseChatBottomSheetParams);
        baseMigBottomSheetDialogFragment.A0m(parentFragmentManager, "PauseChatBottomSheet");
        7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, A0w, String.valueOf(j), 1BK.A0w(A0f), null, "pause_chat_button", "delete_chat_options", "pause_chat_initiated", null, null, null));
    }
}
