package com.facebook.messaging.chatheads.interstitialnux;

import X.0FI;
import X.1BL;
import X.1BQ;
import X.1Rv;
import X.1iF;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.AlW;
import X.BJB;
import X.Bcd;
import X.BhU;
import X.C00i;
import X.C1xm;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;

/* loaded from: ChatHeadsInterstitialNuxFragment.class */
public class ChatHeadsInterstitialNuxFragment extends FullScreenDialogFragment {
    public Dialog A00;
    public BhU A01;
    public final C00i A04 = AbH.A0S();
    public final C00i A02 = 1BQ.A02(67262);
    public final C00i A03 = AbH.A0D();

    public static void A05(ChatHeadsInterstitialNuxFragment chatHeadsInterstitialNuxFragment) {
        if (((1Rv) chatHeadsInterstitialNuxFragment.A02.get()).A0B()) {
            AbK.A1O(1BL.A0V(chatHeadsInterstitialNuxFragment.A04), C1xm.A09);
            BhU bhU = chatHeadsInterstitialNuxFragment.A01;
            if (bhU != null) {
                AlW.A06(bhU.A00);
            }
        }
        chatHeadsInterstitialNuxFragment.A0p();
    }

    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        this.A00 = A0n;
        A0n.getWindow().getAttributes().windowAnimations = 2132607236;
        return this.A00;
    }

    public 1iF A17() {
        return AbF.A0C(3719985438017145L);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        A05(this);
    }

    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(193430891);
        super.onCreate(bundle);
        0FI.A08(1728562678, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(311837423);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541690);
        0FI.A08(-1582410559, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.BJB, X.B8p] */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ?? bjb = new BJB();
        bjb.A00 = this.A00.getWindow();
        bjb.A02 = new Bcd(this);
        AbI.A1I(AbJ.A09(this), (Fragment) bjb, 2131365051);
    }
}
