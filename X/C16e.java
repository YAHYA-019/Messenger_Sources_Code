package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.16e, reason: invalid class name */
/* loaded from: 16e.class */
public final class C16e implements SensorEventListener {
    public Sensor A00;
    public SensorManager A01;
    public final C16j A02 = new C16j();
    public final 17M A03;

    public C16e(17M r302) {
        this.A03 = r302;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        17B r323;
        17B r0;
        float[] fArr = sensorEvent.values;
        boolean z = false;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        if ((f * f) + (f2 * f2) + (f3 * f3) > 169.0d) {
            z = true;
        }
        long j = sensorEvent.timestamp;
        C16j c16j = this.A02;
        long j2 = j - 500000000;
        while (true) {
            i = c16j.A01;
            if (i < 4 || (r0 = c16j.A03) == null || j2 - r0.A00 <= 0) {
                break;
            }
            if (r0.A02) {
                c16j.A00--;
            }
            c16j.A01 = i - 1;
            17B r02 = r0.A01;
            c16j.A03 = r02;
            if (r02 == null) {
                c16j.A02 = null;
            }
            AnonymousClass171 anonymousClass171 = c16j.A04;
            r0.A01 = anonymousClass171.A00;
            anonymousClass171.A00 = r0;
        }
        AnonymousClass171 anonymousClass1712 = c16j.A04;
        17B r3232 = anonymousClass1712.A00;
        if (r3232 == null) {
            r323 = new Object();
        } else {
            anonymousClass1712.A00 = r3232.A01;
            r323 = r3232;
        }
        r323.A00 = j;
        r323.A02 = z;
        r323.A01 = null;
        17B r03 = c16j.A02;
        if (r03 != null) {
            r03.A01 = r323;
        }
        c16j.A02 = r323;
        17B r329 = c16j.A03;
        if (r329 == null) {
            c16j.A03 = r323;
            r329 = r323;
        }
        int i2 = i + 1;
        c16j.A01 = i2;
        if (z) {
            c16j.A00++;
        }
        if (r329 == null || j - r329.A00 < 250000000 || c16j.A00 < (i2 >> 1) + (i2 >> 2)) {
            return;
        }
        c16j.A00();
        this.A03.BNr();
    }
}
