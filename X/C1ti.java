package X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.acra.util.StatFsUtil;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.List;

/* renamed from: X.1ti, reason: invalid class name */
/* loaded from: 1ti.class */
public final class C1ti implements C1tj, 1Ip {
    public int A00;
    public int A01;
    public int A02;
    public Rect A03;
    public Drawable A04;
    public SparseArray A05;
    public C1tk A06;
    public 2cS A07;
    public 29K A08;
    public String A09;
    public boolean A0A;

    /* JADX WARN: Type inference failed for: r302v2, types: [java.lang.Object, X.1tk] */
    public static final C1tk A00(C1ti c1ti) {
        C1tk c1tk = c1ti.A06;
        C1tk c1tk2 = c1tk;
        if (c1tk == null) {
            ?? obj = new Object();
            c1ti.A06 = obj;
            c1tk2 = obj;
        }
        return c1tk2;
    }

    public static final 2cS A01(C1ti c1ti) {
        2cS r302 = c1ti.A07;
        if (r302 == null) {
            r302 = new 2cS();
            c1ti.A07 = r302;
        }
        return r302;
    }

    public static final 29K A02(C1ti c1ti) {
        29K r302 = c1ti.A08;
        if (r302 == null) {
            r302 = new 29K();
            c1ti.A08 = r302;
        }
        return r302;
    }

    public void A03(float f) {
        C1tk A00 = A00(this);
        A00.A0I |= 128;
        A00.A05 = f;
    }

    public void A04(float f) {
        C1tk A00 = A00(this);
        A00.A0I |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        A00.A06 = f;
    }

    public void A05(float f) {
        C1tk A00 = A00(this);
        A00.A0I |= 32;
        A00.A07 = f;
    }

    public void A06(float f) {
        C1tk A00 = A00(this);
        A00.A0I |= 512;
        A00.A08 = f;
    }

    public void A07(float f) {
        C1tk A00 = A00(this);
        A00.A0I |= 8;
        A00.A09 = f;
    }

    public void A08(float f) {
        C1tk A00 = A00(this);
        A00.A0I |= 2;
        A00.A0A = f;
    }

    public final void A09(float f) {
        29K A02 = A02(this);
        A02.A00 = f;
        long j = A02.A0F;
        A02.A0F = f == 1.0f ? j & 4293918719L : j | StatFsUtil.IN_MEGA_BYTE;
        int i = this.A02;
        int i2 = i | 8;
        if (f == 1.0f) {
            i2 = i & (-9);
        }
        this.A02 = i2;
    }

    public final void A0A(float f) {
        29K A02 = A02(this);
        A02.A01 = f;
        long j = A02.A0F;
        A02.A0F = f == 0.0f ? j & 4292870143L : j | 2097152;
        int i = this.A02;
        int i2 = i | 16;
        if (f == 0.0f) {
            i2 = i & (-17);
        }
        this.A02 = i2;
    }

    public final void A0B(float f) {
        29K A02 = A02(this);
        A02.A04 = f;
        long j = A02.A0F;
        A02.A0F = f == 1.0f ? j & 4294443007L : j | 524288;
        int i = this.A02;
        int i2 = i | 4;
        if (f == 1.0f) {
            i2 = i & (-5);
        }
        this.A02 = i2;
    }

    public final void A0C(float f) {
        29K A02 = A02(this);
        A02.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED;
        A02.A05 = f;
    }

    public void A0D(int i) {
        C1tk A00 = A00(this);
        A00.A0I |= 64;
        A00.A0D = i;
    }

    public void A0E(int i) {
        C1tk A00 = A00(this);
        A00.A0I |= 1024;
        A00.A0E = i;
    }

    public void A0F(int i) {
        C1tk A00 = A00(this);
        A00.A0I |= 16;
        A00.A0F = i;
    }

    public void A0G(int i) {
        C1tk A00 = A00(this);
        A00.A0I |= 256;
        A00.A0G = i;
    }

    public void A0H(int i) {
        C1tk A00 = A00(this);
        A00.A0I |= 4;
        A00.A0H = i;
    }

    public void A0I(int i) {
        C1tk A00 = A00(this);
        A00.A0I |= 1;
        A00.A0J = i;
    }

    public final void A0J(Drawable drawable) {
        this.A02 |= 1;
        this.A04 = drawable;
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            if (rect.bottom == 0 && rect.top == 0 && rect.left == 0 && rect.right == 0) {
                return;
            }
            this.A03 = rect;
        }
    }

    public final void A0K(ViewOutlineProvider viewOutlineProvider) {
        29K A02 = A02(this);
        A02.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED;
        A02.A0H = viewOutlineProvider;
    }

    public final void A0L(1Iw r302, C1sr c1sr) {
        Drawable drawable;
        Drawable drawable2;
        2cN r0;
        C1tr c1tr;
        int i = this.A00;
        int i2 = this.A01;
        if (i != 0 || i2 != 0) {
            r302.A00 = i;
            r302.A01 = i2;
            Context context = r302.A0D;
            11T.A0F(context, 0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C53r.A00, i, i2);
            11T.A0A(obtainStyledAttributes);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 18) {
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c1sr.A06 |= 128;
                    c1sr.A03 = i4;
                } else if (index == 6) {
                    c1sr.A0k = obtainStyledAttributes.getBoolean(index, false);
                } else {
                    float f = 0.0f / 0.0f;
                    if (index == 0) {
                        if (KxN.A00(obtainStyledAttributes, 0)) {
                            drawable2 = new ColorDrawable(obtainStyledAttributes.getColor(index, 0));
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            drawable2 = resourceId == 0 ? null : context.getDrawable(resourceId);
                        }
                        c1sr.A06 |= 262144;
                        c1sr.A0B = drawable2;
                    } else if (index == 14) {
                        if (KxN.A00(obtainStyledAttributes, 14)) {
                            drawable = new ColorDrawable(obtainStyledAttributes.getColor(index, 0));
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            drawable = resourceId2 == 0 ? null : context.getDrawable(resourceId2);
                        }
                        c1sr.A06 |= 524288;
                        c1sr.A0C = drawable;
                    } else if (index == 17) {
                        29K A00 = C1sr.A00(c1sr);
                        String string = obtainStyledAttributes.getString(index);
                        A00.A0F |= 1;
                        A00.A0a = string;
                    }
                }
            }
            obtainStyledAttributes.recycle();
            r302.A00 = 0;
            r302.A01 = 0;
        }
        29K r02 = this.A08;
        if (r02 != null) {
            if (c1sr.A0o || c1sr.A0N != null) {
                r02.A01(C1sr.A00(c1sr));
            } else {
                c1sr.A0N = r02;
            }
        }
        int i5 = this.A02;
        if ((i5 & 1) != 0) {
            Drawable drawable3 = this.A04;
            c1sr.A06 |= 262144;
            c1sr.A0B = drawable3;
            c1sr.A0A = this.A03;
        }
        C1tk c1tk = this.A06;
        if (c1tk != null && (c1tr = c1tk.A0Q) != null) {
            int i6 = c1tr.A00;
            c1sr.A06 |= 1;
            c1sr.A0Q = new C1tr(i6);
        }
        if ((i5 & 2) != 0) {
            c1sr.A0Y = this.A09;
        }
        if (this.A0A || (i5 & 28) != 0) {
            c1sr.A0l = true;
        }
        2cS r03 = this.A07;
        if (r03 != null) {
            int i7 = r03.A04;
            if ((i7 & 1) != 0) {
                int i8 = r03.A02;
                c1sr.A06 |= 128;
                c1sr.A03 = i8;
            }
            if ((i7 & 2) != 0) {
                c1sr.A0k = r03.A0M;
            }
            if ((262144 & i7) != 0) {
                boolean z = r03.A0L;
                c1sr.A06 |= 8589934592L;
                c1sr.A0j = z;
            }
            if ((i7 & 4) != 0) {
                Drawable drawable4 = r03.A07;
                c1sr.A06 |= 524288;
                c1sr.A0C = drawable4;
            }
            if ((i7 & 1024) != 0) {
                c1sr.A0l = true;
            }
            if ((i7 & 8) != 0) {
                1Im r04 = r03.A0F;
                c1sr.A06 |= StatFsUtil.IN_MEGA_BYTE;
                c1sr.A0K = 1tY.A01(c1sr.A0K, r04);
            }
            if ((r03.A04 & 16) != 0) {
                1Im r05 = r03.A0A;
                c1sr.A06 |= 2097152;
                c1sr.A0F = 1tY.A01(c1sr.A0F, r05);
            }
            if ((r03.A04 & 32) != 0) {
                1Im r06 = r03.A0B;
                c1sr.A06 |= 4194304;
                c1sr.A0G = 1tY.A01(c1sr.A0G, r06);
            }
            if ((r03.A04 & 64) != 0) {
                1Im r07 = r03.A0C;
                c1sr.A06 |= 8388608;
                c1sr.A0H = 1tY.A01(c1sr.A0H, r07);
            }
            if ((r03.A04 & 128) != 0) {
                1Im r08 = r03.A0D;
                c1sr.A06 |= 16777216;
                c1sr.A0I = 1tY.A01(c1sr.A0I, r08);
            }
            if ((r03.A04 & 65536) != 0) {
                1Im r09 = r03.A0E;
                c1sr.A06 |= 2147483648L;
                c1sr.A0J = 1tY.A01(c1sr.A0J, r09);
            }
            int i9 = r03.A04;
            if ((i9 & 512) != 0) {
                String str = r03.A0H;
                String str2 = r03.A0I;
                if (str != null && str.length() != 0) {
                    c1sr.A06 |= 134217728;
                    c1sr.A0Z = str;
                    c1sr.A0a = str2;
                }
            }
            if ((131072 & i9) != 0) {
                5Rn r010 = r03.A0G;
                c1sr.A06 |= 4294967296L;
                c1sr.A0O = r010;
            }
            if ((i9 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                c1sr.A00 = r03.A00;
            }
            if ((i9 & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
                c1sr.A01 = r03.A01;
            }
            if ((i9 & 256) != 0 && (r0 = r03.A09) != null) {
                int i10 = 2cN.A03;
                for (int i11 = 0; i11 < i10; i11++) {
                    float A002 = r0.A00(i11);
                    if (!26R.A00(A002)) {
                        C26z A003 = C26z.A00(i11);
                        11T.A0A(A003);
                        int i12 = (int) A002;
                        2cN r313 = c1sr.A0E;
                        if (r313 == null) {
                            r313 = new 2cN();
                            c1sr.A0E = r313;
                        }
                        c1sr.A06 |= 33554432;
                        if (r313 != null) {
                            r313.A02(A003, i12);
                        }
                    }
                }
            }
            if ((r03.A04 & 8192) != 0) {
                C6ni c6ni = r03.A08;
                c6ni.getClass();
                c1sr.A0B(c6ni.A00, c6ni.A01, c6ni.A03, c6ni.A02);
            }
            int i13 = r03.A04;
            if ((i13 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
                StateListAnimator stateListAnimator = r03.A05;
                c1sr.A06 |= 536870912;
                c1sr.A07 = stateListAnimator;
                c1sr.A0l = true;
            }
            if ((i13 & Constants.LOAD_RESULT_PGO) != 0) {
                c1sr.A06 |= 1073741824;
                c1sr.A05 = 0;
                c1sr.A0l = true;
            }
            int i14 = r03.A03;
            Paint paint = r03.A06;
            float f2 = 0.0f / 0.0f;
            if (i14 != -1) {
                c1sr.A04 = i14;
                c1sr.A08 = paint;
            }
            List list = r03.A0J;
            if (list != null) {
                List list2 = c1sr.A0c;
                if (list2 == null) {
                    list2 = AnonymousClass001.A0s();
                    c1sr.A0c = list2;
                }
                list2.addAll(list);
            }
        }
    }

    public final void A0M(1Im r302) {
        29K A02 = A02(this);
        A02.A0F |= 8;
        A02.A0I = r302;
    }

    public void A0N(C26z c26z) {
        11T.A0F(c26z, 0);
        C1tk A00 = A00(this);
        A00.A0I |= 134217728;
        List list = A00.A0U;
        if (list == null) {
            list = AnonymousClass001.A0t(2);
        }
        list.add(c26z);
        A00.A0U = list;
    }

    public void A0O(C26z c26z, float f) {
        11T.A0F(c26z, 0);
        C1tk A00 = A00(this);
        A00.A0I |= 67108864;
        2cN r307 = A00.A0K;
        if (r307 == null) {
            r307 = new 2cN();
        }
        r307.A02(c26z, f);
        A00.A0K = r307;
    }

    public void A0P(C26z c26z, float f) {
        11T.A0F(c26z, 0);
        C1tk A00 = A00(this);
        A00.A0I |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        2cN r307 = A00.A0M;
        if (r307 == null) {
            r307 = new 2cN();
        }
        r307.A02(c26z, f);
        A00.A0M = r307;
    }

    public void A0Q(C26z c26z, int i) {
        C1tk A00 = A00(this);
        A00.A0I |= 33554432;
        2cN r308 = A00.A0L;
        if (r308 == null) {
            r308 = new 2cN();
        }
        r308.A02(c26z, i);
        A00.A0L = r308;
    }

    public void A0R(C26z c26z, int i) {
        C1tk A00 = A00(this);
        A00.A0I |= 2097152;
        2cN r308 = A00.A0P;
        if (r308 == null) {
            r308 = new 2cN();
        }
        r308.A02(c26z, i);
        A00.A0P = r308;
    }

    public final void A0S(C26z c26z, int i) {
        2cS A01 = A01(this);
        A01.A04 |= 256;
        2cN r306 = A01.A09;
        if (r306 == null) {
            r306 = new 2cN();
        }
        r306.A02(c26z, i);
        A01.A09 = r306;
    }

    public void A0T(3Dx r302, int i) {
        C1tk A00 = A00(this);
        A00.A0S = r302;
        A00.A0C = i;
    }

    public void A0U(boolean z) {
        A00(this).A0W = z;
    }

    /* renamed from: A0V, reason: merged with bridge method [inline-methods] */
    public boolean BSF(C1ti c1ti) {
        return this == c1ti || (c1ti != null && this.A02 == c1ti.A02 && this.A0A == c1ti.A0A && this.A00 == c1ti.A00 && this.A01 == c1ti.A01 && C4Da.A00(this.A04, c1ti.A04) && C28q.A01(this.A07, c1ti.A07) && C28q.A01(this.A08, c1ti.A08) && C28q.A01(this.A06, c1ti.A06) && 11T.A0O(this.A09, c1ti.A09) && C28q.A00(this.A05, c1ti.A05));
    }

    @Override // X.C1tj
    public void CWc(C26z c26z, int i) {
        11T.A0F(c26z, 0);
        A00(this).CWc(c26z, i);
    }
}
