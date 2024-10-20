package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9lA, reason: invalid class name */
/* loaded from: 9lA.class */
public final class C9lA {
    public static final 9QI A0A = new 9QI(true, (String) null, (String) null);
    public 9QI A00;
    public 9Gz A01;
    public 9H0 A02;
    public final FbUserSession A03;
    public final 1De A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final AtomicBoolean A08;
    public final C01i A09;

    public C9lA(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A03 = fbUserSession;
        1BY r0 = r303.A00;
        this.A05 = 1Bu.A03(r0, 68617);
        this.A06 = 1Bu.A03(r0, 82155);
        this.A07 = 1Bu.A03(r0, 68620);
        this.A08 = 7zO.A15();
        this.A00 = A0A;
        this.A09 = C01g.A01(new GAY(this, 37));
    }

    public static final void A00(FbUserSession fbUserSession, C9lA c9lA, ThreadKey threadKey, Integer num, List list, boolean z) {
        9sH r319;
        9lK r0 = (9lK) 4YU.A0n(fbUserSession, c9lA.A04, 68376);
        96M r02 = 96M.A02;
        Integer num2 = r0.A04;
        if (num2 != null) {
            int intValue = num2.intValue();
            ConcurrentHashMap concurrentHashMap = r0.A02;
            Class<?> cls = r02.getClass();
            0BY A18 = 7zL.A18(cls);
            Object obj = concurrentHashMap.get(A18);
            if (obj == null) {
                obj = 0;
                Object putIfAbsent = concurrentHashMap.putIfAbsent(A18, null);
                if (putIfAbsent != null) {
                    obj = putIfAbsent;
                }
            }
            Number number = (Number) obj;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(r02.value);
            A0k.append('_');
            String A0a = AnonymousClass001.A0a(number, A0k);
            AnonymousClass001.A1A(7zL.A18(cls), concurrentHashMap, number.intValue() + 1);
            7zP.A0e(r0.A01).markerPoint(744830963, intValue, 0Pz.A0W(A0a, "_start"));
            r319 = new 9sH(r0, A0a, intValue);
        } else {
            r319 = 9lK.A05;
        }
        9Gz r03 = c9lA.A01;
        if (r03 != null) {
            Set keySet = r03.A00.A08.keySet();
            11T.A0A(keySet);
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                ((AZu) it.next()).BZ2();
            }
        }
        2aK.A03((Integer) null, (0DE) null, new AJQ(c9lA, fbUserSession, num, threadKey, list, r0, r319, (0DR) null, 0, z), 7zN.A0y(), 3);
    }

    public final void A01() {
        ((9YT) 4YU.A0n(this.A03, this.A04, 68616)).A00((8Lt) null);
        this.A08.set(false);
        this.A00 = A0A;
    }

    public final void A02(ThreadKey threadKey, Integer num, boolean z) {
        FbUserSession fbUserSession = this.A03;
        1Br A0S = 7zL.A0S(fbUserSession, this.A04, 68616);
        AtomicBoolean atomicBoolean = this.A08;
        if (!atomicBoolean.get()) {
            8Lt r0 = (8Lt) ((9YT) 1Br.A0B(A0S)).A02.get();
            if (!11T.A0O(r0 != null ? r0.A03 : null, threadKey) && 7zQ.A1a(this.A09)) {
                A01();
            }
        }
        if (!this.A00.A02 || atomicBoolean.getAndSet(true)) {
            return;
        }
        if (7zQ.A1a(this.A09)) {
            ((9Xp) 1Br.A0B(this.A07)).A00(threadKey, new ARM(1, this, threadKey, num, z));
        } else {
            A00(fbUserSession, this, threadKey, num, C0ty.A00, z);
        }
    }
}
