package X;

/* renamed from: X.4Ct, reason: invalid class name */
/* loaded from: 4Ct.class */
public final class C4Ct extends C00q implements C00m {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ C1h3 $sessionData;
    public final /* synthetic */ int $syncGroup;
    public final /* synthetic */ C1h2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Ct(C1h3 c1h3, C1h2 c1h2, int i, int i2) {
        super(0);
        this.this$0 = c1h2;
        this.$instanceKey = i;
        this.$sessionData = c1h3;
        this.$syncGroup = i2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (C1h2.A01(this.this$0).isMarkerOn(729363290, this.$instanceKey)) {
            C1h3 c1h3 = this.$sessionData;
            int i = c1h3.A05 + 1;
            c1h3.A05 = i;
            C1h2 c1h2 = this.this$0;
            if (i <= 5) {
                C1h2.A01(c1h2).markerPoint(729363290, this.$instanceKey, 0Pz.A0T("non_mailbox_sync_completed_", this.$sessionData.A05));
            }
            java.util.Map map = this.$sessionData.A0H;
            Integer valueOf = Integer.valueOf(this.$syncGroup);
            Number number = (Number) map.get(valueOf);
            map.put(valueOf, Integer.valueOf((number != null ? number.intValue() : 0) + 1));
        }
        return 04S.A00;
    }
}
