package X;

import kotlin.jvm.functions.Function1;

/* loaded from: J9y.class */
public final class J9y extends C00q implements Function1 {
    public final /* synthetic */ long $emsgId;
    public final /* synthetic */ byte[] $inStreamAdsData;
    public final /* synthetic */ long $offsetMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9y(byte[] bArr, long j, long j2) {
        super(1);
        this.$inStreamAdsData = bArr;
        this.$emsgId = j;
        this.$offsetMs = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GOo.A0g(obj).C22(this.$inStreamAdsData, this.$emsgId, this.$offsetMs);
        return 04S.A00;
    }
}
