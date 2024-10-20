package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.4Cu, reason: invalid class name */
/* loaded from: 4Cu.class */
public final class C4Cu extends C00q implements C00m {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ int $pagingProgress;
    public final /* synthetic */ int $pagingTotal;
    public final /* synthetic */ C1h3 $sessionData;
    public final /* synthetic */ C1h2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Cu(C1h3 c1h3, C1h2 c1h2, int i, int i2, int i3) {
        super(0);
        this.this$0 = c1h2;
        this.$instanceKey = i;
        this.$sessionData = c1h3;
        this.$pagingProgress = i2;
        this.$pagingTotal = i3;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (C1h2.A01(this.this$0).isMarkerOn(729363290, this.$instanceKey)) {
            C1h3 c1h3 = this.$sessionData;
            int i = c1h3.A02 + 1;
            c1h3.A02 = i;
            C1h2 c1h2 = this.this$0;
            if (i <= 5) {
                C1h2.A01(c1h2).markerPoint(729363290, this.$instanceKey, 0Pz.A0T("mailbox_sync_completed_", this.$sessionData.A02));
                QuickPerformanceLogger A01 = C1h2.A01(this.this$0);
                int i2 = this.$instanceKey;
                String A0T = 0Pz.A0T("time_since_last_open_noti_recv_ms_", this.$sessionData.A02);
                C1gm c1gm = (C1gm) this.this$0.A07.A00.get();
                A01.markerAnnotate(729363290, i2, A0T, c1gm.A00 == 0 ? -1 : ((C0dr) c1gm.A03.A00.get()).now() - c1gm.A00);
            }
            C1h3 c1h32 = this.$sessionData;
            c1h32.A03 += this.$pagingProgress;
            c1h32.A04 += this.$pagingTotal;
        }
        return 04S.A00;
    }
}
