package X;

import android.os.Bundle;
import java.util.Set;

/* loaded from: M99.class */
public final class M99 extends C00q implements 0Be {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M99(Bundle bundle, KuS kuS, C11444wi c11444wi, String str, java.util.Map map, Set set, int i) {
        super(4);
        this.A00 = i;
        this.A01 = kuS;
        this.A04 = c11444wi;
        this.A03 = map;
        this.A02 = set;
        this.A06 = str;
        this.A05 = bundle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C11444wi c11444wi;
        String str;
        int i = this.A00;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        boolean A1V = AnonymousClass001.A1V(obj3);
        java.util.Map map = (java.util.Map) obj4;
        11T.A0F(str2, 0);
        1BK.A1J(str3, 1, map);
        boolean A0b = 0CV.A0b(str3, "PROMPTED_", false);
        if (1 - i != 0) {
            if (A0b) {
                ((KuS) this.A01).A04(true);
            }
            c11444wi = (C11444wi) this.A04;
            str = "save";
        } else {
            if (A0b) {
                ((KuS) this.A01).A04(true);
            }
            c11444wi = (C11444wi) this.A04;
            str = "usage";
        }
        java.util.Map map2 = (java.util.Map) this.A03;
        Set set = (Set) this.A02;
        String str4 = this.A06;
        c11444wi.A03((Bundle) this.A05, str3, str, str2, str4, map2, map, set, A1V);
        return 04S.A00;
    }
}
