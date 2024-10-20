package X;

import android.R;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import com.facebook.resources.compat.RedexResourcesCompat;
import java.io.InputStream;

/* loaded from: F92.class */
public final class F92 {
    public ColorStateList A00;
    public final Context A01;
    public final SparseArray A02 = DKC.A0E();
    public final Resources A03;
    public static final PorterDuff.Mode A04 = PorterDuff.Mode.SRC_IN;
    public static final DdK A05 = new 1Xo(6);
    public static final int[] A09 = {2132344848, 2132410396, 2132410392, 2132410393, 2132410395, 2132410394, 2132344871, 2132344869, 2132344840};
    public static final int[] A08 = {2132344868, 2132344870, 2132344847};
    public static final int[] A07 = {2132344857, 2132410384, 2132344856};
    public static final int[] A0A = {2132410387, 2132410414, 2132410416, 2131230721, 2132410378, 2132410382, 2132410410, 2132344863, 2132410413, 2132410381, 2132410377};
    public static final int[] A06 = {2132410385};

    public F92(Context context) {
        this.A01 = context;
        final Resources resources = context.getResources();
        this.A03 = new Resources(resources, this) { // from class: X.32k
            public final Resources A00;
            public final F92 A01;

            {
                super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
                this.A00 = resources;
                this.A01 = this;
            }

            @Override // android.content.res.Resources
            public XmlResourceParser getAnimation(int i) {
                return this.A00.getAnimation(i);
            }

            @Override // android.content.res.Resources
            public boolean getBoolean(int i) {
                return this.A00.getBoolean(i);
            }

            @Override // android.content.res.Resources
            public int getColor(int i) {
                return this.A00.getColor(i);
            }

            @Override // android.content.res.Resources
            public ColorStateList getColorStateList(int i) {
                return this.A00.getColorStateList(i);
            }

            @Override // android.content.res.Resources
            public Configuration getConfiguration() {
                return this.A00.getConfiguration();
            }

            @Override // android.content.res.Resources
            public float getDimension(int i) {
                return this.A00.getDimension(i);
            }

            @Override // android.content.res.Resources
            public int getDimensionPixelOffset(int i) {
                return this.A00.getDimensionPixelOffset(i);
            }

            @Override // android.content.res.Resources
            public int getDimensionPixelSize(int i) {
                return this.A00.getDimensionPixelSize(i);
            }

            @Override // android.content.res.Resources
            public DisplayMetrics getDisplayMetrics() {
                return this.A00.getDisplayMetrics();
            }

            @Override // android.content.res.Resources
            public Drawable getDrawable(int i) {
                Drawable drawable = this.A00.getDrawable(i);
                if (drawable != null) {
                    this.A01.A01(drawable, i);
                }
                return drawable;
            }

            @Override // android.content.res.Resources
            public Drawable getDrawable(int i, Resources.Theme theme) {
                return this.A00.getDrawable(i, theme);
            }

            @Override // android.content.res.Resources
            public Drawable getDrawableForDensity(int i, int i2) {
                return this.A00.getDrawableForDensity(i, i2);
            }

            @Override // android.content.res.Resources
            public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
                return this.A00.getDrawableForDensity(i, i2, theme);
            }

            @Override // android.content.res.Resources
            public float getFraction(int i, int i2, int i3) {
                return this.A00.getFraction(i, i2, i3);
            }

            @Override // android.content.res.Resources
            public int getIdentifier(String str, String str2, String str3) {
                return RedexResourcesCompat.getIdentifier(this.A00, str, str2, str3);
            }

            @Override // android.content.res.Resources
            public int[] getIntArray(int i) {
                return this.A00.getIntArray(i);
            }

            @Override // android.content.res.Resources
            public int getInteger(int i) {
                return this.A00.getInteger(i);
            }

            @Override // android.content.res.Resources
            public XmlResourceParser getLayout(int i) {
                return this.A00.getLayout(i);
            }

            @Override // android.content.res.Resources
            public Movie getMovie(int i) {
                return this.A00.getMovie(i);
            }

            @Override // android.content.res.Resources
            public String getQuantityString(int i, int i2) {
                return this.A00.getQuantityString(i, i2);
            }

            @Override // android.content.res.Resources
            public String getQuantityString(int i, int i2, Object... objArr) {
                return this.A00.getQuantityString(i, i2, objArr);
            }

            @Override // android.content.res.Resources
            public CharSequence getQuantityText(int i, int i2) {
                return this.A00.getQuantityText(i, i2);
            }

            @Override // android.content.res.Resources
            public String getResourceEntryName(int i) {
                return this.A00.getResourceEntryName(i);
            }

            @Override // android.content.res.Resources
            public String getResourceName(int i) {
                return this.A00.getResourceName(i);
            }

            @Override // android.content.res.Resources
            public String getResourcePackageName(int i) {
                return this.A00.getResourcePackageName(i);
            }

            @Override // android.content.res.Resources
            public String getResourceTypeName(int i) {
                return this.A00.getResourceTypeName(i);
            }

            @Override // android.content.res.Resources
            public String getString(int i) {
                return this.A00.getString(i);
            }

            @Override // android.content.res.Resources
            public String getString(int i, Object... objArr) {
                return this.A00.getString(i, objArr);
            }

            @Override // android.content.res.Resources
            public String[] getStringArray(int i) {
                return this.A00.getStringArray(i);
            }

            @Override // android.content.res.Resources
            public CharSequence getText(int i) {
                return this.A00.getText(i);
            }

            @Override // android.content.res.Resources
            public CharSequence getText(int i, CharSequence charSequence) {
                return this.A00.getText(i, charSequence);
            }

            @Override // android.content.res.Resources
            public CharSequence[] getTextArray(int i) {
                return this.A00.getTextArray(i);
            }

            @Override // android.content.res.Resources
            public void getValue(int i, TypedValue typedValue, boolean z) {
                this.A00.getValue(i, typedValue, z);
            }

            @Override // android.content.res.Resources
            public void getValue(String str, TypedValue typedValue, boolean z) {
                this.A00.getValue(str, typedValue, z);
            }

            @Override // android.content.res.Resources
            public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
                this.A00.getValueForDensity(i, i2, typedValue, z);
            }

            @Override // android.content.res.Resources
            public XmlResourceParser getXml(int i) {
                return this.A00.getXml(i);
            }

            @Override // android.content.res.Resources
            public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
                return this.A00.obtainAttributes(attributeSet, iArr);
            }

            @Override // android.content.res.Resources
            public TypedArray obtainTypedArray(int i) {
                return this.A00.obtainTypedArray(i);
            }

            @Override // android.content.res.Resources
            public InputStream openRawResource(int i) {
                return this.A00.openRawResource(i);
            }

            @Override // android.content.res.Resources
            public InputStream openRawResource(int i, TypedValue typedValue) {
                return this.A00.openRawResource(i, typedValue);
            }

            @Override // android.content.res.Resources
            public AssetFileDescriptor openRawResourceFd(int i) {
                return this.A00.openRawResourceFd(i);
            }

            @Override // android.content.res.Resources
            public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
                this.A00.parseBundleExtra(str, attributeSet, bundle);
            }

            @Override // android.content.res.Resources
            public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
                this.A00.parseBundleExtras(xmlResourceParser, bundle);
            }

            @Override // android.content.res.Resources
            public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
                super.updateConfiguration(configuration, displayMetrics);
                Resources resources2 = this.A00;
                if (resources2 != null) {
                    resources2.updateConfiguration(configuration, displayMetrics);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v140, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v227, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v246, types: [int[]] */
    /* JADX WARN: Type inference failed for: r315v1 */
    /* JADX WARN: Type inference failed for: r315v2 */
    /* JADX WARN: Type inference failed for: r315v4 */
    public Drawable A00(int i) {
        int[] iArr;
        int i2;
        int[] iArr2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        int[] iArr3;
        int[][] iArr4;
        int defaultColor;
        boolean z4;
        int[][] iArr5;
        int[][] iArr6;
        boolean z5;
        int[][] iArr7;
        Context context = this.A01;
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable = drawable.mutate();
            int[] iArr8 = A0A;
            boolean z6 = false;
            int i4 = 0;
            while (true) {
                if (i4 >= 11) {
                    break;
                }
                if (iArr8[i4] == i) {
                    z6 = true;
                    break;
                }
                i4++;
            }
            if (!z6) {
                int[] iArr9 = A06;
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    if (z8 >= 1) {
                        break;
                    }
                    if (iArr9[z8 ? 1 : 0] == i) {
                        z7 = true;
                        break;
                    }
                    z8 = true;
                }
                if (z7) {
                    return this.A03.getDrawable(i);
                }
                A01(drawable, i);
                return drawable;
            }
            SparseArray sparseArray = this.A02;
            ColorStateList colorStateList = (ColorStateList) sparseArray.get(i);
            if (colorStateList == null) {
                if (i == 2132410387) {
                    z2 = true;
                    i3 = 2130969146;
                    iArr = new int[]{FEB.A00(context, 2130969146)};
                    z3 = 2;
                    iArr3 = new int[]{-16842919, -16842908};
                    iArr7 = new int[]{new int[]{-16842910}};
                } else {
                    if (i == 2132344863) {
                        int[] A1b = DKC.A1b(-16842910);
                        int[] A1b2 = DKC.A1b(R.attr.state_checked);
                        iArr = new int[]{DKI.A00(context, 0.1f, R.attr.colorForeground), DKI.A00(context, 0.3f, 2130969144)};
                        z4 = 2;
                        iArr5 = new int[]{A1b, A1b2, new int[0]};
                        defaultColor = DKI.A00(context, 0.3f, R.attr.colorForeground);
                    } else {
                        if (i == 2132410413) {
                            ?? r315 = new int[3];
                            iArr = new int[3];
                            i2 = 2130969163;
                            int[] iArr10 = FEB.A01;
                            iArr10[0] = 2130969163;
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr10);
                            try {
                                ColorStateList A00 = 5Wo.A00(context, obtainStyledAttributes, 0);
                                obtainStyledAttributes.recycle();
                                boolean z9 = 2;
                                if (A00 == null || !A00.isStateful()) {
                                    int[] iArr11 = new int[1];
                                    iArr11[0] = -16842910;
                                    r315[0] = iArr11;
                                    iArr[0] = FEB.A00(context, 2130969163);
                                    int[] iArr12 = new int[1];
                                    iArr12[0] = 16842912;
                                    r315[1] = iArr12;
                                    iArr[1] = FEB.A01(context, 2130969144);
                                    iArr2 = new int[0];
                                    z = z9;
                                    iArr4 = r315;
                                } else {
                                    int[] iArr13 = new int[1];
                                    iArr13[0] = -16842910;
                                    r315[0] = iArr13;
                                    iArr[0] = A00.getColorForState(iArr13, 0);
                                    int[] iArr14 = new int[1];
                                    iArr14[0] = 16842912;
                                    r315[1] = iArr14;
                                    iArr[1] = FEB.A01(context, 2130969144);
                                    r315[2] = new int[0];
                                    defaultColor = A00.getDefaultColor();
                                    z4 = z9;
                                    iArr5 = r315;
                                }
                            } catch (Throwable th) {
                                obtainStyledAttributes.recycle();
                                throw th;
                            }
                        } else if (i == 2132410381 || i == 2132410377) {
                            i2 = 2130969143;
                            ?? r3152 = {new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}};
                            iArr = new int[]{FEB.A00(context, 2130969143), FEB.A01(context, 2130969145), FEB.A01(context, 2130969145)};
                            iArr2 = new int[0];
                            z = 3;
                            iArr4 = r3152;
                        } else if (i == 2131230721 || i == 2132410410) {
                            z2 = true;
                            i3 = 2130969146;
                            iArr = new int[]{FEB.A00(context, 2130969146)};
                            z3 = 2;
                            iArr3 = new int[]{-16842919, -16842908};
                            iArr7 = new int[]{new int[]{-16842910}};
                        } else {
                            colorStateList = this.A00;
                            if (colorStateList == null) {
                                int A01 = FEB.A01(context, 2130969146);
                                int A012 = FEB.A01(context, 2130969144);
                                colorStateList = new ColorStateList(new int[]{DKC.A1b(-16842910), DKC.A1b(R.attr.state_focused), DKC.A1b(R.attr.state_activated), DKC.A1b(R.attr.state_pressed), DKC.A1b(R.attr.state_checked), DKC.A1b(R.attr.state_selected), new int[0]}, new int[]{FEB.A00(context, 2130969146), A012, A012, A012, A012, A012, A01});
                                this.A00 = colorStateList;
                            }
                            sparseArray.append(i, colorStateList);
                        }
                        iArr4[z ? 1 : 0] = iArr2;
                        z5 = z;
                        iArr6 = iArr4;
                        defaultColor = FEB.A01(context, i2);
                        z4 = z5;
                        iArr5 = iArr6;
                    }
                    iArr[z4 ? 1 : 0] = defaultColor;
                    colorStateList = new ColorStateList(iArr5, iArr);
                    sparseArray.append(i, colorStateList);
                }
                iArr7[z2 ? 1 : 0] = iArr3;
                iArr[z2 ? 1 : 0] = FEB.A01(context, i3);
                iArr7[z3 ? 1 : 0] = new int[0];
                i2 = 2130969144;
                z5 = z3;
                iArr6 = iArr7;
                defaultColor = FEB.A01(context, i2);
                z4 = z5;
                iArr5 = iArr6;
                iArr[z4 ? 1 : 0] = defaultColor;
                colorStateList = new ColorStateList(iArr5, iArr);
                sparseArray.append(i, colorStateList);
            }
            PorterDuff.Mode mode = A04;
            if (i == 2132410413) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            drawable.setTintList(colorStateList);
            drawable.setTintMode(mode);
        }
        return drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(android.graphics.drawable.Drawable r302, int r303) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F92.A01(android.graphics.drawable.Drawable, int):void");
    }
}
