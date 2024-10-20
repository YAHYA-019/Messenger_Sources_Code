package X;

import kotlin.jvm.functions.Function2;

/* loaded from: J89.class */
public final class J89 extends 0DO implements Function2 {
    public int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J89(Object obj, Object obj2, 0DR r304, int i, long j, long j2) {
        super(2, r304);
        this.A01 = i;
        this.A02 = j;
        this.A04 = obj;
        this.A05 = obj2;
        this.A03 = j2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        long j;
        Object obj3;
        int i;
        int i2 = this.A01;
        long j2 = this.A02;
        if (i2 != 0) {
            obj3 = this.A04;
            obj2 = this.A05;
            j = this.A03;
            i = 1;
        } else {
            obj2 = this.A05;
            j = this.A03;
            obj3 = this.A04;
            i = 0;
        }
        return new J89(obj3, obj2, r303, i, j2, j);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105 A[EDGE_INSN: B:32:0x0105->B:14:0x0105 BREAK  A[LOOP:0: B:21:0x0086->B:31:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0065 -> B:6:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ed -> B:20:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J89.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
