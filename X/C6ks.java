package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6ks, reason: invalid class name */
/* loaded from: 6ks.class */
public final class C6ks {
    public final FbUserSession A00;
    public final C6ku A01;
    public final 1De A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final ConcurrentHashMap A07;
    public final ConcurrentHashMap A08;
    public final C01i A09;
    public final C01i A0A;
    public final C01i A0B;

    public C6ks(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A00 = fbUserSession;
        1BY r0 = r303.A00;
        this.A03 = 1Lm.A03(fbUserSession, r0, 65855);
        this.A06 = 1Bu.A03(r0, 68620);
        this.A04 = 1Bq.A00(65837);
        this.A05 = 1Bq.A00(16385);
        this.A01 = ((C6kt) this.A03.A00.get()).A00;
        this.A0A = C01g.A01(new AnonymousClass831(this, 24));
        this.A0B = C01g.A01(new AnonymousClass831(this, 25));
        this.A09 = C01g.A01(new AnonymousClass831(this, 23));
        this.A07 = new ConcurrentHashMap();
        this.A08 = new ConcurrentHashMap();
    }

    public static final void A00(C6ks c6ks, ThreadKey threadKey, long j) {
        C6ku c6ku = c6ks.A01;
        c6ku.A00(j);
        5QE A01 = c6ku.A01("messenger_dynamic_presence", 11T.A03(Long.valueOf(j)));
        A01.A01.addResultCallback(new A0D(1, j, threadKey, c6ks));
    }

    public final 7QI A01(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        ConcurrentHashMap concurrentHashMap = this.A07;
        7QI r305 = null;
        if (concurrentHashMap.containsKey(threadKey) && 1Br.A07(this.A05).AZk(36323680884181922L)) {
            r305 = (7QI) concurrentHashMap.get(threadKey);
        }
        return r305;
    }
}
