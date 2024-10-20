package com.facebook.messaging.location.picker;

import X.0FI;
import X.7zL;
import X.AbG;
import X.AbJ;
import X.AbstractC2385Gbm;
import X.C06c;
import X.CZF;
import X.CZg;
import X.JEv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;
import com.facebook.messaging.location.addresspicker.AddressPickerLocationDialogFragment;
import com.facebook.messaging.search.singlepickerview.SinglePickerSearchView;

/* loaded from: LocationPickerDialogFragment.class */
public abstract class LocationPickerDialogFragment extends FullScreenDialogFragment {
    public AbstractC2385Gbm A00;
    public String A01;
    public boolean A02 = true;

    public JEv A1C() {
        return ((AddressPickerLocationDialogFragment) this).A04;
    }

    public AbstractC2385Gbm A1D() {
        return new AbstractC2385Gbm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String A1E() {
        return getString(2131958844);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof AbstractC2385Gbm) {
            AbstractC2385Gbm abstractC2385Gbm = (AbstractC2385Gbm) fragment;
            this.A00 = abstractC2385Gbm;
            abstractC2385Gbm.A04 = A1C();
            abstractC2385Gbm.A08 = this.A01;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-349533172);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542446);
        0FI.A08(91026796, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-2092126874);
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (getChildFragmentManager().A0b("search_results_fragment_tag") == null) {
            if (this.A00 == null) {
                AbJ.A1J(AbJ.A09(this), A1D(), "search_results_fragment_tag", 2131365420);
                getChildFragmentManager().A0t();
            }
            C06c A09 = AbJ.A09(this);
            A09.A0K(this.A00);
            C06c.A00(A09, false);
        }
        0FI.A08(1053580396, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.containsKey("show_freeform_nearby_place")) {
            this.A02 = this.mArguments.getBoolean("show_freeform_nearby_place");
        }
        SinglePickerSearchView singlePickerSearchView = (SinglePickerSearchView) 7zL.A0F(this, 2131367142);
        singlePickerSearchView.A00 = CZF.A00(this, 1);
        SearchView searchView = singlePickerSearchView.A01;
        searchView.setQueryHint(A1E());
        searchView.mOnQueryChangeListener = new CZg(this, searchView, 1);
    }
}
