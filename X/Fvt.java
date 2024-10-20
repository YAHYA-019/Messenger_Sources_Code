package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fvt.class */
public final class Fvt implements 1K9 {
    public final /* synthetic */ ETq A00;
    public final /* synthetic */ 4xJ A01;
    public final /* synthetic */ ListenableFuture A02;

    public Fvt(ETq eTq, 4xJ r303, ListenableFuture listenableFuture) {
        this.A01 = r303;
        this.A02 = listenableFuture;
        this.A00 = eTq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (r0 != 429) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFailure(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fvt.onFailure(java.lang.Throwable):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.Map] */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i;
        ImmutableMap immutableMap;
        El0 el0 = (El0) obj;
        if (this.A02.isCancelled()) {
            this.A00.A00();
            return;
        }
        ETq eTq = this.A00;
        if (el0 != null) {
            str = el0.A01;
            i = el0.A00;
            immutableMap = el0.A02;
        } else {
            str = null;
            i = 0;
            immutableMap = RegularImmutableMap.A03;
        }
        eTq.A03(str, i, immutableMap);
    }
}
