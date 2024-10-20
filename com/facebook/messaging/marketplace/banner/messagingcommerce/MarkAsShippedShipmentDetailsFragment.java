package com.facebook.messaging.marketplace.banner.messagingcommerce;

import X.0D2;
import X.0FI;
import X.1BQ;
import X.1BV;
import X.1Iw;
import X.1tC;
import X.4YT;
import X.4YU;
import X.4YV;
import X.6KV;
import X.7zP;
import X.82O;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbI;
import X.C00i;
import X.DKD;
import X.Dsz;
import X.DzY;
import X.EQy;
import X.EQz;
import X.Ee1;
import X.F7Z;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.p2m.logging.McomThreadIds;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: MarkAsShippedShipmentDetailsFragment.class */
public class MarkAsShippedShipmentDetailsFragment extends SlidingSheetFullScreenDialogFragment {
    public 6KV A00;
    public C00i A01;
    public final C00i A03 = AbH.A0c(this);
    public final C00i A02 = 1BQ.A02(99207);
    public final C00i A04 = 1BV.A00(65571);

    @Override // com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment, com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1706212732);
        super.onCreate(bundle);
        this.A01 = 1BV.A00(16838);
        0FI.A08(-2022832030, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1474946152);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        String A00 = 4YT.A00(534);
        Preconditions.checkArgument(bundle2.containsKey(A00));
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(A00);
        parcelableArrayList.getClass();
        String A002 = 4YT.A00(536);
        Preconditions.checkArgument(bundle2.containsKey(A002));
        String A003 = 4YT.A00(531);
        Preconditions.checkArgument(bundle2.containsKey(A003));
        Preconditions.checkArgument(bundle2.containsKey(A002));
        String A004 = 4YT.A00(537);
        Preconditions.checkArgument(bundle2.containsKey(A004));
        String A005 = 4YT.A00(538);
        Preconditions.checkArgument(bundle2.containsKey(A005));
        String A0p = DKD.A0p(bundle2, A002);
        String A0p2 = DKD.A0p(bundle2, A004);
        String A0p3 = DKD.A0p(bundle2, 4YT.A00(532));
        String A0p4 = DKD.A0p(bundle2, 4YT.A00(535));
        int i = bundle2.getInt(4YT.A00(533));
        boolean z = bundle2.getBoolean(A005);
        McomThreadIds mcomThreadIds = new McomThreadIds(bundle2.getString(A003), A0p4, "", i, A0p, null, A0p2);
        ((F7Z) this.A02.get()).A01(EQy.A03, EQz.A05, mcomThreadIds, (ImmutableMap) null, "mas_open_shipment_details_input_screen");
        1Iw A0P = AbI.A0P(this);
        FbUserSession A0C = 4YV.A0C(requireContext());
        Context context = getContext();
        Dsz dsz = new Dsz(A0P, new DzY());
        DzY dzY = dsz.A01;
        dzY.A00 = A0C;
        BitSet bitSet = dsz.A02;
        bitSet.set(2);
        dzY.A04 = AbG.A0y(ImmutableList.builder(), parcelableArrayList);
        bitSet.set(1);
        C00i c00i = this.A03;
        dzY.A02 = AbF.A0p(c00i);
        dzY.A01 = new Ee1(this);
        bitSet.set(3);
        dzY.A03 = mcomThreadIds;
        bitSet.set(5);
        dzY.A06 = A0p3;
        bitSet.set(0);
        dzY.A05 = Boolean.valueOf(z);
        bitSet.set(4);
        7zP.A15(dsz, bitSet, dsz.A03);
        LithoView A006 = LithoView.A00(context, dzY);
        MigColorScheme.A00(A006, AbF.A0p(c00i));
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && dialog.getWindow() != null) {
            ((1tC) 4YU.A0p(this.A01)).A03(((0D2) this).A01.getWindow(), AbF.A0p(c00i));
        }
        6KV A007 = ((82O) this.A04.get()).A00(getContext());
        this.A00 = A007;
        A007.A02();
        0FI.A08(-1782307342, A02);
        return A006;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(813236);
        super.onDestroy();
        this.A00.A04();
        0FI.A08(-1083659657, A02);
    }
}
