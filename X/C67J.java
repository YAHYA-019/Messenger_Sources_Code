package X;

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.67J, reason: invalid class name */
/* loaded from: 67J.class */
public abstract class C67J {
    public final java.util.Map A00 = new HashMap();

    public 0D2 A00(Context context, 06Z r303, Object obj, String str) {
        return A01(r303, obj, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.0D2 A01(X.06Z r302, java.lang.Object r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67J.A01(X.06Z, java.lang.Object, java.lang.String):X.0D2");
    }

    public void A02() {
        if (!(this instanceof 7Tt)) {
            67I r0 = (67I) this;
            C67K c67k = r0.A03;
            C67M c67m = r0.A02;
            Collection collection = (Collection) ((67L) c67k).A00.get(C7v4.class);
            if (collection != null) {
                collection.clear();
            }
            c67k.A05(c67m);
            return;
        }
        7Tt r02 = (7Tt) this;
        C00i c00i = r02.A01;
        67L r03 = (67L) c00i.get();
        7Tu r04 = r02.A02;
        Collection collection2 = (Collection) r03.A00.get(C7v4.class);
        if (collection2 != null) {
            collection2.clear();
        }
        ((67L) c00i.get()).A05(r04);
    }

    public void A03(06Z r302, String str) {
        A01(r302, null, str);
    }

    public void A04(67O r302, String str, String str2) {
        String string = this instanceof 67I ? ((67I) this).A01.getString(2131968267) : ((Context) ((7Tt) this).A00.get()).getString(2131968281);
        Integer num = 0S2.A00;
        67P r0 = new 67P(this);
        r0.A04 = str;
        r0.A05 = string;
        r0.A03 = str2;
        r0.A01 = r302;
        r0.A02 = num;
        this.A00.put(str, r0);
    }

    public void A05(67O r302, String str, String str2, String str3) {
        Integer num = 0S2.A00;
        67P r0 = new 67P(this);
        r0.A04 = str;
        r0.A05 = str2;
        r0.A03 = str3;
        r0.A01 = r302;
        r0.A02 = num;
        this.A00.put(str, r0);
    }

    public boolean A06(String str) {
        boolean z;
        if (this instanceof 67I) {
            z = ((67I) this).A04.A05(str);
        } else {
            z = false;
            if (str == "sms_thread_interstitial") {
                return true;
            }
        }
        return z;
    }
}
