package com.facebook.messaging.neue.nux.profilepic;

import X.0FI;
import X.1BL;
import X.1Bi;
import X.1Lo;
import X.1lN;
import X.7zK;
import X.7zO;
import X.AbF;
import X.AbH;
import X.AbK;
import X.C00i;
import X.C1rs;
import X.FAJ;
import X.FFh;
import X.H9L;
import X.IKE;
import X.QCr;
import X.QLt;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: PartialNuxConfirmPictureFragment.class */
public final class PartialNuxConfirmPictureFragment extends NuxFragment implements 1lN, CallerContextable {
    public Uri A00;
    public C00i A01;
    public FAJ A02;
    public H9L A03;
    public LithoView A04;
    public final FFh A06 = (FFh) 1Bi.A03(100123);
    public final C00i A05 = AbH.A0D();
    public final C00i A09 = AbH.A0c(this);
    public final View.OnClickListener A08 = IKE.A00(this, ActionId.VIDEO_SET_RENDERER_CONTEXT);
    public final View.OnClickListener A07 = IKE.A00(this, ActionId.HEADER_DATA_LOADED);

    private void A03() {
        LithoView lithoView = this.A04;
        QCr qCr = new QCr(lithoView.A09, new QLt());
        MigColorScheme A0p = AbF.A0p(this.A09);
        QLt qLt = qCr.A01;
        qLt.A03 = A0p;
        BitSet bitSet = qCr.A02;
        bitSet.set(0);
        Uri uri = this.A00;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        qLt.A00 = uri;
        qLt.A02 = this.A08;
        bitSet.set(2);
        qLt.A01 = this.A07;
        bitSet.set(1);
        C1rs.A03(bitSet, qCr.A03);
        qCr.A0J();
        lithoView.A0x(qLt);
    }

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return "confirm_profile_picture";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public void A1c(Bundle bundle) {
        FbUserSession A0G = 1BL.A0G(this);
        this.A02 = (FAJ) 7zO.A0l(this, 100122);
        this.A01 = 1Lo.A02(A0G, this, 116191);
        this.A03 = this.mArguments.getBundle(7zK.A00(10)).getSerializable("back_action");
    }

    public String AWg() {
        return "orca_nux_confirm_profile_picture";
    }

    public Long Am7() {
        return 252356926025912L;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1 || i2 != -1 || intent == null || intent.getData() == null) {
            return;
        }
        this.A00 = intent.getData();
        A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1047755179);
        LithoView A0O = AbK.A0O(this);
        this.A04 = A0O;
        0FI.A08(-2000767228, A02);
        return A0O;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("picture_uri", this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            bundle = this.mArguments.getBundle(7zK.A00(10));
        }
        this.A00 = (Uri) bundle.getParcelable("picture_uri");
        A03();
    }
}
