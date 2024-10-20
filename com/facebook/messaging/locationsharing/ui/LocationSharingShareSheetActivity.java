package com.facebook.messaging.locationsharing.ui;

import X.1BY;
import X.1Bn;
import X.7zU;
import X.AbK;
import X.AbL;
import X.AbstractC1522Aka;
import X.BLj;
import X.C06c;
import X.C0v;
import X.CIr;
import X.Co1;
import android.R;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: LocationSharingShareSheetActivity.class */
public class LocationSharingShareSheetActivity extends FbFragmentActivity {
    public AbstractC1522Aka A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof AbstractC1522Aka) {
            AbstractC1522Aka abstractC1522Aka = (AbstractC1522Aka) fragment;
            this.A00 = abstractC1522Aka;
            abstractC1522Aka.A00 = new Co1(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        String stringExtra = getIntent().getStringExtra(Property.SYMBOL_Z_ORDER_SOURCE);
        if (((C0v) 1Bn.A0E(this, (1BY) null, 83468)).A00(stringExtra) == null) {
            finish();
            return;
        }
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) getIntent().getSerializableExtra("params"));
        if (bundle == null) {
            ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("prepicked_users");
            ImmutableList of = arrayList == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) arrayList);
            C06c A0D = 7zU.A0D(this);
            CIr cIr = new CIr();
            cIr.A03(BLj.A0E);
            cIr.A0O = true;
            cIr.A0F = stringExtra;
            cIr.A03 = copyOf;
            cIr.A0W = true;
            A0D.A0M(AbstractC1522Aka.A03(new M4OmnipickerParam(cIr), of, null), R.id.content);
            C06c.A00(A0D, false);
        }
        AbK.A1D(this, A08);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AbstractC1522Aka abstractC1522Aka = this.A00;
        if (abstractC1522Aka == null) {
            super.onBackPressed();
        } else {
            abstractC1522Aka.A1X();
        }
    }
}
