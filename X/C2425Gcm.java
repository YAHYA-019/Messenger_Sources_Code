package X;

import android.os.Handler;

/* renamed from: X.Gcm, reason: case insensitive filesystem */
/* loaded from: Gcm.class */
public final class C2425Gcm extends Ic7 implements JPr {
    public final HZk A00;

    public C2425Gcm(HZk hZk, JOW jow) {
        super.A00 = jow;
        this.A00 = hZk;
    }

    @Override // X.JPr
    public JLF AIp(Handler handler, JMQ jmq, Integer num) {
        11T.A0F(num, 0);
        11T.A0G(jmq, 1, handler);
        JQC A07 = Ic7.A07(this, JPs.A00);
        11T.A0I(A07, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.videocapture.internal.VideoCaptureControllerImpl");
        Gti gti = (Gti) A07;
        JQ8 jq8 = (JQ8) Ic7.A08(this, JQ8.A00);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                throw 0Pz.A05("RecordingController type not supported: ", 1 - intValue != 0 ? "NORMAL" : "BOOMERANG");
            }
            JOW jow = super.A00;
            jow.getClass();
            return new IdD(jow.getContext(), handler, gti.A0B, this.A00, jq8, jmq);
        }
        JQC A072 = Ic7.A07(this, JPy.A01);
        11T.A0A(A072);
        JEO jeo = ((C2415Gcc) ((JPy) A072)).A03.A07;
        11T.A0A(jeo);
        IEE iee = ((Gtk) ((JPh) Ic7.A07(this, JPh.A00))).A02;
        JHp jHp = gti.A0A;
        if (iee != null) {
            11T.A0A(jHp);
            return HH0.A00(handler, iee.A05(jeo), jHp, jq8, jmq);
        }
        11T.A0A(jHp);
        return HGz.A00(handler, jHp, jeo, jq8, jmq);
    }
}
