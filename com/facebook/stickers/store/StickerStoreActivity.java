package com.facebook.stickers.store;

import X.06Z;
import X.0fH;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Uv;
import X.1iF;
import X.4YU;
import X.C00i;
import X.C06c;
import X.C0D1;
import X.C0dr;
import X.C0qy;
import X.C2044Da5;
import X.C6ox;
import X.C6xd;
import X.C6yc;
import X.Far;
import X.Fsb;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.stickers.model.StickerPack;
import com.google.common.base.Optional;

/* loaded from: StickerStoreActivity.class */
public class StickerStoreActivity extends FbFragmentActivity implements C6yc {
    public C6ox A00;
    public C6xd A01;
    public StickerStoreFragment A02;
    public C2044Da5 A03;
    public Fsb A04;
    public Integer A05;
    public C0dr A06;
    public C0qy A07;
    public final C00i A08 = 1BQ.A01();
    public final C00i A09 = 1BQ.A02(16688);

    public static void A12(StickerPack stickerPack, StickerStoreActivity stickerStoreActivity, boolean z, boolean z2, boolean z3) {
        06Z BDe = stickerStoreActivity.BDe();
        if (C0D1.A01(BDe)) {
            06Z BDe2 = stickerStoreActivity.BDe();
            C2044Da5 c2044Da5 = (C2044Da5) BDe2.A0b("packFragment");
            stickerStoreActivity.A03 = c2044Da5;
            if (c2044Da5 == null) {
                if (C0D1.A01(BDe2)) {
                    stickerStoreActivity.A03 = new C2044Da5();
                    C06c c06c = new C06c(BDe2);
                    c06c.A0P(stickerStoreActivity.A03, "packFragment", 2131363324);
                    c06c.A0H(stickerStoreActivity.A03);
                    c06c.A04();
                    BDe2.A0t();
                }
            }
            C2044Da5 c2044Da52 = stickerStoreActivity.A03;
            C6xd c6xd = stickerStoreActivity.A01;
            c2044Da52.A03 = stickerPack;
            c2044Da52.A05 = z;
            c2044Da52.A06 = z2;
            c2044Da52.A04 = Optional.of(c6xd);
            FbUserSession fbUserSession = c2044Da52.A01;
            fbUserSession.getClass();
            C2044Da5.A06(fbUserSession, c2044Da52);
            C06c c06c2 = new C06c(BDe);
            Fragment A0b = stickerStoreActivity.BDe().A0b("storeFragment");
            if (A0b != null) {
                c06c2.A0H(A0b);
            }
            c06c2.A0K(stickerStoreActivity.A03);
            if (z3) {
                c06c2.A0V("packFragment");
            }
            c06c2.A04();
            return;
        }
        0fH.A0B(StickerStoreActivity.class, "Unable to safely commit fragment transactions--aborting operation.");
    }

    public static void A15(StickerStoreActivity stickerStoreActivity) {
        06Z BDe = stickerStoreActivity.BDe();
        if (C0D1.A01(BDe)) {
            06Z BDe2 = stickerStoreActivity.BDe();
            StickerStoreFragment stickerStoreFragment = (StickerStoreFragment) BDe2.A0b("storeFragment");
            stickerStoreActivity.A02 = stickerStoreFragment;
            if (stickerStoreFragment == null) {
                if (C0D1.A01(BDe2)) {
                    stickerStoreActivity.A02 = new StickerStoreFragment();
                    C06c c06c = new C06c(BDe2);
                    c06c.A0P(stickerStoreActivity.A02, "storeFragment", 2131363324);
                    c06c.A0H(stickerStoreActivity.A02);
                    c06c.A04();
                    BDe2.A0t();
                }
            }
            C06c c06c2 = new C06c(BDe);
            c06c2.A0K(stickerStoreActivity.A02);
            c06c2.A04();
            return;
        }
        0fH.A0B(StickerStoreActivity.class, "Unable to safely commit fragment transactions--aborting operation.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof NavigableFragment) {
            ((NavigableFragment) fragment).Crb(new Far(this));
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(313698419837672L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        this.A00.AEC();
        1Uv.A02(4YU.A0A("com.facebook.orca.ACTION_STICKER_STORE_CLOSED"), (1Uv) this.A09.get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0165, code lost:
    
        if (r0.hasExtra("stickerId") != false) goto L12;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stickers.store.StickerStoreActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A06 = (C0dr) 1Bi.A03(84488);
        this.A07 = (C0qy) 1Bi.A03(83603);
        this.A00 = (C6ox) 1Bn.A0E(this, (1BY) null, 50147);
        this.A05 = (Integer) 1Bn.A0A(67126);
    }
}
