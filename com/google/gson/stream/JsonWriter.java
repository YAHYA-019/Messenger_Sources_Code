package com.google.gson.stream;

import X.0Pz;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C6f0;
import X.C6f2;
import X.C6f4;
import X.JQw;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: JsonWriter.class */
public class JsonWriter implements Closeable, Flushable {
    public static final Pattern A07 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] A08;
    public static final String[] A09;
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public int[] A04;
    public String A05;
    public final Writer A06;

    static {
        String[] strArr = new String[128];
        A09 = strArr;
        int i = 0;
        do {
            strArr[i] = String.format("\\u%04x", Integer.valueOf(i));
            i++;
        } while (i <= 31);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        A08 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        int[] iArr = new int[32];
        this.A04 = iArr;
        this.A00 = 0;
        this.A00 = 1;
        iArr[0] = 6;
        this.A03 = true;
        C6f2.A00("out == null", writer);
        this.A06 = writer;
    }

    private void A00() {
        int i;
        int i2 = this.A00;
        if (i2 == 0) {
            throw AnonymousClass001.A0N("JsonWriter is closed.");
        }
        int[] iArr = this.A04;
        int i3 = i2 - 1;
        int i4 = iArr[i3];
        if (i4 == 1) {
            iArr[i3] = 2;
            return;
        }
        if (i4 == 2) {
            this.A06.append(',');
            return;
        }
        if (i4 != 4) {
            i = 7;
            if (i4 != 6) {
                if (i4 != 7) {
                    throw AnonymousClass001.A0N("Nesting problem.");
                }
                if (!this.A02) {
                    throw AnonymousClass001.A0N("JSON must have only one top-level value.");
                }
            }
        } else {
            this.A06.append((CharSequence) ":");
            i = 5;
        }
        this.A04[this.A00 - 1] = i;
    }

    private void A01() {
        if (this.A05 != null) {
            int i = this.A00;
            if (i == 0) {
                throw AnonymousClass001.A0N("JsonWriter is closed.");
            }
            int i2 = this.A04[i - 1];
            if (i2 == 5) {
                this.A06.write(44);
            } else if (i2 != 3) {
                throw AnonymousClass001.A0N("Nesting problem.");
            }
            this.A04[this.A00 - 1] = 4;
            A04(this.A05);
            this.A05 = null;
        }
    }

    private void A02(int i, char c) {
        A00();
        int i2 = this.A00;
        int[] iArr = this.A04;
        if (i2 == iArr.length) {
            iArr = Arrays.copyOf(iArr, i2 * 2);
            this.A04 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
        this.A06.write(c);
    }

    private void A03(int i, int i2, char c) {
        int i3 = this.A00;
        if (i3 == 0) {
            throw AnonymousClass001.A0N("JsonWriter is closed.");
        }
        int i4 = i3 - 1;
        int i5 = this.A04[i4];
        if (i5 != i2 && i5 != i) {
            throw AnonymousClass001.A0N("Nesting problem.");
        }
        String str = this.A05;
        if (str != null) {
            throw 1BK.A0i("Dangling name: ", str);
        }
        this.A00 = i4;
        this.A06.write(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L9c
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.A08
            r304 = r0
        Ld:
            r0 = r301
            java.io.Writer r0 = r0.A06
            r305 = r0
            r0 = 34
            r306 = r0
            r0 = r305
            r1 = r306
            r0.write(r1)
            r0 = r302
            int r0 = r0.length()
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r309 = r0
        L2a:
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto La3
            r0 = r302
            r1 = r308
            char r0 = r0.charAt(r1)
            r310 = r0
            r0 = 128(0x80, float:1.8E-43)
            r303 = r0
            r0 = r310
            r1 = r303
            if (r0 >= r1) goto L57
            r0 = r304
            r1 = r310
            r0 = r0[r1]
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L65
        L4e:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L2a
        L57:
            r0 = 8232(0x2028, float:1.1535E-41)
            r303 = r0
            r0 = r310
            r1 = r303
            if (r0 != r1) goto L8b
            java.lang.String r0 = "\\u2028"
            r311 = r0
        L65:
            r0 = r309
            r1 = r308
            if (r0 >= r1) goto L7b
            r0 = r308
            r1 = r309
            int r0 = r0 - r1
            r303 = r0
            r0 = r305
            r1 = r302
            r2 = r309
            r3 = r303
            r0.write(r1, r2, r3)
        L7b:
            r0 = r305
            r1 = r311
            r0.write(r1)
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r309 = r0
            goto L4e
        L8b:
            r0 = 8233(0x2029, float:1.1537E-41)
            r303 = r0
            r0 = r310
            r1 = r303
            if (r0 != r1) goto L4e
            java.lang.String r0 = "\\u2029"
            r311 = r0
            goto L65
        L9c:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.A09
            r304 = r0
            goto Ld
        La3:
            r0 = r309
            r1 = r307
            if (r0 >= r1) goto Lbb
            r0 = r307
            r1 = r309
            int r0 = r0 - r1
            r307 = r0
            r0 = r305
            r1 = r302
            r2 = r309
            r3 = r307
            r0.write(r1, r2, r3)
        Lbb:
            r0 = r305
            r1 = r306
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.A04(java.lang.String):void");
    }

    public void A05() {
        if (!(this instanceof C6f4)) {
            A01();
            A02(1, '[');
        } else {
            C6f4 c6f4 = (C6f4) this;
            JsonArray jsonArray = new JsonArray();
            C6f4.A00(jsonArray, c6f4);
            c6f4.A02.add(jsonArray);
        }
    }

    public void A06() {
        if (!(this instanceof C6f4)) {
            A01();
            A02(3, '{');
        } else {
            C6f4 c6f4 = (C6f4) this;
            JsonObject jsonObject = new JsonObject();
            C6f4.A00(jsonObject, c6f4);
            c6f4.A02.add(jsonObject);
        }
    }

    public void A07() {
        if (!(this instanceof C6f4)) {
            A03(1, 2, ']');
            return;
        }
        C6f4 c6f4 = (C6f4) this;
        List list = c6f4.A02;
        if (list.isEmpty() || c6f4.A01 != null) {
            throw new IllegalStateException();
        }
        if (!(list.get(AnonymousClass001.A04(list)) instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        list.remove(AnonymousClass001.A04(list));
    }

    public void A08() {
        if (!(this instanceof C6f4)) {
            A03(3, 5, '}');
            return;
        }
        C6f4 c6f4 = (C6f4) this;
        List list = c6f4.A02;
        if (list.isEmpty() || c6f4.A01 != null) {
            throw new IllegalStateException();
        }
        if (!(list.get(AnonymousClass001.A04(list)) instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        list.remove(AnonymousClass001.A04(list));
    }

    public void A09() {
        if (this instanceof C6f4) {
            C6f4.A00(C6f0.A00, (C6f4) this);
            return;
        }
        if (this.A05 != null) {
            if (!this.A03) {
                this.A05 = null;
                return;
            }
            A01();
        }
        A00();
        this.A06.write("null");
    }

    public void A0A(double d) {
        if (this instanceof C6f4) {
            C6f4 c6f4 = (C6f4) this;
            if (((JsonWriter) c6f4).A02 || !(Double.isNaN(d) || Double.isInfinite(d))) {
                C6f4.A00(new JsonPrimitive(Double.valueOf(d)), c6f4);
                return;
            } else {
                StringBuilder A0n = AnonymousClass001.A0n(JQw.A00(49));
                A0n.append(d);
                throw AnonymousClass001.A0L(A0n.toString());
            }
        }
        A01();
        if (this.A02 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            A00();
            this.A06.append((CharSequence) Double.toString(d));
        } else {
            StringBuilder A0n2 = AnonymousClass001.A0n("Numeric values must be finite, but was ");
            A0n2.append(d);
            throw AnonymousClass001.A0L(A0n2.toString());
        }
    }

    public void A0B(long j) {
        if (this instanceof C6f4) {
            C6f4.A00(new JsonPrimitive(Long.valueOf(j)), (C6f4) this);
        } else {
            A01();
            A00();
            this.A06.write(Long.toString(j));
        }
    }

    public void A0C(Boolean bool) {
        if (this instanceof C6f4) {
            C6f4 c6f4 = (C6f4) this;
            if (bool == null) {
                c6f4.A09();
                return;
            } else {
                C6f4.A00(new JsonPrimitive(bool), c6f4);
                return;
            }
        }
        if (bool == null) {
            A09();
            return;
        }
        A01();
        A00();
        this.A06.write(bool.booleanValue() ? "true" : "false");
    }

    public void A0D(Number number) {
        if (this instanceof C6f4) {
            C6f4 c6f4 = (C6f4) this;
            if (number == null) {
                c6f4.A09();
                return;
            }
            if (!((JsonWriter) c6f4).A02) {
                double doubleValue = number.doubleValue();
                if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                    throw AnonymousClass002.A0C(number, JQw.A00(49), AnonymousClass001.A0k());
                }
            }
            C6f4.A00(new JsonPrimitive(number), c6f4);
            return;
        }
        if (number == null) {
            A09();
            return;
        }
        A01();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !A07.matcher(obj).matches()) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("String created by ");
                A0k.append(cls);
                A0k.append(" is not a valid JSON number: ");
                throw AnonymousClass002.A0D(obj, A0k);
            }
        } else if (!this.A02) {
            throw 0Pz.A05("Numeric values must be finite, but was ", obj);
        }
        A00();
        this.A06.append((CharSequence) obj);
    }

    public void A0E(String str) {
        if (this instanceof C6f4) {
            throw new UnsupportedOperationException();
        }
        if (str == null) {
            A09();
            return;
        }
        A01();
        A00();
        this.A06.append((CharSequence) str);
    }

    public void A0F(String str) {
        if (!(this instanceof C6f4)) {
            C6f2.A00("name == null", str);
            if (this.A05 != null) {
                throw new IllegalStateException();
            }
            if (this.A00 == 0) {
                throw AnonymousClass001.A0N("JsonWriter is closed.");
            }
            this.A05 = str;
            return;
        }
        C6f4 c6f4 = (C6f4) this;
        C6f2.A00("name == null", str);
        List list = c6f4.A02;
        if (list.isEmpty() || c6f4.A01 != null) {
            throw new IllegalStateException();
        }
        if (!(list.get(AnonymousClass001.A04(list)) instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        c6f4.A01 = str;
    }

    public void A0G(String str) {
        if (this instanceof C6f4) {
            C6f4 c6f4 = (C6f4) this;
            if (str == null) {
                c6f4.A09();
                return;
            } else {
                C6f4.A00(new JsonPrimitive(str), c6f4);
                return;
            }
        }
        if (str == null) {
            A09();
            return;
        }
        A01();
        A00();
        A04(str);
    }

    public void A0H(boolean z) {
        if (this instanceof C6f4) {
            C6f4.A00(new JsonPrimitive(Boolean.valueOf(z)), (C6f4) this);
            return;
        }
        A01();
        A00();
        this.A06.write(z ? "true" : "false");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this instanceof C6f4) {
            List list = ((C6f4) this).A02;
            if (!list.isEmpty()) {
                throw AnonymousClass001.A0G("Incomplete document");
            }
            list.add(C6f4.A03);
            return;
        }
        this.A06.close();
        int i = this.A00;
        if (i > 1 || (i == 1 && this.A04[0] != 7)) {
            throw AnonymousClass001.A0G("Incomplete document");
        }
        this.A00 = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this instanceof C6f4) {
            return;
        }
        if (this.A00 == 0) {
            throw AnonymousClass001.A0N("JsonWriter is closed.");
        }
        this.A06.flush();
    }
}
