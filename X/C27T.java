package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.27T, reason: invalid class name */
/* loaded from: 27T.class */
public abstract class C27T extends C26d implements Serializable {
    public static final long serialVersionUID = 1;
    public transient AbstractC01033pi A00;
    public transient DateFormat A01;
    public transient C26K A02;
    public transient C28h A03;
    public transient L8v A04;
    public final 27W _cache;
    public final C26L _config;
    public C00993pc _currentType;
    public final AnonymousClass278 _factory;
    public final int _featureFlags;
    public final AbstractC01023pf _injectableValues;
    public final C27Z _readCapabilities;
    public final Class _view;

    public C27T(C26L c26l, C27T c27t) {
        this._cache = c27t._cache;
        this._factory = c27t._factory;
        this._readCapabilities = null;
        this._config = c26l;
        this._featureFlags = c26l._deserFeatures;
        this._view = null;
        this.A00 = null;
        this._injectableValues = null;
        this.A02 = null;
    }

    public C27T(AnonymousClass278 anonymousClass278) {
        this._factory = anonymousClass278;
        this._cache = new 27W();
        this._featureFlags = 0;
        this._readCapabilities = null;
        this._config = null;
        this._injectableValues = null;
        this._view = null;
        this.A02 = null;
    }

    public C27T(C27T c27t, AnonymousClass278 anonymousClass278) {
        this._cache = c27t._cache;
        this._factory = anonymousClass278;
        this._config = c27t._config;
        this._featureFlags = c27t._featureFlags;
        this._readCapabilities = c27t._readCapabilities;
        this._view = c27t._view;
        this.A00 = c27t.A00;
        this._injectableValues = null;
        this.A02 = c27t.A02;
    }

    public C27T(AbstractC01033pi abstractC01033pi, C26L c26l, C27T c27t) {
        this._cache = c27t._cache;
        this._factory = c27t._factory;
        this._readCapabilities = abstractC01033pi.A1O();
        this._config = c26l;
        this._featureFlags = c26l._deserFeatures;
        this._view = c26l._view;
        this.A00 = abstractC01033pi;
        this._injectableValues = null;
        this.A02 = c26l._attributes;
    }

    public final 24S A0F(Class cls) {
        if (cls == null) {
            return null;
        }
        return this._config._base._typeFactory.A09(cls);
    }

    public final JsonDeserializer A0G(68U r302, 24S r303) {
        JsonDeserializer A02 = this._cache.A02(this, r303, this._factory);
        if (A02 != null) {
            A02 = A0I(r302, r303, A02);
        }
        return A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonDeserializer A0H(68U r302, 24S r303, JsonDeserializer jsonDeserializer) {
        boolean z = jsonDeserializer instanceof AnonymousClass437;
        JsonDeserializer jsonDeserializer2 = jsonDeserializer;
        if (z) {
            this._currentType = new C00993pc(this._currentType, r303);
            try {
                jsonDeserializer2 = ((AnonymousClass437) jsonDeserializer).AJM(r302, this);
            } finally {
                this._currentType = this._currentType.A00;
            }
        }
        return jsonDeserializer2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonDeserializer A0I(68U r302, 24S r303, JsonDeserializer jsonDeserializer) {
        boolean z = jsonDeserializer instanceof AnonymousClass437;
        JsonDeserializer jsonDeserializer2 = jsonDeserializer;
        if (z) {
            this._currentType = new C00993pc(this._currentType, r303);
            try {
                jsonDeserializer2 = ((AnonymousClass437) jsonDeserializer).AJM(r302, this);
            } finally {
                this._currentType = this._currentType.A00;
            }
        }
        return jsonDeserializer2;
    }

    public final JsonDeserializer A0J(24S r302) {
        JsonDeserializer A02 = this._cache.A02(this, r302, this._factory);
        TypeWrappedDeserializer typeWrappedDeserializer = null;
        if (A02 != null) {
            JsonDeserializer A0I = A0I(null, r302, A02);
            Jyp A0G = this._factory.A0G(this._config, r302);
            if (A0G == null) {
                return A0I;
            }
            typeWrappedDeserializer = new TypeWrappedDeserializer(A0I, A0G.A04(null));
        }
        return typeWrappedDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v3 */
    public JsonDeserializer A0K(Object obj) {
        JsonDeserializer jsonDeserializer = null;
        JsonDeserializer jsonDeserializer2 = jsonDeserializer;
        if (obj != null) {
            if (!(obj instanceof JsonDeserializer)) {
                if (!(obj instanceof Class)) {
                    throw 0Pz.A07("AnnotationIntrospector returned deserializer definition of type ", AnonymousClass001.A0Y(obj), "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
                }
                Class cls = (Class) obj;
                jsonDeserializer2 = jsonDeserializer;
                if (cls != JsonDeserializer.None.class) {
                    jsonDeserializer2 = jsonDeserializer;
                    if (!27C.A0J(cls)) {
                        if (!JsonDeserializer.class.isAssignableFrom(cls)) {
                            throw 0Pz.A07("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<JsonDeserializer>");
                        }
                        obj = 1BK.A0q(this._config, cls);
                    }
                }
            }
            ?? r303 = (JsonDeserializer) obj;
            boolean z = r303 instanceof AnonymousClass436;
            jsonDeserializer2 = r303;
            if (z) {
                ((AnonymousClass436) r303).Cht(this);
                jsonDeserializer2 = r303;
            }
        }
        return jsonDeserializer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02b6, code lost:
    
        new X.3BL(r308, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04fa, code lost:
    
        if (r311 == null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ef, code lost:
    
        if (r309 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
    
        if (r309 != null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x067b: INVOKE (r0 I:java.lang.String) = (r0 I:java.lang.Throwable) STATIC call: X.27C.A09(java.lang.Throwable):java.lang.String A[Catch: IllegalArgumentException -> 0x067b, TRY_LEAVE], block:B:389:0x067b */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04e8 A[Catch: IllegalArgumentException -> 0x067b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x067b, blocks: (B:2:0x0000, B:3:0x0005, B:4:0x000a, B:5:0x000f, B:6:0x0015, B:7:0x001c, B:11:0x0027, B:12:0x002d, B:13:0x0033, B:14:0x003a, B:16:0x0041, B:18:0x0048, B:21:0x0052, B:22:0x0059, B:24:0x0064, B:28:0x0072, B:29:0x0078, B:30:0x007f, B:33:0x0089, B:34:0x0090, B:37:0x009c, B:39:0x00a6, B:41:0x00af, B:46:0x05d6, B:48:0x05df, B:54:0x00be, B:55:0x00c5, B:56:0x00cb, B:60:0x00d9, B:64:0x00e6, B:67:0x00f2, B:68:0x00f8, B:70:0x0104, B:73:0x0110, B:74:0x0115, B:75:0x011b, B:76:0x0121, B:77:0x0128, B:79:0x0133, B:80:0x0139, B:81:0x0140, B:82:0x0146, B:86:0x0154, B:90:0x0161, B:93:0x0170, B:94:0x0176, B:95:0x017d, B:96:0x0184, B:99:0x0190, B:100:0x0197, B:102:0x01a3, B:106:0x01b1, B:107:0x01b7, B:109:0x01c0, B:113:0x01c9, B:116:0x01d5, B:118:0x01df, B:119:0x01e6, B:120:0x01ed, B:121:0x01f6, B:124:0x0204, B:125:0x020d, B:126:0x0214, B:127:0x021a, B:132:0x0228, B:136:0x0234, B:140:0x0240, B:143:0x0251, B:144:0x0258, B:146:0x0261, B:150:0x0275, B:154:0x0287, B:157:0x0292, B:158:0x0297, B:160:0x029f, B:162:0x02a8, B:163:0x02ad, B:163:0x02ad, B:166:0x02b6, B:170:0x05eb, B:172:0x05f7, B:173:0x05ff, B:175:0x060e, B:177:0x061a, B:179:0x0623, B:187:0x02c5, B:188:0x02cb, B:189:0x02d2, B:190:0x02d9, B:191:0x02e0, B:194:0x02ee, B:195:0x02f3, B:196:0x02fc, B:199:0x030a, B:200:0x0313, B:201:0x031a, B:202:0x0321, B:203:0x0328, B:208:0x0346, B:214:0x03c2, B:215:0x03c9, B:216:0x03d0, B:220:0x03e1, B:221:0x03ea, B:224:0x03f8, B:225:0x0401, B:226:0x0408, B:227:0x040f, B:228:0x0416, B:229:0x041d, B:231:0x0426, B:235:0x0432, B:237:0x043b, B:283:0x0447, B:250:0x0481, B:252:0x048a, B:255:0x04e8, B:257:0x04ef, B:241:0x0456, B:243:0x0464, B:246:0x0473, B:261:0x0499, B:265:0x04a5, B:270:0x04bb, B:274:0x04d4, B:293:0x0505, B:295:0x050c, B:296:0x0513, B:298:0x051d, B:300:0x052a, B:303:0x0538, B:304:0x0541, B:305:0x0548, B:311:0x0559, B:312:0x0560, B:317:0x0626, B:318:0x062b, B:319:0x0632, B:320:0x0639, B:322:0x0645, B:324:0x064e, B:326:0x0657, B:333:0x0577, B:336:0x0585, B:337:0x058c, B:338:0x0658, B:338:0x0658, B:341:0x0665, B:343:0x066e, B:344:0x0673, B:344:0x0673, B:347:0x067a, B:348:0x05a2, B:349:0x05a9, B:351:0x05b1, B:353:0x05bc, B:354:0x04fd, B:355:0x0596, B:363:0x0356, B:364:0x035b, B:365:0x0364, B:368:0x0372, B:369:0x037b, B:370:0x0382, B:372:0x038b, B:373:0x0392, B:377:0x039e, B:379:0x03a7, B:380:0x03ae, B:386:0x00b1, B:388:0x00b7), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[Catch: IllegalArgumentException -> 0x067b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x067b, blocks: (B:2:0x0000, B:3:0x0005, B:4:0x000a, B:5:0x000f, B:6:0x0015, B:7:0x001c, B:11:0x0027, B:12:0x002d, B:13:0x0033, B:14:0x003a, B:16:0x0041, B:18:0x0048, B:21:0x0052, B:22:0x0059, B:24:0x0064, B:28:0x0072, B:29:0x0078, B:30:0x007f, B:33:0x0089, B:34:0x0090, B:37:0x009c, B:39:0x00a6, B:41:0x00af, B:46:0x05d6, B:48:0x05df, B:54:0x00be, B:55:0x00c5, B:56:0x00cb, B:60:0x00d9, B:64:0x00e6, B:67:0x00f2, B:68:0x00f8, B:70:0x0104, B:73:0x0110, B:74:0x0115, B:75:0x011b, B:76:0x0121, B:77:0x0128, B:79:0x0133, B:80:0x0139, B:81:0x0140, B:82:0x0146, B:86:0x0154, B:90:0x0161, B:93:0x0170, B:94:0x0176, B:95:0x017d, B:96:0x0184, B:99:0x0190, B:100:0x0197, B:102:0x01a3, B:106:0x01b1, B:107:0x01b7, B:109:0x01c0, B:113:0x01c9, B:116:0x01d5, B:118:0x01df, B:119:0x01e6, B:120:0x01ed, B:121:0x01f6, B:124:0x0204, B:125:0x020d, B:126:0x0214, B:127:0x021a, B:132:0x0228, B:136:0x0234, B:140:0x0240, B:143:0x0251, B:144:0x0258, B:146:0x0261, B:150:0x0275, B:154:0x0287, B:157:0x0292, B:158:0x0297, B:160:0x029f, B:162:0x02a8, B:163:0x02ad, B:163:0x02ad, B:166:0x02b6, B:170:0x05eb, B:172:0x05f7, B:173:0x05ff, B:175:0x060e, B:177:0x061a, B:179:0x0623, B:187:0x02c5, B:188:0x02cb, B:189:0x02d2, B:190:0x02d9, B:191:0x02e0, B:194:0x02ee, B:195:0x02f3, B:196:0x02fc, B:199:0x030a, B:200:0x0313, B:201:0x031a, B:202:0x0321, B:203:0x0328, B:208:0x0346, B:214:0x03c2, B:215:0x03c9, B:216:0x03d0, B:220:0x03e1, B:221:0x03ea, B:224:0x03f8, B:225:0x0401, B:226:0x0408, B:227:0x040f, B:228:0x0416, B:229:0x041d, B:231:0x0426, B:235:0x0432, B:237:0x043b, B:283:0x0447, B:250:0x0481, B:252:0x048a, B:255:0x04e8, B:257:0x04ef, B:241:0x0456, B:243:0x0464, B:246:0x0473, B:261:0x0499, B:265:0x04a5, B:270:0x04bb, B:274:0x04d4, B:293:0x0505, B:295:0x050c, B:296:0x0513, B:298:0x051d, B:300:0x052a, B:303:0x0538, B:304:0x0541, B:305:0x0548, B:311:0x0559, B:312:0x0560, B:317:0x0626, B:318:0x062b, B:319:0x0632, B:320:0x0639, B:322:0x0645, B:324:0x064e, B:326:0x0657, B:333:0x0577, B:336:0x0585, B:337:0x058c, B:338:0x0658, B:338:0x0658, B:341:0x0665, B:343:0x066e, B:344:0x0673, B:344:0x0673, B:347:0x067a, B:348:0x05a2, B:349:0x05a9, B:351:0x05b1, B:353:0x05bc, B:354:0x04fd, B:355:0x0596, B:363:0x0356, B:364:0x035b, B:365:0x0364, B:368:0x0372, B:369:0x037b, B:370:0x0382, B:372:0x038b, B:373:0x0392, B:377:0x039e, B:379:0x03a7, B:380:0x03ae, B:386:0x00b1, B:388:0x00b7), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x05d2  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v156, types: [X.68D, X.24r, X.3pW] */
    /* JADX WARN: Type inference failed for: r0v169, types: [X.248] */
    /* JADX WARN: Type inference failed for: r0v178, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v226, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v279, types: [X.248] */
    /* JADX WARN: Type inference failed for: r0v290, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r308v11, types: [X.68D, X.24r, X.3pW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.KnN A0L(X.24S r302) {
        /*
            Method dump skipped, instructions count: 1675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27T.A0L(X.24S):X.KnN");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v3 */
    public KnN A0M(Object obj) {
        KnN knN = null;
        KnN knN2 = knN;
        if (obj != null) {
            if (!(obj instanceof KnN)) {
                if (!(obj instanceof Class)) {
                    throw 0Pz.A07("AnnotationIntrospector returned key deserializer definition of type ", AnonymousClass001.A0Y(obj), "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
                }
                Class cls = (Class) obj;
                knN2 = knN;
                if (cls != 3As.class) {
                    knN2 = knN;
                    if (!27C.A0J(cls)) {
                        if (!KnN.class.isAssignableFrom(cls)) {
                            throw 0Pz.A07("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<KeyDeserializer>");
                        }
                        obj = 1BK.A0q(this._config, cls);
                    }
                }
            }
            ?? r303 = (KnN) obj;
            boolean z = r303 instanceof AnonymousClass436;
            knN2 = r303;
            if (z) {
                ((AnonymousClass436) r303).Cht(this);
                knN2 = r303;
            }
        }
        return knN2;
    }

    public C25m A0N(C25m c25m, C42x c42x, Class cls) {
        C25m c25m2;
        C25n c25n;
        C25o c25o;
        C26L c26l = this._config;
        C25l c25l = c26l._coercionConfigs;
        java.util.Map map = c25l._perClassCoercions;
        Boolean bool = null;
        if (map == null || cls == null || (c25o = (C25o) map.get(cls)) == null) {
            c25m2 = null;
        } else {
            bool = c25o._acceptBlankAsEmpty;
            c25m2 = c25o._coercionsByShape[9];
        }
        C25n[] c25nArr = c25l._perTypeCoercions;
        if (c25nArr != null && c42x != null && (c25n = c25nArr[c42x.ordinal()]) != null) {
            if (bool == null) {
                bool = c25n._acceptBlankAsEmpty;
            }
            if (c25m2 == null) {
                c25m2 = c25n._coercionsByShape[9];
            }
        }
        if (bool == null) {
            bool = c25l._defaultCoercions._acceptBlankAsEmpty;
        }
        if (c25m2 == null) {
            c25m2 = c25l._defaultCoercions._coercionsByShape[9];
        }
        if (!Boolean.FALSE.equals(bool)) {
            if (c25m2 == null) {
                if (c42x == C42x.Float || c42x == C42x.Integer || c42x == C42x.Boolean || c42x == C42x.DateTime || c26l.A0F(C26O.A02)) {
                    c25m2 = C25m.AsNull;
                }
            }
            return c25m2;
        }
        return c25m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        if (r0.A0F(X.C26O.A0C) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        return X.C25m.Fail;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0137, code lost:
    
        if (r302 != X.C42x.DateTime) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015b, code lost:
    
        if (r304 != X.0S2.A1J) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0160, code lost:
    
        if (r310 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0173, code lost:
    
        if (r0.A0F(X.C26O.A02) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017e, code lost:
    
        if (r302 != X.C42x.OtherScalar) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
    
        return X.C25m.TryConvert;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x019a, code lost:
    
        return X.C25m.AsNull;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a0, code lost:
    
        return r0._defaultAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
    
        if (r0.A09(X.AnonymousClass260.A04) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r0.A0F(X.C26O.A03) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0194, code lost:
    
        if (r0.A0F(X.C26O.A01) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r307 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C25m A0O(X.C42x r302, java.lang.Class r303, java.lang.Integer r304) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27T.A0O(X.42x, java.lang.Class, java.lang.Integer):X.25m");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.MCW] */
    public KtU A0P(3eQ r302, MCW mcw, Object obj) {
        C27S c27s = (C27S) this;
        KtU ktU = null;
        if (obj != null) {
            JxZ jxZ = (JxZ) r302;
            3eS r0 = new 3eS(jxZ.getClass(), jxZ._scope, obj);
            LinkedHashMap linkedHashMap = c27s.A00;
            if (linkedHashMap == null) {
                c27s.A00 = 1BK.A1C();
            } else {
                KtU ktU2 = (KtU) linkedHashMap.get(r0);
                if (ktU2 != null) {
                    return ktU2;
                }
            }
            List<Object> list = c27s._objectIdResolvers;
            if (list != null) {
                for (Object obj2 : list) {
                    if (mcw.getClass() == obj2.getClass()) {
                        break;
                    }
                }
            } else {
                c27s._objectIdResolvers = AnonymousClass001.A0t(8);
            }
            obj2 = new Object();
            c27s._objectIdResolvers.add(obj2);
            ktU = new KtU(r0);
            ktU.A00 = obj2;
            c27s.A00.put(r0, ktU);
        }
        return ktU;
    }

    public 3BP A0Q(Class cls, String str, String str2) {
        return new 3BP(this.A00, cls, str, String.format("Cannot deserialize value of type %s from String %s: %s", 27C.A06(cls), A0C(str), str2));
    }

    public 3Ae A0R(Class cls, Throwable th) {
        String A09;
        if (th == null) {
            A09 = "N/A";
        } else {
            A09 = 27C.A09(th);
            if (A09 == null) {
                A09 = 27C.A06(th.getClass());
            }
        }
        return new 3Ae(this.A00, A0F(cls), String.format("Cannot construct instance of %s, problem: %s", 27C.A06(cls), A09), th);
    }

    public final C28h A0S() {
        C28h c28h = this.A03;
        if (c28h == null) {
            c28h = new C28h();
            this.A03 = c28h;
        }
        return c28h;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.L8v] */
    public final L8v A0T() {
        L8v l8v = this.A04;
        if (l8v == null) {
            return new Object();
        }
        this.A04 = null;
        return l8v;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, java.util.Date] */
    public Date A0U(String str) {
        ?? parse;
        try {
            DateFormat dateFormat = this.A01;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this._config._base._dateFormat.clone();
                this.A01 = dateFormat;
            }
            parse = dateFormat.parse(str);
            return parse;
        } catch (ParseException unused) {
            throw 1BK.A0f("Failed to parse Date value '%s': %s", new Object[]{str, 27C.A09((Throwable) parse)});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        if (r303 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V(X.AbstractC01033pi r302, X.C42h r303, X.24S r304, java.lang.String r305, java.lang.Object... r306) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27T.A0V(X.3pi, X.42h, X.24S, java.lang.String, java.lang.Object[]):void");
    }

    public void A0W(AbstractC01033pi abstractC01033pi, 24S r303) {
        A0V(abstractC01033pi, abstractC01033pi.A1I(), r303, null, AnonymousClass001.A1Z());
        throw 0Q8.createAndThrow();
    }

    public void A0X(AbstractC01033pi abstractC01033pi, JsonDeserializer jsonDeserializer, Object obj, String str) {
        if (this._config._problemHandlers != null) {
            throw AnonymousClass001.A0Q("handleUnknownProperty");
        }
        if (!A0p(C26O.A0F)) {
            abstractC01033pi.A20();
            return;
        }
        Collection A0V = jsonDeserializer.A0V();
        AbstractC01033pi abstractC01033pi2 = this.A00;
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        4DO c68r = new C68r(abstractC01033pi2.A1C(), abstractC01033pi2, cls, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", str, cls.getName()), str, A0V);
        c68r.A08(obj, str);
        throw c68r;
    }

    public void A0Y(AbstractC01033pi abstractC01033pi, Class cls) {
        A0V(abstractC01033pi, abstractC01033pi.A1I(), A0F(cls), null, new Object[0]);
        throw 0Q8.createAndThrow();
    }

    public void A0Z(C42h c42h, 24S r303, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        AbstractC01033pi abstractC01033pi = this.A00;
        String format = String.format("Unexpected token (%s), expected %s", abstractC01033pi.A1I(), c42h);
        if (str != null) {
            format = 0Pz.A0j(format, ": ", str);
        }
        throw 4DO.A00(abstractC01033pi, r303, format);
    }

    public void A0a(C42h c42h, JsonDeserializer jsonDeserializer, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        AbstractC01033pi abstractC01033pi = this.A00;
        Class A0S = jsonDeserializer.A0S();
        String format = String.format("Unexpected token (%s), expected %s", abstractC01033pi.A1I(), c42h);
        if (str != null) {
            format = 0Pz.A0j(format, ": ", str);
        }
        2LD c2cb = new C2cb(abstractC01033pi, format);
        ((4DO) c2cb)._targetType = A0S;
        throw c2cb;
    }

    public void A0b(68U r302, String str, Object... objArr) {
        AbstractC00953pX AwU;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        4DO A00 = 4DO.A00(this.A00, r302 == null ? null : r302.BHb(), str);
        if (r302 != null && (AwU = r302.AwU()) != null) {
            A00.A08(AwU.A0A(), r302.getName());
        }
        throw A00;
    }

    public void A0c(24S r302, String str, String str2, Object... objArr) {
        Class cls = r302._class;
        4DO c2cb = new C2cb(this.A00, String.format(str2, objArr));
        c2cb._targetType = cls;
        if (str != null) {
            c2cb.A08(cls, str);
        }
        throw c2cb;
    }

    public void A0d(JsonDeserializer jsonDeserializer) {
        if (this._config.A09(AnonymousClass260.A0H)) {
            return;
        }
        24S A0F = A0F(jsonDeserializer.A0S());
        throw new 3Af(this.A00, A0F, String.format("Invalid configuration: values of type %s cannot be merged", 27C.A04(A0F)));
    }

    public void A0e(JsonDeserializer jsonDeserializer, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        AbstractC01033pi abstractC01033pi = this.A00;
        Class A0S = jsonDeserializer.A0S();
        2LD c2cb = new C2cb(abstractC01033pi, str);
        ((4DO) c2cb)._targetType = A0S;
        throw c2cb;
    }

    public void A0f(68W r302, Class cls, String str, Object... objArr) {
        Object[] objArr2;
        String str2;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this._config._problemHandlers != null) {
            throw AnonymousClass001.A0Q("handleMissingInstantiator");
        }
        if (r302 == null) {
            objArr2 = new Object[]{27C.A06(cls), str};
            str2 = "Cannot construct instance of %s: %s";
        } else {
            boolean A0S = r302.A0S();
            objArr2 = new Object[]{27C.A06(cls), str};
            if (A0S) {
                2LD c2cb = new C2cb(this.A00, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", objArr2));
                ((4DO) c2cb)._targetType = cls;
                throw c2cb;
            }
            str2 = "Cannot construct instance of %s (no Creators, like default constructor, exist): %s";
        }
        A0E(String.format(str2, objArr2), cls);
        throw 0Q8.createAndThrow();
    }

    public void A0g(AnonymousClass251 anonymousClass251, AnonymousClass687 anonymousClass687, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        C27F[] c27fArr = 27C.A01;
        throw new 3Af(this.A00, anonymousClass251, anonymousClass687, String.format("Invalid definition for property %s (of type %s): %s", 27C.A08(anonymousClass687.A0M()), 27C.A06(anonymousClass251.A05._class), str));
    }

    public void A0h(AnonymousClass251 anonymousClass251, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new 3Af(this.A00, anonymousClass251, (AnonymousClass687) null, String.format("Invalid type definition for type %s: %s", 27C.A06(anonymousClass251.A05._class), str));
    }

    public final void A0i(L8v l8v) {
        L8v l8v2 = this.A04;
        if (l8v2 != null) {
            Object[] objArr = l8v.A01;
            int length = objArr == null ? 0 : objArr.length;
            Object[] objArr2 = l8v2.A01;
            if (objArr2 != null) {
                if (length < objArr2.length) {
                    return;
                }
            }
        }
        this.A04 = l8v;
    }

    public void A0j(Class cls, Number number, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this._config._problemHandlers == null) {
            throw new 3BP(this.A00, cls, number, String.format("Cannot deserialize value of type %s from number %s: %s", 27C.A06(cls), String.valueOf(number), str));
        }
        throw AnonymousClass001.A0Q("handleWeirdNumberValue");
    }

    public void A0k(Class cls, String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (this._config._problemHandlers == null) {
            throw new 3BP(this.A00, cls, str, String.format("Cannot deserialize Map key of type %s from String %s: %s", 27C.A06(cls), A0C(str), str2));
        }
        throw AnonymousClass001.A0Q("handleWeirdKey");
    }

    public void A0l(Class cls, String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (this._config._problemHandlers == null) {
            throw A0Q(cls, str, str2);
        }
        throw AnonymousClass001.A0Q("handleWeirdStringValue");
    }

    public void A0m(Class cls, Throwable th) {
        if (this._config._problemHandlers != null) {
            throw AnonymousClass001.A0Q("handleInstantiationProblem");
        }
        C27F[] c27fArr = 27C.A01;
        if (th instanceof IOException) {
            throw th;
        }
        if (!A0p(C26O.A0Q)) {
            27C.A0H(th);
        }
        throw A0R(cls, th);
    }

    public final void A0n(Object obj) {
        C27F[] c27fArr = 27C.A01;
        A0E(String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj), obj == null ? null : obj.getClass());
        throw 0Q8.createAndThrow();
    }

    public final boolean A0o(42X r302) {
        boolean z = false;
        if ((r302.Ava() & this._readCapabilities.A00) != 0) {
            z = true;
        }
        return z;
    }

    public final boolean A0p(C26O c26o) {
        boolean z = false;
        if ((c26o._mask & this._featureFlags) != 0) {
            z = true;
        }
        return z;
    }
}
