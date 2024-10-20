package X;

import com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.4su, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4su.class */
public final class C10244su extends C00q implements C00m {
    public final /* synthetic */ boolean $connectedStatus;
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ String $networkType;
    public final /* synthetic */ C1h6 $sessionData;
    public final /* synthetic */ MessagingConnectionBlackoutLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10244su(C1h6 c1h6, MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger, String str, int i, boolean z) {
        super(0);
        this.$sessionData = c1h6;
        this.this$0 = messagingConnectionBlackoutLogger;
        this.$connectedStatus = z;
        this.$networkType = str;
        this.$instanceKey = i;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C1h6 c1h6 = this.$sessionData;
        int i = c1h6.A01 + 1;
        c1h6.A01 = i;
        StringBuilder sb = new StringBuilder();
        sb.append("connectivity_change_");
        sb.append(i);
        sb.append(" : ");
        sb.append(this.$connectedStatus);
        sb.append(", Network Type: ");
        sb.append(this.$networkType);
        0fH.A0m("MessagingConnectionBlackoutLogger", sb.toString());
        if (this.$sessionData.A01 <= 5) {
            QuickPerformanceLogger A02 = MessagingConnectionBlackoutLogger.A02(this.this$0);
            int i2 = this.$instanceKey;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("network_");
            sb2.append(this.$connectedStatus ? "connected" : "disconnected");
            sb2.append('_');
            sb2.append(this.$sessionData.A01);
            A02.markerPoint(729356106, i2, sb2.toString());
            MessagingConnectionBlackoutLogger.A02(this.this$0).markerAnnotate(729356106, this.$instanceKey, 0Pz.A0T("network_state_", this.$sessionData.A01), this.$connectedStatus);
            MessagingConnectionBlackoutLogger.A02(this.this$0).markerAnnotate(729356106, this.$instanceKey, 0Pz.A0T("network_type_", this.$sessionData.A01), MessagingConnectionBlackoutLogger.A00(this.this$0).A0E());
        }
        return 04S.A00;
    }
}
