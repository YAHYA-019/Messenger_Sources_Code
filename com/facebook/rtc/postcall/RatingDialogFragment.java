package com.facebook.rtc.postcall;

import X.11T;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.7zO;
import X.C0Ad;
import X.C5ic;
import X.DKG;
import X.DR6;
import X.GOq;
import X.GVj;
import X.IGS;
import X.JMS;
import X.JZj;
import X.RkT;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import com.facebook.mig.scheme.schemes.DarkColorScheme;
import com.facebook.resources.ui.FbTextView;
import com.facebook.rtc.postcall.api.PostCallDialogFragment;

/* loaded from: RatingDialogFragment.class */
public final class RatingDialogFragment extends PostCallDialogFragment {
    public int A00;
    public int A01;
    public JZj A02;
    public FbTextView A03;
    public boolean A04;
    public final 1Br A05 = 1Bu.A02(this, 16979);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        View inflate = LayoutInflater.from(requireContext()).inflate(2132543561, (ViewGroup) null);
        11T.A0D(inflate);
        RatingBar ratingBar = (RatingBar) DKG.A0B(inflate, 2131367534);
        Drawable progressDrawable = ratingBar.getProgressDrawable();
        if ((1Br.A0B(this.A05) instanceof DarkColorScheme) && (progressDrawable instanceof LayerDrawable)) {
            7zO.A17(PorterDuff.Mode.SRC_ATOP, ((LayerDrawable) progressDrawable).getDrawable(0), -16777216);
        }
        C0Ad.A0B(ratingBar, new GVj(this, ratingBar, 0));
        ratingBar.setOnRatingBarChangeListener(new RkT(this));
        this.A03 = (FbTextView) inflate.requireViewById(2131368409);
        DR6 A02 = ((C5ic) 1Bn.A0A(67527)).A02(requireContext());
        A02.A0G(IGS.A00(this, 30), getString(2131964934));
        A02.A0E(IGS.A00(this, 31), getString(2131955718));
        A02.A00(2131965100);
        A02.A0I(inflate);
        JZj A04 = A02.A04();
        this.A02 = A04;
        A1D(A04);
        return A04;
    }

    public 1iF A17() {
        return GOq.A0U();
    }

    public void ATi() {
        this.A04 = true;
        A1C(this.A00, null, null, null);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A04) {
            this.A04 = false;
            return;
        }
        int i = this.A00;
        if (1 > i || i >= 3) {
            A1C(i, null, null, null);
            return;
        }
        JMS jms = super.A00;
        if (jms != null) {
            jms.D0M(i, "");
        }
    }
}
