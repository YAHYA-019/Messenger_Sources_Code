package com.mapbox.mapboxsdk.location;

import X.0KQ;
import X.AnonymousClass001;
import X.C0Ax;
import X.GOn;
import X.GOo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.log.Logger;
import java.util.Iterator;
import java.util.List;

/* loaded from: LocationComponentCompassEngine.class */
public class LocationComponentCompassEngine implements SensorEventListener, CompassEngine {
    public static final float ALPHA = 0.45f;
    public static final int SENSOR_DELAY_MICROS = 100000;
    public static final String TAG = "Mbgl-LocationComponentCompassEngine";
    public Sensor compassSensor;
    public long compassUpdateNextTimestamp;
    public Sensor gravitySensor;
    public int lastAccuracySensorStatus;
    public float lastHeading;
    public Sensor magneticFieldSensor;
    public float[] rotationVectorValue;
    public final SensorManager sensorManager;
    public final WindowManager windowManager;
    public final List compassListeners = AnonymousClass001.A0s();
    public float[] truncatedRotationVectorValue = new float[4];
    public float[] rotationMatrix = new float[9];
    public float[] gravityValues = new float[3];
    public float[] magneticValues = new float[3];

    public LocationComponentCompassEngine(WindowManager windowManager, SensorManager sensorManager) {
        this.windowManager = windowManager;
        this.sensorManager = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        this.compassSensor = defaultSensor;
        if (defaultSensor == null) {
            if (isGyroscopeAvailable()) {
                Logger.d(TAG, "Rotation vector sensor not supported on device, falling back to orientation.");
                this.compassSensor = sensorManager.getDefaultSensor(3);
            } else {
                Logger.d(TAG, "Rotation vector sensor not supported on device, falling back to accelerometer and magnetic field.");
                this.gravitySensor = sensorManager.getDefaultSensor(1);
                this.magneticFieldSensor = sensorManager.getDefaultSensor(2);
            }
        }
    }

    private float[] getRotationVectorFromSensorEvent(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr.length <= 4) {
            return fArr;
        }
        System.arraycopy(fArr, 0, this.truncatedRotationVectorValue, 0, 4);
        return this.truncatedRotationVectorValue;
    }

    private boolean isCompassSensorAvailable() {
        return AnonymousClass001.A1T(this.compassSensor);
    }

    private boolean isGyroscopeAvailable() {
        return AnonymousClass001.A1T(this.sensorManager.getDefaultSensor(4));
    }

    private float[] lowPassFilter(float[] fArr, float[] fArr2) {
        if (fArr2 == null) {
            return fArr;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= fArr.length) {
                return fArr2;
            }
            fArr2[i2] = GOn.A01(fArr[i2], fArr2[i2], 0.45f);
            i = i2 + 1;
        }
    }

    private void notifyCompassChangeListeners(float f) {
        Iterator it = this.compassListeners.iterator();
        while (it.hasNext()) {
            ((CompassListener) it.next()).onCompassChanged(f);
        }
        this.lastHeading = f;
    }

    private void registerSensorListeners() {
        Sensor sensor;
        boolean A1T = AnonymousClass001.A1T(this.compassSensor);
        SensorManager sensorManager = this.sensorManager;
        if (A1T) {
            sensor = this.compassSensor;
        } else {
            0KQ.A01(this.gravitySensor, this, sensorManager, SENSOR_DELAY_MICROS);
            sensorManager = this.sensorManager;
            sensor = this.magneticFieldSensor;
        }
        0KQ.A01(sensor, this, sensorManager, SENSOR_DELAY_MICROS);
    }

    private void unregisterSensorListeners() {
        Sensor sensor;
        boolean A1T = AnonymousClass001.A1T(this.compassSensor);
        SensorManager sensorManager = this.sensorManager;
        if (A1T) {
            sensor = this.compassSensor;
        } else {
            Sensor sensor2 = this.gravitySensor;
            sensorManager.unregisterListener(this, sensor2);
            C0Ax.A00.A06(this, sensor2);
            sensorManager = this.sensorManager;
            sensor = this.magneticFieldSensor;
        }
        sensorManager.unregisterListener(this, sensor);
        C0Ax.A00.A06(this, sensor);
    }

    private void updateOrientation() {
        float[] fArr = this.rotationVectorValue;
        if (fArr != null) {
            SensorManager.getRotationMatrixFromVector(this.rotationMatrix, fArr);
        } else {
            SensorManager.getRotationMatrix(this.rotationMatrix, null, this.gravityValues, this.magneticValues);
        }
        int A04 = GOo.A04(this.windowManager);
        int i = 131;
        int i2 = 129;
        if (A04 == 1) {
            i = 3;
        } else if (A04 != 2) {
            i2 = 1;
            if (A04 != 3) {
                i = 1;
                i2 = 3;
            }
        } else {
            i = 129;
            i2 = 131;
        }
        float[] fArr2 = new float[9];
        SensorManager.remapCoordinateSystem(this.rotationMatrix, i, i2, fArr2);
        SensorManager.getOrientation(fArr2, new float[3]);
        notifyCompassChangeListeners((float) Math.toDegrees(r0[0]));
    }

    @Override // com.mapbox.mapboxsdk.location.CompassEngine
    public void addCompassListener(CompassListener compassListener) {
        if (this.compassListeners.isEmpty()) {
            registerSensorListeners();
        }
        this.compassListeners.add(compassListener);
    }

    @Override // com.mapbox.mapboxsdk.location.CompassEngine
    public int getLastAccuracySensorStatus() {
        return this.lastAccuracySensorStatus;
    }

    @Override // com.mapbox.mapboxsdk.location.CompassEngine
    public float getLastHeading() {
        return this.lastHeading;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (this.lastAccuracySensorStatus != i) {
            Iterator it = this.compassListeners.iterator();
            while (it.hasNext()) {
                ((CompassListener) it.next()).onCompassAccuracyChange(i);
            }
            this.lastAccuracySensorStatus = i;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime >= this.compassUpdateNextTimestamp) {
            if (this.lastAccuracySensorStatus == 0) {
                Logger.d(TAG, "Compass sensor is unreliable, device calibration is needed.");
                return;
            }
            if (sensorEvent.sensor.getType() != 11) {
                if (sensorEvent.sensor.getType() == 3) {
                    notifyCompassChangeListeners((sensorEvent.values[0] + 360.0f) % 360.0f);
                } else if (sensorEvent.sensor.getType() == 1) {
                    this.gravityValues = lowPassFilter(getRotationVectorFromSensorEvent(sensorEvent), this.gravityValues);
                } else if (sensorEvent.sensor.getType() == 2) {
                    this.magneticValues = lowPassFilter(getRotationVectorFromSensorEvent(sensorEvent), this.magneticValues);
                }
                this.compassUpdateNextTimestamp = elapsedRealtime + 500;
            }
            this.rotationVectorValue = getRotationVectorFromSensorEvent(sensorEvent);
            updateOrientation();
            this.compassUpdateNextTimestamp = elapsedRealtime + 500;
        }
    }

    @Override // com.mapbox.mapboxsdk.location.CompassEngine
    public void removeCompassListener(CompassListener compassListener) {
        this.compassListeners.remove(compassListener);
        if (this.compassListeners.isEmpty()) {
            unregisterSensorListeners();
        }
    }
}
