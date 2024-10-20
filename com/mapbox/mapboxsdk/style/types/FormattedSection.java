package com.mapbox.mapboxsdk.style.types;

import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JR0;
import com.mapbox.mapboxsdk.utils.ColorUtils;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: FormattedSection.class */
public class FormattedSection {
    public Number fontScale;
    public String[] fontStack;
    public String text;
    public String textColor;

    public FormattedSection(String str) {
        this(str, null, null, null);
    }

    public FormattedSection(String str, Number number) {
        this(str, number, null, null);
    }

    public FormattedSection(String str, Number number, String[] strArr) {
        this(str, number, strArr, null);
    }

    public FormattedSection(String str, Number number, String[] strArr, String str2) {
        this.text = str;
        this.fontScale = number;
        this.fontStack = strArr;
        this.textColor = str2;
    }

    public FormattedSection(String str, String[] strArr) {
        this(str, null, strArr, null);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FormattedSection formattedSection = (FormattedSection) obj;
            String str = this.text;
            String str2 = formattedSection.text;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            Number number = this.fontScale;
            Number number2 = formattedSection.fontScale;
            if (number != null) {
                if (!number.equals(number2)) {
                    return false;
                }
            } else if (number2 != null) {
                return false;
            }
            if (!Arrays.equals(this.fontStack, formattedSection.fontStack)) {
                return false;
            }
            String str3 = this.textColor;
            String str4 = formattedSection.textColor;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                z = false;
            }
        }
        return z;
    }

    public Number getFontScale() {
        return this.fontScale;
    }

    public String[] getFontStack() {
        return this.fontStack;
    }

    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((((1BL.A06(this.text) * 31) + AnonymousClass002.A04(this.fontScale)) * 31) + Arrays.hashCode(this.fontStack)) * 31;
        String str = this.textColor;
        if (str != null) {
            i = str.hashCode();
        }
        return A06 + i;
    }

    public void setFontScale(Number number) {
        this.fontScale = number;
    }

    public void setFontStack(String[] strArr) {
        this.fontStack = strArr;
    }

    public void setTextColor(int i) {
        this.textColor = ColorUtils.colorToRgbaString(i);
    }

    public void setTextColor(Object obj) {
        this.textColor = (String) obj;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public Object[] toArray() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("font-scale", this.fontScale);
        A0u.put("text-font", this.fontStack);
        A0u.put("text-color", this.textColor);
        return new Object[]{this.text, A0u};
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FormattedSection{text='");
        char A00 = JR0.A00(this.text, A0k);
        A0k.append(", fontScale=");
        A0k.append(this.fontScale);
        A0k.append(", fontStack=");
        A0k.append(Arrays.toString(this.fontStack));
        A0k.append(", textColor='");
        A0k.append(this.textColor);
        A0k.append(A00);
        return AnonymousClass001.A0f(A0k);
    }
}
