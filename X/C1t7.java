package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1t7, reason: invalid class name */
/* loaded from: 1t7.class */
public final class C1t7 implements LifecycleOwner {
    public static final C1t5 A0A = new C1t5() { // from class: X.1t8
        @Override // X.C1t5
        public void BzZ() {
        }

        @Override // X.C1t5
        public void Bzd() {
        }
    };
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final LifecycleRegistry A06;
    public final 1pK A07;
    public final Lifecycle A08;
    public final C1t5 A09;

    public C1t7(1pK r302, C1t5 c1t5) {
        this.A09 = c1t5;
        this.A07 = r302;
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.A06 = lifecycleRegistry;
        this.A02 = true;
        A02(r302);
        if (r302.getHost() != null) {
            1pK r0 = this.A07;
            HashMap hashMap = C1t9.A00;
            List list = (List) hashMap.get(r0);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(r0, list);
            }
            list.add(this);
        }
        r302.A1T(new 1tA(this));
        this.A08 = lifecycleRegistry;
    }

    public static final void A00(Fragment fragment, C1t7 c1t7) {
        11T.A0F(fragment, 0);
        List<C1t7> list = (List) C1t9.A00.get(fragment);
        if (list == null) {
            list = C0ty.A00;
        }
        for (C1t7 c1t72 : list) {
            11T.A0D(c1t72);
            c1t72.A02 = c1t7.A05;
            A01(c1t72);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (X.0Dq.A03 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C1t7 r301) {
        /*
            r0 = r301
            boolean r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L37
            r0 = r301
            boolean r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L37
            r0 = r301
            boolean r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L37
            r0 = r301
            boolean r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L37
            r0 = r301
            boolean r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L37
            boolean r0 = X.0Dq.A03
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L3b
        L37:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L3b:
            r0 = r301
            boolean r0 = r0.A05
            r302 = r0
            r0 = r303
            r1 = r302
            if (r0 == r1) goto Lc2
            r0 = r301
            r1 = r303
            r0.A05 = r1
            r0 = r303
            if (r0 == 0) goto La6
            r0 = r301
            androidx.lifecycle.LifecycleRegistry r0 = r0.A06
            r304 = r0
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            r305 = r0
            r0 = r304
            r1 = r305
            r0.setCurrentState(r1)
            r0 = r301
            X.1t5 r0 = r0.A09
            r305 = r0
            r0 = r305
            r0.Bzd()
        L6b:
            r0 = r301
            X.1pK r0 = r0.A07
            X.06Z r0 = r0.getChildFragmentManager()
            X.06a r0 = r0.A0T
            java.util.List r0 = r0.A0A()
            r305 = r0
            r0 = r305
            java.util.Iterator r0 = r0.iterator()
            r304 = r0
        L82:
            r0 = r304
            boolean r0 = r0.hasNext()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto Lc2
            r0 = r304
            java.lang.Object r0 = r0.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r305 = r0
            r0 = r305
            X.11T.A0D(r0)
            r0 = r305
            r1 = r301
            A00(r0, r1)
            goto L82
        La6:
            r0 = r301
            X.1t5 r0 = r0.A09
            r0.BzZ()
            r0 = r301
            androidx.lifecycle.LifecycleRegistry r0 = r0.A06
            r304 = r0
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            r305 = r0
            r0 = r304
            r1 = r305
            r0.setCurrentState(r1)
            goto L6b
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1t7.A01(X.1t7):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (X.0Dq.A03 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(androidx.fragment.app.Fragment r302) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1t7.A02(androidx.fragment.app.Fragment):void");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.A08;
    }
}
