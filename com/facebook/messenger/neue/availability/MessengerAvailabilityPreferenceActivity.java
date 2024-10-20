package com.facebook.messenger.neue.availability;

import X.1BJ;
import X.1BQ;
import X.1BV;
import X.1Br;
import X.1Lo;
import X.1X6;
import X.4YU;
import X.4YV;
import X.7NS;
import X.7NT;
import X.7zL;
import X.AbI;
import X.AbL;
import X.C00i;
import X.Grd;
import X.HR7;
import X.HbB;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* loaded from: MessengerAvailabilityPreferenceActivity.class */
public class MessengerAvailabilityPreferenceActivity extends MessengerSettingActivity {
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public final C00i A05 = 1BQ.A02(67984);

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A04 = 1BV.A00(116335);
        this.A01 = 7zL.A0R(this, 65953);
        this.A02 = 7zL.A0R(this, 65917);
        this.A03 = 1BV.A00(116332);
        this.A00 = 1Lo.A00(this, A08, 116333);
        String stringExtra = getIntent().getStringExtra(UserFlowLoggerImpl.SOURCE_ANNOTATION);
        if (bundle == null) {
            C00i c00i = this.A04;
            c00i.getClass();
            c00i.get();
            HbB hbB = (HbB) 4YU.A0p(this.A00);
            if (stringExtra == null) {
                stringExtra = "unknown";
            }
            boolean A07 = ((1X6) this.A05.get()).A07();
            boolean AZk = 1Br.A07(((HR7) 4YU.A0p(this.A03)).A00).AZk(36314536900173842L);
            boolean A00 = ((7NT) 4YU.A0p(this.A02)).A00();
            boolean A002 = ((7NS) 4YU.A0p(this.A01)).A00();
            1Br r0 = hbB.A01;
            hbB.A00 = 4YV.A0Z(r0).generateNewFlowId(91372485);
            AbI.A1U(4YV.A0Z(r0), stringExtra, hbB.A00, false);
            4YV.A0Z(r0).markPointWithEditor(hbB.A00, "enter_setting").addPointData(1BJ.A00(94), A07).addPointData("is_copresence_toggle_enabled", AZk).addPointData("copresence_user_pref", A00).addPointData("is_copresence_allowed", A002).markerEditingCompleted();
        }
        A3B();
        A3C(new Grd());
        setTitle(2131963565);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        HbB hbB = (HbB) 4YU.A0p(this.A00);
        boolean A07 = ((1X6) this.A05.get()).A07();
        boolean A00 = ((7NT) 4YU.A0p(this.A02)).A00();
        boolean A002 = ((7NS) 4YU.A0p(this.A01)).A00();
        1Br r0 = hbB.A01;
        4YV.A0Z(r0).markPointWithEditor(hbB.A00, "leave_setting").addPointData(1BJ.A00(94), A07).addPointData("copresence_user_pref", A00).addPointData("is_copresence_allowed", A002).markerEditingCompleted();
        4YV.A0Z(r0).flowEndSuccess(hbB.A00);
        hbB.A00 = 0L;
        super.finish();
    }
}
