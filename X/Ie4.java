package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: Ie4.class */
public final class Ie4 implements JLt {
    public final CameraCaptureSession A00;

    public Ie4(CameraCaptureSession cameraCaptureSession) {
        this.A00 = cameraCaptureSession;
    }

    public static void A00(CameraDevice cameraDevice, Iea iea, List list, Executor executor) {
        GSo gSo = new GSo(iea);
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            Hed hed = (Hed) list.get(i2);
            OutputConfiguration outputConfiguration = new OutputConfiguration(hed.A02);
            outputConfiguration.setStreamUseCase(hed.A01);
            outputConfiguration.setDynamicRangeProfile(hed.A00 != 1 ? 1L : 2);
            A0s.add(outputConfiguration);
            i = i2 + 1;
        }
        List emptyList = Collections.emptyList();
        int size2 = emptyList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            A0s.add(new OutputConfiguration((Surface) emptyList.get(i3)));
        }
        cameraDevice.createCaptureSession(new SessionConfiguration(0, A0s, executor, gSo));
    }

    public static void A01(CameraDevice cameraDevice, Iea iea, List list, Executor executor, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0s.add(((Hed) list.get(i)).A02);
        }
        if (Build.VERSION.SDK_INT < 33 || !z) {
            cameraDevice.createCaptureSession(A0s, new GSo(iea), null);
        } else {
            A00(cameraDevice, iea, list, executor);
        }
    }

    @Override // X.JLt
    public void A3d() {
        this.A00.abortCaptures();
    }

    @Override // X.JLt
    public int AEP(CaptureRequest captureRequest, Handler handler, JLH jlh) {
        return this.A00.capture(captureRequest, jlh != null ? new GSn(jlh, this) : null, null);
    }

    @Override // X.JLt
    public boolean BSU() {
        return false;
    }

    @Override // X.JLt
    public int Ctz(CaptureRequest captureRequest, Handler handler, JLH jlh) {
        CameraCaptureSession cameraCaptureSession = this.A00;
        GSn gSn = jlh != null ? new GSn(jlh, this) : null;
        0Sg r0 = 0Sg.$redex_init_class;
        int repeatingRequest = cameraCaptureSession.setRepeatingRequest(captureRequest, gSn, null);
        if (0Es.A03()) {
            CameraDevice device = cameraCaptureSession.getDevice();
            try {
                ReadWriteLock readWriteLock = 0Es.A02;
                readWriteLock.readLock().lock();
                List list = 0Es.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((0Ev) list.get(i)).A00(device);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                0Es.A02.readLock().unlock();
                throw th;
            }
        }
        return repeatingRequest;
    }

    @Override // X.JLt
    public void close() {
        CameraCaptureSession cameraCaptureSession = this.A00;
        0Sg r0 = 0Sg.$redex_init_class;
        cameraCaptureSession.close();
        if (0Es.A03()) {
            CameraDevice device = cameraCaptureSession.getDevice();
            try {
                ReadWriteLock readWriteLock = 0Es.A02;
                readWriteLock.readLock().lock();
                List list = 0Es.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((0Ev) list.get(i)).A01(device);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                0Es.A02.readLock().unlock();
                throw th;
            }
        }
    }
}
