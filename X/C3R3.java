package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3R3, reason: invalid class name */
/* loaded from: 3R3.class */
public final class C3R3 {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A07;
    public final C00i A08;
    public final C00i A02 = 1BV.A01((1BY) null, 66484);
    public final ExecutorService A0C = (ExecutorService) 1Bi.A03(16457);
    public final 1ED A09 = (1ED) 1Bi.A03(16441);
    public final C00i A03 = 1BQ.A02(16634);
    public final C00i A04 = 1BV.A01((1BY) null, 33205);
    public final C00i A05 = 1BV.A01((1BY) null, 17054);
    public final C00i A06 = 1BQ.A02(66774);
    public final java.util.Map A0A = AnonymousClass001.A0u();
    public final Set A0B = AnonymousClass001.A0v();

    public C3R3(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        Integer num = 1Lo.A05;
        this.A08 = new 1MV(fbUserSession, (1BY) null, 17028);
        this.A07 = new 1MV(fbUserSession, (1BY) null, 84154);
    }

    public static final C3R3 A00(1BO r301, Object obj) {
        return new C3R3(r301, (FbUserSession) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map] */
    public java.util.Map A01(Integer num) {
        HashMap A0u;
        synchronized (this) {
            java.util.Map map = this.A0A;
            A0u = (!map.containsKey(num) || map.get(num) == null) ? AnonymousClass001.A0u() : (java.util.Map) map.get(num);
        }
        return A0u;
    }
}
