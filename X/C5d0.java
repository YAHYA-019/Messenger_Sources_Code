package X;

import android.content.Context;

/* renamed from: X.5d0, reason: invalid class name */
/* loaded from: 5d0.class */
public final class C5d0 implements C2iz {
    public 1PA A00;
    public C5cv A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C02l A05;
    public final Context A06;
    public final 1De A07;

    public C5d0(1De r302) {
        this.A07 = r302;
        Context context = (Context) 1Bn.A0E((Context) null, r302.A00, 83719);
        this.A06 = context;
        this.A04 = 1HG.A00(context, 65728);
        this.A02 = 1Bq.A00(16458);
        this.A03 = 1Bq.A00(17085);
        this.A05 = new A37(this, 0);
    }

    public final void A00() {
        1PA r0;
        this.A01 = null;
        ((C2j0) this.A03.A00.get()).A03(this);
        1PA r02 = this.A00;
        if (r02 == null || !r02.A03() || (r0 = this.A00) == null) {
            return;
        }
        r0.A01();
    }

    public final void A01(C5cv c5cv) {
        this.A01 = c5cv;
        ((C2j0) this.A03.A00.get()).A02(this);
        1PA r0 = this.A00;
        if (r0 == null || !r0.A03()) {
            1P9 r02 = new 1P9((1I7) this.A04.A00.get());
            String A00 = AnonymousClass000.A00(100);
            C02l c02l = this.A05;
            r02.A05(c02l, A00);
            r02.A05(c02l, "com.facebook.orca.ACTION_MY_MONTAGE_FBID_ACQUIRED");
            r02.A05(c02l, "com.facebook.orca.ACTION_MULTIPLE_THREADS_UPDATED_FOR_UI");
            r02.A05(c02l, 1BJ.A00(3));
            r02.A05(c02l, "com.facebook.orca.ACTION_MULTIPLE_THREADS_READ_FOR_UI");
            1PA A02 = r02.A02();
            this.A00 = A02;
            A02.A00();
        }
    }

    @Override // X.C2iz
    public void AU9(C2j1 c2j1) {
        11T.A0F(c2j1, 0);
        c2j1.A00(33);
        c2j1.A00(32);
    }

    @Override // X.C2iz
    public void AUA(C2mq c2mq) {
        int i;
        int i2;
        11T.A0F(c2mq, 0);
        int AU8 = c2mq.AU8();
        if (AU8 == 32) {
            C00j.A05("MontageChangedEventNotifier.handleOnRefreshMontageBusEvent", -1568630998);
            try {
                ((1GU) 1Br.A0B(this.A02)).Ciz(new ACw(this));
                i2 = 441974190;
            } catch (Throwable th) {
                th = th;
                i = -632435699;
                C00j.A01(i);
                throw th;
            }
        } else {
            if (AU8 != 33) {
                return;
            }
            C00j.A05("MontageChangedEventNotifier.handleOnMontageThreadListUpdate", 483918107);
            try {
                ((1GU) this.A02.A00.get()).Ciz(new 6F0(this));
                i2 = 1736871281;
            } catch (Throwable th2) {
                th = th2;
                i = -1680707026;
                C00j.A01(i);
                throw th;
            }
        }
        C00j.A01(i2);
    }
}
