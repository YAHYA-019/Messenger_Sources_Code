package com.facebook.messaging.avatar.socialstickers.ui;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BM;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.1UG;
import X.4YV;
import X.8Lf;
import X.8NJ;
import X.AbL;
import X.AbM;
import X.BSA;
import X.C00i;
import X.C01i;
import X.C8xf;
import X.C8xg;
import X.CZD;
import X.DCx;
import X.QGD;
import X.R0B;
import X.REs;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.messaging.avatar.socialstickers.model.DisclaimerTriggerSource;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.List;

/* loaded from: SocialStickersDisclaimerFragment.class */
public final class SocialStickersDisclaimerFragment extends MigBottomSheetDialogFragment {
    public static final R0B A05 = new Object();
    public C00i A00;
    public BSA A01;
    public Integer A02;
    public final C01i A03 = DCx.A00(this, 38);
    public final REs A04 = new REs(this);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        DisclaimerTriggerSource.StickerReceive stickerReceive;
        String str;
        11T.A0F(r302, 0);
        DisclaimerTriggerSource disclaimerTriggerSource = (DisclaimerTriggerSource) this.A03.getValue();
        return new QGD(this.A04, new 8NJ(new 8Lf(CZD.A00(this, 34), r302.A0D(2131955816)), (!(disclaimerTriggerSource instanceof DisclaimerTriggerSource.StickerReceive) || (stickerReceive = (DisclaimerTriggerSource.StickerReceive) disclaimerTriggerSource) == null || (str = stickerReceive.A00) == null) ? new C8xf(null, 2132347195) : new C8xg(null, null, null, str), r302.A0D(2131955817), (CharSequence) null, r302.A0D(2131955818), (List) null, true), A1F());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1854101887);
        super.onCreate(bundle);
        this.A00 = AbM.A0O(this, 1BM.A01(this), 68074);
        this.A01 = (BSA) 1Bn.A0A(83372);
        0FI.A08(-1923015096, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        if (this.A01 == null) {
            11T.A0L("logger");
            throw 0Q8.createAndThrow();
        }
        Integer num = this.A02;
        if (num == null) {
            num = 0S2.A01;
        }
        1UG A08 = 1BK.A08(4YV.A0B(), "avatar_privacy_bottom_sheet_disclaimer_dismiss");
        if (A08.isSampled()) {
            int intValue = num.intValue();
            if (intValue == 1) {
                str = "swipe";
            } else if (intValue == 0) {
                str = "settings_clicked";
            } else {
                if (intValue != 2) {
                    throw 1BK.A1F();
                }
                str = "close_button";
            }
            A08.A7R(1BJ.A00(1242), str);
            AbL.A0s(A08);
            A08.BZL();
        }
        this.A02 = null;
    }
}
