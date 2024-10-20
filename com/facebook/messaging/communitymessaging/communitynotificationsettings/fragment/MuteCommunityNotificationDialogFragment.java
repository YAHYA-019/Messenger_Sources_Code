package com.facebook.messaging.communitymessaging.communitynotificationsettings.fragment;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.2Ov;
import X.7zM;
import X.7zN;
import X.AbF;
import X.AbG;
import X.AbI;
import X.AbK;
import X.AbL;
import X.AbM;
import X.AnonymousClass001;
import X.BzQ;
import X.C00i;
import X.C1A3;
import X.C2630Gjf;
import X.C3o5;
import X.C8T;
import X.CRK;
import X.CSG;
import X.CSL;
import X.D4y;
import X.DR6;
import X.JZj;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: MuteCommunityNotificationDialogFragment.class */
public final class MuteCommunityNotificationDialogFragment extends 2Ov {
    public static final BzQ A0B = new Object();
    public ThreadKey A01;
    public D4y A02;
    public Long A03;
    public String A04;
    public final 1Br A05 = 7zM.A0d();
    public final 1Br A06 = 7zN.A0I(this);
    public final 1Br A09 = 1Bu.A00(83224);
    public final 1Br A08 = 1Bu.A00(147539);
    public final 1Br A0A = 1Bu.A00(83220);
    public final 1Br A07 = AbG.A0Q();
    public int A00 = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Context requireContext = requireContext();
        C00i A0R = AbF.A0R(this.A09);
        ArrayList A0s = AnonymousClass001.A0s();
        AbM.A1U(A0s, 2131954572, 0, 1);
        A0s.add(new C2630Gjf(2131954573, 1, 1));
        AbM.A1U(A0s, 2131954575, 2, 1);
        AbM.A1U(A0s, 2131954574, 3, 1);
        AbM.A1U(A0s, 2131954576, 4, 1);
        A0R.get();
        ArrayList A0s2 = AnonymousClass001.A0s();
        AbM.A1U(A0s2, 2131954577, 0, 2);
        AbM.A1U(A0s2, 2131954579, 1, 2);
        A0s2.add(new C2630Gjf(2131954578, 2, 2));
        AbM.A1U(A0s2, 2131954576, 3, 2);
        ArrayList A1E = C1A3.A1E(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A1E.add(requireContext.getString(((C2630Gjf) it.next()).A01));
        }
        String[] A0n = C3o5.A0n(A1E);
        ArrayList A1E2 = C1A3.A1E(A0s2);
        Iterator it2 = A0s2.iterator();
        while (it2.hasNext()) {
            A1E2.add(requireContext.getString(((C2630Gjf) it2.next()).A01));
        }
        String[] A0n2 = C3o5.A0n(A1E2);
        1Br.A0C(this.A08);
        Long l = this.A03;
        if (l == null) {
            throw 1BK.A0h();
        }
        C8T c8t = new C8T(requireContext, l.longValue());
        1Bn.A0A(67527);
        boolean AZk = AbK.A0o(this.A07).AZk(36315340067185446L);
        DR6 A0K = AbL.A0K(requireContext, this.A06);
        A0K.A00(2131954570);
        if (AZk) {
            A0n = A0n2;
        }
        A0K.A02(CSG.A00(this, 46), A0n, this.A00);
        A0K.A0D(new CRK(0, this, c8t, A0s2, A0s, AZk), 2131954571);
        A0K.A0B((DialogInterface.OnClickListener) null, 2131954569);
        JZj A04 = A0K.A04();
        A04.setOnShowListener(new CSL(this, 0));
        return A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(429746459);
        super.onCreate(bundle);
        D4y d4y = null;
        if (bundle != null) {
            this.A01 = (ThreadKey) bundle.getParcelable("thread_key");
            this.A04 = bundle.getString("group_id");
            this.A03 = AbI.A10(bundle, "community_id");
            this.A00 = bundle.getInt("mute_duration_selection_index");
            Serializable serializable = bundle.getSerializable("listener");
            if (serializable instanceof D4y) {
                d4y = (D4y) serializable;
            }
            this.A02 = d4y;
        } else {
            Bundle requireArguments = requireArguments();
            this.A01 = (ThreadKey) requireArguments.getParcelable("thread_key");
            this.A04 = requireArguments.getString("group_id");
            this.A03 = AbI.A10(requireArguments, "community_id");
            Serializable serializable2 = requireArguments.getSerializable("listener");
            if (serializable2 instanceof D4y) {
                d4y = (D4y) serializable2;
            }
            this.A02 = d4y;
            this.A00 = -1;
        }
        0FI.A08(921716213, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        ThreadKey threadKey = this.A01;
        if (threadKey != null) {
            AbF.A1J(bundle, threadKey);
        }
        String str = this.A04;
        if (str != null) {
            bundle.putString("group_id", str);
        }
        Long l = this.A03;
        if (l != null) {
            bundle.putLong("community_id", l.longValue());
        }
        bundle.putInt("mute_duration_selection_index", this.A00);
    }
}
