package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Ayu, reason: case insensitive filesystem */
/* loaded from: Ayu.class */
public final class C2001Ayu extends C1rj {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public Drawable A06;
    public Drawable A07;
    public View.OnFocusChangeListener A08;
    public TextView.OnEditorActionListener A09;
    public MHn A0A;
    public 1Im A0B;
    public 1Im A0C;
    public 1Im A0D;
    public 1Im A0E;
    public 1Im A0F;
    public MigColorScheme A0G;
    public Integer A0H;
    public Integer A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;

    public C2001Ayu() {
        super("MessengerGenericSearchBar");
        this.A03 = 3;
    }

    public final Object[] A0k() {
        Object[] objArr = new Object[28];
        System.arraycopy(new Object[]{Boolean.valueOf(this.A0R)}, 1BK.A1W(new Object[]{Boolean.valueOf(this.A0L), this.A0B, this.A05, this.A06, this.A0H, this.A0C, this.A0G, Boolean.valueOf(this.A0M), Boolean.valueOf(this.A0N), this.A0D, this.A0E, this.A0F, this.A0J, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A07, this.A0I, this.A09, this.A08, this.A0A, this.A0K, Integer.valueOf(this.A04), Float.valueOf(this.A00), Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0P), Boolean.valueOf(this.A0Q)}, objArr) ? 1 : 0, objArr, 27, 1);
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v274, types: [X.69j, android.graphics.drawable.Drawable] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cl c2cl;
        1LI r327;
        2AW r3272;
        MigColorScheme migColorScheme = this.A0G;
        String str = this.A0K;
        boolean z = this.A0P;
        MHn mHn = this.A0A;
        int i = this.A02;
        Drawable drawable = this.A05;
        Drawable drawable2 = this.A06;
        Integer num = this.A0H;
        String str2 = this.A0J;
        int i2 = this.A01;
        View.OnFocusChangeListener onFocusChangeListener = this.A08;
        TextView.OnEditorActionListener onEditorActionListener = this.A09;
        int i3 = this.A03;
        boolean z2 = this.A0O;
        boolean z3 = this.A0Q;
        boolean z4 = this.A0R;
        Drawable drawable3 = this.A07;
        Integer num2 = this.A0I;
        boolean z5 = this.A0L;
        1Im r0 = this.A0B;
        1Im r02 = this.A0C;
        1Im r03 = this.A0E;
        1Im r04 = this.A0F;
        1Im r05 = this.A0D;
        boolean z6 = this.A0M;
        boolean z7 = this.A0N;
        int i4 = this.A04;
        float f = this.A00;
        int i5 = 0;
        boolean z8 = !1JF.A0A(str) && (z5 || !z3);
        C1rq A01 = C1rg.A01(r302, null, 0);
        C26z c26z = C26z.START;
        Context context = r302.A0D;
        A01.A24(c26z, context.getResources().getDimensionPixelSize(R.dimen.mapbox_four_dp));
        C1rh A0d = 7zL.A0d(new C8ep(r03), A01);
        1Bn.A0A(66619);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A15(context.getResources().getDimensionPixelSize(R.dimen.mapbox_four_dp));
        final AQV aqv = new AQV(new CpP(r04), 9);
        C1rh A0d2 = 7zL.A0d(new 1LH(aqv) { // from class: X.84b
            public final C00m A00;

            {
                this.A00 = aqv;
            }

            public 1LI A0s(C2k5 c2k5) {
                Object A00 = 2rO.A00(c2k5, C84d.A00, 7zL.A1Z(c2k5));
                Object A002 = 2rO.A00(c2k5, C84e.A00, new Object[0]);
                Function1 A013 = 4FN.A01(c2k5, 83U.A01(A00, this, 19));
                Function1 A014 = 4FN.A01(c2k5, AV2.A00(A00, 21));
                Drawable drawable4 = (Drawable) 2rO.A00(c2k5, new AKW(A002, this, 16), new Object[0]);
                C2cm A003 = C2cl.A00(c2k5.A05);
                2lQ r06 = 2lO.A02;
                7zS.A1L(A003, 7zS.A0h(0S2.A1G, A013, 1), 0S2.A00, A014);
                A003.A2X(-7829368);
                A003.A2b(drawable4);
                7zL.A1J(A003);
                7zN.A1E(A003, c2k5, 2131967226);
                return 7zN.A09(A003);
            }
        }, A012);
        C1rq A0m = 7zM.A0m(r302);
        if (!z2) {
            A0d = null;
        }
        A0m.A2f(A0d);
        AvV avV = new AvV(r302, new B0h());
        B0h b0h = avV.A01;
        b0h.A07 = str;
        BitSet bitSet = avV.A02;
        bitSet.set(6);
        b0h.A06 = str2;
        bitSet.set(1);
        b0h.A03 = mHn;
        bitSet.set(5);
        b0h.A01 = onFocusChangeListener;
        bitSet.set(4);
        b0h.A02 = onEditorActionListener;
        b0h.A00 = i2;
        bitSet.set(2);
        b0h.A05 = Integer.valueOf(i3);
        bitSet.set(3);
        b0h.A04 = migColorScheme;
        bitSet.set(0);
        avV.A0R();
        avV.A0E("messenger_search_bar_tag");
        7zP.A16(avV, bitSet, avV.A03);
        A0m.A2f(b0h);
        if (z8) {
            int intValue = num != null ? num.intValue() : i;
            C2cm A00 = C2cl.A00(r302);
            A00.A2b(drawable2);
            A00.A2X(intValue);
            A00.A2Q(true);
            A00.A1G(2130971612);
            A00.A2T(r02);
            A00.A15(z7 ? 0.0f : 7zM.A01());
            4YU.A1L(A00, 2RH.A05);
            A00.A1J(2131952114);
            c2cl = 7zL.A0J(A00);
        } else {
            c2cl = null;
        }
        A0m.A2f(c2cl);
        if (!z4) {
            A0d2 = null;
        }
        C1rh A0d3 = 7zL.A0d(A0d2, A0m);
        if (z7) {
            Matrix matrix = 5CC.A03;
            ?? c69j = new C69j(new ColorDrawable(i4));
            c69j.Cte(3yG.A01(f));
            c69j.A04(0S2.A01);
            C1rq A0m2 = 7zM.A0m(r302);
            A0m2.A0D(c69j);
            2RH r3273 = 2RH.A05;
            7zO.A1I(A0m2, r3273);
            if (!z) {
                r3273 = 2RH.A04;
            }
            7zO.A1M(A0m2, r3273, c26z);
            A0m2.A15(z3 ? 0.0f : 7zL.A02());
            A0d3 = 7zL.A0d(A0d3, A0m2);
        }
        C1rq A013 = C1rg.A01(r302, null, 0);
        A013.A2O(false);
        A013.A2i(C1rp.FLEX_START);
        if (z) {
            C2cm A002 = C2cl.A00(r302);
            A002.A2W();
            A002.A0C(drawable.getIntrinsicWidth());
            A002.A1L(drawable.getIntrinsicHeight());
            A002.A0L();
            A002.A2b(drawable);
            A002.A2Q(true);
            A002.A2X(i);
            A002.A1G(2130971610);
            A002.A1J(2131962041);
            7zL.A1J(A002);
            A002.A2T(r0);
            r327 = 7zL.A0J(A002);
        } else {
            C1rq A014 = C1rg.A01(r302, null, 0);
            A014.A1C(7zL.A02() + 7zL.A03());
            r327 = A014.A00;
        }
        A013.A2f(r327);
        A013.A2f(A0d3);
        if (z3) {
            if (num2 != null) {
                i = num2.intValue();
            }
            boolean booleanValue = Boolean.valueOf(z7).booleanValue();
            int i6 = 2132279312;
            if (booleanValue) {
                i6 = 2132279321;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i6);
            C2cm A003 = C2cl.A00(r302);
            A003.A2b(drawable3);
            A003.A2X(i);
            A003.A2T(r05);
            A003.A2c(ImageView.ScaleType.FIT_CENTER);
            A003.A0C((booleanValue ? 0 : 2RH.A08.A00()) + dimensionPixelSize);
            A003.A1L(dimensionPixelSize);
            A003.A0L();
            2RH r06 = 2RH.A05;
            7zO.A1L(A003, r06);
            float f2 = 0.0f;
            A003.A24(c26z, booleanValue ? 4YU.A00(r06) : 0.0f);
            if (!booleanValue) {
                f2 = 4YU.A00(r06);
            }
            A003.A1C(f2);
            A003.A1J(2131960290);
            7zL.A1J(A003);
            r3272 = 7zL.A0J(A003);
        } else {
            r3272 = new 2AW();
        }
        A013.A2f(r3272);
        4YU.A1O(A013, 2RH.A04, c26z);
        if (!z6) {
            i5 = migColorScheme.BDl();
        }
        A013.A1H(i5);
        return A013.A00;
    }
}
