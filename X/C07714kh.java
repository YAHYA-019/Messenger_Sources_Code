package X;

import com.facebook.presence.DefaultPresenceManager;
import com.facebook.user.model.UserKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.4kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kh.class */
public final class C07714kh extends AbstractC07494k1 {
    public List A00;
    public final 1Br A01;
    public final C07484k0 A02;
    public final 4kV A03;
    public final Executor A04;
    public final C6u4 A05;

    public C07714kh(C07484k0 c07484k0) {
        11T.A0F(c07484k0, 1);
        this.A02 = c07484k0;
        this.A01 = 1Bu.A00(66151);
        this.A04 = 1NF.A01();
        this.A00 = C0ty.A00;
        this.A03 = new C83u(this, 2);
        this.A05 = new C6u4(this);
    }

    public static final void A00(C07714kh c07714kh, List list) {
        Long valueOf;
        6uC.A00();
        Iterator it = 0QD.A0h(c07714kh.A00, list).iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            DefaultPresenceManager defaultPresenceManager = (DefaultPresenceManager) c07714kh.A01.A00.get();
            C6u4 c6u4 = c07714kh.A05;
            11T.A0F(c6u4, 1);
            1Mu r0 = defaultPresenceManager.A0l;
            synchronized (r0) {
                r0.remove(Long.valueOf(longValue), c6u4);
            }
        }
        Iterator it2 = 0QD.A0h(list, c07714kh.A00).iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Number) it2.next()).longValue();
            C00i c00i = c07714kh.A01.A00;
            DefaultPresenceManager defaultPresenceManager2 = (DefaultPresenceManager) c00i.get();
            C6u4 c6u42 = c07714kh.A05;
            11T.A0F(c6u42, 1);
            1Mu r02 = defaultPresenceManager2.A0l;
            synchronized (r02) {
                valueOf = Long.valueOf(longValue2);
                r02.CZw(valueOf, c6u42);
            }
            DefaultPresenceManager defaultPresenceManager3 = (DefaultPresenceManager) c00i.get();
            UserKey userKey = (UserKey) defaultPresenceManager3.A0h.A00.get(valueOf);
            if (userKey != null) {
                defaultPresenceManager3.A7D(userKey);
            }
        }
        c07714kh.A00 = list;
    }

    public final C5cs A08() {
        Object next;
        C5cs c5cs;
        Object obj;
        C2fo c2fo;
        6uC.A00();
        List list = this.A00;
        ArrayList arrayList = new ArrayList(C1A3.A1D(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            DefaultPresenceManager defaultPresenceManager = (DefaultPresenceManager) this.A01.A00.get();
            if (!DefaultPresenceManager.A0P(defaultPresenceManager) || (obj = defaultPresenceManager.A0h.A00.get(Long.valueOf(longValue))) == null || obj.equals(defaultPresenceManager.A0M.A00.get()) || (c2fo = (C2fo) defaultPresenceManager.A0t.get(obj)) == null) {
                c5cs = 7GO.A00;
            } else {
                long j = c2fo.A03;
                boolean z = c2fo.A08;
                long j2 = -1;
                if (j != j2) {
                    j2 = 1000 * j;
                }
                c5cs = new C5cs(z, j2);
            }
            arrayList.add(c5cs);
        }
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((C5cs) it2.next()).A01) {
                    return 7GO.A01;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long j3 = ((C5cs) next).A00;
                do {
                    Object next2 = it3.next();
                    long j4 = ((C5cs) next2).A00;
                    if (j3 < j4) {
                        next = next2;
                        j3 = j4;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        C5cs c5cs2 = (C5cs) next;
        if (c5cs2 == null) {
            c5cs2 = 7GO.A00;
        }
        return c5cs2;
    }

    @Override // X.InterfaceC07544k6
    public void Cgt(int i) {
        this.A02.Cgt(i);
    }
}
