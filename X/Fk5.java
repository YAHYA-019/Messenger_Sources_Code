package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;

/* loaded from: Fk5.class */
public final class Fk5 implements C5ww {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Fk5(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public Fk5(FyG fyG, DLQ dlq, GJj gJj, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = dlq;
                this.A03 = gJj;
                this.A02 = fyG;
                break;
            case 2:
                this.A02 = dlq;
                this.A03 = gJj;
                this.A01 = fyG;
                break;
            default:
                this.A03 = dlq;
                this.A02 = gJj;
                this.A01 = fyG;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C5ww
    public final void onClick(View view) {
        DLQ dlq;
        GJj gJj;
        DKM A02;
        Object obj;
        Object obj2;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
            case 1:
                dlq = (DLQ) this.A01;
                gJj = (GJj) this.A03;
                A02 = DKM.A02(dlq);
                obj = this.A02;
                FyG fyG = (FyG) obj;
                A02.A0I(fyG);
                DKM.A0D(dlq, fyG, A02, gJj);
                return;
            case 2:
                dlq = (DLQ) this.A02;
                obj2 = this.A03;
                gJj = (GJj) obj2;
                A02 = DKM.A02(dlq);
                obj = this.A01;
                FyG fyG2 = (FyG) obj;
                A02.A0I(fyG2);
                DKM.A0D(dlq, fyG2, A02, gJj);
                return;
            case 3:
            case 4:
            case 5:
                dlq = (DLQ) this.A03;
                obj2 = this.A02;
                gJj = (GJj) obj2;
                A02 = DKM.A02(dlq);
                obj = this.A01;
                FyG fyG22 = (FyG) obj;
                A02.A0I(fyG22);
                DKM.A0D(dlq, fyG22, A02, gJj);
                return;
            case 6:
                ((DvU) this.A03).A00.invoke(7zL.A0B(this.A01), this.A02);
                return;
            case 7:
                Edq edq = (Edq) this.A03;
                AccountProfileModel accountProfileModel = (AccountProfileModel) this.A02;
                String str3 = accountProfileModel.A0D;
                str2 = "";
                if (str3 == null) {
                    str3 = str2;
                }
                String str4 = accountProfileModel.A0B;
                String str5 = str4;
                if (str4 == null) {
                    str5 = str2;
                }
                1Iw r0 = edq.A00;
                if (r0.A02 != null) {
                    r0.A0G(DKH.A0S(str5, str3), "updateState:FxImPhotoSelectLayout.updateSelectedProfileAndPhotoState");
                }
                C1qb c1qb = (C1qb) this.A01;
                str2 = str4 != null ? str4 : "";
                if (c1qb.A0J() != null) {
                    c1qb.A0G(7zS.A0N(str2), "updateState:FxImPhotoSelectSection.updateSelectedProfileState");
                    return;
                }
                return;
            case 8:
                1Iw r02 = (1Iw) this.A01;
                Eds eds = (Eds) this.A03;
                2JX r03 = (2JX) this.A02;
                11T.A0D(r03);
                Bundle A05 = 1BK.A05();
                E1M e1m = eds.A00;
                A05.putBoolean("should_show_done_button", 11T.A0O(e1m.A05, r03.A2Q()));
                1Br.A0C(e1m.A0D);
                String str6 = e1m.A03;
                if (str6 == null) {
                    str = "fbPayProductType";
                } else {
                    String str7 = e1m.A04;
                    if (str7 != null) {
                        F1x.A00(A05, e1m, r03, r02, str6, str7);
                        return;
                    }
                    str = "fbPaySessionId";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 9:
                Edt edt = (Edt) this.A03;
                2JX r04 = (2JX) this.A02;
                E1R e1r = edt.A00;
                e1r.A02 = r04;
                E1R.A06(e1r);
                return;
            case 10:
                String A0m = ((2JY) this.A02).A0m();
                if (A0m != null) {
                    try {
                        Uri A03 = C0A2.A03(A0m);
                        if (A03 != null) {
                            ((FIu) 1Br.A0B(((Euc) this.A03).A01)).A08(((1Iw) this.A01).A0D, A03);
                            return;
                        }
                        return;
                    } catch (SecurityException unused) {
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
