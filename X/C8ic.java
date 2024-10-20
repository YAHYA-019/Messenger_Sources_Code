package X;

import com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data.AvatarAudioMessagePose;

/* renamed from: X.8ic, reason: invalid class name */
/* loaded from: 8ic.class */
public final class C8ic extends 2Kb {
    public final float A00;
    public final AvatarAudioMessagePose A01;
    public final 70P A02;
    public final float A03;
    public final float A04;

    public C8ic(AvatarAudioMessagePose avatarAudioMessagePose, 70P r303, float f, float f2, float f3) {
        11T.A0F(r303, 1);
        this.A02 = r303;
        this.A03 = f;
        this.A04 = f2;
        this.A00 = f3;
        this.A01 = avatarAudioMessagePose;
    }

    public C2lt A0s(2lX r302) {
        Object A00 = 2rO.A00(r302, SH9.A00, 7zL.A1Z(r302));
        Object A002 = 2rO.A00(r302, SHB.A00, new Object[0]);
        Object A003 = 2rO.A00(r302, SHA.A00, new Object[0]);
        FrT frT = FrT.A00;
        C2ll A0r = 7zQ.A0r(r302, 7zQ.A0s(Rw8.A00, false), new ARN(20, this, A002, A00, A003));
        2lQ r0 = 2lO.A02;
        2dP r02 = 2dP.A01;
        Integer num = 0S2.A0Y;
        2lO A0X = 7zT.A0X(4YV.A0L((2lO) null, num, r02, 0), new 2lV(num, ((int) this.A04) | 9221401712017801216L), ((int) this.A03) | 9221401712017801216L);
        long j = ((int) this.A00) | 9221401712017801216L;
        Integer num2 = 0S2.A00;
        return new C2lt(4YV.A0L(7zT.A0i(A0X, num2, j), num2, C1ro.CENTER, 0), frT, A0r);
    }
}
