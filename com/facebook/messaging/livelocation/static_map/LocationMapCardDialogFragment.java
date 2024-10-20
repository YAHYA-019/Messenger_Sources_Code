package com.facebook.messaging.livelocation.static_map;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.1pL;
import X.6KV;
import X.82O;
import X.9Y4;
import X.AbF;
import X.AbJ;
import X.AnonymousClass001;
import X.C06c;
import X.HB5;
import X.Hkq;
import X.ITk;
import X.KOh;
import X.KyJ;
import X.L4Y;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.maps.FbMapFragmentDelegate;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;
import com.facebook.messaging.livelocation.bindings.usernotice.LocationSharingUserNoticeBottomSheetFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.widget.CustomFrameLayout;
import java.util.ArrayList;

/* loaded from: LocationMapCardDialogFragment.class */
public final class LocationMapCardDialogFragment extends FullScreenDialogFragment {
    public static final Hkq A0D = new Object();
    public HB5 A00;
    public L4Y A01;
    public ThreadKey A02;
    public CustomFrameLayout A03;
    public String A04;
    public String A05;
    public 6KV A09;
    public final 1Br A0A = 1Bq.A00(85098);
    public final 1Br A0C = 1Bu.A00(65571);
    public final 1Br A0B = 1Bu.A02(this, 116201);
    public String A06 = "";
    public ArrayList A07 = AnonymousClass001.A0s();
    public ArrayList A08 = AnonymousClass001.A0s();

    public 1iF A17() {
        return AbF.A0C(1645341882290020L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Context context = getContext();
        if (context != null) {
            KyJ.A00(context, intent, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        11T.A0F(fragment, 0);
        if (fragment instanceof FbMapFragmentDelegate) {
            ((FbMapFragmentDelegate) fragment).A1P(new ITk(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-2078266274);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            i = 1700364057;
        } else {
            this.A06 = "";
            String string = bundle2.getString("placeId", "");
            11T.A0A(string);
            this.A05 = string;
            String string2 = bundle2.getString("title", "");
            if (string2 != null) {
                this.A06 = string2;
            }
            this.A04 = bundle2.getString("description");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("places");
            if (stringArrayList != null) {
                this.A08 = stringArrayList;
            }
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("coordinates");
            if (parcelableArrayList != null) {
                this.A07 = parcelableArrayList;
            }
            HB5 serializable = bundle2.getSerializable("locationMapEntryPoint");
            11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.livelocation.static_map.LocationMapCardEntryPoint");
            this.A00 = serializable;
            ThreadKey threadKey = (ThreadKey) bundle2.getParcelable("threadKey");
            if (threadKey != null) {
                this.A02 = threadKey;
            }
            if (this.A00 == HB5.A05 && getContext() != null && !((9Y4) 1Bn.A0A(67993)).A00()) {
                new LocationSharingUserNoticeBottomSheetFragment().A0m(getChildFragmentManager(), "LocationSharingUserNoticeBottomSheetFragment");
            }
            i = 299405084;
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        if (r0.length() == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.livelocation.static_map.LocationMapCardDialogFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        int A02 = 0FI.A02(1391850512);
        L4Y l4y = this.A01;
        if (l4y != null) {
            l4y.A00();
        }
        this.A01 = null;
        super.onDestroy();
        0FI.A08(-782032439, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1001727974);
        super.onDestroyView();
        6KV r0 = this.A09;
        if (r0 == null) {
            11T.A0L("viewOrientationLockHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A04();
        this.A03 = null;
        0FI.A08(653036633, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        6KV A00 = ((82O) 1Br.A0B(this.A0C)).A00(getContext());
        this.A09 = A00;
        A00.A02();
        if (getChildFragmentManager().A0Y(2131365437) == null) {
            MapOptions mapOptions = new MapOptions();
            mapOptions.A04 = KOh.A01;
            mapOptions.A05 = 0S2.A00;
            mapOptions.A08 = "messenger_location";
            mapOptions.A06 = "LocationMapCardDialogFragment";
            1pL fbMapFragmentDelegate = new FbMapFragmentDelegate();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("MAP_OPTIONS", mapOptions);
            fbMapFragmentDelegate.setArguments(A05);
            C06c A09 = AbJ.A09(this);
            A09.A0L(fbMapFragmentDelegate, 2131365437);
            A09.A04();
        }
    }
}
