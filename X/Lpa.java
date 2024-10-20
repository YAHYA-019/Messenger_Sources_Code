package X;

/* loaded from: Lpa.class */
public final class Lpa implements Runnable {
    public static final String __redex_internal_original_name = "MqttConnectionManager$4";
    public final /* synthetic */ JvI A00;
    public final /* synthetic */ RwY A01;
    public final /* synthetic */ C1Al A02;

    public Lpa(JvI jvI, RwY rwY, C1Al c1Al) {
        this.A00 = jvI;
        this.A01 = rwY;
        this.A02 = c1Al;
    }

    @Override // java.lang.Runnable
    public void run() {
        JvI jvI = this.A00;
        java.util.Map map = JvI.A05;
        if (jvI.A15 != null) {
            0fH.A0m("MqttConnectionManager", "preemptive/abort; connection existed");
            return;
        }
        Integer valueOf = Integer.valueOf(this.A01.A01);
        int i = ((C0kl) this.A02).A01;
        0fH.A0f(valueOf, Integer.valueOf(i), "MqttConnectionManager", "preemptive/create_new_connection; op_id: %d op_id: %d");
        jvI.A15 = jvI.A0C();
        jvI.A00 = i;
    }
}
