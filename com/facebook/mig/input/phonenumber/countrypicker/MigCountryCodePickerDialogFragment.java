package com.facebook.mig.input.phonenumber.countrypicker;

import X.0FI;
import X.1Im;
import X.1Iw;
import X.1iF;
import X.2Ov;
import X.2cK;
import X.2cM;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zR;
import X.8Qw;
import X.8lS;
import X.C9zj;
import X.DBj;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: MigCountryCodePickerDialogFragment.class */
public class MigCountryCodePickerDialogFragment extends 2Ov {
    public 1Im A00;
    public LithoView A01;

    public int A0l() {
        return 2132607251;
    }

    public 1iF A17() {
        return new 1iF(793831904833076L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1353127042);
        LithoView A0M = 7zR.A0M(this);
        this.A01 = A0M;
        0FI.A08(-511813053, A02);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("colorScheme");
        parcelable.getClass();
        MigColorScheme migColorScheme = (MigColorScheme) parcelable;
        Parcelable parcelable2 = requireArguments.getParcelable("countryIsos");
        parcelable2.getClass();
        CountryIsoList countryIsoList = (CountryIsoList) parcelable2;
        1Iw A0W = 7zL.A0W(getContext());
        LithoView lithoView = this.A01;
        2cM A01 = 2cK.A01(A0W, (String) null, 0);
        8Qw r0 = new 8Qw(A0W, new 8lS());
        8lS r02 = r0.A01;
        r02.A02 = migColorScheme;
        BitSet bitSet = r0.A02;
        bitSet.set(1);
        r02.A01 = countryIsoList;
        bitSet.set(0);
        r02.A00 = 7zO.A0U(new DBj(this, 5));
        r02.A03 = new C9zj(this, ActionId.ACTION_BAR_COMPLETE);
        bitSet.set(2);
        A01.A2d(r0);
        7zM.A1O(A01, migColorScheme);
        lithoView.A0x(A01.A00);
    }
}
