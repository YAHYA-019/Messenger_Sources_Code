package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.communitycontainers.communitychannellistupclickhandler.CommunityChannelListUpClickHandlerImplementation;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.3Mz, reason: invalid class name */
/* loaded from: 3Mz.class */
public final class C3Mz {
    public CommunityChannelListUpClickHandlerImplementation A00;
    public Object A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 2MX A04;
    public final 1YC A05 = 1YC.A03;
    public final ParcelableSecondaryData A06;

    public C3Mz(Context context, FbUserSession fbUserSession, 2MX r304, ParcelableSecondaryData parcelableSecondaryData) {
        this.A02 = context;
        this.A06 = parcelableSecondaryData;
        this.A04 = r304;
        this.A03 = fbUserSession;
    }
}
