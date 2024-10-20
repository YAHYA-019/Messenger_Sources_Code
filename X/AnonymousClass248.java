package X;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.248, reason: invalid class name */
/* loaded from: 248.class */
public abstract class AnonymousClass248 implements Serializable {
    public static Object[] A03(C24r c24r, Class cls, Object obj, Throwable th) {
        return new Object[]{obj, cls.getName(), c24r.A05(), th.getMessage()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r305 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.7Ro A04(X.AbstractC00953pX r302) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass248.A04(X.3pX):X.7Ro");
    }

    public 68P A05(C24r c24r) {
        JsonCreator jsonCreator;
        if (!(this instanceof AnonymousClass247) || (jsonCreator = (JsonCreator) c24r.A06(JsonCreator.class)) == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    public C25s A06(C24r c24r) {
        if (!(this instanceof AnonymousClass247)) {
            return C25s.A01;
        }
        JsonFormat jsonFormat = (JsonFormat) c24r.A06(JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        C25s c25s = C25s.A01;
        String pattern = jsonFormat.pattern();
        C25t shape = jsonFormat.shape();
        String locale = jsonFormat.locale();
        String timezone = jsonFormat.timezone();
        C68k[] with = jsonFormat.with();
        C68k[] without = jsonFormat.without();
        int i = 0;
        for (C68k c68k : with) {
            i |= 1 << c68k.ordinal();
        }
        int i2 = 0;
        for (C68k c68k2 : without) {
            i2 |= 1 << c68k2.ordinal();
        }
        C25v c25v = new C25v(i, i2);
        3Da lenient = jsonFormat.lenient();
        Boolean bool = lenient == 3Da.A00 ? null : lenient == 3Da.A01 ? Boolean.TRUE : Boolean.FALSE;
        Locale locale2 = (locale == null || locale.length() == 0 || "##default".equals(locale)) ? null : new Locale(locale);
        if (timezone == null || timezone.length() == 0 || "##default".equals(timezone)) {
            timezone = null;
        }
        return new C25s(c25v, shape, bool, pattern, timezone, locale2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v0 */
    /* JADX WARN: Type inference failed for: r308v1 */
    /* JADX WARN: Type inference failed for: r308v2, types: [java.util.HashSet, java.util.AbstractCollection] */
    public 68Z A07(C24r c24r) {
        JsonIgnoreProperties jsonIgnoreProperties;
        Set emptySet;
        int length;
        if (!(this instanceof AnonymousClass247) || (jsonIgnoreProperties = (JsonIgnoreProperties) c24r.A06(JsonIgnoreProperties.class)) == null) {
            return 68Z.A00;
        }
        68Z r0 = 68Z.A00;
        String[] value = jsonIgnoreProperties.value();
        if (value == null || (length = value.length) == 0) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = new HashSet(length);
            int i = 0;
            do {
                emptySet.add(value[i]);
                i++;
            } while (i < length);
        }
        return 68Z.A00(emptySet, jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C25c A08(X.C24r r302) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass248.A08(X.24r):X.25c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0 */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v2, types: [java.util.HashSet, java.util.AbstractCollection] */
    public C68b A09(C24r c24r) {
        JsonIncludeProperties jsonIncludeProperties;
        Set emptySet;
        int length;
        if (!(this instanceof AnonymousClass247) || (jsonIncludeProperties = (JsonIncludeProperties) c24r.A06(JsonIncludeProperties.class)) == null) {
            return C68b.A00;
        }
        String[] value = jsonIncludeProperties.value();
        if (value == null || (length = value.length) == 0) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = new HashSet(length);
            int i = 0;
            do {
                emptySet.add(value[i]);
                i++;
            } while (i < length);
        }
        return new C68b(emptySet);
    }

    public 68I A0A(C24r c24r) {
        JsonProperty jsonProperty;
        if (!(this instanceof AnonymousClass247) || (jsonProperty = (JsonProperty) c24r.A06(JsonProperty.class)) == null) {
            return null;
        }
        return jsonProperty.access();
    }

    public C25g A0B(C24r c24r) {
        JsonSetter jsonSetter;
        if ((this instanceof AnonymousClass247) && (jsonSetter = (JsonSetter) c24r.A06(JsonSetter.class)) != null) {
            C25h nulls = jsonSetter.nulls();
            C25h contentNulls = jsonSetter.contentNulls();
            if (nulls == null) {
                nulls = C25h.DEFAULT;
            }
            if (contentNulls == null) {
                contentNulls = C25h.DEFAULT;
            }
            C25h c25h = C25h.DEFAULT;
            if (nulls != c25h || contentNulls != c25h) {
                return new C25g(nulls, contentNulls);
            }
        }
        return C25g.A00;
    }

    public AnonymousClass688 A0C(AbstractC00953pX abstractC00953pX) {
        String value;
        Integer num;
        if (!(this instanceof AnonymousClass247)) {
            return null;
        }
        JsonManagedReference jsonManagedReference = (JsonManagedReference) abstractC00953pX.A06(JsonManagedReference.class);
        if (jsonManagedReference != null) {
            value = jsonManagedReference.value();
            num = 0S2.A00;
        } else {
            JsonBackReference jsonBackReference = (JsonBackReference) abstractC00953pX.A06(JsonBackReference.class);
            if (jsonBackReference == null) {
                return null;
            }
            value = jsonBackReference.value();
            num = 0S2.A01;
        }
        return new AnonymousClass688(num, value);
    }

    public 24S A0D(24S r302, AnonymousClass253 anonymousClass253, C24r c24r) {
        Class as;
        Class contentAs;
        Object[] A03;
        String str;
        Class keyAs;
        if (this instanceof AnonymousClass247) {
            24R r0 = anonymousClass253._base._typeFactory;
            JsonDeserialize jsonDeserialize = (JsonDeserialize) c24r.A06(JsonDeserialize.class);
            if (jsonDeserialize == null) {
                as = null;
            } else {
                as = jsonDeserialize.as();
                if (as == null || 27C.A0J(as)) {
                    as = null;
                }
            }
            if (as != null && r302._class != as && !AnonymousClass247.A01(r302, as)) {
                try {
                    r302 = r0.A06(r302, as, false);
                } catch (IllegalArgumentException e) {
                    e = e;
                    A03 = A03(c24r, as, r302, e);
                    str = "Failed to narrow type %s with annotation (value %s), from '%s': %s";
                    throw new C2cb(null, String.format(str, A03), e);
                }
            }
            if (r302.A0R()) {
                24S A06 = r302.A06();
                if (jsonDeserialize != null && (keyAs = jsonDeserialize.keyAs()) != null && !27C.A0J(keyAs) && !AnonymousClass247.A01(A06, keyAs)) {
                    try {
                        r302 = ((C4E7) r302).A0V(r0.A06(A06, keyAs, false));
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        A03 = A03(c24r, keyAs, r302, e);
                        str = "Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s";
                        throw new C2cb(null, String.format(str, A03), e);
                    }
                }
            }
            24S A05 = r302.A05();
            if (A05 != null && jsonDeserialize != null && (contentAs = jsonDeserialize.contentAs()) != null && !27C.A0J(contentAs) && !AnonymousClass247.A01(A05, contentAs)) {
                try {
                    return r302.A0A(r0.A06(A05, contentAs, false));
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    A03 = A03(c24r, contentAs, r302, e);
                    str = "Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s";
                    throw new C2cb(null, String.format(str, A03), e);
                }
            }
        }
        return r302;
    }

    public 24S A0E(24S r302, AnonymousClass253 anonymousClass253, C24r c24r) {
        Class as;
        Class<?> contentAs;
        Object[] A03;
        String str;
        24S A08;
        Class<?> keyAs;
        24S A082;
        if (this instanceof AnonymousClass247) {
            24R r0 = anonymousClass253._base._typeFactory;
            JsonSerialize jsonSerialize = (JsonSerialize) c24r.A06(JsonSerialize.class);
            if (jsonSerialize == null) {
                as = null;
            } else {
                as = jsonSerialize.as();
                if (as == null || 27C.A0J(as)) {
                    as = null;
                }
            }
            if (as != null) {
                Class cls = r302._class;
                if (cls == as) {
                    r302 = r302.A08();
                } else {
                    try {
                        if (as.isAssignableFrom(cls)) {
                            r302 = 24R.A01(r302, as);
                        } else if (cls.isAssignableFrom(as)) {
                            r302 = r0.A06(r302, as, false);
                        } else {
                            if (!AnonymousClass247.A02(cls, as)) {
                                throw new C2cb(null, String.format("Cannot refine serialization type %s into %s; types not related", r302, as.getName()));
                            }
                            r302 = r302.A08();
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        A03 = A03(c24r, as, r302, e);
                        str = "Failed to widen type %s with annotation (value %s), from '%s': %s";
                        throw new C2cb(null, String.format(str, A03), e);
                    }
                }
            }
            if (r302.A0R()) {
                24S A06 = r302.A06();
                if (jsonSerialize != null && (keyAs = jsonSerialize.keyAs()) != null && !27C.A0J(keyAs)) {
                    Class cls2 = A06._class;
                    if (cls2 == keyAs) {
                        A082 = A06.A08();
                    } else {
                        try {
                            if (keyAs.isAssignableFrom(cls2)) {
                                A082 = 24R.A01(A06, keyAs);
                            } else if (cls2.isAssignableFrom(keyAs)) {
                                A082 = r0.A06(A06, keyAs, false);
                            } else {
                                if (!AnonymousClass247.A02(cls2, keyAs)) {
                                    throw new C2cb(null, String.format("Cannot refine serialization key type %s into %s; types not related", A06, keyAs.getName()));
                                }
                                A082 = A06.A08();
                            }
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            A03 = A03(c24r, keyAs, r302, e);
                            str = "Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s";
                            throw new C2cb(null, String.format(str, A03), e);
                        }
                    }
                    r302 = ((C4E7) r302).A0V(A082);
                }
            }
            24S A05 = r302.A05();
            if (A05 != null && jsonSerialize != null && (contentAs = jsonSerialize.contentAs()) != null && !27C.A0J(contentAs)) {
                Class cls3 = A05._class;
                if (cls3 == contentAs) {
                    A08 = A05.A08();
                } else {
                    try {
                        if (contentAs.isAssignableFrom(cls3)) {
                            A08 = 24R.A01(A05, contentAs);
                        } else if (cls3.isAssignableFrom(contentAs)) {
                            A08 = r0.A06(A05, contentAs, false);
                        } else {
                            if (!AnonymousClass247.A02(cls3, contentAs)) {
                                throw new C2cb(null, String.format("Cannot refine serialization content type %s into %s; types not related", A05, contentAs.getName()));
                            }
                            A08 = A05.A08();
                        }
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        A03 = A03(c24r, contentAs, r302, e);
                        str = "Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s";
                        throw new C2cb(null, String.format(str, A03), e);
                    }
                }
                r302 = r302.A0A(A08);
            }
        }
        return r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.26G] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.26G] */
    public C26G A0F(C24r c24r) {
        boolean z;
        if (!(this instanceof AnonymousClass247)) {
            return null;
        }
        JsonSetter jsonSetter = (JsonSetter) c24r.A06(JsonSetter.class);
        if (jsonSetter != null) {
            String value = jsonSetter.value();
            if (!value.isEmpty()) {
                return C26G.A00(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) c24r.A06(JsonProperty.class);
        String str = null;
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            str = C26G.A01(jsonProperty.value(), str);
        } else if (z || c24r.A08(AnonymousClass247.A01)) {
            return C26G.A01;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.26G] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.26G] */
    public C26G A0G(C24r c24r) {
        boolean z;
        String str;
        if (!(this instanceof AnonymousClass247)) {
            return null;
        }
        JsonGetter jsonGetter = (JsonGetter) c24r.A06(JsonGetter.class);
        if (jsonGetter != null) {
            String value = jsonGetter.value();
            if (!value.isEmpty()) {
                str = C26G.A00(value);
                return str;
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) c24r.A06(JsonProperty.class);
        str = null;
        if (jsonProperty == null) {
            if (z || c24r.A08(AnonymousClass247.A02)) {
                return C26G.A01;
            }
            return str;
        }
        String namespace = jsonProperty.namespace();
        if (namespace == null || !namespace.isEmpty()) {
            str = namespace;
        }
        return C26G.A01(jsonProperty.value(), str);
    }

    public 3Db A0H(C24r c24r) {
        JsonSerialize jsonSerialize;
        if (!(this instanceof AnonymousClass247) || (jsonSerialize = (JsonSerialize) c24r.A06(JsonSerialize.class)) == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    public C68D A0I(C68D c68d, C68D c68d2) {
        if (!(this instanceof AnonymousClass247)) {
            return null;
        }
        Class A0J = c68d.A0J(0);
        Class A0J2 = c68d2.A0J(0);
        if (A0J.isPrimitive()) {
            if (A0J2.isPrimitive()) {
                return null;
            }
            return c68d;
        }
        if (A0J2.isPrimitive()) {
            return c68d2;
        }
        if (A0J == String.class) {
            if (A0J2 != String.class) {
                return c68d;
            }
            return null;
        }
        if (A0J2 == String.class) {
            return c68d2;
        }
        return null;
    }

    public 7Rm A0J(C24r c24r) {
        JsonIdentityInfo jsonIdentityInfo;
        if (!(this instanceof AnonymousClass247) || (jsonIdentityInfo = (JsonIdentityInfo) c24r.A06(JsonIdentityInfo.class)) == null || jsonIdentityInfo.generator() == 3AU.class) {
            return null;
        }
        C26G A00 = C26G.A00(jsonIdentityInfo.property());
        7Rm r0 = 7Rm.A05;
        return new 7Rm(A00, jsonIdentityInfo.scope(), jsonIdentityInfo.generator(), jsonIdentityInfo.resolver(), false);
    }

    public 7Rm A0K(C24r c24r, 7Rm r303) {
        7Rm r304 = r303;
        if (!(this instanceof AnonymousClass247)) {
            return r303;
        }
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) c24r.A06(JsonIdentityReference.class);
        if (jsonIdentityReference != null) {
            if (r303 == null) {
                r304 = 7Rm.A05;
            }
            boolean alwaysAsId = jsonIdentityReference.alwaysAsId();
            if (r304.A04 != alwaysAsId) {
                r304 = new 7Rm(r304.A00, r304.A03, r304.A01, r304.A02, alwaysAsId);
            }
        }
        return r304;
    }

    public InterfaceC00923pT A0L(AnonymousClass253 anonymousClass253, C24q c24q) {
        if (this instanceof AnonymousClass247) {
            return AnonymousClass247.A00(anonymousClass253, c24q);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r0.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.L1J A0M(X.AbstractC00953pX r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.AnonymousClass247
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La7
            java.lang.Class<com.fasterxml.jackson.annotation.JsonUnwrapped> r0 = com.fasterxml.jackson.annotation.JsonUnwrapped.class
            r304 = r0
            r0 = r302
            r1 = r304
            java.lang.annotation.Annotation r0 = r0.A06(r1)
            com.fasterxml.jackson.annotation.JsonUnwrapped r0 = (com.fasterxml.jackson.annotation.JsonUnwrapped) r0
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La7
            r0 = r305
            boolean r0 = r0.enabled()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La7
            r0 = r305
            java.lang.String r0 = r0.prefix()
            r306 = r0
            r0 = r305
            java.lang.String r0 = r0.suffix()
            r307 = r0
            X.L1J r0 = X.L1J.A00
            r304 = r0
            r0 = 1
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L53
            r0 = r306
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = 1
            r309 = r0
            r0 = r303
            if (r0 == 0) goto L59
        L53:
            r0 = 0
            r309 = r0
            r0 = 0
            r305 = r0
        L59:
            r0 = r307
            if (r0 == 0) goto L80
            r0 = r307
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L80
        L68:
            r0 = r309
            if (r0 == 0) goto L92
            r0 = r308
            if (r0 == 0) goto L86
            X.3C1 r0 = new X.3C1
            r304 = r0
            r0 = r304
            r1 = r306
            r2 = r307
            r0.<init>(r1, r2)
            r0 = r304
            return r0
        L80:
            r0 = 0
            r308 = r0
            goto L68
        L86:
            X.3Bz r0 = new X.3Bz
            r304 = r0
            r0 = r304
            r1 = r306
            r0.<init>(r1)
            r0 = r304
            return r0
        L92:
            r0 = r308
            if (r0 == 0) goto La3
            X.3C0 r0 = new X.3C0
            r304 = r0
            r0 = r304
            r1 = r307
            r0.<init>(r1)
            r0 = r304
            return r0
        La3:
            X.L1J r0 = X.L1J.A00
            return r0
        La7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass248.A0M(X.3pX):X.L1J");
    }

    public Boolean A0N(C24r c24r) {
        JsonMerge jsonMerge;
        3Da value;
        if (!(this instanceof AnonymousClass247) || (jsonMerge = (JsonMerge) c24r.A06(JsonMerge.class)) == null || (value = jsonMerge.value()) == 3Da.A00) {
            return null;
        }
        return value == 3Da.A01 ? Boolean.TRUE : Boolean.FALSE;
    }

    public Boolean A0O(C24r c24r) {
        JsonPropertyOrder jsonPropertyOrder;
        if ((this instanceof AnonymousClass247) && (jsonPropertyOrder = (JsonPropertyOrder) c24r.A06(JsonPropertyOrder.class)) != null && jsonPropertyOrder.alphabetic()) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Boolean A0P(C24r c24r) {
        JsonAnyGetter jsonAnyGetter;
        if (!(this instanceof AnonymousClass247) || (jsonAnyGetter = (JsonAnyGetter) c24r.A06(JsonAnyGetter.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnyGetter.enabled());
    }

    public Boolean A0Q(C24r c24r) {
        JsonAnySetter jsonAnySetter;
        if (!(this instanceof AnonymousClass247) || (jsonAnySetter = (JsonAnySetter) c24r.A06(JsonAnySetter.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnySetter.enabled());
    }

    public Boolean A0R(C24r c24r) {
        JsonKey jsonKey;
        if (!(this instanceof AnonymousClass247) || (jsonKey = (JsonKey) c24r.A06(JsonKey.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonKey.value());
    }

    public Boolean A0S(C24r c24r) {
        JsonValue jsonValue;
        if (!(this instanceof AnonymousClass247) || (jsonValue = (JsonValue) c24r.A06(JsonValue.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonValue.value());
    }

    public Boolean A0T(AbstractC00953pX abstractC00953pX) {
        JsonProperty jsonProperty;
        if (!(this instanceof AnonymousClass247) || (jsonProperty = (JsonProperty) abstractC00953pX.A06(JsonProperty.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonProperty.required());
    }

    public Boolean A0U(AbstractC00953pX abstractC00953pX) {
        if (this instanceof AnonymousClass247) {
            return Boolean.valueOf(abstractC00953pX.A0F());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Enum A0V(java.lang.Class r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.AnonymousClass247
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L90
            java.lang.Class<com.fasterxml.jackson.annotation.JsonEnumDefaultValue> r0 = com.fasterxml.jackson.annotation.JsonEnumDefaultValue.class
            r304 = r0
            X.27F[] r0 = X.27C.A01
            r305 = r0
            r0 = r302
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r306 = r0
            r0 = r306
            int r0 = r0.length
            r307 = r0
            r0 = 0
            r308 = r0
        L20:
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto L90
            r0 = r306
            r1 = r308
            r0 = r0[r1]
            r309 = r0
            r0 = r309
            boolean r0 = r0.isEnumConstant()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L87
            r0 = r309
            r1 = r304
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L87
            r0 = r309
            java.lang.String r0 = r0.getName()
            r310 = r0
            r0 = r302
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            r311 = r0
            r0 = r311
            int r0 = r0.length
            r312 = r0
            r0 = 0
            r313 = r0
        L5d:
            r0 = r313
            r1 = r312
            if (r0 >= r1) goto L87
            r0 = r311
            r1 = r313
            r0 = r0[r1]
            r309 = r0
            r0 = r309
            java.lang.String r0 = r0.name()
            r305 = r0
            r0 = r310
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L93
            r0 = r313
            r1 = 1
            int r0 = r0 + r1
            r313 = r0
            goto L5d
        L87:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L20
        L90:
            r0 = 0
            r309 = r0
        L93:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass248.A0V(java.lang.Class):java.lang.Enum");
    }

    public Integer A0W(C24r c24r) {
        JsonProperty jsonProperty;
        int index;
        if (!(this instanceof AnonymousClass247) || (jsonProperty = (JsonProperty) c24r.A06(JsonProperty.class)) == null || (index = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(index);
    }

    public Object A0X(C24r c24r) {
        JsonDeserialize jsonDeserialize;
        Class contentUsing;
        if (!(this instanceof AnonymousClass247) || (jsonDeserialize = (JsonDeserialize) c24r.A06(JsonDeserialize.class)) == null || (contentUsing = jsonDeserialize.contentUsing()) == JsonDeserializer.None.class) {
            return null;
        }
        return contentUsing;
    }

    public Object A0Y(C24r c24r) {
        JsonSerialize jsonSerialize;
        Class contentUsing;
        if (!(this instanceof AnonymousClass247) || (jsonSerialize = (JsonSerialize) c24r.A06(JsonSerialize.class)) == null || (contentUsing = jsonSerialize.contentUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return contentUsing;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r304 != X.3dD.class) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0Z(X.C24r r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.AnonymousClass247
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L39
            r0 = r302
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonDeserialize> r1 = com.fasterxml.jackson.databind.annotation.JsonDeserialize.class
            java.lang.annotation.Annotation r0 = r0.A06(r1)
            com.fasterxml.jackson.databind.annotation.JsonDeserialize r0 = (com.fasterxml.jackson.databind.annotation.JsonDeserialize) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r304
            java.lang.Class r0 = r0.converter()
            r304 = r0
            java.lang.Class<X.3dD> r0 = X.3dD.class
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r304
            boolean r0 = X.27C.A0J(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L39
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L3d
        L39:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L3d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass248.A0Z(X.24r):java.lang.Object");
    }

    public Object A0a(C24r c24r) {
        JsonDeserialize jsonDeserialize;
        Class using;
        if (!(this instanceof AnonymousClass247) || (jsonDeserialize = (JsonDeserialize) c24r.A06(JsonDeserialize.class)) == null || (using = jsonDeserialize.using()) == JsonDeserializer.None.class) {
            return null;
        }
        return using;
    }

    public Object A0b(C24r c24r) {
        JsonFilter jsonFilter;
        if (!(this instanceof AnonymousClass247) || (jsonFilter = (JsonFilter) c24r.A06(JsonFilter.class)) == null) {
            return null;
        }
        String value = jsonFilter.value();
        if (value.isEmpty()) {
            return null;
        }
        return value;
    }

    public Object A0c(C24r c24r) {
        JsonDeserialize jsonDeserialize;
        Class keyUsing;
        if (!(this instanceof AnonymousClass247) || (jsonDeserialize = (JsonDeserialize) c24r.A06(JsonDeserialize.class)) == null || (keyUsing = jsonDeserialize.keyUsing()) == 3As.class) {
            return null;
        }
        return keyUsing;
    }

    public Object A0d(C24r c24r) {
        JsonSerialize jsonSerialize;
        Class keyUsing;
        if (!(this instanceof AnonymousClass247) || (jsonSerialize = (JsonSerialize) c24r.A06(JsonSerialize.class)) == null || (keyUsing = jsonSerialize.keyUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return keyUsing;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r304 != X.3dD.class) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.C24r r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.AnonymousClass247
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L38
            r0 = r302
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonSerialize> r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.class
            java.lang.annotation.Annotation r0 = r0.A06(r1)
            com.fasterxml.jackson.databind.annotation.JsonSerialize r0 = (com.fasterxml.jackson.databind.annotation.JsonSerialize) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L38
            r0 = r304
            java.lang.Class r0 = r0.converter()
            r304 = r0
            java.lang.Class<X.3dD> r0 = X.3dD.class
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L38
            r0 = r304
            boolean r0 = X.27C.A0J(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L38
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L3c
        L38:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L3c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass248.A0e(X.24r):java.lang.Object");
    }

    public Object A0f(C24q c24q) {
        JsonNaming jsonNaming;
        if (!(this instanceof AnonymousClass247) || (jsonNaming = (JsonNaming) c24q.A06(JsonNaming.class)) == null) {
            return null;
        }
        return jsonNaming.value();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r304 != X.3dD.class) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0g(X.AbstractC00953pX r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.AnonymousClass247
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L39
            r0 = r302
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonDeserialize> r1 = com.fasterxml.jackson.databind.annotation.JsonDeserialize.class
            java.lang.annotation.Annotation r0 = r0.A06(r1)
            com.fasterxml.jackson.databind.annotation.JsonDeserialize r0 = (com.fasterxml.jackson.databind.annotation.JsonDeserialize) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r304
            java.lang.Class r0 = r0.contentConverter()
            r304 = r0
            java.lang.Class<X.3dD> r0 = X.3dD.class
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r304
            boolean r0 = X.27C.A0J(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L39
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L3d
        L39:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L3d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass248.A0g(X.3pX):java.lang.Object");
    }

    public String A0h(C24r c24r) {
        JsonProperty jsonProperty;
        if (!(this instanceof AnonymousClass247) || (jsonProperty = (JsonProperty) c24r.A06(JsonProperty.class)) == null) {
            return null;
        }
        String defaultValue = jsonProperty.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    public String A0i(C24r c24r) {
        JsonPropertyDescription jsonPropertyDescription;
        if (!(this instanceof AnonymousClass247) || (jsonPropertyDescription = (JsonPropertyDescription) c24r.A06(JsonPropertyDescription.class)) == null) {
            return null;
        }
        return jsonPropertyDescription.value();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    public List A0j(C24r c24r) {
        JsonAlias jsonAlias;
        ArrayList A0t;
        if (!(this instanceof AnonymousClass247) || (jsonAlias = (JsonAlias) c24r.A06(JsonAlias.class)) == null) {
            return null;
        }
        String[] value = jsonAlias.value();
        int length = value.length;
        if (length == 0) {
            A0t = Collections.emptyList();
        } else {
            A0t = AnonymousClass001.A0t(length);
            int i = 0;
            do {
                A0t.add(C26G.A00(value[i]));
                i++;
            } while (i < length);
        }
        return A0t;
    }

    public List A0k(C24r c24r) {
        ArrayList arrayList;
        JsonSubTypes jsonSubTypes;
        if ((this instanceof AnonymousClass247) && (jsonSubTypes = (JsonSubTypes) c24r.A06(JsonSubTypes.class)) != null) {
            JsonSubTypes.Type[] value = jsonSubTypes.value();
            int length = value.length;
            arrayList = AnonymousClass001.A0t(length);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                JsonSubTypes.Type type = value[i2];
                arrayList.add(new 3eR(type.value(), type.name()));
                String[] names = type.names();
                int length2 = names.length;
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < length2) {
                        arrayList.add(new 3eR(type.value(), names[i4]));
                        i3 = i4 + 1;
                    }
                }
                i = i2 + 1;
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    public void A0l(Class cls, Enum[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        if (this instanceof AnonymousClass247) {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            HashMap hashMap = null;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Field field = declaredFields[i2];
                if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                    String value = jsonProperty.value();
                    if (!value.isEmpty()) {
                        if (hashMap == null) {
                            hashMap = AnonymousClass001.A0u();
                        }
                        hashMap.put(field.getName(), value);
                    }
                }
                i = i2 + 1;
            }
            if (hashMap != null) {
                int length2 = enumArr.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    Object obj = hashMap.get(enumArr[i3].name());
                    if (obj != null) {
                        strArr[i3] = obj;
                    }
                }
            }
        }
    }

    public void A0m(Class cls, Enum[] enumArr, String[][] strArr) {
        JsonAlias jsonAlias;
        if (!(this instanceof AnonymousClass247)) {
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Field field = declaredFields[i2];
            if (field.isEnumConstant() && (jsonAlias = (JsonAlias) field.getAnnotation(JsonAlias.class)) != null) {
                String[] value = jsonAlias.value();
                if (value.length != 0) {
                    String name = field.getName();
                    int length2 = enumArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (name.equals(enumArr[i3].name())) {
                            strArr[i3] = value;
                        }
                    }
                }
            }
            i = i2 + 1;
        }
    }

    public boolean A0n(AbstractC00953pX abstractC00953pX) {
        JsonIgnore jsonIgnore;
        if (!(this instanceof AnonymousClass247) || (jsonIgnore = (JsonIgnore) abstractC00953pX.A06(JsonIgnore.class)) == null) {
            return false;
        }
        return jsonIgnore.value();
    }

    public boolean A0o(Annotation annotation) {
        if (!(this instanceof AnonymousClass247)) {
            return false;
        }
        AnonymousClass247 anonymousClass247 = (AnonymousClass247) this;
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Boolean bool = (Boolean) anonymousClass247.A00.A01.get(annotationType);
        if (bool == null) {
            boolean z = false;
            if (annotationType.getAnnotation(JacksonAnnotationsInside.class) != null) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            anonymousClass247.A00.putIfAbsent(annotationType, bool);
        }
        return bool.booleanValue();
    }

    public Class[] A0p(C24r c24r) {
        JsonView jsonView;
        if (!(this instanceof AnonymousClass247) || (jsonView = (JsonView) c24r.A06(JsonView.class)) == null) {
            return null;
        }
        return jsonView.value();
    }

    public String[] A0q(C24q c24q) {
        JsonPropertyOrder jsonPropertyOrder;
        if (!(this instanceof AnonymousClass247) || (jsonPropertyOrder = (JsonPropertyOrder) c24q.A06(JsonPropertyOrder.class)) == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }
}
