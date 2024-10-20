package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.presence.DefaultPresenceManager;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.3df, reason: invalid class name */
/* loaded from: 3df.class */
public final class C3df implements Supplier {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C3df(FbUserSession fbUserSession, 2TR r303, java.util.Map map, int i) {
        this.A00 = i;
        this.A01 = r303;
        this.A02 = fbUserSession;
        this.A03 = map;
    }

    public static ImmutableList A00(FbUserSession fbUserSession, 2eW r302, 2TR r303, 4bT r304) {
        r302.A0C = r303.A06;
        r302.A0D = r303.A05;
        return r304.A00(fbUserSession, r302);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    @Override // com.google.common.base.Supplier
    public final Object get() {
        java.util.Map map;
        int i;
        boolean z;
        ImmutableList A00;
        int i2;
        java.util.Map map2;
        ImmutableList A002;
        int i3;
        int i4 = this.A00;
        2TR r0 = (2TR) this.A01;
        switch (i4) {
            case 0:
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                int i5 = r0.A03.A00;
                C00j.A05("getFavoriteMessengerContacts", -1463819851);
                try {
                    4bT A01 = 2TR.A01(r0);
                    2eW A003 = 2TR.A00(r0).A00("favorite messenger contacts");
                    A003.A07 = true;
                    A003.A0A = true;
                    A003.A09 = true;
                    A003.A0B = true;
                    A003.A01 = 2eX.A03;
                    A003.A0K = true;
                    A003.A00 = i5;
                    A002 = A00(fbUserSession, A003, r0, A01);
                    i3 = -131223997;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th) {
                    th = th;
                    i = 705264300;
                    C00j.A01(i);
                    throw th;
                }
            case 1:
                FbUserSession fbUserSession2 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getTopFriends", 797286583);
                try {
                    4bT A012 = 2TR.A01(r0);
                    2eT A004 = 2TR.A00(r0);
                    ImmutableList immutableList = C1r4.A05;
                    int i6 = r0.A03.A00;
                    if (i6 == -1) {
                        i6 = 3Hd.A00;
                    }
                    A002 = A00(fbUserSession2, A004.A02("contacts loader top friends", immutableList, i6), r0, A012);
                    i3 = 1913282014;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th2) {
                    th = th2;
                    i = -2134867163;
                    C00j.A01(i);
                    throw th;
                }
            case 2:
                FbUserSession fbUserSession3 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getTopBlockableContacts", 223622510);
                try {
                    4bT A013 = 2TR.A01(r0);
                    2eT A005 = 2TR.A00(r0);
                    ImmutableList immutableList2 = C1r4.A01;
                    int i7 = r0.A03.A00;
                    if (i7 == -1) {
                        i7 = 3Hd.A00;
                    }
                    2eW A02 = A005.A02("contacts loader top blockable contacts", immutableList2, i7);
                    A02.A07 = true;
                    A02.A0C = r0.A06;
                    A02.A0D = true;
                    A002 = A013.A00(fbUserSession3, A02);
                    i3 = 1746855571;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th3) {
                    th = th3;
                    i = 155035423;
                    C00j.A01(i);
                    throw th;
                }
            case 3:
                FbUserSession fbUserSession4 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getInstagramContacts", 1212613036);
                try {
                    4bT A014 = 2TR.A01(r0);
                    2eW A006 = 2TR.A00(r0).A00("all instagram contacts");
                    A006.A05 = ImmutableList.of((Object) C1r4.A09);
                    A006.A07 = true;
                    A006.A0B = true;
                    A006.A01 = 2eX.A04;
                    int i8 = r0.A03.A00;
                    if (i8 == -1) {
                        i8 = 3Hd.A00;
                    }
                    A006.A00 = i8;
                    A002 = A00(fbUserSession4, A006, r0, A014);
                    i3 = -150013281;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th4) {
                    th = th4;
                    i = -1306052785;
                    C00j.A01(i);
                    throw th;
                }
            case 4:
                FbUserSession fbUserSession5 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getInstagramFollowing", 799594932);
                try {
                    4bT A015 = 2TR.A01(r0);
                    2eW A007 = 2TR.A00(r0).A00("all instagram followings");
                    A007.A05 = ImmutableList.of((Object) C1r4.A09);
                    A007.A07 = true;
                    A007.A0F = true;
                    A007.A01 = 2eX.A04;
                    int i9 = r0.A03.A00;
                    if (i9 == -1) {
                        i9 = 3Hd.A00;
                    }
                    A007.A00 = i9;
                    A002 = A00(fbUserSession5, A007, r0, A015);
                    i3 = 134653653;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th5) {
                    th = th5;
                    i = -1151308007;
                    C00j.A01(i);
                    throw th;
                }
            case 5:
                FbUserSession fbUserSession6 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getOculusMessagableTypes", -1197829281);
                try {
                    4bT A016 = 2TR.A01(r0);
                    2eW A008 = 2TR.A00(r0).A00("all oculus messagable types");
                    A008.A05 = C1r4.A06;
                    A008.A07 = true;
                    A008.A0E = true;
                    A008.A01 = 2eX.A06;
                    A002 = A00(fbUserSession6, A008, r0, A016);
                    i3 = 22336505;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th6) {
                    th = th6;
                    i = -2107293034;
                    C00j.A01(i);
                    throw th;
                }
            case 6:
                FbUserSession fbUserSession7 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                int i10 = r0.A03.A00;
                C00j.A05("getBroadcastFlowTopThreads", 483963118);
                try {
                    4bT A017 = 2TR.A01(r0);
                    2eW A009 = 2TR.A00(r0).A00("broadcast flow top threads");
                    boolean A0010 = 2eW.A00(A009);
                    A009.A0A = A0010;
                    A009.A0B = A0010;
                    A009.A01 = 2eX.A02;
                    A009.A0K = A0010;
                    A009.A00 = i10;
                    A002 = A00(fbUserSession7, A009, r0, A017);
                    i3 = 1565255887;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th7) {
                    th = th7;
                    i = 2020543407;
                    C00j.A01(i);
                    throw th;
                }
            case 7:
                FbUserSession fbUserSession8 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getMsplitImportedContacts", 359443418);
                try {
                    4bT A018 = 2TR.A01(r0);
                    2eW A0011 = 2TR.A00(r0).A00("msplit imported contacts");
                    boolean A0012 = 2eW.A00(A0011);
                    A0011.A0B = A0012;
                    A0011.A01 = 2eX.A03;
                    A0011.A0K = A0012;
                    A0011.A0G = A0012;
                    A002 = A018.A00(fbUserSession8, A0011);
                    i3 = 1345034820;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th8) {
                    th = th8;
                    i = 967268107;
                    C00j.A01(i);
                    throw th;
                }
            case 8:
                FbUserSession fbUserSession9 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getOnMessenger", 1879819793);
                try {
                    4bT A019 = 2TR.A01(r0);
                    2eW A0013 = 2TR.A00(r0).A00("on messenger friends");
                    boolean A0014 = 2eW.A00(A0013);
                    A0013.A0A = A0014;
                    A0013.A0B = A0014;
                    A0013.A0E = A0014;
                    A0013.A01 = 2eX.A06;
                    A002 = A00(fbUserSession9, A0013, r0, A019);
                    i3 = -1702237601;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th9) {
                    th = th9;
                    i = 31142498;
                    C00j.A01(i);
                    throw th;
                }
            case 9:
                FbUserSession fbUserSession10 = (FbUserSession) this.A02;
                map = (java.util.Map) this.A03;
                C00j.A05("getOnlineFriends", -1568707426);
                try {
                    z = false;
                    ArrayList A05 = DefaultPresenceManager.A05((DefaultPresenceManager) r0.A0L, -1, false);
                    4bT A0110 = 2TR.A01(r0);
                    2eW A0015 = 2TR.A00(r0).A00("contacts loader online friends");
                    A0015.A05 = C1r4.A05;
                    A0015.A06 = A05;
                    A0015.A01 = 2eX.A06;
                    A00 = A00(fbUserSession10, A0015, r0, A0110);
                    i2 = 1926782235;
                    C00j.A01(i2);
                    return 2TR.A03(A00, map, z);
                } catch (Throwable th10) {
                    th = th10;
                    i = 1425552800;
                    C00j.A01(i);
                    throw th;
                }
            case 10:
                FbUserSession fbUserSession11 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getTopOnMessenger", 1084211784);
                try {
                    4bT A0111 = 2TR.A01(r0);
                    2eW A0016 = 2TR.A00(r0).A00("top on messenger friends");
                    boolean A0017 = 2eW.A00(A0016);
                    A0016.A0A = A0017;
                    A0016.A0B = A0017;
                    A0016.A01 = 2eX.A03;
                    A0016.A0K = A0017;
                    A0016.A00 = 15;
                    A002 = A00(fbUserSession11, A0016, r0, A0111);
                    i3 = 1114786554;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th11) {
                    th = th11;
                    i = -1423299919;
                    C00j.A01(i);
                    throw th;
                }
            case 11:
                FbUserSession fbUserSession12 = (FbUserSession) this.A02;
                map = (java.util.Map) this.A03;
                C00j.A05("getNotOnMessengerFriends", 654515634);
                try {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    4bT A0112 = 2TR.A01(r0);
                    2eW A0018 = 2TR.A00(r0).A00("not on messenger friends");
                    z = 2eW.A00(A0018);
                    A0018.A08 = z;
                    A0018.A0B = z;
                    A0018.A01 = 2eX.A03;
                    A0018.A0K = z;
                    builder.addAll(A00(fbUserSession12, A0018, r0, A0112));
                    r0.A0G.get();
                    C00j.A01(1121650663);
                    A00 = builder.build();
                    return 2TR.A03(A00, map, z);
                } catch (Throwable th12) {
                    th = th12;
                    i = 1164668593;
                    C00j.A01(i);
                    throw th;
                }
            case 12:
                FbUserSession fbUserSession13 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                int i11 = r0.A03.A00;
                C00j.A05("getPHATContacts", -563384638);
                try {
                    4bT A0113 = 2TR.A01(r0);
                    2eW A0019 = 2TR.A00(r0).A00("phat contacts");
                    boolean A0020 = 2eW.A00(A0019);
                    A0019.A0A = A0020;
                    A0019.A0B = A0020;
                    A0019.A01 = 2eX.A08;
                    A0019.A0K = A0020;
                    A0019.A00 = i11;
                    A002 = A00(fbUserSession13, A0019, r0, A0113);
                    i3 = 1091211843;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th13) {
                    th = th13;
                    i = 442767789;
                    C00j.A01(i);
                    throw th;
                }
            case 13:
                FbUserSession fbUserSession14 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getTopContacts", -1918030765);
                try {
                    4bT A0114 = 2TR.A01(r0);
                    2eT A0021 = 2TR.A00(r0);
                    int i12 = r0.A03.A00;
                    if (i12 == -1) {
                        i12 = 15;
                    }
                    2eW A0022 = A0021.A00("top contacts");
                    boolean A0023 = 2eW.A00(A0022);
                    A0022.A0B = A0023;
                    A0022.A01 = 2eX.A03;
                    A0022.A0K = A0023;
                    A0022.A00 = i12;
                    A002 = A00(fbUserSession14, A0022, r0, A0114);
                    i3 = 101301509;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th14) {
                    th = th14;
                    i = -54950982;
                    C00j.A01(i);
                    throw th;
                }
            case 14:
                FbUserSession fbUserSession15 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getTopInteropMessagableContacts", -385820885);
                try {
                    4bT A0115 = 2TR.A01(r0);
                    2eT A0024 = 2TR.A00(r0);
                    int i13 = r0.A03.A00;
                    if (i13 == -1) {
                        i13 = 15;
                    }
                    2eW A0025 = A0024.A00("top interop messagable contacts");
                    A0025.A05 = C1r4.A04;
                    A0025.A07 = true;
                    A0025.A0B = true;
                    A0025.A01 = 2eX.A03;
                    A0025.A0K = true;
                    A0025.A00 = i13;
                    A002 = A00(fbUserSession15, A0025, r0, A0115);
                    i3 = -1667520458;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th15) {
                    th = th15;
                    i = -1818134235;
                    C00j.A01(i);
                    throw th;
                }
            case 15:
                FbUserSession fbUserSession16 = (FbUserSession) this.A02;
                map2 = (java.util.Map) this.A03;
                C00j.A05("getAllInteropMessagableContacts", -2045946013);
                try {
                    4bT A0116 = 2TR.A01(r0);
                    2eW A0026 = 2TR.A00(r0).A00("all interop messagable contacts");
                    A0026.A05 = C1r4.A04;
                    A0026.A07 = true;
                    A0026.A0B = true;
                    A0026.A0E = true;
                    A0026.A01 = 2eX.A06;
                    A002 = A00(fbUserSession16, A0026, r0, A0116);
                    i3 = -754917798;
                    C00j.A01(i3);
                    return 2TR.A03(A002, map2, false);
                } catch (Throwable th16) {
                    th = th16;
                    i = -588871416;
                    C00j.A01(i);
                    throw th;
                }
            case 16:
                FbUserSession fbUserSession17 = (FbUserSession) this.A02;
                map = (java.util.Map) this.A03;
                C00j.A05("getOnlineFriendsSortedByCoefficient", 1624958258);
                try {
                    z = false;
                    ArrayList A052 = DefaultPresenceManager.A05((DefaultPresenceManager) r0.A0L, 450, false);
                    4bT A0117 = 2TR.A01(r0);
                    2eT A0027 = 2TR.A00(r0);
                    ImmutableList immutableList3 = C1r4.A05;
                    2eW A0028 = A0027.A00("contacts loader online friends");
                    A0028.A05 = immutableList3;
                    A0028.A06 = A052;
                    A0028.A01 = 2eX.A03;
                    A0028.A0K = true;
                    A0028.A00 = 15;
                    A00 = A00(fbUserSession17, A0028, r0, A0117);
                    i2 = 1302920729;
                    C00j.A01(i2);
                    return 2TR.A03(A00, map, z);
                } catch (Throwable th17) {
                    th = th17;
                    i = 1989979748;
                    C00j.A01(i);
                    throw th;
                }
            default:
                return 2TR.A02((FbUserSession) this.A02, r0, (java.util.Map) this.A03, false);
        }
    }
}
