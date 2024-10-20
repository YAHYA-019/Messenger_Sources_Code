package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Lij.class */
public abstract class Lij implements Cloneable {
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public KRE A07;
    public C3073Jib A08;
    public KRF A0A;
    public ArrayList A0H;
    public ArrayList A0I;
    public MKT[] A0S;
    public static final Animator[] A0W = new Animator[0];
    public static final int[] A0V = {2, 1, 3, 4};
    public static final KvW A0U = new KvW();
    public static ThreadLocal A0T = new ThreadLocal();
    public String A0E = AnonymousClass001.A0Y(this);
    public TimeInterpolator A05 = null;
    public ArrayList A0J = AnonymousClass001.A0s();
    public ArrayList A0K = AnonymousClass001.A0s();
    public ArrayList A0P = null;
    public Kjy A0D = new Kjy();
    public Kjy A0C = new Kjy();
    public JiR A0B = null;
    public int[] A0N = A0V;
    public boolean A0L = false;
    public ArrayList A0G = AnonymousClass001.A0s();
    public Animator[] A0R = A0W;
    public int A00 = 0;
    public boolean A0Q = false;
    public boolean A0M = false;
    public Lij A09 = null;
    public ArrayList A0O = null;
    public ArrayList A0F = AnonymousClass001.A0s();
    public KvW A06 = A0U;

    public Lij() {
        long j = -1;
        this.A03 = j;
        this.A01 = j;
    }

    public static Path A03(int i, int i2, int i3, int i4) {
        Path path = new Path();
        path.moveTo(i, i2);
        path.lineTo(i3, i4);
        return path;
    }

    public static C04r A04() {
        ThreadLocal threadLocal = A0T;
        C04r c04r = (C04r) threadLocal.get();
        if (c04r == null) {
            c04r = AbH.A06();
            threadLocal.set(c04r);
        }
        return c04r;
    }

    public static Lij A05(JiR jiR, int i) {
        return (Lij) jiR.A02.get(i);
    }

    public static void A06(View view, L4B l4b, Kjy kjy) {
        kjy.A02.put(view, l4b);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = kjy.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            C04r c04r = kjy.A01;
            if (c04r.containsKey(transitionName)) {
                c04r.put(transitionName, (Object) null);
            } else {
                c04r.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C00p c00p = kjy.A03;
                if (c00p.A01(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c00p.A0C(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c00p.A05(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c00p.A0C(itemIdAtPosition, null);
                }
            }
        }
    }

    private void A07(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.A0P;
            if (arrayList == null || !1BL.A1Z(arrayList, id)) {
                if (view.getParent() instanceof ViewGroup) {
                    L4B l4b = new L4B(view);
                    if (z) {
                        A0h(l4b);
                    } else {
                        A0f(l4b);
                    }
                    l4b.A01.add(this);
                    A0g(l4b);
                    A06(view, l4b, z ? this.A0D : this.A0C);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        A07(viewGroup.getChildAt(i), z);
                    }
                }
            }
        }
    }

    public static void A08(0QO r301, 0QO r302, Lij lij, Object obj, Object obj2) {
        View view = (View) obj;
        if (view == null || !lij.A0k(view)) {
            return;
        }
        Object obj3 = r301.get(obj2);
        Object obj4 = r302.get(view);
        if (obj3 == null || obj4 == null) {
            return;
        }
        lij.A0I.add(obj3);
        lij.A0H.add(obj4);
        r301.remove(obj2);
        r302.remove(view);
    }

    public static void A09(MLT mlt, Lij lij, Lij lij2, boolean z) {
        Lij lij3 = lij.A09;
        if (lij3 != null) {
            A09(mlt, lij3, lij2, z);
        }
        ArrayList arrayList = lij.A0O;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        MKT[] mktArr = lij.A0S;
        if (mktArr == null) {
            mktArr = new MKT[size];
        }
        lij.A0S = null;
        MKT[] mktArr2 = (MKT[]) arrayList.toArray(mktArr);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                lij.A0S = mktArr2;
                return;
            }
            MKT mkt = mktArr2[i2];
            switch (((LRa) mlt).A00) {
                case 0:
                    mkt.CRr(lij2, z);
                    break;
                case 1:
                    mkt.CRn(lij2, z);
                    break;
                case 2:
                    mkt.CRm(lij2);
                    break;
                case 3:
                    mkt.CRp(lij2);
                    break;
                case 4:
                    mkt.CRq(lij2);
                    break;
            }
            mktArr2[i2] = null;
            i = i2 + 1;
        }
    }

    private L4B A0L(View view, boolean z) {
        JiR jiR = this.A0B;
        if (jiR != null) {
            return jiR.A0L(view, z);
        }
        return (L4B) (z ? this.A0D : this.A0C).A02.get(view);
    }

    private void A0P() {
        long j;
        if (this instanceof JiR) {
            JiR jiR = (JiR) this;
            jiR.A04 = 0L;
            MKT jiX = new JiX(jiR);
            int i = 0;
            while (true) {
                int i2 = i;
                ArrayList arrayList = jiR.A02;
                if (i2 >= arrayList.size()) {
                    return;
                }
                Lij lij = (Lij) arrayList.get(i2);
                lij.A0I(jiX);
                lij.A0P();
                long j2 = lij.A04;
                boolean z = jiR.A03;
                long j3 = jiR.A04;
                if (z) {
                    j = Math.max(j3, j2);
                } else {
                    lij.A02 = j3;
                    j = j3 + j2;
                }
                jiR.A04 = j;
                i = i2 + 1;
            }
        } else {
            C04r A04 = A04();
            this.A04 = 0L;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                ArrayList arrayList2 = this.A0F;
                if (i4 >= arrayList2.size()) {
                    arrayList2.clear();
                    return;
                }
                Animator animator = (Animator) arrayList2.get(i4);
                KSv kSv = (KSv) A04.get(animator);
                if (animator != null && kSv != null) {
                    long j4 = this.A01;
                    if (j4 >= 0) {
                        kSv.A00.setDuration(j4);
                    }
                    long j5 = this.A03;
                    if (j5 >= 0) {
                        Animator animator2 = kSv.A00;
                        animator2.setStartDelay(j5 + animator2.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.A05;
                    if (timeInterpolator != null) {
                        kSv.A00.setInterpolator(timeInterpolator);
                    }
                    this.A0G.add(animator);
                    this.A04 = Math.max(this.A04, animator.getTotalDuration());
                }
                i3 = i4 + 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0547, code lost:
    
        if (r302.getLayoutDirection() == 1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0631, code lost:
    
        if (r302.getLayoutDirection() == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x06a3, code lost:
    
        if (r335 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x040e, code lost:
    
        if (r342.isEmpty() != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b2  */
    /* JADX WARN: Type inference failed for: r0v93, types: [X.KSv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0a(android.view.ViewGroup r302, X.Kjy r303, X.Kjy r304, java.util.ArrayList r305, java.util.ArrayList r306) {
        /*
            Method dump skipped, instructions count: 1862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lij.A0a(android.view.ViewGroup, X.Kjy, X.Kjy, java.util.ArrayList, java.util.ArrayList):void");
    }

    private void A0f(L4B l4b) {
        if (this instanceof JiS) {
            JiS.A00(l4b);
            return;
        }
        if (this instanceof JiU) {
            if (!(((JiU) this) instanceof C3081Jij)) {
                JiU.A01(l4b);
                return;
            }
            JiU.A01(l4b);
            View view = l4b.A00;
            int[] A1b = GOn.A1b();
            view.getLocationOnScreen(A1b);
            l4b.A02.put("android:slide:screenPosition", A1b);
            return;
        }
        if (!(this instanceof JiR)) {
            JiT.A00(l4b);
            return;
        }
        JiR jiR = (JiR) this;
        View view2 = l4b.A00;
        if (jiR.A0k(view2)) {
            Iterator it = jiR.A02.iterator();
            while (it.hasNext()) {
                Lij lij = (Lij) it.next();
                if (lij.A0k(view2)) {
                    lij.A0f(l4b);
                    l4b.A01.add(lij);
                }
            }
        }
    }

    private void A0h(L4B l4b) {
        if (this instanceof JiS) {
            JiS.A00(l4b);
            return;
        }
        if (this instanceof C3080Jii) {
            JiU.A01(l4b);
            View view = l4b.A00;
            Object tag = view.getTag(2131368194);
            if (tag == null) {
                tag = Float.valueOf(view.getVisibility() == 0 ? KcV.A02.A00(view) : 0.0f);
            }
            l4b.A02.put("android:fade:transitionAlpha", tag);
            return;
        }
        if (!(this instanceof JiR)) {
            if (!(this instanceof C3081Jij)) {
                JiT.A00(l4b);
                return;
            }
            JiU.A01(l4b);
            View view2 = l4b.A00;
            int[] A1b = GOn.A1b();
            view2.getLocationOnScreen(A1b);
            l4b.A02.put("android:slide:screenPosition", A1b);
            return;
        }
        JiR jiR = (JiR) this;
        View view3 = l4b.A00;
        if (jiR.A0k(view3)) {
            Iterator it = jiR.A02.iterator();
            while (it.hasNext()) {
                Lij lij = (Lij) it.next();
                if (lij.A0k(view3)) {
                    lij.A0h(l4b);
                    l4b.A01.add(lij);
                }
            }
        }
    }

    private boolean A0l(L4B l4b, L4B l4b2) {
        String[] strArr;
        if (this instanceof JiU) {
            if (l4b == null) {
                if (l4b2 == null) {
                    return false;
                }
            } else if (l4b2 != null && l4b2.A02.containsKey("android:visibility:visibility") != l4b.A02.containsKey("android:visibility:visibility")) {
                return false;
            }
            KlK A00 = JiU.A00(l4b, l4b2);
            if (A00.A05) {
                return A00.A01 == 0 || A00.A00 == 0;
            }
            return false;
        }
        if (l4b == null || l4b2 == null) {
            return false;
        }
        if (this instanceof JiS) {
            strArr = JiS.A05;
        } else {
            if (!(this instanceof JiT)) {
                java.util.Map map = l4b.A02;
                Iterator A1B = 1BK.A1B(map);
                while (A1B.hasNext()) {
                    Object next = A1B.next();
                    Object obj = map.get(next);
                    Object obj2 = l4b2.A02.get(next);
                    if (obj == null) {
                        if (obj2 != null) {
                            return true;
                        }
                    } else if (obj2 == null || (!obj.equals(obj2))) {
                        return true;
                    }
                }
                return false;
            }
            strArr = JiT.A03;
        }
        for (String str : strArr) {
            Object obj3 = l4b.A02.get(str);
            Object obj4 = l4b2.A02.get(str);
            if (obj3 == null) {
                if (obj4 != null) {
                    return true;
                }
            } else if (obj4 == null || (!obj3.equals(obj4))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0884, code lost:
    
        if (r0.A0L != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0118, code lost:
    
        if (r0 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0387, code lost:
    
        if (X.JiU.A00(r0.A0K(r0, false), r0.A0L(r0, false)).A05 != false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c9  */
    /* JADX WARN: Type inference failed for: r0v305, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v306, types: [android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r0v324, types: [X.Lij, X.Jij] */
    /* JADX WARN: Type inference failed for: r312v5, types: [android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r335v8, types: [android.animation.AnimatorSet, android.animation.Animator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator A0A(android.view.ViewGroup r302, X.L4B r303, X.L4B r304) {
        /*
            Method dump skipped, instructions count: 2409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lij.A0A(android.view.ViewGroup, X.L4B, X.L4B):android.animation.Animator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jib, X.MKT] */
    public C3073Jib A0B() {
        ?? c3073Jib = new C3073Jib(this);
        this.A08 = c3073Jib;
        A0I(c3073Jib);
        return this.A08;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:228)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:208)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:64)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public X.Lij clone() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4a
            r302 = r0
            r0 = r302
            X.Lij r0 = (X.Lij) r0     // Catch: java.lang.CloneNotSupportedException -> L4a
            r302 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch: java.lang.CloneNotSupportedException -> L4a
            r303 = r0
            r0 = r302
            r1 = r303
            r0.A0F = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            X.Kjy r0 = new X.Kjy     // Catch: java.lang.CloneNotSupportedException -> L4a java.lang.CloneNotSupportedException -> L4a
            r303 = r0
            r0 = r303
            r0.<init>()     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0 = r302
            r1 = r303
            r0.A0D = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            X.Kjy r0 = new X.Kjy     // Catch: java.lang.CloneNotSupportedException -> L4a java.lang.CloneNotSupportedException -> L4a
            r303 = r0
            r0 = r303
            r0.<init>()     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0 = r302
            r1 = r303
            r0.A0C = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            r0.A0I = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0 = r302
            r1 = 0
            r0.A0H = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0 = r302
            r1 = 0
            r0.A08 = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0 = r302
            r1 = r301
            r0.A09 = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0 = r302
            r1 = 0
            r0.A0O = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0 = r302
            return r0
        L4a:
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0U(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lij.clone():X.Lij");
    }

    public final Lij A0D() {
        JiR jiR = this.A0B;
        return jiR != null ? jiR.A0D() : this;
    }

    public Lij A0E(int i) {
        AnonymousClass001.A1J(this.A0J, i);
        return this;
    }

    public Lij A0F(int i, boolean z) {
        ArrayList arrayList = this.A0P;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
        }
        JQy.A1P(2131368343, arrayList);
        this.A0P = arrayList;
        return this;
    }

    public Lij A0G(View view) {
        this.A0K.add(view);
        return this;
    }

    public Lij A0H(View view) {
        this.A0K.remove(view);
        return this;
    }

    public Lij A0I(MKT mkt) {
        ArrayList arrayList = this.A0O;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            this.A0O = arrayList;
        }
        arrayList.add(mkt);
        return this;
    }

    public Lij A0J(MKT mkt) {
        Lij lij;
        ArrayList arrayList = this.A0O;
        if (arrayList != null) {
            if (!arrayList.remove(mkt) && (lij = this.A09) != null) {
                lij.A0J(mkt);
            }
            if (this.A0O.size() == 0) {
                this.A0O = null;
            }
        }
        return this;
    }

    public L4B A0K(View view, boolean z) {
        L4B l4b;
        L4B l4b2;
        JiR jiR = this.A0B;
        if (jiR != null) {
            l4b = jiR.A0K(view, z);
        } else {
            ArrayList arrayList = z ? this.A0I : this.A0H;
            l4b = null;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= size || (l4b2 = (L4B) arrayList.get(i2)) == null) {
                        break;
                    }
                    if (l4b2.A00 != view) {
                        i = i2 + 1;
                    } else if (i2 >= 0) {
                        return (L4B) (z ? this.A0H : this.A0I).get(i2);
                    }
                }
            }
        }
        return l4b;
    }

    public String A0M(String str) {
        StringBuilder A0o = AnonymousClass001.A0o(str);
        A0o.append(AnonymousClass001.A0X(this));
        A0o.append("@");
        JQz.A1Q(A0o, hashCode());
        A0o.append(": ");
        long j = this.A01;
        long j2 = -1;
        if (j != j2) {
            4YU.A1T("dur(", ") ", A0o, j);
        }
        long j3 = this.A03;
        if (j3 != j2) {
            4YU.A1T("dly(", ") ", A0o, j3);
        }
        TimeInterpolator timeInterpolator = this.A05;
        if (timeInterpolator != null) {
            JR0.A1D(timeInterpolator, "interp(", ") ", A0o);
        }
        ArrayList arrayList = this.A0J;
        if (arrayList.size() > 0 || this.A0K.size() > 0) {
            A0o.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        A0o.append(", ");
                    }
                    A0o.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.A0K;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        A0o.append(", ");
                    }
                    A0o.append(arrayList2.get(i2));
                }
            }
            A0o.append(")");
        }
        return A0o.toString();
    }

    public void A0N() {
        ArrayList arrayList = this.A0G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0R);
        this.A0R = A0W;
        while (true) {
            size--;
            if (size < 0) {
                this.A0R = animatorArr;
                A09(MLT.A00, this, this, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    public void A0O() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i != 0) {
            return;
        }
        A09(MLT.A01, this, this, false);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            C00p c00p = this.A0D.A03;
            if (i3 >= c00p.A00()) {
                break;
            }
            View view = (View) c00p.A04(i3);
            if (view != null) {
                view.setHasTransientState(false);
            }
            i2 = i3 + 1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4;
            C00p c00p2 = this.A0C.A03;
            if (i5 >= c00p2.A00()) {
                this.A0M = true;
                return;
            }
            View view2 = (View) c00p2.A04(i5);
            if (view2 != null) {
                view2.setHasTransientState(false);
            }
            i4 = i5 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, X.MKT, X.JiV] */
    public void A0Q() {
        ArrayList arrayList;
        if (!(this instanceof JiR)) {
            A0S();
            C04r A04 = A04();
            Iterator it = this.A0F.iterator();
            while (it.hasNext()) {
                Animator animator = (Animator) it.next();
                if (A04.containsKey(animator)) {
                    A0S();
                    if (animator != null) {
                        animator.addListener(new JUE(this, A04, 0));
                        long j = this.A01;
                        if (j >= 0) {
                            animator.setDuration(j);
                        }
                        long j2 = this.A03;
                        if (j2 >= 0) {
                            animator.setStartDelay(j2 + animator.getStartDelay());
                        }
                        TimeInterpolator timeInterpolator = this.A05;
                        if (timeInterpolator != null) {
                            animator.setInterpolator(timeInterpolator);
                        }
                        JUI.A00(animator, this, 1);
                        0K6.A00(animator);
                    }
                }
            }
            this.A0F.clear();
            A0O();
            return;
        }
        JiR jiR = (JiR) this;
        if (jiR.A02.isEmpty()) {
            jiR.A0S();
            jiR.A0O();
            return;
        }
        ?? obj = new Object();
        ((JiV) obj).A00 = jiR;
        Iterator it2 = jiR.A02.iterator();
        while (it2.hasNext()) {
            ((Lij) it2.next()).A0I(obj);
        }
        jiR.A01 = jiR.A02.size();
        if (jiR.A03) {
            Iterator it3 = jiR.A02.iterator();
            while (it3.hasNext()) {
                ((Lij) it3.next()).A0Q();
            }
            return;
        }
        int i = 1;
        while (true) {
            int i2 = i;
            arrayList = jiR.A02;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((Lij) arrayList.get(i2 - 1)).A0I(new JiZ(arrayList.get(i2), jiR, 1));
            i = i2 + 1;
        }
        Lij lij = (Lij) arrayList.get(0);
        if (lij != null) {
            lij.A0Q();
        }
    }

    public void A0R() {
        if (!(this instanceof JiR)) {
            this.A0L = true;
            return;
        }
        JiR jiR = (JiR) this;
        jiR.A0L = true;
        int size = jiR.A02.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            A05(jiR, i2).A0R();
            i = i2 + 1;
        }
    }

    public void A0S() {
        if (this.A00 == 0) {
            A09(MLT.A04, this, this, false);
            this.A0M = false;
        }
        this.A00++;
    }

    public void A0T(long j) {
        if (this instanceof JiR) {
            ((JiR) this).A0n(j);
        } else {
            this.A01 = j;
        }
    }

    public void A0U(long j, long j2) {
        int i;
        if (!(this instanceof JiR)) {
            long j3 = this.A04;
            boolean A1U = DKD.A1U((j > j2 ? 1 : (j == j2 ? 0 : -1)));
            if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
                this.A0M = false;
                A09(MLT.A04, this, this, A1U);
            }
            ArrayList arrayList = this.A0G;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0R);
            this.A0R = A0W;
            for (int i2 = 0; i2 < size; i2++) {
                Animator animator = animatorArr[i2];
                animatorArr[i2] = null;
                ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            }
            this.A0R = animatorArr;
            if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
                return;
            }
            if (j > j3) {
                this.A0M = true;
            }
            A09(MLT.A01, this, this, A1U);
            return;
        }
        JiR jiR = (JiR) this;
        long j4 = jiR.A04;
        if (jiR.A0B != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        int i3 = 0;
        boolean A1U2 = DKD.A1U((j > j2 ? 1 : (j == j2 ? 0 : -1)));
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            jiR.A0M = false;
            A09(MLT.A04, jiR, jiR, A1U2);
        }
        if (!jiR.A03) {
            int i4 = 1;
            while (true) {
                i = i4;
                ArrayList arrayList2 = jiR.A02;
                if (i >= arrayList2.size()) {
                    i = arrayList2.size();
                    break;
                } else if (((Lij) arrayList2.get(i)).A02 > j2) {
                    break;
                } else {
                    i4 = i + 1;
                }
            }
            int i5 = i - 1;
            if (j < j2) {
                while (i5 >= 0) {
                    Lij A05 = A05(jiR, i5);
                    long j5 = A05.A02;
                    long j6 = j - j5;
                    A05.A0U(j6, j2 - j5);
                    if (j6 >= 0) {
                        break;
                    } else {
                        i5--;
                    }
                }
            } else {
                while (true) {
                    ArrayList arrayList3 = jiR.A02;
                    if (i5 >= arrayList3.size()) {
                        break;
                    }
                    Lij lij = (Lij) arrayList3.get(i5);
                    long j7 = lij.A02;
                    long j8 = j - j7;
                    if (j8 < 0) {
                        break;
                    }
                    lij.A0U(j8, j2 - j7);
                    i5++;
                }
            }
        } else {
            while (true) {
                ArrayList arrayList4 = jiR.A02;
                if (i3 >= arrayList4.size()) {
                    break;
                }
                ((Lij) arrayList4.get(i3)).A0U(j, j2);
                i3++;
            }
        }
        if (jiR.A0B != null) {
            if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
                return;
            }
            if (j > j4) {
                jiR.A0M = true;
            }
            A09(MLT.A01, jiR, jiR, A1U2);
        }
    }

    public void A0V(TimeInterpolator timeInterpolator) {
        if (!(this instanceof JiR)) {
            this.A05 = timeInterpolator;
            return;
        }
        JiR jiR = (JiR) this;
        jiR.A00 |= 1;
        ArrayList arrayList = jiR.A02;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                A05(jiR, i2).A0V(timeInterpolator);
                i = i2 + 1;
            }
        }
        jiR.A05 = timeInterpolator;
    }

    public void A0W(View view) {
        if (this.A0M) {
            return;
        }
        ArrayList arrayList = this.A0G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0R);
        this.A0R = A0W;
        int i = size - 1;
        while (true) {
            int i2 = i;
            if (i2 < 0) {
                this.A0R = animatorArr;
                A09(MLT.A02, this, this, false);
                this.A0Q = true;
                return;
            } else {
                Animator animator = animatorArr[i2];
                animatorArr[i2] = null;
                animator.pause();
                i = i2 - 1;
            }
        }
    }

    public void A0X(View view) {
        if (this.A0Q) {
            if (!this.A0M) {
                ArrayList arrayList = this.A0G;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0R);
                this.A0R = A0W;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.A0R = animatorArr;
                A09(MLT.A03, this, this, false);
            }
            this.A0Q = false;
        }
    }

    public void A0Y(ViewGroup viewGroup) {
        C04r A04 = A04();
        int size = A04.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C04r c04r = new C04r(A04);
        A04.clear();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            KSv kSv = (KSv) c04r.A06(size);
            if (kSv.A01 != null && windowId.equals(kSv.A02)) {
                ((Animator) c04r.A04(size)).end();
            }
        }
    }

    public void A0Z(ViewGroup viewGroup) {
        KSv kSv;
        L4B l4b;
        this.A0I = AnonymousClass001.A0s();
        this.A0H = AnonymousClass001.A0s();
        Kjy kjy = this.A0D;
        Kjy kjy2 = this.A0C;
        C04r c04r = new C04r(kjy.A02);
        C04r c04r2 = new C04r(kjy2.A02);
        int i = 0;
        while (true) {
            int i2 = i;
            int[] iArr = this.A0N;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                int size = c04r.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        View view = (View) c04r.A04(size);
                        if (view != null && A0k(view) && (l4b = (L4B) c04r2.remove(view)) != null && A0k(l4b.A00)) {
                            this.A0I.add(c04r.A05(size));
                            this.A0H.add(l4b);
                        }
                    }
                }
            } else if (i3 == 2) {
                C04r c04r3 = kjy.A01;
                C04r c04r4 = kjy2.A01;
                int size2 = c04r3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    View view2 = (View) c04r3.A06(i4);
                    if (view2 != null && A0k(view2)) {
                        A08(c04r, c04r2, this, c04r4.get(c04r3.A04(i4)), view2);
                    }
                }
            } else if (i3 == 3) {
                SparseArray sparseArray = kjy.A00;
                SparseArray sparseArray2 = kjy2.A00;
                int size3 = sparseArray.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    View view3 = (View) sparseArray.valueAt(i5);
                    if (view3 != null && A0k(view3)) {
                        A08(c04r, c04r2, this, sparseArray2.get(sparseArray.keyAt(i5)), view3);
                    }
                }
            } else if (i3 == 4) {
                C00p c00p = kjy.A03;
                C00p c00p2 = kjy2.A03;
                int A00 = c00p.A00();
                for (int i6 = 0; i6 < A00; i6++) {
                    View view4 = (View) c00p.A04(i6);
                    if (view4 != null && A0k(view4)) {
                        A08(c04r, c04r2, this, c00p2.A05(c00p.A02(i6)), view4);
                    }
                }
            }
            i = i2 + 1;
        }
        for (int i7 = 0; i7 < c04r.size(); i7++) {
            L4B l4b2 = (L4B) c04r.A06(i7);
            if (A0k(l4b2.A00)) {
                this.A0I.add(l4b2);
                this.A0H.add(null);
            }
        }
        for (int i8 = 0; i8 < c04r2.size(); i8++) {
            L4B l4b3 = (L4B) c04r2.A06(i8);
            if (A0k(l4b3.A00)) {
                this.A0H.add(l4b3);
                this.A0I.add(null);
            }
        }
        C04r A04 = A04();
        int size4 = A04.size();
        WindowId windowId = viewGroup.getWindowId();
        int i9 = size4 - 1;
        while (true) {
            int i10 = i9;
            if (i10 < 0) {
                break;
            }
            Animator animator = (Animator) A04.A04(i10);
            if (animator != null && (kSv = (KSv) A04.get(animator)) != null && kSv.A01 != null && windowId.equals(kSv.A02)) {
                L4B l4b4 = kSv.A04;
                View view5 = kSv.A01;
                L4B A0L = A0L(view5, true);
                L4B A0K = A0K(view5, true);
                if (A0L == null && A0K == null) {
                    A0K = (L4B) this.A0C.A02.get(view5);
                    if (A0K == null) {
                    }
                }
                if (kSv.A03.A0l(l4b4, A0K)) {
                    Lij lij = kSv.A03;
                    if (lij.A0D().A08 != null) {
                        animator.cancel();
                        ArrayList arrayList = lij.A0G;
                        arrayList.remove(animator);
                        A04.remove(animator);
                        if (arrayList.size() == 0) {
                            A09(MLT.A00, lij, lij, false);
                            if (!lij.A0M) {
                                lij.A0M = true;
                                A09(MLT.A01, lij, lij, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        A04.remove(animator);
                    }
                }
            }
            i9 = i10 - 1;
        }
        A0a(viewGroup, this.A0D, this.A0C, this.A0I, this.A0H);
        if (this.A08 == null) {
            A0Q();
        } else if (Build.VERSION.SDK_INT >= 34) {
            A0P();
            this.A08.A03();
            this.A08.A04();
        }
    }

    public void A0b(ViewGroup viewGroup, boolean z) {
        Kjy kjy;
        if (z) {
            Kjy kjy2 = this.A0D;
            kjy2.A02.clear();
            kjy2.A00.clear();
            kjy = this.A0D;
        } else {
            Kjy kjy3 = this.A0C;
            kjy3.A02.clear();
            kjy3.A00.clear();
            kjy = this.A0C;
        }
        kjy.A03.A07();
        ArrayList arrayList = this.A0J;
        if (arrayList.size() <= 0 && this.A0K.size() <= 0) {
            A07(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                break;
            }
            View findViewById = viewGroup.findViewById(JQy.A0H(arrayList, i2));
            if (findViewById != null) {
                L4B l4b = new L4B(findViewById);
                if (z) {
                    A0h(l4b);
                } else {
                    A0f(l4b);
                }
                l4b.A01.add(this);
                A0g(l4b);
                A06(findViewById, l4b, z ? this.A0D : this.A0C);
            }
            i = i2 + 1;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            ArrayList arrayList2 = this.A0K;
            if (i4 >= arrayList2.size()) {
                return;
            }
            View A0W2 = JQx.A0W(arrayList2, i4);
            L4B l4b2 = new L4B(A0W2);
            if (z) {
                A0h(l4b2);
            } else {
                A0f(l4b2);
            }
            l4b2.A01.add(this);
            A0g(l4b2);
            A06(A0W2, l4b2, z ? this.A0D : this.A0C);
            i3 = i4 + 1;
        }
    }

    public void A0c(KvW kvW) {
        if (kvW == null) {
            kvW = A0U;
        }
        this.A06 = kvW;
    }

    public void A0d(KRE kre) {
        if (!(this instanceof JiR)) {
            this.A07 = kre;
            return;
        }
        JiR jiR = (JiR) this;
        jiR.A07 = kre;
        jiR.A00 |= 8;
        int size = jiR.A02.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            A05(jiR, i2).A0d(kre);
            i = i2 + 1;
        }
    }

    public void A0e(KRF krf) {
        if (!(this instanceof JiR)) {
            this.A0A = krf;
            return;
        }
        JiR jiR = (JiR) this;
        jiR.A0A = krf;
        jiR.A00 |= 2;
        int size = jiR.A02.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            A05(jiR, i2).A0e(krf);
            i = i2 + 1;
        }
    }

    public void A0g(L4B l4b) {
        if (this.A0A != null) {
            java.util.Map map = l4b.A02;
            if (map.isEmpty()) {
                return;
            }
            String[] strArr = C3074Jic.A01;
            int i = 0;
            while (map.containsKey(strArr[i])) {
                i++;
                if (i >= 2) {
                    return;
                }
            }
            View view = l4b.A00;
            Object obj = map.get("android:visibility:visibility");
            if (obj == null) {
                obj = Integer.valueOf(view.getVisibility());
            }
            map.put("android:visibilityPropagation:visibility", obj);
            view.getLocationOnScreen(r0);
            int round = r0[0] + Math.round(view.getTranslationX());
            int[] iArr = {round};
            iArr[0] = round + (view.getWidth() / 2);
            int round2 = iArr[1] + Math.round(view.getTranslationY());
            iArr[1] = round2;
            iArr[1] = round2 + (view.getHeight() / 2);
            map.put("android:visibilityPropagation:center", iArr);
        }
    }

    public boolean A0i() {
        if (!(this instanceof JiR)) {
            return 7zM.A1b(this.A0G);
        }
        JiR jiR = (JiR) this;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = jiR.A02;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (((Lij) arrayList.get(i2)).A0i()) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }

    public boolean A0j() {
        boolean z;
        if (this instanceof JiR) {
            ArrayList arrayList = ((JiR) this).A02;
            int size = arrayList.size();
            z = false;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                if (!((Lij) arrayList.get(i2)).A0j()) {
                    break;
                }
                i = i2 + 1;
            }
            return z;
        }
        if (!(this instanceof C3081Jij) && !(this instanceof C3080Jii) && !(this instanceof JiS)) {
            return false;
        }
        z = true;
        return z;
    }

    public boolean A0k(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A0P;
        if (arrayList != null && 1BL.A1Z(arrayList, id)) {
            return false;
        }
        ArrayList arrayList2 = this.A0J;
        if ((arrayList2.size() == 0 && this.A0K.size() == 0) || 1BL.A1Z(arrayList2, id)) {
            return true;
        }
        return this.A0K.contains(view);
    }

    public String toString() {
        return A0M("");
    }
}
