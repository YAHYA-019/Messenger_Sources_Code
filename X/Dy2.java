package X;

import android.view.View;
import com.facebook.messaging.fxcal.identity.model.FxImScreenContentModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Dy2.class */
public final class Dy2 extends C1rj {
    public Edn A00;
    public FxImScreenContentModel A01;
    public MigColorScheme A02;
    public ImmutableList A03;

    public Dy2() {
        super("FxImPhotoSelectLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A03, this.A01};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        2cL A0Y;
        QNm A0P = 4YU.A0P(r302);
        MigColorScheme migColorScheme = this.A02;
        Edn edn = this.A00;
        ImmutableList immutableList = this.A03;
        FxImScreenContentModel fxImScreenContentModel = this.A01;
        String str = A0P.A00;
        String str2 = A0P.A01;
        int size = View.MeasureSpec.getSize(i2);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1S(size);
        7zM.A1O(A01, migColorScheme);
        C2ki A00 = C2kV.A00(r302);
        7zL.A1K(r302);
        QOm qOm = new QOm();
        qOm.A02 = migColorScheme;
        qOm.A00 = fxImScreenContentModel;
        qOm.A03 = immutableList;
        qOm.A04 = str;
        qOm.A01 = new Edq(r302);
        A00.A2d(qOm);
        A00.A2j(true);
        A00.A0R();
        A01.A2e(A00.A2W());
        if (fxImScreenContentModel != null) {
            String str3 = fxImScreenContentModel.A00;
            if (!1JF.A0B(str3)) {
                2cM A012 = 2cK.A01(r302, (String) null, 0);
                A012.A0S();
                2RH r0 = 2RH.A06;
                7zO.A1I(A012, r0);
                7zO.A1K(A012, r0);
                8Th A002 = C8nq.A00(r302);
                A002.A2Z(migColorScheme);
                A002.A2a(str3);
                A002.A2Y(new FXc(edn, str2, str, 0));
                A012.A2d(A002);
                A0Y = A012.A00;
                return 7zL.A0V(A01, A0Y);
            }
        }
        A0Y = 7zL.A0Y();
        return 7zL.A0V(A01, A0Y);
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        String str;
        QNm qNm = (QNm) r303;
        ImmutableList immutableList = this.A03;
        int i = -1;
        if (!immutableList.isEmpty()) {
            i = 0;
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 >= immutableList.size()) {
                    break;
                }
                if (DKF.A0U(immutableList, i3).A00 > DKF.A0U(immutableList, i).A00) {
                    i = i3;
                }
                i2 = i3 + 1;
            }
        }
        String str2 = "";
        if (i >= 0) {
            str = DKF.A0U(immutableList, i).A0B != null ? DKF.A0U(immutableList, i).A0B : str2;
            if (DKF.A0U(immutableList, i).A0D != null) {
                str2 = DKF.A0U(immutableList, i).A0D;
            }
        } else {
            str = str2;
        }
        qNm.A00 = str;
        qNm.A01 = str2;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
