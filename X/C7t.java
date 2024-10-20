package X;

import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C7t.class */
public final class C7t {
    public ImmutableList A00;
    public final CIu A01;
    public final FbSharedPreferences A02;
    public final java.util.Map A03;

    public C7t() {
        FbSharedPreferences A0i = AbJ.A0i();
        1HH A0Q = AbF.A0Q(FbInjector.A00(), 83864);
        this.A03 = AnonymousClass001.A0u();
        this.A02 = A0i;
        this.A01 = (CIu) A0Q.get();
    }

    public void A00(GNv gNv) {
        synchronized (this) {
            2JY r0 = (2JY) gNv;
            this.A03.put(r0.A0k(), gNv);
            CIu cIu = this.A01;
            if (cIu.A01(gNv)) {
                ImmutableList immutableList = this.A00;
                if (immutableList != null) {
                    ArrayList A17 = 1BK.A17(immutableList);
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = A17.iterator();
                    while (it.hasNext()) {
                        2JY r02 = (GNv) it.next();
                        String A0k = r02.A0k();
                        if (A0k != null && A0k.equals(r0.A0k())) {
                            A0s.add(r02);
                        }
                    }
                    A17.removeAll(A0s);
                    A17.add(gNv);
                    A01(cIu.A00(AbG.A0y(4YU.A0h(), A17)));
                }
            }
        }
    }

    public void A01(ImmutableList immutableList) {
        synchronized (this) {
            this.A00 = immutableList;
            int i = 0;
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                if (this.A01.A03((GNv) it.next())) {
                    i++;
                }
            }
            1Ql edit = this.A02.edit();
            edit.CaE(BZt.A01, i);
            edit.commit();
        }
    }
}
