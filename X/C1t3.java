package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.1t3, reason: invalid class name */
/* loaded from: 1t3.class */
public final class C1t3 {
    public boolean A00;
    public boolean A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1HN A05;
    public final Set A06;

    public C1t3(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A03 = 1Bq.A00(33013);
        this.A02 = fbUserSession;
        this.A04 = 1Bu.A00(65818);
        this.A05 = new 3bR(this, 12);
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        11T.A0A(newSetFromMap);
        this.A06 = newSetFromMap;
    }

    public final void A00(C1t1 c1t1) {
        synchronized (this) {
            11T.A0F(c1t1, 0);
            String str = this.A02.A02;
            if (!this.A01) {
                ((FbSharedPreferences) this.A03.A00.get()).CcV(this.A05, 1G9.A05(C1ou.A02, str));
                this.A01 = true;
            }
            if (!this.A00 && ((2Ls) this.A04.A00.get()).A00()) {
                ((FbSharedPreferences) this.A03.A00.get()).CcV(this.A05, 1G9.A05(C1ou.A01, str));
                this.A00 = true;
            }
            this.A06.add(c1t1);
        }
    }

    public final void A01(C1t1 c1t1) {
        synchronized (this) {
            11T.A0F(c1t1, 0);
            Set set = this.A06;
            set.remove(c1t1);
            if (set.isEmpty()) {
                String str = this.A02.A02;
                if (this.A01) {
                    ((FbSharedPreferences) this.A03.A00.get()).D63(this.A05, 1G9.A05(C1ou.A02, str));
                    this.A01 = false;
                }
                if (this.A00) {
                    ((FbSharedPreferences) this.A03.A00.get()).D63(this.A05, 1G9.A05(C1ou.A01, str));
                    this.A00 = false;
                }
            }
        }
    }
}
