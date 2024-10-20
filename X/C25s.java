package X;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.25s, reason: invalid class name */
/* loaded from: 25s.class */
public final class C25s implements Serializable {
    public static final C25s A01 = new C25s();
    public static final long serialVersionUID = 1;
    public transient TimeZone A00;
    public final C25v _features;
    public final Boolean _lenient;
    public final Locale _locale;
    public final String _pattern;
    public final C25t _shape;
    public final String _timezoneStr;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C25s() {
        /*
            r301 = this;
            X.25t r0 = X.C25t.ANY
            r302 = r0
            X.25v r0 = X.C25v.A02
            r303 = r0
            java.lang.String r0 = ""
            r304 = r0
            r0 = r304
            int r0 = r0.length()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
            java.util.Locale r0 = new java.util.Locale
            r306 = r0
            r0 = r306
            r1 = r304
            r0.<init>(r1)
            r0 = r304
            r307 = r0
        L24:
            r0 = r301
            r1 = r303
            r2 = r302
            r3 = 0
            r4 = r304
            r5 = r307
            r6 = r306
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L32:
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25s.<init>():void");
    }

    public C25s(C25v c25v, C25t c25t, Boolean bool, String str, String str2, Locale locale, TimeZone timeZone) {
        this._pattern = str == null ? "" : str;
        this._shape = c25t == null ? C25t.ANY : c25t;
        this._locale = locale;
        this.A00 = timeZone;
        this._timezoneStr = str2;
        this._features = c25v == null ? C25v.A02 : c25v;
        this._lenient = bool;
    }

    public final C25s A00(C25s c25s) {
        C25s c25s2;
        TimeZone timeZone;
        C25s c25s3 = c25s;
        if (c25s == null || c25s == (c25s2 = A01) || c25s == this) {
            return this;
        }
        if (this != c25s2) {
            String str = c25s._pattern;
            if (str == null || str.isEmpty()) {
                str = this._pattern;
            }
            C25t c25t = c25s._shape;
            if (c25t == C25t.ANY) {
                c25t = this._shape;
            }
            Locale locale = c25s._locale;
            if (locale == null) {
                locale = this._locale;
            }
            C25v c25v = this._features;
            if (c25v == null) {
                c25v = c25s._features;
            } else {
                C25v c25v2 = c25s._features;
                if (c25v2 != null) {
                    int i = c25v2.A00;
                    int i2 = c25v2.A01;
                    if (i != 0 || i2 != 0) {
                        int i3 = c25v.A01;
                        if (i3 != 0 || c25v.A00 != 0) {
                            int i4 = ((i ^ (-1)) & i3) | i2;
                            int i5 = c25v.A00;
                            int i6 = i | ((i2 ^ (-1)) & i5);
                            if (i4 != i3 || i6 != i5) {
                                c25v2 = new C25v(i4, i6);
                            }
                        }
                        c25v = c25v2;
                    }
                }
            }
            Boolean bool = c25s._lenient;
            if (bool == null) {
                bool = this._lenient;
            }
            String str2 = c25s._timezoneStr;
            if (str2 == null || str2.isEmpty()) {
                str2 = this._timezoneStr;
                timeZone = this.A00;
            } else {
                timeZone = c25s.A00;
            }
            c25s3 = new C25s(c25v, c25t, bool, str, str2, locale, timeZone);
        }
        return c25s3;
    }

    public Boolean A01(C68k c68k) {
        C25v c25v = this._features;
        int ordinal = 1 << c68k.ordinal();
        if ((c25v.A00 & ordinal) != 0) {
            return Boolean.FALSE;
        }
        if ((ordinal & c25v.A01) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public TimeZone A02() {
        TimeZone timeZone = this.A00;
        if (timeZone == null) {
            String str = this._timezoneStr;
            if (str != null) {
                TimeZone timeZone2 = TimeZone.getTimeZone(str);
                this.A00 = timeZone2;
                return timeZone2;
            }
            timeZone = null;
        }
        return timeZone;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C25s c25s = (C25s) obj;
            if (this._shape != c25s._shape || !this._features.equals(c25s._features)) {
                return false;
            }
            Boolean bool = this._lenient;
            Boolean bool2 = c25s._lenient;
            if (bool == null) {
                if (bool2 != null) {
                    return false;
                }
            } else if (bool2 == null || !bool.equals(bool2)) {
                return false;
            }
            String str = this._timezoneStr;
            String str2 = c25s._timezoneStr;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            String str3 = this._pattern;
            String str4 = c25s._pattern;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (str4 == null || !str3.equals(str4)) {
                return false;
            }
            TimeZone timeZone = this.A00;
            TimeZone timeZone2 = c25s.A00;
            if (timeZone == null) {
                if (timeZone2 != null) {
                    return false;
                }
            } else if (timeZone2 == null || !timeZone.equals(timeZone2)) {
                return false;
            }
            Locale locale = this._locale;
            Locale locale2 = c25s._locale;
            if (locale != null) {
                return locale2 != null && locale.equals(locale2);
            }
            if (locale2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this._timezoneStr;
        int hashCode = str == null ? 1 : str.hashCode();
        String str2 = this._pattern;
        if (str2 != null) {
            hashCode ^= str2.hashCode();
        }
        int A03 = 1BK.A03(this._shape, hashCode);
        Boolean bool = this._lenient;
        if (bool != null) {
            A03 ^= bool.hashCode();
        }
        Locale locale = this._locale;
        if (locale != null) {
            A03 = 1BK.A03(locale, A03);
        }
        return A03 ^ this._features.hashCode();
    }

    public String toString() {
        return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features);
    }
}
