package com.facebook.messaging.marketplace.meetingplan;

import X.1Iw;
import X.4YT;
import X.4YV;
import X.7zL;
import X.7zP;
import X.AbF;
import X.AuU;
import X.B15;
import X.Bez;
import X.C00i;
import X.C7l5;
import X.RNi;
import X.RZ1;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: MeetingPlanActivity.class */
public class MeetingPlanActivity extends FbFragmentActivity {
    public RNi A00;
    public final C00i A01 = 7zL.A0R(this, 16979);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        String stringExtra = getIntent().getStringExtra("OTHER_PERSON_ID");
        String stringExtra2 = getIntent().getStringExtra("OTHER_PERSON_NAME");
        String stringExtra3 = getIntent().getStringExtra("THREAD_ID");
        stringExtra.getClass();
        stringExtra3.getClass();
        1Iw A0W = 7zL.A0W(this);
        FbUserSession A0D = 4YV.A0D(this);
        AuU auU = new AuU(A0W, new B15());
        B15 b15 = auU.A01;
        b15.A00 = A0D;
        BitSet bitSet = auU.A02;
        bitSet.set(1);
        b15.A01 = new Bez(this);
        bitSet.set(4);
        b15.A02 = this.A00;
        bitSet.set(2);
        b15.A07 = !(!(!r0.A03.equals(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)));
        bitSet.set(3);
        b15.A04 = stringExtra;
        bitSet.set(5);
        b15.A05 = stringExtra2;
        bitSet.set(6);
        b15.A06 = stringExtra3;
        bitSet.set(7);
        b15.A03 = AbF.A0p(this.A01);
        bitSet.set(0);
        7zP.A17(auU, bitSet, auU.A03);
        setContentView(LithoView.A02(b15, A0W));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("CURRENT_MEETING_PLAN_ID");
        String stringExtra2 = getIntent().getStringExtra("CURRENT_MEETING_PLAN_LOCATION");
        String stringExtra3 = getIntent().getStringExtra("CURRENT_MEETING_PLAN_NOTES");
        long longExtra = getIntent().getLongExtra("CURRENT_MEETING_PLAN_TIME_IN_SECONDS", 0L) * 1000;
        String stringExtra4 = getIntent().getStringExtra(4YT.A00(673));
        RZ1 rz1 = new RZ1();
        if (!TextUtils.isEmpty(stringExtra)) {
            rz1.A03 = stringExtra;
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            rz1.A04 = stringExtra2;
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            rz1.A02 = stringExtra3;
        }
        if (!TextUtils.isEmpty(stringExtra4)) {
            rz1.A01 = C7l5.A00(stringExtra4);
        }
        rz1.A00 = longExtra;
        this.A00 = new RNi(rz1);
    }
}
