package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* renamed from: X.1vs, reason: invalid class name */
/* loaded from: 1vs.class */
public final class C1vs {
    public Context A00;
    public C1vw A01;
    public C1wo A02;
    public boolean A03;
    public 1BY A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;

    /* JADX WARN: Type inference failed for: r0v60, types: [X.1vw] */
    public C1vs(final C1vk c1vk, 1BO r303) {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A00 = context;
        1HH r0 = new 1HH(context, 100185);
        this.A07 = r0;
        1BV r02 = new 1BV((1BY) null, 16453);
        this.A06 = r02;
        1BQ r03 = new 1BQ(16385);
        this.A05 = r03;
        this.A04 = new 1BY(r303);
        2yD r04 = (2yD) r03.get();
        int Auy = (int) r04.Auy(36592099163177255L);
        int Auy2 = (int) r04.Auy(36592099163111718L);
        int Auy3 = (int) r04.Auy(36592099163832616L);
        if (Auy3 <= 0) {
            0fH.A18("FbRageShakeManager", "shakeDetectionDurationMs set to %d", AnonymousClass001.A1a(Auy3));
            Auy3 = 1500;
        }
        float Ai7 = (float) r04.Ai7(37155049115942953L);
        if (Ai7 <= 0.0f) {
            0fH.A18("FbRageShakeManager", "rageShakeForceThreshold set to %f", new Object[]{Float.valueOf(Ai7)});
            Ai7 = 35.0f;
        }
        int Auy4 = (int) r04.Auy(36592099162587429L);
        if (Auy4 <= 0) {
            0fH.A18("FbRageShakeManager", "numRequiredOutliers set to %d", AnonymousClass001.A1a(Auy4));
            Auy4 = 7;
        }
        long Auy5 = r04.Auy(36592099164029225L);
        if (Auy5 != 0 && Auy5 != 1) {
            0fH.A18("FbRageShakeManager", "rageShakeCountingStrategy set to %d", 1BK.A1Z(Auy5));
            Auy5 = 1;
        }
        final float f = Ai7;
        final int i = Auy3;
        final int i2 = Auy4;
        final long j = Auy5;
        this.A01 = new SensorEventListener(c1vk, f, i, i2, j) { // from class: X.1vw
            public final C1vk A00;
            public final C1vx A01;

            {
                this.A00 = c1vk;
                this.A01 = new C1vx(f, i, i2, j);
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i3) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:34:0x01e3 A[LOOP:4: B:32:0x018e->B:34:0x01e3, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x01a9 A[EDGE_INSN: B:35:0x01a9->B:36:0x01a9 BREAK  A[LOOP:4: B:32:0x018e->B:34:0x01e3], SYNTHETIC] */
            @Override // android.hardware.SensorEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onSensorChanged(android.hardware.SensorEvent r302) {
                /*
                    Method dump skipped, instructions count: 926
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1vw.onSensorChanged(android.hardware.SensorEvent):void");
            }
        };
        this.A02 = new C1wo((SensorManager) r0.get(), (Handler) r02.get(), Auy, Auy2);
    }
}
