package X;

import android.content.Context;
import android.text.InputFilter;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ayq, reason: case insensitive filesystem */
/* loaded from: Ayq.class */
public final class C1997Ayq extends C1rj {
    public int A00;
    public Bg4 A01;
    public DI6 A02;
    public 9Ae A03;
    public MigColorScheme A04;
    public ImmutableList A05;
    public CharSequence A06;
    public CharSequence A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public C1997Ayq() {
        super("OmnipickerNameYourChatComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, Integer.valueOf(this.A00), this.A06, this.A02, this.A07, this.A08, Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A), 1BK.A0d(), this.A01, this.A05, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList build;
        List list;
        ImmutableList immutableList = this.A05;
        DI6 di6 = this.A02;
        9Ae r0 = this.A03;
        String str = this.A08;
        boolean z = this.A09;
        CharSequence charSequence = this.A07;
        CharSequence charSequence2 = this.A06;
        MigColorScheme migColorScheme = this.A04;
        int i = this.A00;
        boolean z2 = this.A0A;
        FbUserSession A00 = C54z.A00(r302);
        Context context = r302.A0D;
        CPN cpn = (CPN) 1Bn.A0E(context, (1BY) null, 83451);
        C1302Adf c1302Adf = (C1302Adf) 1Bn.A0A(68462);
        7zL.A1K(r302);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        7zM.A1O(A01, migColorScheme);
        A01.A2N(true);
        C1909Awa A002 = B0r.A00(r302);
        A002.A2Y(di6);
        A002.A2c(z);
        A002.A2b(charSequence);
        A002.A2a(charSequence2);
        A002.A2Z(migColorScheme);
        A002.A2d(false);
        A002.A2X();
        A002.A01.A05 = "omnipicker_end_flow";
        A01.A2e(A002.A2V());
        2KD A0Y = 7zN.A0Y(r302, false);
        7zP.A1K(A0Y, 2131962453);
        A0Y.A2x(migColorScheme);
        A0Y.A0L();
        A0Y.A2N(true);
        A0Y.A2X();
        2RH r02 = 2RH.A06;
        4YU.A1N(A0Y, r02);
        C26z c26z = C26z.HORIZONTAL;
        2RH r03 = 2RH.A03;
        7zO.A1M(A0Y, r03, c26z);
        A0Y.A2q(1);
        4YU.A1K(A01, A0Y);
        8T9 r04 = new 8T9(r302, new C8n9());
        C8n9 c8n9 = r04.A01;
        c8n9.A09 = str;
        int i2 = 2131962469;
        if (z2) {
            i2 = 2131962475;
        }
        c8n9.A08 = 7zL.A12(r04, i2);
        c8n9.A0C = true;
        r04.A2Y(migColorScheme);
        c8n9.A02 = 1;
        c8n9.A0E = true;
        r04.A2X(r0);
        4YU.A1O(r04, 2RH.A09, c26z);
        4YU.A1N(r04, r02);
        4YU.A1M(r04, 2RH.A07);
        7zO.A1M(r04, r03, c26z);
        r04.A2K("omnipicker_name_your_new_chat_input_box");
        List asList = i > 0 ? Arrays.asList(new InputFilter.LengthFilter(i)) : Collections.emptyList();
        if (asList != null) {
            List list2 = c8n9.A0A;
            if (list2 == null || list2.isEmpty() || (list = c8n9.A0A) == C8n9.A0I) {
                c8n9.A0A = asList;
            } else {
                list.addAll(asList);
            }
        }
        A01.A2e(r04.A2W());
        8A3 A003 = 8A4.A00(r302);
        A003.A2X(migColorScheme);
        4YU.A1M(A003, r02);
        4YU.A1O(A003, r03, c26z);
        A01.A2e(A003.A2W());
        C2ki A004 = C2kV.A00(r302);
        A004.A2j(true);
        C8q8 c8q8 = new C8q8();
        if (09K.A01(immutableList)) {
            build = ImmutableList.of();
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            c1302Adf.A04 = migColorScheme;
            c1302Adf.A07 = 4YU.A0u(context.getResources(), 1BK.A0k(immutableList), 2131962471);
            builder.m11011add((Object) c1302Adf.A02());
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                User A0t = AbG.A0t(it);
                1BK.A1J(A0t, 0, A00);
                55A A005 = 5OL.A00(7zL.A13(A0t));
                if (A005 == null) {
                    0fH.A18("OmnipickerViewModelFactory", "Unexpected user displayName is empty, user id: %s", new Object[]{A0t.A13});
                } else {
                    AnonymousClass557 A0V = 7zU.A0V(migColorScheme);
                    A0V.A00 = 1BL.A05(A0t.A13) + 31;
                    A0V.A03(A005);
                    boolean z3 = CPN.A0A;
                    C2fr A0R = ((2fZ) 4YU.A0o(A00, cpn.A00, 17067)).A0R(A0t, CPN.A01(A00, cpn, A0t));
                    C2q1 c2q1 = C2q0.A05;
                    LightColorScheme.A00();
                    A0V.A05 = 55C.A01(c2q1, C2py.CIRCULAR, migColorScheme, A0R, 0, true);
                    A0V.A04 = CPN.A00(context, A00, cpn, A0t, (String) null, false, false, false, false, false);
                    AnonymousClass544 A006 = A0V.A00();
                    if (A006 != null) {
                        builder.m11011add((Object) A006);
                    }
                }
            }
            build = builder.build();
        }
        if (build != null) {
            AbL.A0j(c8q8).add(build);
        }
        A004.A2d(c8q8);
        A004.A0R();
        return 7zL.A0U(A01, A004);
    }
}
