package com.facebook.zero.internal;

import X.1BK;
import X.1iF;
import X.AnonymousClass001;
import X.C15h;
import X.DKE;
import X.DS4;
import X.G7K;
import X.Q4d;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.ArrayList;

/* loaded from: ZeroInternStatusActivity.class */
public class ZeroInternStatusActivity extends FbFragmentActivity {
    public ViewPager A00;
    public C15h A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = G7K.A01(this, ActionId.APP_MAIN);
        setContentView(2132543607);
        int i = 0;
        String[] strArr = {"normal", "dialtone"};
        ArrayList A0s = AnonymousClass001.A0s();
        int i2 = 0;
        do {
            String str = strArr[i2];
            Q4d q4d = new Q4d();
            Bundle A05 = 1BK.A05();
            A05.putString("zero_token_type", str);
            q4d.setArguments(A05);
            A0s.add(q4d);
            i2++;
        } while (i2 < 2);
        ViewPager viewPager = (ViewPager) findViewById(2131366271);
        this.A00 = viewPager;
        viewPager.A0R(new DS4(BDe(), this, A0s));
        C15h c15h = this.A01;
        c15h.getClass();
        Object obj = c15h.get();
        while (!strArr[i].equals(obj)) {
            i++;
            if (i >= 2) {
                return;
            }
        }
        this.A00.A0K(i);
    }
}
