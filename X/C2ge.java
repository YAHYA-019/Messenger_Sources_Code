package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.List;

/* renamed from: X.2ge, reason: invalid class name */
/* loaded from: 2ge.class */
public final class C2ge {
    public final 1Br A00 = 1Bq.A00(33013);
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;

    public C2ge() {
        1Br A00 = 1Bq.A00(66351);
        this.A02 = A00;
        this.A03 = 1Lm.A01(((1Fv) A00.A00.get()).A04(), 100241);
        this.A01 = 1Bq.A00(66803);
    }

    public static final 1G2 A00(C2ge c2ge, String str, boolean z) {
        1G2 A0D = ((1M0) c2ge.A03.A00.get()).A00("inbox_follow_up_tag/").A0D(z ? "sender/" : "receiver/").A0D(str);
        11T.A0A(A0D);
        return A0D;
    }

    public static final 03Y A01(C2ge c2ge, String str, boolean z) {
        String BD0 = ((FbSharedPreferences) c2ge.A00.A00.get()).BD0(A00(c2ge, str, z));
        if (BD0 == null) {
            BD0 = "";
        }
        List A0M = 0CU.A0M(BD0, new String[]{"_"}, 0);
        if (A0M.size() == 2) {
            return new 03Y(A0M.get(0), Integer.valueOf(Integer.parseInt((String) A0M.get(1))));
        }
        return null;
    }

    public final void A02(String str, boolean z) {
        03Y A01 = A01(this, str, z);
        if (A01 != null) {
            1Ql edit = ((FbSharedPreferences) this.A00.A00.get()).edit();
            edit.CaL(A00(this, str, z), 0Pz.A0W((String) A01.first, "_10"));
            edit.commit();
        }
    }
}
