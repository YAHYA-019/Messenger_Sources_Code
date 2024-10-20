package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.enums.GraphQLInstantGameContextType;
import com.facebook.graphql.enums.GraphQLMessenerThreadGamePlayStyle;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicksilver.QuicksilverActivity;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: Dyn.class */
public final class Dyn extends C1rj {
    public static final CallerContext A04 = CallerContext.A0B("GamesDiscoveryAppGridItemComponentSpec");
    public int A00;
    public 2JX A01;
    public String A02;
    public boolean A03;

    public Dyn() {
        super("GamesDiscoveryAppGridItemComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, Integer.valueOf(this.A00), Boolean.valueOf(this.A03), this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String A0k;
        String A0j;
        int intValue;
        StringBuilder A0k2;
        String obj;
        2JX A0L;
        int intValue2;
        Integer valueOf;
        2JX A0L2;
        String A0l;
        2JX A0L3;
        2JX r0 = this.A01;
        int i = this.A00;
        boolean z = this.A03;
        11T.A0F(r302, 0);
        Boolean bool = null;
        if (r0 == null || (A0k = r0.A0k()) == null || (A0j = r0.A0j()) == null || A0j.length() == 0) {
            return null;
        }
        2JX A0L4 = 1BL.A0L(r0, -1058180099, -578128824);
        if (A0L4 != null && (A0L3 = 1BL.A0L(A0L4, -646877047, 540863623)) != null) {
            bool = AbH.A0y(A0L3, 270940796);
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1m(1LI.A0C(r302, Dyn.class, "GamesDiscoveryAppGridItemComponent", AnonymousClass001.A1b(A0k, i), 812306625));
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        5BG r317 = null;
        7zN.A1D(A012, r302, Dyn.class, "GamesDiscoveryAppGridItemComponent", -1755229903);
        C1ro c1ro = C1ro.CENTER;
        A012.A2g(c1ro);
        if (A0L4 != null) {
            String A0r = A0L4.A0r(-737588058);
            if (A0r != null) {
                Context A0A = 7zL.A0A(r302);
                float A00 = C0A8.A00(A0A, 12.0f);
                C07004ik A002 = C06984ii.A00();
                A002.A00(InterfaceC07034in.A01);
                7zM.A1K(A002, A00);
                if (1BL.A0Q().AZk(36323814027906293L)) {
                    A002.A06(new C5bb(A00, 7zR.A0c(A0A).AYw()));
                }
                5BH A013 = 5BG.A01(r302);
                C06984ii.A01(A013, A002);
                A013.A2S(A0A.getResources().getString(2131955862));
                2JY A0B = 1BK.A0B(A0L4, 2JX.class, 961256200, -1175225773);
                if (A0B != null && (A0l = A0B.A0l()) != null) {
                    A0r = A0l;
                }
                Uri uri = null;
                try {
                    uri = C0A2.A03(A0r);
                } catch (SecurityException unused) {
                }
                A013.A2X(uri);
                A013.A2b(A04);
                A013.A2W(0.66871166f);
                A013.A0J();
                r317 = A013.A00;
            }
        }
        A012.A2e(r317);
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r302, 16979);
        C1rh c1rh = null;
        Integer A13 = (A0L4 == null || (A0L2 = 1BL.A0L(A0L4, -646877047, 540863623)) == null) ? null : DKG.A13(A0L2, -1140089659);
        if (z && A13 != null && (intValue = A13.intValue()) >= 2) {
            if (A0L4 == null || (A0L = 1BL.A0L(A0L4, -646877047, 540863623)) == null || (valueOf = Integer.valueOf((intValue2 = A0L.getIntValue(-462657065)))) == null || intValue2 < intValue || intValue2 >= 999) {
                A0k2 = AnonymousClass001.A0k();
                A0k2.append(A13);
                A0k2.append('+');
            } else if (valueOf == A13) {
                obj = String.valueOf(A13);
                C5be A003 = 8AV.A00();
                A003.setShape(0);
                A003.setCornerRadius(r302.A0E.A02(18.0f));
                A003.setColor(-16777216);
                Drawable A07 = 4YV.A0I().A07(C1u3.A3Y);
                C1rq A014 = C1rg.A01(r302, null, 0);
                C1rq A015 = C1rg.A01(r302, null, 0);
                A015.A0e();
                C1rq A016 = C1rg.A01(r302, null, 0);
                A016.A0D(A003);
                A016.A24(C26z.ALL, 5.0f);
                C1rq A017 = C1rg.A01(r302, null, 0);
                A017.A0D(A07);
                A017.A0z(14.0f);
                A017.A0l(14.0f);
                A017.A11(5.0f);
                C26z c26z = C26z.RIGHT;
                A017.A24(c26z, 3.0f);
                A017.A12(3.0f);
                A016.A2f(A017.A00);
                C1rq A018 = C1rg.A01(r302, null, 0);
                2KD A019 = 2K3.A01(r302, 0);
                A019.A2z(obj);
                A019.A2j();
                A019.A2e();
                A019.A2x(migColorScheme);
                7zN.A1T(A018, A019);
                A018.A25(c26z, 5.0f);
                A018.A1F(-1.0f);
                A016.A2f(A018.A00);
                A016.A2h(c1ro);
                A015.A2f(A016.A00);
                A015.A2i(C1rp.FLEX_END);
                A014.A2f(A015.A00);
                A014.A0c();
                c1rh = A014.A00;
            } else {
                A0k2 = AnonymousClass001.A0k();
                A0k2.append(A13);
                A0k2.append('-');
                A0k2.append(valueOf);
            }
            obj = A0k2.toString();
            C5be A0032 = 8AV.A00();
            A0032.setShape(0);
            A0032.setCornerRadius(r302.A0E.A02(18.0f));
            A0032.setColor(-16777216);
            Drawable A072 = 4YV.A0I().A07(C1u3.A3Y);
            C1rq A0142 = C1rg.A01(r302, null, 0);
            C1rq A0152 = C1rg.A01(r302, null, 0);
            A0152.A0e();
            C1rq A0162 = C1rg.A01(r302, null, 0);
            A0162.A0D(A0032);
            A0162.A24(C26z.ALL, 5.0f);
            C1rq A0172 = C1rg.A01(r302, null, 0);
            A0172.A0D(A072);
            A0172.A0z(14.0f);
            A0172.A0l(14.0f);
            A0172.A11(5.0f);
            C26z c26z2 = C26z.RIGHT;
            A0172.A24(c26z2, 3.0f);
            A0172.A12(3.0f);
            A0162.A2f(A0172.A00);
            C1rq A0182 = C1rg.A01(r302, null, 0);
            2KD A0192 = 2K3.A01(r302, 0);
            A0192.A2z(obj);
            A0192.A2j();
            A0192.A2e();
            A0192.A2x(migColorScheme);
            7zN.A1T(A0182, A0192);
            A0182.A25(c26z2, 5.0f);
            A0182.A1F(-1.0f);
            A0162.A2f(A0182.A00);
            A0162.A2h(c1ro);
            A0152.A2f(A0162.A00);
            A0152.A2i(C1rp.FLEX_END);
            A0142.A2f(A0152.A00);
            A0142.A0c();
            c1rh = A0142.A00;
        }
        A012.A2e(c1rh);
        C6nh c6nh = new C6nh(r302);
        c6nh.A02(12.0f);
        c6nh.A07(C26z.ALL, 0.0f);
        A012.A1h(c6nh.A01());
        float f = 1.0f;
        if (1BK.A1X(bool, true)) {
            f = 0.5f;
        }
        A012.A0B(f);
        7zL.A1G(A012, A01);
        A01.A1C(4.0f);
        A01.A1A(8.0f);
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        2JX A0L;
        Enum A0g;
        2JX A0L2;
        int i = r302.A01;
        if (i != -1755229903) {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != 812306625) {
                return null;
            }
            1Is r0 = r302.A00.A01;
            int A08 = 7zO.A08(r302.A03, 1);
            2JX r02 = ((Dyn) r0).A01;
            ((Evw) 1Bn.A0A(67890)).A01(0S2.A00, 0S2.A01, Integer.valueOf(A08), r02 != null ? r02.A0k() : null);
            return null;
        }
        1Iv r03 = r302.A00;
        1Is r04 = r03.A01;
        1Iw r05 = r03.A00;
        Dyn dyn = (Dyn) r04;
        2JX r06 = dyn.A01;
        int i2 = dyn.A00;
        String str = dyn.A02;
        AbK.A1S(r05, str);
        if (r06 == null) {
            return null;
        }
        2JX A0L3 = 1BL.A0L(r06, -1058180099, -578128824);
        if (A0L3 != null && (A0L2 = 1BL.A0L(A0L3, -646877047, 540863623)) != null && A0L2.getBooleanValue(270940796)) {
            return null;
        }
        Evw evw = (Evw) 1Bn.A0A(67890);
        Integer num = 0S2.A00;
        String A0k = r06.A0k();
        evw.A01(num, num, Integer.valueOf(i2), A0k);
        Context context = r05.A0D;
        Intent A0D = C3o5.A0D(context, QuicksilverActivity.class);
        A0D.putExtra("environment_type", "MESSENGER_DISCOVERY");
        A0D.putExtra("app_id", A0k);
        A0D.putExtra("source_id", str);
        A0D.putExtra("source_context", GraphQLInstantGameContextType.THREAD);
        A0D.putExtra(Property.SYMBOL_Z_ORDER_SOURCE, "messenger~chat_thread~composer");
        if (A0L3 != null && (A0L = 1BL.A0L(A0L3, -646877047, 540863623)) != null && (A0g = A0L.A0g(GraphQLMessenerThreadGamePlayStyle.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -1877500571)) != null) {
            A0D.putExtra("play_style", String.valueOf(A0g));
        }
        DKE.A1C(context, A0D);
        return null;
    }
}
