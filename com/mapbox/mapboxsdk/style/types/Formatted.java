package com.mapbox.mapboxsdk.style.types;

import X.0Pz;
import java.util.Arrays;

/* loaded from: Formatted.class */
public class Formatted {
    public final FormattedSection[] formattedSections;

    public Formatted(FormattedSection... formattedSectionArr) {
        this.formattedSections = formattedSectionArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.formattedSections, ((Formatted) obj).formattedSections);
    }

    public FormattedSection[] getFormattedSections() {
        return this.formattedSections;
    }

    public int hashCode() {
        return Arrays.hashCode(this.formattedSections);
    }

    public Object[] toArray() {
        Object[] objArr = new Object[this.formattedSections.length];
        int i = 0;
        while (true) {
            int i2 = i;
            FormattedSection[] formattedSectionArr = this.formattedSections;
            if (i2 >= formattedSectionArr.length) {
                return objArr;
            }
            objArr[i2] = formattedSectionArr[i2].toArray();
            i = i2 + 1;
        }
    }

    public String toString() {
        return 0Pz.A0X("Formatted{formattedSections=", Arrays.toString(this.formattedSections), '}');
    }
}
