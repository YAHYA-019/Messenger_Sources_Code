package com.facebook.pages.common.requesttime.shared.cancelappointment;

import X.07S;
import X.0Q8;
import X.11T;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1iF;
import X.2Jf;
import X.4YU;
import X.4YV;
import X.5Dh;
import X.7zL;
import X.7zO;
import X.7zQ;
import X.AbF;
import X.AbI;
import X.AbK;
import X.AbL;
import X.C1606Amn;
import X.C2070Dav;
import X.C5fi;
import X.C63p;
import X.CZF;
import X.DAz;
import X.DBE;
import X.DKB;
import X.DKN;
import X.Q6z;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: RejectAppointmentActivity.class */
public final class RejectAppointmentActivity extends FbFragmentActivity {
    public EditText A00;
    public Toolbar A01;
    public FbUserSession A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public ViewerContext A08;
    public String A09;
    public final 1Br A0B = 1Bu.A00(49829);
    public final C63p A0D = (C63p) 1Bi.A03(85240);
    public final 1Br A0C = 1HG.A00(this, 99435);
    public final 1Br A0A = 1Bu.A00(83347);

    public static final void A12(RejectAppointmentActivity rejectAppointmentActivity, String str) {
        AbI.A0o(rejectAppointmentActivity.A0B).A08(new C1606Amn(rejectAppointmentActivity, 19), "cancel_recurring_appointment", new DAz(str, rejectAppointmentActivity, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01c4, code lost:
    
        if (r303.length() == 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A15(com.facebook.pages.common.requesttime.shared.cancelappointment.RejectAppointmentActivity r301, java.lang.String r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pages.common.requesttime.shared.cancelappointment.RejectAppointmentActivity.A15(com.facebook.pages.common.requesttime.shared.cancelappointment.RejectAppointmentActivity, java.lang.String, java.lang.String):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(719088512172496L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A02 = 7zQ.A0N().A05(this);
        setContentView(2132543237);
        View A2c = A2c(2131368112);
        11T.A0I(A2c, DKB.A00(471));
        Toolbar toolbar = (Toolbar) A2c;
        this.A01 = toolbar;
        toolbar.A0Q(CZF.A00(this, 94));
        Bundle A0H = 7zO.A0H(this);
        if (A0H != null) {
            String string = A0H.getString("arg_recipient");
            this.A03 = A0H.getString("arg_page_id");
            this.A06 = A0H.getString("arg_request_id");
            this.A04 = A0H.getString("arg_referrer");
            this.A05 = A0H.getString("arg_rejection_type");
            this.A07 = A0H.getBoolean("arg_is_instagram_appt", false);
            this.A09 = A0H.getString("arg_recurring_appointment_type", "");
            View findViewById = findViewById(2131365665);
            11T.A0I(findViewById, "null cannot be cast to non-null type android.widget.EditText");
            this.A00 = (EditText) findViewById;
            if (11T.A0O(this.A05, "USER_CANCEL") || 11T.A0O(this.A05, "ADMIN_DECLINE")) {
                A15(this, string, null);
                return;
            }
            AbI.A0o(this.A0B).A08(new C2070Dav(string, this, 2), "is_appointment_with_offline_user", new DBE(this, 13));
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A08 = 7zQ.A0N().A05(this).BKF();
    }

    public final ListenableFuture A3B() {
        String str;
        Q6z q6z = new Q6z();
        String str2 = null;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A06, TraceFieldType.RequestID);
        07S.A00(A0J, this.A05, "action");
        07S.A00(A0J, this.A04, "referrer");
        EditText editText = this.A00;
        07S.A00(A0J, String.valueOf(editText != null ? editText.getText() : null), "message_text");
        if (11T.A0O(this.A05, "ADMIN_DECLINE") || 11T.A0O(this.A05, "ADMIN_CANCEL")) {
            str = this.A03;
        } else {
            ViewerContext viewerContext = this.A08;
            if (viewerContext != null) {
                str2 = viewerContext.mUserId;
            }
            str = String.valueOf(str2);
        }
        07S.A00(A0J, str, "actor_id");
        4YV.A1A(A0J, ((2Jf) q6z).A00, "input");
        DKN A0K = AbK.A0K(this);
        if (this.A02 != null) {
            return AbL.A0Z(A0K.A02(), new 5Dh(q6z), 719088512172496L);
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        C5fi.A00(this);
    }
}
