package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.06f, reason: invalid class name */
/* loaded from: 06f.class */
public final class C06f extends C06g {
    public final /* synthetic */ 06Z A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06f(06Z r302) {
        super(false);
        this.A00 = r302;
    }

    public static void A00(C06f c06f, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(true);
        sb.append(" fragment manager ");
        sb.append(c06f.A00);
    }

    @Override // X.C06g
    public void A02() {
        if (06Z.A0O(3)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A00(this, "handleOnBackCancelled. PREDICTIVE_BACK = ", A0k);
            android.util.Log.d("FragmentManager", A0k.toString());
        }
        06Z r0 = this.A00;
        C06c c06c = r0.A01;
        if (c06c != null) {
            c06c.A0J = false;
            0Tt r02 = new 0Tt(r0);
            ArrayList arrayList = c06c.A0B;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
                c06c.A0B = arrayList;
            }
            arrayList.add(r02);
            C06c.A00(c06c, false);
            r0.A0t();
        }
        r0.A01 = null;
    }

    @Override // X.C06g
    public void A03() {
        if (06Z.A0O(3)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A00(this, "handleOnBackPressed. PREDICTIVE_BACK = ", A0k);
            android.util.Log.d("FragmentManager", A0k.toString());
        }
        this.A00.A0u();
    }

    @Override // X.C06g
    public void A04(0Q0 r302) {
        if (06Z.A0O(2)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A00(this, "handleOnBackProgressed. PREDICTIVE_BACK = ", A0k);
            AnonymousClass001.A17(A0k);
        }
        06Z r0 = this.A00;
        C06c c06c = r0.A01;
        if (c06c != null) {
            Iterator it = r0.A0j(new ArrayList(Collections.singletonList(c06c)), 0, 1).iterator();
            while (it.hasNext()) {
                C0Am c0Am = (C0Am) it.next();
                if (06Z.A0O(2)) {
                    android.util.Log.v("FragmentManager", 0Pz.A0S("SpecialEffectsController: Processing Progress ", r302.A00));
                }
                List list = c0Am.A04;
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    0QU.A0t(((C0Ao) it2.next()).A0A, A0s);
                }
                List A0V = 0QD.A0V(0QD.A0f(A0s));
                int size = A0V.size();
                for (int i = 0; i < size; i++) {
                    ((0PC) A0V.get(i)).A07(c0Am.A02, r302);
                }
            }
            Iterator it3 = r0.A0A.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C06g
    public void A05(0Q0 r302) {
        if (06Z.A0O(3)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A00(this, "handleOnBackStarted. PREDICTIVE_BACK = ", A0k);
            android.util.Log.d("FragmentManager", A0k.toString());
        }
        final 06Z r0 = this.A00;
        06Z.A0H(r0);
        r0.A1M(new C06d() { // from class: X.0wu
            @Override // X.C06d
            public boolean AU4(ArrayList arrayList, ArrayList arrayList2) {
                06Z r02 = r0;
                boolean A1e = r02.A1e(arrayList, arrayList2);
                ArrayList arrayList3 = r02.A0A;
                if (!arrayList3.isEmpty() && arrayList.size() > 0) {
                    boolean A1V = AnonymousClass001.A1V(arrayList2.get(arrayList.size() - 1));
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.addAll(06Z.A06((C06c) it.next()));
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        C09p c09p = (C09p) it2.next();
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            c09p.Bki((Fragment) it3.next(), A1V);
                        }
                    }
                }
                return A1e;
            }
        }, false);
    }
}
