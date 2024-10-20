package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;

/* renamed from: X.1xu, reason: invalid class name */
/* loaded from: 1xu.class */
public final class C1xu {
    public int A00;
    public Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final MqttNetworkSessionPlugin A04;

    public C1xu() {
        Context A00 = FbInjector.A00();
        this.A01 = A00;
        11T.A09(A00);
        this.A02 = 1HG.A00(A00, 66156);
        this.A03 = 1Bq.A00(66687);
        this.A00 = -1;
        this.A04 = MqttNetworkSessionPlugin.get();
    }
}
