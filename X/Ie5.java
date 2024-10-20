package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: Ie5.class */
public final class Ie5 implements JLt {
    public final CameraExtensionSession A00;
    public final Executor A01;

    public Ie5(CameraExtensionSession cameraExtensionSession, Executor executor) {
        this.A00 = cameraExtensionSession;
        this.A01 = executor;
    }

    public static void A01(CameraDevice cameraDevice, Iea iea, List list, Executor executor, int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                cameraDevice.createExtensionSession(new ExtensionSessionConfiguration(i, A0s, executor, new GSr(iea, executor)));
                return;
            } else {
                A0s.add(new OutputConfiguration(((Hed) list.get(i3)).A02));
                i2 = i3 + 1;
            }
        }
    }

    @Override // X.JLt
    public void A3d() {
    }

    @Override // X.JLt
    public int AEP(CaptureRequest captureRequest, Handler handler, JLH jlh) {
        return this.A00.capture(captureRequest, this.A01, new GSq(jlh, this));
    }

    @Override // X.JLt
    public boolean BSU() {
        return true;
    }

    @Override // X.JLt
    public int Ctz(CaptureRequest captureRequest, Handler handler, JLH jlh) {
        return this.A00.setRepeatingRequest(captureRequest, this.A01, new GSq(jlh, this));
    }

    @Override // X.JLt
    public void close() {
        try {
            this.A00.close();
        } catch (CameraAccessException unused) {
            ID3.A02("Camera2ExtensionSession", "CameraAccessException on close()!");
        }
    }
}
