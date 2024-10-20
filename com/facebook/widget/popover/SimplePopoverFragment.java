package com.facebook.widget.popover;

import X.0D2;
import X.0FI;
import X.0S2;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1lZ;
import X.1tJ;
import X.2Ov;
import X.4YU;
import X.5TJ;
import X.5TL;
import X.7tR;
import X.AnonymousClass001;
import X.C00i;
import X.C5ed;
import X.C7qZ;
import X.F6w;
import X.H0W;
import X.H59;
import X.H5A;
import X.H61;
import X.HFt;
import X.Iul;
import X.Ium;
import X.RHX;
import X.RkG;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.messaging.profile.ProfilePopoverFragment;
import com.google.common.collect.ImmutableSet;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: SimplePopoverFragment.class */
public abstract class SimplePopoverFragment extends 2Ov implements 5TJ {
    public int A00;
    public int A01;
    public H59 A02;
    public Runnable A03;
    public Runnable A04;
    public H5A A06;
    public HFt A07;
    public final C00i A0A = 1BQ.A00();
    public final C00i A08 = 1BQ.A02(16387);
    public final C00i A0D = 1BQ.A02(49736);
    public final C00i A0B = 1BQ.A02(16766);
    public final C00i A0C = 1BQ.A02(16973);
    public boolean A05 = true;
    public final C00i A09 = 1BV.A00(16430);

    public int A0l() {
        int i;
        if (this instanceof ProfilePopoverFragment) {
            i = 2132607843;
        } else {
            i = 2132607798;
            if (this.A05) {
                return 2132607794;
            }
        }
        return i;
    }

    public Dialog A0n(Bundle bundle) {
        return new H0W(this);
    }

    public HFt A1C() {
        ProfilePopoverFragment profilePopoverFragment = (ProfilePopoverFragment) this;
        HFt hFt = profilePopoverFragment.A02;
        if (hFt == null) {
            hFt = new H61(profilePopoverFragment);
            profilePopoverFragment.A02 = hFt;
        }
        return hFt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.7qZ] */
    public C7qZ AVt(F6w f6w) {
        final HashMap A0u = AnonymousClass001.A0u();
        final WeakReference weakReference = new WeakReference(requireView().getRootView());
        final ImmutableSet immutableSet = null;
        return new Object(immutableSet, weakReference, A0u) { // from class: X.7qZ
            public final ImmutableSet A00;
            public final WeakReference A01;
            public final java.util.Map A02;

            {
                this.A02 = A0u;
                this.A01 = weakReference;
                this.A00 = immutableSet;
            }
        };
    }

    public boolean Bkd() {
        Window window;
        if (this.A05) {
            this.A02.A0V(1BK.A0N(this.A0A).AZk(36310860427298163L) ? 0S2.A0N : 0S2.A01, 0);
            return true;
        }
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getAttributes().windowAnimations = this.A01;
        }
        A0o();
        return true;
    }

    public String getName() {
        return "chromeless:content:fragment:tag";
    }

    public void onCancel(DialogInterface dialogInterface) {
        A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(82750325);
        super.onCreate(bundle);
        this.A07 = A1C();
        if (!this.A05) {
            this.A04 = new Iul(this);
            C00i c00i = this.A09;
            4YU.A0G(c00i).post(this.A04);
            this.A03 = new Ium(this);
            4YU.A0G(c00i).postDelayed(this.A03, 425L);
        }
        0FI.A08(1972277104, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        H59 h59;
        int i;
        int A02 = 0FI.A02(-528415122);
        ((5TL) this.A0D.get()).A04.A03(this);
        H59 h592 = new H59(getContext());
        h592.A05 = this.A07;
        h592.A06 = 7tR.A00;
        this.A02 = h592;
        C00i c00i = this.A0A;
        if (1BK.A0N(c00i).AZk(36310860427298163L)) {
            if (1BK.A0N(c00i).AZk(36310860427363700L)) {
                ((C5ed) 4YU.A0p(this.A02.A04)).A04 = 0;
            }
            H5A h5a = new H5A(getContext());
            this.A06 = h5a;
            h5a.addView(this.A02);
            H5A h5a2 = this.A06;
            h5a2.A07 = true;
            h5a2.A05 = new RHX(this);
            i = -1688313139;
            h59 = h5a2;
        } else {
            h59 = this.A02;
            i = 440269285;
        }
        0FI.A08(i, A02);
        return h59;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-79876858);
        super.onDestroy();
        ((5TL) this.A0D.get()).A04.A04(this);
        if (this.A04 != null) {
            4YU.A0G(this.A09).removeCallbacks(this.A04);
        }
        if (this.A03 != null) {
            4YU.A0G(this.A09).removeCallbacks(this.A03);
        }
        0FI.A08(-156282667, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1204264727);
        super/*androidx.fragment.app.Fragment*/.onResume();
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && dialog.getWindow() != null) {
            ((0D2) this).A01.getWindow().getAttributes().windowAnimations = 0;
        }
        0FI.A08(-621761368, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        Window window;
        int A02 = 0FI.A02(21963309);
        super/*X.0D2*/.onStart();
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            1tJ.A09(window, false);
            window.clearFlags(67108864);
            1tJ.A06(window, getActivity().getColor(2132214289));
            int i = this.A00;
            if (i == 0) {
                window.addFlags(2);
                window.setDimAmount(0.7f);
            } else if (i == 2) {
                window.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1291845632, -16777216}));
            }
            this.A01 = window.getAttributes().windowAnimations;
        }
        if (this.A05) {
            H59 h59 = this.A02;
            boolean AZk = 1BK.A0N(this.A0A).AZk(36310860427298163L);
            if (!h59.A08) {
                h59.A08 = true;
                Context context = h59.getContext();
                Animation loadAnimation = AnimationUtils.loadAnimation(context, 1lZ.A00(context, AZk ? 0S2.A00 : 0S2.A0Y));
                loadAnimation.setAnimationListener(new RkG(h59));
                h59.A03.startAnimation(loadAnimation);
            }
        }
        0FI.A08(-619545821, A02);
    }
}
