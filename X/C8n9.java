package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.inputmethod.EditorInfo;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8n9, reason: invalid class name */
/* loaded from: 8n9.class */
public final class C8n9 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public C2ko A03;
    public C2ko A04;
    public C2ko A05;
    public 9Ae A06;
    public MigColorScheme A07;
    public CharSequence A08;
    public CharSequence A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public static final CharSequence A0G = "";
    public static final CharSequence A0F = "";
    public static final List A0I = Collections.emptyList();
    public static final List A0H = Collections.emptyList();

    public C8n9() {
        super("MigLegacyTextInput");
        this.A08 = "";
        this.A00 = 0;
        this.A09 = "";
        this.A0A = A0I;
        this.A01 = 1;
        this.A0C = true;
        this.A02 = (-1) >>> 1;
        this.A0D = false;
        this.A0B = A0H;
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, this.A08, Integer.valueOf(this.A00), this.A09, this.A0A, Integer.valueOf(this.A01), Boolean.valueOf(this.A0C), this.A06, Integer.valueOf(this.A02), Boolean.valueOf(this.A0D), this.A0B, Boolean.valueOf(this.A0E)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Drawable A00;
        MigColorScheme migColorScheme = this.A07;
        CharSequence charSequence = this.A09;
        CharSequence charSequence2 = this.A08;
        boolean z = this.A0C;
        boolean z2 = this.A0D;
        int i = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        List list = this.A0A;
        boolean z3 = this.A0E;
        List list2 = this.A0B;
        7ZF A01 = 6rU.A01(r302, 0);
        A01.A2J("MigLegacyTextInput");
        A01.A2h(charSequence);
        A01.A01.A0i = z;
        A01.A2U(z);
        A01.A2g(charSequence2);
        A01.A01.A02 = i2;
        A01.A2Y(i3);
        if (z3) {
            A00 = 7zL.A0D(0);
        } else {
            int[] iArr = {R.attr.background};
            Context context = r302.A0D;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.editTextStyle, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            A00 = C1uu.A00(context.getResources(), drawable, z ? migColorScheme.B4h() : migColorScheme.AqM());
        }
        A01.A01.A0C = A00;
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(R.attr.state_enabled, migColorScheme.B36());
        sparseIntArray.put(-16842910, migColorScheme.Ahv());
        A01.A2b(C6pe.A00(sparseIntArray));
        A01.A2X(2KV.A07.textSizeSp);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(R.attr.state_enabled, migColorScheme.B4i());
        sparseIntArray2.put(-16842910, migColorScheme.Ahv());
        A01.A2c(C6pe.A00(sparseIntArray2));
        A01.A2k(z2);
        A01.A2Z(i);
        A01.A2f(1LI.A04(r302, C8n9.class, "MigLegacyTextInput"));
        A01.A01.A0H = 1LI.A09(r302, C8n9.class, "MigLegacyTextInput", 1243517496);
        A01.A01.A0I = 1LI.A09(r302, C8n9.class, "MigLegacyTextInput", 744738225);
        A01.A2i(list);
        A01.A2j(list2);
        7ZF.A06(A01);
        A01.A0J();
        return A01.A01;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        Object valueOf;
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 378110312:
                C9Mz c9Mz = (C9Mz) obj;
                ((C8n9) r302.A00.A01).A06.A00(c9Mz.A00, c9Mz.A01);
                return null;
            case 744738225:
                C6re c6re = (C6re) obj;
                1Is r0 = r302.A00.A01;
                valueOf = c6re.A01;
                EditorInfo editorInfo = c6re.A00;
                if (((C8n9) r0).A06 instanceof 8xS) {
                    editorInfo.imeOptions &= -1073741825;
                    return valueOf;
                }
                break;
            case 1243517496:
                9QK r02 = (9QK) obj;
                valueOf = Boolean.valueOf(((C8n9) r302.A00.A01).A06.A01(r02.A00, r02.A01));
                break;
            default:
                return null;
        }
        return valueOf;
    }

    /* JADX WARN: Type inference failed for: r310v2, types: [java.lang.Object, X.6rc] */
    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        C2ko A0E;
        Object obj2;
        C2ko A0E2;
        int i = c2ko.A02;
        Object obj3 = null;
        if (i == -2123984858) {
            A0E = 1LI.A0E(c2ko.A00, "MigLegacyTextInput", 1008096338);
            if (A0E != null) {
                obj2 = new Object();
                7zO.A1P(A0E, obj2);
                return null;
            }
            return obj3;
        }
        if (i == -1866257038) {
            1Iw r0 = c2ko.A00;
            CharSequence charSequence = ((C6rc) obj).A00;
            A0E = 1LI.A0E(r0, "MigLegacyTextInput", 2092727750);
            if (A0E != null) {
                ?? obj4 = new Object();
                obj4.A00 = charSequence;
                obj2 = obj4;
                7zO.A1P(A0E, obj2);
                return null;
            }
        } else if (i == -94520834 && (A0E2 = 1LI.A0E(c2ko.A00, "MigLegacyTextInput", -430503342)) != null) {
            obj3 = 7zS.A0z(A0E2);
        }
        return obj3;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A03, this, r303);
        7zQ.A1H(r302, this.A05, this, r303);
        7zQ.A1H(r302, this.A04, this, r303);
    }
}
