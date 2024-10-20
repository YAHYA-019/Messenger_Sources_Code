package com.facebook.messenger.plugins.mcisurfacettrcloggerplugin;

import X.0Pz;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1SF;
import X.1V8;
import X.1Va;
import X.1Wc;
import X.1hN;
import X.1hO;
import X.1hQ;
import X.C06w;
import X.C06z;
import X.C1nq;
import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;

/* loaded from: MCISurfaceTTRCLoggerPluginSessionless.class */
public final class MCISurfaceTTRCLoggerPluginSessionless extends Sessionless {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(MCISurfaceTTRCLoggerPluginSessionless.class, "startupTTRCDestinationManager", "getStartupTTRCDestinationManager()Lcom/facebook/messaging/analytics/platform_logger/startup/util/MPLStartupTTRCDestinationManager;", 0)};
    public static final C1nq Companion = new Object();
    public final 1Va publisher;
    public final 1Br startupTTRCDestinationManager$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCISurfaceTTRCLoggerPluginSessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        super(messengerSessionlessMCPContext);
        11T.A0F(messengerSessionlessMCPContext, 1);
        this.publisher = 1V8.A00();
        this.startupTTRCDestinationManager$delegate = 1Bq.A00(66441);
    }

    private final 1hN getStartupTTRCDestinationManager() {
        return (1hN) this.startupTTRCDestinationManager$delegate.A00.get();
    }

    @Override // com.facebook.messenger.plugins.mcisurfacettrcloggerplugin.Sessionless
    public void MCISurfaceTTRCLoggerPluginImpl_MCISurfaceTTRCLoggerThreadListObserverLoadCallbackEnd(String str, long j, boolean z) {
        this.publisher.CZm(new PRELoggingEvent(0Pz.A0W("query/thread_list/observer_query/", str), "_end", j));
        if (z) {
            return;
        }
        1hN startupTTRCDestinationManager = getStartupTTRCDestinationManager();
        1Wc r0 = (1Wc) startupTTRCDestinationManager.A04.A00.get();
        if (r0.A02 != 0) {
            r0.A0N("thread_list");
        }
        1SF r02 = (1SF) startupTTRCDestinationManager.A00.A00.get();
        if (1SF.A00(r02, "thread_list_drawn") != 0) {
            r02.A0N("thread_list");
        }
        1hO r03 = (1hO) startupTTRCDestinationManager.A02.A00.get();
        if (r03.A00 != 0) {
            r03.A0N("thread_list");
        }
        1hQ r04 = (1hQ) startupTTRCDestinationManager.A05.A00.get();
        if (r04.A00 != 0) {
            r04.A0N("thread_list");
        }
    }

    @Override // com.facebook.messenger.plugins.mcisurfacettrcloggerplugin.Sessionless
    public void MCISurfaceTTRCLoggerPluginImpl_MCISurfaceTTRCLoggerThreadListObserverLoadCallbackStart(String str, long j) {
        this.publisher.CZm(new PRELoggingEvent(0Pz.A0W("query/thread_list/observer_query/", str), "_start", j));
    }
}
