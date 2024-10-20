package com.facebook.messaging.publicchats.takedowns.bottomsheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BM;
import X.1Bq;
import X.1Br;
import X.1G1;
import X.1Iw;
import X.1LI;
import X.1Um;
import X.22I;
import X.7zN;
import X.8UY;
import X.9De;
import X.9WQ;
import X.A0O;
import X.A1f;
import X.BOn;
import X.CQo;
import X.QQC;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: ChannelTakedownBottomSheetDialogFragment.class */
public final class ChannelTakedownBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public static final 9WQ A06 = new Object();
    public ChannelTakedownBottomSheetModel A00;
    public String A01;
    public boolean A03;
    public boolean A02 = true;
    public final 1Br A04 = 1Bq.A00(82689);
    public final 1Br A05 = 1Bq.A00(68470);

    /* JADX WARN: Multi-variable type inference failed */
    public void A0x() {
        super.A0x();
        1G1 A01 = 1BM.A01(this);
        this.A01 = A01.A02;
        22I r0 = (22I) 7zN.A0m(this, A01, 33183);
        ChannelTakedownBottomSheetModel channelTakedownBottomSheetModel = this.A00;
        if (channelTakedownBottomSheetModel != null) {
            long j = channelTakedownBottomSheetModel.A00.A0n.A04;
            1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new A0O(2, j, new QQC(r0, AQV), r0, A0P), A0P, false);
            A1f.A01(A0P, r0, this, 56);
            this.A03 = 1BL.A1R();
            CQo cQo = (CQo) 1Br.A0B(this.A04);
            ChannelTakedownBottomSheetModel channelTakedownBottomSheetModel2 = this.A00;
            if (channelTakedownBottomSheetModel2 != null) {
                CQo.A0E(BOn.A0P, cQo, Long.valueOf(channelTakedownBottomSheetModel2.A00.A0n.A04), ActionId.VIDEO_REQUESTED_PLAYING, 2, 95, 19);
                return;
            }
        }
        11T.A0L("model");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        return new 8UY(A1F());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-115916392);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("ChannelTakedownBottomSheetModel");
        if (parcelable != null) {
            this.A00 = (ChannelTakedownBottomSheetModel) parcelable;
            0FI.A08(-1683264589, A02);
        } else {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-1434795229, A02);
            throw A0h;
        }
    }
}
