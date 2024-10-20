package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0Am, reason: invalid class name */
/* loaded from: 0Am.class */
public abstract class C0Am {
    public boolean A00;
    public boolean A01;
    public final ViewGroup A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();

    public C0Am(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }

    private final C0Ao A00(Fragment fragment) {
        Object obj;
        Iterator it = this.A03.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C0Ao c0Ao = (C0Ao) obj;
            if (11T.A0O(c0Ao.A01(), fragment) && !c0Ao.A03) {
                break;
            }
        }
        return (C0Ao) obj;
    }

    private final C0Ao A01(Fragment fragment) {
        Object obj;
        Iterator it = this.A04.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C0Ao c0Ao = (C0Ao) obj;
            if (11T.A0O(c0Ao.A01(), fragment) && !c0Ao.A03) {
                break;
            }
        }
        return (C0Ao) obj;
    }

    public static final C0Am A02(ViewGroup viewGroup, 06Z r302) {
        11T.A0F(viewGroup, 0);
        11T.A0A(r302.A0h());
        Object tag = viewGroup.getTag(2131367505);
        if (tag instanceof C0Am) {
            return (C0Am) tag;
        }
        C0Am c0Am = new C0Am(viewGroup);
        viewGroup.setTag(2131367505, c0Am);
        return c0Am;
    }

    private final void A03() {
        for (C0Ao c0Ao : this.A03) {
            if (c0Ao.A01 == 0S2.A01) {
                c0Ao.A06(C0Ap.A00(c0Ao.A01().requireView().getVisibility()), 0S2.A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r307 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A04(X.C09y r302, java.lang.Integer r303, java.lang.Integer r304) {
        /*
            r301 = this;
            r0 = r301
            java.util.List r0 = r0.A03
            r305 = r0
            r0 = r305
            monitor-enter(r0)
            r0 = r302
            androidx.fragment.app.Fragment r0 = r0.A04()     // Catch: java.lang.Throwable -> L8f
            r306 = r0
            r0 = r301
            r1 = r306
            X.0Ao r0 = r0.A00(r1)     // Catch: java.lang.Throwable -> L8f
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L35
            r0 = r306
            boolean r0 = r0.mTransitioning     // Catch: java.lang.Throwable -> L8f
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L3f
            r0 = r301
            r1 = r306
            X.0Ao r0 = r0.A01(r1)     // Catch: java.lang.Throwable -> L8f
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L3f
        L35:
            r0 = r307
            r1 = r303
            r2 = r304
            r0.A06(r1, r2)     // Catch: java.lang.Throwable -> L8f
            goto L8b
        L3f:
            X.0Ao r0 = new X.0Ao     // Catch: java.lang.Throwable -> L8f
            r309 = r0
            r0 = r309
            r1 = r302
            r2 = r303
            r3 = r304
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L8f
            r0 = r305
            r1 = r309
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L8f
            X.0Aq r0 = new X.0Aq     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> L8f
            r307 = r0
            r0 = r307
            r1 = r309
            r2 = r301
            r0.<init>()     // Catch: java.lang.Throwable -> L8f
            r0 = r309
            java.util.List r0 = r0.A09     // Catch: java.lang.Throwable -> L8f
            r306 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L8f
            X.0Ar r0 = new X.0Ar     // Catch: java.lang.Throwable -> L8f java.lang.Throwable -> L8f
            r307 = r0
            r0 = r307
            r1 = r309
            r2 = r301
            r0.<init>()     // Catch: java.lang.Throwable -> L8f
            r0 = r306
            r1 = r307
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L8f
        L8b:
            r0 = r305
            monitor-exit(r0)
            return
        L8f:
            r307 = move-exception
            r0 = r305
            monitor-exit(r0)
            r0 = r307
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Am.A04(X.09y, java.lang.Integer, java.lang.Integer):void");
    }

    public static final void A05(C0Ao c0Ao, C0Am c0Am) {
        11T.A0F(c0Ao, 1);
        if (c0Am.A03.contains(c0Ao)) {
            Integer num = c0Ao.A00;
            View view = c0Ao.A01().mView;
            11T.A09(view);
            C0As.A01(view, c0Am.A02, num);
        }
    }

    public static void A06(C0Am c0Am, List list) {
        11T.A0F(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0QU.A0t(((C0Ao) it.next()).A0A, arrayList);
        }
        List A0V = 0QD.A0V(0QD.A0f(arrayList));
        int size = A0V.size();
        for (int i = 0; i < size; i++) {
            ((0PC) A0V.get(i)).A06(c0Am.A02);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c0Am.A0G((C0Ao) list.get(i2));
        }
        List A0V2 = 0QD.A0V(list);
        int size3 = A0V2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C0Ao c0Ao = (C0Ao) A0V2.get(i3);
            if (c0Ao.A0A.isEmpty()) {
                c0Ao.A02();
            }
        }
    }

    public static final void A07(C0Am c0Am, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C0Ao) list.get(i)).A03();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0QU.A0t(((C0Ao) it.next()).A0A, arrayList);
        }
        List A0V = 0QD.A0V(0QD.A0f(arrayList));
        int size2 = A0V.size();
        for (int i2 = 0; i2 < size2; i2++) {
            0PC r0 = (0PC) A0V.get(i2);
            ViewGroup viewGroup = c0Am.A02;
            if (!r0.A01) {
                r0.A04(viewGroup);
            }
            r0.A01 = true;
        }
    }

    public final Integer A08(C09y c09y) {
        int intValue;
        Fragment A04 = c09y.A04();
        C0Ao A00 = A00(A04);
        Integer num = null;
        Integer num2 = A00 != null ? A00.A01 : null;
        C0Ao A01 = A01(A04);
        if (A01 != null) {
            num = A01.A01;
        }
        return (num2 == null || (intValue = num2.intValue()) == -1 || intValue == 0) ? num : num2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x02d0, code lost:
    
        if ((!r0.isEmpty()) != false) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Am.A09():void");
    }

    public final void A0A() {
        String str;
        String str2;
        if (06Z.A0O(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.A02;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        List list = this.A03;
        synchronized (list) {
            A03();
            A07(this, list);
            List list2 = this.A04;
            11T.A0F(list2, 0);
            Iterator it = new ArrayList(list2).iterator();
            while (it.hasNext()) {
                C0Ao c0Ao = (C0Ao) it.next();
                if (06Z.A0O(2)) {
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("Container ");
                        A0k.append(viewGroup);
                        str2 = AnonymousClass001.A0d(" is not attached to window. ", A0k);
                    }
                    StringBuilder A0k2 = AnonymousClass001.A0k();
                    A0k2.append("SpecialEffectsController: ");
                    A0k2.append(str2);
                    AnonymousClass002.A0V(c0Ao, "Cancelling running operation ", "FragmentManager", A0k2);
                }
                c0Ao.A04(viewGroup);
            }
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                C0Ao c0Ao2 = (C0Ao) it2.next();
                if (06Z.A0O(2)) {
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        StringBuilder A0k3 = AnonymousClass001.A0k();
                        A0k3.append("Container ");
                        A0k3.append(viewGroup);
                        str = AnonymousClass001.A0d(" is not attached to window. ", A0k3);
                    }
                    StringBuilder A0k4 = AnonymousClass001.A0k();
                    A0k4.append("SpecialEffectsController: ");
                    A0k4.append(str);
                    AnonymousClass002.A0V(c0Ao2, "Cancelling pending operation ", "FragmentManager", A0k4);
                }
                c0Ao2.A04(viewGroup);
            }
        }
    }

    public final void A0B() {
        boolean z;
        Object obj;
        List list = this.A03;
        synchronized (list) {
            A03();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                z = false;
                obj = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                obj = listIterator.previous();
                C0Ao c0Ao = (C0Ao) obj;
                C0Ap c0Ap = C0As.A00;
                View view = c0Ao.A01().mView;
                11T.A09(view);
                Integer A01 = c0Ap.A01(view);
                Integer num = c0Ao.A00;
                Integer num2 = 0S2.A01;
                if (num == num2 && A01 != num2) {
                    break;
                }
            }
            C0Ao c0Ao2 = (C0Ao) obj;
            if (c0Ao2 != null) {
                z = c0Ao2.A01().isPostponed();
            }
            this.A00 = z;
        }
    }

    public final void A0C(C09y c09y) {
        if (06Z.A0O(2)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            A0k.append(c09y.A04());
            AnonymousClass001.A17(A0k);
        }
        A04(c09y, 0S2.A0C, 0S2.A00);
    }

    public final void A0D(C09y c09y) {
        if (06Z.A0O(2)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            A0k.append(c09y.A04());
            AnonymousClass001.A17(A0k);
        }
        A04(c09y, 0S2.A00, 0S2.A0C);
    }

    public final void A0E(C09y c09y) {
        if (06Z.A0O(2)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            A0k.append(c09y.A04());
            AnonymousClass001.A17(A0k);
        }
        A04(c09y, 0S2.A01, 0S2.A00);
    }

    public final void A0F(C09y c09y, Integer num) {
        11T.A0F(num, 0);
        if (06Z.A0O(2)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            A0k.append(c09y.A04());
            AnonymousClass001.A17(A0k);
        }
        A04(c09y, num, 0S2.A01);
    }

    public final void A0G(C0Ao c0Ao) {
        11T.A0F(c0Ao, 0);
        if (c0Ao.A02) {
            C0As.A01(c0Ao.A01().requireView(), this.A02, c0Ao.A00);
            c0Ao.A02 = false;
        }
    }

    public abstract void A0H(List list, boolean z);
}
