package androidx.compose.runtime;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.C00m;
import kotlin.jvm.functions.Function2;

/* loaded from: SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.class */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends 0DO implements Function2 {
    public final /* synthetic */ C00m $block;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(0DR r302, C00m c00m) {
        super(2, r302);
        this.$block = c00m;
    }

    public final 0DR create(Object obj, 0DR r303) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(r303, this.$block);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02cd, code lost:
    
        if (r324 != false) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ee A[Catch: all -> 0x03c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x03c4, blocks: (B:14:0x01e0, B:16:0x01e5, B:19:0x01ee, B:21:0x01f9, B:22:0x0200, B:27:0x021c, B:36:0x0282, B:38:0x028a, B:44:0x02d3, B:45:0x02dc, B:46:0x02e2, B:53:0x0189, B:54:0x0190, B:55:0x0197, B:56:0x019e, B:57:0x01a5, B:58:0x01ac, B:60:0x01b9, B:62:0x01c3, B:63:0x01ca, B:69:0x02f0, B:70:0x02f5, B:73:0x02fc, B:74:0x0303, B:87:0x0336, B:88:0x033b, B:92:0x0349, B:93:0x0350, B:94:0x0357, B:95:0x035e, B:96:0x0365, B:97:0x036c, B:99:0x0377, B:101:0x0380, B:113:0x03a4, B:115:0x03c3, B:131:0x0183, B:133:0x0102, B:135:0x0109, B:136:0x0110, B:149:0x0142, B:150:0x0146, B:151:0x014c, B:152:0x0152, B:153:0x0158, B:154:0x015e, B:155:0x0164, B:156:0x016a, B:158:0x0173, B:170:0x03bc, B:76:0x030a, B:77:0x030f, B:78:0x0316, B:80:0x031f, B:85:0x032f, B:108:0x039a, B:110:0x03a1, B:83:0x0326, B:138:0x0116, B:139:0x011b, B:140:0x0122, B:142:0x012b, B:147:0x013b, B:166:0x03b2, B:168:0x03b9), top: B:2:0x001a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f0 A[Catch: all -> 0x03c4, TRY_ENTER, TryCatch #1 {all -> 0x03c4, blocks: (B:14:0x01e0, B:16:0x01e5, B:19:0x01ee, B:21:0x01f9, B:22:0x0200, B:27:0x021c, B:36:0x0282, B:38:0x028a, B:44:0x02d3, B:45:0x02dc, B:46:0x02e2, B:53:0x0189, B:54:0x0190, B:55:0x0197, B:56:0x019e, B:57:0x01a5, B:58:0x01ac, B:60:0x01b9, B:62:0x01c3, B:63:0x01ca, B:69:0x02f0, B:70:0x02f5, B:73:0x02fc, B:74:0x0303, B:87:0x0336, B:88:0x033b, B:92:0x0349, B:93:0x0350, B:94:0x0357, B:95:0x035e, B:96:0x0365, B:97:0x036c, B:99:0x0377, B:101:0x0380, B:113:0x03a4, B:115:0x03c3, B:131:0x0183, B:133:0x0102, B:135:0x0109, B:136:0x0110, B:149:0x0142, B:150:0x0146, B:151:0x014c, B:152:0x0152, B:153:0x0158, B:154:0x015e, B:155:0x0164, B:156:0x016a, B:158:0x0173, B:170:0x03bc, B:76:0x030a, B:77:0x030f, B:78:0x0316, B:80:0x031f, B:85:0x032f, B:108:0x039a, B:110:0x03a1, B:83:0x0326, B:138:0x0116, B:139:0x011b, B:140:0x0122, B:142:0x012b, B:147:0x013b, B:166:0x03b2, B:168:0x03b9), top: B:2:0x001a, inners: #0, #3 }] */
    /* JADX WARN: Type inference failed for: r0v184, types: [X.4G9] */
    /* JADX WARN: Type inference failed for: r0v187, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v206, types: [X.4G9] */
    /* JADX WARN: Type inference failed for: r0v209, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x038f -> B:50:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x02ed -> B:50:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0344 -> B:50:0x0187). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
