package com.mapbox.mapboxsdk.style.expressions;

import X.1BK;
import X.1BL;
import X.7zM;
import X.7zS;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C6f0;
import X.JQx;
import X.JQz;
import X.JR0;
import X.JR1;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.mapbox.mapboxsdk.style.layers.PropertyValue;
import com.mapbox.mapboxsdk.utils.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: Expression.class */
public class Expression {
    public final Expression[] arguments;
    public final String operator;

    /* loaded from: Expression$Array.class */
    public class Array {
    }

    /* loaded from: Expression$Converter.class */
    public final class Converter {
        public static final Gson gson = new Gson();

        public static Expression convert(JsonArray jsonArray) {
            Expression convert;
            if (jsonArray.elements.size() == 0) {
                throw AnonymousClass001.A0L("Can't convert empty jsonArray expressions");
            }
            String asString = jsonArray.get(0).getAsString();
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 1;
            while (true) {
                int i2 = i;
                if (i2 >= jsonArray.elements.size()) {
                    return JQz.A0b(asString, (Expression[]) A0s.toArray(new Expression[A0s.size()]));
                }
                JsonElement jsonElement = jsonArray.get(i2);
                if (asString.equals("literal") && (jsonElement instanceof JsonArray)) {
                    JsonArray jsonArray2 = (JsonArray) jsonElement;
                    Object[] objArr = new Object[jsonArray2.elements.size()];
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= jsonArray2.elements.size()) {
                            convert = new ExpressionLiteral(objArr);
                            break;
                        }
                        JsonElement jsonElement2 = jsonArray2.get(i4);
                        if (!(jsonElement2 instanceof JsonPrimitive)) {
                            throw AnonymousClass001.A0L("Nested literal arrays are not supported.");
                        }
                        objArr[i4] = convertToValue((JsonPrimitive) jsonElement2);
                        i3 = i4 + 1;
                    }
                } else {
                    convert = convert(jsonElement);
                }
                A0s.add(convert);
                i = i2 + 1;
            }
        }

        public static Expression convert(JsonElement jsonElement) {
            if (jsonElement instanceof JsonArray) {
                return convert((JsonArray) jsonElement);
            }
            if (jsonElement instanceof JsonPrimitive) {
                return JQz.A0a(convertToValue((JsonPrimitive) jsonElement));
            }
            if (jsonElement instanceof C6f0) {
                return JQz.A0a("");
            }
            if (!(jsonElement instanceof JsonObject)) {
                throw AnonymousClass001.A0T(7zS.A13(jsonElement, "Unsupported expression conversion for ", AnonymousClass001.A0k()));
            }
            HashMap A0u = AnonymousClass001.A0u();
            JsonObject jsonObject = (JsonObject) jsonElement;
            Iterator it = jsonObject.keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                A0u.put(A0i, convert(jsonObject.get(A0i)));
            }
            return new ExpressionMap(A0u);
        }

        public static Expression convert(JsonPrimitive jsonPrimitive) {
            return JQz.A0a(convertToValue(jsonPrimitive));
        }

        public static Expression convert(String str) {
            return convert((JsonArray) gson.A04(str, JsonArray.class));
        }

        public static Object convertToValue(JsonPrimitive jsonPrimitive) {
            Object obj = jsonPrimitive.value;
            if (obj instanceof Boolean) {
                return Boolean.valueOf(jsonPrimitive.getAsBoolean());
            }
            if (obj instanceof Number) {
                return Float.valueOf(jsonPrimitive.getAsFloat());
            }
            if (obj instanceof String) {
                return jsonPrimitive.getAsString();
            }
            throw AnonymousClass001.A0T(7zS.A13(jsonPrimitive, "Unsupported literal expression conversion for ", AnonymousClass001.A0k()));
        }
    }

    /* loaded from: Expression$ExpressionLiteral.class */
    public class ExpressionLiteral extends Expression implements ValueExpression {
        public Object literal;

        public ExpressionLiteral(Object obj) {
            if (obj instanceof String) {
                obj = unwrapStringLiteral((String) obj);
            } else if (obj instanceof Number) {
                obj = Float.valueOf(7zM.A00(obj));
            }
            this.literal = obj;
        }

        public static String unwrapStringLiteral(String str) {
            int length = str.length();
            if (length > 1 && JQx.A00(str) == '\"') {
                int i = length - 1;
                if (str.charAt(i) == '\"') {
                    str = str.substring(1, i);
                }
            }
            return str;
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression
        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                    return false;
                }
                Object obj2 = this.literal;
                Object obj3 = ((ExpressionLiteral) obj).literal;
                if (obj2 != null) {
                    z = obj2.equals(obj3);
                } else if (obj3 != null) {
                    return false;
                }
            }
            return z;
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression
        public int hashCode() {
            return (super.hashCode() * 31) + AnonymousClass002.A04(this.literal);
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression
        public Object[] toArray() {
            return new Object[]{"literal", this.literal};
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression
        public String toString() {
            Object obj = this.literal;
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("\"");
            A0k.append(obj);
            return AnonymousClass001.A0d("\"", A0k);
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression.ValueExpression
        public Object toValue() {
            Object obj = this.literal;
            if (obj instanceof PropertyValue) {
                throw AnonymousClass001.A0L("PropertyValue are not allowed as an expression literal, use value instead.");
            }
            if (obj instanceof ExpressionLiteral) {
                obj = ((ExpressionLiteral) obj).toValue();
            }
            return obj;
        }
    }

    /* loaded from: Expression$ExpressionLiteralArray.class */
    public class ExpressionLiteralArray extends ExpressionLiteral {
        public ExpressionLiteralArray(Object[] objArr) {
            super(objArr);
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression.ExpressionLiteral, com.mapbox.mapboxsdk.style.expressions.Expression
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Arrays.equals((Object[]) this.literal, (Object[]) ((ExpressionLiteral) obj).literal);
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression.ExpressionLiteral, com.mapbox.mapboxsdk.style.expressions.Expression
        public String toString() {
            Object[] objArr = (Object[]) this.literal;
            StringBuilder A0o = AnonymousClass001.A0o("[");
            int i = 0;
            while (true) {
                int i2 = i;
                int length = objArr.length;
                if (i2 >= length) {
                    return AnonymousClass001.A0d("]", A0o);
                }
                Object obj = objArr[i2];
                if (obj instanceof String) {
                    A0o.append("\"");
                    A0o.append(obj);
                    A0o.append("\"");
                } else {
                    A0o.append(obj);
                }
                if (i2 != length - 1) {
                    AnonymousClass001.A1H(A0o);
                }
                i = i2 + 1;
            }
        }
    }

    /* loaded from: Expression$ExpressionMap.class */
    public class ExpressionMap extends Expression implements ValueExpression {
        public Map map;

        public ExpressionMap(Map map) {
            this.map = map;
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
                return this.map.equals(((ExpressionMap) obj).map);
            }
            return false;
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Map map = this.map;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @Override // com.mapbox.mapboxsdk.style.expressions.Expression
        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("{");
            Iterator A1B = 1BK.A1B(this.map);
            while (A1B.hasNext()) {
                String A0i = AnonymousClass001.A0i(A1B);
                A0k.append("\"");
                A0k.append(A0i);
                A0k.append("\": ");
                JR0.A1G(A0k, this.map.get(A0i));
            }
            if (this.map.size() > 0) {
                A0k.delete(A0k.length() - 2, A0k.length());
            }
            return 1BL.A0v(A0k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.mapbox.mapboxsdk.style.expressions.Expression.ValueExpression
        public Object toValue() {
            HashMap A0u = AnonymousClass001.A0u();
            Iterator A1B = 1BK.A1B(this.map);
            while (A1B.hasNext()) {
                Object next = A1B.next();
                Expression expression = (Expression) this.map.get(next);
                if (expression instanceof ValueExpression) {
                    A0u.put(next, ((ValueExpression) expression).toValue());
                } else {
                    A0u.put(next, expression.toArray());
                }
            }
            return A0u;
        }
    }

    /* loaded from: Expression$FormatEntry.class */
    public class FormatEntry {
        public FormatOption[] options;
        public Expression text;

        public FormatEntry(Expression expression, FormatOption[] formatOptionArr) {
            this.text = expression;
            this.options = formatOptionArr;
        }
    }

    /* loaded from: Expression$FormatOption.class */
    public class FormatOption {
        public String type;
        public Expression value;

        public FormatOption(String str, Expression expression) {
            this.type = str;
            this.value = expression;
        }

        public static FormatOption formatFontScale(double d) {
            return new FormatOption("font-scale", JQz.A0a(Double.valueOf(d)));
        }

        public static FormatOption formatFontScale(Expression expression) {
            return new FormatOption("font-scale", expression);
        }

        public static FormatOption formatTextColor(int i) {
            return new FormatOption("text-color", Expression.color(i));
        }

        public static FormatOption formatTextColor(Expression expression) {
            return new FormatOption("text-color", expression);
        }

        public static FormatOption formatTextFont(Expression expression) {
            return new FormatOption("text-font", expression);
        }

        public static FormatOption formatTextFont(String[] strArr) {
            return new FormatOption("text-font", Expression.literal((Object[]) strArr));
        }
    }

    /* loaded from: Expression$Interpolator.class */
    public class Interpolator extends Expression {
        public Interpolator(String str, Expression... expressionArr) {
            super(str, expressionArr);
        }
    }

    /* loaded from: Expression$Stop.class */
    public class Stop {
        public Object output;
        public Object value;

        public Stop(Object obj, Object obj2) {
            this.value = obj;
            this.output = obj2;
        }

        public static Expression[] toExpressionArray(Stop... stopArr) {
            int length = stopArr.length;
            Expression[] expressionArr = new Expression[length * 2];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return expressionArr;
                }
                Stop stop = stopArr[i2];
                Object obj = stop.value;
                Object obj2 = stop.output;
                if (!(obj instanceof Expression)) {
                    obj = Expression.literal(obj);
                }
                if (!(obj2 instanceof Expression)) {
                    obj2 = Expression.literal(obj2);
                }
                int i3 = i2 * 2;
                expressionArr[i3] = obj;
                expressionArr[i3 + 1] = obj2;
                i = i2 + 1;
            }
        }
    }

    /* loaded from: Expression$ValueExpression.class */
    public interface ValueExpression {
        Object toValue();
    }

    public Expression() {
        this.operator = null;
        this.arguments = null;
    }

    public Expression(String str, Expression... expressionArr) {
        this.operator = str;
        this.arguments = expressionArr;
    }

    public static Expression abs(Expression expression) {
        return JQz.A0b("abs", new Expression[]{expression});
    }

    public static Expression abs(Number number) {
        return abs(JQz.A0a(number));
    }

    public static Expression acos(Expression expression) {
        return JQz.A0b("acos", new Expression[]{expression});
    }

    public static Expression acos(Number number) {
        return acos(JQz.A0a(number));
    }

    public static Expression all(Expression... expressionArr) {
        return JQz.A0b("all", expressionArr);
    }

    public static Expression any(Expression... expressionArr) {
        return JQz.A0b("any", expressionArr);
    }

    public static Expression array(Expression expression) {
        return JQz.A0b("array", new Expression[]{expression});
    }

    public static Expression asin(Expression expression) {
        return JQz.A0b("asin", new Expression[]{expression});
    }

    public static Expression asin(Number number) {
        return asin(JQz.A0a(number));
    }

    public static Expression at(Expression expression, Expression expression2) {
        return JQz.A0b("at", new Expression[]{expression, expression2});
    }

    public static Expression at(Number number, Expression expression) {
        return at(JQz.A0a(number), expression);
    }

    public static Expression atan(Expression expression) {
        return JQz.A0b("atan", new Expression[]{expression});
    }

    public static Expression atan(Number number) {
        return atan(JQz.A0a(number));
    }

    public static Expression bool(Expression... expressionArr) {
        return JQz.A0b("boolean", expressionArr);
    }

    public static Expression ceil(Expression expression) {
        return JQz.A0b("ceil", new Expression[]{expression});
    }

    public static Expression ceil(Number number) {
        return ceil(JQz.A0a(number));
    }

    public static Expression coalesce(Expression... expressionArr) {
        return JQz.A0b("coalesce", expressionArr);
    }

    public static Expression collator(Expression expression, Expression expression2) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("case-sensitive", expression);
        return JR1.A0i("diacritic-sensitive", expression2, A0u);
    }

    public static Expression collator(Expression expression, Expression expression2, Expression expression3) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("case-sensitive", expression);
        A0u.put("diacritic-sensitive", expression2);
        return JR1.A0i("locale", expression3, A0u);
    }

    public static Expression collator(boolean z, boolean z2) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("case-sensitive", JQz.A0a(Boolean.valueOf(z)));
        return JR1.A0i("diacritic-sensitive", JQz.A0a(Boolean.valueOf(z2)), A0u);
    }

    public static Expression collator(boolean z, boolean z2, Locale locale) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("case-sensitive", JQz.A0a(Boolean.valueOf(z)));
        A0u.put("diacritic-sensitive", JQz.A0a(Boolean.valueOf(z2)));
        StringBuilder A0k = AnonymousClass001.A0k();
        String language = locale.getLanguage();
        if (language != null && !language.isEmpty()) {
            A0k.append(language);
        }
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            A0k.append("-");
            A0k.append(country);
        }
        return JR1.A0i("locale", JQz.A0a(A0k.toString()), A0u);
    }

    public static Expression color(int i) {
        float[] colorToRgbaArray = ColorUtils.colorToRgbaArray(i);
        return rgba(Float.valueOf(colorToRgbaArray[0]), Float.valueOf(colorToRgbaArray[1]), Float.valueOf(colorToRgbaArray[2]), Float.valueOf(colorToRgbaArray[3]));
    }

    public static Expression concat(Expression... expressionArr) {
        return JQz.A0b("concat", expressionArr);
    }

    public static Expression concat(String... strArr) {
        int length = strArr.length;
        Expression[] expressionArr = new Expression[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return JQz.A0b("concat", expressionArr);
            }
            expressionArr[i2] = JQz.A0a(strArr[i2]);
            i = i2 + 1;
        }
    }

    public static Expression cos(Expression expression) {
        return JQz.A0b("cos", new Expression[]{expression});
    }

    public static Expression cos(Number number) {
        return JQz.A0b("cos", new Expression[]{JQz.A0a(number)});
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.mapbox.mapboxsdk.style.expressions.Expression, com.mapbox.mapboxsdk.style.expressions.Expression$Interpolator] */
    public static Interpolator cubicBezier(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        return new Expression("cubic-bezier", expression, expression2, expression3, expression4);
    }

    public static Interpolator cubicBezier(Number number, Number number2, Number number3, Number number4) {
        return cubicBezier(JQz.A0a(number), JQz.A0a(number2), JQz.A0a(number3), JQz.A0a(number4));
    }

    public static Expression division(Expression expression, Expression expression2) {
        return JQz.A0b("/", new Expression[]{expression, expression2});
    }

    public static Expression division(Number number, Number number2) {
        return division(JQz.A0a(number), JQz.A0a(number2));
    }

    public static Expression downcase(Expression expression) {
        return JQz.A0b("downcase", new Expression[]{expression});
    }

    public static Expression downcase(String str) {
        return downcase(JQz.A0a(str));
    }

    public static Expression e() {
        return JQz.A0b("e", new Expression[0]);
    }

    public static Expression eq(Expression expression, Expression expression2) {
        return JQz.A0b("==", new Expression[]{expression, expression2});
    }

    public static Expression eq(Expression expression, Expression expression2, Expression expression3) {
        return JQz.A0b("==", new Expression[]{expression, expression2, expression3});
    }

    public static Expression eq(Expression expression, Number number) {
        return eq(expression, JQz.A0a(number));
    }

    public static Expression eq(Expression expression, String str) {
        return eq(expression, JQz.A0a(str));
    }

    public static Expression eq(Expression expression, String str, Expression expression2) {
        return eq(expression, JQz.A0a(str), expression2);
    }

    public static Expression eq(Expression expression, boolean z) {
        return eq(expression, JQz.A0a(Boolean.valueOf(z)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.mapbox.mapboxsdk.style.expressions.Expression, com.mapbox.mapboxsdk.style.expressions.Expression$Interpolator] */
    public static Interpolator exponential(Expression expression) {
        return new Expression("exponential", expression);
    }

    public static Interpolator exponential(Number number) {
        return exponential(JQz.A0a(number));
    }

    public static Expression floor(Expression expression) {
        return JQz.A0b("floor", new Expression[]{expression});
    }

    public static Expression floor(Number number) {
        return floor(JQz.A0a(number));
    }

    public static Expression format(FormatEntry... formatEntryArr) {
        Expression[] expressionArr = new Expression[formatEntryArr.length * 2];
        int i = 0;
        for (FormatEntry formatEntry : formatEntryArr) {
            int i2 = i + 1;
            expressionArr[i] = formatEntry.text;
            HashMap A0u = AnonymousClass001.A0u();
            FormatOption[] formatOptionArr = formatEntry.options;
            if (formatOptionArr != null) {
                for (FormatOption formatOption : formatOptionArr) {
                    A0u.put(formatOption.type, formatOption.value);
                }
            }
            i = i2 + 1;
            expressionArr[i2] = new ExpressionMap(A0u);
        }
        return JQz.A0b("format", expressionArr);
    }

    public static FormatEntry formatEntry(Expression expression) {
        return new FormatEntry(expression, null);
    }

    public static FormatEntry formatEntry(Expression expression, FormatOption... formatOptionArr) {
        return new FormatEntry(expression, formatOptionArr);
    }

    public static FormatEntry formatEntry(String str) {
        return new FormatEntry(JQz.A0a(str), null);
    }

    public static FormatEntry formatEntry(String str, FormatOption... formatOptionArr) {
        return new FormatEntry(JQz.A0a(str), formatOptionArr);
    }

    public static Expression geometryType() {
        return JQz.A0b("geometry-type", new Expression[0]);
    }

    public static Expression get(Expression expression) {
        return JQz.A0b("get", new Expression[]{expression});
    }

    public static Expression get(Expression expression, Expression expression2) {
        return JQz.A0b("get", new Expression[]{expression, expression2});
    }

    public static Expression get(String str) {
        return get(JQz.A0a(str));
    }

    public static Expression get(String str, Expression expression) {
        return get(JQz.A0a(str), expression);
    }

    public static Expression gt(Expression expression, Expression expression2) {
        return JQz.A0b(">", new Expression[]{expression, expression2});
    }

    public static Expression gt(Expression expression, Expression expression2, Expression expression3) {
        return JQz.A0b(">", new Expression[]{expression, expression2, expression3});
    }

    public static Expression gt(Expression expression, Number number) {
        return JQz.A0b(">", JR0.A1Z(expression, number));
    }

    public static Expression gt(Expression expression, String str) {
        return JQz.A0b(">", JR0.A1Z(expression, str));
    }

    public static Expression gt(Expression expression, String str, Expression expression2) {
        return JQz.A0b(">", new Expression[]{expression, JQz.A0a(str), expression2});
    }

    public static Expression gte(Expression expression, Expression expression2) {
        return JQz.A0b(">=", new Expression[]{expression, expression2});
    }

    public static Expression gte(Expression expression, Expression expression2, Expression expression3) {
        return JQz.A0b(">=", new Expression[]{expression, expression2, expression3});
    }

    public static Expression gte(Expression expression, Number number) {
        return JQz.A0b(">=", JR0.A1Z(expression, number));
    }

    public static Expression gte(Expression expression, String str) {
        return JQz.A0b(">=", JR0.A1Z(expression, str));
    }

    public static Expression gte(Expression expression, String str, Expression expression2) {
        return JQz.A0b(">=", new Expression[]{expression, JQz.A0a(str), expression2});
    }

    public static Expression has(Expression expression) {
        return JQz.A0b("has", new Expression[]{expression});
    }

    public static Expression has(Expression expression, Expression expression2) {
        return JQz.A0b("has", new Expression[]{expression, expression2});
    }

    public static Expression has(String str) {
        return has(JQz.A0a(str));
    }

    public static Expression has(String str, Expression expression) {
        return has(JQz.A0a(str), expression);
    }

    public static Expression heatmapDensity() {
        return JQz.A0b("heatmap-density", new Expression[0]);
    }

    public static Expression id() {
        return JQz.A0b(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new Expression[0]);
    }

    public static Expression interpolate(Interpolator interpolator, Expression expression, Stop... stopArr) {
        return interpolate(interpolator, expression, Stop.toExpressionArray(stopArr));
    }

    public static Expression interpolate(Interpolator interpolator, Expression expression, Expression... expressionArr) {
        return JQz.A0b("interpolate", join(new Expression[]{interpolator, expression}, expressionArr));
    }

    public static Expression isSupportedScript(Expression expression) {
        return JQz.A0b("is-supported-script", new Expression[]{expression});
    }

    public static Expression isSupportedScript(String str) {
        return JQz.A0b("is-supported-script", new Expression[]{JQz.A0a(str)});
    }

    public static Expression[] join(Expression[] expressionArr, Expression[] expressionArr2) {
        int length = expressionArr.length;
        int length2 = expressionArr2.length;
        Expression[] expressionArr3 = new Expression[length + length2];
        System.arraycopy(expressionArr, 0, expressionArr3, 0, length);
        System.arraycopy(expressionArr2, 0, expressionArr3, length, length2);
        return expressionArr3;
    }

    public static Expression length(Expression expression) {
        return JQz.A0b("length", new Expression[]{expression});
    }

    public static Expression length(String str) {
        return length(JQz.A0a(str));
    }

    public static Expression let(Expression... expressionArr) {
        return JQz.A0b("let", expressionArr);
    }

    public static Expression lineProgress() {
        return JQz.A0b("line-progress", new Expression[0]);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.mapbox.mapboxsdk.style.expressions.Expression, com.mapbox.mapboxsdk.style.expressions.Expression$Interpolator] */
    public static Interpolator linear() {
        return new Expression(Property.RASTER_RESAMPLING_LINEAR, new Expression[0]);
    }

    public static Expression literal(Number number) {
        return JQz.A0a(number);
    }

    public static Expression literal(Object obj) {
        if (obj.getClass().isArray()) {
            return literal(toObjectArray(obj));
        }
        if (obj instanceof Expression) {
            throw AnonymousClass001.A0T("Can't convert an expression to a literal");
        }
        return JQz.A0a(obj);
    }

    public static Expression literal(String str) {
        return JQz.A0a(str);
    }

    public static Expression literal(boolean z) {
        return JQz.A0a(Boolean.valueOf(z));
    }

    public static Expression literal(Object[] objArr) {
        return JQz.A0b("literal", new Expression[]{new ExpressionLiteral(objArr)});
    }

    public static Expression ln(Expression expression) {
        return JQz.A0b("ln", new Expression[]{expression});
    }

    public static Expression ln(Number number) {
        return ln(JQz.A0a(number));
    }

    public static Expression ln2() {
        return JQz.A0b("ln2", new Expression[0]);
    }

    public static Expression log10(Expression expression) {
        return JQz.A0b("log10", new Expression[]{expression});
    }

    public static Expression log10(Number number) {
        return log10(JQz.A0a(number));
    }

    public static Expression log2(Expression expression) {
        return JQz.A0b("log2", new Expression[]{expression});
    }

    public static Expression log2(Number number) {
        return log2(JQz.A0a(number));
    }

    public static Expression lt(Expression expression, Expression expression2) {
        return JQz.A0b("<", new Expression[]{expression, expression2});
    }

    public static Expression lt(Expression expression, Expression expression2, Expression expression3) {
        return JQz.A0b("<", new Expression[]{expression, expression2, expression3});
    }

    public static Expression lt(Expression expression, Number number) {
        return JQz.A0b("<", JR0.A1Z(expression, number));
    }

    public static Expression lt(Expression expression, String str) {
        return JQz.A0b("<", JR0.A1Z(expression, str));
    }

    public static Expression lt(Expression expression, String str, Expression expression2) {
        return JQz.A0b("<", new Expression[]{expression, JQz.A0a(str), expression2});
    }

    public static Expression lte(Expression expression, Expression expression2) {
        return JQz.A0b("<=", new Expression[]{expression, expression2});
    }

    public static Expression lte(Expression expression, Expression expression2, Expression expression3) {
        return JQz.A0b("<=", new Expression[]{expression, expression2, expression3});
    }

    public static Expression lte(Expression expression, Number number) {
        return JQz.A0b("<=", JR0.A1Z(expression, number));
    }

    public static Expression lte(Expression expression, String str) {
        return JQz.A0b("<=", JR0.A1Z(expression, str));
    }

    public static Expression lte(Expression expression, String str, Expression expression2) {
        return JQz.A0b("<=", new Expression[]{expression, JQz.A0a(str), expression2});
    }

    public static Expression match(Expression expression, Expression expression2, Stop... stopArr) {
        return JQz.A0b("match", join(join(new Expression[]{expression}, Stop.toExpressionArray(stopArr)), new Expression[]{expression2}));
    }

    public static Expression match(Expression... expressionArr) {
        return JQz.A0b("match", expressionArr);
    }

    public static Expression max(Expression... expressionArr) {
        return JQz.A0b("max", expressionArr);
    }

    public static Expression max(Number... numberArr) {
        int length = numberArr.length;
        Expression[] expressionArr = new Expression[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return JQz.A0b("max", expressionArr);
            }
            expressionArr[i2] = JQz.A0a(numberArr[i2]);
            i = i2 + 1;
        }
    }

    public static Expression min(Expression... expressionArr) {
        return JQz.A0b("min", expressionArr);
    }

    public static Expression min(Number... numberArr) {
        int length = numberArr.length;
        Expression[] expressionArr = new Expression[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return JQz.A0b("min", expressionArr);
            }
            expressionArr[i2] = JQz.A0a(numberArr[i2]);
            i = i2 + 1;
        }
    }

    public static Expression mod(Expression expression, Expression expression2) {
        return JQz.A0b("%", new Expression[]{expression, expression2});
    }

    public static Expression mod(Number number, Number number2) {
        return mod(JQz.A0a(number), JQz.A0a(number2));
    }

    public static Expression neq(Expression expression, Expression expression2) {
        return JQz.A0b("!=", new Expression[]{expression, expression2});
    }

    public static Expression neq(Expression expression, Expression expression2, Expression expression3) {
        return JQz.A0b("!=", new Expression[]{expression, expression2, expression3});
    }

    public static Expression neq(Expression expression, Number number) {
        return JQz.A0b("!=", JR0.A1Z(expression, number));
    }

    public static Expression neq(Expression expression, String str) {
        return JQz.A0b("!=", JR0.A1Z(expression, str));
    }

    public static Expression neq(Expression expression, String str, Expression expression2) {
        return JQz.A0b("!=", new Expression[]{expression, JQz.A0a(str), expression2});
    }

    public static Expression neq(Expression expression, boolean z) {
        return JQz.A0b("!=", new Expression[]{expression, JQz.A0a(Boolean.valueOf(z))});
    }

    public static Expression not(Expression expression) {
        return JQz.A0b("!", new Expression[]{expression});
    }

    public static Expression not(boolean z) {
        return not(JQz.A0a(Boolean.valueOf(z)));
    }

    public static Expression number(Expression... expressionArr) {
        return JQz.A0b("number", expressionArr);
    }

    public static Expression object(Expression expression) {
        return JQz.A0b("object", new Expression[]{expression});
    }

    public static Expression pi() {
        return JQz.A0b("pi", new Expression[0]);
    }

    public static Expression pow(Expression expression, Expression expression2) {
        return JQz.A0b("^", new Expression[]{expression, expression2});
    }

    public static Expression pow(Number number, Number number2) {
        return pow(JQz.A0a(number), JQz.A0a(number2));
    }

    public static Expression product(Expression... expressionArr) {
        return JQz.A0b("*", expressionArr);
    }

    public static Expression product(Number... numberArr) {
        int length = numberArr.length;
        Expression[] expressionArr = new Expression[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return JQz.A0b("*", expressionArr);
            }
            expressionArr[i2] = JQz.A0a(numberArr[i2]);
            i = i2 + 1;
        }
    }

    public static Expression properties() {
        return JQz.A0b("properties", new Expression[0]);
    }

    public static Expression raw(String str) {
        return Converter.convert(str);
    }

    public static Expression resolvedLocale(Expression expression) {
        return JQz.A0b("resolved-locale", new Expression[]{expression});
    }

    public static Expression rgb(Expression expression, Expression expression2, Expression expression3) {
        return JQz.A0b("rgb", new Expression[]{expression, expression2, expression3});
    }

    public static Expression rgb(Number number, Number number2, Number number3) {
        return rgb(JQz.A0a(number), JQz.A0a(number2), JQz.A0a(number3));
    }

    public static Expression rgba(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        return JQz.A0b("rgba", new Expression[]{expression, expression2, expression3, expression4});
    }

    public static Expression rgba(Number number, Number number2, Number number3, Number number4) {
        return rgba(JQz.A0a(number), JQz.A0a(number2), JQz.A0a(number3), JQz.A0a(number4));
    }

    public static Expression round(Expression expression) {
        return JQz.A0b("round", new Expression[]{expression});
    }

    public static Expression round(Number number) {
        return round(JQz.A0a(number));
    }

    public static Expression sin(Expression expression) {
        return JQz.A0b("sin", new Expression[]{expression});
    }

    public static Expression sin(Number number) {
        return sin(JQz.A0a(number));
    }

    public static Expression sqrt(Expression expression) {
        return JQz.A0b("sqrt", new Expression[]{expression});
    }

    public static Expression sqrt(Number number) {
        return sqrt(JQz.A0a(number));
    }

    public static Expression step(Expression expression, Expression expression2, Stop... stopArr) {
        return step(expression, expression2, Stop.toExpressionArray(stopArr));
    }

    public static Expression step(Expression expression, Expression expression2, Expression... expressionArr) {
        return JQz.A0b(OptSvcAnalyticsStore.LOGGING_KEY_STEP, join(new Expression[]{expression, expression2}, expressionArr));
    }

    public static Expression step(Expression expression, Number number, Stop... stopArr) {
        return step(expression, JQz.A0a(number), Stop.toExpressionArray(stopArr));
    }

    public static Expression step(Expression expression, Number number, Expression... expressionArr) {
        return step(expression, JQz.A0a(number), expressionArr);
    }

    public static Expression step(Number number, Expression expression, Stop... stopArr) {
        return step(JQz.A0a(number), expression, Stop.toExpressionArray(stopArr));
    }

    public static Expression step(Number number, Expression expression, Expression... expressionArr) {
        return step(JQz.A0a(number), expression, expressionArr);
    }

    public static Expression step(Number number, Number number2, Stop... stopArr) {
        return step(JQz.A0a(number), JQz.A0a(number2), Stop.toExpressionArray(stopArr));
    }

    public static Expression step(Number number, Number number2, Expression... expressionArr) {
        return step(JQz.A0a(number), JQz.A0a(number2), expressionArr);
    }

    public static Stop stop(Object obj, Object obj2) {
        return new Stop(obj, obj2);
    }

    public static Expression string(Expression... expressionArr) {
        return JQz.A0b("string", expressionArr);
    }

    public static Expression subtract(Expression expression) {
        return JQz.A0b("-", new Expression[]{expression});
    }

    public static Expression subtract(Expression expression, Expression expression2) {
        return JQz.A0b("-", new Expression[]{expression, expression2});
    }

    public static Expression subtract(Number number) {
        return subtract(JQz.A0a(number));
    }

    public static Expression subtract(Number number, Number number2) {
        return subtract(JQz.A0a(number), JQz.A0a(number2));
    }

    public static Expression sum(Expression... expressionArr) {
        return JQz.A0b("+", expressionArr);
    }

    public static Expression sum(Number... numberArr) {
        int length = numberArr.length;
        Expression[] expressionArr = new Expression[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return JQz.A0b("+", expressionArr);
            }
            expressionArr[i2] = JQz.A0a(numberArr[i2]);
            i = i2 + 1;
        }
    }

    public static Expression switchCase(Expression... expressionArr) {
        return JQz.A0b("case", expressionArr);
    }

    public static Expression tan(Expression expression) {
        return JQz.A0b("tan", new Expression[]{expression});
    }

    public static Expression tan(Number number) {
        return JQz.A0b("tan", new Expression[]{JQz.A0a(number)});
    }

    public static Expression toBool(Expression expression) {
        return JQz.A0b("to-boolean", new Expression[]{expression});
    }

    public static Expression toColor(Expression expression) {
        return JQz.A0b("to-color", new Expression[]{expression});
    }

    public static Expression toNumber(Expression expression) {
        return JQz.A0b("to-number", new Expression[]{expression});
    }

    public static Object[] toObjectArray(Object obj) {
        int length = java.lang.reflect.Array.getLength(obj);
        Object[] objArr = new Object[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return objArr;
            }
            objArr[i2] = java.lang.reflect.Array.get(obj, i2);
            i = i2 + 1;
        }
    }

    public static Expression toRgba(Expression expression) {
        return JQz.A0b("to-rgba", new Expression[]{expression});
    }

    public static Expression toString(Expression expression) {
        return JQz.A0b("to-string", new Expression[]{expression});
    }

    public static Expression typeOf(Expression expression) {
        return JQz.A0b("typeof", new Expression[]{expression});
    }

    public static Expression upcase(Expression expression) {
        return JQz.A0b("upcase", new Expression[]{expression});
    }

    public static Expression upcase(String str) {
        return upcase(JQz.A0a(str));
    }

    public static Expression var(Expression expression) {
        return JQz.A0b("var", new Expression[]{expression});
    }

    public static Expression var(String str) {
        return var(JQz.A0a(str));
    }

    public static Expression zoom() {
        return JQz.A0b("zoom", new Expression[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Expression)) {
            return false;
        }
        Expression expression = (Expression) obj;
        String str = this.operator;
        String str2 = expression.operator;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        return Arrays.deepEquals(this.arguments, expression.arguments);
    }

    public int hashCode() {
        return (1BL.A06(this.operator) * 31) + Arrays.hashCode(this.arguments);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] toArray() {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(this.operator);
        Expression[] expressionArr = this.arguments;
        if (expressionArr != 0) {
            int length = expressionArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                ExpressionLiteralArray expressionLiteralArray = expressionArr[i2];
                if (expressionLiteralArray instanceof ValueExpression) {
                    A0s.add(expressionLiteralArray.toValue());
                } else {
                    A0s.add(expressionLiteralArray.toArray());
                }
                i = i2 + 1;
            }
        }
        return A0s.toArray();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[\"");
        A0k.append(this.operator);
        A0k.append("\"");
        Expression[] expressionArr = this.arguments;
        if (expressionArr != null) {
            int length = expressionArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Expression expression = expressionArr[i2];
                AnonymousClass001.A1H(A0k);
                1BK.A1R(A0k, expression);
                i = i2 + 1;
            }
        }
        return AnonymousClass001.A0d("]", A0k);
    }
}
