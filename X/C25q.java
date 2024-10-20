package X;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.25q, reason: invalid class name */
/* loaded from: 25q.class */
public abstract class C25q extends AnonymousClass253 implements Serializable {
    public static final long A00;
    public static final C25y A01 = C25x.A00;
    public static final long A02;
    public final C26K _attributes;
    public final C25b _configOverrides;
    public final C25a _mixIns;
    public final C26G _rootName;
    public final 25Z _rootNames;
    public final 25Y _subtypeResolver;
    public final Class _view;

    static {
        AnonymousClass260[] values = AnonymousClass260.values();
        int length = values.length;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A02 = j;
                A00 = AnonymousClass260.A09._mask | AnonymousClass260.A0A._mask | AnonymousClass260.A0B._mask | AnonymousClass260.A0C._mask | AnonymousClass260.A08._mask;
                return;
            } else {
                AnonymousClass260 anonymousClass260 = values[i2];
                if (anonymousClass260._defaultState) {
                    j |= anonymousClass260._mask;
                }
                i = i2 + 1;
            }
        }
    }

    public C25q(C24m c24m, C25b c25b, C25a c25a, 25Y r305, 25Z r306) {
        super(c24m, A02);
        this._mixIns = c25a;
        this._subtypeResolver = r305;
        this._rootNames = r306;
        this._rootName = null;
        this._view = null;
        this._attributes = C26I.A01;
        this._configOverrides = c25b;
    }

    public C25q(C24m c24m, C25q c25q) {
        super(c24m, c25q);
        this._mixIns = c25q._mixIns;
        this._subtypeResolver = c25q._subtypeResolver;
        this._rootNames = c25q._rootNames;
        this._rootName = c25q._rootName;
        this._view = c25q._view;
        this._attributes = c25q._attributes;
        this._configOverrides = c25q._configOverrides;
    }

    public C25q(C25q c25q, long j) {
        super(c25q, j);
        this._mixIns = c25q._mixIns;
        this._subtypeResolver = c25q._subtypeResolver;
        this._rootNames = c25q._rootNames;
        this._rootName = c25q._rootName;
        this._view = c25q._view;
        this._attributes = c25q._attributes;
        this._configOverrides = c25q._configOverrides;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r306._ignoreUnknown != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r306._allowGetters != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r306 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.68Z A0A(X.C24q r302, java.lang.Class r303) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25q.A0A(X.24q, java.lang.Class):X.68Z");
    }

    public final C25q A0B(C00913pS c00913pS) {
        C24m c24m = this._base;
        if (c24m._propertyNamingStrategy != c00913pS) {
            C24n c24n = c24m._classIntrospector;
            AnonymousClass248 anonymousClass248 = c24m._annotationIntrospector;
            24R r0 = c24m._typeFactory;
            InterfaceC00923pT interfaceC00923pT = c24m._typeResolverBuilder;
            DateFormat dateFormat = c24m._dateFormat;
            Locale locale = c24m._locale;
            TimeZone timeZone = c24m._timeZone;
            c24m = new C24m(c24m._defaultBase64, anonymousClass248, c00913pS, c24m._accessorNaming, c24n, c24m._typeValidator, interfaceC00923pT, r0, dateFormat, locale, timeZone);
        }
        return A0C(c24m);
    }

    public abstract C25q A0C(C24m c24m);

    public final C25q A0D(24R r302) {
        C24m c24m = this._base;
        if (c24m._typeFactory != r302) {
            C24n c24n = c24m._classIntrospector;
            AnonymousClass248 anonymousClass248 = c24m._annotationIntrospector;
            C00913pS c00913pS = c24m._propertyNamingStrategy;
            InterfaceC00923pT interfaceC00923pT = c24m._typeResolverBuilder;
            DateFormat dateFormat = c24m._dateFormat;
            Locale locale = c24m._locale;
            TimeZone timeZone = c24m._timeZone;
            c24m = new C24m(c24m._defaultBase64, anonymousClass248, c00913pS, c24m._accessorNaming, c24n, c24m._typeValidator, interfaceC00923pT, r302, dateFormat, locale, timeZone);
        }
        return A0C(c24m);
    }

    @Override // X.C24z
    public final Class ASt(Class cls) {
        return this._mixIns.ASt(cls);
    }
}
