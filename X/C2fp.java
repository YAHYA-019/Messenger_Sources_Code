package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.presence.DefaultPresenceManager;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.2fp, reason: invalid class name */
/* loaded from: 2fp.class */
public final class C2fp {
    public 1BY A00;
    public final C00i A02;
    public final Comparator A04 = new C3ip(this, 2);
    public final C00i A03 = new 1BQ(65816);
    public UserKey A01 = null;

    public C2fp(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A02 = new 1MV(fbUserSession, (1BY) null, 16907);
    }

    public ImmutableList A00(ImmutableList immutableList) {
        Long Asz;
        int i;
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        1XZ r0 = (1XZ) 1Bi.A03(65723);
        if (r0.BUJ()) {
            UserKey userKey = this.A01;
            if (userKey == null) {
                userKey = (UserKey) 1Bn.A0E((Context) null, this.A00, 83436);
                this.A01 = userKey;
            }
            if (userKey != null) {
                ArrayList arrayList = new ArrayList();
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    UserKey userKey2 = (UserKey) it.next();
                    if (!userKey.equals(userKey2) && (Asz = r0.Asz(userKey2)) != null) {
                        long now = c0dp.now() - Asz.longValue();
                        if (((DefaultPresenceManager) r0).B4F(userKey2, -1).A06 != 0S2.A00) {
                            if (now / 1000 >= 60) {
                                C1mr c1mr = (C1mr) this.A03.get();
                                if (C1mr.A00(c1mr).AZk(36312831796319279L)) {
                                    1Br.A0C(c1mr.A00);
                                    i = 60;
                                } else {
                                    long Av9 = C1mr.A00(c1mr).Av9(1GD.A07, 36591987491012842L);
                                    i = 60;
                                    int i2 = (int) Av9;
                                    if (i2 == Av9) {
                                        i = i2;
                                    }
                                }
                                if (now <= i * 60000) {
                                    arrayList.add(new Pair(userKey2, Long.valueOf(now)));
                                }
                            }
                        }
                    }
                }
                Collections.sort(arrayList, this.A04);
                ImmutableList.Builder builder = new ImmutableList.Builder();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    builder.m11011add(((Pair) it2.next()).first);
                }
                return builder.build();
            }
        }
        return ImmutableList.of();
    }
}
