package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9rj, reason: invalid class name */
/* loaded from: 9rj.class */
public final class C9rj implements 2W8 {
    public CommunityChannelListEventsConfigProviderImplementation A00;
    public Object A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 2S4 A04;
    public final ThreadKey A05;
    public final 1YC A06 = 1YC.A03;
    public final 1Va A07;
    public final Context A08;

    public C9rj(Context context, Context context2, FbUserSession fbUserSession, 2S4 r305, ThreadKey threadKey, 1Va r307) {
        this.A08 = context;
        this.A02 = context2;
        this.A07 = r307;
        this.A04 = r305;
        this.A03 = fbUserSession;
        this.A05 = threadKey;
    }

    public 1VC Aeb() {
        Object obj;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A06;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", "getControllerConfigProvider", andIncrement);
        1VC r310 = null;
        try {
            if (this.A01 == null) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0B("com.facebook.messaging.communitymessaging.plugins.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "messaging.communitymessaging.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", 1BJ.A00(1), andIncrement2);
                Exception exc = null;
                try {
                    try {
                        if (C2pj.A01(r0, atomicInteger)) {
                            this.A00 = new CommunityChannelListEventsConfigProviderImplementation(this.A02, this.A03, this.A04, this.A05, this.A07);
                            obj = C1Y6.A02;
                        } else {
                            obj = C1Y6.A03;
                        }
                        this.A01 = obj;
                        r0.A07("messaging.communitymessaging.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", andIncrement2, 1BK.A1V(obj, C1Y6.A03));
                    } catch (Exception e) {
                        this.A01 = C1Y6.A03;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            exc = e;
                            r0.A03(exc, "messaging.communitymessaging.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", andIncrement2, 1BK.A1V(this.A01, C1Y6.A03));
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r0.A03(exc, "messaging.communitymessaging.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", andIncrement2, 1BK.A1V(this.A01, C1Y6.A03));
                    throw th;
                }
            }
            if (this.A01 != C1Y6.A03) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "messaging.communitymessaging.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", andIncrement3, "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", 1BJ.A00(1), "getControllerConfigProvider");
                    try {
                        new A79(this.A00);
                        r0.A09("messaging.communitymessaging.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", "getControllerConfigProvider", andIncrement3);
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r0.A04((Exception) null, "messaging.communitymessaging.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation", "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", "getControllerConfigProvider", andIncrement3);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", "getControllerConfigProvider", andIncrement);
            return r310;
        } catch (Throwable th4) {
            r0.A02((Exception) null, "messaging.threadlist.eventsconfig.ThreadListEventsConfigProviderInterfaceSpec", "getControllerConfigProvider", andIncrement);
            throw th4;
        }
    }
}
