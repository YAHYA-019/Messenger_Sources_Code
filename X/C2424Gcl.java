package X;

import android.os.Handler;

/* renamed from: X.Gcl, reason: case insensitive filesystem */
/* loaded from: Gcl.class */
public final class C2424Gcl extends Ic7 implements JPr {
    @Override // X.JPr
    public JLF AIp(Handler handler, JMQ jmq, Integer num) {
        11T.A0F(num, 0);
        1BL.A1F(jmq, handler);
        int intValue = num.intValue();
        if (intValue != 0) {
            throw 0Pz.A05("RecordingController type not supported: ", 1 - intValue != 0 ? "NORMAL" : "BOOMERANG");
        }
        JQ8 jq8 = (JQ8) Ic7.A08(this, JQ8.A00);
        JQC A07 = Ic7.A07(this, JPy.A01);
        11T.A0A(A07);
        JEO jeo = ((C2415Gcc) ((JPy) A07)).A03.A07;
        11T.A0A(jeo);
        JQC A072 = Ic7.A07(this, JPs.A00);
        11T.A0I(A072, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.videocapture.internal.VideoCaptureControllerImpl");
        JHp jHp = ((Gti) A072).A0A;
        11T.A0A(jHp);
        return HGz.A00(handler, jHp, jeo, jq8, jmq);
    }
}
