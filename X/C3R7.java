package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.base.Optional;
import java.util.concurrent.Executor;

/* renamed from: X.3R7, reason: invalid class name */
/* loaded from: 3R7.class */
public final class C3R7 {
    public final C1zc A00;

    public C3R7(FbUserSession fbUserSession) {
        this.A00 = (C1zc) 1Lo.A07(fbUserSession, 66073);
    }

    public static final C3R7 A00(Object obj) {
        return new C3R7((FbUserSession) obj);
    }

    public int A01() {
        Optional A00 = this.A00.A00();
        if (A00.isPresent()) {
            return AnonymousClass001.A03(A00.get());
        }
        return 0;
    }

    public void A02(int i) {
        AnonymousClass222 anonymousClass222 = (AnonymousClass222) 1Br.A0B(this.A00.A01);
        long j = i;
        java.util.Map map = anonymousClass222.A03;
        11T.A09(map);
        AnonymousClass001.A18("emoji_color_pref", j, map);
        ((Executor) 1Br.A0B(anonymousClass222.A00)).execute(new 3hK(anonymousClass222, j));
    }
}
