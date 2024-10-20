package com.facebook.maps;

import X.0FI;
import X.1pL;
import X.C00g;
import X.ITl;
import X.MFR;
import X.MKs;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import java.util.ArrayDeque;

/* loaded from: FbMapFragmentDelegate.class */
public class FbMapFragmentDelegate extends 1pL implements C00g {
    public FbMapViewDelegate A00;
    public final ArrayDeque A02 = new ArrayDeque();
    public MapOptions A01 = new MapOptions();

    public void A1P(MFR mfr) {
        FbMapViewDelegate fbMapViewDelegate = this.A00;
        if (fbMapViewDelegate == null) {
            this.A02.add(mfr);
        } else {
            fbMapViewDelegate.A07(mfr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(481050998);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("MAP_OPTIONS");
            if (parcelable instanceof MapOptions) {
                this.A01 = (MapOptions) parcelable;
            }
        }
        FbMapViewDelegate fbMapViewDelegate = new FbMapViewDelegate(getContext(), this.A01);
        this.A00 = fbMapViewDelegate;
        fbMapViewDelegate.A07(new ITl(this, 0));
        this.A00.A05(bundle);
        FbMapViewDelegate fbMapViewDelegate2 = this.A00;
        0FI.A08(-329861152, A02);
        return fbMapViewDelegate2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-1932162752);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        this.A00.A01();
        0FI.A08(374429861, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        if (attributeSet != null) {
            this.A01 = MapOptions.A00(attributeSet);
        }
        super/*androidx.fragment.app.Fragment*/.onInflate(context, attributeSet, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLowMemory() {
        super/*androidx.fragment.app.Fragment*/.onLowMemory();
        MKs mKs = this.A00.A00;
        if (mKs != null) {
            mKs.onLowMemory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(812549774);
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.A00.A02();
        0FI.A08(-1920851275, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(2077179985);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A00.A03();
        0FI.A08(-614315196, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.A00.A06(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(1275881498);
        super/*androidx.fragment.app.Fragment*/.onStart();
        this.A00.A04();
        0FI.A08(-1145662283, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(-620535331);
        super/*androidx.fragment.app.Fragment*/.onStop();
        MKs mKs = this.A00.A00;
        if (mKs != null) {
            mKs.onStop();
        }
        0FI.A08(1958817162, A02);
    }
}
