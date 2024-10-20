package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* loaded from: B16.class */
public final class B16 extends C1rj {
    public static final MigColorScheme A09 = LightColorScheme.A00();
    public int A00;
    public 1Im A01;
    public 1Im A02;
    public Bjz A03;
    public MigColorScheme A04;
    public CharSequence A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    public B16() {
        super("PasswordEditComponent");
        this.A04 = A09;
        this.A00 = 0;
    }

    public static AwO A00(1Iw r301) {
        return new AwO(r301, new B16());
    }

    public static void A01(Context context, C1669Apa c1669Apa, AfB afB, MigColorScheme migColorScheme) {
        int B4i = migColorScheme.B4i();
        if (0AT.A02(B4i)) {
            B4i = C98U.BLUE.colorInt;
        }
        int A00 = C0A8.A00(context, 5.0f);
        int A002 = C0A8.A00(context, 4YU.A00(2RH.A07));
        int A003 = C0A8.A00(context, 7zM.A01());
        afB.setPadding(A002, A003, C0A8.A00(context, 28.0f) + A002, A003);
        AbG.A1I(afB, migColorScheme);
        AbH.A1M(afB, migColorScheme);
        afB.setTextSize(2, 7zN.A00(2KE.A09));
        c1669Apa.setPadding(A00, A00, A00, A00);
        c1669Apa.A00 = B4i;
        C1669Apa.A01(c1669Apa);
        c1669Apa.A01 = migColorScheme.BEj();
        C1669Apa.A01(c1669Apa);
        C1669Apa.A00(c1669Apa);
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        AfB afB = new AfB(context);
        afB.setSingleLine(true);
        afB.setTextAlignment(5);
        afB.setTextDirection(0);
        relativeLayout.addView((View) afB, (ViewGroup.LayoutParams) new RelativeLayout.LayoutParams(-1, -1));
        C1669Apa c1669Apa = new C1669Apa(context);
        c1669Apa.setImageDrawable(context.getResources().getDrawable(2132345588, null));
        C1669Apa.A00(c1669Apa);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C0A8.A00(context, 28.0f), -2);
        layoutParams.addRule(21);
        layoutParams.addRule(15);
        relativeLayout.addView(c1669Apa, layoutParams);
        return relativeLayout;
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        c23p.A01 = View.MeasureSpec.getSize(i);
        c23p.A00 = C0A8.A00(r302.A0D, 52.0f);
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        MigColorScheme migColorScheme = this.A04;
        AfB childAt = viewGroup.getChildAt(0);
        Typeface typeface = childAt.A00;
        if (typeface != null) {
            childAt.setTypeface(typeface);
        }
        1LI r0 = r302.A02;
        childAt.A02 = r0 == null ? null : ((B16) r0).A02;
        childAt.addTextChangedListener(childAt.A07);
        1LI r02 = r302.A02;
        childAt.A01 = r02 == null ? null : ((B16) r02).A01;
        C1669Apa c1669Apa = (C1669Apa) viewGroup.getChildAt(1);
        c1669Apa.A02 = childAt;
        c1669Apa.setOnClickListener(c1669Apa.A05);
        childAt.A03 = c1669Apa;
        childAt.setBackgroundResource(2132411589);
        A01(r302.A0D, c1669Apa, childAt, migColorScheme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0126, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L19;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K(X.1Iw r302, X.AnonymousClass274 r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B16.A1K(X.1Iw, X.274, java.lang.Object):void");
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        AfB childAt = viewGroup.getChildAt(0);
        childAt.removeTextChangedListener(childAt.A07);
        childAt.A01 = null;
        childAt.A02 = null;
        C1669Apa c1669Apa = (C1669Apa) viewGroup.getChildAt(1);
        c1669Apa.setOnClickListener(null);
        c1669Apa.A02 = null;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B16 b16 = (B16) r302;
            if (this.A07 != b16.A07) {
                return false;
            }
            MigColorScheme migColorScheme = this.A04;
            MigColorScheme migColorScheme2 = b16.A04;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            if (this.A08 != b16.A08) {
                return false;
            }
            String str = this.A06;
            String str2 = b16.A06;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            CharSequence charSequence = this.A05;
            CharSequence charSequence2 = b16.A05;
            if (charSequence != null) {
                if (!charSequence.equals(charSequence2)) {
                    return false;
                }
            } else if (charSequence2 != null) {
                return false;
            }
            if (this.A00 != b16.A00) {
                return false;
            }
            Bjz bjz = this.A03;
            Bjz bjz2 = b16.A03;
            if (bjz != null) {
                if (!bjz.equals(bjz2)) {
                    return false;
                }
            } else if (bjz2 != null) {
                return false;
            }
        }
        return true;
    }
}
