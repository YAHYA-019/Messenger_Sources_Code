package X;

import com.facebook.messaging.friendsinboxunit.plugins.closeconnectionsloader.implementation.CloseConnectionsInboxUnitLoaderImplementation;

/* renamed from: X.3uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3uy.class */
public final class C02363uy implements 2Tb {
    public final /* synthetic */ 2T5 A00;
    public final /* synthetic */ CloseConnectionsInboxUnitLoaderImplementation A01;

    public C02363uy(2T5 r302, CloseConnectionsInboxUnitLoaderImplementation closeConnectionsInboxUnitLoaderImplementation) {
        this.A01 = closeConnectionsInboxUnitLoaderImplementation;
        this.A00 = r302;
    }

    public void C96(3wG r302) {
        0fH.A0g(r302, 1BJ.A00(669), "ActiveNow onNewResult, result=%s");
        CloseConnectionsInboxUnitLoaderImplementation closeConnectionsInboxUnitLoaderImplementation = this.A01;
        boolean z = false;
        if (09K.A01(r302.A00.A00.A00)) {
            z = true;
        }
        closeConnectionsInboxUnitLoaderImplementation.A00 = !z;
        this.A00.Bgc(r302, "ACTIVENOW", "active now loaded");
    }
}
