package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.communitymessaging.communitylistmanagement.model.CommunityItem;
import com.facebook.messaging.communitymessaging.communitylistmanagement.model.CommunityItemIcon;
import com.facebook.messaging.communitymessaging.communitylistmanagement.model.CommunityItemUriIcon;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingCommunityType;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ay7, reason: case insensitive filesystem */
/* loaded from: Ay7.class */
public final class C1978Ay7 extends 1LH {
    public final 1Iw A00;
    public final C2k5 A01;
    public final Bcv A02;
    public final MigColorScheme A03;
    public final C1373Aff A04;
    public final C2iw A05;
    public final C5xv A06;
    public final List A07;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.2iw, java.lang.Object] */
    public C1978Ay7(1Iw r302, Bcv bcv, MigColorScheme migColorScheme, C5xv c5xv, List list) {
        C3o5.A0k(bcv, 4, list);
        this.A00 = r302;
        this.A03 = migColorScheme;
        this.A06 = c5xv;
        this.A02 = bcv;
        this.A07 = list;
        ?? obj = new Object();
        this.A05 = obj;
        this.A04 = new C1373Aff(r302, obj);
        this.A01 = new C2k5(r302, null);
    }

    public static final C55c A01(MigColorScheme migColorScheme, String str) {
        return new C55c(null, null, 2K5.A04, migColorScheme, null, str, null, null, null, 4, str.hashCode(), true);
    }

    private final C5yv A0L() {
        C5yw A0b = 7zN.A0b(this.A00, false);
        MigColorScheme migColorScheme = this.A03;
        A0b.A2b(migColorScheme);
        A0b.A2a(2131954521);
        C2k5 c2k5 = this.A01;
        C9lC A00 = C9lC.A00();
        A00.A04 = DKB.A00(ActionId.MQTT_CONNECTING);
        A00.A04(3yH.A09(c2k5, 2131954522));
        11T.A0F(migColorScheme, 0);
        A00.A01 = migColorScheme;
        A00.A05 = true;
        A0b.A2g(11T.A03(Cx1.A00(A00, this, 12)));
        A0b.A2d(this.A06);
        A0b.A2i(false);
        A0b.A1w(this.A05);
        return A0b.A2V();
    }

    private final ImmutableList A0M(C2k6 c2k6, CommunityMessagingCommunityType communityMessagingCommunityType) {
        List<CommunityItem> list = this.A07;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (CommunityItem communityItem : list) {
            if (communityMessagingCommunityType == null || communityItem.A03 == communityMessagingCommunityType) {
                int i = communityItem.A00 ? 2131952177 : 2131952176;
                String str = communityItem.A04;
                String A0A = 3yH.A0A(c2k6, str, i);
                AnonymousClass557 A0p = 7zL.A0p();
                final MigColorScheme migColorScheme = this.A03;
                A0p.A05(migColorScheme);
                A0p.A00 = communityItem.A02.hashCode();
                55E r0 = new 58U(migColorScheme, !communityItem.A00);
                CommunityItemIcon communityItemIcon = communityItem.A01;
                55E A00 = communityItemIcon instanceof CommunityItemUriIcon ? C5wv.A00(C0A2.A03(((CommunityItemUriIcon) communityItemIcon).A00), C2q0.A05, C2py.ROUND_RECT, migColorScheme, 0) : C58x.A00(4YV.A0I().A01(2MQ.A1a), migColorScheme.Chx(C1p7.A07), migColorScheme.Chx(C1u7.A08));
                11T.A0D(A00);
                final ImmutableList A002 = 0DW.A00(C0s8.A14(r0, A00));
                final int A03 = 7zL.A03();
                11T.A0F(migColorScheme, 0);
                A0p.A05 = new 55E(migColorScheme, A002, A03) { // from class: X.58a
                    public final int A00;
                    public final ImmutableList A01;
                    public final MigColorScheme A02;

                    {
                        this.A02 = migColorScheme;
                        this.A01 = A002;
                        this.A00 = A03;
                    }

                    public boolean BVi(55E r302) {
                        11T.A0F(r302, 0);
                        boolean z = false;
                        if (!(r302 instanceof C58a)) {
                            return false;
                        }
                        C58a c58a = (C58a) r302;
                        if (this.A00 == c58a.A00 && Objects.equal(this.A01, c58a.A01)) {
                            z = 4YV.A1Z(this.A02, c58a.A02);
                        }
                        return z;
                    }
                };
                A0p.A08(str);
                A0p.A01();
                Cvm.A00(A0p, communityItem, this, 11);
                A0p.A0A = A0A;
                AnonymousClass544 A003 = A0p.A00();
                if (A003 != null) {
                    builder.add(A003);
                }
            }
        }
        return 1Fj.A01(builder);
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        2lO A0L;
        C2sn A0L2;
        C1rs A00;
        ImmutableList A0M;
        11T.A0F(c2k5, 0);
        boolean A01 = ((C4Mu) 1Bi.A03(68133)).A01();
        2lQ r0 = 2lO.A02;
        if (A01) {
            MigColorScheme migColorScheme = this.A03;
            i = 1;
            A0L = 4YV.A0L(4YV.A0L((2lO) null, 0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1), 0S2.A1G, DDE.A00, 1);
            A0L2 = 7zR.A0L(c2k5);
            A0L2.A00(A0L());
            C2k5 c2k52 = this.A01;
            ImmutableList A0M2 = A0M(c2k52, CommunityMessagingCommunityType.A03);
            ImmutableList A0M3 = A0M(c2k52, CommunityMessagingCommunityType.A02);
            ArrayList A11 = C0s8.A11(A01(migColorScheme, 3yH.A09(A0L2, 2131954523)));
            if (1BK.A1Y(A0M2)) {
                A11.add(A01(migColorScheme, 3yH.A09(A0L2, 2131966209)));
                A11.addAll(A0M2);
            }
            if (1BK.A1Y(A0M3)) {
                A11.add(A01(migColorScheme, 3yH.A09(A0L2, 2131956670)));
                A11.addAll(A0M3);
            }
            A00 = C8m6.A00(this.A00);
            A00.A0Q();
            A00.A0e();
            A0M = 0DW.A00(A11);
        } else {
            i = 1;
            A0L = 4YV.A0L(4YV.A0L((2lO) null, 0S2.A00, 7zL.A0j(this.A03.BDl()), 1), 0S2.A1G, DDF.A00, 1);
            A0L2 = 7zR.A0L(c2k5);
            A0L2.A00(A0L());
            A00 = C8m6.A00(this.A00);
            A00.A0Q();
            A00.A0e();
            A0M = A0M(this.A01, null);
        }
        A00.A2W(A0M);
        2kW r02 = new 2kW();
        r02.A01 = i;
        r02.A07 = new 2kY().A00();
        C2ke A002 = r02.A00();
        C8m6 c8m6 = ((8OH) A00).A01;
        c8m6.A01 = A002;
        c8m6.A00 = this.A04;
        return 7zM.A0l(AbH.A0s(A00), A0L2, c2k5, A0L);
    }
}
