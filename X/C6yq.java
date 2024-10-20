package X;

import android.content.Context;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.6yq, reason: invalid class name */
/* loaded from: 6yq.class */
public final class C6yq implements C6rN {
    public final ThreadViewColorScheme A00;
    public final C01i A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final MigColorScheme A05;
    public final C01i A06;
    public final C01i A07;
    public final C01i A08;

    public C6yq(Context context, ThreadViewColorScheme threadViewColorScheme) {
        11T.A0F(threadViewColorScheme, 2);
        this.A00 = threadViewColorScheme;
        MigColorScheme migColorScheme = threadViewColorScheme.A0F;
        11T.A0A(migColorScheme);
        this.A05 = migColorScheme;
        this.A02 = 1Bq.A00(16385);
        C03i c03i = C03i.A02;
        this.A01 = C01g.A00(c03i, C6yu.A00);
        this.A03 = 1HG.A00(context, 67150);
        this.A07 = C01g.A00(c03i, C6yw.A00);
        this.A06 = C01g.A01(new C82y(this, 6));
        this.A04 = 1Bu.A00(16671);
        this.A08 = C01g.A00(c03i, new C82y(context, 7));
    }

    @Override // X.C6rN
    public MigColorScheme Ad3() {
        return this.A05;
    }

    @Override // X.C6rN
    public C01i AkB() {
        return this.A06;
    }

    @Override // X.C6rN
    public C01i Aum() {
        return this.A07;
    }

    @Override // X.C6rN
    public int AvD() {
        return 4;
    }

    @Override // X.C6rN
    public C01i Ax4() {
        return this.A01;
    }

    @Override // X.C6rN
    public 1CO Axw() {
        return (1CO) this.A02.A00.get();
    }

    @Override // X.C6rN
    public C01i B64() {
        return this.A08;
    }

    @Override // X.C6rN
    public C70x BAY() {
        return (C70x) this.A03.A00.get();
    }

    @Override // X.C6rN
    public ThreadViewColorScheme BFP() {
        return this.A00;
    }

    @Override // X.C6rN
    public 1SI BFy() {
        return (1SI) this.A04.A00.get();
    }
}
