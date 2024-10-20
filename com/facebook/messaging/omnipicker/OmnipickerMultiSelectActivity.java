package com.facebook.messaging.omnipicker;

import X.7zU;
import X.AbK;
import X.AbL;
import X.AbstractC1522Aka;
import X.C06c;
import X.Co2;
import android.R;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: OmnipickerMultiSelectActivity.class */
public class OmnipickerMultiSelectActivity extends FbFragmentActivity {
    public AbstractC1522Aka A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof AbstractC1522Aka) {
            AbstractC1522Aka abstractC1522Aka = (AbstractC1522Aka) fragment;
            this.A00 = abstractC1522Aka;
            abstractC1522Aka.A00 = new Co2(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        if (bundle == null) {
            M4OmnipickerParam m4OmnipickerParam = (M4OmnipickerParam) getIntent().getParcelableExtra("omnipicker_param");
            ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("prepicked_users");
            ImmutableList of = arrayList == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) arrayList);
            C06c A0D = 7zU.A0D(this);
            A0D.A0M(AbstractC1522Aka.A03(m4OmnipickerParam, of, null), R.id.content);
            C06c.A00(A0D, false);
        }
        AbK.A1D(this, A08);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Aka] */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ?? r0 = this.A00;
        if (r0 == 0 || !r0.isAdded()) {
            super.onBackPressed();
        } else {
            r0.A1X();
        }
    }
}
