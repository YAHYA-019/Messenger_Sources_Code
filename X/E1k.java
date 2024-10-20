package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: E1k.class */
public final class E1k extends Coy implements JKD {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;
    public final FFo A03;

    public E1k(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A03 = (FFo) 1Bn.A0E((Context) null, r0, 67677);
        this.A00 = 1Bu.A03(r0, 115624);
        this.A01 = 1Bu.A03(r0, 85204);
    }

    public String Ayj() {
        return "coplay";
    }

    public View Az5(Context context) {
        11T.A0F(context, 0);
        return new DwL(context);
    }

    public boolean BSb(FbUserSession fbUserSession) {
        boolean z = false;
        if (1Br.A07(((5Wz) 1Br.A0B(this.A01)).A00).AZk(36318471088648855L)) {
            return false;
        }
        boolean A03 = this.A03.A03();
        1MV A0B = AbF.A0B(fbUserSession, this.A02.A00, 99471);
        if (A03 && ((FAS) A0B.get()).A06.size() > 1) {
            z = true;
        }
        return z;
    }

    @Override // X.Coy
    public boolean BT9() {
        1Br.A0C(this.A00);
        return true;
    }

    public void CA4(FbUserSession fbUserSession) {
    }

    @Override // X.Coy
    public boolean Cxh(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        boolean z = true;
        if (((FAS) 4YU.A0o(fbUserSession, this.A02, 99471)).A0J.size() > 1) {
            z = false;
        }
        return !z;
    }

    public boolean CzN(FbUserSession fbUserSession) {
        return AnonymousClass001.A1W(EMv.A04, ((FAS) 4YU.A0o(fbUserSession, this.A02, 99471)).A01());
    }

    public int getType() {
        return 11;
    }
}
