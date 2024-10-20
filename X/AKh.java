package X;

import com.facebook.fbavatar.artifacto.datasource.AvatarArtifactMsys;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: AKh.class */
public final class AKh extends C00q implements C00m {
    public final /* synthetic */ String $packName;
    public final /* synthetic */ int $pageSize = 500;
    public final /* synthetic */ String $templateName;
    public final /* synthetic */ String $userIdsValue;
    public final /* synthetic */ AvatarArtifactMsys this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKh(AvatarArtifactMsys avatarArtifactMsys, String str, String str2, String str3) {
        super(0);
        this.this$0 = avatarArtifactMsys;
        this.$packName = str;
        this.$templateName = str2;
        this.$userIdsValue = str3;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C6ku c6ku = this.this$0.A01;
        String str = this.$packName;
        String str2 = this.$templateName;
        String str3 = this.$userIdsValue;
        int i = this.$pageSize;
        1Um A0O = 1BK.A0O(c6ku, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new A0f(new C8yj(c6ku, A0O), c6ku, A0P, str, str2, str3, i), A0P, false);
        return A0P;
    }
}
