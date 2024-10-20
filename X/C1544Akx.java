package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* renamed from: X.Akx, reason: case insensitive filesystem */
/* loaded from: Akx.class */
public final class C1544Akx extends 1pK {
    public static final String __redex_internal_original_name = "ConsumerAppointmentDetailFragment";
    public FbUserSession A00;
    public DMV A01;
    public 2JX A02;
    public LithoView A03;
    public BgX A04;
    public String A05;
    public String A06;
    public final 1Br A08 = 1HG.A01(this, 99435);
    public final C63p A09 = (C63p) 1Bi.A03(85240);
    public final 1Br A07 = 1Bu.A00(49829);

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r311 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        r0 = r0.A1q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        r305 = r0.A0k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r305 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        r0 = X.C3o5.A0D(r0, com.facebook.pages.common.requesttime.shared.cancelappointment.RejectAppointmentActivity.class);
        r0.putExtra("arg_rejection_type", "USER_CANCEL");
        r0.putExtra("arg_recipient", r304);
        r0.putExtra("arg_page_id", r311);
        r0.putExtra("arg_request_id", r305);
        r0.putExtra("arg_recurring_appointment_type", r302);
        r0.putExtra("arg_referrer", r0);
        r0.putExtra("arg_is_instagram_appt", false);
        X.0LS.A05(r0, r301, 100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        r305 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(X.C1544Akx r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1544Akx.A03(X.Akx, java.lang.String):void");
    }

    public 1iF A1R() {
        return AbF.A0C(719088512172496L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BM.A01(this);
        Bundle bundle2 = this.mArguments;
        String str = null;
        this.A06 = bundle2 != null ? bundle2.getString("referrer") : null;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("arg_appointment_id");
        }
        this.A05 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == 1) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(1);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.onBackPressed();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1001305802);
        DMV dmv = this.A01;
        if (dmv == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(2132543007, (ViewGroup) null);
            11T.A0I(inflate, "null cannot be cast to non-null type com.facebook.widget.framerateprogressbar.FrameRateProgressBar");
            DKS dks = new DKS(getContext(), 2132607211);
            dks.A09(inflate);
            dmv = dks.A0I();
            this.A01 = dmv;
        }
        dmv.show();
        AbI.A0o(this.A07).A08(new C1606Amn(this, 16), "fetch_appointment_detail", new DBE(this, 8));
        LithoView A0O = AbK.A0O(this);
        this.A03 = A0O;
        0FI.A08(1798758154, A02);
        return A0O;
    }
}
