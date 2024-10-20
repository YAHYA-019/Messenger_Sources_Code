package com.facebook.rsys.litecamera;

import X.0fH;
import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C15h;
import X.C2420Gch;
import X.C2422Gcj;
import X.GuJ;
import X.GwV;
import X.Heh;
import X.Hhy;
import X.I3T;
import X.I5d;
import X.I8V;
import X.IO6;
import X.IRM;
import X.Ida;
import X.J5D;
import X.J5t;
import X.J6c;
import X.JKr;
import X.JPw;
import X.JPx;
import X.S9w;
import X.S9x;
import X.SCh;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.legacy.SurfaceTextureHelper;

/* loaded from: LiteCameraProxy.class */
public class LiteCameraProxy extends GwV {
    public int A00;
    public CameraApi A03;
    public C15h A05;
    public I8V A06;
    public final C15h A0D;
    public volatile boolean A0E;
    public String A04 = Camera.FRONT_FACING_CAMERA.identifier;
    public int A02 = 384;
    public int A01 = HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT;
    public final List A0C = AnonymousClass001.A0s();
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A0A = true;
    public boolean A08 = true;
    public final I3T A0B = new I3T(new IRM(this));

    public LiteCameraProxy(C15h c15h) {
        this.A00 = -1;
        this.A0D = c15h;
        J5t j5t = new J5t(this);
        this.A05 = j5t;
        IO6 io6 = new IO6(this);
        Ida ida = ((Heh) j5t.get()).A00;
        ida.A07(io6);
        ida.A0A(true);
        ida.A0B(true);
        this.A0C.add(io6);
        this.A00 = 0;
    }

    public ArrayList createAvailableCameras() {
        ArrayList A0t = AnonymousClass001.A0t(2);
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        if (numberOfCameras > 0) {
            A0t.add(Camera.FRONT_FACING_CAMERA);
            if (numberOfCameras > 1) {
                A0t.add(Camera.BACK_FACING_CAMERA);
            }
        }
        return A0t;
    }

    public void release() {
        if (this.A0E) {
            return;
        }
        0fH.A0j("LiteCameraProxy", "release");
        GwV.A00(this).destroy();
        this.A0E = true;
        this.A05 = new J5t(this);
    }

    public void setApi(CameraApi cameraApi) {
        cameraApi.getClass();
        this.A03 = cameraApi;
    }

    public void setCamera(Camera camera) {
        if (camera == null || camera.identifier.equals(this.A04)) {
            return;
        }
        0fH.A0g(camera.name, "LiteCameraProxy", "setCamera: %s");
        Ida.A00(GwV.A00(this)).D3r();
        this.A04 = camera.identifier;
    }

    public void setCameraMode(int i) {
    }

    public void setCameraOn(boolean z, int i) {
        0fH.A0g(Boolean.valueOf(z), "LiteCameraProxy", "setCameraOn: %b");
        if (!z) {
            GwV.A00(this).pause();
            Ida A00 = GwV.A00(this);
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                A00.A08((JKr) it.next());
            }
            I8V i8v = this.A06;
            if (i8v != null) {
                Logging.d(SurfaceTextureHelper.TAG, "stopListening()");
                Handler handler = i8v.A08;
                handler.removeCallbacks(i8v.A09);
                ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) new S9x(i8v));
                ((Heh) this.A05.get()).A01.Cet(this.A06.A07);
                I8V i8v2 = this.A06;
                Logging.d(SurfaceTextureHelper.TAG, "dispose()");
                ThreadUtils.invokeAtFrontUninterruptibly(i8v2.A08, (Runnable) new S9w(i8v2));
                this.A06 = null;
            } else {
                Ida.A00(GwV.A00(this));
            }
            CameraApi cameraApi = this.A03;
            if (cameraApi != null) {
                cameraApi.setCameraState(0);
                return;
            }
            return;
        }
        Ida A002 = GwV.A00(this);
        C2420Gch A01 = Ida.A01(A002);
        if (!A01.A0V && A01.A0U) {
            0fH.A0n("LiteCameraProxy", "enableCamera called with an already enabled camera");
            return;
        }
        CameraApi cameraApi2 = this.A03;
        if (cameraApi2 != null) {
            cameraApi2.setCameraState(1);
        }
        Ida A003 = GwV.A00(this);
        Iterator it2 = this.A0C.iterator();
        while (it2.hasNext()) {
            A003.A07((JKr) it2.next());
        }
        A002.A03(this.A00 != -1 ? 0 : this.A04.equals(Camera.FRONT_FACING_CAMERA.identifier) ? 1 : 0);
        A002.resume();
        Ida.A00(GwV.A00(this));
        if (this.A06 == null) {
            Hhy hhy = new Hhy();
            Handler handler2 = new Handler(AnonymousClass002.A09("rsys_litecamera_capture"));
            I8V i8v3 = (I8V) ThreadUtils.invokeAtFrontUninterruptibly(handler2, (Callable) new J5D(handler2, hhy, (Object) null, "rsys_litecamera_capture", 1));
            this.A06 = i8v3;
            i8v3.A02(this.A02, this.A01);
            I8V i8v4 = this.A06;
            J6c j6c = new J6c(this);
            if (i8v4.A03 != null || i8v4.A04 != null) {
                throw AnonymousClass001.A0N("SurfaceTextureHelper listener has already been set.");
            }
            i8v4.A04 = j6c;
            i8v4.A08.post(i8v4.A09);
            I8V i8v5 = this.A06;
            i8v5.A08.post(new SCh(i8v5, 0));
            ((Heh) this.A05.get()).A01.A6x(this.A06.A07, true);
            JPx jPx = ((Heh) this.A05.get()).A01;
            SurfaceTexture surfaceTexture = this.A06.A07;
            boolean z2 = !this.A07;
            11T.A0F(surfaceTexture, 0);
            I5d i5d = (I5d) ((C2422Gcj) jPx).A04.get(surfaceTexture);
            if (i5d != null) {
                i5d.A0F = z2;
            }
        }
    }

    public void setTargetCaptureResolution(int i, int i2) {
        0fH.A0d(Integer.valueOf(i), Integer.valueOf(i2), "LiteCameraProxy", "setTargetCaptureResolution w:%d h:%d");
        this.A0B.A01(Math.max(i, i2));
    }

    public int setTargetCaptureSettings(int i, int i2, int i3) {
        return 0;
    }

    public void setTargetFps(int i) {
        0fH.A0g(Integer.valueOf(i), "LiteCameraProxy", "setTargetFps: %d");
        if (this.A0A) {
            Ida A00 = GwV.A00(this);
            GuJ guJ = JPw.A00;
            if (A00.BRD(guJ)) {
                ((JPw) GwV.A00(this).AdC(guJ)).CvB(i);
            }
        }
    }
}
