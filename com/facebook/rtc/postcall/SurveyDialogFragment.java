package com.facebook.rtc.postcall;

import X.0FI;
import X.0S2;
import X.1BK;
import X.1Br;
import X.1iF;
import X.GOq;
import X.JMS;
import X.JZj;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.resources.ui.FbEditText;
import com.facebook.rtc.postcall.api.PostCallDialogFragment;

/* loaded from: SurveyDialogFragment.class */
public final class SurveyDialogFragment extends PostCallDialogFragment {
    public JZj A00;
    public FbEditText A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public boolean A09;
    public final 1Br A0A = 1BK.A0C();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if ("something_else".equals(r301.A03) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0202  */
    /* JADX WARN: Type inference failed for: r0v227, types: [android.widget.TextView, com.facebook.resources.ui.FbEditText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.postcall.SurveyDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    public 1iF A17() {
        return GOq.A0U();
    }

    public void ATi() {
        this.A09 = true;
        A1C(this.A08, this.A05, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(642036106);
        super.onCreate(bundle);
        this.A08 = requireArguments().getInt("rating", 0);
        this.A07 = requireArguments().getBoolean("use_video", false);
        this.A02 = requireArguments().getString("survey_question_type", "");
        this.A06 = requireArguments().getBoolean("is_first_question", true);
        0FI.A08(-661887155, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A09) {
            this.A09 = false;
            return;
        }
        String str = this.A05;
        if (str == null || !(this.A06 || str.equals("something_else"))) {
            A1C(this.A08, str, this.A02, this.A04);
            return;
        }
        JMS jms = super.A00;
        if (jms != null) {
            jms.D0M(this.A08, str);
        }
    }

    public void onStart() {
        int A02 = 0FI.A02(-1976543858);
        super/*X.0D2*/.onStart();
        JMS jms = super.A00;
        if (jms != null) {
            jms.CTQ(0S2.A00);
        }
        0FI.A08(1920288541, A02);
    }
}
