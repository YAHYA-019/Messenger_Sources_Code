package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.53e, reason: invalid class name */
/* loaded from: 53e.class */
public final class C53e extends C53f {
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public JVI A00;
    public ColorFilter A01;
    public PorterDuffColorFilter A02;
    public boolean A03;
    public boolean A04;
    public final Matrix A05;
    public final Rect A06;
    public final float[] A07;

    public C53e() {
        this.A03 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A00 = new JVI();
    }

    public C53e(JVI jvi) {
        this.A03 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A00 = jvi;
        this.A02 = A01(jvi.A03, jvi.A07);
    }

    public static float A00(TypedArray typedArray, String str, XmlPullParser xmlPullParser, float f, int i) {
        return !A03(str, xmlPullParser) ? f : typedArray.getFloat(i, f);
    }

    private PorterDuffColorFilter A01(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0442, code lost:
    
        new org.xmlpull.v1.XmlPullParserException(X.0Pz.A0W(r0.getPositionDescription(), ": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.Kib A02(android.content.res.Resources.Theme r301, android.content.res.TypedArray r302, java.lang.String r303, org.xmlpull.v1.XmlPullParser r304, int r305) {
        /*
            Method dump skipped, instructions count: 1543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53e.A02(android.content.res.Resources$Theme, android.content.res.TypedArray, java.lang.String, org.xmlpull.v1.XmlPullParser, int):X.Kib");
    }

    public static boolean A03(String str, XmlPullParser xmlPullParser) {
        return AnonymousClass001.A1T(xmlPullParser.getAttributeValue(AnonymousClass000.A00(58), str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0199. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.L7S[] A04(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53e.A04(java.lang.String):X.L7S[]");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = super.A00;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A06;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.A01;
        if (colorFilter == null) {
            colorFilter = this.A02;
        }
        Matrix matrix = this.A05;
        canvas.getMatrix(matrix);
        float[] fArr = this.A07;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int height = (int) (rect.height() * abs2);
        int min = Math.min(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, width);
        int min2 = Math.min(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, height);
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        JVI jvi = this.A00;
        Bitmap bitmap = jvi.A04;
        if (bitmap == null || min != bitmap.getWidth() || min2 != jvi.A04.getHeight()) {
            jvi.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            jvi.A0A = true;
        }
        boolean z = this.A03;
        JVI jvi2 = this.A00;
        if (!z) {
            jvi2.A00(min, min2);
        } else if (jvi2.A0A || jvi2.A02 != jvi2.A03 || jvi2.A06 != jvi2.A07 || jvi2.A0B != jvi2.A09 || jvi2.A00 != jvi2.A08.A04) {
            jvi2.A00(min, min2);
            JVI jvi3 = this.A00;
            jvi3.A02 = jvi3.A03;
            jvi3.A06 = jvi3.A07;
            jvi3.A00 = jvi3.A08.A04;
            jvi3.A0B = jvi3.A09;
            jvi3.A0A = false;
        }
        JVI jvi4 = this.A00;
        if (jvi4.A08.A04 < 255 || colorFilter != null) {
            if (jvi4.A05 == null) {
                Paint paint2 = new Paint();
                jvi4.A05 = paint2;
                paint2.setFilterBitmap(true);
            }
            jvi4.A05.setAlpha(jvi4.A08.A04);
            jvi4.A05.setColorFilter(colorFilter);
            paint = jvi4.A05;
        } else {
            paint = null;
        }
        canvas.drawBitmap(jvi4.A04, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getAlpha() : this.A00.A08.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getColorFilter() : this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return new JVK(drawable.getConstantState());
        }
        this.A00.A01 = getChangingConfigurations();
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.A00.A08.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.A00.A08.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        C3083Jil c3083Jil;
        int i4;
        int i5;
        ColorStateList A01;
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        JVI jvi = this.A00;
        jvi.A08 = new LBL();
        int[] iArr = C7nJ.A03;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        JVI jvi2 = this.A00;
        LBL lbl = jvi2.A08;
        float f = 0.0f / 0.0f;
        if (A03("tintMode", xmlPullParser)) {
            i = obtainAttributes.getInt(6, -1);
        } else {
            i = -1;
            float f2 = 0.0f / 0.0f;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        jvi2.A07 = mode;
        if (A03("tint", xmlPullParser)) {
            TypedValue typedValue = new TypedValue();
            obtainAttributes.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Failed to resolve attribute at index ");
                A0k.append(1);
                throw AnonymousClass001.A0q(AnonymousClass001.A0Z(typedValue, ": ", A0k));
            }
            if (i6 < 28 || i6 > 31) {
                Resources resources2 = obtainAttributes.getResources();
                try {
                    A01 = L6O.A01(theme, resources2, resources2.getXml(obtainAttributes.getResourceId(1, 0)));
                } catch (Exception e) {
                    android.util.Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                A01 = ColorStateList.valueOf(typedValue.data);
            }
            if (A01 != null) {
                jvi2.A03 = A01;
            }
        }
        boolean z = jvi2.A09;
        if (A03("autoMirrored", xmlPullParser)) {
            z = obtainAttributes.getBoolean(5, z);
        }
        jvi2.A09 = z;
        lbl.A03 = A00(obtainAttributes, "viewportWidth", xmlPullParser, lbl.A03, 7);
        float A00 = A00(obtainAttributes, "viewportHeight", xmlPullParser, lbl.A02, 8);
        lbl.A02 = A00;
        if (lbl.A03 <= 0.0f) {
            throw new XmlPullParserException(0Pz.A0W(obtainAttributes.getPositionDescription(), "<vector> tag requires viewportWidth > 0"));
        }
        if (A00 <= 0.0f) {
            throw new XmlPullParserException(0Pz.A0W(obtainAttributes.getPositionDescription(), "<vector> tag requires viewportHeight > 0"));
        }
        lbl.A01 = obtainAttributes.getDimension(3, lbl.A01);
        float dimension = obtainAttributes.getDimension(2, lbl.A00);
        lbl.A00 = dimension;
        if (lbl.A01 <= 0.0f) {
            throw new XmlPullParserException(0Pz.A0W(obtainAttributes.getPositionDescription(), "<vector> tag requires width > 0"));
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(0Pz.A0W(obtainAttributes.getPositionDescription(), "<vector> tag requires height > 0"));
        }
        lbl.setAlpha(A00(obtainAttributes, "alpha", xmlPullParser, lbl.getAlpha(), 4));
        String string = obtainAttributes.getString(0);
        if (string != null) {
            lbl.A09 = string;
            lbl.A0E.put(string, lbl);
        }
        obtainAttributes.recycle();
        jvi.A01 = getChangingConfigurations();
        jvi.A0A = true;
        JVI jvi3 = this.A00;
        LBL lbl2 = jvi3.A08;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(lbl2.A0F);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C3082Jik c3082Jik = (C3082Jik) arrayDeque.peek();
                if (c3082Jik != null) {
                    if ("path".equals(name)) {
                        C3084Jim c3084Jim = new C3084Jim();
                        int[] iArr2 = C7nJ.A02;
                        TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                        c3084Jim.A0B = null;
                        if (A03("pathData", xmlPullParser)) {
                            String string2 = obtainAttributes2.getString(0);
                            if (string2 != null) {
                                ((AbstractC3085Jin) c3084Jim).A02 = string2;
                            }
                            String string3 = obtainAttributes2.getString(2);
                            if (string3 != null) {
                                ((AbstractC3085Jin) c3084Jim).A03 = A04(string3);
                            }
                            c3084Jim.A09 = A02(theme, obtainAttributes2, "fillColor", xmlPullParser, 1);
                            c3084Jim.A00 = A00(obtainAttributes2, "fillAlpha", xmlPullParser, c3084Jim.A00, 12);
                            float f3 = 0.0f / 0.0f;
                            if (A03("strokeLineCap", xmlPullParser)) {
                                i4 = obtainAttributes2.getInt(8, -1);
                            } else {
                                i4 = -1;
                                float f4 = 0.0f / 0.0f;
                            }
                            Paint.Cap cap = c3084Jim.A07;
                            if (i4 == 0) {
                                cap = Paint.Cap.BUTT;
                            } else if (i4 == 1) {
                                cap = Paint.Cap.ROUND;
                            } else if (i4 == 2) {
                                cap = Paint.Cap.SQUARE;
                            }
                            c3084Jim.A07 = cap;
                            if (A03("strokeLineJoin", xmlPullParser)) {
                                i5 = obtainAttributes2.getInt(9, -1);
                            } else {
                                i5 = -1;
                                float f5 = 0.0f / 0.0f;
                            }
                            Paint.Join join = c3084Jim.A08;
                            if (i5 == 0) {
                                join = Paint.Join.MITER;
                            } else if (i5 == 1) {
                                join = Paint.Join.ROUND;
                            } else if (i5 == 2) {
                                join = Paint.Join.BEVEL;
                            }
                            c3084Jim.A08 = join;
                            c3084Jim.A02 = A00(obtainAttributes2, "strokeMiterLimit", xmlPullParser, c3084Jim.A02, 10);
                            c3084Jim.A0A = A02(theme, obtainAttributes2, "strokeColor", xmlPullParser, 3);
                            c3084Jim.A01 = A00(obtainAttributes2, "strokeAlpha", xmlPullParser, c3084Jim.A01, 11);
                            c3084Jim.A03 = A00(obtainAttributes2, "strokeWidth", xmlPullParser, c3084Jim.A03, 4);
                            c3084Jim.A04 = A00(obtainAttributes2, "trimPathEnd", xmlPullParser, c3084Jim.A04, 6);
                            c3084Jim.A05 = A00(obtainAttributes2, "trimPathOffset", xmlPullParser, c3084Jim.A05, 7);
                            c3084Jim.A06 = A00(obtainAttributes2, "trimPathStart", xmlPullParser, c3084Jim.A06, 5);
                            int i7 = ((AbstractC3085Jin) c3084Jim).A01;
                            if (A03("fillType", xmlPullParser)) {
                                i7 = obtainAttributes2.getInt(13, i7);
                            }
                            ((AbstractC3085Jin) c3084Jim).A01 = i7;
                        }
                        obtainAttributes2.recycle();
                        c3082Jik.A0C.add(c3084Jim);
                        String str = ((AbstractC3085Jin) c3084Jim).A02;
                        if (str != null) {
                            lbl2.A0E.put(str, c3084Jim);
                        }
                        z2 = false;
                        c3083Jil = c3084Jim;
                    } else if ("clip-path".equals(name)) {
                        C3083Jil c3083Jil2 = new C3083Jil();
                        if (A03("pathData", xmlPullParser)) {
                            int[] iArr3 = C7nJ.A00;
                            TypedArray obtainAttributes3 = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                            String string4 = obtainAttributes3.getString(0);
                            if (string4 != null) {
                                c3083Jil2.A02 = string4;
                            }
                            String string5 = obtainAttributes3.getString(1);
                            if (string5 != null) {
                                c3083Jil2.A03 = A04(string5);
                            }
                            c3083Jil2.A01 = !A03("fillType", xmlPullParser) ? 0 : obtainAttributes3.getInt(2, 0);
                            obtainAttributes3.recycle();
                        }
                        c3082Jik.A0C.add(c3083Jil2);
                        String str2 = c3083Jil2.A02;
                        c3083Jil = c3083Jil2;
                        if (str2 != null) {
                            lbl2.A0E.put(str2, c3083Jil2);
                            c3083Jil = c3083Jil2;
                        }
                    } else if ("group".equals(name)) {
                        C3082Jik c3082Jik2 = new C3082Jik();
                        int[] iArr4 = C7nJ.A01;
                        TypedArray obtainAttributes4 = theme == null ? resources.obtainAttributes(attributeSet, iArr4) : theme.obtainStyledAttributes(attributeSet, iArr4, 0, 0);
                        c3082Jik2.A09 = null;
                        c3082Jik2.A02 = A00(obtainAttributes4, "rotation", xmlPullParser, c3082Jik2.A02, 5);
                        c3082Jik2.A00 = obtainAttributes4.getFloat(1, c3082Jik2.A00);
                        c3082Jik2.A01 = obtainAttributes4.getFloat(2, c3082Jik2.A01);
                        c3082Jik2.A03 = A00(obtainAttributes4, "scaleX", xmlPullParser, c3082Jik2.A03, 3);
                        c3082Jik2.A04 = A00(obtainAttributes4, "scaleY", xmlPullParser, c3082Jik2.A04, 4);
                        c3082Jik2.A05 = A00(obtainAttributes4, "translateX", xmlPullParser, c3082Jik2.A05, 6);
                        c3082Jik2.A06 = A00(obtainAttributes4, "translateY", xmlPullParser, c3082Jik2.A06, 7);
                        String string6 = obtainAttributes4.getString(0);
                        if (string6 != null) {
                            c3082Jik2.A08 = string6;
                        }
                        C3082Jik.A00(c3082Jik2);
                        obtainAttributes4.recycle();
                        c3082Jik.A0C.add(c3082Jik2);
                        arrayDeque.push(c3082Jik2);
                        String str3 = c3082Jik2.A08;
                        if (str3 != null) {
                            lbl2.A0E.put(str3, c3082Jik2);
                        }
                        i2 = jvi3.A01;
                        i3 = c3082Jik2.A07;
                        jvi3.A01 = i3 | i2;
                    }
                    i2 = jvi3.A01;
                    i3 = c3083Jil.A00;
                    jvi3.A01 = i3 | i2;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.A02 = A01(jvi.A03, jvi.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.isAutoMirrored() : this.A00.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        JVI jvi = this.A00;
        if (jvi == null) {
            return false;
        }
        LBL lbl = jvi.A08;
        Boolean bool = lbl.A08;
        if (bool == null) {
            bool = Boolean.valueOf(lbl.A0F.A01());
            lbl.A08 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A00.A03;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.A04 && super.mutate() == this) {
            JVI jvi = this.A00;
            Drawable.ConstantState constantState = new Drawable.ConstantState();
            ((JVI) constantState).A03 = null;
            ((JVI) constantState).A07 = A08;
            if (jvi != null) {
                ((JVI) constantState).A01 = jvi.A01;
                LBL lbl = new LBL(jvi.A08);
                ((JVI) constantState).A08 = lbl;
                Paint paint = jvi.A08.A05;
                if (paint != null) {
                    lbl.A05 = new Paint(paint);
                }
                Paint paint2 = jvi.A08.A06;
                if (paint2 != null) {
                    ((JVI) constantState).A08.A06 = new Paint(paint2);
                }
                ((JVI) constantState).A03 = jvi.A03;
                ((JVI) constantState).A07 = jvi.A07;
                ((JVI) constantState).A09 = jvi.A09;
            }
            this.A00 = constantState;
            this.A04 = true;
            return this;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        JVI jvi = this.A00;
        ColorStateList colorStateList = jvi.A03;
        if (colorStateList != null && (mode = jvi.A07) != null) {
            this.A02 = A01(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        LBL lbl = jvi.A08;
        Boolean bool = lbl.A08;
        if (bool == null) {
            bool = Boolean.valueOf(lbl.A0F.A01());
            lbl.A08 = bool;
        }
        if (bool.booleanValue()) {
            boolean A02 = jvi.A08.A0F.A02(iArr);
            jvi.A0A |= A02;
            if (A02) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        LBL lbl = this.A00.A08;
        if (lbl.A04 != i) {
            lbl.A04 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A00.A09 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A01 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        JVI jvi = this.A00;
        if (jvi.A03 != colorStateList) {
            jvi.A03 = colorStateList;
            this.A02 = A01(colorStateList, jvi.A07);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        JVI jvi = this.A00;
        if (jvi.A07 != mode) {
            jvi.A07 = mode;
            this.A02 = A01(jvi.A03, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
