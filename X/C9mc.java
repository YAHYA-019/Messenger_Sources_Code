package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9mc, reason: invalid class name */
/* loaded from: 9mc.class */
public final class C9mc {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ThreadKey A08;
    public C1qM A09;
    public boolean A0A;
    public C1qM A0B;
    public C00m A0C;
    public final Context A0D;
    public final FbUserSession A0E;
    public final 1Br A0H;
    public final ThreadKey A0J;
    public final 1Br A0L;
    public final 1Br A0I = 1Bq.A00(67528);
    public final 1Br A0F = 7zM.A0Z();
    public final 1Br A0M = 7zM.A0P();
    public final 1Br A0G = 1BK.A0C();
    public final C01i A0K = C01g.A01(AQb.A00(this, 28));
    public long A04 = Long.MIN_VALUE;
    public MutableLiveData A07 = 7zL.A0H();
    public MutableLiveData A05 = 7zL.A0H();
    public MutableLiveData A06 = 7zL.A0H();

    public C9mc(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A0D = context;
        this.A0E = fbUserSession;
        this.A0J = threadKey;
        this.A0L = 1Lm.A00(context, fbUserSession, 67951);
        this.A0H = 1Bu.A01(context, 68489);
    }

    public static final ExecutorService A00(C9mc c9mc) {
        return (ExecutorService) 1Br.A0B(c9mc.A0M);
    }

    public static final void A01(C9mc c9mc, long j) {
        9IC r0 = (9IC) 1Br.A0B(c9mc.A0H);
        FbUserSession fbUserSession = c9mc.A0E;
        1Kd.A0F(AC8.A00(c9mc, 17), 5P7.A00((5P7) 4YU.A0o(fbUserSession, r0.A00, 49711), 2, c9mc.A0J.A01, j), A00(c9mc));
    }

    public static final void A02(C9mc c9mc, long j) {
        7V5 A05 = c9mc.A05();
        1Kd.A0F(AC8.A00(c9mc, 18), 5P7.A00((5P7) 1Br.A0B(A05.A00), 0, c9mc.A0J.A01, j), A00(c9mc));
    }

    public static final void A03(C9mc c9mc, Function1 function1, long j) {
        7V5 A05 = c9mc.A05();
        1Kd.A0F(new ABp(c9mc, function1, 3), 5P7.A00((5P7) 1Br.A0B(A05.A00), 1, c9mc.A0J.A01, j), A00(c9mc));
    }

    public final LiveData A04() {
        LiveData ASY = ((C5xl) 1Br.A0B(this.A0I)).ASY(this.A0J);
        11T.A0A(ASY);
        return ASY;
    }

    public final 7V5 A05() {
        return (7V5) 1Br.A0B(this.A0L);
    }

    public final void A06() {
        C00m c00m = this.A0C;
        if (c00m != null) {
            c00m.invoke();
        }
        this.A0C = null;
        C1qM c1qM = this.A09;
        if (c1qM != null) {
            ((1Uj) 1Lm.A05(this.A0D, this.A0E, 16686)).A06(A1d.A00(c1qM, 49));
        }
        if (1Br.A07(this.A0G).AZk(36324149035159011L)) {
            this.A09 = null;
        }
        this.A03 = 0;
        this.A02 = 0;
        this.A0A = false;
        this.A04 = Long.MIN_VALUE;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A07() {
        if (1Br.A07(this.A0G).AZk(36324149035159011L)) {
            C1qM c1qM = this.A0B;
            if (c1qM != null) {
                ((1Uj) 1Lm.A05(this.A0D, this.A0E, 16686)).A06(A1d.A00(c1qM, 50));
            }
            this.A0B = null;
        }
    }

    public final void A08(Boolean bool, Long l, C00m c00m, Function1 function1, int i, int i2, int i3) {
        if (this.A0A) {
            7zN.A1a(function1, true);
            return;
        }
        this.A0C = c00m;
        this.A0A = true;
        this.A03 = i;
        this.A02 = i2;
        1Kd.A0F(new D4Z(i3, 0, this, bool, function1, l), A05().A00(this.A0J.A01), A00(this));
    }

    public final void A09(C00m c00m) {
        final AQb A00 = AQb.A00(c00m, 29);
        final String str = "temp_message_attachment_list_attachments_in_range";
        C1qM c1qM = new C1qM() { // from class: X.9zv
            @Override // X.C1qM
            public final void CNu(Set set) {
                if (set.contains(str)) {
                    A00.invoke();
                }
            }
        };
        if (1Br.A07(this.A0G).AZk(36324149035159011L)) {
            this.A0B = c1qM;
        }
        ((1Uj) 1Lm.A05(this.A0D, this.A0E, 16686)).A06(A1d.A00(c1qM, 47));
    }

    public final void A0A(C00m c00m, Function1 function1) {
        ThreadKey threadKey = this.A08;
        if (threadKey != null) {
            function1.invoke(threadKey);
        } else {
            1Kd.A0F(new ABt(3, function1, c00m, this), (ListenableFuture) this.A0K.getValue(), A00(this));
        }
    }
}
