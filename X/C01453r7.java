package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.service.model.UpdateFolderCountsParams;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: X.3r7, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3r7.class */
public final class C01453r7 implements InterfaceC01343qr, CallerContextable {
    public static final String __redex_internal_original_name = "OrcaMqttPushHandler";
    public final 1Ex A01 = (1Ex) 1Bi.A03(83426);
    public final C00i A00 = new 1BV(33031);
    public final C00i A02 = new 1BQ(66351);

    @Override // X.InterfaceC01343qr
    public String getHandlerName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC01343qr
    public void onMessage(String str, byte[] bArr, int i, long j, Long l) {
        try {
            if (!this.A01.BTw()) {
                0fH.A07(C01453r7.class, str, "Not logged in: throwing out Mqtt message. %s ");
                return;
            }
            if (!"/t_inbox".equals(str)) {
                return;
            }
            0fH.A08(C01453r7.class, str, "onMessage, topic name: %s");
            29S r0 = new 29S();
            29X r02 = 29W.A02;
            2An B5O = r0.B5O(new 29W(new ByteArrayInputStream(bArr, 0, bArr.length)));
            try {
                4Z3.A00(B5O);
                B5O.A0K();
                Integer num = null;
                Integer num2 = null;
                while (true) {
                    C29Q A0E = B5O.A0E();
                    byte b = A0E.A00;
                    if (b == 0) {
                        B5O.A0M();
                        FbUserSession A04 = ((1Fv) this.A02.get()).A04();
                        int intValue = num.intValue();
                        int intValue2 = num2.intValue();
                        3VF r03 = (3VF) 1Lo.A06(A04, 68482);
                        synchronized (r03) {
                            try {
                                4UE r04 = r03.A01;
                                r04.A00 = intValue2;
                                r04.A01 = intValue;
                                r04.A02 = System.currentTimeMillis();
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                throw th2;
                            }
                        }
                        if (AnonymousClass001.A1V(1Bn.A0A(67667))) {
                            Bundle A05 = 1BK.A05();
                            A05.putParcelable(AbE.A00(768), new UpdateFolderCountsParams(1F9.A0I, intValue2, intValue));
                            1Ho newInstance_DEPRECATED = ((BlueServiceOperationFactory) this.A00.get()).newInstance_DEPRECATED(1BJ.A00(579), A05, 0, CallerContext.A06(C01453r7.class));
                            newInstance_DEPRECATED.A0A = true;
                            1Ho.A00(newInstance_DEPRECATED, true);
                            return;
                        }
                        return;
                    }
                    switch (A0E.A03) {
                        case 1:
                            if (b != 8) {
                                break;
                            } else {
                                num2 = Integer.valueOf(B5O.A0C());
                                break;
                            }
                        case 2:
                            if (b != 8) {
                                break;
                            } else {
                                num = Integer.valueOf(B5O.A0C());
                                break;
                            }
                        case 3:
                        case 5:
                            if (b != 10) {
                                break;
                            } else {
                                B5O.A0D();
                                break;
                            }
                        case 4:
                        case 6:
                            if (b != 8) {
                                break;
                            } else {
                                B5O.A0C();
                                break;
                            }
                    }
                    C3P2.A00(B5O, b);
                }
            } catch (2LA e) {
                new IOException((Throwable) e);
            }
        } catch (IOException e2) {
            0fH.A0I(C01453r7.class, "IOException", e2);
        }
    }
}
