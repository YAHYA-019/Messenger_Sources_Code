package X;

import kotlin.jvm.functions.Function1;

/* loaded from: GAe.class */
public final class GAe extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAe(Object obj, Object obj2, String str, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5nf c5nf;
        RQT rqt;
        Object obj2;
        2R2 r302;
        0DA r304;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                r302 = (2R2) obj;
                r304 = new 0DA();
                7zT.A1F(r304, this.A02);
                str = this.A03;
                str2 = "view_name";
                r304.A07(str2, str);
                7zL.A1E(r302, r304);
                7zO.A18(r302, this.A01);
                return r302;
            case 1:
            case 2:
            case 3:
                r302 = (2R2) obj;
                r304 = new 0DA();
                7zT.A1F(r304, this.A02);
                str = this.A03;
                str2 = "view_name";
                r304.A07(str2, str);
                7zL.A1E(r302, r304);
                7zO.A18(r302, this.A01);
                return r302;
            case 4:
            case 5:
                r302 = (2R2) obj;
                r304 = new 0DA();
                7zT.A1F(r304, this.A02);
                str = this.A03;
                str2 = "view_name";
                r304.A07(str2, str);
                7zL.A1E(r302, r304);
                7zO.A18(r302, this.A01);
                return r302;
            case 6:
            case 7:
            case 8:
            default:
                r302 = (2R2) obj;
                r304 = new 0DA();
                7zT.A1F(r304, this.A02);
                str = this.A03;
                str2 = "view_name";
                r304.A07(str2, str);
                7zL.A1E(r302, r304);
                7zO.A18(r302, this.A01);
                return r302;
            case 9:
                r302 = (2R2) obj;
                r304 = new 0DA();
                7zT.A1F(r304, this.A02);
                str = this.A03;
                str2 = "target_name";
                r304.A07(str2, str);
                7zL.A1E(r302, r304);
                7zO.A18(r302, this.A01);
                return r302;
            case 10:
                c5nf = (C5nf) obj;
                11T.A0F(c5nf, 0);
                rqt = (RQT) ((Ep5) this.A02).A02.getValue();
                obj2 = c5nf.A01;
                if (obj2 == null) {
                    throw 1BK.A0h();
                }
                0R3 r0 = (0R3) obj2;
                DgU dgU = (DgU) this.A01;
                dgU.A09("platform_trust_token", (String) c5nf.A00);
                return rqt.A00(r0, dgU, this.A03);
            case 11:
                c5nf = (C5nf) obj;
                11T.A0F(c5nf, 0);
                rqt = ((LZq) this.A02).A03;
                obj2 = c5nf.A01;
                11T.A09(obj2);
                0R3 r02 = (0R3) obj2;
                DgU dgU2 = (DgU) this.A01;
                dgU2.A09("platform_trust_token", (String) c5nf.A00);
                return rqt.A00(r02, dgU2, this.A03);
            case 12:
                Emy emy = (Emy) obj;
                11T.A0F(emy, 0);
                EJm eJm = (EJm) this.A01;
                String str3 = eJm.A00;
                if (str3 == null) {
                    str3 = ((FGA) this.A02).A00.getString(2131960227);
                }
                emy.A01 = str3;
                emy.A00 = this.A03;
                emy.A02 = eJm.A01;
                return 04S.A00;
        }
    }
}
