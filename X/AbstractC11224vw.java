package X;

import com.facebook.common.json.ImmutableListDeserializer;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4vw.class */
public abstract class AbstractC11224vw {
    public static ImmutableList A00(AbstractC01033pi abstractC01033pi, C27T c27t, Class cls) {
        return abstractC01033pi.A1J() == C42h.A09 ? ImmutableList.of() : (ImmutableList) new ImmutableListDeserializer(cls).A0M(abstractC01033pi, c27t);
    }

    public static Object A01(AbstractC01033pi abstractC01033pi, C27T c27t, 24S r303) {
        if (abstractC01033pi.A1J() != C42h.A09) {
            return ((AnonymousClass243) abstractC01033pi.A1M()).A0d(c27t, r303).A0M(abstractC01033pi, c27t);
        }
        abstractC01033pi.A20();
        return null;
    }

    public static Object A02(AbstractC01033pi abstractC01033pi, C27T c27t, Type type) {
        24S A09;
        if (abstractC01033pi.A1J() == C42h.A09) {
            abstractC01033pi.A20();
            return null;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (ImmutableList.class.isAssignableFrom(cls)) {
                Preconditions.checkState(4YV.A1U(actualTypeArguments.length));
                24S A092 = 24R.A06.A09(actualTypeArguments[0]);
                TypeVariable[] typeParameters = cls.getTypeParameters();
                A09 = new C31a(cls.getSuperclass() == null ? null : 24R.A03, A092, (typeParameters == null || typeParameters.length != 1) ? 24W.A00 : 24W.A01(A092, cls), cls, null, null, null, false);
                return A01(abstractC01033pi, c27t, A09);
            }
        }
        A09 = 24R.A06.A09(type);
        return A01(abstractC01033pi, c27t, A09);
    }

    public static String A03(AbstractC01033pi abstractC01033pi) {
        String A1Z;
        if (abstractC01033pi.A1J() == C42h.A09) {
            abstractC01033pi.A20();
            A1Z = null;
        } else {
            A1Z = abstractC01033pi.A1Z();
            if (A1Z == null) {
                4DN A1C = abstractC01033pi.A1C();
                IOException iOException = new IOException("Failed to read text from Json stream", null);
                ((2LD) iOException)._location = A1C;
                throw iOException;
            }
        }
        return A1Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (((X.4iJ) r302).mHumanReadableFormatEnabled == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(X.28Q r301, X.C26c r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC11224vw.A04(X.28Q, X.26c, java.lang.Object):void");
    }

    public static void A05(28Q r301, C26c c26c, Object obj, String str) {
        if (obj != null) {
            r301.A0o(str);
            A04(r301, c26c, obj);
        }
    }

    public static void A06(28Q r301, C26c c26c, String str, Collection collection) {
        if (collection != null) {
            r301.A0o(str);
            A07(r301, c26c, collection);
        }
    }

    public static void A07(28Q r301, C26c c26c, Collection collection) {
        if (collection != null) {
            r301.A0a();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A04(r301, c26c, it.next());
            }
            r301.A0X();
        }
    }

    public static void A08(28Q r301, Boolean bool, String str) {
        if (bool != null) {
            r301.A0o(str);
            r301.A0v(bool.booleanValue());
        }
    }

    public static void A09(28Q r301, Double d, String str) {
        if (d != null) {
            r301.A0o(str);
            r301.A0d(d.doubleValue());
        }
    }

    public static void A0A(28Q r301, Float f, String str) {
        if (f != null) {
            r301.A0o(str);
            r301.A0e(f.floatValue());
        }
    }

    public static void A0B(28Q r301, Integer num, String str) {
        if (num != null) {
            r301.A0o(str);
            r301.A0f(num.intValue());
        }
    }

    public static void A0C(28Q r301, Long l, String str) {
        if (l != null) {
            r301.A0o(str);
            r301.A0g(l.longValue());
        }
    }

    public static void A0D(28Q r301, String str, String str2) {
        if (str2 != null) {
            r301.A0o(str);
            r301.A0r(str2);
        }
    }
}
