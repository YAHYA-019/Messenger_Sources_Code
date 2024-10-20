package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.099, reason: invalid class name */
/* loaded from: 099.class */
public abstract class AnonymousClass099 implements 09A {
    public C08k A00;
    public final C08p A01;
    public final Integer A02;
    public final Context A03;
    public final C01s A04;
    public final AnonymousClass094 A05;
    public volatile String A06;
    public volatile String A07;

    public AnonymousClass099(Context context, C01s c01s, AnonymousClass094 anonymousClass094, C08p c08p, Integer num) {
        this.A03 = context;
        this.A01 = c08p;
        this.A02 = num;
        this.A04 = c01s;
        this.A05 = anonymousClass094;
    }

    public abstract String A00();

    public abstract String A01();

    public Set A02() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList("facebook.com", "workplace.com", "pushnotifs.com")));
    }

    public void A03() {
        if (this.A00 == null) {
            C08k c08k = new C08k(new 09H(this));
            this.A00 = c08k;
            AnonymousClass023.A02(c08k, this.A03, (IntentFilter) ((C08l) c08k).A00.get(0), null, "com.facebook.permission.prod.FB_APP_COMMUNICATION", false);
        }
    }

    public void A04() {
        C08k c08k = this.A00;
        if (c08k != null) {
            try {
                this.A03.unregisterReceiver(c08k);
            } catch (IllegalArgumentException e) {
                0fH.A0v(A01(), "Failed to unregister broadcast receiver", e);
            }
            this.A00 = null;
        }
    }

    public abstract void A05(String str, String str2);

    public final boolean A06(String str) {
        if (str != null) {
            if (!str.startsWith("https://")) {
                str = 0Pz.A0W("https://", str);
            }
            try {
                Uri A03 = C0A2.A03(str);
                for (String str2 : A02()) {
                    String host = A03.getHost();
                    if (host != null) {
                        if (!host.equalsIgnoreCase(str2)) {
                            if (host.endsWith(0Pz.A0W(".", str2))) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } catch (SecurityException unused) {
                return false;
            }
        }
        return true;
    }

    public String AWd() {
        return this.A06;
    }

    public Integer AvE() {
        return null;
    }

    public Integer AvF() {
        return null;
    }

    public Integer AvG() {
        return null;
    }

    public Integer AvH() {
        return null;
    }

    public String AyP() {
        return this.A07;
    }

    public Integer B2z() {
        return null;
    }
}
