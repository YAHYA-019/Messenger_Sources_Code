package X;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.474, reason: invalid class name */
/* loaded from: 474.class */
public final class AnonymousClass474 {
    public Lifecycle A00;
    public C2sd A01;
    public UserKey A02;
    public final C00i A03;
    public final AnonymousClass475 A04;
    public final AnonymousClass473 A05;

    public /* synthetic */ AnonymousClass474(C00i c00i, AnonymousClass473 anonymousClass473, UserKey userKey) {
        AnonymousClass475 anonymousClass475 = (AnonymousClass475) 1Bi.A03(66234);
        C2sa c2sa = C2sa.A00;
        11T.A0F(anonymousClass473, 1);
        11T.A0F(c00i, 2);
        11T.A0F(anonymousClass475, 3);
        11T.A0F(c2sa, 6);
        this.A05 = anonymousClass473;
        this.A03 = c00i;
        this.A04 = anonymousClass475;
        this.A02 = userKey;
        this.A01 = null;
        this.A00 = c2sa;
    }

    public final 47I A00() {
        UserKey userKey = this.A02;
        C2sd c2sd = this.A01;
        Lifecycle lifecycle = this.A00;
        AnonymousClass473 anonymousClass473 = this.A05;
        ImmutableList of = ImmutableList.of((Object) userKey);
        if (c2sd == null) {
            1BY r0 = anonymousClass473.A00.A00;
            c2sd = (C2sd) 1Lm.A07(1Fw.A04((1EZ) 1Bn.A0G(r0, 16428)), r0, 82712);
        }
        11T.A0D(of);
        ListenableFuture A02 = 2FP.A02(new 47D(), c2sd.ARv(of), 2eQ.A01);
        if (!lifecycle.equals(C2sa.A00)) {
            A02 = BTa.A00(lifecycle, A02);
        }
        return 47F.A00(this.A03, A02, "OpFetchUserByKey failed", "OpFetchUserByKey failed", new 47E(this.A04));
    }

    public final void A01(AnonymousClass477 anonymousClass477) {
        Executor executor = new Executor() { // from class: X.478
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (runnable != null) {
                    Looper mainLooper = Looper.getMainLooper();
                    if (11T.A0O(mainLooper.getThread(), Thread.currentThread())) {
                        runnable.run();
                    } else {
                        new Handler(mainLooper).post(new 5Ru(runnable));
                    }
                }
            }
        };
        2FR A03 = 2FR.A03(A00());
        11T.A0A(A03);
        1Kd.A0F(new 4WX(anonymousClass477, 0), A03, executor);
    }

    public final void A02(7Yx r302) {
        2FR A03 = 2FR.A03(A00());
        11T.A0A(A03);
        1Kd.A0F(new C3dr(r302, this, 0), A03, 2eQ.A01);
    }
}
