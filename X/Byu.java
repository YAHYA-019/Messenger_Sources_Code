package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.memberrequest.memberrequestheader.MemberRequestHeaderImplementation;
import com.facebook.messaging.communitymessaging.plugins.requesttojoin.requesttojoinchatheader.RequestToJoinChatHeaderImplementation;
import com.facebook.messaging.communitymessaging.plugins.requesttojoin.requesttojoincommunityheader.RequestToJoinCommunityHeaderImplementation;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.List;

/* loaded from: Byu.class */
public final class Byu {
    public MemberRequestHeaderImplementation A00;
    public RequestToJoinChatHeaderImplementation A01;
    public RequestToJoinCommunityHeaderImplementation A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final Context A06;
    public final 06Z A07;
    public final FbUserSession A08;
    public final ThreadSummary A09;
    public final 1YC A0A = 1YC.A03;
    public final MigColorScheme A0B;
    public final ParcelableSecondaryData A0C;
    public final Integer A0D;
    public final List A0E;

    public Byu(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData, Integer num, List list) {
        this.A06 = context;
        this.A08 = fbUserSession;
        this.A0B = migColorScheme;
        this.A0E = list;
        this.A09 = threadSummary;
        this.A0D = num;
        this.A0C = parcelableSecondaryData;
        this.A07 = r303;
    }
}
