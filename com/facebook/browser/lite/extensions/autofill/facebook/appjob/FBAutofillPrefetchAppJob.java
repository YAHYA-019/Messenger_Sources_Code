package com.facebook.browser.lite.extensions.autofill.facebook.appjob;

import X.04J;
import X.0D7;
import X.0DA;
import X.11T;
import X.1BP;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.1GD;
import X.1UD;
import X.1ZG;
import X.2R2;
import X.AbstractC11374wb;
import X.AbstractC11504wo;
import X.C01g;
import X.C11384wc;
import X.C11474wl;
import X.C11494wn;
import X.EnumC11364wa;
import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.HashSet;

/* loaded from: FBAutofillPrefetchAppJob.class */
public final class FBAutofillPrefetchAppJob {
    public final 1BP A01 = FbInjector.A00;
    public final 1Br A00 = 1Bq.A00(16634);

    public static void A00(04J r301, String str, String str2) {
        2R2 A02 = 2R2.A02(r301);
        if (((0D7) A02).A00.isSampled()) {
            0DA r0 = new 0DA();
            r0.A07("app_job_name", "prefetch");
            r0.A07("app_job_action", str);
            r0.A07("app_job_id", str2);
            A02.A0A(r0, "event_payload");
            A02.BZL();
        }
    }

    public final void A01() {
        Context context = FbInjector.A03;
        11T.A0A(context);
        C11474wl A00 = AbstractC11374wb.A00(context, EnumC11364wa.A02, "autofill_prefetch_job_with_no_iab_session_id", null, new HashSet(), new HashSet(), false);
        1Bn.A0A(131198);
        11T.A0A(FbInjector.A03);
        1UD r0 = (04J) this.A00.A00.get();
        11T.A0F(r0, 2);
        C01g.A01(C11494wn.A00);
        String A01 = AbstractC11504wo.A01();
        1UD r02 = r0;
        1ZG r03 = 1ZG.A01;
        2R2 r04 = new 2R2(1UD.A00(r02, r03, "client_execute_autofillappjob_init"), 48);
        if (((0D7) r04).A00.isSampled()) {
            0DA r05 = new 0DA();
            r05.A07("app_job_name", "prefetch");
            r05.A07("app_job_action", "do_prefetch");
            r05.A07("app_job_id", A01);
            r04.A0A(r05, "event_payload");
            r04.BZL();
        }
        C11384wc c11384wc = A00.A04;
        1CO r06 = c11384wc.A00;
        if (r06.AZk(36311839668702740L) || r06.AZr(1GD.A07, 36311839668768277L)) {
            A00(r0, "prefetch_contact_usage", A01);
        }
        if (c11384wc.A05()) {
            A00(r0, "prefetch_contact_save", A01);
        }
        if (c11384wc.A06()) {
            A00(r0, "prefetch_payment_save", A01);
        }
        if (c11384wc.A07()) {
            A00(r0, "prefetch_payment_usage", A01);
        }
        2R2 r07 = new 2R2(1UD.A00(r02, r03, "client_execute_autofillappjob_success"), 49);
        if (((0D7) r07).A00.isSampled()) {
            0DA r08 = new 0DA();
            r08.A07("app_job_name", "prefetch");
            r08.A07("app_job_action", "do_prefetch");
            r08.A07("app_job_id", A01);
            r07.A0A(r08, "event_payload");
            r07.BZL();
        }
    }
}
