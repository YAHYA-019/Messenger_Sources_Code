package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: Fy5.class */
public final class Fy5 implements GOe {
    public final ERD A00;
    public final F9j A01;
    public final EL7 A02;
    public final Integer A03;
    public final Integer A04;

    public Fy5(ERD erd, F9j f9j, EL7 el7, Integer num, Integer num2) {
        1BL.A1H(el7, num, num2);
        11T.A0F(erd, 5);
        this.A02 = el7;
        this.A03 = num;
        this.A04 = num2;
        this.A00 = erd;
        this.A01 = f9j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r313 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d7  */
    /* JADX WARN: Type inference failed for: r0v134, types: [X.94b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object Ci8(android.content.Context r302, X.C6tP r303) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fy5.Ci8(android.content.Context, X.6tP):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fy5)) {
                return false;
            }
            Fy5 fy5 = (Fy5) obj;
            if (this.A02 != fy5.A02 || this.A03 != fy5.A03 || this.A04 != fy5.A04 || this.A00 != fy5.A00 || !11T.A0O(this.A01, fy5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = 1BL.A03(this.A02);
        int intValue = this.A03.intValue();
        int A07 = 7zR.A07(1 != intValue ? "PRIMARY" : "SECONDARY", intValue, A03);
        int intValue2 = this.A04.intValue();
        return AnonymousClass002.A05(this.A00, 7zR.A07(1 != intValue2 ? "FLEXIBLE" : "CONSTRAINED", intValue2, A07) * 31) + 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsButtonVariant(buttonSize=");
        A0k.append(this.A02);
        A0k.append(7zK.A00(ActionId.VIEW_DID_LOAD_BEGIN));
        A0k.append(1 - this.A03.intValue() != 0 ? "PRIMARY" : "SECONDARY");
        A0k.append(7zK.A00(125));
        A0k.append(1 - this.A04.intValue() != 0 ? "FLEXIBLE" : "CONSTRAINED");
        DKG.A1X(A0k, ", startIconName=");
        A0k.append(7zK.A00(ActionId.APP_DID_ENTER_BACKGROUND));
        A0k.append(this.A00);
        A0k.append(", overrides=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
