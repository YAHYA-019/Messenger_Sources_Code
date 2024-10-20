package X;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import java.io.Serializable;

/* renamed from: X.247, reason: invalid class name */
/* loaded from: 247.class */
public final class AnonymousClass247 extends AnonymousClass248 implements Serializable {
    public static final long serialVersionUID = 1;
    public transient 24K A00 = new 24K(48, 48);
    public boolean _cfgConstructorPropertiesImpliesCreator = true;
    public static final Class[] A02 = {JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};
    public static final Class[] A01 = {JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class, JsonMerge.class};

    static {
        try {
            24J r0 = 24J.$redex_init_class;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v88, types: [X.3pT] */
    public static InterfaceC00923pT A00(AnonymousClass253 anonymousClass253, C24r c24r) {
        StdTypeResolverBuilder stdTypeResolverBuilder;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) c24r.A06(JsonTypeInfo.class);
        JsonTypeResolver jsonTypeResolver = (JsonTypeResolver) c24r.A06(JsonTypeResolver.class);
        MKA mka = null;
        if (jsonTypeResolver != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            stdTypeResolverBuilder = (InterfaceC00923pT) 1BK.A0q(anonymousClass253, jsonTypeResolver.value());
        } else {
            if (jsonTypeInfo == null) {
                return null;
            }
            KNk use = jsonTypeInfo.use();
            KNk kNk = KNk.NONE;
            if (use == kNk) {
                StdTypeResolverBuilder stdTypeResolverBuilder2 = new StdTypeResolverBuilder();
                stdTypeResolverBuilder2._idType = kNk;
                stdTypeResolverBuilder2._customIdResolver = null;
                stdTypeResolverBuilder2._typeProperty = kNk._defaultPropertyName;
                return stdTypeResolverBuilder2;
            }
            stdTypeResolverBuilder = new StdTypeResolverBuilder();
        }
        JsonTypeIdResolver jsonTypeIdResolver = (JsonTypeIdResolver) c24r.A06(JsonTypeIdResolver.class);
        if (jsonTypeIdResolver != null) {
            mka = (MKA) 1BK.A0q(anonymousClass253, jsonTypeIdResolver.value());
        }
        KNk use2 = jsonTypeInfo.use();
        StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder;
        if (use2 == null) {
            throw AnonymousClass001.A0L("idType cannot be null");
        }
        stdTypeResolverBuilder3._idType = use2;
        stdTypeResolverBuilder3._customIdResolver = mka;
        stdTypeResolverBuilder3._typeProperty = use2._defaultPropertyName;
        KN1 include = jsonTypeInfo.include();
        if (include == KN1.EXTERNAL_PROPERTY) {
            if (c24r instanceof C24q) {
                include = KN1.PROPERTY;
            }
        } else if (include == null) {
            throw AnonymousClass001.A0L("includeAs cannot be null");
        }
        stdTypeResolverBuilder3._includeAs = include;
        String property = jsonTypeInfo.property();
        if (property == null || property.isEmpty()) {
            property = stdTypeResolverBuilder3._idType._defaultPropertyName;
        }
        stdTypeResolverBuilder3._typeProperty = property;
        Class defaultImpl = jsonTypeInfo.defaultImpl();
        if (defaultImpl != 3HN.class && !defaultImpl.isAnnotation()) {
            stdTypeResolverBuilder3._defaultImpl = defaultImpl;
        }
        stdTypeResolverBuilder3._typeIdVisible = jsonTypeInfo.visible();
        return stdTypeResolverBuilder;
    }

    public static boolean A01(24S r301, Class cls) {
        boolean z;
        if (r301._class.isPrimitive()) {
            z = AnonymousClass001.A1W(r301._class, 27C.A01(cls));
        } else {
            z = false;
            if (cls.isPrimitive() && cls == 27C.A01(r301._class)) {
                return true;
            }
        }
        return z;
    }

    public static boolean A02(Class cls, Class cls2) {
        return cls.isPrimitive() ? cls == 27C.A01(cls2) : cls2.isPrimitive() && cls2 == 27C.A01(cls);
    }

    public Object readResolve() {
        if (this.A00 == null) {
            this.A00 = new 24K(48, 48);
        }
        return this;
    }
}
