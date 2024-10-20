package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* loaded from: B10.class */
public final class B10 extends C1rj {
    public static final MigColorScheme A0C = LightColorScheme.A00();
    public int A00;
    public View.OnFocusChangeListener A01;
    public View.OnLayoutChangeListener A02;
    public 1Im A03;
    public 1Im A04;
    public Bbm A05;
    public MigColorScheme A06;
    public CharSequence A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public B10() {
        super("EditFieldComponent");
        this.A06 = A0C;
    }

    public static void A00(1Iw r301, ApZ apZ, AfA afA, MigColorScheme migColorScheme, boolean z) {
        Context context = r301.A0D;
        int A00 = C0A8.A00(context, 4.0f);
        int A002 = C0A8.A00(context, 4YU.A00(2RH.A07));
        int A003 = C0A8.A00(context, 7zM.A01());
        afA.setPadding(z ? C0A8.A00(context, 60.0f) : A002, A003, A002, A003);
        AbG.A1I(afA, migColorScheme);
        AbH.A1M(afA, migColorScheme);
        afA.setTextSize(2, 7zN.A00(2KE.A09));
        apZ.setPadding(A00, A00, A00, A00);
        apZ.A02(migColorScheme.B9Q());
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        C1u2 A0R = 7zP.A0R();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        AfA afA = new AfA(context);
        afA.setSingleLine(true);
        afA.setTextAlignment(5);
        afA.setTextDirection(0);
        relativeLayout.addView((View) afA, (ViewGroup.LayoutParams) new RelativeLayout.LayoutParams(-1, -1));
        ApZ apZ = new ApZ(context);
        apZ.setImageDrawable(context.getDrawable(A0R.A00()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C0A8.A00(context, 32.0f), -2);
        layoutParams.addRule(11);
        layoutParams.addRule(15);
        relativeLayout.addView((View) apZ, (ViewGroup.LayoutParams) layoutParams);
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
        Bbm bbm = this.A05;
        MigColorScheme migColorScheme = this.A06;
        boolean z = this.A0B;
        boolean z2 = this.A0A;
        View.OnFocusChangeListener onFocusChangeListener = this.A01;
        View.OnLayoutChangeListener onLayoutChangeListener = this.A02;
        AfA childAt = viewGroup.getChildAt(0);
        ApZ childAt2 = viewGroup.getChildAt(1);
        Typeface typeface = childAt.A00;
        if (typeface != null) {
            childAt.setTypeface(typeface);
        }
        childAt.setFocusable(true);
        childAt.setFocusableInTouchMode(true);
        childAt.setClickable(true);
        childAt.setLongClickable(true);
        childAt.setCursorVisible(true);
        1LI r0 = r302.A02;
        childAt.A03 = r0 == null ? null : ((B10) r0).A03;
        childAt.addTextChangedListener(childAt.A06);
        childAt.A05 = bbm;
        1LI r02 = r302.A02;
        childAt.A02 = r02 == null ? null : ((B10) r02).A04;
        childAt.A04 = childAt2;
        childAt.setOnFocusChangeListener(onFocusChangeListener);
        if (onLayoutChangeListener != null) {
            childAt.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (!AbM.A0u(childAt).equals(bbm.A00) && (!TextUtils.isEmpty(AbM.A0u(childAt)) || !TextUtils.isEmpty(bbm.A00))) {
            childAt.setText(bbm.A00);
        }
        if (z2) {
            C2cd.A02(childAt);
        }
        childAt2.A02 = true;
        childAt2.A00 = childAt;
        childAt2.setOnClickListener(childAt2.A03);
        childAt2.A01 = bbm;
        childAt2.A03();
        childAt.setBackgroundResource(2132411589);
        A00(r302, childAt2, childAt, migColorScheme, z);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Bbm bbm = this.A05;
        MigColorScheme migColorScheme = this.A06;
        int i = this.A00;
        CharSequence charSequence = this.A07;
        boolean z = this.A0B;
        boolean z2 = this.A09;
        String str = this.A08;
        View.OnFocusChangeListener onFocusChangeListener = this.A01;
        View.OnLayoutChangeListener onLayoutChangeListener = this.A02;
        AfA childAt = viewGroup.getChildAt(0);
        ApZ childAt2 = viewGroup.getChildAt(1);
        Typeface A00 = 2KQ.A04.A00(r302.A0D);
        childAt.A00 = A00;
        if (A00 != null) {
            childAt.setTypeface(A00);
        }
        childAt.setHint(charSequence);
        childAt.setContentDescription(charSequence);
        childAt.A05 = bbm;
        childAt.setImeOptions(i);
        childAt.A04 = childAt2;
        childAt.setOnFocusChangeListener(onFocusChangeListener);
        if (onLayoutChangeListener != null) {
            childAt.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        childAt.setImportantForAutofill(AbJ.A00(z2 ? 1 : 0));
        childAt.setAutofillHints(z ? new String[]{"phone"} : new String[]{"emailAddress", "username", "phone"});
        if (str != null) {
            childAt.setTag(str);
        }
        if (!AbM.A0u(childAt).equals(bbm.A00) && (!TextUtils.isEmpty(AbM.A0u(childAt)) || !TextUtils.isEmpty(bbm.A00))) {
            childAt.setText(bbm.A00);
            childAt.setSelection(bbm.A00.length());
        }
        childAt2.A02 = true;
        childAt2.A00 = childAt;
        childAt2.setOnClickListener(childAt2.A03);
        childAt2.A01 = bbm;
        childAt2.A03();
        childAt.setBackgroundResource(2132411589);
        A00(r302, childAt2, childAt, migColorScheme, z);
        if (z) {
            childAt.setInputType(4098);
        }
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        AfA childAt = viewGroup.getChildAt(0);
        childAt.removeTextChangedListener(childAt.A06);
        childAt.A02 = null;
        childAt.setOnFocusChangeListener(null);
        childAt.removeOnLayoutChangeListener(childAt.A01);
        childAt.A01 = null;
        childAt.A03 = null;
        ApZ childAt2 = viewGroup.getChildAt(1);
        childAt2.setOnClickListener(null);
        childAt2.A00 = null;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B10 b10 = (B10) r302;
            MigColorScheme migColorScheme = this.A06;
            MigColorScheme migColorScheme2 = b10.A06;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            if (this.A09 != b10.A09) {
                return false;
            }
            String str = this.A08;
            String str2 = b10.A08;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            CharSequence charSequence = this.A07;
            CharSequence charSequence2 = b10.A07;
            if (charSequence != null) {
                if (!charSequence.equals(charSequence2)) {
                    return false;
                }
            } else if (charSequence2 != null) {
                return false;
            }
            if (this.A00 != b10.A00 || this.A0A != b10.A0A) {
                return false;
            }
            View.OnFocusChangeListener onFocusChangeListener = this.A01;
            View.OnFocusChangeListener onFocusChangeListener2 = b10.A01;
            if (onFocusChangeListener != null) {
                if (!onFocusChangeListener.equals(onFocusChangeListener2)) {
                    return false;
                }
            } else if (onFocusChangeListener2 != null) {
                return false;
            }
            View.OnLayoutChangeListener onLayoutChangeListener = this.A02;
            View.OnLayoutChangeListener onLayoutChangeListener2 = b10.A02;
            if (onLayoutChangeListener != null) {
                if (!onLayoutChangeListener.equals(onLayoutChangeListener2)) {
                    return false;
                }
            } else if (onLayoutChangeListener2 != null) {
                return false;
            }
            if (this.A0B != b10.A0B) {
                return false;
            }
            Bbm bbm = this.A05;
            Bbm bbm2 = b10.A05;
            if (bbm != null) {
                if (!bbm.equals(bbm2)) {
                    return false;
                }
            } else if (bbm2 != null) {
                return false;
            }
        }
        return true;
    }
}
