package com.facebook.resources.impl;

import X.0fH;
import X.11T;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1FS;
import X.1Ld;
import X.1Li;
import X.1MD;
import X.3A2;
import X.AnonymousClass001;
import X.C00i;
import X.C1sw;
import android.content.res.Resources;
import com.facebook.user.model.User;
import java.util.Iterator;

/* loaded from: StringResourcesFetcher.class */
public final class StringResourcesFetcher {
    public final C00i A03 = new 1BQ(67197);
    public final C00i A01 = new 1BV(33033);
    public final C00i A02 = new 1BQ(16590);
    public Integer A00 = null;

    public static int A00(StringResourcesFetcher stringResourcesFetcher) {
        Integer num = stringResourcesFetcher.A00;
        if (num == null) {
            User user = (User) 1Bn.A0A(83430);
            num = Integer.valueOf(user != null ? user.A0C : 0);
            stringResourcesFetcher.A00 = num;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public String A01(int i) {
        if (((-65536) & i) != 2131951616) {
            return ((Resources) this.A01.get()).getString(i);
        }
        int A00 = A00(this);
        final 1FS r0 = (1FS) this.A03.get();
        1FS.A02(r0, "getActiveResources");
        Iterator it = new Iterator() { // from class: X.1su
            public int A00 = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                boolean z = false;
                if (this.A00 < 4) {
                    z = true;
                }
                return z;
            }

            @Override // java.util.Iterator
            public Object next() {
                String str;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                if (i2 == 0) {
                    return r0.A0C;
                }
                if (i2 == 1) {
                    1L7 r02 = ((1Kt) r0.A06.get()).A00;
                    1L7.A00(r02);
                    1Lg r03 = (1Lg) r02.A01.get();
                    if (r03 != null) {
                        return r03.A03;
                    }
                    return null;
                }
                if (i2 == 2) {
                    1L7 r04 = ((1Kt) r0.A06.get()).A00;
                    1L7.A00(r04);
                    1Lg r05 = (1Lg) r04.A01.get();
                    if (r05 != null) {
                        return r05.A04;
                    }
                    return null;
                }
                if (i2 != 3) {
                    throw new IllegalStateException();
                }
                1L7 r06 = ((1Kt) r0.A06.get()).A00;
                Object obj = null;
                1L7.A00(r06);
                if (r06.A01.get() != null) {
                    obj = 1Lg.A05.get();
                    str = obj == null ? "FRSC English strings not loaded" : "No FRSC language pack loader";
                    return obj;
                }
                0fH.A0o("FrscLanguagePackLoader", str);
                return obj;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw AnonymousClass001.A0p();
            }
        };
        while (it.hasNext()) {
            1MD r02 = (1Li) it.next();
            if (r02 != null) {
                try {
                    String A03 = r02.A03(i, A00);
                    if (A03 != null) {
                        return A03;
                    }
                } catch (IndexOutOfBoundsException e) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    1BL.A1M("IndexOutOfBoundsException: (ID #0x", A0k, i);
                    A0k.append(", gender : ");
                    A0k.append(A00);
                    A0k.append(", bundle type: ");
                    A0k.append(((r02 instanceof 3A2) || !(r02 instanceof 1MD)) ? "qt" : r02.A03);
                    0fH.A0r("i18n_StringResourcesFetcher", AnonymousClass001.A0d(")", A0k), e);
                }
            }
        }
        try {
            String string = ((Resources) this.A01.get()).getString(i);
            1Ld r03 = (1Ld) this.A02.get();
            11T.A0F("arsc", 2);
            C1sw.A00(r03, String.valueOf(i), "arsc", 1Ld.A04, A00);
            return string;
        } catch (Resources.NotFoundException e2) {
            1Ld r04 = (1Ld) this.A02.get();
            11T.A0F("not_found_error", 2);
            C1sw.A00(r04, String.valueOf(i), "not_found_error", 1Ld.A04, A00);
            throw e2;
        }
    }
}
