package X;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.24m, reason: invalid class name */
/* loaded from: 24m.class */
public final class C24m implements Serializable {
    public static final TimeZone A00 = TimeZone.getTimeZone("UTC");
    public static final long serialVersionUID = 1;
    public final C24l _accessorNaming;
    public final AnonymousClass248 _annotationIntrospector;
    public final C24n _classIntrospector;
    public final DateFormat _dateFormat;
    public final C24f _defaultBase64;
    public final AbstractC00933pU _handlerInstantiator = null;
    public final Locale _locale;
    public final C00913pS _propertyNamingStrategy;
    public final TimeZone _timeZone;
    public final 24R _typeFactory;
    public final InterfaceC00923pT _typeResolverBuilder;
    public final C24j _typeValidator;

    public C24m(C24f c24f, AnonymousClass248 anonymousClass248, C00913pS c00913pS, C24l c24l, C24n c24n, C24j c24j, InterfaceC00923pT interfaceC00923pT, 24R r309, DateFormat dateFormat, Locale locale, TimeZone timeZone) {
        this._classIntrospector = c24n;
        this._annotationIntrospector = anonymousClass248;
        this._propertyNamingStrategy = c00913pS;
        this._typeFactory = r309;
        this._typeResolverBuilder = interfaceC00923pT;
        this._dateFormat = dateFormat;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = c24f;
        this._typeValidator = c24j;
        this._accessorNaming = c24l;
    }
}
