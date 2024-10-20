package com.facebook.runtimepermissions;

import X.1Bi;
import X.1Bn;
import X.1Rv;
import X.53T;
import X.7zK;
import X.AbF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2xd;
import X.C5iw;
import X.IgF;
import X.InterfaceC03733yw;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: RequestPermissionsActivity.class */
public class RequestPermissionsActivity extends FbFragmentActivity implements InterfaceC03733yw {
    public 53T A00;
    public String[] A01;
    public C2xd A02;
    public final 1Rv A03 = (1Rv) 1Bi.A03(67262);

    public static void A12(Integer num, Map map, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            map.put(strArr[i2], num);
            i = i2 + 1;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        int length;
        super.A2y(bundle);
        C2xd c2xd = (C2xd) 1Bn.A0A(306);
        this.A02 = c2xd;
        c2xd.getClass();
        this.A00 = c2xd.A0M(this);
        String[] stringArray = bundle != null ? bundle.getStringArray("key_permissions") : getIntent().getStringArrayExtra(7zK.A00(303));
        this.A01 = stringArray;
        if (stringArray == null || (length = stringArray.length) <= 0) {
            HashMap A0u = AnonymousClass001.A0u();
            Intent A05 = AbF.A05();
            A05.putExtra("extra_permission_results", A0u);
            setResult(-1, A05);
            finish();
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        do {
            String str = stringArray[i];
            if (!this.A03.A08(str)) {
                A0s.add(str);
            }
            i++;
        } while (i < length);
        String[] A0b = AnonymousClass002.A0b(A0s);
        Intent intent = getIntent();
        RequestPermissionsConfig requestPermissionsConfig = (RequestPermissionsConfig) intent.getParcelableExtra(7zK.A00(304));
        if (requestPermissionsConfig == null) {
            boolean booleanExtra = intent.getBooleanExtra("extra_should_show_rationale", true);
            String stringExtra = intent.getStringExtra("extra_custom_title");
            String stringExtra2 = intent.getStringExtra("extra_custom_subtitle");
            C5iw c5iw = new C5iw();
            c5iw.A04 = stringExtra;
            c5iw.A00(stringExtra2);
            int i2 = 0;
            if (booleanExtra) {
                i2 = 2;
            }
            c5iw.A00 = Integer.valueOf(i2);
            requestPermissionsConfig = new RequestPermissionsConfig(c5iw);
        }
        this.A00.AHQ(requestPermissionsConfig, new IgF(this, 2), A0b);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArray("key_permissions", this.A01);
    }
}
