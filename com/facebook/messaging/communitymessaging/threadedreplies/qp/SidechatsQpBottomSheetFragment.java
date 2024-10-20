package com.facebook.messaging.communitymessaging.threadedreplies.qp;

import X.0Q8;
import X.11T;
import X.1Bi;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.2yD;
import X.7zM;
import X.7zN;
import X.7zV;
import X.9De;
import X.BM4;
import X.C37s;
import X.C5xr;
import X.C9es;
import X.CZD;
import X.QHX;
import X.RFE;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.io.Serializable;

/* loaded from: SidechatsQpBottomSheetFragment.class */
public final class SidechatsQpBottomSheetFragment extends MigBottomSheetDialogFragment {
    public BM4 A01;
    public C9es A02;
    public FbUserSession A03;
    public final 1Br A04 = 7zM.A0Y();
    public long A00 = -1;
    public final RFE A05 = new RFE(this);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(90);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        C5xr c5xr = (C5xr) 1Bi.A03(68332);
        MigColorScheme A1F = A1F();
        String A02 = 2yD.A02(C5xr.A00(c5xr), 36886514873075346L);
        String A022 = 2yD.A02(C5xr.A00(c5xr), 36886514872878737L);
        int A00 = 2yD.A00(C5xr.A00(c5xr), 36605039896304601L);
        int A002 = 2yD.A00(C5xr.A00(c5xr), 36605039896239064L);
        return new QHX(CZD.A00(this, 91), this.A05, A1F, 7zN.A0s(this, 2131965980), 7zN.A0s(this, 2131965982), 7zN.A0s(this, 2131965976), A02, A022, A00, A002);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        this.A00 = requireArguments().getLong("argument_thread_key");
        this.A03 = 7zV.A09(this, this.A04);
        Serializable serializable = requireArguments().getSerializable("argument_entry_point");
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.communitymessaging.threadedreplies.qp.SidechatsEntryPoint");
        this.A01 = (BM4) serializable;
        C9es c9es = (C9es) 1Bi.A03(68333);
        this.A02 = c9es;
        if (c9es == null) {
            str = "falcoLogger";
        } else {
            long j = this.A00;
            BM4 bm4 = this.A01;
            if (bm4 != null) {
                String str2 = bm4.parentSurface;
                11T.A0F(str2, 1);
                C9es.A00(c9es).A03(new CommunityMessagingLoggerModel(null, null, null, null, String.valueOf(j), null, null, "sidechat_video_nux", "contextual_upsell_nux", str2, null, null));
                super.onViewCreated(view, bundle);
                return;
            }
            str = "entryPoint";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
