package X;

import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9c4, reason: invalid class name */
/* loaded from: 9c4.class */
public final class C9c4 {
    public 9Ns A00;
    public Integer A01;
    public String A02;
    public final 2bX A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;

    public C9c4(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A05 = 7zM.A0W();
        this.A07 = 7zM.A0Z();
        this.A04 = 1Lm.A01(fbUserSession, 16874);
        this.A06 = 1Bq.A00(68887);
        this.A08 = 1Lm.A01(fbUserSession, 68660);
        this.A03 = new LiveData(C8sr.A00);
        this.A01 = 0S2.A00;
    }

    public final Boolean A00() {
        C8sp c8sp;
        Object value = this.A03.getValue();
        Boolean bool = null;
        if ((value instanceof C8sp) && (c8sp = (C8sp) value) != null) {
            bool = Boolean.valueOf(c8sp.A01);
        }
        return bool;
    }

    public final void A01() {
        0fH.A0j("EncryptedBackupVdStatusRepository", "start to fetch VD type state");
        7zP.A0O(this.A07).A01(this.A03, C8ss.A00);
        C9rb.A00(7zQ.A0M(this.A04).A02(), this, 7);
    }
}
