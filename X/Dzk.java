package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.facebook.ui.search.SearchEditText;
import com.facebook.widget.text.BetterEditTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Dzk.class */
public final class Dzk extends C1rj {
    public static final int A0Y;
    public static final Typeface A0Z;
    public static final Typeface A0a;
    public static final Layout.Alignment A0b;
    public static final Layout.Alignment[] A0c = Layout.Alignment.values();
    public static final TextUtils.TruncateAt[] A0d = TextUtils.TruncateAt.values();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public ColorStateList A0I;
    public Typeface A0J;
    public Drawable A0K;
    public Drawable A0L;
    public Layout.Alignment A0M;
    public TextUtils.TruncateAt A0N;
    public 1Im A0O;
    public 1Im A0P;
    public C2ko A0Q;
    public C2ko A0R;
    public CharSequence A0S;
    public CharSequence A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;

    static {
        Typeface typeface = Typeface.DEFAULT;
        A0Z = typeface;
        A0Y = typeface.getStyle();
        A0a = typeface;
        A0b = Layout.Alignment.ALIGN_NORMAL;
    }

    public Dzk() {
        super("SearchEditText");
        this.A04 = 8388627;
        this.A06 = -3355444;
        this.A07 = 6;
        this.A08 = 1;
        this.A09 = 0;
        this.A0A = -16777216;
        this.A0B = (-1) >>> 1;
        this.A0C = (-1) << (-1);
        this.A0X = true;
        this.A0D = -1;
        this.A0E = -7829368;
        this.A03 = 1.0f;
        this.A0M = A0b;
        this.A0F = -16777216;
        this.A0G = 13;
        this.A0H = A0Y;
        this.A0J = A0a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1rs, X.Drl] */
    public static Drl A00(1Iw r301) {
        Dzk dzk = new Dzk();
        ?? c1rs = new C1rs(dzk, r301, 0, 0);
        c1rs.A01 = dzk;
        c1rs.A00 = r301;
        return c1rs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(ColorStateList colorStateList, Typeface typeface, Drawable drawable, Drawable drawable2, Layout.Alignment alignment, TextUtils.TruncateAt truncateAt, 1Iw r307, 1Im r308, SearchEditText searchEditText, CharSequence charSequence, CharSequence charSequence2, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z, boolean z2, boolean z3, boolean z4) {
        int i15 = (-1) >>> 1;
        searchEditText.setText(charSequence);
        searchEditText.setHint(charSequence2);
        searchEditText.setEllipsize(truncateAt);
        searchEditText.setMinLines(i);
        searchEditText.setMaxLines(i2);
        searchEditText.setShadowLayer(f, f2, f3, i3);
        searchEditText.setSingleLine(z);
        searchEditText.setLinkTextColor(i6);
        searchEditText.setHighlightColor(i7);
        searchEditText.setTextSize(i8);
        searchEditText.setLineSpacing(0.0f, f4);
        searchEditText.setTypeface(typeface, i9);
        searchEditText.setInputType(i11);
        searchEditText.setGravity(i10);
        searchEditText.setImeOptions(i12);
        searchEditText.setSingleLine();
        searchEditText.A04 = z4;
        if (i14 >= 0 && i14 <= charSequence.length()) {
            searchEditText.setSelection(i14);
        }
        searchEditText.setOnEditorActionListener(new FYZ(r308, searchEditText, i12));
        ArrayList A17 = 1BK.A17(Arrays.asList(searchEditText.getFilters()));
        A17.add(new InputFilter.LengthFilter(i15));
        searchEditText.setFilters((InputFilter[]) A17.toArray(new InputFilter[A17.size()]));
        int i16 = 0;
        if (drawable != null) {
            if (drawable.getConstantState() != null) {
                drawable = drawable.getConstantState().newDrawable().mutate();
            }
            drawable.setBounds(i13, 0, drawable.getIntrinsicWidth() + i13, drawable.getIntrinsicHeight());
        }
        Context context = r307.A0D;
        if (C2rY.A00(context.getApplicationContext())) {
            searchEditText.setCompoundDrawables(null, null, drawable, null);
        } else {
            searchEditText.setCompoundDrawables(drawable, null, null, null);
        }
        if (drawable != null) {
            i16 = i13 + 15;
        }
        searchEditText.setCompoundDrawablePadding(i16);
        if (drawable2 != null) {
            if (drawable2.getConstantState() != null) {
                drawable2 = drawable2.getConstantState().newDrawable().mutate();
            }
            ((BetterEditTextView) searchEditText).A00 = drawable2;
        }
        if (z2) {
            searchEditText.requestFocus();
        }
        if (z3) {
            SearchEditText.A01(searchEditText, false);
        }
        Resources resources = context.getResources();
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        searchEditText.setPadding(applyDimension, (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), applyDimension, applyDimension);
        if (colorStateList != null) {
            searchEditText.setTextColor(colorStateList);
        } else {
            searchEditText.setTextColor(i4);
        }
        searchEditText.setHintTextColor(i5);
        int i17 = EZy.A00[alignment.ordinal()];
        int i18 = 3;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 3) {
                    i18 = 4;
                }
            }
            searchEditText.setTextAlignment(i18);
        } else {
            searchEditText.setTextAlignment(2);
        }
        searchEditText.setBackgroundColor(-1);
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new SearchEditText(context);
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        Dzk dzk = (Dzk) r302;
        Dzk dzk2 = (Dzk) r303;
        CharSequence charSequence = null;
        Object obj = dzk == null ? null : dzk.A0S;
        CharSequence charSequence2 = dzk2 == null ? null : dzk2.A0S;
        Object obj2 = dzk == null ? null : dzk.A0T;
        if (dzk2 != null) {
            charSequence = dzk2.A0T;
        }
        boolean z = false;
        boolean z2 = charSequence2 == obj || (charSequence2 != null && charSequence2.equals(obj));
        boolean z3 = charSequence == obj2 || (charSequence != null && charSequence.equals(obj2));
        if (!z2 || !z3) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.EdN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [android.widget.TextView, android.view.View, com.facebook.ui.search.SearchEditText] */
    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        int i = c2ko.A02;
        if (i == -1508228149) {
            1Iw r0 = c2ko.A00;
            AtomicReference atomicReference = ((E06) 4YU.A0P(r0)).A01;
            1sP.A00();
            1LI r02 = r0.A02;
            1Im r311 = r02 == null ? null : ((Dzk) r02).A0P;
            if (r311 != null) {
                ?? obj2 = new Object();
                ((EdN) obj2).A00 = "";
                r311.A00((Object) obj2);
            }
            TextView textView = (TextView) atomicReference.get();
            if (textView == null) {
                return null;
            }
            textView.setText("");
            if (r0.A02 == null) {
                return null;
            }
            r0.A0G(7zS.A0N(""), "updateState:SearchEditText.updateStoredTextValue");
            return null;
        }
        if (i != 270236861) {
            return null;
        }
        Bjt bjt = (Bjt) obj;
        1Iw r03 = c2ko.A00;
        String str = bjt.A00;
        boolean z = bjt.A01;
        ?? r04 = (SearchEditText) ((E06) 4YU.A0P(r03)).A01.get();
        if (r04 == 0) {
            return null;
        }
        r04.setText(str);
        if (str instanceof Spannable) {
            str = str.toString();
        }
        if (r03.A02 != null) {
            r03.A0G(7zS.A0N(str), "updateState:SearchEditText.updateStoredTextValue");
        }
        if (z) {
            SearchEditText.A01(r04, false);
            return null;
        }
        r04.requestFocus();
        r04.A07();
        return null;
    }

    @Override // X.C1rj
    public void A1E(1Iw r302) {
        TextUtils.TruncateAt truncateAt = null;
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        String str = null;
        ColorStateList colorStateList = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Layout.Alignment alignment = null;
        Integer num6 = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        TypedArray A02 = r302.A02(0, C53r.A04);
        int indexCount = A02.getIndexCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= indexCount) {
                break;
            }
            int index = A02.getIndex(i2);
            if (index == 9) {
                str = A02.getString(index);
            } else if (index == 2) {
                colorStateList = 5Wo.A00(r302.A0D, A02, index);
            } else if (index == 0) {
                num5 = Integer.valueOf(A02.getDimensionPixelSize(index, 0));
            } else if (index == 5) {
                int integer = A02.getInteger(index, 0);
                if (integer > 0) {
                    truncateAt = A0d[integer - 1];
                }
            } else if (index == 25) {
                alignment = A0c[A02.getInteger(index, 0)];
            } else if (index == 11) {
                num = DKG.A10(A02, index, -1);
            } else if (index == 10) {
                num2 = DKG.A10(A02, index, -1);
            } else if (index == 14) {
                bool = Boolean.valueOf(A02.getBoolean(index, false));
            } else if (index == 4) {
                num3 = DKG.A12(A02, index, 0);
            } else if (index == 3) {
                num4 = DKG.A12(A02, index, 0);
            } else if (index == 1) {
                num6 = DKG.A10(A02, index, 0);
            } else if (index == 21) {
                f = DKG.A0y(A02, index);
            } else if (index == 17) {
                f3 = DKG.A0y(A02, index);
            } else if (index == 18) {
                f4 = DKG.A0y(A02, index);
            } else if (index == 19) {
                f2 = DKG.A0y(A02, index);
            } else if (index == 16) {
                num7 = DKG.A12(A02, index, 0);
            } else if (index == 6) {
                num8 = DKG.A10(A02, index, 0);
            } else if (index == 22) {
                num9 = DKG.A10(A02, index, 1);
            }
            i = i2 + 1;
        }
        A02.recycle();
        if (truncateAt != null) {
            this.A0N = truncateAt;
        }
        if (f != null) {
            this.A03 = f.floatValue();
        }
        if (num != null) {
            this.A0C = num.intValue();
        }
        if (num2 != null) {
            this.A0B = num2.intValue();
        }
        if (bool != null) {
            this.A0U = bool.booleanValue();
        }
        if (str != null) {
            this.A0T = str;
        }
        if (colorStateList != null) {
            this.A0I = colorStateList;
        }
        if (num3 != null) {
            this.A0A = num3.intValue();
        }
        if (num4 != null) {
            this.A05 = num4.intValue();
        }
        if (num5 != null) {
            this.A0G = num5.intValue();
        }
        if (alignment != null) {
            this.A0M = alignment;
        }
        if (num6 != null) {
            this.A0H = num6.intValue();
        }
        if (f2 != null) {
            this.A02 = f2.floatValue();
        }
        if (f3 != null) {
            this.A00 = f3.floatValue();
        }
        if (f4 != null) {
            this.A01 = f4.floatValue();
        }
        if (num7 != null) {
            this.A0E = num7.intValue();
        }
        if (num8 != null) {
            this.A04 = num8.intValue();
        }
        if (num9 != null) {
            this.A08 = num9.intValue();
        }
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A0R, this, r303);
        7zQ.A1H(r302, this.A0Q, this, r303);
    }

    /* JADX WARN: Type inference failed for: r0v73, types: [android.view.View, com.facebook.ui.search.SearchEditText] */
    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        E06 e06 = (E06) 4YU.A0P(r302);
        CharSequence charSequence = this.A0T;
        CharSequence charSequence2 = this.A0S;
        TextUtils.TruncateAt truncateAt = this.A0N;
        int i3 = this.A0C;
        int i4 = this.A0B;
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        int i5 = this.A0E;
        boolean z = this.A0U;
        int i6 = this.A0F;
        ColorStateList colorStateList = this.A0I;
        int i7 = this.A06;
        int i8 = this.A0A;
        int i9 = this.A05;
        int i10 = this.A0G;
        float f4 = this.A03;
        int i11 = this.A0H;
        Typeface typeface = this.A0J;
        Layout.Alignment alignment = this.A0M;
        int i12 = this.A04;
        Drawable drawable = this.A0L;
        Drawable drawable2 = this.A0K;
        int i13 = this.A08;
        boolean z2 = this.A0V;
        boolean z3 = this.A0W;
        int i14 = this.A07;
        1Im r0 = this.A0O;
        int i15 = this.A09;
        int i16 = this.A0D;
        boolean z4 = this.A0X;
        CharSequence charSequence3 = e06.A00;
        ?? searchEditText = new SearchEditText(r302.A0D);
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = charSequence3;
        }
        A01(colorStateList, typeface, drawable, drawable2, alignment, truncateAt, r302, r0, searchEditText, charSequence, charSequence2, f, f2, f3, f4, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, z, z2, z3, z4);
        DKF.A1I((View) searchEditText, c23p, i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.widget.text.BetterEditTextView, android.widget.TextView] */
    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ?? r0 = (BetterEditTextView) obj;
        int i = this.A0F;
        Drawable drawable = this.A0K;
        r0.setTextColor(i);
        if (drawable != null) {
            r0.A00 = drawable;
        }
        if (!C2rY.A00(r302.A0D.getApplicationContext())) {
            r0.A05(null);
        }
        FsQ fsQ = new FsQ(r302);
        if (r0.A04 == null) {
            FWs fWs = new FWs((BetterEditTextView) r0);
            r0.A04 = fWs;
            r0.addTextChangedListener(fWs);
            r0.A09 = false;
        }
        r0.A05 = fsQ;
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        E06 e06 = (E06) 4YU.A0P(r302);
        SearchEditText searchEditText = (SearchEditText) obj;
        CharSequence charSequence = this.A0T;
        CharSequence charSequence2 = this.A0S;
        TextUtils.TruncateAt truncateAt = this.A0N;
        int i = this.A0C;
        int i2 = this.A0B;
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        int i3 = this.A0E;
        boolean z = this.A0U;
        int i4 = this.A0F;
        ColorStateList colorStateList = this.A0I;
        int i5 = this.A06;
        int i6 = this.A0A;
        int i7 = this.A05;
        int i8 = this.A0G;
        float f4 = this.A03;
        int i9 = this.A0H;
        Typeface typeface = this.A0J;
        Layout.Alignment alignment = this.A0M;
        int i10 = this.A04;
        Drawable drawable = this.A0L;
        Drawable drawable2 = this.A0K;
        int i11 = this.A08;
        boolean z2 = this.A0V;
        boolean z3 = this.A0W;
        int i12 = this.A07;
        1Im r0 = this.A0O;
        int i13 = this.A09;
        int i14 = this.A0D;
        boolean z4 = this.A0X;
        AtomicReference atomicReference = e06.A01;
        CharSequence charSequence3 = e06.A00;
        atomicReference.set(searchEditText);
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = charSequence3;
        }
        A01(colorStateList, typeface, drawable, drawable2, alignment, truncateAt, r302, r0, searchEditText, charSequence, charSequence2, f, f2, f3, f4, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, z, z2, z3, z4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.widget.text.BetterEditTextView, android.widget.TextView] */
    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ?? r0 = (BetterEditTextView) obj;
        FWs fWs = r0.A04;
        if (fWs != null) {
            r0.removeTextChangedListener(fWs);
            r0.A04 = null;
        }
        r0.A05 = null;
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ((E06) 4YU.A0P(r302)).A01.set(null);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E06 e06 = (E06) r303;
        AtomicReference atomicReference = new AtomicReference();
        e06.A00 = "";
        e06.A01 = atomicReference;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Dzk dzk = (Dzk) r302;
            Drawable drawable = this.A0K;
            Drawable drawable2 = dzk.A0K;
            if (drawable != null) {
                if (!drawable.equals(drawable2)) {
                    return false;
                }
            } else if (drawable2 != null) {
                return false;
            }
            1Im r0 = this.A0O;
            1Im r02 = dzk.A0O;
            if (r0 != null) {
                if (!r0.A01(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            TextUtils.TruncateAt truncateAt = this.A0N;
            TextUtils.TruncateAt truncateAt2 = dzk.A0N;
            if (truncateAt != null) {
                if (!truncateAt.equals(truncateAt2)) {
                    return false;
                }
            } else if (truncateAt2 != null) {
                return false;
            }
            if (Float.compare(0.0f, 0.0f) != 0 || this.A04 != dzk.A04 || this.A05 != dzk.A05) {
                return false;
            }
            CharSequence charSequence = this.A0S;
            CharSequence charSequence2 = dzk.A0S;
            if (charSequence != null) {
                if (!charSequence.equals(charSequence2)) {
                    return false;
                }
            } else if (charSequence2 != null) {
                return false;
            }
            if (this.A06 != dzk.A06 || this.A07 != dzk.A07 || this.A08 != dzk.A08 || this.A0U != dzk.A0U) {
                return false;
            }
            Drawable drawable3 = this.A0L;
            Drawable drawable4 = dzk.A0L;
            if (drawable3 != null) {
                if (!drawable3.equals(drawable4)) {
                    return false;
                }
            } else if (drawable4 != null) {
                return false;
            }
            if (this.A09 != dzk.A09 || this.A0A != dzk.A0A || this.A0B != dzk.A0B || this.A0C != dzk.A0C || this.A0V != dzk.A0V || this.A0W != dzk.A0W || this.A0X != dzk.A0X || this.A0D != dzk.A0D || this.A0E != dzk.A0E || Float.compare(this.A00, dzk.A00) != 0 || Float.compare(this.A01, dzk.A01) != 0 || Float.compare(this.A02, dzk.A02) != 0 || Float.compare(this.A03, dzk.A03) != 0) {
                return false;
            }
            CharSequence charSequence3 = this.A0T;
            CharSequence charSequence4 = dzk.A0T;
            if (charSequence3 != null) {
                if (!charSequence3.equals(charSequence4)) {
                    return false;
                }
            } else if (charSequence4 != null) {
                return false;
            }
            Layout.Alignment alignment = this.A0M;
            Layout.Alignment alignment2 = dzk.A0M;
            if (alignment != null) {
                if (!alignment.equals(alignment2)) {
                    return false;
                }
            } else if (alignment2 != null) {
                return false;
            }
            if (this.A0F != dzk.A0F) {
                return false;
            }
            ColorStateList colorStateList = this.A0I;
            ColorStateList colorStateList2 = dzk.A0I;
            if (colorStateList != null) {
                if (!colorStateList.equals(colorStateList2)) {
                    return false;
                }
            } else if (colorStateList2 != null) {
                return false;
            }
            if (this.A0G != dzk.A0G || this.A0H != dzk.A0H) {
                return false;
            }
            Typeface typeface = this.A0J;
            Typeface typeface2 = dzk.A0J;
            if (typeface != null) {
                if (!typeface.equals(typeface2)) {
                    return false;
                }
            } else if (typeface2 != null) {
                return false;
            }
        }
        return true;
    }
}
