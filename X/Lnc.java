package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Lnc.class */
public final class Lnc implements Runnable {
    public static final String __redex_internal_original_name = "MessagingMqttLifeCycleListener$onDisconnectSent$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ LYL A01;

    public Lnc(LYL lyl, long j) {
        this.A01 = lyl;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RFu rFu = this.A01.A01;
        long j = this.A00;
        RYq rYq = rFu.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = rYq.A02;
        String A00 = GOm.A00(310);
        r0.A08("com.facebook.messaging.mqtt.plugins.interfaces.lifecycle.MessagingMqttLifeCycleInterfaceSpec", "messaging.mqtt.lifecycle.MessagingMqttLifeCycleInterfaceSpec", A00, andIncrement);
        Exception e = null;
        try {
            if (RYq.A00(rYq)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.presencelogging.plugins.logger.mqttlifecycle.PresenceMqttLifeCycleImplementation", "messaging.presencelogging.logger.mqttlifecycle.PresenceMqttLifeCycleImplementation", "com.facebook.messaging.mqtt.plugins.interfaces.lifecycle.MessagingMqttLifeCycleInterfaceSpec", andIncrement2, "messaging.mqtt.lifecycle.MessagingMqttLifeCycleInterfaceSpec", "com.facebook.messaging.presencelogging.plugins.logger.PresenceLoggerKillSwitch", A00);
                try {
                    try {
                        5Ch.A00((5Ch) 1Br.A0B(rYq.A00.A00), (Boolean) null, (Boolean) null, (Boolean) null, 0S2.A01, Long.valueOf(j), (String) null, false);
                        r0.A09("messaging.presencelogging.logger.mqttlifecycle.PresenceMqttLifeCycleImplementation", "messaging.mqtt.lifecycle.MessagingMqttLifeCycleInterfaceSpec", A00, andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.presencelogging.logger.mqttlifecycle.PresenceMqttLifeCycleImplementation", "messaging.mqtt.lifecycle.MessagingMqttLifeCycleInterfaceSpec", A00, andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.mqtt.lifecycle.MessagingMqttLifeCycleInterfaceSpec", A00, andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.mqtt.lifecycle.MessagingMqttLifeCycleInterfaceSpec", A00, andIncrement);
            throw th2;
        }
    }
}
