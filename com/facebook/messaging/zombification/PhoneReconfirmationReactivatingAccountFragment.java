package com.facebook.messaging.zombification;

import X.0FI;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1Ew;
import X.1NK;
import X.1Ql;
import X.1lN;
import X.4YU;
import X.AbF;
import X.AbG;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.C00i;
import X.C1F;
import X.DKG;
import X.DeF;
import X.Ee7;
import X.FAE;
import X.JgM;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.messaging.phoneconfirmation.protocol.PhoneNumberParam;
import com.facebook.user.model.User;
import com.facebook.widget.listview.EmptyListViewItem;
import java.util.Map;

/* loaded from: PhoneReconfirmationReactivatingAccountFragment.class */
public final class PhoneReconfirmationReactivatingAccountFragment extends AbstractNavigableFragment implements 1lN {
    public 1Ew A00;
    public PhoneNumberParam A01;
    public FAE A02;
    public String A03;
    public JgM A04;
    public Ee7 A05;
    public EmptyListViewItem A06;
    public final C00i A07 = AbF.A0S(this, 50021);

    public static void A03(PhoneReconfirmationReactivatingAccountFragment phoneReconfirmationReactivatingAccountFragment) {
        phoneReconfirmationReactivatingAccountFragment.A02.A04("phone_reconfirmation_reactivating_account_screen", "phone_reconfirmation_reactivate_account_result", (Map) null);
        Ee7 ee7 = phoneReconfirmationReactivatingAccountFragment.A05;
        PhoneNumberParam phoneNumberParam = phoneReconfirmationReactivatingAccountFragment.A01;
        11T.A0F(phoneNumberParam, 0);
        C1F c1f = ee7.A00;
        String str = phoneNumberParam.A00;
        String str2 = phoneNumberParam.A01;
        1Ql A08 = 1Br.A08(c1f.A00);
        A08.CaL(1NK.A6C, str);
        A08.CaL(1NK.A6B, str2);
        AbK.A1O(A08, 1NK.A63);
        Intent A0A = 4YU.A0A("phone_reconfirmation_complete");
        A0A.putExtra("complete_method", "phone_number_reconfirmed");
        phoneReconfirmationReactivatingAccountFragment.A1Y(A0A);
    }

    public static void A06(PhoneReconfirmationReactivatingAccountFragment phoneReconfirmationReactivatingAccountFragment) {
        User Auc = phoneReconfirmationReactivatingAccountFragment.A00.Auc();
        if (Auc != null && !Auc.A25) {
            A03(phoneReconfirmationReactivatingAccountFragment);
        }
        if (phoneReconfirmationReactivatingAccountFragment.A04.A1S()) {
            return;
        }
        phoneReconfirmationReactivatingAccountFragment.A02.A03("phone_reconfirmation_reactivating_account_screen", "phone_reconfirmation_reactivate_account_submit");
        Bundle A05 = 1BK.A05();
        A05.putParcelable("phoneNumber", phoneReconfirmationReactivatingAccountFragment.A01);
        A05.putString("confirmationCode", phoneReconfirmationReactivatingAccountFragment.A03);
        phoneReconfirmationReactivatingAccountFragment.A04.A1R(1BJ.A00(533), A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A05 = (Ee7) 1Bn.A0A(82339);
        this.A02 = (FAE) 1Bn.A0A(100132);
        this.A00 = AbI.A09();
        JgM A0L = DKG.A0L(this, "reactivateAccountFragment");
        this.A04 = A0L;
        DeF.A00(A0L, this, 10);
    }

    public String AWg() {
        return "phone_reconfirmation_reactivating_account_screen";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-572991087);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543098);
        0FI.A08(-1415250096, A02);
        return A08;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PhoneNumberParam phoneNumberParam = this.A01;
        String str = this.A03;
        bundle.putParcelable("phoneNumber", phoneNumberParam);
        bundle.putString("confirmationCode", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r303 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            super.onViewCreated(r1, r2)
            r0 = r301
            X.FAE r0 = r0.A02
            r304 = r0
            java.lang.String r0 = "phone_reconfirmation_reactivating_account_screen"
            r305 = r0
            r0 = r304
            r1 = r305
            r0.A02(r1)
            r0 = r303
            if (r0 != 0) goto L38
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L38
        L22:
            r0 = r301
            r1 = 2131366826(0x7f0a13aa, float:1.8353557E38)
            android.view.View r0 = X.7zL.A0F(r0, r1)
            com.facebook.widget.listview.EmptyListViewItem r0 = (com.facebook.widget.listview.EmptyListViewItem) r0
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A06 = r1
            r0 = r304
            r1 = 1
            r0.A0F(r1)
            return
        L38:
            r0 = r303
            java.lang.String r1 = "phoneNumber"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.facebook.messaging.phoneconfirmation.protocol.PhoneNumberParam r0 = (com.facebook.messaging.phoneconfirmation.protocol.PhoneNumberParam) r0
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A01 = r1
            r0 = r303
            java.lang.String r1 = "confirmationCode"
            java.lang.String r0 = r0.getString(r1)
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A03 = r1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.zombification.PhoneReconfirmationReactivatingAccountFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
