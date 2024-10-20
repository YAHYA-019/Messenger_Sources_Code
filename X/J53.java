package X;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import java.io.FileDescriptor;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* loaded from: J53.class */
public final /* synthetic */ class J53 implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IeR A01;
    public final /* synthetic */ FileDescriptor A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ J53(IeR ieR, FileDescriptor fileDescriptor, String str, long j) {
        this.A01 = ieR;
        this.A03 = str;
        this.A02 = fileDescriptor;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        IeR ieR = this.A01;
        String str = this.A03;
        FileDescriptor fileDescriptor = this.A02;
        long j = this.A00;
        0Z9.A01("Camera1Device.startVideoRecording.startVideoTask.call", 584873335);
        HashSet hashSet = N1z.A01;
        if (!L64.A02(hashSet)) {
            ieR.A0I.A02();
        }
        Htk htk = ieR.A0N;
        I82 A02 = htk.A02(ieR.A00);
        ieR.A0B = GOq.A1W(I82.A0W, A02);
        HX7 hx7 = I82.A0B;
        ieR.A02 = GOq.A0D(hx7, A02);
        I82 A022 = htk.A02(ieR.A00);
        boolean A023 = L64.A02(hashSet);
        JOV jov = ieR.A06;
        jov.getClass();
        int A03 = AnonymousClass001.A03(jov.AUY(JOV.A01));
        if (A03 == -1 || !CamcorderProfile.hasProfile(ieR.A00, A03)) {
            A03 = 1;
        }
        IDR idr = ieR.A0H;
        CamcorderProfile camcorderProfile = CamcorderProfile.get(IDR.A00(idr, ieR.A00), A03);
        IBB ibb = (IBB) A022.A05(I82.A0y);
        if (ibb == null) {
            ibb = (IBB) A022.A05(I82.A0q);
        }
        ibb.getClass();
        int i2 = ibb.A02;
        int i3 = ibb.A01;
        if (!A023 || A03 == 1) {
            camcorderProfile.videoCodec = 2;
            camcorderProfile.videoFrameWidth = i2;
            camcorderProfile.videoFrameHeight = i3;
            camcorderProfile.videoFrameRate = GOq.A0D(I82.A0w, A022);
            Object AUY = ieR.A06.AUY(JOV.A0W);
            if (AUY.equals(HBx.A02)) {
                i = 5000000;
            } else if (AUY.equals(HBx.A04)) {
                i = 3000000;
            } else if (AUY.equals(HBx.A03)) {
                i = 1000000;
            }
            camcorderProfile.videoBitRate = i;
        }
        int A05 = idr.A05(ieR.A00, ieR.A0Y);
        if (Integer.valueOf(A05) == null) {
            A05 = idr.A05(ieR.A00, ieR.A0Y);
        }
        int i4 = ieR.A00;
        boolean A1W = GOq.A1W(I82.A0N, A02);
        JNZ jnz = ieR.A0b;
        jnz.getClass();
        JKN BJa = jnz.BJa();
        ieR.A09 = BJa;
        if (BJa == null) {
            if (L64.A02(hashSet)) {
                ieR.A0I.A02();
            }
            Gun A00 = htk.A00(i4);
            boolean z = !GOq.A1W(I82.A0T, A02);
            if (GOp.A1Y(I1R.A0a, A00.A00)) {
                int i5 = 0;
                if (z) {
                    i5 = 3;
                }
                IA2.A03(hx7, A00, i5);
            }
            IA2.A03(I82.A0x, A00, A05);
            A00.A02();
            JKL jkl = ieR.A05;
            if (jkl == null) {
                jkl = new Idr(ieR);
                ieR.A05 = jkl;
            }
            BJa = new Ief(jkl, A1W);
            ieR.A09 = BJa;
        }
        try {
            if (str != null) {
                ieR.A08 = BJa.D2P(camcorderProfile, null, str, null, i4, A05, true, A1W, false);
            } else {
                fileDescriptor.getClass();
                ieR.A08 = BJa.D2O(camcorderProfile, null, fileDescriptor, null, i4, A05, true, A1W, false);
            }
            Camera camera = ieR.A0Z;
            camera.getClass();
            camera.lock();
            ieR.A08.A02(I50.A0V, Long.valueOf(j));
            0Z9.A00(1513551561);
            return ieR.A08;
        } catch (Throwable th) {
            Camera camera2 = ieR.A0Z;
            camera2.getClass();
            camera2.lock();
            throw th;
        }
    }
}
