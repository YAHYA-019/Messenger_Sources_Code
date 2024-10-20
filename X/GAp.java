package X;

import kotlin.jvm.functions.Function1;

/* loaded from: GAp.class */
public final class GAp extends C00q implements Function1 {
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ EI7 $cacheSummary;
    public final /* synthetic */ Function1 $callback;
    public final /* synthetic */ long $currentTimestampMs;
    public final /* synthetic */ long $diskReadStartTs;
    public final /* synthetic */ ELh $queryPurpose;
    public final /* synthetic */ long $ttlSeconds;
    public final /* synthetic */ F91 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAp(ELh eLh, EI7 ei7, F91 f91, String str, Function1 function1, long j, long j2, long j3) {
        super(1);
        this.$callback = function1;
        this.this$0 = f91;
        this.$cacheKey = str;
        this.$ttlSeconds = j;
        this.$queryPurpose = eLh;
        this.$currentTimestampMs = j2;
        this.$diskReadStartTs = j3;
        this.$cacheSummary = ei7;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Ey6 ey6 = (Ey6) obj;
        11T.A0F(ey6, 0);
        Function1 function1 = this.$callback;
        03Y A00 = F91.A00(this.$queryPurpose, this.$cacheSummary, this.this$0, ey6, this.$cacheKey, this.$ttlSeconds, this.$currentTimestampMs, this.$diskReadStartTs);
        function1.invoke(A00 != null ? new Exn(A00) : null);
        return 04S.A00;
    }
}
