package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.65d, reason: invalid class name */
/* loaded from: 65d.class */
public final class C65d implements C64o {
    public int A00;
    public final long A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1G2 A09;
    public final 1G2 A0A;
    public final String A0B;
    public final 1De A0C;
    public final boolean A0D;

    public C65d(1De r302) {
        this.A0C = r302;
        1BY r0 = r302.A00;
        this.A04 = 1Bu.A03(r0, 50069);
        this.A07 = 1Bq.A00(6);
        this.A02 = 1Bu.A03(r0, 83719);
        this.A08 = 1Bq.A00(66393);
        1G2 r02 = 1NK.A41;
        this.A09 = r02;
        1G2 r03 = 1NK.A42;
        this.A0A = r03;
        this.A03 = 1Bq.A00(33013);
        1Br A00 = 1Bq.A00(16385);
        this.A06 = A00;
        2yD r04 = (2yD) A00.A00.get();
        1GD r05 = 1GD.A07;
        this.A01 = r04.Av9(r05, 36604752133561042L);
        this.A00 = ((FbSharedPreferences) this.A03.A00.get()).ArU(r02, 0);
        String BD0 = ((FbSharedPreferences) this.A03.A00.get()).BD0(r03);
        this.A0B = BD0 == null ? "14/08/2023" : BD0;
        this.A05 = 1Bq.A00(16504);
        this.A0D = ((2yD) this.A06.A00.get()).AZr(r05, 36323277156927943L);
    }

    @Override // X.C64o
    public 1LI AKU(06Z r302, FbUserSession fbUserSession, 1Iw r304, 5zD r305, 64W r306, AnonymousClass622 anonymousClass622) {
        11T.A0F(r304, 0);
        1BL.A1H(fbUserSession, anonymousClass622, r305);
        11T.A0F(r302, 4);
        if (Cyg(anonymousClass622)) {
            7Lt r0 = (7Lt) 1Br.A0B(this.A08);
            Message message = anonymousClass622.A03;
            11T.A09(message);
            r0.A0H((Context) 1Br.A0B(this.A02), 6Pq.A0O, message, (5SW) null);
        }
        String format = new SimpleDateFormat(7zK.A00(67), ((1GS) 1Br.A0B(this.A05)).A05()).format(new Date());
        if (!11T.A0O(format, this.A0B)) {
            this.A00++;
            C00i c00i = this.A03.A00;
            1Ql A0U = 1BL.A0U(c00i);
            A0U.CaE(this.A09, this.A00);
            A0U.commit();
            1Ql A0U2 = 1BL.A0U(c00i);
            A0U2.CaL(this.A0A, format);
            A0U2.commit();
        }
        MigColorScheme A00 = 5zD.A00(r305);
        String A0D = r304.A0D(2131957353);
        boolean z = anonymousClass622.A0Z;
        return new C8cz(new 9zJ(3, r304, anonymousClass622, this), C1u7.A06, A00, 2KE.A05, A0D, 7xD.A00, z);
    }

    @Override // X.C64o
    public void Bac(AnonymousClass622 anonymousClass622) {
    }

    @Override // X.C64o
    public boolean Cyg(AnonymousClass622 anonymousClass622) {
        11T.A0F(anonymousClass622, 0);
        if (!anonymousClass622.A04.A03("threads_xma_nux_eligibility")) {
            return false;
        }
        if (this.A0D && this.A00 > this.A01) {
            return false;
        }
        PackageManager packageManager = ((Context) 1Br.A0B(this.A02)).getPackageManager();
        1Br.A0C(this.A04);
        return !6Ki.A03(packageManager, "com.instagram.barcelona");
    }
}
