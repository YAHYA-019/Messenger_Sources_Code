package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.AfL, reason: case insensitive filesystem */
/* loaded from: AfL.class */
public final class C1367AfL extends C0wr {
    public final /* synthetic */ AcQ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367AfL(final 06Z r302, AcQ acQ) {
        new 0NL(r302) { // from class: X.0wr
            public C06c A00 = null;
            public Fragment A01 = null;
            public boolean A02;
            public final 06Z A03;

            {
                this.A03 = r302;
            }

            public void A06(ViewGroup viewGroup) {
                if (viewGroup.getId() != -1) {
                    return;
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("ViewPager with adapter ");
                A0k.append(this);
                throw AnonymousClass002.A0F(" requires a view id", A0k);
            }

            public void A0B(ViewGroup viewGroup) {
                C06c c06c = this.A00;
                if (c06c != null) {
                    if (!this.A02) {
                        try {
                            this.A02 = true;
                            c06c.A07();
                        } finally {
                            this.A02 = false;
                        }
                    }
                    this.A00 = null;
                }
            }

            public Object A0E(ViewGroup viewGroup, int i) {
                if (this.A00 == null) {
                    this.A00 = new C06c(this.A03);
                }
                long A0I = A0I(i);
                Fragment A0b = this.A03.A0b(AnonymousClass001.A0h(0Pz.A1D("android:switcher:", ":", viewGroup.getId()), A0I));
                if (A0b != null) {
                    this.A00.A0F(A0b);
                } else {
                    A0b = A0J(i);
                    this.A00.A0P(A0b, AnonymousClass001.A0h(0Pz.A1D("android:switcher:", ":", viewGroup.getId()), A0I), viewGroup.getId());
                }
                if (A0b != this.A01) {
                    A0b.setMenuVisibility(false);
                    A0b.setUserVisibleHint(false);
                }
                return A0b;
            }

            public void A0F(ViewGroup viewGroup, Object obj, int i) {
                Fragment fragment = (Fragment) obj;
                Fragment fragment2 = this.A01;
                if (fragment != fragment2) {
                    if (fragment2 != null) {
                        fragment2.setMenuVisibility(false);
                        this.A01.setUserVisibleHint(false);
                    }
                    fragment.setMenuVisibility(true);
                    fragment.setUserVisibleHint(true);
                    this.A01 = fragment;
                }
            }

            public void A0G(ViewGroup viewGroup, Object obj, int i) {
                Fragment fragment = (Fragment) obj;
                C06c c06c = this.A00;
                if (c06c == null) {
                    c06c = new C06c(this.A03);
                    this.A00 = c06c;
                }
                c06c.A0G(fragment);
                if (fragment.equals(this.A01)) {
                    this.A01 = null;
                }
            }

            public boolean A0H(View view, Object obj) {
                return AnonymousClass001.A1W(((Fragment) obj).getView(), view);
            }

            public long A0I(int i) {
                return i;
            }

            public abstract Fragment A0J(int i);
        };
        this.A00 = acQ;
    }

    public CharSequence A08(int i) {
        AcQ acQ = this.A00;
        return 4YU.A0D(acQ.A13).getString(AcQ.A0R(acQ)[i].titleResId);
    }

    public int A0C() {
        return AcQ.A0R(this.A00).length;
    }

    @Override // X.C0wr
    public Fragment A0J(int i) {
        AcQ acQ = this.A00;
        BP5 bp5 = AcQ.A0R(acQ)[i];
        C04r c04r = acQ.A0u;
        return c04r.containsKey(bp5) ? (Fragment) c04r.get(bp5) : AbL.A0I(bp5);
    }
}
