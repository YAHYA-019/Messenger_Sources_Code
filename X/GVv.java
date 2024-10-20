package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: GVv.class */
public final class GVv extends MutableLiveData {
    public final 1Br A03;
    public final 1Br A04;
    public final long A05;
    public final Context A06;
    public final FbUserSession A07;
    public final Long A09;
    public final String A0A;
    public final boolean A0B;
    public final 1Br A02 = 1Bq.A00(66360);
    public C2633Gjl A00 = new C2633Gjl(null, null, null, 15, 2, false, false);
    public final C1qM A08 = new Iad(this, 4);
    public final LiveData A01 = this;

    public GVv(Context context, FbUserSession fbUserSession, Long l, String str, long j, boolean z) {
        this.A06 = context;
        this.A07 = fbUserSession;
        this.A05 = j;
        this.A0A = str;
        this.A09 = l;
        this.A0B = z;
        this.A03 = 1Lm.A00(context, fbUserSession, 84159);
        this.A04 = 1Lm.A00(context, fbUserSession, 33124);
    }

    public static final void A00(C2633Gjl c2633Gjl, GVv gVv) {
        MailboxFeature A0d = 7zP.A0d(gVv.A03);
        String str = gVv.A0A;
        Long l = gVv.A09;
        Object obj = c2633Gjl.A00;
        A1f a1f = new A1f(c2633Gjl, gVv, 90);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, a1f);
        1Um.A02(AQV, new IbN(A0d, obj, A0Q, l, str, 5), A0Q, false);
    }

    public static final void A01(GVv gVv) {
        MailboxFeature A0d = 7zP.A0d(gVv.A03);
        String str = gVv.A0A;
        Long l = gVv.A09;
        Iby iby = new Iby(gVv, 44);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, iby);
        1Um.A02(AQV, new Ib6(A0d, l, A0Q, str, 3), A0Q, false);
    }

    public boolean A02(boolean z) {
        1Um A0O;
        MailboxFutureImpl A0P;
        MailboxFutureImpl A0Q;
        A0c ibS;
        C2633Gjl c2633Gjl = this.A00;
        boolean z2 = false;
        boolean z3 = c2633Gjl.A03;
        boolean z4 = c2633Gjl.A02;
        String str = c2633Gjl.A01;
        if (!z3 && z4) {
            if (this.A0B) {
                MailboxFeature A0d = 7zP.A0d(this.A03);
                long j = this.A05;
                String str2 = this.A0A;
                Iby iby = new Iby(this, 43);
                A0O = 1BK.A0O(A0d, 0);
                A0P = 1BK.A0P(A0O);
                A0Q = 1BK.A0Q(A0O, iby);
                ibS = new A0c(A0P, A0d, A0Q, str2, 1, j);
            } else {
                GsM gsM = (GsM) 1Br.A0B(this.A03);
                long j2 = this.A05;
                String str3 = this.A0A;
                Long l = this.A09;
                Iai iai = new Iai(5, this, z);
                A0O = 1BK.A0O(gsM, 0);
                A0P = 1BK.A0P(A0O);
                A0Q = 1BK.A0Q(A0O, iai);
                ibS = new IbS(A0Q, A0P, gsM, l, str3, str, j2);
            }
            1Um.A01(A0O, ibS, A0P, A0Q);
            z2 = true;
        }
        return z2;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        ((C21N) 1Br.A0B(this.A04)).A00(this.A08);
        if (A02(false)) {
            return;
        }
        A01(this);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        ((C21N) 1Br.A0B(this.A04)).A01(this.A08);
    }
}
