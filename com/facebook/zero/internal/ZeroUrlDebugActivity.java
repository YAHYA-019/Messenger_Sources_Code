package com.facebook.zero.internal;

import X.1BK;
import X.1BQ;
import X.1iF;
import X.4YU;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AnonymousClass001;
import X.C00i;
import X.C40a;
import X.IKB;
import X.RCn;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

/* loaded from: ZeroUrlDebugActivity.class */
public class ZeroUrlDebugActivity extends FbFragmentActivity {
    public C00i A00;
    public C00i A01;
    public final C00i A02 = 1BQ.A02(32859);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(453586272481763L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        int i;
        super.A2y(bundle);
        this.A00 = AbH.A0S();
        this.A01 = AbI.A0J(this);
        setContentView(2132543604);
        TextView textView = (TextView) A2c(2131362714);
        TextView textView2 = (TextView) A2c(2131366959);
        if (1BK.A1T((FbSharedPreferences) 4YU.A0p(this.A00), C40a.A02)) {
            textView.setText("Disable HTTP Logs");
            i = 78;
        } else {
            textView.setText("Enable HTTP Logs");
            i = 79;
        }
        IKB.A00(textView, this, i);
        StringBuilder A0k = AnonymousClass001.A0k();
        C00i c00i = this.A02;
        Iterator it = ((C40a) c00i.get()).A01.iterator();
        while (it.hasNext()) {
            A0k.append(AnonymousClass001.A0i(it));
            A0k.append("\n");
        }
        textView2.setText(A0k.toString(), TextView.BufferType.SPANNABLE);
        String obj = A0k.toString();
        Spannable spannable = (Spannable) textView2.getText();
        Iterator it2 = ((C40a) c00i.get()).A01.iterator();
        while (it2.hasNext()) {
            String A0i = AnonymousClass001.A0i(it2);
            try {
                URI uri = new URI(A0i);
                String[] strArr = RCn.A00;
                int i2 = 0;
                while (true) {
                    if (uri.getHost().matches(strArr[i2])) {
                        int indexOf = obj.indexOf(A0i);
                        while (true) {
                            int i3 = indexOf;
                            if (i3 >= 0) {
                                spannable.setSpan(new ForegroundColorSpan(Color.argb(255, 87, 25, ActionId.FAIL_FILE_TOO_LARGE)), i3, A0i.length() + i3, 33);
                                indexOf = obj.indexOf(A0i, i3 + 1);
                            }
                        }
                    } else {
                        i2++;
                        if (i2 < 22) {
                        }
                    }
                }
            } catch (URISyntaxException unused) {
            }
        }
        textView2.setText(spannable);
    }
}
