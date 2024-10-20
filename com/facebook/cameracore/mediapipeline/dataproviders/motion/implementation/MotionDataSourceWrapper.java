package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.0KQ;
import X.AbstractC2327GOs;
import X.C0Ax;
import X.IA4;
import X.IOb;
import X.JCi;
import X.Qnf;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Handler;
import com.facebook.jni.HybridData;

/* loaded from: MotionDataSourceWrapper.class */
public class MotionDataSourceWrapper {
    public final JCi mDataSource;
    public final HybridData mHybridData = initHybrid();
    public boolean mIsAlive = true;

    public MotionDataSourceWrapper(JCi jCi) {
        this.mDataSource = jCi;
        ((IOb) jCi).A0O.add(this);
    }

    private native HybridData initHybrid();

    private native void setData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j);

    private native void setRawSensorResult(int i, float[] fArr, long j);

    public void destroy() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }

    public int getExecutionMode() {
        return 1 - this.mDataSource.A0N.intValue() != 0 ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0.A0B != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasRawData() {
        /*
            r301 = this;
            r0 = r301
            X.JCi r0 = r0.mDataSource
            X.IOb r0 = (X.IOb) r0
            r302 = r0
            r0 = r302
            android.hardware.Sensor r0 = r0.A09
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L27
            r0 = r302
            android.hardware.Sensor r0 = r0.A0A
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L27
            r0 = r302
            android.hardware.Sensor r0 = r0.A0B
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L29
        L27:
            r0 = 1
            r304 = r0
        L29:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper.hasRawData():boolean");
    }

    public boolean isSensorAvailable(int i) {
        Sensor sensor;
        IOb iOb = this.mDataSource;
        boolean z = false;
        if (i == 0) {
            sensor = iOb.A0D;
        } else if (i == 1) {
            sensor = iOb.A07;
        } else {
            if (i != 2) {
                if (i == 3) {
                    sensor = iOb.A0C;
                }
                return z;
            }
            sensor = iOb.A08;
        }
        if (sensor != null) {
            z = true;
        }
        return z;
    }

    public void onDataChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        if (this.mIsAlive) {
            setData(fArr, fArr2, fArr3, fArr4, j);
        }
    }

    public void onRawSensorMeasurementChanged(Qnf qnf, float[] fArr, long j) {
        if (this.mIsAlive) {
            setRawSensorResult(qnf.mCppValue, fArr, j);
        }
    }

    public void start() {
        IOb iOb = this.mDataSource;
        synchronized (iOb) {
            if (!iOb.A04) {
                iOb.A04 = true;
                iOb.A05 = false;
                int intValue = iOb.A0N.intValue();
                if (intValue == 0) {
                    SensorManager sensorManager = iOb.A0L;
                    if (sensorManager != null) {
                        Handler handler = iOb.A03;
                        if (handler == null) {
                            handler = IA4.A00((Handler.Callback) null, IA4.A02, "SensorMotionDataSource", 0);
                            iOb.A03 = handler;
                        }
                        iOb.A01 = 2;
                        Sensor sensor = iOb.A0D;
                        if (sensor != null) {
                            SensorEventListener sensorEventListener = iOb.A0K;
                            if (sensorManager.registerListener(sensorEventListener, sensor, iOb.A06, handler)) {
                                C0Ax.A00.A05(sensorEventListener, sensor);
                            }
                        }
                        Sensor sensor2 = iOb.A07;
                        if (sensor2 != null) {
                            AbstractC2327GOs.A0c(sensor2, iOb.A0E, sensorManager, iOb);
                        }
                        Sensor sensor3 = iOb.A08;
                        if (sensor3 != null) {
                            AbstractC2327GOs.A0c(sensor3, iOb.A0F, sensorManager, iOb);
                        }
                        Sensor sensor4 = iOb.A0C;
                        if (sensor4 != null) {
                            AbstractC2327GOs.A0c(sensor4, iOb.A0J, sensorManager, iOb);
                        }
                        Sensor sensor5 = iOb.A09;
                        if (sensor5 != null) {
                            AbstractC2327GOs.A0c(sensor5, iOb.A0G, sensorManager, iOb);
                        }
                        Sensor sensor6 = iOb.A0A;
                        if (sensor6 != null) {
                            AbstractC2327GOs.A0c(sensor6, iOb.A0H, sensorManager, iOb);
                        }
                        Sensor sensor7 = iOb.A0B;
                        if (sensor7 != null) {
                            AbstractC2327GOs.A0c(sensor7, iOb.A0I, sensorManager, iOb);
                        }
                    }
                } else if (intValue == 1) {
                    Matrix.setIdentityM(iOb.A0T, 0);
                    Matrix.setIdentityM(iOb.A0R, 0);
                    Matrix.setIdentityM(iOb.A0S, 0);
                    float[] fArr = iOb.A0P;
                    float[] fArr2 = IOb.A0V;
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    fArr[2] = fArr2[2];
                    float[] fArr3 = iOb.A0Q;
                    float[] fArr4 = IOb.A0W;
                    fArr3[0] = fArr4[0];
                    fArr3[1] = fArr4[1];
                    fArr3[2] = fArr4[2];
                    float[] fArr5 = iOb.A0U;
                    float[] fArr6 = IOb.A0X;
                    fArr5[0] = fArr6[0];
                    fArr5[1] = fArr6[1];
                    fArr5[2] = fArr6[2];
                    iOb.A01 = 0;
                    IOb.A00(iOb);
                }
            }
        }
    }

    public void stop() {
        IOb iOb = this.mDataSource;
        synchronized (iOb) {
            if (iOb.A04) {
                int intValue = iOb.A0N.intValue();
                if (intValue == 0) {
                    SensorManager sensorManager = iOb.A0L;
                    if (sensorManager != null) {
                        if (iOb.A0D != null) {
                            0KQ.A00(iOb.A0K, sensorManager);
                        }
                        if (iOb.A07 != null) {
                            0KQ.A00(iOb.A0E, sensorManager);
                        }
                        if (iOb.A08 != null) {
                            0KQ.A00(iOb.A0F, sensorManager);
                        }
                        if (iOb.A0C != null) {
                            0KQ.A00(iOb.A0J, sensorManager);
                        }
                        if (iOb.A09 != null) {
                            0KQ.A00(iOb.A0G, sensorManager);
                        }
                        if (iOb.A0A != null) {
                            0KQ.A00(iOb.A0H, sensorManager);
                        }
                        if (iOb.A0B != null) {
                            0KQ.A00(iOb.A0I, sensorManager);
                        }
                        Handler handler = iOb.A03;
                        if (handler != null) {
                            IA4.A01(handler, false, false);
                            iOb.A03 = null;
                        }
                    }
                } else if (intValue == 1) {
                    iOb.A00 = 0.0f;
                    int i = 0;
                    iOb.A05 = false;
                    do {
                        iOb.A0T[i] = 0.0f;
                        iOb.A0R[i] = 0.0f;
                        iOb.A0S[i] = 0.0f;
                        i++;
                    } while (i < 16);
                    int i2 = 0;
                    do {
                        iOb.A0P[i2] = 0.0f;
                        iOb.A0Q[i2] = 0.0f;
                        iOb.A0U[i2] = 0.0f;
                        i2++;
                    } while (i2 < 3);
                }
                iOb.A04 = false;
                iOb.A05 = false;
                iOb.A0O.clear();
            }
        }
    }
}
