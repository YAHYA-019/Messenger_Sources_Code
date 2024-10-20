package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0wp, reason: invalid class name */
/* loaded from: 0wp.class */
public abstract class C0wp extends 0NL {
    public boolean A04;
    public final 06Z A05;
    public C06c A00 = null;
    public ArrayList A03 = AnonymousClass001.A0s();
    public ArrayList A02 = AnonymousClass001.A0s();
    public Fragment A01 = null;

    public C0wp(06Z r302) {
        this.A05 = r302;
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

    public Parcelable A07() {
        Bundle bundle;
        ArrayList arrayList = this.A03;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList2 = this.A02;
            if (i2 >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = (Fragment) arrayList2.get(i2);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.A05.A11(bundle, fragment, 0Pz.A0T("f", i2));
            }
            i = i2 + 1;
        }
    }

    public void A0A(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.A03;
            arrayList.clear();
            ArrayList arrayList2 = this.A02;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add(parcelable2);
                }
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                if (A0i.startsWith("f")) {
                    int parseInt = Integer.parseInt(A0i.substring(1));
                    Fragment A0Z = this.A05.A0Z(bundle, A0i);
                    if (A0Z == null) {
                        android.util.Log.w("FragmentStatePagerAdapt", 0Pz.A0W("Bad fragment at key ", A0i));
                    } else {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        A0Z.setMenuVisibility(false);
                        arrayList2.set(parseInt, A0Z);
                    }
                }
            }
        }
    }

    public void A0B(ViewGroup viewGroup) {
        C06c c06c = this.A00;
        if (c06c != null) {
            if (!this.A04) {
                try {
                    this.A04 = true;
                    c06c.A07();
                } finally {
                    this.A04 = false;
                }
            }
            this.A00 = null;
        }
    }

    public Object A0E(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Object obj;
        ArrayList arrayList = this.A02;
        if (arrayList.size() > i && (obj = arrayList.get(i)) != null) {
            return obj;
        }
        if (this.A00 == null) {
            this.A00 = new C06c(this.A05);
        }
        Fragment A0I = A0I(i);
        ArrayList arrayList2 = this.A03;
        if (arrayList2.size() > i && (savedState = (Fragment.SavedState) arrayList2.get(i)) != null) {
            A0I.setInitialSavedState(savedState);
        }
        while (arrayList.size() <= i) {
            arrayList.add(null);
        }
        A0I.setMenuVisibility(false);
        A0I.setUserVisibleHint(false);
        arrayList.set(i, A0I);
        this.A00.A0L(A0I, viewGroup.getId());
        return A0I;
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
        ArrayList arrayList;
        Fragment fragment = (Fragment) obj;
        if (this.A00 == null) {
            this.A00 = new C06c(this.A05);
        }
        while (true) {
            arrayList = this.A03;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, fragment.isAdded() ? this.A05.A0W(fragment) : null);
        this.A02.set(i, null);
        this.A00.A0I(fragment);
        if (fragment.equals(this.A01)) {
            this.A01 = null;
        }
    }

    public boolean A0H(View view, Object obj) {
        return AnonymousClass001.A1W(((Fragment) obj).getView(), view);
    }

    public abstract Fragment A0I(int i);
}
