package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: Cpg.class */
public final class Cpg implements DHP {
    public final /* synthetic */ C1531Akk A00;

    public Cpg(C1531Akk c1531Akk) {
        this.A00 = c1531Akk;
    }

    public void BxJ() {
        C1531Akk c1531Akk = this.A00;
        c1531Akk.A0J = ImmutableList.of();
        c1531Akk.A0O = false;
        1BK.A1E(c1531Akk.A0a).execute(new D6P(this));
    }

    public void Byh(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        C1531Akk c1531Akk = this.A00;
        c1531Akk.A0J = ImmutableList.copyOf((Collection) list);
        c1531Akk.A0O = !z3;
        1BK.A1E(c1531Akk.A0a).execute(new D6Q(this));
    }
}
