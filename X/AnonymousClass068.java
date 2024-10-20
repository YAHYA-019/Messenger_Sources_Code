package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.068, reason: invalid class name */
/* loaded from: 068.class */
public final class AnonymousClass068 {
    public Bundle A00;
    public boolean A01;
    public boolean A03;
    public C3Ug A04;
    public final 0QJ A05 = new 0QJ();
    public boolean A02 = true;

    public final Bundle A00(String str) {
        11T.A0F(str, 0);
        if (!this.A03) {
            throw AnonymousClass001.A0N("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.A00;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.A00;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.A00 = null;
        return bundle2;
    }

    public final 06L A01() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            11T.A08(A0z);
            Object key = A0z.getKey();
            06L r0 = (06L) A0z.getValue();
            if (11T.A0O(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return r0;
            }
        }
        return null;
    }

    public final void A02(06L r302, String str) {
        11T.A0F(str, 0);
        11T.A0F(r302, 1);
        if (this.A05.A02(str, r302) != null) {
            throw AnonymousClass001.A0L("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(Class cls) {
        if (!this.A02) {
            throw AnonymousClass001.A0N("Can not perform this action after onSaveInstanceState");
        }
        06L r305 = this.A04;
        if (r305 == null) {
            r305 = new 06L(this) { // from class: X.3Ug
                public final Set A00 = new LinkedHashSet();

                {
                    this.A02(this, "androidx.savedstate.Restarter");
                }

                public final void A00(String str) {
                    this.A00.add(str);
                }

                public Bundle saveState() {
                    Bundle A05 = 1BK.A05();
                    A05.putStringArrayList("classes_to_restore", 1BK.A17(this.A00));
                    return A05;
                }
            };
        }
        this.A04 = r305;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            C3Ug c3Ug = this.A04;
            if (c3Ug != null) {
                String name = cls.getName();
                11T.A0A(name);
                c3Ug.A00(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(0Pz.A0j("Class ", cls.getSimpleName(), " must have default constructor in order to be automatically recreated"), e);
        }
    }
}
