package com.facebook.auth.login.ui;

import X.0Pz;
import X.1BJ;
import X.1BK;
import X.7zR;
import X.AbH;
import X.C00i;
import X.F8h;
import X.GE4;
import X.RKb;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.base.fragment.AbstractNavigableFragment;

/* loaded from: AuthFragmentBase.class */
public abstract class AuthFragmentBase extends AbstractNavigableFragment implements GE4 {
    public RKb A00;
    public Class A01;
    public final C00i A02 = AbH.A0D();

    public void A1S(Bundle bundle) {
        if (bundle != null) {
            try {
                this.A01 = Class.forName(bundle.getString("viewClassName"));
            } catch (Exception unused) {
                this.A01 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View A1a(Class cls) {
        try {
            Class cls2 = this.A01;
            if (cls2 == null) {
                cls2 = AnN().A01;
                this.A01 = cls2;
            }
            View view = (View) cls2.getConstructor(Context.class, cls).newInstance(getContext(), this);
            7zR.A11(view);
            return view;
        } catch (Exception e) {
            String A00 = 1BJ.A00(886);
            Class cls3 = this.A01;
            throw 1BK.A0s(0Pz.A0W(A00, cls3 != null ? cls3.getName() : "<unknown class>"), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1b() {
        RKb rKb = this.A00;
        if (rKb == null) {
            rKb = ((AuthNavigationController) requireParentFragment()).A00;
            this.A00 = rKb;
        }
        Intent intent = new F8h(rKb.A02).A00;
        intent.putExtra("com.facebook.fragment.CLEAR_BACK_STACK", true);
        A1Y(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GE4
    public AuthFragmentConfig AnN() {
        RKb rKb = this.A00;
        if (rKb == null) {
            rKb = ((AuthNavigationController) requireParentFragment()).A00;
            this.A00 = rKb;
        }
        return (AuthFragmentConfig) rKb.A01.get(getClass().getCanonicalName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        super.onAttach(context);
        requireParentFragment();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Class cls = this.A01;
        if (cls != null) {
            bundle.putString("viewClassName", cls.getCanonicalName());
        }
    }
}
