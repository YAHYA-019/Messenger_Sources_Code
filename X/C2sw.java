package X;

/* renamed from: X.2sw, reason: invalid class name */
/* loaded from: 2sw.class */
public final class C2sw extends C00q implements C00m {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ boolean $isInitSync;
    public final /* synthetic */ C1h3 $sessionData;
    public final /* synthetic */ int $syncStatus;
    public final /* synthetic */ C1h2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2sw(C1h3 c1h3, C1h2 c1h2, int i, int i2, boolean z) {
        super(0);
        this.this$0 = c1h2;
        this.$instanceKey = i;
        this.$sessionData = c1h3;
        this.$isInitSync = z;
        this.$syncStatus = i2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C1h2 c1h2 = this.this$0;
        if (C1h2.A01(c1h2).isMarkerOn(729363290, this.$instanceKey)) {
            int i = this.$sessionData.A02;
            C1h2 c1h22 = this.this$0;
            if (i < 5) {
                C1h2.A01(c1h22).markerAnnotate(729363290, this.$instanceKey, 0Pz.A0T("mailbox_sync_is_init_", this.$sessionData.A02 + 1), this.$isInitSync ? 1 : 0);
                C1h2.A01(this.this$0).markerAnnotate(729363290, this.$instanceKey, 0Pz.A0T("mailbox_sync_status_", this.$sessionData.A02 + 1), this.$syncStatus);
                C1h2.A01(this.this$0).markerPoint(729363290, this.$instanceKey, 0Pz.A0T("mailbox_sync_started_", this.$sessionData.A02 + 1));
            }
        }
        return 04S.A00;
    }
}
