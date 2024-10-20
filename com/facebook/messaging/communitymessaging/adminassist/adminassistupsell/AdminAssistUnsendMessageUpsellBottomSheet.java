package com.facebook.messaging.communitymessaging.adminassist.adminassistupsell;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.1Um;
import X.1iF;
import X.6CU;
import X.7zP;
import X.7zV;
import X.9De;
import X.AbF;
import X.AbG;
import X.AbJ;
import X.AbM;
import X.AeI;
import X.Bci;
import X.Bkh;
import X.C00i;
import X.C0s8;
import X.C1rs;
import X.CaE;
import X.Czf;
import X.DCG;
import X.QBr;
import X.QIs;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.communitymessaging.adminassist.adminassistupsell.model.AdminAssistCommandSequenceViewModel;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: AdminAssistUnsendMessageUpsellBottomSheet.class */
public final class AdminAssistUnsendMessageUpsellBottomSheet extends MigBottomSheetDialogFragment {
    public C00i A00;
    public String A01;
    public String A02;
    public List A03;
    public Bci A04;
    public boolean A05;
    public final 1Br A06 = AbG.A0c();

    public void A14(Bundle bundle, LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        11T.A0F(layoutInflater, 0);
        super.A14(bundle, layoutInflater, view, viewGroup);
        if (this.A05) {
            return;
        }
        C00i c00i = this.A00;
        if (c00i == null) {
            11T.A0L("adminAssistCommandSequenceResource");
            throw 0Q8.createAndThrow();
        }
        Bkh bkh = (Bkh) c00i.get();
        String str = this.A01;
        if (str != null) {
            long parseLong = Long.parseLong(str);
            if (Long.valueOf(parseLong) != null) {
                MailboxFeature A0d = 7zP.A0d(bkh.A00);
                1Um A0O = 1BK.A0O(A0d, 0);
                MailboxFutureImpl A0P = 1BK.A0P(A0O);
                1Um.A02(A0O, Czf.A00(A0d, A0P, 9, parseLong), A0P, false);
                AbJ.A0O(this.A06).A03(new CommunityMessagingLoggerModel(null, null, this.A01, this.A02, null, null, null, "admin_assit_upsell_bottomsheet", "admin_assist_upsell_sheet_rendered", "thread_view", null, null));
                this.A05 = true;
                return;
            }
        }
        throw 1BK.A0h();
    }

    public 1iF A17() {
        return AbF.A0C(447151659733423L);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        MigColorScheme A0S = 7zV.A0S(this);
        List list = this.A03;
        int i = 0;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((AdminAssistCommandSequenceViewModel) it.next()).A00) {
                    i++;
                    if (i < 0) {
                        C0s8.A17();
                        break;
                    }
                }
            }
        }
        QBr qBr = new QBr(r302, new QIs());
        1LI r0 = qBr.A01;
        ((QIs) r0).A02 = A0S;
        BitSet bitSet = qBr.A02;
        bitSet.set(1);
        ((QIs) r0).A03 = this.A03;
        bitSet.set(2);
        Bci bci = this.A04;
        if (bci == null) {
            11T.A0L("clickListener");
            throw 0Q8.createAndThrow();
        }
        ((QIs) r0).A01 = bci;
        bitSet.set(0);
        ((QIs) r0).A00 = i;
        C1rs.A03(bitSet, qBr.A03);
        qBr.A0J();
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Long A0n;
        int A02 = 0FI.A02(458065041);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("community_id");
        this.A02 = requireArguments.getString("group_id");
        if (bundle != null) {
            this.A01 = bundle.getString("community_id");
            this.A02 = bundle.getString("group_id");
            this.A05 = bundle.getBoolean("impression_logged");
        }
        1Br A0O = AbM.A0O(this, 1BM.A01(this), 82681);
        this.A00 = A0O;
        this.A04 = new Bci(this);
        Object obj = A0O.get();
        String str = this.A01;
        if (str == null || (A0n = 1BK.A0n(str)) == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-1849533911, A02);
            throw A0h;
        }
        CaE.A02(this, new 6CU(new DCG(obj, A0n.longValue(), 4), new AeI(obj, 39)), 6);
        0FI.A08(-861286477, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("community_id", this.A01);
        bundle.putString("group_id", this.A02);
        bundle.putBoolean("impression_logged", this.A05);
    }
}
