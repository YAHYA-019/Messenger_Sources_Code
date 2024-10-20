package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9a7, reason: invalid class name */
/* loaded from: 9a7.class */
public final class C9a7 {
    public long A00;
    public final MutableLiveData A01;
    public final MutableLiveData A02;
    public final MutableLiveData A03;
    public final MutableLiveData A04;
    public final 1Br A06;
    public final 1Br A09;
    public final 1Br A0C;
    public final 1Br A08 = 7zM.A0M();
    public final 1Br A0A = 1Bq.A00(68600);
    public final 1Br A07 = 7zM.A0R();
    public final 1Br A0D = 1Bq.A00(68500);
    public final 1Br A05 = 7zM.A0Z();
    public final 1Br A0B = 1Bq.A00(68501);

    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v33, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v37, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C9a7(FbUserSession fbUserSession) {
        this.A09 = 1Lm.A01(fbUserSession, 67865);
        this.A06 = 1Lm.A01(fbUserSession, 67992);
        this.A0C = 1Lm.A01(fbUserSession, 68496);
        C0ty c0ty = C0ty.A00;
        this.A01 = new LiveData(c0ty);
        this.A02 = new LiveData(4YV.A0j());
        this.A03 = new LiveData(c0ty);
        this.A04 = new LiveData(C95q.A04);
    }

    public final void A00(long j) {
        7zP.A0O(this.A05).A00(this.A04, C95q.A04);
        1FV A00 = C9kK.A00((C9kK) 1Br.A0B(this.A0C), (int) j);
        1Br.A0D(this.A07, AC8.A00(this, 44), A00);
    }
}
