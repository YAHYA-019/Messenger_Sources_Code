package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8gs, reason: invalid class name */
/* loaded from: 8gs.class */
public final class C8gs extends 1LH {
    public final 9Sa A00;
    public final FbUserSession A01;
    public final MigColorScheme A02;
    public final RichStatus A03;
    public final C2fo A04;
    public final User A05;
    public final boolean A06;

    public C8gs(FbUserSession fbUserSession, 9Sa r303, MigColorScheme migColorScheme, RichStatus richStatus, C2fo c2fo, User user, boolean z) {
        4YV.A1M(user, 2, migColorScheme);
        this.A01 = fbUserSession;
        this.A05 = user;
        this.A04 = c2fo;
        this.A03 = richStatus;
        this.A06 = z;
        this.A00 = r303;
        this.A02 = migColorScheme;
    }

    public static void A01(C2sn c2sn, 3yF r302, CharSequence charSequence) {
        r302.A3A(charSequence);
        r302.A18(12.0f);
        c2sn.A00(r302.A2W());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v191, types: [java.lang.Long] */
    public 1LI A0s(C2k5 c2k5) {
        1LI r305;
        String str;
        String str2;
        String str3;
        AVD A01;
        RichStatus A00;
        RichStatus A002;
        11T.A0F(c2k5, 0);
        Resources resources = (Resources) 7zM.A19();
        Object A0l = 7zN.A0l(3vP.A00(c2k5), 1, 67720);
        5Ou A0R = 7zQ.A0R();
        Object A0l2 = 7zN.A0l(3vP.A00(c2k5), 1, 50024);
        FbUserSession fbUserSession = this.A01;
        1Iw r0 = c2k5.A05;
        Context A0A = 7zL.A0A(r0);
        C2ff c2ff = (C2ff) 1Lm.A05(A0A, fbUserSession, 17069);
        2fZ r02 = (2fZ) 1Lm.A05(A0A, fbUserSession, 17067);
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        2lQ r03 = 2lO.A02;
        MigColorScheme migColorScheme = this.A02;
        2lO A0g = 7zL.A0g((2lO) null, 7zS.A0n(migColorScheme));
        C2sn A0U = 7zQ.A0U(r0);
        1Iw r04 = A0U.A00;
        C83r A003 = C5yy.A00(r04);
        C5yy c5yy = A003.A01;
        c5yy.A0H = false;
        A003.A2Y(migColorScheme);
        User user = this.A05;
        RichStatus richStatus = this.A03;
        Name name = user.A0X;
        String A004 = name.A00();
        if (A004 == null || A004.length() == 0) {
            r305 = null;
        } else {
            String str4 = null;
            float f = 0.0f / 0.0f;
            C2fd A04 = c2ff.A04(user, (-1) >>> 1, true);
            11T.A0A(A04);
            C0dp c0dp2 = (C0dp) 1Bi.A03(99390);
            55N A005 = 55M.A00(A0U.AeS());
            AnonymousClass557 A0p = 7zL.A0p();
            A0p.A08 = r02.A0R(user, A04);
            String str5 = name.firstName;
            if (str5 == null) {
                str5 = name.A00();
            }
            A0p.A08(str5);
            if (richStatus != null && (A002 = richStatus.A00(c0dp2)) != null) {
                str4 = A002.A02(resources);
            }
            A0p.A07(str4);
            A0p.A01 = new 9yY(4, A0l, A0l2, user);
            A005.A2X(A0p.A00());
            r305 = A005.A2V();
        }
        c5yy.A04 = r305;
        C9zj.A03(A003, this, 74);
        A0U.A00(A003.A2V());
        2lO A0I = 7zT.A0I((2lO) null, 12.0d);
        C2sn A0U2 = 7zQ.A0U(r04);
        1Iw r05 = A0U2.A00;
        3yF A0L = 2KZ.A0L(r05, 0);
        A0L.A3A(0Pz.A0W("User name: ", name.A00()));
        A0L.A18(12.0f);
        A0U2.A00(A0L.A2W());
        A01(A0U2, 2KZ.A0L(r05, 0), 0Pz.A0W("User id: ", user.A13));
        str = "(none)";
        A01(A0U2, 2KZ.A0L(r05, 0), 0Pz.A0W("Rich status: ", (richStatus == null || (A00 = richStatus.A00(c0dp)) == null) ? str : A00.A02(resources)));
        3yF A0L2 = 2KZ.A0L(r05, 0);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Is online: ");
        C2fo c2fo = this.A04;
        A01(A0U2, A0L2, AnonymousClass001.A0a(c2fo != null ? Boolean.valueOf(c2fo.A08) : str, A0k));
        3yF A0L3 = 2KZ.A0L(r05, 0);
        if (c2fo != null) {
            long convert = TimeUnit.MILLISECONDS.convert(c2fo.A03, TimeUnit.SECONDS);
            str2 = convert <= 0 ? "" : 7zN.A0t(A0R, 0S2.A0S, convert);
        } else {
            str2 = str;
        }
        A01(A0U2, A0L3, 0Pz.A0W("Last active time: ", str2));
        3yF A0L4 = 2KZ.A0L(r05, 0);
        if (c2fo != null) {
            long j = c2fo.A04;
            str3 = j <= 0 ? "" : 7zN.A0t(A0R, 0S2.A0S, j);
        } else {
            str3 = str;
        }
        A01(A0U2, A0L4, 0Pz.A0W("Last updated time: ", str3));
        3yF A0L5 = 2KZ.A0L(r05, 0);
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("Capability: ");
        A01(A0U2, A0L5, AnonymousClass001.A0a(c2fo != null ? Long.valueOf(c2fo.A01) : "(none)", A0k2));
        A01(A0U2, 2KZ.A0L(r05, 0), 0Pz.A1C("Is additional contact: ", this.A06));
        RichStatus A006 = richStatus != null ? richStatus.A00(c0dp) : null;
        8TV A007 = C8ns.A00(r05);
        A007.A2Y(migColorScheme);
        if (A006 != null) {
            A007.A2Z("Remove Status");
            A007.A2a(true);
            A01 = AVD.A01(this, 21);
        } else {
            A007.A2Z("Inject Status");
            A007.A2a(true);
            A01 = AVD.A01(this, 22);
        }
        7zR.A1A(A007, A01);
        7zQ.A1E(A007.A2W(), A0U2, A0U, A0I);
        return C2so.A02(A0U, c2k5, A0g);
    }
}
