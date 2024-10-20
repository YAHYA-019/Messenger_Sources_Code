package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.06h, reason: invalid class name */
/* loaded from: 06h.class */
public final class C06h {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();
    public final 06Z A01;

    public C06h(06Z r302) {
        this.A01 = r302;
    }

    public final void A00(Bundle bundle, View view, Fragment fragment, boolean z) {
        11T.A0F(view, 1);
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A00(bundle, view, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A02(bundle, view, fragment, r0);
            }
        }
    }

    public final void A01(Bundle bundle, Fragment fragment) {
        Fragment A0X = this.A01.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A01(bundle, fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A02(Bundle bundle, Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A02(bundle, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A03(bundle, fragment, r0);
            }
        }
    }

    public final void A03(Bundle bundle, Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A03(bundle, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A04(bundle, fragment, r0);
            }
        }
    }

    public final void A04(Bundle bundle, Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A04(bundle, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A05(bundle, fragment, r0);
            }
        }
    }

    public final void A05(Fragment fragment) {
        Fragment A0X = this.A01.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A05(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A06(Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Context context = r0.A05.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A06(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A01(context, fragment, r0);
            }
        }
    }

    public final void A07(Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A07(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A0C(fragment, r0);
            }
        }
    }

    public final void A08(Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A08(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A06(fragment, r0);
            }
        }
    }

    public final void A09(Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A09(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A07(fragment, r0);
            }
        }
    }

    public final void A0A(Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A0A(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A08(fragment, r0);
            }
        }
    }

    public final void A0B(Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A0B(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A09(fragment, r0);
            }
        }
    }

    public final void A0C(Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A0C(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A0A(fragment, r0);
            }
        }
    }

    public final void A0D(Fragment fragment, boolean z) {
        06Z r0 = this.A01;
        Fragment A0X = r0.A0X();
        if (A0X != null) {
            A0X.getParentFragmentManager().A0S.A0D(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            0Li r02 = (0Li) it.next();
            if (!z || r02.A01) {
                r02.A00.A0B(fragment, r0);
            }
        }
    }
}
