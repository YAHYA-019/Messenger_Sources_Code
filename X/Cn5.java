package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Cn5.class */
public final class Cn5 implements DIS {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ 1F9 A02;
    public final /* synthetic */ ThreadKey A03;
    public final /* synthetic */ 7EM A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public Cn5(FbUserSession fbUserSession, 1Br r303, 1F9 r304, ThreadKey threadKey, 7EM r306, String str, String str2, String str3) {
        this.A04 = r306;
        this.A03 = threadKey;
        this.A02 = r304;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A00 = fbUserSession;
        this.A01 = r303;
    }

    @Override // X.DIS
    public void Bsz() {
    }

    @Override // X.DIS
    public void Bt2() {
        ((C1266Ac8) 1Br.A0B(this.A04.A05)).A03(this.A02, this.A03, this.A06, 8);
    }

    @Override // X.DIS
    public void Bt3() {
        C00i c00i = this.A01.A00;
        ((6HM) c00i.get()).A02(((6HM) c00i.get()).A04(ServiceException.A00(AbF.A1D("Message request failed to delete."))));
    }

    @Override // X.DIS
    public void Bt7() {
        7EM r0 = this.A04;
        CMw cMw = (CMw) 1Br.A0B(r0.A03);
        1F9 r02 = this.A02;
        ThreadKey threadKey = this.A03;
        String str = this.A07;
        String str2 = this.A05;
        1BK.A1J(threadKey, 1, str2);
        AbstractC01593ro A00 = CMw.A00(r02, threadKey, cMw, AbstractC00603o4.A00(67), str, str2, true);
        if (A00.A0B()) {
            A00.A0A();
        }
        Bundle A05 = 1BK.A05();
        A05.putString("folder_name", r02.dbName);
        A05.putSerializable("broadcast_cause", 54N.A09);
        ((1Uv) 1Br.A0B(r0.A04)).A08(A05, this.A00, threadKey, 4YT.A00(233));
        DHl dHl = r0.A00;
        if (dHl != null) {
            dHl.Bt7();
        }
    }
}
