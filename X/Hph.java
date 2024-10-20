package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hph.class */
public final class Hph {
    public LifecycleEventObserver A00;
    public 2N9 A01;
    public HFy A02;
    public ViewPager2 A03;
    public long A04 = -1;
    public final /* synthetic */ GWk A05;

    public Hph(GWk gWk) {
        this.A05 = gWk;
    }

    public void A00(boolean z) {
        Fragment fragment;
        GWk gWk = this.A05;
        06Z r0 = gWk.A07;
        if (r0.A1U() || this.A03.A08.A02 != 0) {
            return;
        }
        C00p c00p = gWk.A04;
        if (c00p.A00() == 0) {
            return;
        }
        gWk.getItemCount();
        int i = this.A03.A00;
        if (i >= gWk.getItemCount()) {
            return;
        }
        long j = i;
        if ((j == this.A04 && !z) || (fragment = (Fragment) c00p.A05(j)) == null || !fragment.isAdded()) {
            return;
        }
        this.A04 = j;
        C06c c06c = new C06c(r0);
        Fragment fragment2 = null;
        ArrayList A0s = AnonymousClass001.A0s();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= c00p.A00()) {
                if (fragment2 != null) {
                    c06c.A0N(fragment2, Lifecycle.State.RESUMED);
                    Hwx hwx = gWk.A00;
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    Iterator it = hwx.A00.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass001.A0Q("onFragmentMaxLifecyclePreUpdated");
                    }
                    A0s.add(A0s2);
                }
                if (c06c.A0C.isEmpty()) {
                    return;
                }
                c06c.A06();
                Collections.reverse(A0s);
                Iterator it2 = A0s.iterator();
                while (it2.hasNext()) {
                    Hwx.A00((List) it2.next());
                }
                return;
            }
            long A02 = c00p.A02(i3);
            Fragment fragment3 = (Fragment) c00p.A04(i3);
            if (fragment3.isAdded()) {
                if (A02 != this.A04) {
                    c06c.A0N(fragment3, Lifecycle.State.STARTED);
                    Hwx hwx2 = gWk.A00;
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    Iterator it3 = hwx2.A00.iterator();
                    if (it3.hasNext()) {
                        it3.next();
                        throw AnonymousClass001.A0Q("onFragmentMaxLifecyclePreUpdated");
                    }
                    A0s.add(A0s3);
                } else {
                    fragment2 = fragment3;
                }
                fragment3.setMenuVisibility(AnonymousClass001.A1O((A02 > this.A04 ? 1 : (A02 == this.A04 ? 0 : -1))));
            }
            i2 = i3 + 1;
        }
    }
}
