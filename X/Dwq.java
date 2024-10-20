package X;

import android.net.Uri;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.messaging.fxcal.identity.model.FxImScreenContentModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Dwq.class */
public final class Dwq extends C1rj {
    public Edp A00;
    public AccountProfileModel A01;
    public FxImScreenContentModel A02;
    public MigColorScheme A03;
    public boolean A04;

    public Dwq() {
        super("FxImSettingsManageProfileLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A03, this.A00, Boolean.valueOf(this.A04), this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2fq A0B;
        Edp edp = this.A00;
        AccountProfileModel accountProfileModel = this.A01;
        FxImScreenContentModel fxImScreenContentModel = this.A02;
        MigColorScheme migColorScheme = this.A03;
        boolean z = this.A04;
        C1i A0T = 7zU.A0T();
        2fZ r0 = (2fZ) 1Lo.A04(r302.A0D, C54z.A00(r302), (1BY) null, 17067);
        if (accountProfileModel == null || fxImScreenContentModel == null) {
            return 7zL.A0Y();
        }
        2cM A0M = 7zN.A0M(r302, (String) null);
        CQY A00 = A0T.A00(r302, migColorScheme);
        String str = accountProfileModel.A0D;
        String str2 = accountProfileModel.A0B;
        C2fd A002 = str2 != null ? EWV.A00(str2) : C2fd.A0T;
        LightColorScheme.A00();
        C2p1 c2p1 = new C2p1(ImmutableList.of(), accountProfileModel.A0A);
        if (str != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
            A0B = r0.A0B(uri, A002);
        } else {
            A0B = r0.A0A();
        }
        if (str2 == null) {
            str2 = "";
        }
        String str3 = accountProfileModel.A07;
        if (str3 == null) {
            str3 = "";
        }
        A00.A0L(new AnonymousClass565(c2p1, migColorScheme, A0B, ImmutableList.of((Object) str2, (Object) str3)));
        if (fxImScreenContentModel.A0C) {
            String str4 = fxImScreenContentModel.A09;
            if (!1JF.A0B(str4)) {
                String str5 = fxImScreenContentModel.A01;
                if (!1JF.A0B(str5)) {
                    CQY.A03(A00, new Fk1(2, edp, z), str5, str4, z);
                }
            }
        }
        String str6 = fxImScreenContentModel.A02;
        if (str6 != null) {
            A00.A0H(new Fjz(edp, 10), str6, "");
        }
        return 7zL.A0V(A0M, A00.A09());
    }
}
