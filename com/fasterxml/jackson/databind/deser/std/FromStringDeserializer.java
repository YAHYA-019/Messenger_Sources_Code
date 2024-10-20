package com.fasterxml.jackson.databind.deser.std;

import X.0Pz;
import X.0Q8;
import X.0S2;
import X.1BJ;
import X.27C;
import X.3BP;
import X.AbstractC00603o4;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.C0A2;
import X.C25m;
import X.C27F;
import X.C27T;
import X.C42h;
import X.C42x;
import com.facebook.acra.constants.ActionId;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: FromStringDeserializer.class */
public abstract class FromStringDeserializer extends StdScalarDeserializer {

    /* loaded from: FromStringDeserializer$Std.class */
    public class Std extends FromStringDeserializer {
        public static final long serialVersionUID = 1;
        public final int _kind;

        public Std(Class cls, int i) {
            super(cls);
            this._kind = i;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object A0U(C27T c27t) {
            int i = this._kind;
            return i != 3 ? i != 8 ? Azd(c27t) : Locale.ROOT : URI.create("");
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object A12(C27T c27t) {
            return A0U(c27t);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object A14(C27T c27t, String str) {
            int indexOf;
            int parseInt;
            switch (this._kind) {
                case 1:
                    return AnonymousClass001.A0E(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return c27t._config._base._typeFactory.A0E(str);
                    } catch (Exception e) {
                        e = e;
                        Class cls = this._valueClass;
                        C27F[] c27fArr = 27C.A01;
                        while (e.getCause() != null) {
                            e = e.getCause();
                        }
                        c27t.A0m(cls, e);
                        throw 0Q8.createAndThrow();
                    }
                case 5:
                    return c27t.A0A().A08(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int length = str.length();
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            char charAt = str.charAt(i);
                            if (charAt != '_' && charAt != '-') {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, i);
                    String substring2 = str.substring(i + 1);
                    int length2 = substring2.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            char charAt2 = substring2.charAt(i2);
                            if (charAt2 != '_' && charAt2 != '-') {
                                i2++;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    if (i2 < 0) {
                        return new Locale(substring, substring2);
                    }
                    String substring3 = substring2.substring(0, i2);
                    int indexOf2 = substring2.indexOf("_#");
                    if (indexOf2 < 0) {
                        return new Locale(substring, substring3, substring2.substring(i2 + 1));
                    }
                    String str2 = "";
                    if (indexOf2 > 0 && indexOf2 > i2) {
                        try {
                            str2 = substring2.substring(i2 + 1, indexOf2);
                        } catch (IllformedLocaleException unused) {
                            return new Locale(substring, substring3, str2);
                        }
                    }
                    String substring4 = substring2.substring(indexOf2 + 2);
                    int indexOf3 = substring4.indexOf(95);
                    if (indexOf3 < 0 && substring4.indexOf(45) < 0) {
                        return new Locale.Builder().setLanguage(substring).setRegion(substring3).setVariant(str2).setScript(substring4).build();
                    }
                    if (indexOf3 < 0) {
                        return new Locale.Builder().setLanguage(substring).setRegion(substring3).setVariant(str2).setExtension(substring4.charAt(0), substring4.substring(substring4.indexOf(45) + 1)).build();
                    }
                    return new Locale.Builder().setLanguage(substring).setRegion(substring3).setVariant(str2).setScript(substring4.substring(0, indexOf3)).setExtension(substring4.charAt(indexOf3 + 1), substring4.substring(indexOf3 + 3)).build();
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (!str.startsWith("[")) {
                        indexOf = str.indexOf(58);
                        if (indexOf >= 0) {
                            int i3 = indexOf + 1;
                            if (str.indexOf(58, i3) < 0) {
                                parseInt = Integer.parseInt(str.substring(i3));
                            }
                        }
                        return new InetSocketAddress(str, 0);
                    }
                    int lastIndexOf = str.lastIndexOf(93);
                    if (lastIndexOf == -1) {
                        throw new 3BP(c27t.A00, InetSocketAddress.class, str, "Bracketed IPv6 address must contain closing bracket");
                    }
                    int indexOf4 = str.indexOf(58, lastIndexOf);
                    parseInt = indexOf4 > -1 ? Integer.parseInt(str.substring(indexOf4 + 1)) : 0;
                    indexOf = lastIndexOf + 1;
                    return new InetSocketAddress(str.substring(0, indexOf), parseInt);
                default:
                    throw AnonymousClass001.A0T(AbstractC00603o4.A00(366));
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public boolean A15() {
            boolean z = false;
            if (this._kind != 7) {
                z = true;
            }
            return z;
        }
    }

    /* loaded from: FromStringDeserializer$StringBufferDeserializer.class */
    public class StringBufferDeserializer extends FromStringDeserializer {
        public StringBufferDeserializer() {
            super(StringBuffer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String A1z = abstractC01033pi.A1z();
            return A1z != null ? new StringBuffer(A1z) : super.A0M(abstractC01033pi, c27t);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public C42x A0Q() {
            return C42x.Textual;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object A0U(C27T c27t) {
            return new StringBuffer();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object A14(C27T c27t, String str) {
            return new StringBuffer(str);
        }
    }

    /* loaded from: FromStringDeserializer$StringBuilderDeserializer.class */
    public class StringBuilderDeserializer extends FromStringDeserializer {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String A1z = abstractC01033pi.A1z();
            return A1z != null ? new StringBuilder(A1z) : super.A0M(abstractC01033pi, c27t);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        String str;
        Object A1R;
        String A1z = abstractC01033pi.A1z();
        if (A1z == null) {
            C42h A1I = abstractC01033pi.A1I();
            if (A1I != C42h.A06) {
                if (A1I == C42h.A05) {
                    A1R = A0p(abstractC01033pi, c27t);
                } else if (A1I == C42h.A07) {
                    A1R = abstractC01033pi.A1R();
                    if (A1R == null) {
                        return null;
                    }
                    if (!this._valueClass.isAssignableFrom(A1R.getClass())) {
                        return A13(c27t, A1R);
                    }
                }
                return A1R;
            }
            c27t.A0Y(abstractC01033pi, this._valueClass);
        } else {
            if (!A1z.isEmpty()) {
                if (A15()) {
                    String trim = A1z.trim();
                    if (trim == A1z || !trim.isEmpty()) {
                        A1z = trim;
                    }
                }
                try {
                    return A14(c27t, A1z);
                } catch (IllegalArgumentException | MalformedURLException e) {
                    str = "not a valid textual representation";
                    String message = e.getMessage();
                    3BP A0Q = c27t.A0Q(this._valueClass, A1z, message != null ? 0Pz.A0j(str, 1BJ.A00(ActionId.RTMP_CONNECTION_INTERCEPTED), message) : "not a valid textual representation");
                    A0Q.initCause(e);
                    throw A0Q;
                }
            }
            C25m A0O = c27t.A0O(A0Q(), this._valueClass, 0S2.A1J);
            if (A0O != C25m.Fail) {
                return A0O == C25m.AsNull ? Azd(c27t) : A0O == C25m.AsEmpty ? A0U(c27t) : A12(c27t);
            }
            c27t.A0e(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", A0s());
        }
        throw 0Q8.createAndThrow();
    }

    public Object A12(C27T c27t) {
        return Azd(c27t);
    }

    public Object A13(C27T c27t, Object obj) {
        c27t.A0e(this, "Don't know how to convert embedded Object of type %s into %s", AnonymousClass001.A0Y(obj), this._valueClass.getName());
        throw 0Q8.createAndThrow();
    }

    public Object A14(C27T c27t, String str) {
        return this instanceof StringBuilderDeserializer ? new StringBuilder(str) : C0A2.A03(str);
    }

    public boolean A15() {
        return true;
    }
}
