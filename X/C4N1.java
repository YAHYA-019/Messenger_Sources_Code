package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.navigation.home.drawer.model.CommunityCreationDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.DrawerSnippetInfo;
import com.facebook.messaging.navigation.home.drawer.model.PlaceholderDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.TakenDownCommunityDrawerFolderKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4N1, reason: invalid class name */
/* loaded from: 4N1.class */
public final class C4N1 {
    public static final C4Mh A00(Context context, Community community) {
        String str = community.A0U;
        11T.A0A(str);
        TakenDownCommunityDrawerFolderKey takenDownCommunityDrawerFolderKey = new TakenDownCommunityDrawerFolderKey(Long.parseLong(str));
        2MQ r0 = 2MQ.A0w;
        4MG r02 = 4MG.A02;
        4MH r03 = new 4MH(r0, r02.iconColor, r02.backgroundColor);
        String str2 = community.A0W;
        11T.A0A(str2);
        if (0CU.A0O(str2)) {
            str2 = context.getString(2131954645);
        }
        11T.A0A(str2);
        String str3 = community.A0Z;
        if (str3 == null || 0CU.A0O(str3)) {
            str3 = 1BK.A0u(context, 2131954644);
        }
        List singletonList = Collections.singletonList(new DrawerSnippetInfo(0S2.A00, str3, true));
        11T.A0A(singletonList);
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        return new C4Mh(C4Mg.A08, r03, takenDownCommunityDrawerFolderKey, C1zz.A02(), null, str2, singletonList);
    }

    public static final C4Mh A01(String str) {
        CommunityCreationDrawerFolderKey communityCreationDrawerFolderKey = new CommunityCreationDrawerFolderKey("communities");
        4MH r0 = new 4MH(2MQ.A2X, C1u7.A08, C1p7.A07);
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        return new C4Mh(C4Mg.A08, r0, communityCreationDrawerFolderKey, C1zz.A02(), null, str, null);
    }

    public static final C4Mh A02(String str) {
        PlaceholderDrawerFolderKey placeholderDrawerFolderKey = new PlaceholderDrawerFolderKey("communities");
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        return new C4Mh(C4Mg.A08, null, placeholderDrawerFolderKey, C1zz.A02(), null, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0185, code lost:
    
        if (r304.A0B <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x025b, code lost:
    
        if (X.1WY.A01((X.1WY) r0.get()).AZk(36315340065153817L) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C4Mh A03(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, com.facebook.messaging.communitymessaging.model.Community r304, X.C4Mg r305) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4N1.A03(android.content.Context, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.communitymessaging.model.Community, X.4Mg):X.4Mh");
    }
}
