package X;

import com.facebook.common.time.RealtimeSinceBootClock;

/* loaded from: Ff7.class */
public final class Ff7 implements 5CK {
    public final C0dr A00;
    public final /* synthetic */ FyG A01;
    public final /* synthetic */ DLQ A02;
    public final /* synthetic */ GJj A03;

    public Ff7(FyG fyG, DLQ dlq, GJj gJj) {
        this.A02 = dlq;
        this.A01 = fyG;
        this.A03 = gJj;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        11T.A0A(realtimeSinceBootClock);
        this.A00 = realtimeSinceBootClock;
    }

    public void C1P(5CQ r302, Integer num) {
        int i;
        String str;
        boolean A1W = 1BL.A1W(r302, num);
        int[] iArr = EZY.A00;
        int intValue = num.intValue();
        if (intValue == A1W) {
            i = 189;
        } else {
            if (intValue == 4) {
                str = "ImageFailed";
                DLQ dlq = this.A02;
                FyG fyG = this.A01;
                GJj gJj = this.A03;
                long now = this.A00.now();
                java.util.Map A1D = 1BK.A1D(str, r302);
                DKM A02 = DKM.A02(str);
                A02.A0I(Long.valueOf(now));
                A02.A0J(A1D, 2);
                DKM.A0D(dlq, fyG, A02, gJj);
            }
            if (intValue != 3) {
                return;
            } else {
                i = 188;
            }
        }
        str = 7zK.A00(i);
        DLQ dlq2 = this.A02;
        FyG fyG2 = this.A01;
        GJj gJj2 = this.A03;
        long now2 = this.A00.now();
        java.util.Map A1D2 = 1BK.A1D(str, r302);
        DKM A022 = DKM.A02(str);
        A022.A0I(Long.valueOf(now2));
        A022.A0J(A1D2, 2);
        DKM.A0D(dlq2, fyG2, A022, gJj2);
    }

    public void C1S(5CQ r302, Integer num) {
        Object obj;
        boolean A1W = 1BL.A1W(r302, num);
        int[] iArr = EZY.A00;
        int intValue = num.intValue();
        if (intValue == A1W) {
            obj = "ViewAppeared";
        } else if (intValue != 2) {
            return;
        } else {
            obj = "ViewDisappeared";
        }
        DLQ dlq = this.A02;
        FyG fyG = this.A01;
        GJj gJj = this.A03;
        long now = this.A00.now();
        java.util.Map A1D = 1BK.A1D(obj, r302);
        DKM A02 = DKM.A02(obj);
        A02.A0I(Long.valueOf(now));
        A02.A0J(A1D, 2);
        DKM.A0D(dlq, fyG, A02, gJj);
    }
}
