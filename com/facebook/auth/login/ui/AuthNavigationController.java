package com.facebook.auth.login.ui;

import X.DZD;
import X.RDj;
import X.RKb;
import X.RoD;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableMap;

/* loaded from: AuthNavigationController.class */
public class AuthNavigationController extends DZD {
    public static final RDj A01 = new RDj(new RoD());
    public RKb A00;

    public void A1S(Bundle bundle) {
        AuthStateMachineConfig$ParcelableConfigInformation authStateMachineConfig$ParcelableConfigInformation;
        if (bundle != null && (authStateMachineConfig$ParcelableConfigInformation = (AuthStateMachineConfig$ParcelableConfigInformation) bundle.getParcelable("auth_state_machine_config")) != null) {
            this.A00 = new RKb(authStateMachineConfig$ParcelableConfigInformation, A01);
        }
        super.A1S(bundle);
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.Parcelable, com.facebook.auth.login.ui.AuthStateMachineConfig$ParcelableConfigInformation, java.lang.Object] */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RKb rKb = this.A00;
        ImmutableMap immutableMap = rKb.A01;
        Class cls = rKb.A02;
        ?? obj = new Object();
        obj.A00 = immutableMap;
        obj.A01 = cls;
        bundle.putParcelable("auth_state_machine_config", obj);
    }
}
