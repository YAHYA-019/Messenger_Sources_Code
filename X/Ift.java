package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Ift.class */
public final class Ift implements JGU {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final FbUserSession A03;
    public final 1De A04;

    public Ift(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A03 = fbUserSession;
        1BY r0 = r303.A00;
        this.A00 = 1Lm.A03(fbUserSession, r0, 83902);
        this.A01 = 1BK.A0C();
        this.A02 = 1Bu.A03(r0, 115578);
    }

    public void Bfc(byte[] bArr) {
        11T.A0F(bArr, 0);
        if (!1Br.A07(this.A01).AZk(36313428796709451L)) {
            return;
        }
        1Br.A0C(this.A02);
        2An A00 = BXt.A00(new 29S(), bArr);
        A00.A0K();
        Integer num = null;
        while (true) {
            C29Q A0E = A00.A0E();
            byte b = A0E.A00;
            if (b == 0) {
                A00.A0M();
                IZI A0h = GOp.A0h(this.A00);
                String str = HBK.A0L.topicName;
                String valueOf = String.valueOf(num);
                IZI izi = A0h;
                1BK.A1M(str, valueOf);
                AbN.A0X(izi).A01(izi.A01, new Ifd(str, valueOf), "STATE_SYNC_MESSAGE_RECEIVED");
                return;
            }
            if (A0E.A03 == 1 && b == 8) {
                num = Integer.valueOf(A00.A0C());
            } else {
                C3P2.A00(A00, b);
            }
        }
    }
}
