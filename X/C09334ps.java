package X;

import com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider;

/* renamed from: X.4ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ps.class */
public final class C09334ps implements 1Nq {
    public final C00i A01 = new 1BQ(16385);
    public final C00i A02 = new 1BQ(16650);
    public final C00i A00 = new 1BQ(49257);

    private Er1 A00(3oH r302) {
        return new Er1(((Eqk) r302.getState()).A01.A00);
    }

    public static Boolean A01(C09334ps c09334ps) {
        2yD r301;
        long j;
        C08554nH c08554nH = (C08554nH) c09334ps.A00.get();
        if (((1Ex) c08554nH.A00.get()).BTw()) {
            r301 = (2yD) c08554nH.A01.get();
            j = 2342159423012743116L;
        } else {
            r301 = (2yD) c08554nH.A02.get();
            j = 2324145028798228434L;
        }
        1GD A01 = 1GD.A01(new 1GD());
        A01.A04 = true;
        boolean z = false;
        if (r301.AZr(A01.A02(), j)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean A02(C09334ps c09334ps) {
        2yD r301;
        long j;
        C08554nH c08554nH = (C08554nH) c09334ps.A00.get();
        if (((1Ex) c08554nH.A00.get()).BTw()) {
            r301 = (2yD) c08554nH.A01.get();
            j = 36316413798983627L;
        } else {
            r301 = (2yD) c08554nH.A02.get();
            j = 18302019584468945L;
        }
        1GD A01 = 1GD.A01(new 1GD());
        A01.A04 = true;
        boolean z = false;
        if (r301.AZr(A01.A02(), j)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public int Adi() {
        return -1;
    }

    public void BqJ(int i) {
        Er1 A00;
        3oH r0 = ((ZeroSDKServiceProvider) this.A02.get()).A00;
        if (r0 != null) {
            if (i == 23582) {
                A00 = A00(r0);
                A00.A09 = ((2yD) this.A01.get()).AZr(1GD.A05, 2342157601946542148L);
            } else if (i == 23594) {
                A00 = A00(r0);
                A00.A0D = ((2yD) this.A01.get()).AZr(1GD.A05, 36314597027815493L);
            } else if (i == 23668) {
                A00 = A00(r0);
                A00.A0E = ((2yD) this.A01.get()).AZr(1GD.A05, 36314631387553873L);
            } else if (i == 5745) {
                A00 = A00(r0);
                C00i c00i = this.A01;
                2yD r02 = (2yD) c00i.get();
                1GD r03 = 1GD.A05;
                A00.A03 = r02.BDB(r03, 36874291396084029L);
                A00.A04 = ((2yD) c00i.get()).BDB(r03, 36874291396149566L);
                A00.A02 = ((2yD) c00i.get()).BDB(r03, 36874291396215103L);
                A00.A05 = ((2yD) c00i.get()).BDB(r03, 36874291396018492L);
            } else if (i == 29711) {
                A00 = A00(r0);
                A00.A08 = ((2yD) this.A01.get()).AZr(1GD.A05, 36314738761736341L);
            } else if (i == 29710) {
                A00 = A00(r0);
                A00.A0A = ((2yD) this.A01.get()).AZr(1GD.A05, 36314734466769044L);
            } else if (i == 36716) {
                A00 = A00(r0);
                A00.A07 = false;
            } else {
                if (i != 36464 && i != 36465) {
                    return;
                }
                A00 = A00(r0);
                A00.A0C = A02(this).booleanValue();
                A00.A0B = A01(this).booleanValue();
            }
            boolean z = A00.A09;
            boolean z2 = A00.A0D;
            boolean z3 = A00.A0F;
            boolean z4 = A00.A0E;
            r0.ANn(new EDe(new F6s(A00.A03, A00.A04, A00.A02, A00.A05, A00.A01, A00.A00, z, z2, z3, z4, A00.A0A, A00.A08, A00.A07, A00.A0B, A00.A0C, A00.A06)));
        }
    }
}
