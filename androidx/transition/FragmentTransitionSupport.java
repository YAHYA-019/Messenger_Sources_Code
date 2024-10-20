package androidx.transition;

import X.0R3;
import X.0UA;
import X.AnonymousClass001;
import X.C3072Jia;
import X.DKC;
import X.JQx;
import X.JiP;
import X.JiQ;
import X.JiR;
import X.LDR;
import X.LQG;
import X.LRY;
import X.LRZ;
import X.Lij;
import X.MKU;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: FragmentTransitionSupport.class */
public class FragmentTransitionSupport extends 0UA {
    public Object A02(ViewGroup viewGroup, Object obj) {
        return LDR.A01(viewGroup, (Lij) obj);
    }

    public Object A03(Object obj) {
        if (obj != null) {
            return ((Lij) obj).clone();
        }
        return null;
    }

    public Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        JiR jiR = new JiR();
        jiR.A0o((Lij) obj);
        return jiR;
    }

    public Object A05(Object obj, Object obj2, Object obj3) {
        Lij lij = (Lij) obj;
        Lij lij2 = (Lij) obj2;
        Lij lij3 = (Lij) obj3;
        if (lij == null) {
            lij = null;
            if (lij2 != null) {
                lij = lij2;
            }
        } else if (lij2 != null) {
            Lij jiR = new JiR();
            jiR.A0o(lij);
            lij = jiR;
            jiR.A0o(lij2);
            ((JiR) jiR).A03 = false;
        }
        if (lij3 == null) {
            return lij;
        }
        JiR jiR2 = new JiR();
        if (lij != null) {
            jiR2.A0o(lij);
        }
        jiR2.A0o(lij3);
        return jiR2;
    }

    public Object A06(Object obj, Object obj2, Object obj3) {
        JiR jiR = new JiR();
        if (obj != null) {
            jiR.A0o((Lij) obj);
        }
        jiR.A0o((Lij) obj2);
        return jiR;
    }

    public void A07(Rect rect, Object obj) {
        ((Lij) obj).A0d(new JiQ(rect, this));
    }

    public void A08(View view, Object obj) {
        ((Lij) obj).A0G(view);
    }

    public void A09(View view, Object obj) {
        if (view != null) {
            Rect A0C = DKC.A0C();
            0UA.A00(view, A0C);
            ((Lij) obj).A0d(new JiP(A0C, this));
        }
    }

    public void A0A(View view, Object obj, ArrayList arrayList) {
        ((Lij) obj).A0I(new LRZ(view, this, arrayList));
    }

    public void A0B(View view, Object obj, ArrayList arrayList) {
        Lij lij = (Lij) obj;
        ArrayList arrayList2 = lij.A0K;
        arrayList2.clear();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                arrayList2.add(view);
                arrayList.add(view);
                A0I(lij, arrayList);
                return;
            }
            0UA.A01(JQx.A0W(arrayList, i2), arrayList2);
            i = i2 + 1;
        }
    }

    public void A0C(ViewGroup viewGroup, Object obj) {
        LDR.A03(viewGroup, (Lij) obj);
    }

    public void A0D(0R3 r302, Fragment fragment, Object obj, Runnable runnable) {
        A0E(r302, fragment, obj, (Runnable) null, runnable);
    }

    public void A0E(0R3 r302, Fragment fragment, Object obj, Runnable runnable, Runnable runnable2) {
        Lij lij = (Lij) obj;
        r302.A01(new LQG(lij, runnable, runnable2));
        lij.A0I(new LRY(this, runnable2));
    }

    public void A0F(Object obj) {
        ((MKU) obj).A87();
    }

    public void A0G(Object obj, float f) {
        MKU mku = (MKU) obj;
        if (mku.BVE()) {
            long durationMillis = mku.getDurationMillis();
            long j = f * ((float) durationMillis);
            if (j == 0) {
                j = 1;
            }
            if (j == durationMillis) {
                j = durationMillis - 1;
            }
            mku.Cne(j);
        }
    }

    public void A0H(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((Lij) obj).A0I(new C3072Jia(this, obj2, obj4, arrayList, arrayList3));
    }

    public void A0I(Object obj, ArrayList arrayList) {
        Object obj2;
        JiR jiR = (Lij) obj;
        if (jiR != null) {
            int i = 0;
            if (!(jiR instanceof JiR)) {
                ArrayList arrayList2 = jiR.A0J;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    ArrayList arrayList3 = jiR.A0K;
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        int size = arrayList.size();
                        while (i < size) {
                            jiR.A0G(JQx.A0W(arrayList, i));
                            i++;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            JiR jiR2 = jiR;
            int size2 = jiR2.A02.size();
            while (i < size2) {
                if (i >= 0) {
                    ArrayList arrayList4 = jiR2.A02;
                    if (i < arrayList4.size()) {
                        obj2 = arrayList4.get(i);
                        A0I(obj2, arrayList);
                        i++;
                    }
                }
                obj2 = null;
                A0I(obj2, arrayList);
                i++;
            }
        }
    }

    public void A0J(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Lij lij = (Lij) obj;
        if (lij != null) {
            ArrayList arrayList3 = lij.A0K;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            A0O(lij, arrayList, arrayList2);
        }
    }

    public void A0K(Runnable runnable, Object obj) {
        ((MKU) obj).A89(runnable);
    }

    public boolean A0L() {
        return true;
    }

    public boolean A0M(Object obj) {
        return obj instanceof Lij;
    }

    public boolean A0N(Object obj) {
        boolean A0j = ((Lij) obj).A0j();
        if (!A0j) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Predictive back not available for AndroidX Transition ");
            A0k.append(obj);
            Log.v("FragmentManager", AnonymousClass001.A0d(". Please enable seeking support for the designated transition by overriding isSeekingSupported().", A0k));
        }
        return A0j;
    }

    public void A0O(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Object obj2;
        JiR jiR = (Lij) obj;
        int i = 0;
        if (jiR instanceof JiR) {
            JiR jiR2 = jiR;
            int size = jiR2.A02.size();
            while (i < size) {
                if (i >= 0) {
                    ArrayList arrayList3 = jiR2.A02;
                    if (i < arrayList3.size()) {
                        obj2 = arrayList3.get(i);
                        A0O(obj2, arrayList, arrayList2);
                        i++;
                    }
                }
                obj2 = null;
                A0O(obj2, arrayList, arrayList2);
                i++;
            }
            return;
        }
        ArrayList arrayList4 = jiR.A0J;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            return;
        }
        ArrayList arrayList5 = jiR.A0K;
        if (arrayList5.size() != arrayList.size() || !arrayList5.containsAll(arrayList)) {
            return;
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i < size2) {
                jiR.A0G(JQx.A0W(arrayList2, i));
                i++;
            }
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                jiR.A0H(JQx.A0W(arrayList, size3));
            }
        }
    }
}
