package com.facebook.messaging.nativepagereply.filters.bottomsheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1G1;
import X.1Hb;
import X.1Iw;
import X.1LI;
import X.1Lm;
import X.1Lo;
import X.2SG;
import X.2Um;
import X.2cK;
import X.2cM;
import X.9Sl;
import X.AnonymousClass001;
import X.C1pq;
import X.QGr;
import X.RSW;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import com.google.common.base.Preconditions;
import java.util.ArrayList;

/* loaded from: BusinessInboxFiltersBottomSheetDialogFragment.class */
public final class BusinessInboxFiltersBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public 9Sl A00;
    public FbUserSession A01;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        if (this.A00 != null) {
            Context context = r302.A0D;
            11T.A0A(context);
            1BV r0 = new 1BV(context, 16979);
            FbUserSession fbUserSession = this.A01;
            if (fbUserSession != null) {
                2SG r02 = (2SG) 1Lo.A04(context, fbUserSession, (1BY) null, 33197);
                1Bn.A0A(147666);
                2cM A01 = 2cK.A01(r302, (String) null, 0);
                FbUserSession fbUserSession2 = this.A01;
                if (fbUserSession2 != null) {
                    2SG r03 = (2SG) 1Lo.A04((Context) null, fbUserSession2, (1BY) null, 33197);
                    1Hb[] values = 1Hb.values();
                    ArrayList<1Hb> A0s = AnonymousClass001.A0s();
                    for (1Hb r04 : values) {
                        if (r03.A03(r04, "tab_toolbar_button")) {
                            A0s.add(r04);
                        }
                    }
                    ArrayList A0z = 1BL.A0z(A0s);
                    for (1Hb r05 : A0s) {
                        String A00 = 2Um.A00(context, r05);
                        Preconditions.checkArgument(AnonymousClass001.A1P(A00.length()));
                        C1pq.A08(FalcoACSProvider.TAG, r05);
                        A0z.add(new RSW(r05, A00));
                    }
                    MigColorScheme migColorScheme = (MigColorScheme) r0.get();
                    1Hb r06 = r02.A00;
                    9Sl r07 = this.A00;
                    if (r07 != null) {
                        A01.A2e(new QGr(r06, r07, migColorScheme, A0z));
                        A01.A0m(50.0f);
                        return A01.A00;
                    }
                }
            }
            11T.A0L("fbUserSession");
            throw 0Q8.createAndThrow();
        }
        11T.A0L("bottomSheetSelectListener");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(154934752);
        super.onCreate(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A01 = A01;
        if (A01 != null) {
            1Br A00 = 1Lm.A00(requireContext(), A01, 33197);
            1Br A002 = 1Bu.A00(68481);
            1G1 r0 = this.A01;
            if (r0 != null) {
                this.A00 = new 9Sl(A00, A002, this, r0.A02);
                0FI.A08(2070469418, A02);
                return;
            }
        }
        11T.A0L("fbUserSession");
        throw 0Q8.createAndThrow();
    }
}
