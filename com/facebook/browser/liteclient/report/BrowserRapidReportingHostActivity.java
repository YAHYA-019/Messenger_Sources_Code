package com.facebook.browser.liteclient.report;

import X.1BK;
import X.1BL;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Ql;
import X.1iF;
import X.4YV;
import X.AbF;
import X.AbH;
import X.AnonymousClass001;
import X.BoA;
import X.C00i;
import X.C2221Dhd;
import X.EUs;
import X.ExF;
import X.F6X;
import X.FJ8;
import X.Fzd;
import X.G5a;
import X.GIc;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.rapidreporting.model.DialogConfig;
import com.facebook.rapidreporting.model.DialogStateData;
import java.util.List;

/* loaded from: BrowserRapidReportingHostActivity.class */
public class BrowserRapidReportingHostActivity extends FbFragmentActivity implements GIc {
    public C2221Dhd A00;
    public String A01;
    public String A02;
    public String A03;
    public EUs A04;
    public F6X A05;
    public ExF A06;
    public final C00i A09 = AbH.A0S();
    public final C00i A07 = 1BV.A00(82329);
    public final C00i A08 = AbH.A0a();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(718770159051174L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A06 = (ExF) 1Bn.A0E(this, (1BY) null, 98802);
        this.A05 = (F6X) 1Bn.A0E(this, (1BY) null, 98444);
        this.A04 = (EUs) 1Bn.A0A(98695);
        1Ql A0V = 1BL.A0V(this.A09);
        A0V.CaH(((BoA) this.A07.get()).A01, 1BL.A08(this.A08));
        A0V.commit();
        this.A02 = getIntent().getStringExtra("report_id");
        this.A03 = getIntent().getStringExtra("screenshot_uri");
        this.A01 = getIntent().getStringExtra("html_source_uri");
        this.A00 = (C2221Dhd) FJ8.A03(getIntent().getExtras(), "reporting_prompt");
        this.A04.getClass();
        DialogStateData dialogStateData = new DialogStateData(new DialogConfig(this, "MARK_AS_SUSPICIOUS_BUTTON", "in_app_browser", null));
        C2221Dhd c2221Dhd = this.A00;
        c2221Dhd.getClass();
        dialogStateData.A02(c2221Dhd);
        ExF exF = this.A06;
        exF.getClass();
        exF.A01(this, dialogStateData);
    }

    @Override // X.GIc
    public void COt(List list) {
        FbUserSession A0D = 4YV.A0D(this);
        F6X f6x = this.A05;
        f6x.getClass();
        String str = this.A02;
        str.getClass();
        String str2 = this.A03;
        String str3 = this.A01;
        if (1BK.A0N(f6x.A05).AZk(36314846135853314L)) {
            1BK.A1E(f6x.A04).execute(new G5a(A0D, f6x, str, str2, str3));
        }
        this.A04.getClass();
        this.A04.getClass();
        AnonymousClass001.A07().postDelayed(new Fzd(this), 400L);
    }

    @Override // X.GIc
    public void onCancel() {
        this.A04.getClass();
        this.A04.getClass();
        AnonymousClass001.A07().postDelayed(new Fzd(this), 400L);
    }
}
