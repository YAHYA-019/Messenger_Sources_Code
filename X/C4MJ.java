package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.activeaudiochannelmetadataprovider.ActiveAudioChannelMetadataProviderImplementation;
import com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.div3invitemetadataprovider.DIv3InviteMetadataProviderImplementation;
import com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.mutedcommunitymetadataprovider.MutedCommunityMetadataProviderImplementation;
import com.facebook.messaging.navigation.home.drawer.plugins.drawerfoldermetadataprovider.badgecountmetadataprovider.BadgeCountMetadataProviderImplementation;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4MJ, reason: invalid class name */
/* loaded from: 4MJ.class */
public abstract class C4MJ {
    public static final HeterogeneousMap A00(Context context, 2Sh r302, int i) {
        String str;
        int i2;
        11T.A0F(r302, 2);
        C4MK c4mk = (C4MK) C1Y6.A00(context, "com_facebook_messaging_navigation_home_drawer_plugins_interfaces_drawerfoldermetadataprovider_DrawerFolderMetadataProviderInterfaceSpec", "All", new Object[0]);
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        AnonymousClass201 A00 = C1zz.A00();
        4ML r0 = c4mk.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r02 = r0.A07;
        r02.A08("com.facebook.messaging.navigation.home.drawer.plugins.interfaces.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", andIncrement);
        try {
            ArrayList arrayList = new ArrayList(4ML.A00(r0));
            try {
                if (4ML.A05(r0)) {
                    i2 = atomicInteger.getAndIncrement();
                    str = "messaging.navigation.home.drawer.drawerfoldermetadataprovider.badgecountmetadataprovider.BadgeCountMetadataProviderImplementation";
                    r02.A0A("com.facebook.messaging.navigation.home.drawer.plugins.drawerfoldermetadataprovider.badgecountmetadataprovider.BadgeCountMetadataProviderImplementation", str, "com.facebook.messaging.navigation.home.drawer.plugins.interfaces.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", i2, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "com.facebook.messaging.navigation.home.drawer.plugins.drawerfoldermetadataprovider.NavigationHomeDrawerDrawerfoldermetadataproviderKillSwitch", "getMetadataProvider");
                    try {
                        4MQ r03 = BadgeCountMetadataProviderImplementation.A00;
                        11T.A0I(r03, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadataProvider<out com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadata>");
                        arrayList.add(r03);
                        r02.A04((Exception) null, str, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", i2);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (4ML.A01(r0)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.activeaudiochannelmetadataprovider.ActiveAudioChannelMetadataProviderImplementation", "messaging.communitymessaging.drawer.drawerfoldermetadataprovider.activeaudiochannelmetadataprovider.ActiveAudioChannelMetadataProviderImplementation", "com.facebook.messaging.navigation.home.drawer.plugins.interfaces.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", andIncrement2, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.CommunitymessagingDrawerDrawerfoldermetadataproviderKillSwitch", "getMetadataProvider");
                    C4MV c4mv = ActiveAudioChannelMetadataProviderImplementation.A00;
                    11T.A0I(c4mv, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadataProvider<out com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadata>");
                    arrayList.add(c4mv);
                    r02.A04((Exception) null, "messaging.communitymessaging.drawer.drawerfoldermetadataprovider.activeaudiochannelmetadataprovider.ActiveAudioChannelMetadataProviderImplementation", "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", andIncrement2);
                }
                if (4ML.A04(r0)) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.mutedcommunitymetadataprovider.MutedCommunityMetadataProviderImplementation", "messaging.communitymessaging.drawer.drawerfoldermetadataprovider.mutedcommunitymetadataprovider.MutedCommunityMetadataProviderImplementation", "com.facebook.messaging.navigation.home.drawer.plugins.interfaces.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", andIncrement3, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.CommunitymessagingDrawerDrawerfoldermetadataproviderKillSwitch", "getMetadataProvider");
                    C4MY c4my = MutedCommunityMetadataProviderImplementation.A00;
                    11T.A0I(c4my, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadataProvider<out com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadata>");
                    arrayList.add(c4my);
                    r02.A04((Exception) null, "messaging.communitymessaging.drawer.drawerfoldermetadataprovider.mutedcommunitymetadataprovider.MutedCommunityMetadataProviderImplementation", "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", andIncrement3);
                }
                if (4ML.A03(r0)) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.div3invitemetadataprovider.DIv3InviteMetadataProviderImplementation", "messaging.communitymessaging.drawer.drawerfoldermetadataprovider.div3invitemetadataprovider.DIv3InviteMetadataProviderImplementation", "com.facebook.messaging.navigation.home.drawer.plugins.interfaces.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", andIncrement4, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.CommunitymessagingDrawerDrawerfoldermetadataproviderKillSwitch", "getMetadataProvider");
                    C4Mb c4Mb = DIv3InviteMetadataProviderImplementation.A00;
                    11T.A0I(c4Mb, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadataProvider<out com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadata>");
                    arrayList.add(c4Mb);
                    r02.A04((Exception) null, "messaging.communitymessaging.drawer.drawerfoldermetadataprovider.div3invitemetadataprovider.DIv3InviteMetadataProviderImplementation", "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", andIncrement4);
                }
                if (4ML.A02(r0)) {
                    i2 = atomicInteger.getAndIncrement();
                    str = "messaging.communitymessaging.drawer.drawerfoldermetadataprovider.custombadgetextmetadataprovider.CustomBadgeTextMetadataProviderImplementation";
                    r02.A0A("com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.custombadgetextmetadataprovider.CustomBadgeTextMetadataProviderImplementation", str, "com.facebook.messaging.navigation.home.drawer.plugins.interfaces.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", i2, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.drawer.plugins.drawerfoldermetadataprovider.CommunitymessagingDrawerDrawerfoldermetadataproviderKillSwitch", "getMetadataProvider");
                    C4Md c4Md = (C4Md) r0.A00.A01.getValue();
                    11T.A0I(c4Md, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadataProvider<out com.facebook.messaging.navigation.home.drawer.model.DrawerFolderMetadata>");
                    arrayList.add(c4Md);
                    r02.A04((Exception) null, str, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", i2);
                }
                while (arrayList.size() < 4ML.A00(r0)) {
                    arrayList.add(null);
                }
                r02.A02((Exception) null, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", andIncrement);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    4MR r04 = (4MR) it.next();
                    11T.A0D(r04);
                    A00.A02(r04.Asi(), r04.Axa(r302, i));
                }
                return A00.A00();
            } catch (Throwable th) {
                r02.A04((Exception) null, str, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", i2);
                throw th;
            }
        } catch (Throwable th2) {
            r02.A02((Exception) null, "messaging.navigation.home.drawer.drawerfoldermetadataprovider.DrawerFolderMetadataProviderInterfaceSpec", "getMetadataProvider", andIncrement);
            throw th2;
        }
    }
}
