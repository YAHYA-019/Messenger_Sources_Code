package com.facebook.litho.widget;

import android.R;
import android.content.res.ColorStateList;
import java.util.Arrays;

/* loaded from: MaterialTextInputColorStateList.class */
public final class MaterialTextInputColorStateList extends ColorStateList {
    public static final int[][] A01 = {new int[]{R.attr.state_enabled}, new int[]{R.attr.state_pressed}, new int[]{-16842910}};
    public int[] A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((MaterialTextInputColorStateList) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }
}
