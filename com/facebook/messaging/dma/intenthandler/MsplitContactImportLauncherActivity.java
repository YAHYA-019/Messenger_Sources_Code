package com.facebook.messaging.dma.intenthandler;

import X.04R;
import X.1BK;
import X.7zO;
import X.AnonymousClass001;
import X.Dq1;
import X.EU9;
import X.EUd;
import X.EgZ;
import X.FZb;
import X.FZq;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: MsplitContactImportLauncherActivity.class */
public final class MsplitContactImportLauncherActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Bundle A0H = 7zO.A0H(this);
        String valueOf = String.valueOf(A0H != null ? A0H.get("nonce") : null);
        Bundle A0H2 = 7zO.A0H(this);
        String valueOf2 = String.valueOf(A0H2 != null ? A0H2.get("msplit_zippy_id") : null);
        LinkedHashMap A1C = 1BK.A1C();
        BitSet A18 = 1BK.A18(0);
        A1C.put("nonce", valueOf);
        A1C.put("zippy_db_id", valueOf2);
        if (A18.nextClearBit(0) < 0) {
            throw AnonymousClass001.A0N("Missing required params");
        }
        FZb fZb = new FZb("com.bloks.www.messenger.msplit.import_contact.bottom_sheet", (String) null, 04R.A0D(A1C), 04R.A0G(), 719983200, 0L, true);
        EgZ A00 = EUd.A00(this, true);
        EU9.A00(this);
        fZb.A01(this, new FZq((Dq1) null, true, 80), A00);
    }
}
