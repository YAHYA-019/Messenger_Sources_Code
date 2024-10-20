package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wo, reason: invalid class name */
/* loaded from: 1wo.class */
public final class C1wo {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final SensorManager A03;
    public final Handler A04;
    public final C1wp A05;
    public final List A06;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1wp] */
    public C1wo(SensorManager sensorManager, Handler handler, int i, int i2) {
        11T.A0F(sensorManager, 1);
        this.A03 = sensorManager;
        this.A04 = handler;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = new SensorEventListener() { // from class: X.1wp
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i3) {
                11T.A0F(sensor, 0);
                List list = C1wo.this.A06;
                synchronized (list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((SensorEventListener) it.next()).onAccuracyChanged(sensor, i3);
                    }
                }
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                11T.A0F(sensorEvent, 0);
                List list = C1wo.this.A06;
                synchronized (list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((SensorEventListener) it.next()).onSensorChanged(sensorEvent);
                    }
                }
            }
        };
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        11T.A0A(synchronizedList);
        this.A06 = synchronizedList;
    }
}
