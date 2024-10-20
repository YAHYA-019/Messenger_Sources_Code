package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.0B3, reason: invalid class name */
/* loaded from: 0B3.class */
public final class C0B3 {
    public final Sensor A00;
    public final SensorEventListener A01;

    public C0B3(SensorEventListener sensorEventListener, Sensor sensor) {
        this.A01 = sensorEventListener;
        this.A00 = sensor;
    }
}
