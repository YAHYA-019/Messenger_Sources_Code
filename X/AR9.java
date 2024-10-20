package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AR9.class */
public final class AR9 extends C00q implements Function1 {
    public final /* synthetic */ long $albumId;
    public final /* synthetic */ long $entryPoint;
    public final /* synthetic */ long $serverThreadKey;
    public final /* synthetic */ 9gK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AR9(9gK r302, long j, long j2, long j3) {
        super(1);
        this.this$0 = r302;
        this.$serverThreadKey = j;
        this.$albumId = j2;
        this.$entryPoint = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        9gK.A00(this.this$0, 7zO.A13(obj), this.$serverThreadKey, this.$albumId, this.$entryPoint);
        return 04S.A00;
    }
}
