package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.Aco, reason: case insensitive filesystem */
/* loaded from: Aco.class */
public final class C1284Aco {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C1284Aco(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 82820);
        this.A00 = 1Lm.A03(fbUserSession, r0, 82822);
    }

    public final LiveData A00(long j) {
        return ((C4z) 1Br.A0B(this.A00)).A00(j);
    }

    public LiveData A01(ThreadKey threadKey) {
        return ((C4z) 1Br.A0B(this.A00)).A00(threadKey.A0r());
    }

    public final C1283Acn A02(LifecycleOwner lifecycleOwner, long j) {
        AdA adA = (AdA) 1Br.A0B(this.A01);
        Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : C2sa.A00;
        11T.A0F(lifecycle, 1);
        return new C1283Acn(lifecycle, adA.A00, j);
    }
}
