package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation;
import com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.bellcrossaccessorycomponent.BellCrossAccessoryComponentImplementation;
import com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.cmcustombadgecomponent.CMCustomBadgeComponentImplementation;
import com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.communityinviteaccessorycomponent.CommunityInviteAccessoryComponentImplementation;
import com.facebook.messaging.navigation.home.drawer.components.plugins.folderaccessorycomponents.badgetextcountcomponent.BadgeTextCountComponentImplementation;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccj.class */
public final class Ccj implements DEU {
    public AudioChannelPresenceAccessoryComponentImplementation A01;
    public BellCrossAccessoryComponentImplementation A02;
    public CMCustomBadgeComponentImplementation A03;
    public CommunityInviteAccessoryComponentImplementation A04;
    public BadgeTextCountComponentImplementation A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public final Context A0B;
    public final FbUserSession A0C;
    public final C4NG A0D;
    public final DrawerFolderKey A0E;
    public final MigColorScheme A0G;
    public int A00 = -1;
    public final 1YC A0F = 1YC.A03;

    public Ccj(Context context, FbUserSession fbUserSession, C4NG c4ng, DrawerFolderKey drawerFolderKey, MigColorScheme migColorScheme) {
        this.A0B = context;
        this.A0G = migColorScheme;
        this.A0E = drawerFolderKey;
        this.A0D = c4ng;
        this.A0C = fbUserSession;
    }

    private boolean A00() {
        boolean A00;
        Object obj;
        if (this.A06 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0F;
            r0.A0B("com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "com.facebook.messaging.navigation.home.drawer.components.plugins.interfaces.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.CommunitymessagingFolderaccessorycomponentsKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    if (BYp.A00 == i) {
                        Boolean bool = BYp.A01;
                        if (bool != null) {
                            A00 = bool.booleanValue();
                            if (A00 || !1BL.A0Q().AZk(36318612822569774L)) {
                                obj = C1Y6.A03;
                            } else {
                                this.A01 = new AudioChannelPresenceAccessoryComponentImplementation(this.A0G);
                                obj = C1Y6.A02;
                            }
                            this.A06 = obj;
                            r0.A07("messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = BYp.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    obj = C1Y6.A03;
                    this.A06 = obj;
                    r0.A07("messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A06 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement, 1BL.A1U(this.A06));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement, 1BL.A1U(this.A06));
                throw th;
            }
        }
        return 1BK.A1U(this.A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x0094, all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0094, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:16:0x0072, B:18:0x0077, B:19:0x007d, B:20:0x0081, B:20:0x0081, B:23:0x008d, B:26:0x0088, B:28:0x0060), top: B:4:0x003b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[Catch: Exception -> 0x0094, all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0094, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:16:0x0072, B:18:0x0077, B:19:0x007d, B:20:0x0081, B:20:0x0081, B:23:0x008d, B:26:0x0088, B:28:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccj.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x00b4, all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b4, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006f, B:17:0x00ad, B:20:0x0076, B:22:0x0083, B:25:0x0093, B:26:0x0099, B:28:0x009e, B:29:0x00a4, B:30:0x00a8, B:30:0x00a8, B:33:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccj.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x00aa, all -> 0x00b6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00aa, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:16:0x0072, B:17:0x0078, B:18:0x007d, B:19:0x0083, B:21:0x008d, B:22:0x0093, B:23:0x0097, B:23:0x0097, B:26:0x00a3, B:29:0x009e, B:31:0x0060), top: B:4:0x003b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: Exception -> 0x00aa, all -> 0x00b6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00aa, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:16:0x0072, B:17:0x0078, B:18:0x007d, B:19:0x0083, B:21:0x008d, B:22:0x0093, B:23:0x0097, B:23:0x0097, B:26:0x00a3, B:29:0x009e, B:31:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccj.A03():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[Catch: Exception -> 0x010e, all -> 0x011a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x010e, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x00b2, B:18:0x00f0, B:20:0x00b9, B:22:0x00c4, B:25:0x00d5, B:26:0x00db, B:28:0x00e1, B:29:0x00e7, B:30:0x00eb, B:30:0x00eb, B:32:0x0061, B:37:0x00a0, B:37:0x00a0, B:39:0x00a4, B:40:0x0070, B:42:0x0080, B:50:0x009b, B:58:0x00fc, B:60:0x0106, B:62:0x010d), top: B:5:0x003f, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccj.A04():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x05a8, code lost:
    
        if (((com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey) r0).A00 != X.1F9.A0I) goto L260;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v247, types: [int] */
    /* JADX WARN: Type inference failed for: r0v351, types: [int] */
    /* JADX WARN: Type inference failed for: r0v353, types: [int] */
    /* JADX WARN: Type inference failed for: r0v355, types: [int] */
    /* JADX WARN: Type inference failed for: r0v357, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int] */
    /* JADX WARN: Type inference failed for: r312v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList AV9(X.0Da r302, X.1Iw r303, com.facebook.xapp.messaging.map.HeterogeneousMap r304) {
        /*
            Method dump skipped, instructions count: 1719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccj.AV9(X.0Da, X.1Iw, com.facebook.xapp.messaging.map.HeterogeneousMap):java.util.ArrayList");
    }
}
