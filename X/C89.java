package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.service.model.EditPasswordParams;

/* loaded from: C89.class */
public final class C89 {
    public Bbq A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public boolean A04;
    public boolean A05;

    public void A00() {
        AlN alN;
        JgM jgM;
        if (this.A00 == null || !A01() || (jgM = (alN = this.A00.A00).A01) == null || jgM.A1S() || alN.A07) {
            return;
        }
        String str = this.A01;
        String str2 = this.A02;
        EditPasswordParams editPasswordParams = new EditPasswordParams(str, str2, this.A04 ? this.A03 : str2);
        Bundle A05 = 1BK.A05();
        A05.putParcelable(1BJ.A00(1252), editPasswordParams);
        if (alN.A01 != null) {
            alN.A07 = true;
            0fH.A0g("edit_password_submitted", "AccountPasswordFunnelLogger", "log action: %s");
            JgM jgM2 = alN.A01;
            if (jgM2.A05) {
                jgM2.A03.A06(A05, (CallerContext) null, "edit_password", true);
                return;
            }
            jgM2.A04 = "edit_password";
            jgM2.A06 = true;
            jgM2.A00 = A05;
            jgM2.A01 = null;
        }
    }

    public boolean A01() {
        return this.A04 ? (TextUtils.isEmpty(this.A01) || TextUtils.isEmpty(this.A02) || TextUtils.isEmpty(this.A03)) ? false : true : !TextUtils.isEmpty(this.A02);
    }
}
