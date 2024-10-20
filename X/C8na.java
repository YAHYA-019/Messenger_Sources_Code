package X;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.8na, reason: invalid class name */
/* loaded from: 8na.class */
public final class C8na extends C1rj {
    public static final InputFilter A09 = new InputFilter.LengthFilter(ActionId.MESSENGER_THREAD_LIST_LOADED);
    public int A00;
    public C2ko A01;
    public AaY A02;
    public MigColorScheme A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public C8na() {
        super("PollListItemTextInput");
        this.A00 = -1;
        this.A06 = false;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A04, Integer.valueOf(this.A00), this.A05, Boolean.valueOf(this.A06), Boolean.valueOf(this.A07), this.A02, Boolean.valueOf(this.A08)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cm A00;
        C8ou c8ou = (C8ou) 4YU.A0P(r302);
        String str = this.A05;
        String str2 = this.A04;
        MigColorScheme migColorScheme = this.A03;
        AaY aaY = this.A02;
        boolean z = this.A08;
        boolean z2 = this.A07;
        int i = this.A00;
        String A0C = r302.A0C();
        C2iw A0D = 7zT.A0D(r302, new 9aL(A0C), A0C);
        boolean z3 = c8ou.A00;
        C1u2 A0I = 4YV.A0I();
        61N r0 = (61N) 1Bn.A0A(68020);
        Object A03 = 1Bi.A03(50171);
        if (61N.A00(r0).AZk(36311135285807520L)) {
            QF9 qf9 = new QF9(r302, new 8nZ());
            8nZ r02 = qf9.A01;
            r02.A03 = migColorScheme;
            BitSet bitSet = qf9.A02;
            bitSet.set(0);
            r02.A04 = str2;
            bitSet.set(1);
            r02.A05 = str;
            bitSet.set(2);
            r02.A02 = aaY;
            bitSet.set(3);
            r02.A07 = z;
            r02.A06 = z2;
            r02.A00 = i;
            qf9.A1w(A0D);
            return qf9.A2W();
        }
        C1rq A0P = 7zN.A0P(r302, 0);
        C1rq c1rq = new 8T9(r302, new C8n9());
        C1rq c1rq2 = c1rq;
        c1rq.A2J("PollListItemTextInput");
        if (str == null) {
            str = "";
        }
        C8n9 c8n9 = ((8T9) c1rq).A01;
        c8n9.A09 = str;
        c8n9.A08 = str2;
        int i2 = 5;
        if (z2) {
            i2 = 6;
        }
        c8n9.A00 = i2;
        c8n9.A01 = 16385;
        c8n9.A0D = true;
        c8n9.A02 = 5;
        InputFilter inputFilter = A09;
        List list = c8n9.A0A;
        if (list == null || list == C8n9.A0I) {
            list = AnonymousClass001.A0s();
            c8n9.A0A = list;
        }
        list.add(inputFilter);
        c1rq.A2Y(migColorScheme);
        c1rq.A1l(1LI.A09(r302, C8na.class, "PollListItemTextInput", -1974694341));
        c8n9.A0E = true;
        if (A03 != null) {
            List list2 = c8n9.A0B;
            if (list2 == null || list2 == C8n9.A0H) {
                list2 = AnonymousClass001.A0s();
                c8n9.A0B = list2;
            }
            list2.add(A03);
        }
        c1rq.A2X(new 8xS(r302, aaY, i, z3, z));
        c1rq.A1B(z2 ? 4YU.A00(2RH.A09) : 18.0f);
        c1rq.A0R();
        if (z2) {
            float[] fArr = new float[8];
            2RH r03 = 2RH.A04;
            Arrays.fill(fArr, TypedValue.applyDimension(1, 4YU.A00(r03), 7zQ.A0L(r302)));
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(migColorScheme.B9I());
            c1rq2 = C1rg.A01(r302, null, 0);
            c1rq2.A2e(c1rq);
            c1rq2.A0R();
            C2cq A002 = C2cp.A00(r302, 0);
            7zM.A1I(C1u3.A2C, A0I, A002, migColorScheme.B4d());
            A002.A0F("android.widget.ImageView");
            A002.A1J(2131963457);
            7zN.A1D(A002, r302, C8na.class, "PollListItemTextInput", 1843754151);
            c1rq2.A2e(A002);
            c1rq2.A0D(shapeDrawable);
            4YU.A1L(c1rq2, 2RH.A03);
            7zO.A1E(c1rq2, r03);
        }
        A0P.A2e(c1rq2);
        if (!z2) {
            if (z3) {
                A00 = C2cl.A00(r302);
                A00.A2b(7zO.A0F(C1u3.A1w, A0I, migColorScheme));
                A00.A0F("android.widget.ImageView");
                7zM.A1H(A00, migColorScheme);
                A00.A0z(28.0f);
                7zU.A1D(A00, 2RH.A05);
                7zN.A1D(A00, r302, C8na.class, "PollListItemTextInput", -1264536501);
                A00.A1J(2131963456);
                A00.A0S();
            } else {
                A00 = null;
            }
            A0P.A2e(A00);
        }
        return A0P.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1974694341:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                boolean z = ((C5r6) obj).A01;
                C8na c8na = (C8na) r02;
                C8ou c8ou = (C8ou) 4YU.A0P(r03);
                AaY aaY = c8na.A02;
                boolean z2 = c8na.A08;
                int i = c8na.A00;
                boolean z3 = c8na.A06;
                boolean z4 = c8ou.A00;
                aaY.BzE(i, z);
                if (z3) {
                    return null;
                }
                if (z4 == (!z ? false : z2 ? true : !TextUtils.isEmpty(1LI.A0E(r03, "PollListItemTextInput", -94520834) == null ? null : (CharSequence) 7zS.A0z(r0)))) {
                    return null;
                }
                boolean z5 = !z4;
                if (r03.A02 == null) {
                    return null;
                }
                r03.A0G(7zS.A0N(Boolean.valueOf(z5)), "updateState:PollListItemTextInput.updateDeleteButtonVisibility");
                return null;
            case -1264536501:
                1Iv r04 = r302.A00;
                1Is r05 = r04.A01;
                1Iw r06 = r04.A00;
                C8na c8na2 = (C8na) r05;
                if (c8na2.A02.Bsy(c8na2.A00)) {
                    return null;
                }
                7zT.A1J(1LI.A0E(r06, "PollListItemTextInput", -1866257038), "");
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 1843754151:
                1Iv r07 = r302.A00;
                1Is r08 = r07.A01;
                final 1Iw r09 = r07.A00;
                final View view = ((3xC) obj).A00;
                ((C8na) r08).A02.C91(new JFV() { // from class: X.9x5
                    public void C90(String str) {
                        view.performHapticFeedback(1);
                        7zT.A1J(1LI.A0E(r09, "PollListItemTextInput", -1866257038), str);
                    }
                });
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (c2ko.A02 != 1301724706) {
            return null;
        }
        1Iw r0 = c2ko.A00;
        String A0C = r0.A0C();
        C2ko A0G = 61N.A00((61N) 1Bn.A0A(68020)).AZk(36311135285807520L) ? 1LI.A0G(7zT.A0D(r0, new 9aL(A0C), A0C), -874695761) : 1LI.A0E(r0, "PollListItemTextInput", -2123984858);
        if (A0G == null) {
            return null;
        }
        A0G.A00(new Object(), new Object[0]);
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A01, this, r303);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((C8ou) r303).A00 = false;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
