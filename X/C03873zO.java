package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zO.class */
public final class C03873zO {
    public final C03883zP A00;

    public C03873zO(C03883zP c03883zP) {
        this.A00 = c03883zP;
    }

    public static C03873zO A00() {
        return new C03873zO((C03883zP) C1Y6.A00(null, "com_facebook_messaging_stella_plugins_interfaces_incomingmessageconfig_IncomingMessageConfigInterfaceSpec", "IncomingMessageConfig", new Object[0]));
    }

    public void A01() {
        C03893zQ c03893zQ = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = c03893zQ.A01;
        r0.A08("com.facebook.messaging.stella.plugins.interfaces.incomingmessageconfig.IncomingMessageConfigInterfaceSpec", "messaging.stella.incomingmessageconfig.IncomingMessageConfigInterfaceSpec", "shouldDropEpdMessages", andIncrement);
        try {
            if (C03893zQ.A00(c03893zQ)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.stella.plugins.productionincomingmessage.stella.StellaImplementation", "messaging.stella.productionincomingmessage.stella.StellaImplementation", "com.facebook.messaging.stella.plugins.interfaces.incomingmessageconfig.IncomingMessageConfigInterfaceSpec", andIncrement2, "messaging.stella.incomingmessageconfig.IncomingMessageConfigInterfaceSpec", "com.facebook.messaging.stella.plugins.productionincomingmessage.StellaProductionincomingmessageKillSwitch", "shouldDropEpdMessages");
                r0.A09("messaging.stella.productionincomingmessage.stella.StellaImplementation", "messaging.stella.incomingmessageconfig.IncomingMessageConfigInterfaceSpec", "shouldDropEpdMessages", andIncrement2);
            }
        } finally {
            r0.A02((Exception) null, "messaging.stella.incomingmessageconfig.IncomingMessageConfigInterfaceSpec", "shouldDropEpdMessages", andIncrement);
        }
    }
}
