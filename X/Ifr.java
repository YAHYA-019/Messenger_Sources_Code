package X;

import android.os.RemoteException;
import com.facebook.mqtt.service.ipc.IMqttXplatService;
import com.facebook.push.mqtt.service.xplat.MqttXplatPushServiceClientImpl$3;
import com.facebook.rsys.transport.gen.SendMessageAttemptStats;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rsys.transport.gen.StatusUpdate;

/* loaded from: Ifr.class */
public final class Ifr implements JMT {
    public 5V5 A00;
    public final C00i A01 = 1Bq.A00(16919);
    public final 1Br A02 = 1Bq.A00(66430);
    public final boolean A03;

    public Ifr(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    private final boolean A00(InterfaceC01073pn interfaceC01073pn, byte[] bArr) {
        C00i c00i = this.A02.A00;
        1hD r0 = (1hD) c00i.get();
        1hD.A01(r0, new C2y1("mqtt_send_mws", r0, 3));
        Object obj = 0;
        boolean z = false;
        try {
            byte[] A00 = AbK.A0s().A00(new 4Z3(""));
            11T.A0A(A00);
            obj = ((2At) this.A01.get()).A00(interfaceC01073pn, 0S2.A01, "/t_rtc_multi", C1A9.A0K(A00, bArr));
            if (obj != -1) {
                z = true;
            }
            return z;
        } catch (2LA unused) {
            String obj2 = obj.toString();
            1hD r02 = (1hD) c00i.get();
            11T.A0F(obj2, 0);
            1hD.A01(r02, new AKY(obj2, r02, 12));
            return false;
        }
    }

    public boolean DAm(int i) {
        boolean z = true;
        if (!this.A03 && i != 1) {
            z = false;
        }
        return z;
    }

    public void onStatusUpdate(StatusUpdate statusUpdate) {
    }

    public boolean sendMultiwaySignalingMessage(String str, String str2, byte[] bArr) {
        return A00((str == null || str2 == null) ? null : new Ieo(this, str2, str), bArr);
    }

    public boolean sendMultiwaySignalingMessage(byte[] bArr, JDg jDg, int i) {
        boolean z = false;
        if (DAm(i)) {
            z = A00(new Ien(jDg), bArr);
        }
        return z;
    }

    public boolean sendMultiwaySignalingMessageExt(byte[] bArr, JDg jDg, JDh jDh, int i) {
        if (!DAm(i)) {
            return false;
        }
        SendMessageAttemptStats sendMessageAttemptStats = new SendMessageAttemptStats((short) 93, 0L, 0, 0, 4);
        SignalingTransportCallbackExt signalingTransportCallbackExt = ((IlI) jDh).A02;
        if (signalingTransportCallbackExt != null) {
            signalingTransportCallbackExt.sendAttemptCallbackExt(sendMessageAttemptStats);
        }
        HXn hXn = new HXn(jDh);
        C00i c00i = this.A02.A00;
        1hD r0 = (1hD) c00i.get();
        1hD.A01(r0, new C2y1("mqtt_send_mws_ext", r0, 3));
        Object obj = null;
        boolean z = false;
        try {
            byte[] A00 = AbK.A0s().A00(new 4Z3(""));
            11T.A0A(A00);
            byte[] A0K = C1A9.A0K(A00, bArr);
            obj = null;
            try {
                2Ay CVT = ((2At) this.A01.get()).A01.CVT();
                try {
                    0fH.A0g("/t_rtc_multi", 1BJ.A00(296), "PublishExt to topic %s");
                    IMqttXplatService iMqttXplatService = CVT.A00;
                    int i2 = -1;
                    if (iMqttXplatService != null) {
                        try {
                            i2 = iMqttXplatService.CZq(new MqttXplatPushServiceClientImpl$3(CVT, hXn), "/t_rtc_multi", A0K, 1);
                        } catch (RuntimeException e) {
                            2Ay.A02(e);
                        }
                    }
                    CVT.A07();
                    if (i2 != -1) {
                        z = true;
                    }
                    return z;
                } catch (Throwable th) {
                    CVT.A07();
                    throw th;
                }
            } catch (RemoteException e2) {
                0fH.A11(1BJ.A00(810), "%s failed", e2, new Object[]{0Pz.A1C("publishExt. supportsExtCallbacks ", false)});
                return false;
            }
        } catch (2LA unused) {
            String obj2 = obj.toString();
            1hD r02 = (1hD) c00i.get();
            11T.A0F(obj2, 0);
            1hD.A01(r02, new AKY(obj2, r02, 12));
            return false;
        }
    }

    public void setWebrtcInteractor(5V5 r302) {
        this.A00 = r302;
    }

    public void triggerEarlyConnection(boolean z) {
    }
}
