package X;

/* loaded from: J8u.class */
public final class J8u extends C00q implements C00m {
    public final /* synthetic */ boolean $broadcastStateSyncForOnState;
    public final /* synthetic */ HbO $loggingInfo;
    public final /* synthetic */ boolean $showEffectTray;
    public final /* synthetic */ boolean $showSidebar;
    public final /* synthetic */ boolean $usePersonalizedAvatarIfAvailable;
    public final /* synthetic */ Boolean $videoOnInOffState;
    public final /* synthetic */ IDX this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8u(HbO hbO, IDX idx, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.this$0 = idx;
        this.$loggingInfo = hbO;
        this.$videoOnInOffState = bool;
        this.$showEffectTray = z;
        this.$usePersonalizedAvatarIfAvailable = z2;
        this.$broadcastStateSyncForOnState = z3;
        this.$showSidebar = z4;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        IDX.A01(this.$loggingInfo, this.this$0, this.$videoOnInOffState, this.$showEffectTray, this.$usePersonalizedAvatarIfAvailable, this.$broadcastStateSyncForOnState);
        if (this.$showSidebar) {
            GOp.A0R(this.this$0.A00).A0B(0S2.A00);
        }
        return 04S.A00;
    }
}
