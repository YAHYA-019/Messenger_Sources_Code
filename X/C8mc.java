package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.enums.GraphQLMessengerCallToActionType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.rtc.interfaces.RtcCallVideoOptions;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.8mc, reason: invalid class name */
/* loaded from: 8mc.class */
public final class C8mc extends C1rj {
    public static final C06974ih A05;
    public 2JX A00;
    public 6Az A01;
    public ThreadKey A02;
    public C1Q A03;
    public MigColorScheme A04;

    static {
        C07004ik A00 = C06984ii.A00();
        InterfaceC07034in interfaceC07034in = InterfaceC07034in.A07;
        A00.A00(interfaceC07034in);
        A00.A03 = 2131230775;
        A00.A0E = interfaceC07034in;
        A00.A0I = null;
        A00.A0B = null;
        A05 = 7zL.A0L(A00);
    }

    public C8mc() {
        super("SpeakeasyXMAComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A03, this.A00, this.A01, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2KD r312;
        int ordinal;
        QDS qds;
        C10334t7 A0w;
        String uri;
        MigColorScheme migColorScheme = this.A04;
        2JY r0 = this.A01;
        2JX r02 = this.A00;
        ThreadKey threadKey = this.A02;
        C1Q c1q = this.A03;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        5BG r315 = null;
        7zN.A1C(A01, r302, C8mc.class, "SpeakeasyXMAComponent");
        C7Zr Avv = r0.Avv();
        if (Avv != null && (A0w = Avv.A0w()) != null && (uri = A0w.getUri()) != null) {
            Uri uri2 = 0CO.A00;
            Uri parse = Uri.parse(uri);
            C06974ih c06974ih = A05;
            if (1iQ.A00()) {
                5BH A0B = 7zN.A0B(parse, r302);
                A0B.A2W(1.7778f);
                A0B.A2Z(c06974ih);
                r315 = 7zO.A0P(A0B, CallerContext.A0B("SpeakeasyXMAComponentSpecSpec"));
            } else {
                C5bd A00 = C5bc.A00(r302);
                A00.A2W(parse);
                C5bc c5bc = A00.A00;
                c5bc.A00 = 1.7778f;
                c5bc.A04 = c06974ih;
                A00.A2X(CallerContext.A0B("SpeakeasyXMAComponentSpecSpec"));
                A00.A0J();
                r315 = A00.A00;
            }
        }
        A01.A2e(r315);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        A012.A1D(7zL.A02());
        2JY r03 = r0;
        2JY A0B2 = 1BK.A0B(r03, 2JX.class, 281035123, 229578494);
        1LI r303 = null;
        String A0i = A0B2 != null ? A0B2.A0i() : null;
        String A0r = r03.A0r(-2060497896);
        if (A0i != null || A0r != null) {
            2cM A013 = 2cK.A01(r302, (String) null, 0);
            if (A0i != null) {
                r312 = 2K3.A00(r302);
                r312.A2z(A0i);
                7zN.A1Y(r312);
                r312.A2x(migColorScheme);
                7zU.A1V(r312);
            } else {
                r312 = null;
            }
            A013.A2d(r312);
            if (A0r != null) {
                r303 = 7zN.A0Y(r302, false);
                7zQ.A1S(r303, A0r);
                r303.A2x(migColorScheme);
            }
            r303 = 7zL.A0U(A013, r303);
        }
        A012.A2e(r303);
        ImmutableList A0c = r03.A0c(-1685376370, AcH.class, 423528630);
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        4YU.A1N(A014, 2RH.A07);
        1Du it = A0c.iterator();
        while (it.hasNext()) {
            AcH acH = (AcH) it.next();
            GraphQLMessengerCallToActionType graphQLMessengerCallToActionType = GraphQLMessengerCallToActionType.A03;
            GraphQLMessengerCallToActionType graphQLMessengerCallToActionType2 = (GraphQLMessengerCallToActionType) acH.A0g(graphQLMessengerCallToActionType, -1206637242);
            if (graphQLMessengerCallToActionType2 != null && !TextUtils.isEmpty(acH.A0r(1851392783)) && ((ordinal = graphQLMessengerCallToActionType2.ordinal()) == 58 || ordinal == 43 || ordinal == 52 || ordinal == 53 || ordinal == 57)) {
                GraphQLMessengerCallToActionType graphQLMessengerCallToActionType3 = (GraphQLMessengerCallToActionType) acH.A0g(graphQLMessengerCallToActionType, -1206637242);
                if (graphQLMessengerCallToActionType3 == null) {
                    qds = null;
                } else {
                    qds = new QDS(r302, new QK6());
                    4YU.A1N(qds, 2RH.A05);
                    QK6 qk6 = qds.A01;
                    qk6.A05 = migColorScheme;
                    BitSet bitSet = qds.A02;
                    bitSet.set(1);
                    qk6.A00 = graphQLMessengerCallToActionType3;
                    bitSet.set(0);
                    qk6.A02 = acH;
                    bitSet.set(2);
                    qk6.A01 = r02;
                    bitSet.set(4);
                    qk6.A03 = threadKey;
                    bitSet.set(5);
                    qk6.A04 = c1q;
                    bitSet.set(3);
                }
                A014.A2d(qds);
            }
        }
        7zL.A1G(A014, A012);
        return 7zL.A0U(A01, A012);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        C8mc c8mc = (C8mc) r02;
        2JX r04 = c8mc.A00;
        C1Q c1q = c8mc.A03;
        Context context = r03.A0D;
        String A0r = r04.A0r(1194530730);
        r04.A0r(3355);
        c1q.A00(context, new RtcCallVideoOptions(true, false), A0r, C8vm.A00(r04));
        return null;
    }
}
