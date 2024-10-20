package com.facebook.messaging.nativepagereply.plugins.accountswitchhalfsheet.businessinboxprofileshortcut;

import X.06Z;
import X.11T;
import X.1Bi;
import X.1Bu;
import X.BKV;
import X.C01s;
import X.C06c;
import X.C0D1;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: BusinessInboxProfileShortcutHandlerImplementation.class */
public final class BusinessInboxProfileShortcutHandlerImplementation {
    public final Context A00;

    public BusinessInboxProfileShortcutHandlerImplementation(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public static final void A00(06Z r301) {
        Fragment A0b;
        11T.A0F(r301, 0);
        if (!C0D1.A01(r301) || (A0b = r301.A0b("BusinessInboxProfileShortcutHandlerImplementation")) == null) {
            return;
        }
        C06c c06c = new C06c(r301);
        c06c.A0I(A0b);
        c06c.A04();
    }

    public static final boolean A01(06Z r301, BusinessInboxProfileShortcutHandlerImplementation businessInboxProfileShortcutHandlerImplementation) {
        if (r301.A1U() || r301.A0B) {
            ((C01s) 1Bi.A03(16511)).D0v("BusinessInboxProfileShortcutHandlerImplementation", "Account switch half sheet opened after state saved or activity destroyed.");
            return false;
        }
        MigColorScheme migColorScheme = (MigColorScheme) 1Bu.A06(businessInboxProfileShortcutHandlerImplementation.A00, 16979);
        BKV bkv = new BKV();
        bkv.A03 = migColorScheme;
        if (!bkv.isAdded()) {
            bkv.A0m(r301, "BusinessInboxProfileShortcutHandlerImplementation");
            return true;
        }
        View view = bkv.mView;
        if (view == null) {
            return true;
        }
        view.invalidate();
        return true;
    }
}
