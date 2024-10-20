package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.06a, reason: invalid class name */
/* loaded from: 06a.class */
public final class C06a {
    public C07l A00;
    public final ArrayList A03 = new ArrayList();
    public final HashMap A01 = new HashMap();
    public final HashMap A02 = new HashMap();

    public int A00(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = this.A03;
            int indexOf = arrayList.indexOf(fragment);
            int i2 = indexOf;
            while (true) {
                int i3 = i2 - 1;
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            return viewGroup.indexOfChild(view);
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i3);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return i;
    }

    public Fragment A01(int i) {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (C09y c09y : this.A01.values()) {
                    if (c09y != null) {
                        Fragment A04 = c09y.A04();
                        if (A04.mFragmentId == i) {
                            return A04;
                        }
                    }
                }
                return null;
            }
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
    }

    public Fragment A02(String str) {
        C09y c09y = (C09y) this.A01.get(str);
        if (c09y != null) {
            return c09y.A04();
        }
        return null;
    }

    public Fragment A03(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (C09y c09y : this.A01.values()) {
                    if (c09y != null) {
                        Fragment A04 = c09y.A04();
                        if (str.equals(A04.mTag)) {
                            return A04;
                        }
                    }
                }
                return null;
            }
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
    }

    public Fragment A04(String str) {
        Fragment findFragmentByWho;
        for (C09y c09y : this.A01.values()) {
            if (c09y != null && (findFragmentByWho = c09y.A04().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public C07l A05() {
        return this.A00;
    }

    public ArrayList A06() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.A01.values()) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public ArrayList A07() {
        ArrayList arrayList = new ArrayList();
        for (C09y c09y : this.A01.values()) {
            arrayList.add(c09y != null ? c09y.A04() : null);
        }
        return arrayList;
    }

    public ArrayList A08() {
        HashMap hashMap = this.A01;
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (C09y c09y : hashMap.values()) {
            if (c09y != null) {
                Fragment A04 = c09y.A04();
                this.A02.put(A04.mWho, c09y.A02());
                arrayList.add(A04.mWho);
                if (06Z.A0O(2)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Saved state of ");
                    A0k.append(A04);
                    A0k.append(": ");
                    A0k.append(A04.mSavedFragmentState);
                    AnonymousClass001.A17(A0k);
                }
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v0 ??, still in use, count: 2, list:
          (r304v0 ??) from 0x0094: PHI (r304v1 ??) = (r304v0 ??), (r304v2 ??) binds: [B:46:0x0094, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]
          (r304v0 ?? I:java.util.AbstractCollection) from 0x004f: INVOKE (r304v0 ?? I:java.util.AbstractCollection), (r0v22 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0098, MD:(E):boolean (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public java.util.ArrayList A09() {
        /*
            r301 = this;
            r0 = r301
            java.util.ArrayList r0 = r0.A03
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            r0 = r302
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L98
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L15
            r0 = 0
            r304 = r0
            goto L94
        L15:
            r0 = r302
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L98
            r303 = r0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            r304 = r0
            r0 = r304
            r1 = r303
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L98
            r0 = r302
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L98
            r305 = r0
        L29:
            r0 = r305
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L98
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L94
            r0 = r305
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L98
            r306 = r0
            r0 = r306
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L98
            r306 = r0
            r0 = r306
            java.lang.String r0 = r0.mWho     // Catch: java.lang.Throwable -> L98
            r307 = r0
            r0 = r304
            r1 = r307
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L98
            r0 = 2
            r303 = r0
            r0 = r303
            boolean r0 = X.06Z.A0O(r0)     // Catch: java.lang.Throwable -> L98
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L29
            java.lang.String r0 = "FragmentManager"
            r308 = r0
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()     // Catch: java.lang.Throwable -> L98
            r309 = r0
            java.lang.String r0 = "saveAllState: adding fragment ("
            r307 = r0
            r0 = r309
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L98
            r0 = r306
            java.lang.String r0 = r0.mWho     // Catch: java.lang.Throwable -> L98
            r307 = r0
            r0 = r309
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "): "
            r307 = r0
            r0 = r306
            r1 = r307
            r2 = r308
            r3 = r309
            X.AnonymousClass002.A0V(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L98
            goto L29
        L94:
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            r0 = r304
            return r0
        L98:
            r307 = move-exception
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            r0 = r307
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06a.A09():java.util.ArrayList");
    }

    public List A0A() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A03;
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    public void A0B() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            C09y c09y = (C09y) this.A01.get(((Fragment) it.next()).mWho);
            if (c09y != null) {
                c09y.A07();
            }
        }
        for (C09y c09y2 : this.A01.values()) {
            if (c09y2 != null) {
                c09y2.A07();
                Fragment A04 = c09y2.A04();
                if (A04.mRemoving && !A04.isInBackStack()) {
                    if (A04.mBeingSaved) {
                        HashMap hashMap = this.A02;
                        if (!hashMap.containsKey(A04.mWho)) {
                            hashMap.put(A04.mWho, c09y2.A02());
                        }
                    }
                    A0G(c09y2);
                }
            }
        }
    }

    public void A0C(Fragment fragment) {
        ArrayList arrayList = this.A03;
        if (arrayList.contains(fragment)) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0Z(fragment, "Fragment already added: ", AnonymousClass001.A0k()));
        }
        synchronized (arrayList) {
            arrayList.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void A0D(Fragment fragment) {
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            arrayList.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void A0E(C07l c07l) {
        this.A00 = c07l;
    }

    public void A0F(C09y c09y) {
        Fragment A04 = c09y.A04();
        String str = A04.mWho;
        HashMap hashMap = this.A01;
        if (hashMap.get(str) == null) {
            hashMap.put(A04.mWho, c09y);
            if (A04.mRetainInstanceChangedWhileDetached) {
                boolean z = A04.mRetainInstance;
                C07l c07l = this.A00;
                if (z) {
                    c07l.A06(A04);
                } else {
                    c07l.A07(A04);
                }
                A04.mRetainInstanceChangedWhileDetached = false;
            }
            if (06Z.A0O(2)) {
                AnonymousClass002.A0X(A04, "Added fragment to active set ", AnonymousClass001.A0k());
            }
        }
    }

    public void A0G(C09y c09y) {
        Fragment A04 = c09y.A04();
        if (A04.mRetainInstance) {
            this.A00.A07(A04);
        }
        HashMap hashMap = this.A01;
        if (hashMap.get(A04.mWho) == c09y && hashMap.put(A04.mWho, null) != null && 06Z.A0O(2)) {
            AnonymousClass002.A0X(A04, "Removed fragment from active set ", AnonymousClass001.A0k());
        }
    }

    public void A0H(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String A0W = 0Pz.A0W(str, "    ");
        HashMap hashMap = this.A01;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C09y c09y : hashMap.values()) {
                printWriter.print(str);
                if (c09y != null) {
                    Fragment A04 = c09y.A04();
                    printWriter.println(A04);
                    A04.dump(A0W, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            int i = 0;
            do {
                Object obj = arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(obj.toString());
                i++;
            } while (i < size);
        }
    }

    public void A0I(List list) {
        this.A03.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment A02 = A02(str);
                if (A02 == null) {
                    throw 0Pz.A07("No instantiated fragment for (", str, ")");
                }
                if (06Z.A0O(2)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("restoreSaveState: added (");
                    A0k.append(str);
                    AnonymousClass002.A0X(A02, "): ", A0k);
                }
                A0C(A02);
            }
        }
    }
}
