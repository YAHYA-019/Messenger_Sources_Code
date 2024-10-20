package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: Fyl.class */
public final class Fyl implements Aaq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01f3, code lost:
    
        if (r303 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        if (r303 != false) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.Aaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Chy(X.C97i r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fyl.Chy(X.97i, boolean):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    @Override // X.Aaq
    public int Chz(Integer num) {
        int i = 48;
        switch (DKE.A0D(num)) {
            case 0:
            case 18:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return 36;
            case 1:
            case 10:
            case 19:
            case 20:
                return 44;
            case 2:
            case 3:
            case 4:
            case 12:
            case 13:
            case 23:
            case 29:
            case 32:
            case 37:
            case 38:
            default:
                i = 8;
                return i;
            case 5:
            case 22:
            case 34:
            case 35:
            case 40:
                return 16;
            case 6:
                return 20;
            case 7:
            case 8:
            case 21:
            case 24:
            case 25:
            case 26:
            case 36:
                return 0;
            case 9:
                return 28;
            case 11:
            case 14:
            case 30:
            case 31:
                return 12;
            case 15:
                return 22;
            case 16:
                return 32;
            case 17:
            case 41:
                return i;
            case 27:
                return 4;
            case 28:
                return 3;
            case 33:
                return 64;
            case 39:
                return 24;
            case 42:
                return 345;
            case 43:
                return 18;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return 34;
        }
    }

    @Override // X.Aaq
    public boolean Ci0(Integer num) {
        11T.A0F(num, 0);
        boolean z = true;
        if (num.intValue() != 0) {
            z = false;
        }
        return z;
    }

    @Override // X.Aaq
    public float Ci5(C95x c95x, boolean z) {
        int A05 = DKC.A05(c95x, 0);
        float f = 0.1f;
        if (A05 == 0) {
            f = 0.03f;
            if (!z) {
                return 0.05f;
            }
        } else if (A05 != 1) {
            if (A05 != 2) {
                throw 1BK.A1F();
            }
            f = 1.0f;
        }
        return f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0021. Please report as an issue. */
    @Override // X.Aaq
    public 2KP CiA(Integer num) {
        ER9 er9;
        float f;
        Integer num2;
        float f2;
        FdD fdD;
        ER9 er92;
        Integer num3;
        FdD fdD2;
        float f3;
        float f4;
        float f5 = 1.1f;
        switch (num.intValue()) {
            case 0:
                return new 2KP(new FdD(1.1f), 0S2.A00, ER9.A07, 13.0f, -0.04f);
            case 1:
                er9 = ER9.A07;
                f = 12.0f;
                num2 = 0S2.A00;
                f2 = -0.04f;
                fdD = new FdD(f5);
                return new 2KP(fdD, num2, er9, f, f2);
            case 2:
                er92 = ER9.A07;
                num3 = 0S2.A00;
                fdD2 = new FdD(1.23f);
                f3 = 13.0f;
                f4 = 0.0f;
                return new 2KP(fdD2, num3, er92, f3, f4);
            case 3:
                er9 = ER9.A09;
                f = 12.0f;
                num2 = 0S2.A00;
                f2 = 0.0f;
                fdD = new FdD(1.33f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 4:
                er9 = ER9.A09;
                f = 12.0f;
                num2 = 0S2.A01;
                f2 = 0.0f;
                fdD = new FdD(1.33f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 5:
            case 21:
                er9 = ER9.A09;
                f = 14.0f;
                num2 = 0S2.A00;
                f2 = -0.15f;
                f5 = 1.28f;
                fdD = new FdD(f5);
                return new 2KP(fdD, num2, er9, f, f2);
            case 6:
            case 20:
                er9 = ER9.A07;
                f = 15.0f;
                num2 = 0S2.A00;
                f2 = -0.02f;
                fdD = new FdD(1.04f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 7:
            case 27:
                er9 = ER9.A09;
                f = 12.0f;
                num2 = 0S2.A0C;
                f2 = 0.0f;
                fdD = new FdD(1.33f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 8:
            case 29:
            case 30:
                er9 = ER9.A07;
                f = 15.0f;
                num2 = 0S2.A0N;
                f2 = -0.02f;
                fdD = new FdD(1.04f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 9:
                er92 = ER9.A09;
                num3 = 0S2.A00;
                fdD2 = new FdD(1.38f);
                f3 = 13.0f;
                f4 = -0.08f;
                return new 2KP(fdD2, num3, er92, f3, f4);
            case 10:
                er9 = ER9.A09;
                f = 13.0f;
                num2 = 0S2.A0C;
                f2 = -0.08f;
                fdD = new FdD(1.38f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 11:
                er9 = ER9.A07;
                f = 14.0f;
                num2 = 0S2.A00;
                f2 = -0.01f;
                f5 = 1.0f;
                fdD = new FdD(f5);
                return new 2KP(fdD, num2, er9, f, f2);
            case 12:
                er9 = ER9.A07;
                f = 13.0f;
                num2 = 0S2.A00;
                f2 = -0.08f;
                fdD = new FdD(1.23f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 13:
                er9 = ER9.A05;
                f = 24.0f;
                num2 = 0S2.A00;
                f2 = 0.12f;
                f5 = 0.96f;
                fdD = new FdD(f5);
                return new 2KP(fdD, num2, er9, f, f2);
            case 14:
                er9 = ER9.A05;
                f = 17.0f;
                num2 = 0S2.A00;
                f2 = 0.06f;
                fdD = new FdD(1.001f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 15:
            case 31:
                er9 = ER9.A05;
                f = 17.0f;
                num2 = 0S2.A0N;
                f2 = 0.06f;
                fdD = new FdD(1.001f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 16:
                er9 = ER9.A07;
                f = 17.0f;
                num2 = 0S2.A00;
                f2 = -0.41f;
                fdD = new FdD(1.17f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 17:
                er9 = ER9.A07;
                f = 15.0f;
                num2 = 0S2.A0N;
                f2 = -0.24f;
                fdD = new FdD(1.33f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 18:
            case 28:
                er9 = ER9.A07;
                f = 15.0f;
                num2 = 0S2.A00;
                f2 = 0.06f;
                fdD = new FdD(1.001f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 19:
                er9 = ER9.A05;
                f = 15.0f;
                num2 = 0S2.A0C;
                f2 = 0.06f;
                fdD = new FdD(1.001f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 22:
            case 25:
                er9 = ER9.A09;
                f = 14.0f;
                num2 = 0S2.A0C;
                f2 = 0.0f;
                f5 = 1.29f;
                fdD = new FdD(f5);
                return new 2KP(fdD, num2, er9, f, f2);
            case 23:
                er9 = ER9.A09;
                f = 17.0f;
                num2 = 0S2.A0C;
                f2 = 0.0f;
                fdD = new FdD(1.17f);
                return new 2KP(fdD, num2, er9, f, f2);
            case 24:
                er9 = ER9.A09;
                f = 16.0f;
                num2 = 0S2.A00;
                f2 = 0.0f;
                f5 = 1.25f;
                fdD = new FdD(f5);
                return new 2KP(fdD, num2, er9, f, f2);
            case 26:
                er9 = ER9.A09;
                f = 22.0f;
                num2 = 0S2.A0N;
                f2 = 0.0f;
                f5 = 1.27f;
                fdD = new FdD(f5);
                return new 2KP(fdD, num2, er9, f, f2);
            case 32:
                er9 = ER9.A09;
                f = 15.0f;
                num2 = 0S2.A0N;
                f2 = -0.24f;
                fdD = new FdD(1.33f);
                return new 2KP(fdD, num2, er9, f, f2);
            default:
                throw 1BK.A1F();
        }
    }
}
