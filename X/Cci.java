package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cci.class */
public final class Cci implements DEU {
    public AudioChannelPresenceAccessoryComponentImplementation A01;
    public Object A02;
    public final Context A03;
    public final FbUserSession A04;
    public final C4NG A05;
    public final DrawerFolderKey A06;
    public final MigColorScheme A08;
    public int A00 = -1;
    public final 1YC A07 = 1YC.A03;

    public Cci(Context context, FbUserSession fbUserSession, C4NG c4ng, DrawerFolderKey drawerFolderKey, MigColorScheme migColorScheme) {
        this.A03 = context;
        this.A08 = migColorScheme;
        this.A06 = drawerFolderKey;
        this.A05 = c4ng;
        this.A04 = fbUserSession;
    }

    private boolean A00() {
        boolean A00;
        Object obj;
        if (this.A02 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A07;
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
                                this.A01 = new AudioChannelPresenceAccessoryComponentImplementation(this.A08);
                                obj = C1Y6.A02;
                            }
                            this.A02 = obj;
                            r0.A07("messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = BYp.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    obj = C1Y6.A03;
                    this.A02 = obj;
                    r0.A07("messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A02 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement, 1BL.A1U(this.A02));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement, 1BL.A1U(this.A02));
                throw th;
            }
        }
        return 1BK.A1U(this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r313v0 */
    public ArrayList AV9(0Da r302, 1Iw r303, HeterogeneousMap heterogeneousMap) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A07;
        r0.A08("com.facebook.messaging.navigation.home.drawer.components.plugins.interfaces.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "getAccessoryComponent", andIncrement);
        Exception e = null;
        try {
            ?? r313 = this.A00;
            boolean z = r313;
            if (r313 == -1) {
                boolean A00 = A00();
                this.A00 = A00 ? 1 : 0;
                z = A00;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "com.facebook.messaging.navigation.home.drawer.components.plugins.interfaces.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", andIncrement2, "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.CommunitymessagingFolderaccessorycomponentsKillSwitch", "getAccessoryComponent");
                try {
                    try {
                        AbJ.A1I(r302, this.A01.A00(r303, heterogeneousMap), A0t);
                        r0.A09("messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "getAccessoryComponent", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.communitymessaging.folderaccessorycomponents.audiochannelpresencecomponent.AudioChannelPresenceAccessoryComponentImplementation", "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "getAccessoryComponent", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "getAccessoryComponent", andIncrement);
            return A0t;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.navigation.home.drawer.components.folderaccessorycomponents.FolderAccessoryComponentsInterfaceSpec", "getAccessoryComponent", andIncrement);
            throw th2;
        }
    }
}
