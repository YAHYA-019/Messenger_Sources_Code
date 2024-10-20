package X;

import android.content.Context;
import com.facebook.resources.impl.loading.downloader.voltron.VoltronResourcePreloader;
import java.util.Locale;

/* renamed from: X.355, reason: invalid class name */
/* loaded from: 355.class */
public final class AnonymousClass355 extends I5C {
    public 1BY A00;
    public final C00i A01 = 1BQ.A02(66746);
    public final C00i A02;
    public final C00i A03;

    public AnonymousClass355(1BO r302) {
        1BV A01 = 1BV.A01((1BY) null, 83719);
        this.A03 = A01;
        this.A02 = new 1HH((Context) A01.get(), 99435);
        this.A00 = new 1BY(r302);
    }

    public static final AnonymousClass355 A00(1BO r301) {
        return new AnonymousClass355(r301);
    }

    public /* bridge */ /* synthetic */ Object A02(Object[] objArr) {
        VoltronResourcePreloader voltronResourcePreloader = (VoltronResourcePreloader) ((1Jf) 1Br.A0B(((1Jc) this.A01.get()).A00)).A04.get();
        Locale A04 = ((1GS) voltronResourcePreloader.A01.get()).A04();
        return Boolean.valueOf(!A04.equals(Locale.ENGLISH) ? ((1Jf) voltronResourcePreloader.A00.get()).A00(A04) : false);
    }

    public void A03() {
        F8q.A00(new FEd("Updating translations ..."), (F8q) this.A02.get(), true);
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        boolean A1V = AnonymousClass001.A1V(obj);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(A1V ? "Updated " : "Could not update ");
        1Br.A0C(((1Jc) this.A01.get()).A00);
        F8q.A00(new FEd(1BL.A0u("VOLTRON", " translations", A0k)), (F8q) this.A02.get(), true);
    }
}
