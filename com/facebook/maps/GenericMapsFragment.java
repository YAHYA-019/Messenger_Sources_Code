package com.facebook.maps;

import X.0FI;
import X.0S2;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.1iF;
import X.1lN;
import X.1pK;
import X.2Z9;
import X.7zL;
import X.7zO;
import X.AbE;
import X.AbF;
import X.AbG;
import X.C02333uu;
import X.C09s;
import X.C2xd;
import X.CH8;
import X.DKF;
import X.Fsb;
import X.HHg;
import X.HsH;
import X.I2o;
import X.IA1;
import X.IKC;
import X.IKE;
import X.ITd;
import X.ITl;
import X.JNf;
import X.JOd;
import X.KOh;
import X.Kkz;
import X.L0r;
import X.MFQ;
import X.MFR;
import X.Qnl;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.messaging.professionalservices.booking.activities.AppointmentActivity;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.R;

/* loaded from: GenericMapsFragment.class */
public final class GenericMapsFragment extends 1pK implements 1lN, MFR, MFQ {
    public static final String[] A0H = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public double A00;
    public double A01;
    public LatLng A02;
    public C2xd A03;
    public C02333uu A04;
    public I2o A05;
    public FbMapFragmentDelegate A06;
    public String A08;
    public boolean A09;
    public float A0A;
    public LatLng A0B;
    public HHg A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public final CH8 A0G = (CH8) 1Bi.A03(85098);
    public String A07 = "mechanism_unknown";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.Kkz] */
    public static void A03(GenericMapsFragment genericMapsFragment, JNf jNf) {
        HsH hsH = new HsH();
        hsH.A01(genericMapsFragment.A0B);
        hsH.A01(genericMapsFragment.A02);
        LatLngBounds A00 = hsH.A00();
        int dimensionPixelSize = 7zO.A0D(genericMapsFragment).getDimensionPixelSize(R.dimen.mapbox_minimum_scale_span_when_rotating);
        ?? obj = new Object();
        obj.A01 = 2;
        obj.A04 = A00;
        obj.A02 = dimensionPixelSize;
        jNf.A85(obj, null, 1500);
    }

    public 1iF A1R() {
        return AbF.A0C(836603876839895L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A05 = (I2o) 7zO.A0l(this, 116306);
        this.A04 = (C02333uu) 1Bi.A03(131080);
        this.A0C = (HHg) 1Bn.A0A(116310);
        this.A03 = (C2xd) 1Bn.A0A(306);
        I2o i2o = this.A05;
        FragmentActivity activity = getActivity();
        activity.getClass();
        Preconditions.checkArgument(activity instanceof FbFragmentActivity);
        FbFragmentActivity fbFragmentActivity = (FbFragmentActivity) activity;
        fbFragmentActivity.getClass();
        i2o.A00 = fbFragmentActivity;
        i2o.A01 = this;
        fbFragmentActivity.A5D(i2o.A07);
    }

    public String AWg() {
        return "full_screen_map";
    }

    public Long Am7() {
        return 836603876839895L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C5X(JNf jNf) {
        if (this.mView != null) {
            jNf.Beb(Kkz.A00(this.A0B, this.A0A));
            L0r l0r = new L0r();
            l0r.A01 = this.A0B;
            l0r.A04 = this.A0E;
            l0r.A03 = this.A08;
            l0r.A02 = IA1.A01(2132345652);
            JOd A6L = jNf.A6L(l0r);
            A6L.D01();
            jNf.A6m(new ITd(A6L));
            View A0F = 7zL.A0F(this, 2131365918);
            A0F.setVisibility(0);
            IKC.A00(A0F, this, jNf, 3);
            A0F.requestLayout();
        }
    }

    public void C8N(Location location) {
        this.A02 = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.A09) {
            this.A09 = false;
            this.A06.A1P(new ITl(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof FbMapFragmentDelegate) {
            Bundle A05 = 1BK.A05();
            MapOptions mapOptions = new MapOptions();
            mapOptions.A04 = KOh.A01;
            mapOptions.A08 = this.A0F;
            mapOptions.A06 = "GenericMapsFragment.java";
            mapOptions.A05 = 0S2.A0C;
            A05.putParcelable("MAP_OPTIONS", mapOptions);
            fragment.setArguments(A05);
            FbMapFragmentDelegate fbMapFragmentDelegate = (FbMapFragmentDelegate) fragment;
            this.A06 = fbMapFragmentDelegate;
            fbMapFragmentDelegate.A1P(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-154700805);
        Bundle requireArguments = requireArguments();
        this.A0E = requireArguments.getString("place_name");
        this.A08 = requireArguments.getString("address");
        this.A00 = requireArguments.getDouble(com.facebook.location.platform.api.Location.LATITUDE);
        double d = requireArguments.getDouble("longitude");
        this.A01 = d;
        this.A0B = new LatLng(this.A00, d);
        this.A0A = requireArguments.getFloat("zoom");
        this.A0D = requireArguments.getString(AbE.A00(479));
        this.A0F = requireArguments.getString("surface_tag");
        if (bundle != null) {
            this.A07 = bundle.getString("mechanism", "mechanism_unknown");
        }
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542094);
        IKE.A01(C09s.A01(A08, 2131364333), this, 7);
        0FI.A08(1768513847, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-298538757);
        I2o i2o = this.A05;
        DKF.A0h(i2o.A0A).A06(Qnl.A01);
        FbFragmentActivity fbFragmentActivity = i2o.A00;
        if (fbFragmentActivity != null) {
            fbFragmentActivity.Cdt(i2o.A07);
        }
        i2o.A00 = null;
        i2o.A01 = null;
        this.A06 = null;
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(-1444529142, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("mechanism", this.A07);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-845754902);
        super/*androidx.fragment.app.Fragment*/.onStart();
        2Z9 r0 = (2Z9) CaT(2Z9.class);
        if (r0 != null) {
            AppointmentActivity appointmentActivity = (AppointmentActivity) r0;
            String str = this.A0E.toString();
            Fsb fsb = appointmentActivity.A04;
            str.getClass();
            fsb.CvV(str);
        }
        0FI.A08(8819741, A02);
    }
}
