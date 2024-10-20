package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;

/* renamed from: X.2sj, reason: invalid class name */
/* loaded from: 2sj.class */
public final class C2sj extends C1iw {
    public static final String __redex_internal_original_name = "MqttNetworkSessionPlugin$5";
    public final /* synthetic */ MqttNetworkSessionPlugin A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2sj(MqttNetworkSessionPlugin mqttNetworkSessionPlugin) {
        super("onMqttDisconnected");
        this.A00 = mqttNetworkSessionPlugin;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.onMqttDisconnected();
    }
}
