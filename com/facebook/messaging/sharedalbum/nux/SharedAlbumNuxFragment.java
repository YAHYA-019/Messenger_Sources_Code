package com.facebook.messaging.sharedalbum.nux;

import X.0FI;
import X.0Gm;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.7zO;
import X.7zQ;
import X.83S;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.8Tn;
import X.9De;
import X.9WT;
import X.9nJ;
import X.9zC;
import X.C1u3;
import X.C37s;
import X.C8xf;
import X.C98N;
import X.C9hq;
import X.DGJ;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: SharedAlbumNuxFragment.class */
public final class SharedAlbumNuxFragment extends MigBottomSheetDialogFragment {
    public static final 9WT A03 = new Object();
    public ThreadKey A00;
    public final 1Br A02 = 1Bu.A02(this, 67786);
    public boolean A01 = true;

    public static final void A05(SharedAlbumNuxFragment sharedAlbumNuxFragment) {
        super.A0o();
        ThreadKey threadKey = sharedAlbumNuxFragment.A00;
        if (threadKey != null) {
            9nJ.A04(C98N.BOTTOM_SHEET_NUX, threadKey, 7zQ.A0j(((C9hq) 1Br.A0B(sharedAlbumNuxFragment.A02)).A04), "click", "button_continue", 0L);
        }
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A0o() {
        super.A0o();
        ThreadKey threadKey = this.A00;
        if (threadKey != null) {
            9nJ.A04(C98N.BOTTOM_SHEET_NUX, threadKey, 7zQ.A0j(((C9hq) 1Br.A0B(this.A02)).A04), "dismiss", "bottom_sheet", 0L);
        }
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(80);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new 9zC(this);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8Tn A07 = 8Tn.A07(r302, this);
        String A0D = r302.A0D(2131965865);
        ThreadKey threadKey = this.A00;
        if (threadKey != null && threadKey.A0z()) {
            A0D = r302.A0D(2131965866);
        }
        C8xf A00 = C8xf.A00(2132411118);
        ThreadKey threadKey2 = this.A00;
        A07.A2Y(new 8NJ(new 8Lf(83S.A00(this, 21), r302.A0D(2131965860)), A00, (CharSequence) null, (CharSequence) null, A0D, (threadKey2 == null || !threadKey2.A0z()) ? 7zO.A12(8Ll.A01(C1u3.A3A, r302.A0D(2131965861), r302.A0D(2131965856), (String) null, 8), 8Ll.A01(C1u3.A4y, r302.A0D(2131965863), r302.A0D(2131965858), (String) null, 8)) : 7zO.A12(8Ll.A01(C1u3.A28, r302.A0D(2131965862), r302.A0D(2131965857), (String) null, 8), 8Ll.A01(C1u3.A39, r302.A0D(2131965864), r302.A0D(2131965859), (String) null, 8)), true));
        A07.A2X();
        A07.A2K("shared_album_nux_bottom_sheet");
        return A07.A2W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-530844639);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getBoolean("should_count_impression");
        Parcelable parcelable = requireArguments.getParcelable("thread_key");
        Parcelable.Creator creator = ThreadKey.CREATOR;
        11T.A0B(creator);
        this.A00 = (ThreadKey) 0Gm.A01(creator, parcelable, ThreadKey.class);
        0FI.A08(-888757244, A02);
    }
}
