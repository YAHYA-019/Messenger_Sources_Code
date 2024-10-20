package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.HttpResponse;

/* renamed from: X.5vq, reason: invalid class name */
/* loaded from: 5vq.class */
public final class C5vq implements 1K9 {
    public final int A00;
    public final long A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final boolean A04;
    public final /* synthetic */ 2C7 A05;
    public final /* synthetic */ 2C7 A06;

    public C5vq(2C7 r302, int i, long j, boolean z) {
        this.A06 = r302;
        this.A05 = r302;
        this.A04 = z;
        this.A00 = i;
        this.A01 = j;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v3 int, still in use, count: 2, list:
          (r305v3 int) from 0x00d0: PHI (r305v4 int) = (r305v3 int) binds: [B:54:0x00cd] A[DONT_GENERATE, DONT_INLINE]
          (r305v3 int) from 0x00cd: IF  (r305v3 int) >= (0 int)  -> B:50:0x00d0 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private void A00(int r302, long r303) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5vq.A00(int, long):void");
    }

    public void onFailure(Throwable th) {
        if (this.A02.get()) {
            return;
        }
        boolean z = this.A04;
        2C7 r0 = this.A05;
        (z ? r0.A0K : r0.A0L).add(400);
        if (this.A03.incrementAndGet() >= this.A00) {
            A00(400, this.A01);
            return;
        }
        2C7 r02 = this.A06;
        if (z) {
            2C7.A03(r02, this.A01);
        } else {
            2C7.A01(r02);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        HttpResponse httpResponse = (HttpResponse) obj;
        if (this.A02.get()) {
            ((C5vo) this.A06.A0D.get()).A01(this.A01, "zbd_cancelled");
            return;
        }
        synchronized (this.A06.A0J) {
            if (httpResponse != null) {
                if (httpResponse.getStatusLine() != null) {
                    int statusCode = httpResponse.getStatusLine().getStatusCode();
                    if (statusCode < 400) {
                        boolean z = this.A04;
                        2C7 r0 = this.A05;
                        (z ? r0.A0K : r0.A0L).add(Integer.valueOf(statusCode));
                        A00(statusCode, this.A01);
                    }
                }
            }
            onFailure(null);
        }
    }
}
