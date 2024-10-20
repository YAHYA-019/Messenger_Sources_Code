package X;

import android.text.SpannableStringBuilder;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Nv, reason: invalid class name */
/* loaded from: 4Nv.class */
public final class C4Nv {
    public Set A00;
    public final FbSharedPreferences A01;
    public final 1G2 A02;

    public C4Nv(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        this.A01 = fbSharedPreferences;
        r303.getClass();
        this.A02 = r303;
    }

    private void A00() {
        1Ql edit;
        synchronized (this) {
            Set set = this.A00;
            if (set == null || set.isEmpty()) {
                edit = this.A01.edit();
                edit.Cdj(this.A02);
            } else {
                ArrayList arrayList = new ArrayList(this.A00);
                SpannableStringBuilder A02 = 1JF.A02(String.valueOf(','), arrayList.subList(Math.max(0, arrayList.size() - 100), Math.min(arrayList.size(), arrayList.size())));
                edit = this.A01.edit();
                edit.CaL(this.A02, A02.toString());
            }
            edit.commit();
        }
    }

    public static void A01(C4Nv c4Nv) {
        List A08;
        synchronized (c4Nv) {
            if (c4Nv.A00 == null) {
                String BD0 = c4Nv.A01.BD0(c4Nv.A02);
                if (BD0 == null) {
                    new ArrayList();
                } else {
                    A08 = 1JF.A08(BD0, ',');
                }
                c4Nv.A00 = new LinkedHashSet(A08);
            }
        }
    }

    public void A02(String str) {
        synchronized (this) {
            if (str != null) {
                A01(this);
                Set set = this.A00;
                if (set != null && set.add(str)) {
                    A00();
                }
            }
        }
    }

    public void A03(String str) {
        synchronized (this) {
            if (str != null) {
                A01(this);
                Set set = this.A00;
                if (set != null && set.remove(str)) {
                    A00();
                }
            }
        }
    }

    public boolean A04(String str) {
        boolean z;
        synchronized (this) {
            z = false;
            if (str != null) {
                A01(this);
                Set set = this.A00;
                if (set != null) {
                    if (set.contains(str)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }
}
