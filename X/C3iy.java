package X;

import com.facebook.presence.DefaultPresenceManager;
import com.facebook.user.model.UserKey;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: X.3iy, reason: invalid class name */
/* loaded from: 3iy.class */
public final class C3iy implements Callable {
    public final int A00;
    public final Object A01;

    public C3iy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C3iy(Runnable runnable) {
        this.A00 = 1;
        this.A01 = runnable;
    }

    public static void A00(0WH r301, 0WH r302, DefaultPresenceManager defaultPresenceManager, AbstractCollection abstractCollection, Iterator it) {
        UserKey userKey = (UserKey) it.next();
        11T.A0D(userKey);
        UserKey userKey2 = (UserKey) defaultPresenceManager.A0M.A00.get();
        if (userKey.type == 1Js.A03) {
            String str = userKey.id;
            11T.A0A(str);
            String str2 = userKey2 != null ? userKey2.id : null;
            if (r301.contains(str) || str.equals(str2)) {
                return;
            }
            r302.add(userKey);
            String str3 = userKey.id;
            11T.A0A(str3);
            r301.add(str3);
            String str4 = userKey.id;
            11T.A0A(str4);
            abstractCollection.add(Long.valueOf(Long.parseLong(str4)));
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        int i;
        String str;
        if (this.A00 != 0) {
            ((Runnable) this.A01).run();
            return null;
        }
        DefaultPresenceManager defaultPresenceManager = (DefaultPresenceManager) this.A01;
        C00j.A05("DefaultPresenceManager.sendAdditionalContactsInternal", -859931531);
        try {
            DefaultPresenceManager.A00(defaultPresenceManager).AAq();
            try {
                C00j.A05("PresenceManager:sendAdditionalContactsInternal", -1174637093);
                1Xo r0 = defaultPresenceManager.A0E;
                if (r0.A01() != 0 || defaultPresenceManager.A0D.A01() != 0 || defaultPresenceManager.A0C.A01() != 0 || defaultPresenceManager.A0F.A01() != 0) {
                    defaultPresenceManager.A12 = false;
                } else {
                    if (defaultPresenceManager.A12) {
                        C00j.A01(907950023);
                        i = 1546826478;
                        C00j.A01(i);
                        return 04S.A00;
                    }
                    defaultPresenceManager.A12 = true;
                }
                ArrayList A0s = AnonymousClass001.A0s();
                0WH r02 = defaultPresenceManager.A0B;
                synchronized (r02) {
                    try {
                        0WH r03 = new 0WH(0);
                        r02.clear();
                        Iterator A19 = 1BK.A19(r0.A05());
                        while (A19.hasNext()) {
                            A00(r03, r02, defaultPresenceManager, A0s, A19);
                        }
                        Iterator A192 = 1BK.A19(defaultPresenceManager.A0D.A05());
                        while (A192.hasNext()) {
                            A00(r03, r02, defaultPresenceManager, A0s, A192);
                        }
                        Iterator A193 = 1BK.A19(defaultPresenceManager.A0C.A05());
                        while (A193.hasNext()) {
                            A00(r03, r02, defaultPresenceManager, A0s, A193);
                        }
                        Iterator A194 = 1BK.A19(defaultPresenceManager.A0F.A05());
                        while (A194.hasNext()) {
                            A00(r03, r02, defaultPresenceManager, A0s, A194);
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                if (DefaultPresenceManager.A04(defaultPresenceManager).A02()) {
                    DefaultPresenceManager.A0K(defaultPresenceManager, A0s);
                } else {
                    AnonymousClass294 anonymousClass294 = (AnonymousClass294) 1Br.A0B(defaultPresenceManager.A0R);
                    Integer A00 = ((C1Y1) 1Br.A0B(defaultPresenceManager.A0V)).A00();
                    if (A00 == null) {
                        th = 1BK.A0h();
                        throw th;
                    }
                    if (A00 != 0S2.A00) {
                        3Ks r04 = (3Ks) 1Br.A0B(anonymousClass294.A00);
                        String A002 = 3H4.A00(A00);
                        1UG A08 = 1BK.A08(1Br.A02(r04.A00), "presence_bladerunner_migration_client");
                        if (A08.isSampled() && 1Br.A06(r04.A01).AZl(36315580575327420L, false)) {
                            str = 11T.A02(C04I.A00());
                            A08.A7R("event_id", str);
                            A08.A7R("experiment_cohort", A002);
                            Long valueOf = Long.valueOf(-1);
                            A08.A6H("active_counts", valueOf);
                            A08.A6H("recently_active_counts", valueOf);
                            A08.A7R("event_name", "ADDITIONAL_CONTACTS_REQUEST");
                            A08.BZL();
                        } else {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    defaultPresenceManager.A0k.Ch6(str, A0s);
                }
                C00j.A01(2114280601);
                i = 367916084;
                C00j.A01(i);
                return 04S.A00;
            } catch (Throwable th2) {
                C00j.A01(294832925);
                throw th2;
            }
        } catch (Throwable th3) {
            C00j.A01(5267320);
            throw th3;
        }
    }
}
