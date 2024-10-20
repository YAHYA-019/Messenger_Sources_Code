package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.presence.note.audience.util.NotesAudienceControlType;

/* renamed from: X.8hn, reason: invalid class name */
/* loaded from: 8hn.class */
public final class C8hn extends 1LH {
    public final int A00;
    public final 1pI A01;
    public final MigColorScheme A02;
    public final 9LU A03;
    public final NotesAudienceControlType A04;
    public final C03513yC A05;

    public C8hn(1pI r302, MigColorScheme migColorScheme, 9LU r304, NotesAudienceControlType notesAudienceControlType, C03513yC c03513yC, int i) {
        11T.A0F(r304, 2);
        this.A02 = migColorScheme;
        this.A03 = r304;
        this.A04 = notesAudienceControlType;
        this.A01 = r302;
        this.A00 = i;
        this.A05 = c03513yC;
    }

    private final 55J A01(NotesAudienceControlType notesAudienceControlType, String str) {
        return C5wy.A00(new 9yV(this, notesAudienceControlType, 18), null, this.A02, str, "android.widget.RadioButton", true, AnonymousClass001.A1W(this.A04, notesAudienceControlType));
    }

    public static void A0L(CJ4 cj4, C8hn c8hn, NotesAudienceControlType notesAudienceControlType, C2k7 c2k7, int i) {
        cj4.A04(3yH.A09(c2k7, i));
        cj4.A02(c8hn.A01(notesAudienceControlType, 3yH.A09(c2k7, i)));
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2TI r0 = (2TI) 1Bn.A0A(66725);
        2lQ r02 = 2lO.A02;
        Integer num = 0S2.A01;
        2lO A03 = C82m.A03(null, 7zL.A0u(num, true, 1), num, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        55N A00 = 55M.A00(AeS);
        LightColorScheme.A00();
        MigColorScheme migColorScheme = this.A02;
        migColorScheme.getClass();
        7zU.A1I(A0L, new 55W(migColorScheme, 3yH.A09(A0L, 2131962219), ""), A00);
        2TI r03 = (2TI) 1Bn.A0A(66725);
        C2sn A0U = 7zQ.A0U(AeS);
        1Iw r04 = A0U.A00;
        55N A002 = 55M.A00(r04);
        CJ4 cj4 = new CJ4();
        cj4.A07 = migColorScheme;
        NotesAudienceControlType notesAudienceControlType = this.A04;
        NotesAudienceControlType notesAudienceControlType2 = NotesAudienceControlType.A02;
        boolean z = true;
        cj4.A04 = new C58r(migColorScheme, AnonymousClass001.A1W(notesAudienceControlType, notesAudienceControlType2), true);
        A0L(cj4, this, notesAudienceControlType2, A0U, 2131962205);
        cj4.A03 = CJh.A00(3yH.A09(A0U, 2131962204));
        7zU.A1I(A0U, cj4.A01(), A002);
        55N A003 = 55M.A00(r04);
        CJ4 cj42 = new CJ4();
        cj42.A07 = migColorScheme;
        NotesAudienceControlType notesAudienceControlType3 = NotesAudienceControlType.A04;
        cj42.A04 = new C58r(migColorScheme, AnonymousClass001.A1W(notesAudienceControlType, notesAudienceControlType3), true);
        A0L(cj42, this, notesAudienceControlType3, A0U, 2131962214);
        cj42.A03 = CJh.A00(3yH.A09(A0U, 2131962213));
        7zU.A1I(A0U, cj42.A01(), A003);
        55N A004 = 55M.A00(r04);
        CJ4 cj43 = new CJ4();
        cj43.A07 = migColorScheme;
        NotesAudienceControlType notesAudienceControlType4 = NotesAudienceControlType.A03;
        cj43.A04 = new C58r(migColorScheme, AnonymousClass001.A1W(notesAudienceControlType, notesAudienceControlType4), true);
        A0L(cj43, this, notesAudienceControlType4, A0U, 2131962207);
        cj43.A03 = CJh.A00(3yH.A09(A0U, 2131962206));
        7zU.A1I(A0U, cj43.A01(), A004);
        if (2TI.A00(r03).AZk(36321567763743248L)) {
            55N A005 = 55M.A00(r04);
            CJ4 cj44 = new CJ4();
            cj44.A07 = migColorScheme;
            NotesAudienceControlType notesAudienceControlType5 = NotesAudienceControlType.A05;
            if (notesAudienceControlType != notesAudienceControlType5) {
                z = false;
            }
            cj44.A04 = new C58r(migColorScheme, z, true);
            A0L(cj44, this, notesAudienceControlType5, A0U, 2131962217);
            cj44.A03 = CJh.A00(3yH.A09(A0U, 2131962216));
            7zU.A1I(A0U, cj44.A01(), A005);
        }
        A0L.A00(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false));
        if (notesAudienceControlType == notesAudienceControlType4 || (2TI.A00(r0).AZk(36321567763874322L) && notesAudienceControlType != NotesAudienceControlType.A05)) {
            C1u3 c1u3 = C1u3.A1a;
            C1u4 c1u4 = C1u4.SIZE_24;
            C1ut c1ut = C1ut.A0B;
            7zP.A1S(c1u3, c1u4, c1ut);
            5AM r05 = new 5AM(c1u3, c1u4, c1ut, migColorScheme, (CharSequence) null);
            C2sn A0U2 = 7zQ.A0U(AeS);
            1Iw r06 = A0U2.A00;
            55N A006 = 55M.A00(r06);
            CJ4 cj45 = new CJ4();
            cj45.A07 = migColorScheme;
            cj45.A04 = null;
            cj45.A04(notesAudienceControlType == notesAudienceControlType4 ? 3yH.A09(A0U2, 2131962206) : 3yH.A09(A0U2, 2131962215));
            cj45.A03 = CJh.A00(4YV.A0o(4YU.A0E(r06), this.A00, 2131820718));
            cj45.A05 = r05;
            cj45.A01 = C9ye.A01(this, 75);
            7zU.A1I(A0U2, cj45.A01(), A006);
            A0L.A00(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U2.A01, false));
        }
        2TI r07 = (2TI) 1Bn.A0A(66725);
        C2sn A0U3 = 7zQ.A0U(AeS);
        55N A007 = 55M.A00(A0U3.A00);
        int i = 9GF.A00;
        int i2 = 9GF.A01;
        LightColorScheme.A00();
        int i3 = 2131962220;
        if (2TI.A00(r07).AZk(36321567764333077L)) {
            i3 = 2131962222;
        }
        7zU.A1I(A0U3, 7zV.A0R(migColorScheme, 3yH.A09(A0U3, i3), i, i2, false), A007);
        return 7zM.A0l(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U3.A01, false), A0L, c2k5, A03);
    }
}
