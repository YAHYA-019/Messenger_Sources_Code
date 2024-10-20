package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: D0q.class */
public final class D0q implements GIg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CallerContext A02;
    public final /* synthetic */ 54V A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AtomicInteger A06;

    public D0q(CallerContext callerContext, 54V r303, String str, String str2, AtomicInteger atomicInteger, int i, long j) {
        this.A03 = r303;
        this.A06 = atomicInteger;
        this.A04 = str;
        this.A01 = j;
        this.A02 = callerContext;
        this.A00 = i;
        this.A05 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x04e0, code lost:
    
        if (r336 == null) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x058e  */
    @Override // X.GIg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Ejf ARL() {
        /*
            Method dump skipped, instructions count: 1597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D0q.ARL():X.Ejf");
    }

    @Override // X.GIg
    public void BxQ(long j) {
        54V r0 = this.A03;
        20A r02 = r0.A02;
        C1cm c1cm = C3X7.A02;
        BLy A05 = r0.A08.A05();
        String str = A05.apiString;
        String str2 = this.A04;
        Long valueOf = Long.valueOf(this.A01);
        AtomicInteger atomicInteger = this.A06;
        Integer valueOf2 = Integer.valueOf(atomicInteger.get());
        String str3 = r0.A0B;
        r02.A04(c1cm, StringFormatUtil.formatStrLocaleSafe("get_diffs failed. queueType = %s, syncToken = %s, seqId = %d, attempt %d, entity %s.", str, str2, valueOf, valueOf2, str3));
        0fH.A13("SyncConnectionHandler", "get_diffs failed. queueType = %s, seqId = %d, attempt %d, entity %s, %s.", new Object[]{A05.apiString, valueOf, Integer.valueOf(atomicInteger.get()), str3, this.A02});
        atomicInteger.incrementAndGet();
    }
}
