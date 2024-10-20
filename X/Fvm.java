package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.caa.plugins.login.implementations.sessioninitialization.MSGBloksCaaHandleLoginResponseImplementation;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Fvm.class */
public final class Fvm implements 2fS {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fvm(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final ListenableFuture ADN() {
        Bundle A05;
        boolean z;
        BlueServiceOperationFactory A0L;
        CallerContext callerContext;
        switch (this.A00) {
            case 0:
                MSGBloksCaaHandleLoginResponseImplementation mSGBloksCaaHandleLoginResponseImplementation = (MSGBloksCaaHandleLoginResponseImplementation) this.A02;
                int A07 = ((FIM) 1Br.A0B(((C03983zh) 1Br.A0B(mSGBloksCaaHandleLoginResponseImplementation.A04)).A02)).A07(EPg.A0Z, true);
                if (A07 == 1 || A07 == 3) {
                    F8R f8r = (F8R) 1Br.A0B(mSGBloksCaaHandleLoginResponseImplementation.A0D);
                    CallerContext A0B = CallerContext.A0B("MSGBloksCaaHandleLoginResponseImplementation");
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = mSGBloksCaaHandleLoginResponseImplementation.A0H.iterator();
                    while (it.hasNext()) {
                        A0s.add(new Fi6((EmP) it.next()));
                    }
                    f8r.A01(A0B, A0s);
                } else {
                    ((FcZ) 7zO.A0p(this.A01)).A00();
                }
                return 1Kd.A0A(04S.A00);
            case 1:
                A05 = 1BK.A05();
                A05.putParcelable("mediaResource", (MediaResource) this.A02);
                z = true;
                A05.putBoolean("transcode", true);
                Imf imf = (Imf) this.A01;
                6Ro r0 = (6Ro) imf.A01;
                RequestPermissionsConfig requestPermissionsConfig = 6Ro.A06;
                A0L = 4YU.A0L(r0.A01);
                callerContext = (CallerContext) imf.A02;
                return 4YU.A0M(A05, callerContext, A0L, 1BJ.A00(238), z);
            default:
                A05 = 1BK.A05();
                A05.putParcelable("mediaResource", (MediaResource) this.A02);
                z = true;
                A05.putBoolean("transcode", true);
                A0L = 4YU.A0L(((IPX) this.A01).A01);
                callerContext = CallerContext.A06(IPX.class);
                return 4YU.A0M(A05, callerContext, A0L, 1BJ.A00(238), z);
        }
    }
}
