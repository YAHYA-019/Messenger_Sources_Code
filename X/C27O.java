package X;

import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.27O, reason: invalid class name */
/* loaded from: 27O.class */
public final class C27O implements C27P, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static 3Au A00(C26L c26l, AbstractC00953pX abstractC00953pX) {
        if (abstractC00953pX instanceof C00943pV) {
            Constructor constructor = ((C00943pV) abstractC00953pX)._constructor;
            if (c26l.A07()) {
                1BL.A1B(c26l, constructor);
            }
            return new 3BJ(constructor);
        }
        Method method = ((C68D) abstractC00953pX).A00;
        if (c26l.A07()) {
            1BL.A1B(c26l, method);
        }
        return new 3BK(method);
    }

    @Override // X.C27P
    public KnN ASm(C26L c26l, 24S r303, AnonymousClass251 anonymousClass251) {
        int i;
        FromStringDeserializer.Std std;
        int i2;
        Class cls = r303._class;
        if (cls.isPrimitive()) {
            cls = 27C.A02(cls);
        }
        if (cls == String.class) {
            return 3BI.A01;
        }
        if (cls == Object.class) {
            return 3BI.A00;
        }
        if (cls == CharSequence.class || cls == Serializable.class) {
            return new 3Au((FromStringDeserializer) null, cls, -1);
        }
        if (cls == UUID.class) {
            i = 12;
        } else if (cls == Integer.class) {
            i = 5;
        } else if (cls == Long.class) {
            i = 6;
        } else if (cls == Date.class) {
            i = 10;
        } else if (cls == Calendar.class) {
            i = 11;
        } else if (cls == Boolean.class) {
            i = 1;
        } else if (cls == Byte.class) {
            i = 2;
        } else if (cls == Character.class) {
            i = 4;
        } else if (cls == Short.class) {
            i = 3;
        } else if (cls == Float.class) {
            i = 7;
        } else if (cls == Double.class) {
            i = 8;
        } else if (cls == URI.class) {
            i = 13;
        } else if (cls == URL.class) {
            i = 14;
        } else {
            if (cls != Class.class) {
                if (cls == Locale.class) {
                    std = new FromStringDeserializer.Std(Locale.class, 8);
                    i2 = 9;
                } else if (cls == Currency.class) {
                    std = new FromStringDeserializer.Std(Currency.class, 6);
                    i2 = 16;
                } else {
                    if (cls != byte[].class) {
                        return null;
                    }
                    i = 17;
                }
                return new 3Au(std, cls, i2);
            }
            i = 15;
        }
        return new 3Au((FromStringDeserializer) null, cls, i);
    }
}
