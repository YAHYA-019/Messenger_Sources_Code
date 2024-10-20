package X;

import com.facebook.common.perftest.PerfTestConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1ia, reason: invalid class name */
/* loaded from: 1ia.class */
public final class C1ia implements C1ib {
    public int A00;
    public Set A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C00i A05;
    public final AnonymousClass071 A06;
    public final String A07;
    public final List A08;
    public final ReadWriteLock A09;
    public final PerfTestConfig A0A;

    public C1ia() {
        AnonymousClass071 anonymousClass071 = (AnonymousClass071) 1Bi.A03(16523);
        this.A08 = new ArrayList();
        this.A02 = false;
        this.A00 = 9000;
        this.A04 = false;
        this.A01 = null;
        this.A03 = false;
        this.A09 = new ReentrantReadWriteLock(true);
        this.A06 = anonymousClass071;
        String str = C0di.A00().A00;
        this.A07 = str == null ? "unknown" : str;
        this.A0A = (PerfTestConfig) 1Bi.A03(16592);
        this.A05 = new 1BQ(16449);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
    
        if (X.1MM.A00 != false) goto L51;
     */
    @Override // X.C1ib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D9w(X.C03b r302) {
        /*
            Method dump skipped, instructions count: 1752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ia.D9w(X.03b):void");
    }
}
