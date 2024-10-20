package X;

import android.hardware.Camera;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.concurrent.Callable;

/* loaded from: J55.class */
public final class J55 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public J55(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = z;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        int i;
        if (2 - this.A00 == 0) {
            IEg iEg = (IEg) this.A01;
            int i2 = iEg.A01;
            HCB hcb = iEg.A05;
            if (hcb == null || i2 == -1) {
                i = 0;
            } else {
                int i3 = ((i2 + 45) / 90) * 90;
                HCB hcb2 = HCB.A03;
                HCB.A00(hcb);
                Camera.CameraInfo cameraInfo = hcb.mCameraInfo;
                if (cameraInfo == null) {
                    cameraInfo = HCB.A00;
                }
                int i4 = cameraInfo.orientation;
                int i5 = i4 + i3;
                if (hcb == hcb2) {
                    i5 = (i4 - i3) + HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
                }
                i = i5 % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
            }
            IEp iEp = iEg.A07;
            synchronized (iEp) {
                iEp.A00.setRotation(i);
                IEp.A03(iEp);
            }
            IEg.A04(iEg, false);
            ((RHv) this.A02).A00.BnR();
            iEg.A0K.takePicture(null, null, null, new IGt(this, 1));
            return null;
        }
        FFM ffm = (FFM) this.A02;
        1UN r0 = (1UN) this.A01;
        boolean z = this.A03;
        Class<?> cls = r0.getClass();
        C00j.A05(C1km.A00(cls), -740189414);
        int incrementAndGet = FFM.A08.incrementAndGet();
        C00i c00i = ffm.A04.A00;
        1BK.A0V(c00i).markerStart(9699343, incrementAndGet, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C1km.A00(cls));
        try {
            try {
                String name = cls.getName();
                11T.A0A(name);
                StringBuilder A0k = AnonymousClass001.A0k();
                RuntimeException runtimeException = null;
                int i6 = 0;
                do {
                    try {
                        r0.AFz();
                        if (A0k.length() != 0) {
                            1Br.A04(ffm.A01).D0v(0Pz.A0W("clearInternal-recovered-", name), AnonymousClass001.A0Z(A0k, "Hit exceptions before successfully clearing: ", AnonymousClass001.A0k()));
                        }
                        1BK.A0V(c00i).markerAnnotate(9699343, incrementAndGet, 1BJ.A00(453), z);
                        1BK.A0V(c00i).markerEnd(9699343, incrementAndGet, (short) 2);
                        C00j.A01(317712271);
                        return null;
                    } catch (RuntimeException e) {
                        1BK.A1R(A0k, e);
                        String stackTraceString = android.util.Log.getStackTraceString(e);
                        11T.A0A(stackTraceString);
                        A0k.append(stackTraceString);
                        if (runtimeException == null) {
                            runtimeException = e;
                        }
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException unused) {
                        }
                        i6++;
                    }
                } while (i6 <= 2);
                1Br.A04(ffm.A01).D11(0Pz.A0W("clearInternal-failed-", name), AnonymousClass001.A0Z(A0k, "All retries failed for clearing: ", AnonymousClass001.A0k()));
                throw runtimeException;
            } catch (RuntimeException e2) {
                1BK.A0V(c00i).markerEnd(9699343, incrementAndGet, (short) 3);
                throw e2;
            }
        } catch (Throwable th) {
            C00j.A01(434735874);
            throw th;
        }
    }
}
