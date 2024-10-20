package X;

import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8az, reason: invalid class name */
/* loaded from: 8az.class */
public final class C8az extends 1LH {
    public final 9OW A00;
    public final AutomatedResponseCustomQuestionModel A01;
    public final String A02;
    public final MigColorScheme A03;
    public final String A04;

    public C8az(9OW r302, AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel, MigColorScheme migColorScheme, String str, String str2) {
        this.A03 = migColorScheme;
        this.A02 = str;
        this.A04 = str2;
        this.A01 = automatedResponseCustomQuestionModel;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        C2iw c2iw = (C2iw) 2rO.A00(c2k5, SHO.A00, 7zL.A1Z(c2k5));
        C2iw c2iw2 = (C2iw) 2rO.A00(c2k5, SHP.A00, new Object[0]);
        C2lh A0e = 7zL.A0e(c2k5, new AKO(this, 33));
        Integer num = 0S2.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0k(num, 1.0f));
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A0X = 7zQ.A0X((2lO) null, num, 1.0f);
        C2sn A0K = 7zS.A0K(A0L);
        MigColorScheme migColorScheme = this.A03;
        AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel = this.A01;
        String str = automatedResponseCustomQuestionModel.A03;
        1Iw AeS = A0K.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        String A09 = 3yH.A09(A0U, 2131953249);
        8TR A00 = C5z5.A00(A0U.AeS());
        A00.A2Z(migColorScheme);
        A00.A2a(A09);
        A0U.A00(A00.A2W());
        String A092 = 3yH.A09(A0U, 2131953248);
        9pI r0 = new 9pI(this, 4);
        8TI A002 = 8oZ.A00(A0U.AeS());
        A002.A2Z(migColorScheme);
        8oZ r02 = A002.A01;
        r02.A0J = A092;
        r02.A04 = 3;
        r02.A03 = 6;
        A002.A1w(c2iw);
        r02.A0O = true;
        r02.A02 = 80;
        A002.A2K("faq_question_input");
        A002.A2Y(r0);
        if (str != null) {
            r02.A0I = str;
        }
        2RH r03 = 2RH.A03;
        7zO.A1K(A002, r03);
        A0U.A00(A002.A2W());
        String str2 = this.A02;
        if (11T.A0O(str2, "message_action")) {
            String A093 = 3yH.A09(A0U, 2131953247);
            2KD A003 = 2K3.A00(A0U.AeS());
            7zQ.A1N(migColorScheme, A003);
            A003.A2z(A093);
            7zO.A1K(A003, r03);
            7zO.A1E(A003, 2RH.A05);
            A0U.A00(A003.A2W());
        }
        A0K.A00(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false));
        String str3 = automatedResponseCustomQuestionModel.A04;
        C2sn A0U2 = 7zQ.A0U(AeS);
        String A094 = 3yH.A09(A0U2, 2131953252);
        8TR A004 = C5z5.A00(A0U2.AeS());
        A004.A2Z(migColorScheme);
        A004.A2a(A094);
        A0U2.A00(A004.A2W());
        String A095 = 3yH.A09(A0U2, 2131953251);
        9pI r04 = new 9pI(this, 5);
        8TI A005 = 8oZ.A00(A0U2.AeS());
        A005.A2Z(migColorScheme);
        8oZ r05 = A005.A01;
        r05.A0J = A095;
        r05.A04 = 3;
        r05.A03 = 6;
        A005.A1w(c2iw2);
        r05.A0O = true;
        r05.A02 = 500;
        A005.A2K("faq_response_input");
        A005.A2Y(r04);
        if (str3 != null) {
            r05.A0I = str3;
        }
        7zO.A1K(A005, r03);
        A0U2.A00(A005.A2W());
        if (11T.A0O(str2, "message_action")) {
            String A096 = 3yH.A09(A0U2, 2131953250);
            2KD A006 = 2K3.A00(A0U2.AeS());
            7zQ.A1N(migColorScheme, A006);
            A006.A2z(A096);
            7zO.A1K(A006, r03);
            7zO.A1E(A006, 2RH.A05);
            A0U2.A00(A006.A2W());
        }
        A0K.A00(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U2.A01, false));
        String A097 = 3yH.A09(A0K, 2131953246);
        String A098 = 3yH.A09(A0K, 2131953245);
        boolean A1V = 7zP.A1V(A0e);
        55N A007 = 55M.A00(AeS);
        AnonymousClass557 A0p = 7zL.A0p();
        A0p.A00 = A097.hashCode();
        A0p.A08(A097);
        A0p.A01();
        A0p.A04 = CJh.A01(A098, 3);
        A0p.A05(migColorScheme);
        7zN.A1W(A0p, new C59y(migColorScheme, "add_to_menu_toggle_transition_key", A1V, true));
        A0p.A01 = new 9yX(1, A0e, this, A1V);
        A007.A2X(A0p.A00());
        7zO.A1G(A007, 2RH.A05);
        7zQ.A1E(A007.A2W(), A0K, A0L, A0X);
        if (11T.A0O(this.A04, "edit")) {
            2lO A0K2 = 4YV.A0K(7zT.A0J(7zQ.A0X((2lO) null, 0S2.A0C, 0.0f), 7zL.A00(r03)), 0S2.A1J, 4YV.A06(r03));
            C2sn A0J = 7zS.A0J(A0L);
            8Au A008 = 8Av.A00(A0J.A00);
            A008.A0e();
            A008.A0l(42.0f);
            A008.A2Z(migColorScheme);
            A008.A2X(2131953255);
            A008.A2K("faq_delete_button");
            7zR.A1A(A008, AnonymousClass843.A00(this, 22));
            7zQ.A1E(A008.A2W(), A0J, A0L, A0K2);
        }
        return C2so.A02(A0L, c2k5, A0g);
    }
}
