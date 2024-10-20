package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Dzj.class */
public final class Dzj extends C1rj {
    public static final int A0c;
    public static final ColorStateList A0d;
    public static final ColorStateList A0e;
    public static final Typeface A0f;
    public static final Typeface A0g;
    public static final Layout.Alignment A0h;
    public static final Integer A0i;
    public static final int[] A0j;
    public static final int[] A0k;
    public static final Layout.Alignment[] A0l = Layout.Alignment.values();
    public static final TextUtils.TruncateAt[] A0m = TextUtils.TruncateAt.values();
    public static final int[][] A0n;
    public static final int[][] A0o;
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
    public ColorStateList A0J;
    public Typeface A0K;
    public Layout.Alignment A0L;
    public TextUtils.TruncateAt A0M;
    public TextView.OnEditorActionListener A0N;
    public 1Im A0O;
    public 1Im A0P;
    public C2ko A0Q;
    public C2ko A0R;
    public C2ko A0S;
    public CharSequence A0T;
    public CharSequence A0U;
    public CharSequence A0V;
    public Integer A0W;
    public List A0X;
    public List A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;

    /* JADX WARN: Type inference failed for: r0v15, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int[], int[][]] */
    static {
        Typeface typeface = Typeface.DEFAULT;
        A0f = typeface;
        ?? r0 = {DKC.A1b(0)};
        A0o = r0;
        int[] iArr = {-16777216};
        A0k = iArr;
        ?? r02 = {DKC.A1b(0)};
        A0n = r02;
        int[] iArr2 = {-3355444};
        A0j = iArr2;
        A0d = new ColorStateList(r0, iArr);
        A0e = new ColorStateList(r02, iArr2);
        A0c = typeface.getStyle();
        A0g = typeface;
        A0h = Layout.Alignment.ALIGN_NORMAL;
        A0i = 0S2.A00;
    }

    public Dzj() {
        super("EditText");
        this.A0Z = true;
        this.A04 = 8388627;
        this.A06 = 0;
        this.A0I = A0e;
        this.A07 = 0;
        this.A0X = Collections.emptyList();
        this.A08 = 131073;
        this.A09 = 0;
        int i = (-1) >>> 1;
        this.A0A = i;
        this.A0B = i;
        this.A0C = (-1) << (-1);
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -7829368;
        this.A03 = 1.0f;
        this.A0W = A0i;
        this.A0L = A0h;
        this.A0F = 0;
        this.A0J = A0d;
        this.A0G = -1;
        this.A0H = A0c;
        this.A0Y = Collections.emptyList();
        this.A0K = A0g;
    }

    public static DuQ A00(1Iw r301, int i) {
        Dzj dzj = new Dzj();
        C1rs c1rs = new C1rs(dzj, r301, 0, i);
        ((DuQ) c1rs).A01 = dzj;
        ((DuQ) c1rs).A00 = r301;
        return c1rs;
    }

    public static void A01(ColorStateList colorStateList, ColorStateList colorStateList2, Typeface typeface, Layout.Alignment alignment, TextUtils.TruncateAt truncateAt, EditText editText, TextView.OnEditorActionListener onEditorActionListener, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List list, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z, boolean z2, boolean z3) {
        InputFilter[] inputFilterArr;
        float f5 = i9;
        int i15 = 0;
        if (i9 == -1) {
            f5 = 14.0f;
            i15 = 2;
        }
        editText.setTextSize(i15, f5);
        int i16 = z ? i13 & (-131073) : i13 | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        if (i16 != editText.getInputType()) {
            editText.setSingleLine(z);
            editText.setInputType(i16);
        }
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(i3);
        if (list == null) {
            inputFilterArr = new InputFilter[]{lengthFilter};
        } else {
            ArrayList A17 = 1BK.A17(list);
            A17.add(lengthFilter);
            inputFilterArr = (InputFilter[]) A17.toArray(new InputFilter[A17.size()]);
        }
        editText.setFilters(inputFilterArr);
        if (!(charSequence instanceof String) || !charSequence.equals(AbM.A0u(editText))) {
            editText.setText(charSequence);
        } else if (charSequence2 != null) {
            editText.setText(charSequence2);
        }
        CharSequence hint = editText.getHint();
        if (hint != charSequence3 && (hint == null || !hint.equals(charSequence3))) {
            editText.setHint(charSequence3);
        }
        editText.setEllipsize(truncateAt);
        editText.setMinLines(i);
        editText.setMaxLines(i2);
        editText.setShadowLayer(f, f2, f3, i4);
        editText.setLinkTextColor(i7);
        editText.setHighlightColor(i8);
        editText.setLineSpacing(0.0f, f4);
        editText.setTypeface(typeface, i10);
        editText.setGravity(i11);
        editText.setImeOptions(i14);
        editText.setOnEditorActionListener(onEditorActionListener);
        editText.setFocusable(z2);
        editText.setFocusableInTouchMode(z2);
        editText.setClickable(z2);
        editText.setLongClickable(z2);
        editText.setCursorVisible(z2);
        Editable text = editText.getText();
        int length = text != null ? text.length() : -1;
        if (i12 > -1 && i12 <= length) {
            editText.setSelection(i12);
        }
        if (i5 != 0 || colorStateList == null) {
            editText.setTextColor(i5);
        } else {
            editText.setTextColor(colorStateList);
        }
        if (i6 != 0 || colorStateList2 == null) {
            editText.setHintTextColor(i6);
        } else {
            editText.setHintTextColor(colorStateList2);
        }
        if (z3) {
            editText.requestFocus();
        }
        int i17 = EZz.A00[alignment.ordinal()];
        if (i17 == 1) {
            editText.setTextAlignment(2);
            return;
        }
        int i18 = 3;
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            } else {
                i18 = 4;
            }
        }
        editText.setTextAlignment(i18);
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new DPl(context);
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        int i = c2ko.A02;
        if (i == -1050780906) {
            1Iw r0 = c2ko.A00;
            View view = (View) 4YU.A0P(r0).A02.get();
            if (view == null) {
                return null;
            }
            view.clearFocus();
            7zR.A12(view, AbI.A06(r0.A0D));
            return null;
        }
        if (i != 638451776) {
            if (i != 1670729240) {
                return null;
            }
            1Iw r02 = c2ko.A00;
            View view2 = (View) 4YU.A0P(r02).A02.get();
            if (view2 == null || !view2.requestFocus()) {
                return null;
            }
            AbI.A06(r02.A0D).showSoftInput(view2, 0);
            return null;
        }
        1Iw r03 = c2ko.A00;
        CharSequence charSequence = ((C6rc) obj).A00;
        AtomicReference atomicReference = 4YU.A0P(r03).A02;
        1sP.A00();
        if (r03.A02 != null) {
            4YV.A1F(r03, charSequence, (-1) << (-1));
        }
        TextView textView = (TextView) atomicReference.get();
        if (textView == null) {
            return null;
        }
        textView.setText(charSequence);
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
        Integer num10 = null;
        TypedArray A02 = r302.A02(0, C53r.A04);
        int indexCount = A02.getIndexCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= indexCount) {
                A02.recycle();
                if (truncateAt != null) {
                    this.A0M = truncateAt;
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
                    this.A0a = bool.booleanValue();
                }
                if (str != null) {
                    this.A0V = str;
                }
                if (colorStateList != null) {
                    this.A0J = colorStateList;
                }
                if (num3 != null) {
                    this.A09 = num3.intValue();
                }
                if (num4 != null) {
                    this.A05 = num4.intValue();
                }
                if (num5 != null) {
                    this.A0G = num5.intValue();
                }
                if (alignment != null) {
                    this.A0L = alignment;
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
                if (num10 != null) {
                    this.A07 = num10.intValue();
                    return;
                }
                return;
            }
            int index = A02.getIndex(i2);
            if (index == 9) {
                str = A02.getString(index);
            } else if (index == 2) {
                colorStateList = A02.getColorStateList(index);
            } else if (index == 0) {
                num5 = Integer.valueOf(A02.getDimensionPixelSize(index, 0));
            } else if (index == 5) {
                int integer = A02.getInteger(index, 0);
                if (integer > 0) {
                    truncateAt = A0m[integer - 1];
                }
            } else if (index == 25) {
                switch (A02.getInt(index, -1)) {
                    case 2:
                    case 5:
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    case 3:
                    case 6:
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    case 4:
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        break;
                    default:
                        alignment = A0h;
                        break;
                }
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
                num9 = DKG.A10(A02, index, 0);
            } else if (index == 23) {
                num10 = DKG.A10(A02, index, 0);
            }
            i = i2 + 1;
        }
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A0R, this, r303);
        7zQ.A1H(r302, this.A0Q, this, r303);
        7zQ.A1H(r302, this.A0S, this, r303);
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        E0M A0P = 4YU.A0P(r302);
        CharSequence charSequence = this.A0V;
        CharSequence charSequence2 = this.A0U;
        CharSequence charSequence3 = this.A0T;
        TextUtils.TruncateAt truncateAt = this.A0M;
        int i3 = this.A0C;
        int i4 = this.A0B;
        int i5 = this.A0A;
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        int i6 = this.A0E;
        boolean z = this.A0a;
        int i7 = this.A0F;
        ColorStateList colorStateList = this.A0J;
        int i8 = this.A06;
        ColorStateList colorStateList2 = this.A0I;
        int i9 = this.A09;
        int i10 = this.A05;
        int i11 = this.A0G;
        float f4 = this.A03;
        int i12 = this.A0H;
        Typeface typeface = this.A0K;
        Layout.Alignment alignment = this.A0L;
        int i13 = this.A04;
        boolean z2 = this.A0Z;
        int i14 = this.A0D;
        int i15 = this.A08;
        int i16 = this.A07;
        TextView.OnEditorActionListener onEditorActionListener = this.A0N;
        boolean z3 = this.A0b;
        List list = this.A0X;
        CharSequence charSequence4 = A0P.A00;
        EditText editText = new EditText(r302.A0D);
        if (charSequence4 == null) {
            charSequence4 = charSequence;
        }
        A01(colorStateList, colorStateList2, typeface, alignment, truncateAt, editText, onEditorActionListener, charSequence4, charSequence2, charSequence3, list, f, f2, f3, f4, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, z, z2, z3);
        Drawable drawable = c27g.A00;
        if (drawable != null) {
            Rect A0C = DKC.A0C();
            drawable.getPadding(A0C);
            if (A0C.left != 0 || A0C.top != 0 || A0C.right != 0 || A0C.bottom != 0) {
                editText.setPadding(0, 0, 0, 0);
                editText.setBackground(null);
            }
        }
        DKF.A1I(editText, c23p, i, i2);
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DPl dPl = (DPl) obj;
        Integer num = this.A0W;
        List list = this.A0Y;
        dPl.A00 = r302;
        1LI r0 = r302.A02;
        dPl.A02 = r0 == null ? null : ((Dzj) r0).A0P;
        dPl.A01 = r0 == null ? null : ((Dzj) r0).A0O;
        dPl.A03 = num;
        FWw fWw = dPl.A04;
        fWw.A01 = list;
        dPl.addTextChangedListener(fWw);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        E0M A0P = 4YU.A0P(r302);
        EditText editText = (EditText) obj;
        CharSequence charSequence = this.A0V;
        CharSequence charSequence2 = this.A0U;
        CharSequence charSequence3 = this.A0T;
        TextUtils.TruncateAt truncateAt = this.A0M;
        int i = this.A0C;
        int i2 = this.A0B;
        int i3 = this.A0A;
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        int i4 = this.A0E;
        boolean z = this.A0a;
        int i5 = this.A0F;
        ColorStateList colorStateList = this.A0J;
        int i6 = this.A06;
        ColorStateList colorStateList2 = this.A0I;
        int i7 = this.A09;
        int i8 = this.A05;
        int i9 = this.A0G;
        float f4 = this.A03;
        int i10 = this.A0H;
        Typeface typeface = this.A0K;
        Layout.Alignment alignment = this.A0L;
        int i11 = this.A04;
        boolean z2 = this.A0Z;
        int i12 = this.A0D;
        int i13 = this.A08;
        int i14 = this.A07;
        TextView.OnEditorActionListener onEditorActionListener = this.A0N;
        boolean z3 = this.A0b;
        List list = this.A0X;
        AtomicReference atomicReference = A0P.A02;
        AtomicBoolean atomicBoolean = A0P.A01;
        CharSequence charSequence4 = A0P.A00;
        atomicReference.set(editText);
        if (charSequence4 == null) {
            charSequence4 = charSequence;
        }
        if (atomicBoolean.getAndSet(true)) {
            charSequence2 = null;
        }
        A01(colorStateList, colorStateList2, typeface, alignment, truncateAt, editText, onEditorActionListener, charSequence4, charSequence2, charSequence3, list, f, f2, f3, f4, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, z, z2, z3);
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DPl dPl = (DPl) obj;
        FWw fWw = dPl.A04;
        fWw.A01 = null;
        dPl.removeTextChangedListener(fWw);
        dPl.A03 = A0i;
        dPl.A00 = null;
        dPl.A02 = null;
        dPl.A01 = null;
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        4YU.A0P(r302).A02.set(null);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0M e0m = (E0M) r303;
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        e0m.A02 = atomicReference;
        e0m.A01 = atomicBoolean;
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
            Dzj dzj = (Dzj) r302;
            if (this.A0Z != dzj.A0Z) {
                return false;
            }
            TextView.OnEditorActionListener onEditorActionListener = this.A0N;
            TextView.OnEditorActionListener onEditorActionListener2 = dzj.A0N;
            if (onEditorActionListener != null) {
                if (!onEditorActionListener.equals(onEditorActionListener2)) {
                    return false;
                }
            } else if (onEditorActionListener2 != null) {
                return false;
            }
            TextUtils.TruncateAt truncateAt = this.A0M;
            TextUtils.TruncateAt truncateAt2 = dzj.A0M;
            if (truncateAt != null) {
                if (!truncateAt.equals(truncateAt2)) {
                    return false;
                }
            } else if (truncateAt2 != null) {
                return false;
            }
            if (Float.compare(0.0f, 0.0f) != 0 || this.A04 != dzj.A04 || this.A05 != dzj.A05) {
                return false;
            }
            CharSequence charSequence = this.A0T;
            CharSequence charSequence2 = dzj.A0T;
            if (charSequence != null) {
                if (!charSequence.equals(charSequence2)) {
                    return false;
                }
            } else if (charSequence2 != null) {
                return false;
            }
            if (this.A06 != dzj.A06) {
                return false;
            }
            ColorStateList colorStateList = this.A0I;
            ColorStateList colorStateList2 = dzj.A0I;
            if (colorStateList != null) {
                if (!colorStateList.equals(colorStateList2)) {
                    return false;
                }
            } else if (colorStateList2 != null) {
                return false;
            }
            if (this.A07 != dzj.A07) {
                return false;
            }
            CharSequence charSequence3 = this.A0U;
            CharSequence charSequence4 = dzj.A0U;
            if (charSequence3 != null) {
                if (!charSequence3.equals(charSequence4)) {
                    return false;
                }
            } else if (charSequence4 != null) {
                return false;
            }
            List list = this.A0X;
            List list2 = dzj.A0X;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            if (this.A08 != dzj.A08 || this.A0a != dzj.A0a || this.A09 != dzj.A09 || this.A0A != dzj.A0A || this.A0B != dzj.A0B || this.A0C != dzj.A0C || this.A0b != dzj.A0b || this.A0D != dzj.A0D || this.A0E != dzj.A0E || Float.compare(this.A00, dzj.A00) != 0 || Float.compare(this.A01, dzj.A01) != 0 || Float.compare(this.A02, dzj.A02) != 0 || Float.compare(this.A03, dzj.A03) != 0) {
                return false;
            }
            Integer num = this.A0W;
            Integer num2 = dzj.A0W;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
            CharSequence charSequence5 = this.A0V;
            CharSequence charSequence6 = dzj.A0V;
            if (charSequence5 != null) {
                if (!charSequence5.equals(charSequence6)) {
                    return false;
                }
            } else if (charSequence6 != null) {
                return false;
            }
            Layout.Alignment alignment = this.A0L;
            Layout.Alignment alignment2 = dzj.A0L;
            if (alignment != null) {
                if (!alignment.equals(alignment2)) {
                    return false;
                }
            } else if (alignment2 != null) {
                return false;
            }
            if (this.A0F != dzj.A0F) {
                return false;
            }
            ColorStateList colorStateList3 = this.A0J;
            ColorStateList colorStateList4 = dzj.A0J;
            if (colorStateList3 != null) {
                if (!colorStateList3.equals(colorStateList4)) {
                    return false;
                }
            } else if (colorStateList4 != null) {
                return false;
            }
            if (this.A0G != dzj.A0G || this.A0H != dzj.A0H) {
                return false;
            }
            List list3 = this.A0Y;
            List list4 = dzj.A0Y;
            if (list3 != null) {
                if (!list3.equals(list4)) {
                    return false;
                }
            } else if (list4 != null) {
                return false;
            }
            Typeface typeface = this.A0K;
            Typeface typeface2 = dzj.A0K;
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
