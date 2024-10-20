package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.1sd, reason: invalid class name */
/* loaded from: 1sd.class */
public final class C1sd extends C00q implements C00m {
    public final /* synthetic */ int $configId;
    public final /* synthetic */ AbstractC00773ol $listener = null;
    public final /* synthetic */ C1ra $overrides;
    public final /* synthetic */ ImmutableList $schemaParts;
    public final /* synthetic */ 1rE this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1sd(C1ra c1ra, 1rE r303, ImmutableList immutableList, int i) {
        super(0);
        this.this$0 = r303;
        this.$configId = i;
        this.$schemaParts = immutableList;
        this.$overrides = c1ra;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        1rE r0 = this.this$0;
        int i = this.$configId;
        return r0.A01(this.$overrides, this.$schemaParts, i);
    }
}
