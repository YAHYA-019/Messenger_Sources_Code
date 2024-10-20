package com.facebook.messaging.neue.nux.profilepic;

import X.0FI;
import X.1BK;
import X.1Bi;
import X.1lN;
import X.53S;
import X.7zO;
import X.AbE;
import X.AbF;
import X.AbH;
import X.AbK;
import X.C00i;
import X.C15h;
import X.C1rs;
import X.DKB;
import X.FAJ;
import X.FFh;
import X.H9L;
import X.IKE;
import X.J5u;
import X.QCs;
import X.QLq;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.util.BitSet;

/* loaded from: PartialNuxProfilePicFragment.class */
public final class PartialNuxProfilePicFragment extends NuxFragment implements 1lN, INeueNuxMilestoneFragment {
    public View A00;
    public FAJ A01;
    public 53S A02;
    public C15h A03;
    public final FFh A07 = (FFh) 1Bi.A03(100123);
    public final C00i A06 = AbH.A0c(this);
    public final View.OnClickListener A05 = IKE.A00(this, ActionId.CARD_DATA_LOADED);
    public final View.OnClickListener A04 = IKE.A00(this, ActionId.VIEW_WILL_APPEAR_BEGIN);

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return "profile_pic_choice";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public void A1c(Bundle bundle) {
        this.A03 = J5u.A03(this, 37);
        this.A01 = (FAJ) 7zO.A0l(this, 100122);
        this.A02 = (53S) 7zO.A0l(this, 49478);
        if (((User) this.A03.get()).A0T.asBoolean(false)) {
            return;
        }
        this.A01.A03("profile_pic_skipped_existing");
        this.A07.A02("profile_pic_choice", "partial_profile_pic_already_exists_skip");
        A1e(null, "nux_profile_pic_auto_skip");
    }

    public String AWg() {
        return "orca_nux_profile_pic";
    }

    public Long Am7() {
        return 252356926025912L;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || i != 1 || intent == null || intent.getData() == null) {
            return;
        }
        this.A01.A03("profile_pic_gallery_success");
        this.A07.A02("profile_pic_choice", "partial_profile_pic_choose_from_gallery_success");
        Bundle A05 = 1BK.A05();
        A05.putParcelable("picture_uri", intent.getData());
        A05.putSerializable("back_action", H9L.A02);
        A1d(A05, DKB.A00(75), AbE.A00(642));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1848948864);
        LithoView A0O = AbK.A0O(this);
        this.A00 = A0O;
        0FI.A08(434540441, A02);
        return A0O;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LithoView lithoView = (LithoView) this.A00;
        QCs qCs = new QCs(lithoView.A09, new QLq());
        MigColorScheme A0p = AbF.A0p(this.A06);
        QLq qLq = qCs.A01;
        qLq.A02 = A0p;
        BitSet bitSet = qCs.A02;
        bitSet.set(1);
        qLq.A00 = this.A05;
        bitSet.set(0);
        qLq.A01 = this.A04;
        bitSet.set(2);
        C1rs.A03(bitSet, qCs.A03);
        qCs.A0J();
        lithoView.A0x(qLq);
    }
}
