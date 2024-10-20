package androidx.compose.runtime.snapshots;

import X.04S;
import X.0DQ;
import X.0DR;
import X.0Ml;
import X.LjB;
import kotlin.jvm.functions.Function2;

/* loaded from: SnapshotIdSet$iterator$1.class */
public final class SnapshotIdSet$iterator$1 extends 0Ml implements Function2 {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ LjB this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(LjB ljB, 0DR r303) {
        super(2, r303);
        this.this$0 = ljB;
    }

    public final 0DR create(Object obj, 0DR r303) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, r303);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r309 >= 64) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0208, code lost:
    
        if (r325 >= 64) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0182  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x007d -> B:10:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00c8 -> B:10:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01a9 -> B:24:0x01fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01e6 -> B:24:0x01fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0139 -> B:36:0x0160). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
