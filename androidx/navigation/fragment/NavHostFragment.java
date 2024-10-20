package androidx.navigation.fragment;

import X.0AI;
import X.0AK;
import X.0FI;
import X.11T;
import X.1BJ;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C01i;
import X.C06c;
import X.JR4;
import X.KcT;
import X.KcU;
import X.M6B;
import X.M6C;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: NavHostFragment.class */
public class NavHostFragment extends Fragment {
    public int A00;
    public View A01;
    public boolean A02;
    public final C01i A03 = JR4.A01(this, 21);

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        if (this.A02) {
            C06c c06c = new C06c(getParentFragmentManager());
            c06c.A0J(this);
            c06c.A04();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(790983267);
        this.A03.getValue();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.A02 = true;
            C06c c06c = new C06c(getParentFragmentManager());
            c06c.A0J(this);
            c06c.A04();
        }
        super.onCreate(bundle);
        0FI.A08(-1007324016, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1833111976);
        11T.A0F(layoutInflater, 0);
        Context context = layoutInflater.getContext();
        11T.A0A(context);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.mFragmentId;
        if (i == 0 || i == -1) {
            i = 2131365939;
        }
        fragmentContainerView.setId(i);
        0FI.A08(171836467, A02);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = 0FI.A02(-34808896);
        super.onDestroyView();
        View view = this.A01;
        if (view != null) {
            Object A022 = 0AI.A02(0AI.A06(M6C.A00, 0AK.A0A(view, M6B.A00)));
            if (A022 == null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("View ");
                A0k.append(view);
                throw AnonymousClass002.A0F(" does not have a NavController set", A0k);
            }
            if (A022 == this.A03.getValue()) {
                view.setTag(2131365934, null);
            }
        }
        this.A01 = null;
        0FI.A08(-459550580, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        boolean A1X = 1BL.A1X(context, attributeSet);
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, KcT.A01);
        11T.A0A(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.A00 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, KcU.A02);
        11T.A0A(obtainStyledAttributes2);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.A02 = A1X;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        if (this.A02) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        if (!(view instanceof ViewGroup)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("created host view ");
            A0k.append(view);
            throw AnonymousClass002.A0F(" is not a ViewGroup", A0k);
        }
        C01i c01i = this.A03;
        view.setTag(2131365934, c01i.getValue());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            11T.A0I(parent, 1BJ.A00(4));
            View view2 = (View) parent;
            this.A01 = view2;
            11T.A0D(view2);
            if (view2.getId() == this.mFragmentId) {
                View view3 = this.A01;
                11T.A0D(view3);
                Object value = c01i.getValue();
                11T.A0F(view3, 0);
                view3.setTag(2131365934, value);
            }
        }
    }
}
