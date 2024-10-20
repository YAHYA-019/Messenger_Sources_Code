package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.9a4, reason: invalid class name */
/* loaded from: 9a4.class */
public final class C9a4 {
    public C8yg A00;
    public C8yh A01;
    public boolean A02;
    public final Context A03;
    public final LiveData A04;
    public final MutableLiveData A05;
    public final 1Br A06;
    public final 1Br A07 = 7zM.A0Z();
    public final C01i A09 = C01g.A01(new AQZ(this, 36));
    public final 1Br A08 = 7zM.A0P();

    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C9a4(Context context) {
        this.A03 = context;
        1Br A0a = 7zM.A0a();
        this.A06 = A0a;
        1Br.A0C(A0a);
        ?? liveData = new LiveData(new 8Lf(1qI.A00().A01()));
        this.A05 = liveData;
        this.A04 = liveData;
    }

    public final void A00(FbUserSession fbUserSession, C1790AsO c1790AsO) {
        11T.A0F(c1790AsO, 1);
        Object value = this.A05.getValue();
        if (value == null) {
            throw 1BK.A0e();
        }
        if (c1790AsO.equals(((8Lf) value).A03)) {
            return;
        }
        C8yg c8yg = this.A00;
        if (c8yg != null) {
            c8yg.D5r();
        }
        String str = null;
        this.A00 = null;
        if (c1790AsO.A00 != 0S2.A01) {
            str = c1790AsO.A01;
        }
        C8xl c8xl = (C8xl) 1Lm.A05(this.A03, fbUserSession, 68444);
        1Um AQV = c8xl.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A1Y(new C8yg(c8xl, AQV), c8xl, A0P, str, 0), A0P, false);
        A1f.A01(A0P, c1790AsO, this, 33);
    }
}
