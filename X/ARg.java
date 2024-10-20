package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.immersiveuicomponents.footer.plugins.inlinereplybar.textonlyinlinereplies.HTImmersiveTextOnlyInlineReplyBarImplementation;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: ARg.class */
public final class ARg extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARg(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(1);
        this.A00 = i;
        this.A07 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A03 = obj5;
        this.A05 = obj6;
        this.A06 = obj7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        8eI r312;
        switch (this.A00) {
            case 0:
                C2ln c2ln = (C2ln) obj;
                11T.A0F(c2ln, 0);
                c2ln.A01 = true;
                Object obj2 = this.A06;
                2lW r0 = (2lW) this.A07;
                Object obj3 = this.A01;
                try {
                    c2ln.A00 = 0DY.A0K("recycler-decorations", 127);
                    c2ln.A02(83Q.A01(obj3, r0, 14), new Object[]{r0.A0G, obj3});
                    c2ln.A00 = null;
                    C2lh c2lh = (C2lh) this.A02;
                    try {
                        c2ln.A00 = 0DY.A0K("recycler-equivalent-mount", 127);
                        Object obj4 = c2lh.A02;
                        Boolean valueOf = Boolean.valueOf(r0.A0H);
                        Boolean valueOf2 = Boolean.valueOf(r0.A0K);
                        Integer valueOf3 = Integer.valueOf(r0.A02);
                        Integer valueOf4 = Integer.valueOf(r0.A07);
                        Integer valueOf5 = Integer.valueOf(r0.A06);
                        Integer valueOf6 = Integer.valueOf(r0.A00);
                        Boolean valueOf7 = Boolean.valueOf(r0.A0J);
                        Boolean valueOf8 = Boolean.valueOf(r0.A0L);
                        Boolean valueOf9 = Boolean.valueOf(r0.A0R);
                        Integer valueOf10 = Integer.valueOf(r0.A01);
                        Integer num = r0.A0F;
                        Integer valueOf11 = Integer.valueOf(r0.A05);
                        2NI r02 = r0.A09;
                        c2ln.A02(83Q.A01(obj2, r0, 15), new Object[]{obj4, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, 0, valueOf8, valueOf9, valueOf10, num, valueOf11, r02 != null ? r02.getClass() : null});
                        c2ln.A00 = null;
                        try {
                            c2ln.A00 = 0DY.A0K("recycler-binder", 127);
                            c2ln.A02(new AVM(r0, 28), new Object[]{r0.A0C});
                            c2ln.A00 = null;
                            Object obj5 = this.A03;
                            Object obj6 = this.A04;
                            Object obj7 = this.A05;
                            try {
                                c2ln.A00 = 0DY.A0K("recycler-equivalent-bind", 127);
                                c2ln.A02(new AVZ(2, obj6, obj7, obj5, r0), new Object[]{new Object()});
                                return 04S.A00;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            case 1:
                HTImmersiveTextOnlyInlineReplyBarImplementation hTImmersiveTextOnlyInlineReplyBarImplementation = (HTImmersiveTextOnlyInlineReplyBarImplementation) this.A07;
                String str = HTImmersiveTextOnlyInlineReplyBarImplementation.A01;
                HighlightsFeedContent highlightsFeedContent = hTImmersiveTextOnlyInlineReplyBarImplementation.A00;
                Long l = highlightsFeedContent.A0M;
                if (l != null) {
                    C2k5 c2k5 = (C2k5) this.A06;
                    FbUserSession fbUserSession = (FbUserSession) this.A01;
                    Object obj8 = this.A05;
                    Object obj9 = this.A03;
                    Object obj10 = this.A04;
                    Object obj11 = this.A02;
                    long longValue = l.longValue();
                    C9iN.A02(C98S.A0K, c2k5);
                    9gM.A09.A01(3vP.A00(c2k5), fbUserSession, highlightsFeedContent.A0E, new ARW(7, obj10, obj11, obj9, obj8, hTImmersiveTextOnlyInlineReplyBarImplementation), longValue);
                }
                return 04S.A00;
            case 2:
                8Lr r03 = (8Lr) this.A07;
                if (r03.A01) {
                    7zL.A1R(r03.A00);
                    9eQ.A00((Context) this.A01, (FbUserSession) this.A02, (Aaj) this.A03, (2Qz) this.A05, (HighlightsFeedContent) this.A04, (AaX) this.A06, 9eQ.A00, false);
                }
                return 04S.A00;
            case 3:
                Aaj aaj = (Aaj) this.A03;
                Context context = (Context) this.A01;
                HighlightsFeedContent highlightsFeedContent2 = (HighlightsFeedContent) this.A04;
                aaj.C7g(context, highlightsFeedContent2, new A8u(context, (FbUserSession) this.A02, (8Lr) this.A07, aaj, (2Qz) this.A05, highlightsFeedContent2, (AaX) this.A06));
                return AnonymousClass001.A0K();
            default:
                C2sn c2sn = (C2sn) obj;
                11T.A0F(c2sn, 0);
                C99g c99g = (C99g) this.A04;
                if (11T.A0O(c99g, C91Y.A00)) {
                    8iC r04 = (8iC) this.A07;
                    C9mD c9mD = (C9mD) this.A06;
                    9lK r05 = (9lK) this.A02;
                    8Sm A00 = C8nz.A00(c2sn.AeS());
                    int A002 = r04.A06.A00(0S2.A0d);
                    C8nz c8nz = A00.A01;
                    c8nz.A00 = A002;
                    A00.A2X(2131953134);
                    c8nz.A04 = true;
                    c8nz.A03 = new AGX(r05, c9mD, r04);
                    c2sn.A00(A00.A2W());
                    r05.A01(8HZ.A00);
                } else {
                    if (11T.A0O(c99g, C91Z.A00)) {
                        r312 = 8iC.A0L(c2sn);
                    } else if (11T.A0O(c99g, C91a.A00)) {
                        ((9lK) this.A02).A01(8Hb.A00);
                        1Iw r06 = c2sn.A00;
                        Dzg dzg = new Dzg();
                        C1rs c1rs = new C1rs(dzg, r06, 0, 0);
                        ((8OB) c1rs).A01 = dzg;
                        ((8OB) c1rs).A00 = r06;
                        c1rs.A0J();
                        r312 = ((8OB) c1rs).A01;
                    } else if (c99g instanceof C91X) {
                        C91X c91x = (C91X) c99g;
                        final List list = c91x.A01;
                        if (1BK.A1Y(list)) {
                            ((9lK) this.A02).A01(8Hc.A00);
                        }
                        8iC r07 = (8iC) this.A07;
                        int ordinal = r07.A07.ordinal();
                        if (ordinal == 0) {
                            r312 = new 8eI(r07.A00, r07.A01, (I5X) this.A01, r07.A05, c91x, (C9mD) this.A06, r07.A06, r07.A08, r07.A09, r07.A0B, r07.A0C);
                        } else {
                            if (ordinal != 1) {
                                throw 1BK.A1F();
                            }
                            final C9mD c9mD2 = (C9mD) this.A06;
                            final I5K i5k = (I5K) this.A03;
                            final ThreadKey threadKey = r07.A05;
                            final String str2 = c9mD2.A01;
                            final 2Of r08 = r07.A08;
                            final 6wX r09 = r07.A09;
                            final AnonymousClass959 anonymousClass959 = r07.A04;
                            final boolean z = r07.A0D;
                            r312 = new 1LH(i5k, anonymousClass959, threadKey, c9mD2, r08, r09, str2, list, z) { // from class: X.8dv
                                public final I5K A00;
                                public final AnonymousClass959 A01;
                                public final ThreadKey A02;
                                public final C9mD A03;
                                public final 2Of A04;
                                public final 6wX A05;
                                public final String A06;
                                public final List A07;
                                public final boolean A08;

                                {
                                    7zT.A1U(i5k, threadKey, str2);
                                    11T.A0F(r08, 6);
                                    this.A03 = c9mD2;
                                    this.A00 = i5k;
                                    this.A02 = threadKey;
                                    this.A06 = str2;
                                    this.A07 = list;
                                    this.A04 = r08;
                                    this.A05 = r09;
                                    this.A01 = anonymousClass959;
                                    this.A08 = z;
                                }

                                public 1LI A0s(C2k5 c2k52) {
                                    11T.A0F(c2k52, 0);
                                    List list2 = this.A07;
                                    if (list2.isEmpty()) {
                                        return null;
                                    }
                                    int i = 0;
                                    boolean AZk = 7G3.A00((7G3) 2rO.A00(c2k52, AOz.A00, new Object[0])).AZk(36318479678714529L);
                                    2lQ r010 = 2lO.A02;
                                    2lO A0e = 7zT.A0e((2lO) null, c2k52, 2132279433);
                                    Boolean valueOf12 = Boolean.valueOf(this.A08);
                                    long A08 = 7zP.A08();
                                    2NI r011 = C8nc.A0O;
                                    1Iw r012 = c2k52.A05;
                                    C02A c02a = r012.A03.A01;
                                    C1J8 c1j8 = c02a.A02;
                                    boolean z2 = c02a.A0X;
                                    C9sn A003 = C9sn.A00(r012);
                                    for (Object obj12 : list2) {
                                        int i2 = i + 1;
                                        if (i < 0) {
                                            C0s8.A18();
                                            throw 0Q8.createAndThrow();
                                        }
                                        8K7 r013 = (8K7) obj12;
                                        AU8 au8 = AU8.A00;
                                        AU9 au9 = AU9.A00;
                                        AVT avt = new AVT(r013, this, i, AZk);
                                        A003.A01.A01(au8.invoke(r013), new 85O(19, new C9sl(A003.A00), avt, r013), (Object[]) au9.invoke(r013), -1.0f, false);
                                        i = i2;
                                    }
                                    return new C8ej(r011, null, null, A0e, null, C9mj.A01(r012, c1j8, 7zN.A03(c2k52, A08), z2), A003.A01, null, null, null, null, null, null, null, null, null, valueOf12, null, null, null, null, null, null, true);
                                }
                            };
                        }
                    }
                    c2sn.A00(r312);
                }
                return 04S.A00;
        }
    }
}
