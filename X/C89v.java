package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;

/* renamed from: X.89v, reason: invalid class name */
/* loaded from: 89v.class */
public final class C89v {
    public long A00;
    public MutableLiveData A01;
    public C1qM A02;
    public final C1x1 A03;
    public final 1Br A04;
    public final 1Br A05;
    public final FbUserSession A06;
    public final 1EZ A07;
    public final C8xx A08;
    public final 1De A09;

    /* JADX WARN: Type inference failed for: r0v25, types: [com.facebook.msys.mca.MailboxFeature, X.8xx] */
    public C89v(1De r302) {
        this.A09 = r302;
        1BY r0 = r302.A00;
        1EZ r02 = (1EZ) 1Bn.A0E((Context) null, r0, 16428);
        this.A07 = r02;
        FbUserSession A04 = 1Fw.A04(r02);
        this.A06 = A04;
        this.A05 = 1Lm.A03(A04, r0, 16686);
        this.A04 = 7zM.A0R();
        this.A03 = (C1x1) 1Bi.A03(66360);
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        this.A08 = new MailboxFeature((1Uj) 1Br.A0B(this.A05));
        this.A01 = 7zL.A0H();
    }

    public static final void A00(MutableLiveData mutableLiveData, C89v c89v, long j) {
        C8xx c8xx = c89v.A08;
        1Um AQV = c8xx.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A1U(12, j, c8xx, A0P), A0P, false);
        A0P.A00(4YV.A11(c89v.A04)).Cu4(new A1U(15, j, mutableLiveData, c89v));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public final MutableLiveData A01(long j) {
        synchronized (this) {
            if (j == this.A00) {
                return this.A01;
            }
            this.A00 = j;
            ?? liveData = new LiveData(ImmutableList.of());
            this.A01 = liveData;
            A00(liveData, this, j);
            return liveData;
        }
    }

    public final void A02() {
        synchronized (this) {
            if (this.A02 != null) {
                A03();
            }
            C9zx c9zx = new C9zx(this, 5);
            this.A02 = c9zx;
            C21S.A00(c9zx, (1Uj) 1Br.A0B(this.A05));
        }
    }

    public final void A03() {
        synchronized (this) {
            C1qM c1qM = this.A02;
            if (c1qM != null) {
                C21S.A01(c1qM, (1Uj) 1Br.A0B(this.A05));
                this.A02 = null;
            }
        }
    }
}
