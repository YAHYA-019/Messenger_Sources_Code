package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.243, reason: invalid class name */
/* loaded from: 243.class */
public final class AnonymousClass243 extends AnonymousClass244 {
    public static AnonymousClass243 A00;
    public boolean mHumanReadableFormatEnabled;
    public final 25W mJsonLogger;

    static {
        C24p c24p = new C24p() { // from class: X.24o
            @Override // X.C24p
            public AnonymousClass251 A04(C26L c26l, 24S r303, C24z c24z) {
                AnonymousClass251 A01 = C24p.A01(r303, null);
                if (A01 == null) {
                    JsonDeserialize jsonDeserialize = (JsonDeserialize) r303._class.getAnnotation(JsonDeserialize.class);
                    if (jsonDeserialize == null || jsonDeserialize.using() == null) {
                        return super.A04(c26l, r303, c24z);
                    }
                    A01 = super.A06(r303, c26l, c24z);
                }
                return A01;
            }

            @Override // X.C24p
            public AnonymousClass251 A05(24S r302, C25p c25p, C24z c24z) {
                AnonymousClass251 A01 = C24p.A01(r302, null);
                if (A01 == null) {
                    JsonSerialize jsonSerialize = (JsonSerialize) r302._class.getAnnotation(JsonSerialize.class);
                    if (jsonSerialize == null || jsonSerialize.using() == null) {
                        return super.A05(r302, c25p, c24z);
                    }
                    A01 = super.A06(r302, c25p, c24z);
                }
                return A01;
            }
        };
        AnonymousClass248 anonymousClass248 = AnonymousClass244.A00;
        24R r0 = 24R.A06;
        C24d c24d = C24d.A03;
        Locale locale = Locale.getDefault();
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C24m c24m = new C24m(C24e.A01, anonymousClass248, null, new C24k(), c24p, new AnonymousClass256(), null, r0, c24d, locale, timeZone);
        try {
            Field declaredField = AnonymousClass244.class.getDeclaredField("DEFAULT_INTROSPECTOR");
            declaredField.setAccessible(true);
            declaredField.set(null, c24p);
            Field declaredField2 = AnonymousClass244.class.getDeclaredField("DEFAULT_BASE");
            declaredField2.setAccessible(true);
            declaredField2.set(null, c24m);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.28b] */
    public AnonymousClass243(25W r302, AnonymousClass259 anonymousClass259, boolean z) {
        super(anonymousClass259);
        this.mJsonLogger = r302;
        A0Y(new Object());
        C25k c25k = C25k.NONE;
        C25b c25b = this._configOverrides;
        c25b._visibilityChecker = new C25i(c25k);
        A0X(C26O.A0F);
        C25d c25d = C25d.NON_NULL;
        c25b._defaultInclusion = new C25c(c25d, c25d, null, null);
        this.mHumanReadableFormatEnabled = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 2, list:
          (r302v2 ??) from 0x0034: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x000a, B:19:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:X.243) from 0x0031: SPUT (r302v2 ?? I:X.243) A[Catch: all -> 0x0038] X.243.A00 X.243
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static X.AnonymousClass243 A00() {
        /*
            java.lang.Class<X.243> r0 = X.AnonymousClass243.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            X.243 r0 = X.AnonymousClass243.A00     // Catch: java.lang.Throwable -> L38
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L34
            r0 = 0
            r303 = r0
            X.259 r0 = new X.259     // Catch: java.lang.Throwable -> L38
            r304 = r0
            r0 = r304
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            X.25V r0 = new X.25V     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L38
            r305 = r0
            r0 = r305
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            r0 = 0
            r303 = r0
            X.243 r0 = new X.243     // Catch: java.lang.Throwable -> L38
            r302 = r0
            r0 = r302
            r1 = r305
            r2 = r304
            r3 = 0
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L38
            r0 = r302
            X.AnonymousClass243.A00 = r0     // Catch: java.lang.Throwable -> L38
        L34:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L38:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass243.A00():X.243");
    }

    @Override // X.AnonymousClass244
    public JsonDeserializer A0G(C27T c27t, 24S r303) {
        return A0d(c27t, r303);
    }

    @Override // X.AnonymousClass244
    public Object A0M(AbstractC01033pi abstractC01033pi, C26L c26l, 24S r304) {
        if (abstractC01033pi.A1M() == null) {
            abstractC01033pi.A1h(this);
        }
        return super.A0M(abstractC01033pi, c26l, r304);
    }

    @Override // X.AnonymousClass244
    public Object A0N(AbstractC01033pi abstractC01033pi, 24S r303) {
        if (abstractC01033pi.A1M() == null) {
            abstractC01033pi.A1h(this);
        }
        return super.A0N(abstractC01033pi, r303);
    }

    public AnonymousClass243 A0c() {
        AnonymousClass259 anonymousClass259 = new AnonymousClass259(null);
        AnonymousClass243 anonymousClass243 = new AnonymousClass243(this.mJsonLogger, anonymousClass259, true);
        anonymousClass259._objectCodec = anonymousClass243;
        return anonymousClass243;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r306 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonDeserializer A0d(X.C27T r302, X.24S r303) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass243.A0d(X.27T, X.24S):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public JsonDeserializer A0e(C27T c27t, Class cls) {
        JsonDeserializer A002 = C42l.A00(cls);
        if (A002 == null) {
            A002 = super.A0G(c27t, this._typeFactory.A09(cls));
            if (this.mJsonLogger != null) {
                0fH.A0b(A002, "deserialize", cls.toString(), "JACKSON_FALLBACK", "Using %s to %s %s");
            }
        }
        return A002;
    }

    public JsonDeserializer A0f(C27T c27t, Type type) {
        return type instanceof Class ? A0e(c27t, (Class) type) : A0d(c27t, this._typeFactory.A09(type));
    }
}
