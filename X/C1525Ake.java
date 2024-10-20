package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.resources.ui.FbRadioButton;

/* renamed from: X.Ake, reason: case insensitive filesystem */
/* loaded from: Ake.class */
public final class C1525Ake extends 1pK {
    public static final String __redex_internal_original_name = "MessengerSecureAccountFragment";
    public DE7 A00;
    public FbRadioButton A01;
    public FbRadioButton A02;

    public 1iF A1R() {
        return AbK.A0F();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-823771986);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542595);
        0FI.A08(-1742610396, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View A0F = 7zL.A0F(this, 2131365130);
        this.A01 = (FbRadioButton) 7zL.A0F(this, 2131365129);
        View A0F2 = 7zL.A0F(this, 2131365343);
        this.A02 = (FbRadioButton) 7zL.A0F(this, 2131365342);
        this.A01.setChecked(true);
        this.A02.setChecked(false);
        CZD.A01(A0F, this, 13);
        CZD.A01(A0F2, this, 14);
        CZD.A01(7zL.A0F(this, 2131363364), this, 15);
    }
}
