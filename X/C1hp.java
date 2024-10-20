package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.1hp, reason: invalid class name */
/* loaded from: 1hp.class */
public abstract class C1hp extends C1hr {
    public static final 1GE A03 = new 1GE(C1hp.class);
    public ImmutableCollection A00;
    public final boolean A01;
    public final boolean A02;

    public C1hp(ImmutableCollection immutableCollection, boolean z, boolean z2) {
        int size = immutableCollection.size();
        this.seenExceptions = null;
        this.remaining = size;
        this.A00 = immutableCollection;
        this.A01 = z;
        this.A02 = z2;
    }

    public static void A00(ImmutableCollection immutableCollection, C1hp c1hp) {
        int A00 = C1hr.A00.A00(c1hp);
        boolean z = false;
        if (A00 >= 0) {
            z = true;
        }
        Preconditions.checkState(z, "Less than 0 remaining futures");
        if (A00 == 0) {
            if (immutableCollection != null) {
                int i = 0;
                1Du it = immutableCollection.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        A01(c1hp, future, i);
                    }
                    i++;
                }
            }
            c1hp.seenExceptions = null;
            c1hp.A05();
            c1hp.A07(0S2.A01);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.C1hp r301, java.util.concurrent.Future r302, int r303) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1hp.A01(X.1hp, java.util.concurrent.Future, int):void");
    }

    public void A05() {
        22U r0 = (22U) this;
        List<C08244mN> list = r0.A00;
        if (list != null) {
            ArrayList A00 = 1JW.A00(list.size());
            for (C08244mN c08244mN : list) {
                A00.add(c08244mN != null ? c08244mN.A00 : null);
            }
            r0.set(Collections.unmodifiableList(A00));
        }
    }

    public final void A06() {
        this.A00.getClass();
        if (this.A00.isEmpty()) {
            A05();
            return;
        }
        if (!this.A01) {
            Runnable runnable = new 1iB(this.A02 ? this.A00 : null, this);
            1Du it = this.A00.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnable, 1JU.A01);
            }
            return;
        }
        int i = 0;
        1Du it2 = this.A00.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.addListener(new 5yA(this, listenableFuture, i), 1JU.A01);
            i++;
        }
    }

    public void A07(Integer num) {
        num.getClass();
        this.A00 = null;
    }

    public final void afterDone() {
        ImmutableCollection immutableCollection = this.A00;
        A07(0S2.A00);
        boolean isCancelled = isCancelled();
        boolean z = false;
        if (immutableCollection != null) {
            z = true;
        }
        if (isCancelled && z) {
            boolean wasInterrupted = wasInterrupted();
            1Du it = immutableCollection.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(wasInterrupted);
            }
        }
    }

    public final String pendingToString() {
        ImmutableCollection immutableCollection = this.A00;
        if (immutableCollection == null) {
            return super/*X.1FX*/.pendingToString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("futures=");
        sb.append(immutableCollection);
        return sb.toString();
    }
}
