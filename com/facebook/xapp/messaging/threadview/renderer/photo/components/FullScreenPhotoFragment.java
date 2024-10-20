package com.facebook.xapp.messaging.threadview.renderer.photo.components;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1iF;
import X.2Ov;
import X.5mF;
import X.7Tm;
import X.7zL;
import X.7zP;
import X.7zR;
import X.8DD;
import X.8SK;
import X.8oF;
import X.9M2;
import X.9MT;
import X.9Q6;
import X.AnonymousClass001;
import X.C5ft;
import X.C5g2;
import X.LRB;
import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: FullScreenPhotoFragment.class */
public final class FullScreenPhotoFragment extends 2Ov {
    public 1Iw A00;
    public ThreadKey A01;
    public C5ft A03;
    public FullScreenPhotoParams A05;
    public 8DD A06;
    public 9Q6 A07;
    public boolean A08;
    public 9MT A04 = new 9MT(this);
    public 7Tm A02 = new Object();
    public final 9M2 A09 = new 9M2();

    public 1iF A17() {
        return new 1iF(195771409088126L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        String str;
        int A02 = 0FI.A02(1943285038);
        super.onCreate(bundle);
        A0g(0, R.style.Theme.Black.NoTitleBar);
        this.A00 = 7zP.A0T(this);
        if (bundle != null) {
            if (bundle.getParcelable("photo_params") != null) {
                this.A05 = (FullScreenPhotoParams) bundle.getParcelable("photo_params");
            }
            if (bundle.getBoolean("screenshot_params")) {
                this.A08 = bundle.getBoolean("screenshot_params");
            }
        }
        8DD r0 = new ViewModelProvider((ViewModelStoreOwner) this, (ViewModelProvider.Factory) new LRB(1)).get(8DD.class);
        this.A06 = r0;
        if (bundle != null) {
            if (r0 == null) {
                str = "viewModel";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            if (r0.A00 == null) {
                A0o();
            }
            0FI.A08(1103618370, A02);
            return;
        }
        str = "viewModel";
        if (r0 != null) {
            r0.A02 = this.A03;
            r0.A00 = this.A01;
            r0.A03 = this.A05;
            7Tm r02 = this.A02;
            11T.A0F(r02, 0);
            r0.A01 = r02;
            0FI.A08(1103618370, A02);
            return;
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        8oF r309;
        String str;
        int A02 = 0FI.A02(520848451);
        FullScreenPhotoParams fullScreenPhotoParams = this.A05;
        if (fullScreenPhotoParams != null) {
            Bundle bundle2 = fullScreenPhotoParams.A00;
            1Iw r0 = this.A00;
            LinkedHashMap linkedHashMap = null;
            if (r0 == null) {
                str = "componentContext";
            } else {
                8SK r02 = new 8SK(r0, new 8oF());
                9MT r03 = this.A04;
                r309 = r02.A01;
                r309.A04 = r03;
                r309.A00 = this;
                BitSet bitSet = r02.A02;
                bitSet.set(1);
                r309.A0B = fullScreenPhotoParams.A07;
                r309.A06 = fullScreenPhotoParams.A01;
                bitSet.set(3);
                r309.A07 = fullScreenPhotoParams.A02;
                bitSet.set(4);
                r309.A08 = fullScreenPhotoParams.A03;
                bitSet.set(5);
                r309.A09 = fullScreenPhotoParams.A04;
                C5ft c5ft = this.A03;
                r309.A0C = (c5ft == null || (c5ft.AxW(5mF.A00) == null && c5ft.AxW(C5g2.A00) == null)) ? false : true;
                bitSet.set(2);
                8DD r04 = this.A06;
                str = "viewModel";
                if (r04 != null) {
                    r309.A02 = r04.A01;
                    bitSet.set(0);
                    r309.A0D = fullScreenPhotoParams.A06;
                    r309.A0E = fullScreenPhotoParams.A05;
                    r309.A05 = this.A07;
                    if (bundle2 != null) {
                        linkedHashMap = 1BK.A1C();
                        Set<String> keySet = bundle2.keySet();
                        11T.A0A(keySet);
                        Iterator<String> it = keySet.iterator();
                        while (it.hasNext()) {
                            String A0i = AnonymousClass001.A0i(it);
                            Object obj = bundle2.get(A0i);
                            if (obj != null) {
                                11T.A0D(A0i);
                                linkedHashMap.put(A0i, obj);
                            }
                        }
                    }
                    r309.A0A = linkedHashMap;
                    8DD r05 = this.A06;
                    if (r05 != null) {
                        C5ft c5ft2 = r05.A02;
                        ThreadKey threadKey = r05.A00;
                        if (c5ft2 != null) {
                            r309.A03 = c5ft2;
                            r309.A01 = threadKey;
                        }
                        7zP.A15(r02, bitSet, r02.A03);
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        0fH.A0o("FullScreenPhotoFragment", "Fullscreen photo fragment has null params");
        r309 = 7zL.A0Y();
        1Iw r06 = this.A00;
        if (r06 == null) {
            11T.A0L("componentContext");
            throw 0Q8.createAndThrow();
        }
        LithoView A04 = LithoView.A04(r06, ComponentTree.A01(r309, r06, null).A00());
        7zR.A11(A04);
        0FI.A08(1779519309, A02);
        return A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(320897364);
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(2028714894, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1426754224);
        if (this.A08) {
            9M2 r0 = this.A09;
            Dialog dialog = ((0D2) this).A01;
            r0.A00.A02(dialog != null ? dialog.getWindow() : null);
        }
        super/*androidx.fragment.app.Fragment*/.onResume();
        0FI.A08(-1398644137, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        FullScreenPhotoParams fullScreenPhotoParams = this.A05;
        if (fullScreenPhotoParams != null) {
            bundle.putParcelable("photo_params", fullScreenPhotoParams);
        }
        bundle.putBoolean("screenshot_params", this.A08);
    }

    public void onStart() {
        int A02 = 0FI.A02(1894107046);
        super/*X.0D2*/.onStart();
        0FI.A08(1463044648, A02);
    }
}
