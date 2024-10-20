package com.facebook.messaging.search.messages.bottomsheet;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bi;
import X.7zP;
import X.7zS;
import X.9De;
import X.AQV;
import X.AnonymousClass001;
import X.C37s;
import X.C8b9;
import X.Cmt;
import X.InterfaceC10284sz;
import X.S8R;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.litho.LithoView;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: SyncingChatHistoryBottomsheetFragment.class */
public final class SyncingChatHistoryBottomsheetFragment extends BaseMigBottomSheetDialogFragment {
    public float A00;
    public LithoView A02;
    public boolean A03;
    public float A01 = 100.0f;
    public final Handler A04 = AnonymousClass001.A07();
    public final InterfaceC10284sz A05 = new Cmt(this, 1);

    public SyncingChatHistoryBottomsheetFragment() {
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C8b9 A05(SyncingChatHistoryBottomsheetFragment syncingChatHistoryBottomsheetFragment) {
        return new C8b9(7zS.A0j(syncingChatHistoryBottomsheetFragment), new AQV(syncingChatHistoryBottomsheetFragment, 17), syncingChatHistoryBottomsheetFragment.A00, syncingChatHistoryBottomsheetFragment.A01, syncingChatHistoryBottomsheetFragment.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView lithoView = new LithoView(7zP.A0T(this));
        this.A02 = lithoView;
        return lithoView;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(70);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(1862649762);
        super.onDestroy();
        this.A04.removeMessages(0);
        0FI.A08(1364931214, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        boolean A0K = ((FbNetworkManager) 1Bi.A03(16687)).A0K();
        this.A03 = A0K;
        if (A0K) {
            this.A04.post(new S8R(this));
            return;
        }
        LithoView lithoView = this.A02;
        if (lithoView == null) {
            11T.A0L("contentView");
            throw 0Q8.createAndThrow();
        }
        lithoView.A0y(A05(this));
    }
}
