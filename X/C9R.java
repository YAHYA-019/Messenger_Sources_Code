package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: C9R.class */
public abstract class C9R {
    public final ImmutableList.Builder A00 = ImmutableList.builder();
    public final C1qb A01;
    public final 2YJ A02;
    public final C9Z A03;
    public final String A04;

    public C9R(C1qb c1qb, 2YJ r303, C9Z c9z, String str) {
        this.A04 = str;
        this.A03 = c9z;
        this.A02 = r303;
        this.A01 = c1qb;
    }

    public void A01() {
        if (!(this instanceof B8E)) {
            B8F b8f = (B8F) this;
            b8f.A03 = true;
            b8f.A06.A08(b8f.A05, new Cmv(b8f), b8f.A08, Long.MAX_VALUE);
            return;
        }
        B8E b8e = (B8E) this;
        b8e.A02 = true;
        C10264sx c10264sx = b8e.A04;
        String str = b8e.A07;
        FbUserSession fbUserSession = b8e.A03;
        BhK bhK = new BhK(b8e);
        if (c10264sx.A01 == null) {
            c10264sx.A01 = new BD1(fbUserSession, c10264sx, bhK, (C00683ob) 4YU.A0o(fbUserSession, c10264sx.A02, 67629), str);
            C10264sx.A03(fbUserSession, c10264sx);
        }
        c10264sx.A09(fbUserSession, null, str, null, 1);
    }

    public boolean A02() {
        boolean z;
        if (this instanceof B8E) {
            z = ((B8E) this).A01;
        } else {
            B8F b8f = (B8F) this;
            if (b8f.A01) {
                return true;
            }
            z = false;
            if (b8f.A07.A02()) {
                return true;
            }
        }
        return z;
    }

    public void A03() {
        B8E b8e = (B8E) this;
        b8e.A02 = true;
        C1e c1e = b8e.A06;
        if (c1e != null) {
            c1e.A00(1Fj.A01(((C9R) b8e).A00));
        }
        b8e.A04.A09(b8e.A03, null, b8e.A07, b8e.A00, 1);
    }

    public void A04(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        if (this instanceof B8F) {
            ((B8F) this).A03 = false;
        } else {
            ((B8E) this).A02 = false;
        }
        Iterator it = immutableList.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            MessageSearchThreadModel messageSearchThreadModel = (MessageSearchThreadModel) next;
            55L A02 = this.A03.A02(this.A02, messageSearchThreadModel, this.A04, i2);
            11T.A0A(A02);
            this.A00.m11011add((Object) A02);
            i = i3;
        }
    }
}
