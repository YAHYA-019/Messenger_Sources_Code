package X;

import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.plugins.channellist.communityinviteentrypoint.CommunityInviteEntrypointImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Cua.class */
public final class Cua implements DG8 {
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ CommunityInviteEntrypointImplementation A01;
    public final /* synthetic */ String A02;

    public Cua(1Br r302, CommunityInviteEntrypointImplementation communityInviteEntrypointImplementation, String str) {
        this.A01 = communityInviteEntrypointImplementation;
        this.A02 = str;
        this.A00 = r302;
    }

    @Override // X.DG8
    public final boolean C2c(View view) {
        C00i A0R = AbF.A0R(this.A00);
        CommunityInviteEntrypointImplementation communityInviteEntrypointImplementation = this.A01;
        1pI r0 = communityInviteEntrypointImplementation.A01;
        ThreadKey threadKey = communityInviteEntrypointImplementation.A03;
        ParcelableSecondaryData parcelableSecondaryData = communityInviteEntrypointImplementation.A04;
        Parcelable A00 = ParcelableSecondaryData.A00(parcelableSecondaryData, CommunityExtraData.class, null);
        if (A00 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str = ((CommunityExtraData) A00).A06;
        String str2 = this.A02;
        BME bme = BME.A04;
        EnumC3499Mfu enumC3499Mfu = EnumC3499Mfu.A0v;
        AbT.A03(r0, bme, threadKey, str, str2);
        A0R.get();
        String A0w = 1BK.A0w(threadKey);
        Parcelable A002 = ParcelableSecondaryData.A00(parcelableSecondaryData, CommunityExtraData.class, null);
        if (A002 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbT.A02(enumC3499Mfu, threadKey, A0w, ((CommunityExtraData) A002).A06, str2, "messenger", "channel_list", "invite_button", "render_community_direct_invite_sheet");
        return true;
    }
}
