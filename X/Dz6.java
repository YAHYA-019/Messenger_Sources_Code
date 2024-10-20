package X;

import android.content.res.ColorStateList;
import java.util.regex.Pattern;

/* loaded from: Dz6.class */
public final class Dz6 extends C1rj {
    public static final ColorStateList A02;
    public static final int[] A03;
    public static final int[][] A04;
    public GL7 A00;
    public FyG A01;

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], int[][]] */
    static {
        ?? r0 = {DKC.A1b(0)};
        A04 = r0;
        int[] iArr = {2132214174};
        A03 = iArr;
        A02 = new ColorStateList(r0, iArr);
    }

    public Dz6() {
        super("FBRegexValidatingFormFieldComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        DuQ duQ;
        3yF A0L;
        int i;
        QO8 A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        String str = A0P.A02;
        String str2 = A0P.A01;
        Boolean bool = A0P.A00;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        String string = gl7.getString(61);
        if (!1JF.A0B(string)) {
            3yF A0v = 7zM.A0v(r302, string, 0);
            A0v.A32(2132279337);
            A01.A2W(A0v);
        }
        7ZF A012 = 6rU.A01(r302, 0);
        A012.A2h("EDIT");
        A012.A1H(0);
        A012.A01.A0i = false;
        A012.A2a(2132279323);
        A012.A2c(A02);
        float f = 0.0f;
        if (bool.booleanValue()) {
            f = 40.0f;
        }
        A012.A0z(f);
        A012.A0M();
        DuQ A00 = Dzj.A00(r302, 0);
        A00.A01.A0P = 1LI.A04(r302, Dz6.class, "FBRegexValidatingFormFieldComponent");
        A00.A2X(2132279323);
        A00.A0R();
        boolean z = gl7.getBoolean(69, false);
        if (z) {
            A00 = Dzj.A00(r302, 0);
            A00.A01.A0P = 1LI.A04(r302, Dz6.class, "FBRegexValidatingFormFieldComponent");
            A00.A2X(2132279323);
            A00.A1s(1LI.A07(r302, Dz6.class, "FBRegexValidatingFormFieldComponent"));
            A00.A0c();
            A00.A0e();
        }
        float f2 = 0.0f / 0.0f;
        int i2 = gl7.getInt(53, -1);
        if (i2 != -1) {
            A00.A01.A0A = i2;
        }
        String string2 = gl7.getString(62);
        if (string2 != null) {
            switch (string2.hashCode()) {
                case -1034364087:
                    if (string2.equals("number")) {
                        i = 2;
                        A00.A01.A08 = i;
                        break;
                    }
                    break;
                case 96619420:
                    if (string2.equals("email")) {
                        i = 32;
                        A00.A01.A08 = i;
                        break;
                    }
                    break;
                case 106642798:
                    if (string2.equals("phone")) {
                        i = 3;
                        A00.A01.A08 = i;
                        break;
                    }
                    break;
            }
        }
        String string3 = gl7.getString(56);
        if (!1JF.A0B(string3)) {
            A00.A01.A0T = string3;
        }
        if (!1JF.A0B(str)) {
            A00.A01.A0V = str;
        }
        String string4 = gl7.getString(57);
        if (1JF.A0B(string4)) {
            if (z) {
                DuQ A0M = 7zN.A0M(r302, (String) null);
                A0M.A2d(A012);
                A0M.A2d(A00);
                A00 = A0M;
            }
            duQ = A00;
        } else {
            DuQ A013 = C1rg.A01(r302, null, 0);
            A013.A2b();
            C1rs A0v2 = 7zM.A0v(r302, string4, 0);
            A0v2.A32(2132279323);
            A013.A2e(A0v2);
            duQ = A013;
            if (z) {
                DuQ A0M2 = 7zN.A0M(r302, (String) null);
                A0M2.A2d(A012);
                A0M2.A2d(A00);
                A00 = A0M2;
            }
            A013.A2e(A00);
        }
        A01.A2W(duQ);
        if (1JF.A0B(str2)) {
            A0L = null;
        } else {
            A0L = 2KZ.A0L(r302, 0);
            A0L.A3A(str2);
            A0L.A32(2132279337);
            float f3 = 0.0f / 0.0f;
            A0L.A2x(-65536);
        }
        A01.A2W(A0L);
        return A01.A00;
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Iw r309;
        Boolean A0d;
        C2l4 A0V;
        String str;
        int i = r302.A01;
        if (i == -1336101728) {
            r309 = r302.A00.A00;
            r309.A06();
            A0d = 1BK.A0d();
            if (r309.A02 != null) {
                A0V = 7zQ.A0V(A0d, 1);
                str = "updateState:FBRegexValidatingFormFieldComponent.updateEditButtonVisibility";
                r309.A0H(A0V, str);
            }
            return A0d;
        }
        A0d = null;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 378110312) {
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            r309 = r0.A00;
            String str2 = ((C9Mz) obj).A01;
            Dz6 dz6 = (Dz6) r02;
            GL7 gl7 = dz6.A00;
            F4N.A00(DKG.A0b(gl7, dz6.A01), str2);
            String string = gl7.getString(59);
            String str3 = null;
            if (!1JF.A0B(string) && !Pattern.matches(string, str2)) {
                str3 = gl7.getString(49);
            }
            if (r309.A02 != null) {
                A0V = new C2l4(new Object[]{str2, str3}, 0);
                str = "updateState:FBRegexValidatingFormFieldComponent.updateState";
                r309.A0H(A0V, str);
            }
        }
        return A0d;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QO8 qo8 = (QO8) r303;
        GL7 gl7 = this.A00;
        String string = gl7.getString(51);
        Boolean A032 = GL7.A03(gl7, 69);
        qo8.A02 = string;
        qo8.A00 = A032;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
