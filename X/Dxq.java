package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: Dxq.class */
public final class Dxq extends C1rj {
    public C2578Ghr A00;
    public GL2 A01;
    public Hnb A02;

    public Dxq() {
        super("EventsStickerOverlayComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String A0t;
        2JX Akb;
        QCm qCm;
        2JY A0B;
        2JY A0S;
        IXN ixn = this.A01;
        C2578Ghr c2578Ghr = this.A00;
        Context context = r302.A0D;
        1LI r308 = null;
        FH5 fh5 = (FH5) 1Bn.A0E(context, (1BY) null, 98751);
        IXN ixn2 = ixn;
        String str = ixn2.A01.A0E;
        GLo gLo = (GLo) ixn2.A06.get();
        2JX A0L = 1BL.A0L(c2578Ghr, 1900313591, 1291861580);
        String str2 = null;
        if (EWc.A00(gLo) != null && !1JF.A0B(str) && (A0t = c2578Ghr.A0t(GraphQLStringDefUtil.A00(), 1BJ.A00(ActionId.APP_DID_ENTER_BACKGROUND), -938524714)) != null && A0L != null) {
            Hsm Avt = ixn.Avt();
            Avt.getClass();
            int i = Avt.A02;
            Hsm Avt2 = ixn.Avt();
            Avt2.getClass();
            EiW A05 = fh5.A05(A0L, new C2630Gjf(i, Avt2.A01, 0), DKH.A03(context));
            boolean z = -1;
            int hashCode = A0t.hashCode();
            if (hashCode != 78406) {
                if (hashCode != 83500) {
                    if (hashCode == 96949885 && A0t.equals("UNSET_OR_UNRECOGNIZED_ENUM_VALUE")) {
                        z = 2;
                    }
                } else if (A0t.equals("TWO")) {
                    z = true;
                }
            } else if (A0t.equals("ONE")) {
                z = false;
            }
            if (!z) {
                QCk qCk = new QCk(r302, new QJu());
                qCk.A2J("EventsStickerOverlayComponentSpec");
                r308 = qCk.A01;
                ((QJu) r308).A03 = str;
                BitSet bitSet = qCk.A02;
                bitSet.set(3);
                ((QJu) r308).A02 = c2578Ghr;
                bitSet.set(0);
                RectF rectF = A05.A01;
                ((QJu) r308).A01 = (int) rectF.width();
                bitSet.set(2);
                ((QJu) r308).A00 = Math.max((int) rectF.height(), C0A8.A00(context, 80.0f));
                bitSet.set(1);
                7zN.A1C(qCk, r302, Dxq.class, "EventsStickerOverlayComponent");
                qCk.A0c();
                qCk.A2E(C26z.TOP, (int) rectF.top);
                qCk.A2E(C26z.START, (int) rectF.left);
                C1rs.A02(bitSet, qCk.A03);
                qCk.A0J();
            } else if (z && (Akb = c2578Ghr.Akb()) != null) {
                double doubleValue = A0L.getDoubleValue(113126854) / 0.800000011920929d;
                if (doubleValue < 0.75d) {
                    qCm = C1rg.A01(r302, null, 0);
                } else {
                    qCm = new QCm(r302, new QMw());
                    int A03 = 0De.A03(c2578Ghr.A0r(506553748), -16777216);
                    QMw qMw = qCm.A01;
                    qMw.A01 = A03;
                    BitSet bitSet2 = qCm.A02;
                    bitSet2.set(5);
                    bitSet2.set(1);
                    qMw.A04 = Akb.A0j();
                    bitSet2.set(3);
                    qMw.A05 = Akb.A0r(-1763614670);
                    bitSet2.set(4);
                    2JY A0B2 = 1BK.A0B(Akb, 2JX.class, 446812962, 1745482795);
                    if (A0B2 != null) {
                        r308 = A0B2.A0j();
                    }
                    qMw.A03 = r308;
                    bitSet2.set(2);
                    2JY A0B3 = 1BK.A0B(Akb, 2JX.class, 178851754, -516302431);
                    if (A0B3 != null && (A0B = 1BK.A0B(A0B3, 2JX.class, 106642994, 1306371006)) != null && (A0S = A0B.A0S(2JX.class, -1389918428)) != null) {
                        str2 = A0S.A0l();
                    }
                    qMw.A02 = str2;
                    bitSet2.set(0);
                    qMw.A00 = (float) doubleValue;
                }
                qCm.A2J("EventsStickerOverlayComponentSpec");
                7zN.A1C(qCm, r302, Dxq.class, "EventsStickerOverlayComponent");
                qCm.A0c();
                C26z c26z = C26z.TOP;
                RectF rectF2 = A05.A01;
                qCm.A2E(c26z, (int) rectF2.top);
                qCm.A2E(C26z.START, (int) rectF2.left);
                qCm.A0C((int) rectF2.width());
                qCm.A1L((int) rectF2.height());
                qCm.A0u((float) A05.A00);
                r308 = qCm.A2V();
            }
        }
        return r308;
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        View AyN;
        LithoView lithoView;
        ComponentTree componentTree;
        C23N c23n;
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        Dxq dxq = (Dxq) r02;
        QNH A0P = 4YU.A0P(r03);
        IXN ixn = dxq.A01;
        C2578Ghr c2578Ghr = dxq.A00;
        Hnb hnb = dxq.A02;
        C67Q c67q = A0P.A00;
        EiV eiV = (EiV) 1Bn.A0A(99755);
        C0et c0et = (C0et) 1Bi.A03(83604);
        CPc cPc = (CPc) 1Bi.A03(84955);
        String str = ixn.A01.A0E;
        2JX Akb = c2578Ghr.Akb();
        if (Akb == null || 1JF.A0B(str)) {
            return null;
        }
        String A0k = Akb.A0k();
        if (1JF.A0B(A0k)) {
            return null;
        }
        Context context = r03.A0D;
        C2137Deq A00 = R0x.A00(context, context.getResources().getString(2131956923), 2132542009);
        A00.A0H(0S2.A00);
        A00.A0T(new RoL(cPc, c0et, r03, c67q, A0k));
        ((FIU) A00).A0L = new Fe2(hnb, 2);
        A00.A0J(true);
        I3e i3e = hnb.A01.A00;
        if (i3e != null) {
            ((I4p) i3e.A01(I4p.class)).A02(EPG.A0D);
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("$");
        A0k2.append(new Object[]{"EventsStickerOverlayComponentSpec"}[0]);
        String A02 = 11T.A02(A0k2);
        C1qq c1qq = r03.A04;
        if (c1qq != null && (AyN = c1qq.A02.AyN()) != null && (AyN instanceof LithoView) && (componentTree = (lithoView = (LithoView) AyN).A00) != null && (c23n = componentTree.A07) != null) {
            if (r03.A02 != null) {
                A02 = C1ta.getKeyWithSeparator(r03.A0C(), A02);
                if (A02 == null) {
                    throw 1BK.A0e();
                }
            }
            1sP.A00();
            java.util.Map map = c23n.A0T;
            Rect rect = (Rect) map.get(A02);
            if (!map.containsKey(A02) || rect == null) {
                C53s.A01("LithoTooltipController:InvalidKey", 0S2.A01, 0Pz.A0j("Cannot find a component with key ", A02, " to use as anchor."));
            } else {
                int i2 = rect.left;
                int i3 = rect.top;
                A00.A0E(lithoView, i2, i3 - 10, rect.right - i2, rect.bottom - i3);
                A00.A07();
            }
        }
        1UG A08 = 1BK.A08(1BK.A07(eiV.A01), "stories_event_sticker_unit_tapped");
        if (!A08.isSampled()) {
            return null;
        }
        int ordinal = eiV.A00.ordinal();
        A08.A7R("surface", ordinal != 1 ? ordinal != 0 ? "unknown" : 4YT.A00(1294) : "facebook_story");
        A08.A7R(AbstractC00603o4.A00(402), "event_info_bar");
        A08.A7R("action_type", "click");
        A08.A7R(1BJ.A00(404), A0k);
        A08.A7R("story_id", str);
        A08.A7R("events_story_type", "personal");
        A08.BZL();
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNH qnh = (QNH) r303;
        Object A0E = 1Bn.A0E(r302.A0D, (1BY) null, 49963);
        if (A0E != null) {
            qnh.A00 = (C67Q) A0E;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
