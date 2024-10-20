package X;

import java.util.concurrent.TimeUnit;

/* loaded from: A6u.class */
public final class A6u implements 7NL {
    public final C00i A00 = 1BQ.A00();

    public 2Jd A5J(2Jd r302) {
        C00i c00i = this.A00;
        int A00 = 2yD.A00(1BK.A0N(c00i), 36593885866297013L);
        r302.A09("cache_directive", 1BK.A0N(c00i).BCy(36875360843071972L));
        r302.A08(1BJ.A00(1085), Integer.valueOf(A00));
        return r302;
    }

    public C3sa Aak(2Jf r302) {
        long seconds = TimeUnit.HOURS.toSeconds(1BK.A0N(this.A00).Auy(36593885866165939L));
        C3sa A00 = C3sa.A00(r302);
        A00.A0A(seconds);
        A00.A09(seconds);
        return A00;
    }
}
