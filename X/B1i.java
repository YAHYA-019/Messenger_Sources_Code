package X;

/* loaded from: B1i.class */
public final class B1i extends 2Yv {
    public RNi A00;
    public boolean A01;

    /* JADX WARN: Type inference failed for: r307v2, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r307v4, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r309v0, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r309v3, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r309v4, types: [java.lang.Object, X.66W] */
    public void A02(C2l4 c2l4) {
        RZ1 rz1;
        66W r309;
        66W r3092;
        Boolean A0K;
        66W r307;
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            ?? obj = new Object();
            RNi rNi = this.A00;
            ((66W) obj).A00 = rNi;
            long A05 = AnonymousClass001.A05(objArr[0]);
            r309 = obj;
            if (rNi != null) {
                rz1 = new RZ1(rNi);
                rz1.A00 = A05;
                r3092 = obj;
                r3092.A00 = new RNi(rz1);
                r309 = r3092;
            }
            this.A00 = (RNi) r309.A00;
            return;
        }
        if (i == 1) {
            ?? obj2 = new Object();
            RNi rNi2 = this.A00;
            ((66W) obj2).A00 = rNi2;
            String str = (String) objArr[0];
            r309 = obj2;
            if (rNi2 != null) {
                rz1 = new RZ1(rNi2);
                rz1.A04 = str;
                r3092 = obj2;
                r3092.A00 = new RNi(rz1);
                r309 = r3092;
            }
            this.A00 = (RNi) r309.A00;
            return;
        }
        if (i == 2) {
            ?? obj3 = new Object();
            RNi rNi3 = this.A00;
            ((66W) obj3).A00 = rNi3;
            String str2 = (String) objArr[0];
            r309 = obj3;
            if (rNi3 != null) {
                rz1 = new RZ1(rNi3);
                rz1.A02 = str2;
                r3092 = obj3;
                r3092.A00 = new RNi(rz1);
                r309 = r3092;
            }
            this.A00 = (RNi) r309.A00;
            return;
        }
        if (i == 3) {
            ?? obj4 = new Object();
            ((66W) obj4).A00 = Boolean.valueOf(this.A01);
            A0K = AnonymousClass001.A0K();
            r307 = obj4;
        } else {
            if (i != 4) {
                return;
            }
            ?? obj5 = new Object();
            ((66W) obj5).A00 = Boolean.valueOf(this.A01);
            A0K = false;
            r307 = obj5;
        }
        r307.A00 = A0K;
        this.A01 = A0K.booleanValue();
    }
}
