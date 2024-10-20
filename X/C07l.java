package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.07l, reason: invalid class name */
/* loaded from: 07l.class */
public final class C07l extends ViewModel {
    public static final ViewModelProvider.Factory A06 = new ViewModelProvider.Factory() { // from class: X.07m
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
            return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls) {
            return new C07l(true);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, C1j9 c1j9) {
            return ViewModelProvider.Factory.CC.$default$create(this, cls, c1j9);
        }
    };
    public final boolean A05;
    public final HashMap A03 = new HashMap();
    public final HashMap A02 = new HashMap();
    public final HashMap A04 = new HashMap();
    public boolean A00 = false;
    public boolean A01 = false;

    public C07l(boolean z) {
        this.A05 = z;
    }

    public static C07l A00(ViewModelStore viewModelStore) {
        return (C07l) new ViewModelProvider(viewModelStore, A06).get(C07l.class);
    }

    private void A01(String str, boolean z) {
        HashMap hashMap = this.A02;
        C07l c07l = (C07l) hashMap.get(str);
        if (c07l != null) {
            if (z) {
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.addAll(c07l.A02.keySet());
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    c07l.A09(AnonymousClass001.A0i(it), true);
                }
            }
            c07l.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.A04;
        ViewModelStore viewModelStore = (ViewModelStore) hashMap2.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            hashMap2.remove(str);
        }
    }

    public Fragment A02(String str) {
        return (Fragment) this.A03.get(str);
    }

    public C07l A03(Fragment fragment) {
        HashMap hashMap = this.A02;
        C07l c07l = (C07l) hashMap.get(fragment.mWho);
        if (c07l == null) {
            c07l = new C07l(this.A05);
            hashMap.put(fragment.mWho, c07l);
        }
        return c07l;
    }

    public ViewModelStore A04(Fragment fragment) {
        HashMap hashMap = this.A04;
        ViewModelStore viewModelStore = (ViewModelStore) hashMap.get(fragment.mWho);
        if (viewModelStore == null) {
            viewModelStore = new ViewModelStore();
            hashMap.put(fragment.mWho, viewModelStore);
        }
        return viewModelStore;
    }

    public ArrayList A05() {
        return new ArrayList(this.A03.values());
    }

    public void A06(Fragment fragment) {
        String A0Z;
        if (!this.A01) {
            HashMap hashMap = this.A03;
            if (hashMap.containsKey(fragment.mWho)) {
                return;
            }
            hashMap.put(fragment.mWho, fragment);
            if (!06Z.A0O(2)) {
                return;
            } else {
                A0Z = AnonymousClass001.A0Z(fragment, "Updating retained Fragments: Added ", AnonymousClass001.A0k());
            }
        } else if (!06Z.A0O(2)) {
            return;
        } else {
            A0Z = "Ignoring addRetainedFragment as the state is already saved";
        }
        android.util.Log.v("FragmentManager", A0Z);
    }

    public void A07(Fragment fragment) {
        String A0Z;
        if (this.A01) {
            if (!06Z.A0O(2)) {
                return;
            } else {
                A0Z = "Ignoring removeRetainedFragment as the state is already saved";
            }
        } else if (this.A03.remove(fragment.mWho) == null || !06Z.A0O(2)) {
            return;
        } else {
            A0Z = AnonymousClass001.A0Z(fragment, "Updating retained Fragments: Removed ", AnonymousClass001.A0k());
        }
        android.util.Log.v("FragmentManager", A0Z);
    }

    public void A08(Fragment fragment, boolean z) {
        if (06Z.A0O(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            android.util.Log.d("FragmentManager", sb.toString());
        }
        A01(fragment.mWho, z);
    }

    public void A09(String str, boolean z) {
        if (06Z.A0O(3)) {
            android.util.Log.d("FragmentManager", 0Pz.A0W("Clearing non-config state for saved state of Fragment ", str));
        }
        A01(str, z);
    }

    public void A0A(boolean z) {
        this.A01 = z;
    }

    public boolean A0B() {
        return this.A00;
    }

    public boolean A0C(Fragment fragment) {
        boolean z = true;
        if (this.A03.containsKey(fragment.mWho) && this.A05) {
            z = this.A00;
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C07l c07l = (C07l) obj;
            if (!this.A03.equals(c07l.A03) || !this.A02.equals(c07l.A02) || !this.A04.equals(c07l.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A02, this.A03.hashCode() * 31) + this.A04.hashCode();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        if (06Z.A0O(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            android.util.Log.d("FragmentManager", sb.toString());
        }
        this.A00 = true;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("FragmentManagerViewModel{");
        A0o.append(Integer.toHexString(System.identityHashCode(this)));
        A0o.append("} Fragments (");
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            A0o.append(it.next());
            if (it.hasNext()) {
                A0o.append(", ");
            }
        }
        A0o.append(") Child Non Config (");
        Iterator it2 = this.A02.keySet().iterator();
        while (it2.hasNext()) {
            A0o.append(AnonymousClass001.A0i(it2));
            if (it2.hasNext()) {
                A0o.append(", ");
            }
        }
        A0o.append(") ViewModelStores (");
        Iterator it3 = this.A04.keySet().iterator();
        while (it3.hasNext()) {
            A0o.append(AnonymousClass001.A0i(it3));
            if (it3.hasNext()) {
                A0o.append(", ");
            }
        }
        return AnonymousClass001.A0g(A0o, ')');
    }
}
