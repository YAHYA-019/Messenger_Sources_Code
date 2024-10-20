package X;

import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.facebook.messaging.communitymessaging.plugins.inboxupsells.itemsupplier.CcInboxUpsellsItemSupplierImplementation;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.3Nb, reason: invalid class name */
/* loaded from: 3Nb.class */
public final class C3Nb {
    public final /* synthetic */ CcInboxUpsellsItemSupplierImplementation A00;

    public C3Nb(CcInboxUpsellsItemSupplierImplementation ccInboxUpsellsItemSupplierImplementation) {
        this.A00 = ccInboxUpsellsItemSupplierImplementation;
    }

    public final void A00(ThreadSummary threadSummary) {
        2UP r306;
        CcInboxUpsellsItemSupplierImplementation ccInboxUpsellsItemSupplierImplementation = this.A00;
        if (threadSummary != null) {
            Parcelable.Creator creator = HeterogeneousMap.CREATOR;
            AnonymousClass201 A00 = C1zz.A00();
            A00.A01(2pK.A01, 2pK.A00);
            r306 = ((C2xd) 1Bn.A0A(17160)).A0I(ccInboxUpsellsItemSupplierImplementation.A00, ccInboxUpsellsItemSupplierImplementation.A01, 2SI.A09).A02(TriState.UNSET, CcInboxUpsellsItemSupplierImplementation.A06, threadSummary, A00.A00());
        } else {
            r306 = null;
        }
        2UR r0 = (2UR) ccInboxUpsellsItemSupplierImplementation.A05.getAndSet(r306);
        if (r0 == null) {
            if (r306 == null) {
                return;
            }
        } else if (r306 != null && r0.BVb(r306)) {
            return;
        }
        ccInboxUpsellsItemSupplierImplementation.A04.A00("CC_INBOX_UPSELLS", "newData");
    }
}
