package X;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.67p, reason: invalid class name */
/* loaded from: 67p.class */
public final class C67p {
    public static Object A00(24S r301) {
        Class cls = r301._class;
        Class A01 = 27C.A01(cls);
        if (A01 == null) {
            if (r301.A0Q() || r301.A04()) {
                return C25d.NON_EMPTY;
            }
            if (cls == String.class) {
                return "";
            }
            if (r301.A0T(Date.class)) {
                return new Date(0L);
            }
            if (!r301.A0T(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }
        if (A01 == Integer.TYPE) {
            return 0;
        }
        if (A01 == Long.TYPE) {
            return 4YV.A0j();
        }
        if (A01 == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (A01 == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (A01 == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (A01 == Byte.TYPE) {
            return (byte) 0;
        }
        if (A01 == Short.TYPE) {
            return (short) 0;
        }
        if (A01 == Character.TYPE) {
            return (char) 0;
        }
        throw 1BL.A0f("Class ", A01.getName(), 1BJ.A00(594));
    }

    public static String A01(24S r301) {
        Object obj;
        Object obj2;
        String name = r301._class.getName();
        String str = null;
        if (name.startsWith("java.time.")) {
            if (name.indexOf(46, 10) < 0) {
                obj = "Java 8 date/time";
                obj2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
                str = String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", obj, 27C.A04(r301), obj2);
            }
        } else if (name.startsWith("org.joda.time.")) {
            obj = "Joda date/time";
            obj2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
            str = String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", obj, 27C.A04(r301), obj2);
        }
        return str;
    }
}
