package com.facebook.messaging.bugreporter.plugins.threadsettings.reportbugmenuitem;

import X.0fH;
import X.11T;
import X.1BK;
import X.1Bi;
import X.4YT;
import X.5TL;
import X.AbstractC00603o4;
import X.AnonymousClass016;
import X.BNV;
import X.C7I;
import X.DHb;
import X.EPO;
import X.FFg;
import X.GHs;
import X.IDL;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: ReportBugMenuItemImplementation.class */
public final class ReportBugMenuItemImplementation {
    public static final C7I A00() {
        return new C7I(BNV.A1w, 2131964403);
    }

    public final void A01(Context context, DHb dHb) {
        Bitmap bitmap;
        11T.A0F(dHb, 1);
        Context A00 = AnonymousClass016.A00(context, Activity.class);
        if (A00 != null) {
            5TL r0 = (5TL) 1Bi.A03(49736);
            ArrayList A04 = ((IDL) r0.A0K.get()).A04(A00, (WeakReference) null, (ArrayList) null);
            boolean z = false;
            if (!A04.isEmpty() && (bitmap = (Bitmap) A04.get(0)) != null) {
                try {
                    FileOutputStream openFileOutput = A00.openFileOutput("temp_setting_screenshot.png", 0);
                    z = ((GHs) r0.A0J.get()).AH5(bitmap, openFileOutput);
                    openFileOutput.close();
                    bitmap.recycle();
                } catch (Exception e) {
                    0fH.A0p(AbstractC00603o4.A00(13), "Attempting to save temporary screenshot failed.", e);
                }
                if (z) {
                    Bundle A05 = 1BK.A05();
                    A05.putString(4YT.A00(272), "temp_setting_screenshot.png");
                    dHb.CQ5(ActionId.LEGACY_MARKER, A05);
                    FFg fFg = (FFg) 1Bi.A03(100325);
                    EPO epo = EPO.A0R;
                    fFg.A03(epo);
                    FFg.A01(fFg, "bug_reporter_triggered", FFg.A00(epo));
                    return;
                }
            }
        }
        dHb.CQ4(ActionId.LEGACY_MARKER);
    }
}
