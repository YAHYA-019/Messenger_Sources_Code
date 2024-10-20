package X;

import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: GAq.class */
public final class GAq extends C00q implements Function1 {
    public final /* synthetic */ String $appId;
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ String $cacheLookupDedupeKey;
    public final /* synthetic */ Function1 $callback;
    public final /* synthetic */ boolean $diskCacheEnabled;
    public final /* synthetic */ boolean $isPayloadPrebundled;
    public final /* synthetic */ Eyt $queryInfo;
    public final /* synthetic */ Executor $responseThreadExecutor;
    public final /* synthetic */ EvI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAq(EvI evI, Eyt eyt, String str, String str2, String str3, Executor executor, Function1 function1, boolean z, boolean z2) {
        super(1);
        this.this$0 = evI;
        this.$cacheLookupDedupeKey = str;
        this.$callback = function1;
        this.$cacheKey = str2;
        this.$appId = str3;
        this.$queryInfo = eyt;
        this.$diskCacheEnabled = z;
        this.$isPayloadPrebundled = z2;
        this.$responseThreadExecutor = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x011e, code lost:
    
        if (r301.$isPayloadPrebundled != false) goto L20;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAq.invoke(java.lang.Object):java.lang.Object");
    }
}
