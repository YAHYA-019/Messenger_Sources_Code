package com.facebook.messaging.groups.create;

import X.0D2;
import X.0FI;
import X.1BK;
import X.1iF;
import X.2Ov;
import X.AbG;
import X.AbJ;
import X.AlM;
import X.Bhf;
import X.C06c;
import X.FKF;
import X.Rq9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.groups.create.model.CreateGroupFragmentParams;

/* loaded from: CreateGroupFragmentDialog.class */
public class CreateGroupFragmentDialog extends 2Ov {
    public AlM A00;
    public CreateGroupFragmentParams A01;
    public Bhf A02;

    public 1iF A17() {
        return AbJ.A0D();
    }

    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof AlM) {
            AlM alM = (AlM) fragment;
            this.A00 = alM;
            alM.A07 = new Rq9(this);
            alM.A0J = this.A02;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(979532634);
        super.onCreate(bundle);
        CreateGroupFragmentParams createGroupFragmentParams = (CreateGroupFragmentParams) this.mArguments.getParcelable("create_group_fragment_params");
        this.A01 = createGroupFragmentParams;
        int i = 2132608356;
        if (createGroupFragmentParams.A0N) {
            i = 2132608357;
        }
        A0g(0, i);
        0FI.A08(2017533091, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(625978786);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542640);
        0FI.A08(29695413, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-905103555);
        super/*androidx.fragment.app.Fragment*/.onResume();
        ((0D2) this).A01.setOnKeyListener(new FKF(this, 4));
        0FI.A08(909272437, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        if (getChildFragmentManager().A0b("msgr_create_group_fragment") == null) {
            C06c A09 = AbJ.A09(this);
            CreateGroupFragmentParams createGroupFragmentParams = this.A01;
            AlM alM = new AlM();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("create_group_fragment_params", createGroupFragmentParams);
            alM.setArguments(A05);
            AbJ.A1J(A09, alM, "msgr_create_group_fragment", 2131364386);
        }
    }
}
