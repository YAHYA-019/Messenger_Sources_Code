package com.facebook.messaging.rtc.incall.impl.widgets.useractions.creating;

import X.0FI;
import X.0Pz;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Iw;
import X.1JF;
import X.1Lo;
import X.1iF;
import X.2Ov;
import X.2QU;
import X.2Qa;
import X.2Qb;
import X.2Qn;
import X.4YU;
import X.7zM;
import X.7zP;
import X.7zR;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbK;
import X.C00i;
import X.C1rs;
import X.C1u2;
import X.C2531Gge;
import X.C8mo;
import X.CJC;
import X.CNb;
import X.EAX;
import X.ETa;
import X.FeI;
import X.GkT;
import X.HCl;
import X.HbS;
import X.I9O;
import X.IDd;
import X.IYv;
import X.IZJ;
import X.IfZ;
import X.Igz;
import X.JLB;
import X.JOM;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import java.util.BitSet;
import java.util.Set;

/* loaded from: UserActionsDialogFragment.class */
public class UserActionsDialogFragment extends 2Ov {
    public FbUserSession A00;
    public EAX A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public LithoView A08;
    public JLB A09;
    public final C00i A0C = AbF.A0S(this, 16980);
    public final C00i A0D = AbH.A0Q();
    public final C00i A0A = AbF.A0S(this, 85079);
    public final ETa A0B = new C2531Gge(this, 1);
    public final IfZ A0F = new IfZ(this);
    public final 2Qn A0E = IYv.A00(this, 36);

    public static C8mo A05(1Iw r301, UserActionsDialogFragment userActionsDialogFragment, UserKey userKey) {
        String str;
        boolean z;
        Set set;
        Set set2;
        if (userKey.id == null) {
            str = "";
        } else {
            I9O B1U = ((2QU) 4YU.A0p(userActionsDialogFragment.A02)).B1U(userKey.id);
            str = "";
            if (B1U != null) {
                String str2 = B1U.A08;
                if (1JF.A0B(str2)) {
                    str2 = B1U.A09;
                }
                if (B1U.A03() == 0S2.A0C) {
                    str = 0Pz.A0j("\"", str2, "\"");
                } else if (str2 != null) {
                    str = str2;
                }
            }
        }
        I9O B1U2 = ((2QU) 4YU.A0p(userActionsDialogFragment.A02)).B1U(userKey.id);
        boolean z2 = false;
        if (B1U2 != null) {
            IDd iDd = (IDd) 4YU.A0p(userActionsDialogFragment.A04);
            if (iDd.A07() && (set = iDd.A01.A06) != null) {
                HCl hCl = HCl.A04;
                if (set.contains(hCl)) {
                    HbS hbS = (HbS) 4YU.A0p(userActionsDialogFragment.A03);
                    String str3 = B1U2.A03.A03;
                    11T.A0F(str3, 0);
                    Igz igz = (Igz) hbS.A00.get(str3);
                    if (igz != null && (set2 = igz.action_capabilities_as_participant) != null && set2.contains(hCl)) {
                        z2 = true;
                    }
                }
            }
        }
        boolean z3 = ((2QU) 4YU.A0p(userActionsDialogFragment.A02)).B1U(userKey.id) == null ? false : !r0.A03.A06;
        CJC cjc = (CJC) userActionsDialogFragment.A0A.get();
        FbUserSession fbUserSession = userActionsDialogFragment.A00;
        fbUserSession.getClass();
        1BY r0 = cjc.A00;
        VideoChatLink videoChatLink = ((2Qb) 1Lo.A04((Context) null, fbUserSession, r0, 17016)).A06;
        if (videoChatLink == null ? !((CNb) 1Lo.A04((Context) null, fbUserSession, r0, 85166)).A04() || !cjc.A09(fbUserSession, userKey.id) : !videoChatLink.A0B.A0k.equals(1BK.A0X((String) cjc.A05.get()))) {
            VideoChatLink videoChatLink2 = ((2Qb) 4YU.A0p(userActionsDialogFragment.A07)).A06;
            if (videoChatLink2 == null || !videoChatLink2.A0k) {
                z = false;
                boolean z4 = !Boolean.TRUE.equals(((JOM) 4YU.A0p(userActionsDialogFragment.A05)).A0E.get(userKey));
                Context context = r301.A0D;
                String string = context.getString(2131965067);
                String string2 = context.getString(2131965168);
                String string3 = context.getString(2131965068);
                String string4 = context.getString(2131964975);
                String string5 = context.getString(2131965284);
                MigColorScheme A11 = 7zM.A11(userActionsDialogFragment.A0C);
                IZJ izj = new IZJ(userActionsDialogFragment);
                C1u2 c1u2 = (C1u2) userActionsDialogFragment.A0D.get();
                7zP.A1L(str, 1, string);
                7zR.A1P(string2, string3);
                11T.A0F(string4, 9);
                11T.A0F(string5, 10);
                11T.A0F(A11, 11);
                11T.A0F(c1u2, 13);
                GkT gkT = new GkT(r301, new C8mo());
                C8mo c8mo = gkT.A01;
                c8mo.A06 = str;
                BitSet bitSet = gkT.A02;
                bitSet.set(9);
                c8mo.A09 = z2;
                bitSet.set(0);
                c8mo.A04 = string;
                bitSet.set(7);
                c8mo.A0C = z;
                bitSet.set(11);
                c8mo.A07 = string2;
                bitSet.set(10);
                c8mo.A0A = z3;
                bitSet.set(3);
                c8mo.A05 = string3;
                bitSet.set(8);
                c8mo.A0B = z4;
                bitSet.set(4);
                c8mo.A03 = string4;
                bitSet.set(2);
                c8mo.A08 = string5;
                bitSet.set(12);
                c8mo.A01 = izj;
                bitSet.set(5);
                c8mo.A00 = c1u2;
                bitSet.set(6);
                c8mo.A02 = A11;
                bitSet.set(1);
                C1rs.A05(bitSet, gkT.A03, 13);
                gkT.A0J();
                return c8mo;
            }
        }
        z = true;
        boolean z42 = !Boolean.TRUE.equals(((JOM) 4YU.A0p(userActionsDialogFragment.A05)).A0E.get(userKey));
        Context context2 = r301.A0D;
        String string6 = context2.getString(2131965067);
        String string22 = context2.getString(2131965168);
        String string32 = context2.getString(2131965068);
        String string42 = context2.getString(2131964975);
        String string52 = context2.getString(2131965284);
        MigColorScheme A112 = 7zM.A11(userActionsDialogFragment.A0C);
        IZJ izj2 = new IZJ(userActionsDialogFragment);
        C1u2 c1u22 = (C1u2) userActionsDialogFragment.A0D.get();
        7zP.A1L(str, 1, string6);
        7zR.A1P(string22, string32);
        11T.A0F(string42, 9);
        11T.A0F(string52, 10);
        11T.A0F(A112, 11);
        11T.A0F(c1u22, 13);
        GkT gkT2 = new GkT(r301, new C8mo());
        C8mo c8mo2 = gkT2.A01;
        c8mo2.A06 = str;
        BitSet bitSet2 = gkT2.A02;
        bitSet2.set(9);
        c8mo2.A09 = z2;
        bitSet2.set(0);
        c8mo2.A04 = string6;
        bitSet2.set(7);
        c8mo2.A0C = z;
        bitSet2.set(11);
        c8mo2.A07 = string22;
        bitSet2.set(10);
        c8mo2.A0A = z3;
        bitSet2.set(3);
        c8mo2.A05 = string32;
        bitSet2.set(8);
        c8mo2.A0B = z42;
        bitSet2.set(4);
        c8mo2.A03 = string42;
        bitSet2.set(2);
        c8mo2.A08 = string52;
        bitSet2.set(12);
        c8mo2.A01 = izj2;
        bitSet2.set(5);
        c8mo2.A00 = c1u22;
        bitSet2.set(6);
        c8mo2.A02 = A112;
        bitSet2.set(1);
        C1rs.A05(bitSet2, gkT2.A03, 13);
        gkT2.A0J();
        return c8mo2;
    }

    public static void A06(UserActionsDialogFragment userActionsDialogFragment) {
        EAX eax = userActionsDialogFragment.A01;
        if (eax == null || !eax.isShowing()) {
            return;
        }
        userActionsDialogFragment.A01.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        C8mo A05 = A05(AbI.A0P(this), this, (UserKey) AbG.A07(requireArguments(), "participant_key"));
        ((2QU) 4YU.A0p(this.A02)).A5X(this.A0F);
        ((2Qa) 4YU.A0p(this.A06)).A02(this.A0E);
        LithoView A0O = AbK.A0O(this);
        this.A08 = A0O;
        A0O.A0x(A05);
        EAX eax = new EAX(getContext());
        this.A01 = eax;
        eax.A0A(FeI.A00);
        this.A01.A0C(false);
        this.A01.setContentView(this.A08);
        EAX eax2 = this.A01;
        eax2.A08 = this.A0B;
        return eax2;
    }

    public 1iF A17() {
        return AbF.A0C(322006035685628L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(191353054);
        super.onCreate(bundle);
        FbUserSession A0G = 1BL.A0G(this);
        this.A00 = A0G;
        this.A06 = 1Lo.A02(A0G, this, 33089);
        this.A04 = 1Lo.A02(this.A00, this, 114855);
        this.A03 = 1Lo.A02(this.A00, this, 115585);
        this.A07 = 1Lo.A02(this.A00, this, 17016);
        this.A05 = 1Lo.A02(this.A00, this, 114856);
        this.A02 = 1Lo.A02(this.A00, this, 99981);
        0FI.A08(-1098535142, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1126900596);
        super.onDestroyView();
        this.A08 = null;
        0FI.A08(1240593709, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            super/*X.0D2*/.onDismiss(dialogInterface);
        }
        ((2QU) 4YU.A0p(this.A02)).CeB(this.A0F);
        ((2Qa) 4YU.A0p(this.A06)).A03(this.A0E);
    }
}
