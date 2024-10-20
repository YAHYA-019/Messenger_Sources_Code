package X;

import com.facebook.messaging.search.lists.model.FTSMessageIndexProgress;
import com.facebook.messaging.search.messages.bottomsheet.SyncingChatHistoryBottomsheetFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: Cmt.class */
public final class Cmt implements InterfaceC10284sz {
    public final int A00;
    public final Object A01;

    public Cmt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC10284sz
    public final void Bq6(FTSMessageIndexProgress fTSMessageIndexProgress) {
        switch (this.A00) {
            case 0:
                ((CQU) this.A01).A0D = 4YV.A1X(fTSMessageIndexProgress.A01, fTSMessageIndexProgress.A00);
                return;
            case 1:
                SyncingChatHistoryBottomsheetFragment syncingChatHistoryBottomsheetFragment = (SyncingChatHistoryBottomsheetFragment) this.A01;
                float f = fTSMessageIndexProgress.A00;
                2qR r0 = BaseMigBottomSheetDialogFragment.A06;
                syncingChatHistoryBottomsheetFragment.A00 = f;
                int i = fTSMessageIndexProgress.A01;
                if (i > 0) {
                    syncingChatHistoryBottomsheetFragment.A01 = i;
                    return;
                }
                return;
            default:
                if (fTSMessageIndexProgress.A01 > fTSMessageIndexProgress.A00) {
                    ((AmB) this.A01).A06 = 0S2.A00;
                }
                AmB amB = (AmB) this.A01;
                AmB.A06(amB, amB.A05);
                return;
        }
    }
}
