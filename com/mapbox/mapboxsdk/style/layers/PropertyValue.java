package com.mapbox.mapboxsdk.style.layers;

import X.AnonymousClass001;
import com.google.gson.JsonArray;
import com.mapbox.mapboxsdk.MapStrictMode;
import com.mapbox.mapboxsdk.exceptions.ConversionException;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.utils.ColorUtils;

/* loaded from: PropertyValue.class */
public class PropertyValue {
    public static final String TAG = "Mbgl-PropertyValue";
    public final String name;
    public final Object value;

    public PropertyValue(String str, Object obj) {
        this.name = str;
        this.value = obj;
    }

    public Integer getColorInt() {
        if (isValue()) {
            Object obj = this.value;
            if (obj instanceof String) {
                try {
                    return Integer.valueOf(ColorUtils.rgbaToColor((String) obj));
                } catch (ConversionException e) {
                    Logger.e(TAG, String.format("%s could not be converted to a Color int: %s", this.name, e.getMessage()));
                    MapStrictMode.strictModeViolation(e);
                    return null;
                }
            }
        }
        Logger.e(TAG, String.format("%s is not a String value and can not be converted to a color it", this.name));
        return null;
    }

    public Expression getExpression() {
        if (isExpression()) {
            Object obj = this.value;
            return obj instanceof JsonArray ? Expression.Converter.convert((JsonArray) obj) : (Expression) obj;
        }
        Logger.w(TAG, String.format("%s not an expression, try PropertyValue#getValue()", this.name));
        return null;
    }

    public Object getValue() {
        if (isValue()) {
            return this.value;
        }
        Logger.w(TAG, String.format("%s not a value, try PropertyValue#getExpression()", this.name));
        return null;
    }

    public boolean isExpression() {
        if (AnonymousClass001.A1U(this.value)) {
            return false;
        }
        Object obj = this.value;
        return (obj instanceof JsonArray) || (obj instanceof Expression);
    }

    public boolean isNull() {
        return AnonymousClass001.A1U(this.value);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (isExpression() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isValue() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = r0.value
            r302 = r0
            r0 = r302
            boolean r0 = X.AnonymousClass001.A1U(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L19
            r0 = r301
            boolean r0 = r0.isExpression()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1d
        L19:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L1d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.style.layers.PropertyValue.isValue():boolean");
    }

    public String toString() {
        return String.format("%s: %s", this.name, this.value);
    }
}
