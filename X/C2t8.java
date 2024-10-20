package X;

import com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.2t8, reason: invalid class name */
/* loaded from: 2t8.class */
public final class C2t8 extends C00q implements C00m {
    public final /* synthetic */ int $markerInstanceKey;
    public final /* synthetic */ String $reason;
    public final /* synthetic */ C1h6 $sessionData;
    public final /* synthetic */ int $sessionInstanceKey;
    public final /* synthetic */ String $stateChangeReason;
    public final /* synthetic */ String $stateChangeSource;
    public final /* synthetic */ MessagingConnectionBlackoutLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2t8(C1h6 c1h6, MessagingConnectionBlackoutLogger messagingConnectionBlackoutLogger, String str, String str2, String str3, int i, int i2) {
        super(0);
        this.$sessionData = c1h6;
        this.this$0 = messagingConnectionBlackoutLogger;
        this.$markerInstanceKey = i;
        this.$sessionInstanceKey = i2;
        this.$reason = str;
        this.$stateChangeSource = str2;
        this.$stateChangeReason = str3;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.$sessionData.A00 <= 5) {
            QuickPerformanceLogger A02 = MessagingConnectionBlackoutLogger.A02(this.this$0);
            int i = this.$markerInstanceKey;
            String A03 = MessagingConnectionBlackoutLogger.A03(this.$sessionInstanceKey);
            A02.markerPoint(729356106, i, AnonymousClass001.A0e("_started_", AnonymousClass001.A0n(A03), this.$sessionData.A00));
            QuickPerformanceLogger A022 = MessagingConnectionBlackoutLogger.A02(this.this$0);
            int i2 = this.$markerInstanceKey;
            String A032 = MessagingConnectionBlackoutLogger.A03(this.$sessionInstanceKey);
            A022.markerAnnotate(729356106, i2, AnonymousClass001.A0e("_start_reason_", AnonymousClass001.A0n(A032), this.$sessionData.A00), this.$reason);
            if (this.$stateChangeSource != null) {
                QuickPerformanceLogger A023 = MessagingConnectionBlackoutLogger.A02(this.this$0);
                int i3 = this.$markerInstanceKey;
                String A033 = MessagingConnectionBlackoutLogger.A03(this.$sessionInstanceKey);
                A023.markerAnnotate(729356106, i3, AnonymousClass001.A0e("_new_connect_change_source_", AnonymousClass001.A0n(A033), this.$sessionData.A00), this.$stateChangeSource);
            }
            if (this.$stateChangeReason != null) {
                QuickPerformanceLogger A024 = MessagingConnectionBlackoutLogger.A02(this.this$0);
                int i4 = this.$markerInstanceKey;
                String A034 = MessagingConnectionBlackoutLogger.A03(this.$sessionInstanceKey);
                A024.markerAnnotate(729356106, i4, AnonymousClass001.A0e("_new_connect_change_reason_", AnonymousClass001.A0n(A034), this.$sessionData.A00), this.$stateChangeReason);
            }
        }
        return 04S.A00;
    }
}
