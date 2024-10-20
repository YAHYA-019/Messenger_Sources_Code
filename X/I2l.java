package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.syncedclock.gen.ReceivedMessagesCache;
import com.facebook.rsys.syncedclock.gen.SyncedClockProxy;
import com.facebook.rsys.transport.gen.MetricIdentifiers;
import com.facebook.rsys.transport.gen.SignalingMessage;
import com.facebook.webrtc.lite.SignalMessageProcessingInfo;
import com.facebook.webrtc.lite.SignalingHandler;
import com.facebook.webrtc.signaling.WebrtcSignalingMessageInterface;

/* loaded from: I2l.class */
public final class I2l {
    public static final I2l $redex_init_class = null;
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02 = 1BK.A0C();
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final GyC A07;
    public final SignalingHandler A08;
    public final FbUserSession A09;
    public final 1De A0A;

    static {
        C0il.A0B("rtcsignalinglitejni");
    }

    public I2l(1De r302) {
        this.A0A = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 68219);
        this.A06 = 1Bq.A00(33032);
        this.A00 = 1Bq.A00(83603);
        this.A03 = 1Bu.A03(r0, 82768);
        this.A05 = 1Bu.A03(r0, 98752);
        1G1 A0D = AbK.A0D(r0);
        this.A09 = A0D;
        this.A04 = 1Bu.A03(r0, 115658);
        SyncedClockProxy syncedClockProxy = null;
        GyC gyC = new GyC((WebrtcSignalingMessageInterface) 1Bn.A0E((Context) null, r0, 83903));
        this.A07 = gyC;
        boolean AZk = 1Br.A07(this.A02).AZk(36316220525389651L);
        long parseLong = Long.parseLong(A0D.A02);
        1Br.A0B(this.A00);
        long parseLong2 = Long.parseLong("256002347743983");
        String A02 = ((1H2) 1Br.A0B(this.A06)).A02();
        ReceivedMessagesCache receivedMessagesCache = null;
        if (AZk) {
            syncedClockProxy = (SyncedClockProxy) 1Br.A0B(this.A05);
            receivedMessagesCache = (ReceivedMessagesCache) 1Br.A0B(this.A03);
        }
        SignalingHandler createSignalingHandler = SignalingHandler.CProxy.createSignalingHandler(parseLong, parseLong2, A02, gyC, syncedClockProxy, receivedMessagesCache);
        11T.A0A(createSignalingHandler);
        this.A08 = createSignalingHandler;
    }

    public final SignalMessageProcessingInfo A00(HAo hAo, Long l, byte[] bArr) {
        SignalMessageProcessingInfo signalMessageProcessingInfo;
        synchronized (this) {
            signalMessageProcessingInfo = null;
            if (AbL.A1H(this.A01)) {
                C00i c00i = this.A04.A00;
                ((I5r) c00i.get()).A08("siglite_process_msg_multiway", l);
                SignalMessageProcessingInfo processMessage = this.A08.processMessage(new SignalingMessage(HKe.A00(hAo), new MetricIdentifiers(null, null, null, null), bArr, null, null, false));
                ((I5r) c00i.get()).A07("siglite_process_msg_multiway", l);
                if (processMessage.status == 3) {
                    if (l != null) {
                        ((I5r) c00i.get()).A04(0S2.A09, l.longValue());
                    }
                    if (1Br.A06(this.A02).AZk(36316220525389651L)) {
                        4zI.A03.A08("RtcSignalingLiteWrapper", "Dropping incoming multiway message: invalid message", new Object[0]);
                    }
                }
                if (processMessage.status != 3) {
                    signalMessageProcessingInfo = processMessage;
                }
            }
        }
        return signalMessageProcessingInfo;
    }
}
