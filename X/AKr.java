package X;

import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import kotlin.jvm.functions.Function1;

/* loaded from: AKr.class */
public final class AKr extends C00q implements C00m {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKr(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = j;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        if (this.A00 == 0) {
            F9S f9s = F63.A04;
            F63 f63 = (F63) this.A04;
            C23d c23d = (C23d) this.A02;
            Object obj = c23d.A05;
            return f9s.A03(f9s.A01(c23d.A04, f63, obj, EYU.A00((FyG) obj), c23d.A03), (DLQ) this.A05, ((FHF) this.A03).A03, this.A01);
        }
        CommunityMessagingInviteLinkData communityMessagingInviteLinkData = (CommunityMessagingInviteLinkData) this.A03;
        int ordinal = communityMessagingInviteLinkData.A03.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            str = communityMessagingInviteLinkData.A0G;
            11T.A0A(str);
        } else {
            str = communityMessagingInviteLinkData.A0E;
            if (str == null) {
                str = String.valueOf(this.A01);
            }
            11T.A0D(str);
        }
        C9a8 c9a8 = (C9a8) this.A05;
        Function1 function1 = c9a8.A0E;
        ARN arn = new ARN(16, c9a8, this.A04, this.A02, communityMessagingInviteLinkData);
        11T.A0F(str, 0);
        ((BDa) 1Lm.A05(c9a8.A00, c9a8.A03, 68503)).A01(A1e.A00(c9a8, arn, function1, 36), str);
        return 04S.A00;
    }
}
