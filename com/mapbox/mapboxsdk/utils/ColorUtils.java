package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.ImageView;
import com.facebook.resources.compat.RedexResourcesCompat;
import com.mapbox.mapboxsdk.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: ColorUtils.class */
public class ColorUtils {
    public static float[] colorToGlRgbaArray(int i) {
        return new float[]{((i >> 16) & 255) / 255.0f, ((i >> 8) & 255) / 255.0f, (i & 255) / 255.0f, ((i >> 24) & 255) / 255.0f};
    }

    public static float[] colorToRgbaArray(int i) {
        return new float[]{(i >> 16) & 255, (i >> 8) & 255, i & 255, ((i >> 24) & 255) / 255.0f};
    }

    public static String colorToRgbaString(int i) {
        Locale locale = Locale.US;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern("#.###");
        return String.format(locale, "rgba(%d, %d, %d, %s)", Integer.valueOf((i >> 16) & 255), Integer.valueOf((i >> 8) & 255), Integer.valueOf(i & 255), decimalFormat.format(((i >> 24) & 255) / 255.0f));
    }

    public static int getAccentColor(Context context) {
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(RedexResourcesCompat.getIdentifier(context.getResources(), "colorAccent", "attrs", context.getPackageName()), typedValue, true);
            return typedValue.data;
        } catch (Exception unused) {
            return getColorCompat(context, R.color.mapbox_gray);
        }
    }

    public static int getColorCompat(Context context, int i) {
        return context.getResources().getColor(i, context.getTheme());
    }

    public static int getPrimaryColor(Context context) {
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(RedexResourcesCompat.getIdentifier(context.getResources(), "colorPrimary", "attrs", context.getPackageName()), typedValue, true);
            return typedValue.data;
        } catch (Exception unused) {
            return getColorCompat(context, R.color.mapbox_blue);
        }
    }

    public static int getPrimaryDarkColor(Context context) {
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(RedexResourcesCompat.getIdentifier(context.getResources(), "colorPrimaryDark", "attrs", context.getPackageName()), typedValue, true);
            return typedValue.data;
        } catch (Exception unused) {
            return getColorCompat(context, R.color.mapbox_blue);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [int[], int[][]] */
    public static ColorStateList getSelector(int i) {
        return new ColorStateList(new int[]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{i, i});
    }

    public static int rgbaToColor(String str) {
        Matcher matcher = Pattern.compile("rgba?\\s*\\(\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\)").matcher(str);
        if (matcher.matches() && matcher.groupCount() == 3) {
            return Color.rgb((int) Float.parseFloat(matcher.group(1)), (int) Float.parseFloat(matcher.group(2)), (int) Float.parseFloat(matcher.group(3)));
        }
        if (matcher.matches() && matcher.groupCount() == 4) {
            return Color.argb((int) (Float.parseFloat(matcher.group(4)) * 255.0f), (int) Float.parseFloat(matcher.group(1)), (int) Float.parseFloat(matcher.group(2)), (int) Float.parseFloat(matcher.group(3)));
        }
        throw new RuntimeException("Not a valid rgb/rgba value");
    }

    public static void setTintList(ImageView imageView, int i) {
        imageView.setImageTintList(getSelector(i));
    }
}
