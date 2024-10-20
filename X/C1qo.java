package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.1qo, reason: invalid class name */
/* loaded from: 1qo.class */
public final class C1qo {
    public final Context A00;
    public final Resources A01;
    public final Resources.Theme A02;
    public final C1qh A03;

    public C1qo(Context context, C1qh c1qh) {
        11T.A0F(c1qh, 2);
        this.A00 = context;
        this.A03 = c1qh;
        Resources resources = context.getResources();
        11T.A0A(resources);
        this.A01 = resources;
        Resources.Theme theme = context.getTheme();
        11T.A0A(theme);
        this.A02 = theme;
    }

    public final float A00(int i) {
        return i / this.A01.getDisplayMetrics().density;
    }

    public final float A01(int i) {
        C1qh c1qh = this.A03;
        Number number = (Number) ((C1qj) c1qh).A00.A03(Integer.valueOf(i));
        if (number != null) {
            return number.floatValue();
        }
        float dimension = this.A01.getDimension(i);
        c1qh.A00(i, Float.valueOf(dimension));
        return dimension;
    }

    public int A02(float f) {
        return AnonymousClass272.A00(f * this.A01.getDisplayMetrics().density);
    }

    public int A03(float f) {
        return AnonymousClass272.A00(f * this.A01.getDisplayMetrics().scaledDensity);
    }

    public final int A04(int i) {
        if (i == 0) {
            return 0;
        }
        C1qh c1qh = this.A03;
        Number number = (Number) ((C1qj) c1qh).A00.A03(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        int color = this.A00.getColor(i);
        c1qh.A00(i, Integer.valueOf(color));
        return color;
    }

    public final int A05(int i) {
        TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes(new int[]{i});
        11T.A0A(obtainStyledAttributes);
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final int A06(int i) {
        if (i == 0) {
            return 0;
        }
        C1qh c1qh = this.A03;
        Number number = (Number) ((C1qj) c1qh).A00.A03(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        int dimensionPixelSize = this.A01.getDimensionPixelSize(i);
        c1qh.A00(i, Integer.valueOf(dimensionPixelSize));
        return dimensionPixelSize;
    }

    public final int A07(int i) {
        C1qh c1qh = this.A03;
        Number number = (Number) ((C1qj) c1qh).A00.A03(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        int integer = this.A01.getInteger(i);
        c1qh.A00(i, Integer.valueOf(integer));
        return integer;
    }

    public final int A08(int i) {
        TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes(new int[]{i});
        11T.A0A(obtainStyledAttributes);
        try {
            return obtainStyledAttributes.getResourceId(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final int A09(int i, int i2) {
        TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes(new int[]{i});
        11T.A0A(obtainStyledAttributes);
        try {
            return obtainStyledAttributes.getColor(0, A04(i2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final Drawable A0A(int i) {
        TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes(new int[]{i});
        11T.A0A(obtainStyledAttributes);
        try {
            return A0B(obtainStyledAttributes.getResourceId(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final Drawable A0B(int i) {
        if (i == 0) {
            return null;
        }
        return this.A00.getDrawable(i);
    }

    public final CharSequence A0C(int i) {
        if (i == 0) {
            return null;
        }
        C1qh c1qh = this.A03;
        CharSequence charSequence = (CharSequence) ((C1qj) c1qh).A00.A03(Integer.valueOf(i));
        if (charSequence == null) {
            charSequence = this.A01.getText(i);
            11T.A0A(charSequence);
            c1qh.A00(i, charSequence);
        }
        return charSequence;
    }

    public final String A0D(int i) {
        if (i == 0) {
            return null;
        }
        C1qh c1qh = this.A03;
        String str = (String) ((C1qj) c1qh).A00.A03(Integer.valueOf(i));
        if (str == null) {
            str = this.A01.getString(i);
            11T.A0A(str);
            c1qh.A00(i, str);
        }
        return str;
    }

    public final String A0E(int i, Object... objArr) {
        11T.A0F(objArr, 1);
        if (i != 0) {
            return this.A01.getString(i, Arrays.copyOf(objArr, objArr.length));
        }
        return null;
    }
}
