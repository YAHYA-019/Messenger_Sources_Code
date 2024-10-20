package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* renamed from: X.8ud, reason: invalid class name */
/* loaded from: 8ud.class */
public final class C8ud extends Coy implements JKD {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C8ud(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 16980);
        this.A00 = 1Bu.A03(r0, 114982);
    }

    public String Ayj() {
        return "RxPlaceholder";
    }

    public View Az5(Context context) {
        11T.A0F(context, 0);
        LithoView A0V = 7zO.A0V(context);
        A0V.A0x(new 8Vw(7zQ.A0m(this.A01), ((HuL) 1Br.A0B(this.A00)).A03()));
        return A0V;
    }

    @Override // X.Coy
    public boolean BQT() {
        return true;
    }

    public boolean BSb(FbUserSession fbUserSession) {
        return true;
    }

    @Override // X.Coy
    public boolean BT9() {
        return true;
    }

    public void CA4(FbUserSession fbUserSession) {
    }

    public boolean CzN(FbUserSession fbUserSession) {
        return false;
    }

    public int getType() {
        return 21;
    }
}
