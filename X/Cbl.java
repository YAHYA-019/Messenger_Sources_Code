package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.neue.contactpicker.ContactPickerParams;

/* loaded from: Cbl.class */
public final class Cbl implements CallerContextable, DJk {
    public static final CallerContext A08 = CallerContext.A0A(Cbl.class, "unknown", "contact_picker");
    public static final String __redex_internal_original_name = "NeueContactPickerRecentThreadsLoader";
    public 2TV A00;
    public 1BY A01;
    public RJL A02;
    public final C00i A03 = 1BQ.A01();
    public final C00i A04;
    public final ContactPickerParams A05;
    public final 2Ur A06;
    public final Context A07;

    public Cbl(Context context, FbUserSession fbUserSession, 1BO r304, ContactPickerParams contactPickerParams) {
        this.A01 = 7zL.A0Q(r304);
        this.A07 = context;
        this.A04 = 7zL.A0R(context, 84364);
        this.A05 = contactPickerParams;
        this.A06 = ((C2xd) 1Bn.A0E(context, (1BY) null, 17151)).A0J(fbUserSession);
    }

    public void AEC() {
        this.A06.AEC();
    }

    public void CmR(2TV r302) {
        r302.getClass();
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        FbUserSession A05 = 1Fw.A05(this.A01);
        2Ur r0 = this.A06;
        r0.CmR(new Cbx(1, A05, this, obj));
        r0.A09(1F9.A0I);
        1Hb r303 = 1Hb.A02;
        ContactPickerParams contactPickerParams = this.A05;
        if (contactPickerParams.A0O) {
            r303 = 1Hb.A0G;
        } else if (!contactPickerParams.A0P) {
            r303 = 1Hb.A0C;
        }
        r0.A0A(2fC.A00(A08, r303, false, false, false));
    }
}
