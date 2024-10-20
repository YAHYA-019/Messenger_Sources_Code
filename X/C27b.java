package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;

/* renamed from: X.27b, reason: invalid class name */
/* loaded from: 27b.class */
public final class C27b extends C27d implements Serializable {
    public static final C27b A00 = new C27d(null);
    public static final long serialVersionUID = 1;

    /* JADX WARN: Code restructure failed: missing block: B:1025:0x06f7, code lost:
    
        if (r315 != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1052:0x07c7, code lost:
    
        if (r315 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0a75, code lost:
    
        if (r315 == 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1102:0x09ad, code lost:
    
        if (r0.A04() != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1107:0x0a2d, code lost:
    
        if (r315 == 0) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0b48, code lost:
    
        if (r0.startsWith("org.hibernate.proxy.") == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0b7e, code lost:
    
        r0 = r303.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0b9b, code lost:
    
        if (r0._class != java.lang.Object.class) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0b9e, code lost:
    
        r315 = r302._unknownTypeSerializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0ba7, code lost:
    
        if ((r315 == true ? 1 : 0) != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0b63, code lost:
    
        r315 = r302.A0T(r303.A05._class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0b78, code lost:
    
        if (r315 == 0) goto L986;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0bad, code lost:
    
        r0 = X.C67p.A01(r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0bb9, code lost:
    
        if (r0 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0bdb, code lost:
    
        if (r302._config._mixIns.ASt(r301._class) != null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0bde, code lost:
    
        r315 = new com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer(r301, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0bf2, code lost:
    
        r0 = r301._class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0c0c, code lost:
    
        if (X.AnonymousClass244.class.isAssignableFrom(r0) != false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0c1f, code lost:
    
        if (X.43G.class.isAssignableFrom(r0) != false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0c32, code lost:
    
        if (X.43C.class.isAssignableFrom(r0) != false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0c45, code lost:
    
        if (X.C26d.class.isAssignableFrom(r0) != false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0c58, code lost:
    
        if (X.25A.class.isAssignableFrom(r0) != false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0c6b, code lost:
    
        if (X.AbstractC01033pi.class.isAssignableFrom(r0) != false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0c7e, code lost:
    
        if (X.28Q.class.isAssignableFrom(r0) != false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0c81, code lost:
    
        r0 = r302._config;
        r326 = null;
        r328 = null;
        r327 = null;
        java.util.Collections.emptyList();
        r0 = X.AnonymousClass251.A01(r303);
        r0 = r302._config;
        r0 = r0.A02();
        r0 = new java.util.HashMap();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0ccb, code lost:
    
        if (r0.hasNext() == false) goto L1032;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0cce, code lost:
    
        r0 = (X.AnonymousClass687) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0ce3, code lost:
    
        if (r0.A0H() != null) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0cef, code lost:
    
        if (r0.A0F() != null) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0cf2, code lost:
    
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0cfc, code lost:
    
        r0 = r0.A0L();
        r315 = (java.lang.Boolean) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0d11, code lost:
    
        if (r315 != null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0d14, code lost:
    
        r315 = r0.A03(r0)._isIgnoredType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0d22, code lost:
    
        if (r315 != null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0d25, code lost:
    
        r0 = r0.A05(r0).A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0d3e, code lost:
    
        if ((r0 instanceof X.AnonymousClass247) == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0d41, code lost:
    
        r0 = (com.fasterxml.jackson.annotation.JsonIgnoreType) r0.A06(com.fasterxml.jackson.annotation.JsonIgnoreType.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0d50, code lost:
    
        if (r0 == null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0d53, code lost:
    
        r315 = java.lang.Boolean.valueOf(r0.value());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0d65, code lost:
    
        if (r315 != null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0d68, code lost:
    
        r315 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0d6d, code lost:
    
        r0.put(r0, r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0d80, code lost:
    
        if (r315.booleanValue() == false) goto L1037;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0d96, code lost:
    
        if (r0.A09(X.AnonymousClass260.A0M) == false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0d99, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0dad, code lost:
    
        if (r0.hasNext() == false) goto L1039;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0db0, code lost:
    
        r0 = (X.AnonymousClass687) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0dc5, code lost:
    
        if (r0.A0O() != false) goto L1042;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0dd1, code lost:
    
        if (r0.A0T() != false) goto L1043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0dd4, code lost:
    
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (r301.A05()._class == java.lang.Object.class) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0de9, code lost:
    
        if (r0.isEmpty() == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0dec, code lost:
    
        r315 = X.AnonymousClass001.A0s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0df1, code lost:
    
        r0 = r302._config.A02();
        r0 = r303.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0e0b, code lost:
    
        if ((r0 instanceof X.AnonymousClass247) == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0e0e, code lost:
    
        r0 = (com.fasterxml.jackson.databind.annotation.JsonAppend) r0.A06(com.fasterxml.jackson.databind.annotation.JsonAppend.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0e21, code lost:
    
        if (r0 == null) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0e24, code lost:
    
        r0 = r0.prepend();
        r323 = null;
        r0 = r0.attrs();
        r0 = r0.length;
        r340 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0e5a, code lost:
    
        if (r340 >= r0) goto L1045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0e5f, code lost:
    
        if (r323 != null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0e62, code lost:
    
        r323 = X.1BK.A0Y(r0, java.lang.Object.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0e6f, code lost:
    
        r0 = r0[r340];
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0e81, code lost:
    
        if (r0.required() == false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0e84, code lost:
    
        r351 = X.C68N.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0e89, code lost:
    
        r0 = r0.value();
        r0 = r0.propName();
        r0 = r0.propNamespace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0ead, code lost:
    
        if (r0.isEmpty() == false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0eb0, code lost:
    
        r319 = X.C26G.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0ec7, code lost:
    
        if ((!r319._simpleName.isEmpty()) != false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0eca, code lost:
    
        r319 = X.C26G.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0ed1, code lost:
    
        r0 = new X.3BS(r323, r0, r0.A05, r0);
        r0 = r0.include();
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0efd, code lost:
    
        if (r0 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0f09, code lost:
    
        if (r0 == X.C25d.USE_DEFAULTS) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0f0c, code lost:
    
        r344 = new X.C25c(r0, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0f21, code lost:
    
        r0 = new X.3Bc(r323, new X.3BV(r344, r0.A02(), r351, r319, r0), r0.A04, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0f5f, code lost:
    
        if (r0 == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0f62, code lost:
    
        r315.add(r340, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0f6d, code lost:
    
        r340 = r340 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0f76, code lost:
    
        r315.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0f83, code lost:
    
        r344 = X.AnonymousClass687.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0f8d, code lost:
    
        if (r0 == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0f99, code lost:
    
        if (r0.isEmpty() != false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0f9c, code lost:
    
        r319 = X.C26G.A01(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0fa8, code lost:
    
        r319 = X.C26G.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0fb2, code lost:
    
        r351 = X.C68N.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x1817, code lost:
    
        r0 = r0.props();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x182e, code lost:
    
        if (0 >= r0.length) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x1831, code lost:
    
        r0 = r0[0];
        r0 = r0.name();
        r0 = r0.namespace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x1852, code lost:
    
        if (r0.isEmpty() == false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x1855, code lost:
    
        r0 = X.C26G.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x185a, code lost:
    
        r0._base._typeFactory.A09(r0.type());
        r0.include();
        X.27C.A03(r0.value(), r0.A07());
        r307 = X.AnonymousClass001.A0N("Should not be called on this type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x18a2, code lost:
    
        throw r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x18a5, code lost:
    
        if (r0 == null) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x18b1, code lost:
    
        if (r0.isEmpty() != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x18b4, code lost:
    
        X.C26G.A01(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x18bf, code lost:
    
        X.C26G.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x18c8, code lost:
    
        r0 = r304._factoryConfig._modifiers;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x18dd, code lost:
    
        if (r0.length <= 0) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x18e0, code lost:
    
        r0 = new X.43H(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x18f5, code lost:
    
        if (r0.hasNext() == false) goto L1048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x18f8, code lost:
    
        r0.next();
        r366 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x190f, code lost:
    
        if (r366 >= r315.size()) goto L1049;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x1912, code lost:
    
        r0 = (X.JzF) r315.get(r366);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x1938, code lost:
    
        if (com.google.common.base.Optional.class.isAssignableFrom(r0._declaredType._class) == false) goto L1051;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x193b, code lost:
    
        r315.set(r366, new X.JzF(r0._name, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x195a, code lost:
    
        r366 = r366 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x1975, code lost:
    
        if (r0.A0T(java.lang.CharSequence.class) == false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x1986, code lost:
    
        if (r315.size() != 1) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x1989, code lost:
    
        r0 = ((X.JzF) r315.get(0))._member;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x19aa, code lost:
    
        if ((r0 instanceof X.C68D) == false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x19c7, code lost:
    
        if ("isEmpty".equals(r0.A05()) == false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x19d8, code lost:
    
        if (r0.A0A() != java.lang.CharSequence.class) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x19db, code lost:
    
        r315.remove(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x19e2, code lost:
    
        r0 = r0.A0A(r0, r0._class);
        r309 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x19fe, code lost:
    
        if (r0 == null) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x1a0a, code lost:
    
        if (r0._allowGetters == false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x1a0d, code lost:
    
        r320 = java.util.Collections.emptySet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x1a12, code lost:
    
        r0 = r0.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x1a1b, code lost:
    
        if (r0 == null) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x1a1e, code lost:
    
        r309 = r0.A09(r0)._included;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x1a2c, code lost:
    
        if (r309 != null) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x1a42, code lost:
    
        r0 = r315.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x1a54, code lost:
    
        if (r0.hasNext() == false) goto L1052;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x1a76, code lost:
    
        if (X.C68c.A01(((X.JzF) r0.next())._name._value, r320, r309) == false) goto L1055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x1a79, code lost:
    
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x1a96, code lost:
    
        r0 = r304._factoryConfig._modifiers;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x1aab, code lost:
    
        if (r0.length <= 0) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x1aae, code lost:
    
        r0 = new X.43H(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x1ac3, code lost:
    
        if (r0.hasNext() == false) goto L1057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x1ac6, code lost:
    
        r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x1acf, code lost:
    
        r0 = r303.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x1ad8, code lost:
    
        if (r0 != null) goto L704;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x1adb, code lost:
    
        r359 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x1ae1, code lost:
    
        r0 = r0.A02().A0b(r0);
        r0 = r303.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x1afa, code lost:
    
        if (r0 == null) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x1b06, code lost:
    
        if (r0.A0A != false) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x1b09, code lost:
    
        X.C00963pY.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x1b0e, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x1b17, code lost:
    
        if (r0 == null) goto L688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x1b28, code lost:
    
        if (r0.size() <= 1) goto L689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x1b2b, code lost:
    
        r307 = X.1BL.A1b(r0);
        r306 = "Multiple 'any-getter' methods defined (%s vs %s)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x1b37, code lost:
    
        X.C00963pY.A04(r0, r306, r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x1b43, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x1b4d, code lost:
    
        r309 = (X.AbstractC00953pX) r0.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x1b5c, code lost:
    
        if (r309 == null) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x1b75, code lost:
    
        if (java.util.Map.class.isAssignableFrom(r309.A04()) != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x1b92, code lost:
    
        throw X.1BK.A0f("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", new java.lang.Object[]{r309.A05()});
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x1d63, code lost:
    
        if (r309 == null) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x1d66, code lost:
    
        r0 = r309.A03();
        r0 = r0.A05();
        r0 = r304.A06(r0, r0);
        r319 = r304.A08(r302, r309);
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x1d8c, code lost:
    
        if (r319 != null) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x1d8f, code lost:
    
        r319 = com.fasterxml.jackson.databind.ser.std.MapSerializer.A04(r0, null, null, r0, null, null, null, r0.A09(X.AnonymousClass260.A0S));
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x1dc5, code lost:
    
        r326 = new X.KkO(new X.6rW(r0, X.C68N.A01, X.C26G.A00(r309.A05()), r309), r319, r309);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x1b9c, code lost:
    
        if (r0.A0A != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x1b9f, code lost:
    
        X.C00963pY.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x1ba4, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x1bad, code lost:
    
        if (r0 == null) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x1bbb, code lost:
    
        if (r0.size() <= 1) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x1bbe, code lost:
    
        r307 = X.1BL.A1b(r0);
        r306 = "Multiple 'any-getter' fields defined (%s vs %s)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x1d1e, code lost:
    
        r309 = (X.AbstractC00953pX) r0.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x1d2a, code lost:
    
        if (r309 == null) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x1d43, code lost:
    
        if (java.util.Map.class.isAssignableFrom(r309.A04()) != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x1d60, code lost:
    
        throw X.1BK.A0f("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", new java.lang.Object[]{r309.A05()});
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x1b44, code lost:
    
        r309 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x1dfa, code lost:
    
        r0 = r0.A09(X.AnonymousClass260.A0F);
        r0 = r315.size();
        r0 = new X.JzF[r0];
        r338 = 0;
        r339 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x1e28, code lost:
    
        if (r338 >= r0) goto L1058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x1e2b, code lost:
    
        r319 = (X.JzF) r315.get(r338);
        r0 = r319._includeInViews;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x1e42, code lost:
    
        if (r0 == null) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x1e4c, code lost:
    
        if (r0.length == 0) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x1e4f, code lost:
    
        r339 = r339 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x1e61, code lost:
    
        if (r0.length != 1) goto L751;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x1e64, code lost:
    
        r309 = new X.Jz2(r319, r0[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x1e7b, code lost:
    
        r319 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x1e7f, code lost:
    
        r0[r338] = r319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x1e86, code lost:
    
        r338 = r338 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x1e8f, code lost:
    
        r309 = new X.Jz1(r319, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x1ea2, code lost:
    
        if (r0 == false) goto L1060;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x1eaa, code lost:
    
        if (r0 == false) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x1eaf, code lost:
    
        if (r339 != 0) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x1eb2, code lost:
    
        r0 = r304._factoryConfig._modifiers;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x1ec7, code lost:
    
        if (r0.length <= 0) goto L768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x1eca, code lost:
    
        r0 = new X.43H(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x1edf, code lost:
    
        if (r0.hasNext() == false) goto L1061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x1ee2, code lost:
    
        r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x1f04, code lost:
    
        if (r327 == null) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x1f35, code lost:
    
        if (r326 == null) goto L789;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x1f53, code lost:
    
        r326.A03.A0E(r0.A09(X.AnonymousClass260.A0K));
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x1f69, code lost:
    
        if (r315.isEmpty() == false) goto L826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x1f6e, code lost:
    
        if (r326 != null) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x1f73, code lost:
    
        if (r359 != null) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x1f82, code lost:
    
        if (r301.A0S() != false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x1f85, code lost:
    
        r0 = r301._class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x1fa1, code lost:
    
        if (java.util.Iterator.class.isAssignableFrom(r0) == false) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x1fa4, code lost:
    
        r0 = X.24R.A05(r301, java.util.Iterator.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x1fb2, code lost:
    
        if (r0 == null) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x1fbe, code lost:
    
        if (r0.length != 1) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x1fc1, code lost:
    
        r307 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x1fc7, code lost:
    
        r315 = new com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase(r307, (com.fasterxml.jackson.databind.JsonSerializer) null, r304.A06(r307, r0), java.util.Iterator.class, r308);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x1ffe, code lost:
    
        r307 = X.24R.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x2016, code lost:
    
        if (java.lang.Iterable.class.isAssignableFrom(r0) == false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x2019, code lost:
    
        r0 = X.24R.A05(r301, java.lang.Iterable.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x2027, code lost:
    
        if (r0 == null) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x2033, code lost:
    
        if (r0.length != 1) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x2036, code lost:
    
        r307 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x203c, code lost:
    
        r315 = new com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase(r307, (com.fasterxml.jackson.databind.JsonSerializer) null, r304.A06(r307, r0), java.lang.Iterable.class, r308);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x2073, code lost:
    
        r307 = X.24R.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x2086, code lost:
    
        if (java.lang.CharSequence.class.isAssignableFrom(r0) == false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x2089, code lost:
    
        r315 = com.fasterxml.jackson.databind.ser.std.ToStringSerializer.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x20a3, code lost:
    
        if (r0.A04.size() <= 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x20a6, code lost:
    
        r315 = new com.fasterxml.jackson.databind.ser.std.BeanSerializerBase(r0, r327, r303, r326, r359, r0, com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.A00, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x20d8, code lost:
    
        r318 = X.3Hx.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x2155, code lost:
    
        if (r328 == null) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x215c, code lost:
    
        r0 = r328.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x216e, code lost:
    
        if (r0 == r315.size()) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x21af, code lost:
    
        throw X.AnonymousClass001.A0N(java.lang.String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", java.lang.Integer.valueOf(r315.size()), java.lang.Integer.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x21db, code lost:
    
        new com.fasterxml.jackson.databind.ser.std.BeanSerializerBase(r0, r327, r303, r326, r359, r0, r318, r328);
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x20fb, code lost:
    
        r318 = (X.JzF[]) r315.toArray(new X.JzF[r315.size()]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x2112, code lost:
    
        if (r0.A09(X.AnonymousClass260.A0E) == false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x2115, code lost:
    
        r0 = r318.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x211a, code lost:
    
        r322 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x2124, code lost:
    
        if (r322 >= r0) goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x2145, code lost:
    
        r318[r322]._member.A0E(r0.A09(X.AnonymousClass260.A0K));
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x214c, code lost:
    
        r322 = r322 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x1f17, code lost:
    
        if (r0.A09(X.AnonymousClass260.A0E) == false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x1f2e, code lost:
    
        r327.A0E(r0.A09(X.AnonymousClass260.A0K));
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x2717, code lost:
    
        r307 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x2787, code lost:
    
        throw new X.3Af(((X.C26a) r302).A00, r303, (X.AnonymousClass687) null, java.lang.String.format("Invalid type definition for type %s: %s", X.27C.A06(r0._class), java.lang.String.format("Failed to construct BeanSerializer for %s: (%s) %s", r0, X.AnonymousClass001.A0Y(r307), r307.getMessage())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x1ef8, code lost:
    
        if (r0 != r315.size()) goto L1003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x1efb, code lost:
    
        r328 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x27a9, code lost:
    
        throw X.1BK.A0f("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", X.AnonymousClass001.A1b(java.lang.Integer.valueOf(r0), r315.size()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x1bcd, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x1be3, code lost:
    
        if (r0 != X.JxY.class) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x1be6, code lost:
    
        r0 = r0.A00._simpleName;
        r0 = r315.size();
        r366 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x1c05, code lost:
    
        if (r366 == r0) goto L1063;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x1c08, code lost:
    
        r0 = (X.JzF) r315.get(r366);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x1c29, code lost:
    
        if (r0.equals(r0._name._value) == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x1c8f, code lost:
    
        r366 = r366 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x1c2e, code lost:
    
        if (r366 <= 0) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x1c31, code lost:
    
        r315.remove(r366);
        r315.add(0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x1c41, code lost:
    
        r359 = new X.Kl7(new X.JxX(r0, r0.A03), null, r0._declaredType, null, r0.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x27aa, code lost:
    
        r0 = X.27C.A04(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x27b2, code lost:
    
        if (r0 != null) goto L1010;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x27b5, code lost:
    
        r306 = "[null]";
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x27d2, code lost:
    
        throw X.1BK.A0f("Invalid Object Id definition for %s: cannot find property with name %s", new java.lang.Object[]{r0, r306});
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x27d3, code lost:
    
        r306 = X.27C.A08(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x1c9a, code lost:
    
        if (r0 != null) goto L725;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x1c9d, code lost:
    
        r320 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x1ca3, code lost:
    
        r0 = X.24R.A05(r320, X.3eQ.class)[0];
        r0 = r302.A06(r0);
        r0 = r0.A00;
        r0 = r0.A04;
        r320 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x1cce, code lost:
    
        if (r0 == null) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x1cd1, code lost:
    
        r0 = r0._simpleName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x1cda, code lost:
    
        if (r0 == null) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x1cdd, code lost:
    
        r320 = new X.25K(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x1ce9, code lost:
    
        r359 = new X.Kl7(r0, r320, r0, null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x1d0b, code lost:
    
        r320 = r302.A0A().A09(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x1a31, code lost:
    
        if (r320 == null) goto L667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x1a3f, code lost:
    
        if (r320.isEmpty() != false) goto L667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x1a83, code lost:
    
        r320 = r0._ignored;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x1a8d, code lost:
    
        r320 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0fba, code lost:
    
        r354 = false;
        r0 = r0.A02();
        r0 = r303.A07;
        r0 = r0.A0H(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0fd9, code lost:
    
        if (r0 == null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0fe5, code lost:
    
        if (r0 == X.3Db.A00) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0ff1, code lost:
    
        if (r0 != X.3Db.A02) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0ff4, code lost:
    
        r354 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0ff7, code lost:
    
        r324 = null;
        r317 = X.C25c.A00;
        r0 = r303.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x100b, code lost:
    
        if (r0 == null) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x100e, code lost:
    
        r318 = r317.A00(r0.A08(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x1022, code lost:
    
        r0 = r0.A03(r0._class)._include;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x1039, code lost:
    
        if (r0 == null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x103c, code lost:
    
        r317 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x1040, code lost:
    
        r355 = r318.A00(r317);
        r0 = r0._configOverrides._defaultInclusion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x105d, code lost:
    
        if (r0 == null) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x1060, code lost:
    
        r355 = r0.A00(r355);
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x1069, code lost:
    
        r356 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x107f, code lost:
    
        if (r355._valueInclusion != X.C25d.NON_DEFAULT) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x1082, code lost:
    
        r356 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x1085, code lost:
    
        r0 = r0.A02();
        r315 = new java.util.ArrayList(r0.size());
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x10b5, code lost:
    
        if (r0.hasNext() == false) goto L1066;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x10b8, code lost:
    
        r0 = (X.AnonymousClass687) r0.next();
        r319 = r0.A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x10d9, code lost:
    
        if (r319 != null) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x10dc, code lost:
    
        r319 = r0.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x10ec, code lost:
    
        if (r0.A0V() == false) goto L1067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x1100, code lost:
    
        r0 = r0.A0A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x1109, code lost:
    
        if (r0 == null) goto L1069;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x111c, code lost:
    
        if (r0.A00 != X.0S2.A01) goto L1070;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x1122, code lost:
    
        r0 = r0.A0D();
        r0 = r319.A03();
        r0.A0E();
        r0 = new X.6rW(r0, r0.A0C(), r0, r319);
        r309 = r304.A08(r302, r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x1163, code lost:
    
        if ((r309 instanceof X.C43M) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x1166, code lost:
    
        ((X.C43M) r309).Chu(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x117a, code lost:
    
        r309 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x117c, code lost:
    
        if (r309 == 0) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x117f, code lost:
    
        r0 = r309 instanceof X.C27r;
        r309 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x1188, code lost:
    
        if (r0 == false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x118b, code lost:
    
        r309 = ((X.C27r) r309).AJN(r0, r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x119b, code lost:
    
        r317 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x11aa, code lost:
    
        if (r0.A0Q() != false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x11b6, code lost:
    
        if (r0.A04() == false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x1213, code lost:
    
        r0 = r302._config;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x122a, code lost:
    
        if ((r0.A02() instanceof X.AnonymousClass247) == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x1236, code lost:
    
        if (r0.A0Q() != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x1242, code lost:
    
        if (r0.A04() != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x1245, code lost:
    
        r0 = X.AnonymousClass247.A00(r0, r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x1250, code lost:
    
        if (r0 == null) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x1253, code lost:
    
        r360 = r0.ACt(r0, r0, r0._subtypeResolver.A03(r0, r0, r319));
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x1272, code lost:
    
        r361 = false;
        r362 = r354;
        r344 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x12a2, code lost:
    
        r0 = r0.A0E(r0, r0, r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x12b6, code lost:
    
        if (r0 == r0) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x12b9, code lost:
    
        r0 = r0._class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x12c0, code lost:
    
        r0 = r0._class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x12d2, code lost:
    
        if (r0.isAssignableFrom(r0) != false) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x12e0, code lost:
    
        if (r0.isAssignableFrom(r0) != false) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x1321, code lost:
    
        throw X.AnonymousClass001.A0L(X.0Pz.A10("Illegal concrete-type annotation for method '", r319.A05(), "': class ", r0.getName(), " not a super-type of (declared) class ", r0.getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x1324, code lost:
    
        r344 = r0;
        r362 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x132d, code lost:
    
        r0 = r0.A0H(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x133b, code lost:
    
        if (r0 == null) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x1347, code lost:
    
        if (r0 == X.3Db.A00) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x1353, code lost:
    
        if (r0 != X.3Db.A02) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x1356, code lost:
    
        r343 = r344.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x1370, code lost:
    
        if (r317 == null) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x1375, code lost:
    
        if (r343 != null) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x1378, code lost:
    
        r343 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x1385, code lost:
    
        if (r343.A05() != null) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x13af, code lost:
    
        r343 = r343.A0E(r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x1388, code lost:
    
        r0 = X.AnonymousClass001.A0k();
        r0.append("serialization type ");
        r0.append(r343);
        r313 = X.AnonymousClass001.A0d(" has no content", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x13b8, code lost:
    
        r318 = null;
        r353 = r343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x13c4, code lost:
    
        if (r343 != null) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x13c7, code lost:
    
        r353 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x13cb, code lost:
    
        r317 = r0.A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x13d4, code lost:
    
        if (r317 != null) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x13d7, code lost:
    
        r317 = r0.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x13e0, code lost:
    
        if (r317 != null) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x13e3, code lost:
    
        r313 = "could not determine property type";
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x13eb, code lost:
    
        r0 = new X.C25c[]{r355, r0.A03(r353._class)._include, r0.A03(r317.A04())._includeAsProperty};
        r344 = null;
        r341 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x1442, code lost:
    
        r317 = r0[r341];
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x144b, code lost:
    
        if (r317 == null) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x1450, code lost:
    
        if (r344 == null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x1453, code lost:
    
        r317 = r344.A00(r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x145c, code lost:
    
        r344 = r317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x1460, code lost:
    
        r341 = r341 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x146e, code lost:
    
        if (r341 < 3) goto L1082;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x1471, code lost:
    
        r0 = r344.A00(r0.A09());
        r317 = r0._valueInclusion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x1491, code lost:
    
        if (r317 != X.C25d.USE_DEFAULTS) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x1494, code lost:
    
        r317 = X.C25d.ALWAYS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x1499, code lost:
    
        r0 = r317.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x14a7, code lost:
    
        if (r0 == 4) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x14b2, code lost:
    
        if (r0 == 2) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x14bd, code lost:
    
        if (r0 == 3) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x14c7, code lost:
    
        if (r0 == 5) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x14d2, code lost:
    
        if (r0 != 1) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x14d5, code lost:
    
        r361 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x14d8, code lost:
    
        r0 = X.26D.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x14e6, code lost:
    
        if (r353.A0Q() == false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x14f4, code lost:
    
        if (r0.A0G(r0) != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x14f7, code lost:
    
        r318 = X.JzF.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x14fc, code lost:
    
        r364 = r0.A0X();
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x1505, code lost:
    
        if (r364 != null) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x1508, code lost:
    
        r364 = r303.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x150f, code lost:
    
        r317 = new X.JzF(r0, r343, r309, r319, r0, r360, r0.A04, r318, r364, r361);
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x1556, code lost:
    
        if ((r0 instanceof X.AnonymousClass247) == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x1559, code lost:
    
        r0 = (com.fasterxml.jackson.databind.annotation.JsonSerialize) r319.A06(com.fasterxml.jackson.databind.annotation.JsonSerialize.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x1568, code lost:
    
        if (r0 == null) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x156b, code lost:
    
        r0 = r0.nullsUsing();
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x157d, code lost:
    
        if (r0 == com.fasterxml.jackson.databind.JsonSerializer.None.class) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x1582, code lost:
    
        if (r0 == null) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x1585, code lost:
    
        r317.A05(r302.A0R(r319, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x1597, code lost:
    
        r0 = r0.A0M(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x15a9, code lost:
    
        if (r0 == null) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x15ac, code lost:
    
        r317 = new X.Jz3(r317, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x15be, code lost:
    
        r315.add(r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x15c9, code lost:
    
        r318 = r302.A0V(r0._valueFilter);
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x15db, code lost:
    
        if (r318 == null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x15de, code lost:
    
        r361 = r302.A0Z(r318);
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x16dc, code lost:
    
        r361 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x16d7, code lost:
    
        r318 = X.JzF.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x16d4, code lost:
    
        if (r353.A04() == false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x15ec, code lost:
    
        if (r356 == false) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x15f1, code lost:
    
        if (r324 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x15f4, code lost:
    
        r0 = r0.A07();
        r0 = X.C24q.A00(r0).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x160a, code lost:
    
        if (r0 == null) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x160f, code lost:
    
        if (r0 == false) goto L1020;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x1612, code lost:
    
        r0.A0E(r303.A06.A09(X.AnonymousClass260.A0K));
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x162e, code lost:
    
        r324 = r0.A0K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x1637, code lost:
    
        if (r324 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x26a9, code lost:
    
        r315 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x26b7, code lost:
    
        r315 = r315.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x26ca, code lost:
    
        if ((r315 instanceof java.lang.Error) == false) goto L996;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x26cd, code lost:
    
        X.27C.A0H(r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x2710, code lost:
    
        throw new java.lang.IllegalArgumentException(X.0Pz.A10("Failed to instantiate bean of type ", r0.A05.getName(), ": (", X.AnonymousClass001.A0Y(r315), ") ", X.27C.A09(r315)), r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x2716, code lost:
    
        throw r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x163a, code lost:
    
        r324 = X.3Hy.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x1648, code lost:
    
        if (r324 == X.3Hy.A00) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x164d, code lost:
    
        if (r324 == null) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x1667, code lost:
    
        if (r302._config.A09(X.AnonymousClass260.A0E) == false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x166a, code lost:
    
        r319.A0E(r0.A09(X.AnonymousClass260.A0K));
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x1681, code lost:
    
        r318 = r319.A0B(r324);
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x1697, code lost:
    
        if (r318 == null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x169a, code lost:
    
        r0 = r318.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x16aa, code lost:
    
        if (r0.isArray() == false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x16ad, code lost:
    
        r318 = new X.Kpq(r0, r318, java.lang.reflect.Array.getLength(r318));
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x17cc, code lost:
    
        r307 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x17ce, code lost:
    
        r0 = r0.A0M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x17e1, code lost:
    
        r307 = r307.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x17f4, code lost:
    
        if ((r307 instanceof java.lang.Error) == false) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x17f7, code lost:
    
        X.27C.A0H(r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x1816, code lost:
    
        throw X.AnonymousClass001.A0L(X.0Pz.A0z("Failed to get property '", r0, "' of default ", X.AnonymousClass001.A0Y(r324), " instance"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x168b, code lost:
    
        r318 = X.C67p.A00(r353);
        r361 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x1368, code lost:
    
        r343 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x1362, code lost:
    
        if (r362 == false) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x27dd, code lost:
    
        r307 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x27df, code lost:
    
        r313 = X.27C.A09(r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x1282, code lost:
    
        r360 = r304.A06(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x11b9, code lost:
    
        r0 = r302._config;
        r0 = r0.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x11d7, code lost:
    
        if ((r0.A02() instanceof X.AnonymousClass247) == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x11e3, code lost:
    
        if (r0.A05() == null) goto L1075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x11e6, code lost:
    
        r0 = X.AnonymousClass247.A00(r0, r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x11f1, code lost:
    
        if (r0 == null) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x11f4, code lost:
    
        r317 = r0.ACt(r0, r0, r0._subtypeResolver.A03(r0, r0, r319));
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x2843, code lost:
    
        r0 = X.AnonymousClass001.A0k();
        r0.append("Must call method with a container or reference type (got ");
        r0.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x2861, code lost:
    
        throw X.AnonymousClass002.A0D(")", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x1290, code lost:
    
        r317 = r304.A06(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x10f1, code lost:
    
        if (r319 == null) goto L1079;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x10f6, code lost:
    
        if (r327 != null) goto L1068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x10f9, code lost:
    
        r327 = r319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x2684, code lost:
    
        r0 = X.AnonymousClass001.A0k();
        r0.append("Multiple type ids specified with ");
        r0.append(r327);
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x26a8, code lost:
    
        throw X.AnonymousClass002.A0C(r319, " and ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x16fa, code lost:
    
        r0 = r315.size();
        r345 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x170b, code lost:
    
        if (r345 >= r0) goto L1085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x170e, code lost:
    
        r0 = (X.JzF) r315.get(r345);
        r0 = r0._typeSerializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x1723, code lost:
    
        if (r0 == null) goto L1087;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x1736, code lost:
    
        if (r0.A00() != X.KN1.EXTERNAL_PROPERTY) goto L1088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1739, code lost:
    
        r0 = X.C26G.A00(r0.A05());
        r0 = r315.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x1759, code lost:
    
        if (r0.hasNext() == false) goto L1089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x175c, code lost:
    
        r0 = (X.JzF) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x176c, code lost:
    
        if (r0 == r0) goto L1097;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x176f, code lost:
    
        r0 = r0._wrapperName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x1778, code lost:
    
        if (r0 == null) goto L1092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x17ba, code lost:
    
        if (r0._simpleName.equals(r0._name._value) == false) goto L1098;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x17c6, code lost:
    
        if (r0._namespace == null) goto L1095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x1789, code lost:
    
        r0._typeSerializer = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x1795, code lost:
    
        r345 = r345 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x1786, code lost:
    
        if (r0.equals(r0) == false) goto L1100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x16e2, code lost:
    
        r318 = r317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x16e9, code lost:
    
        r354 = r0.A09(X.AnonymousClass260.A0S);
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x21e3, code lost:
    
        r315 = new com.fasterxml.jackson.databind.ser.std.StdSerializer(r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0b60, code lost:
    
        if (java.lang.Enum.class.isAssignableFrom(r301._class) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x22a6, code lost:
    
        if ((r315 == true ? 1 : 0) == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x22a1, code lost:
    
        if (r0 != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x030e, code lost:
    
        if (r0.A04() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x2554, code lost:
    
        if (r0.A04() != false) goto L956;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x033a, code lost:
    
        if (r302._config.A0G(X.26D.A0J) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:962:0x043b, code lost:
    
        if (r315 != 0) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x08b6  */
    /* JADX WARN: Type inference failed for: r0v1199, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r0v359 */
    /* JADX WARN: Type inference failed for: r0v590, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r0v674, types: [X.248] */
    /* JADX WARN: Type inference failed for: r0v679, types: [X.248] */
    /* JADX WARN: Type inference failed for: r0v693, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r0v758, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r0v779, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r0v841, types: [X.248] */
    /* JADX WARN: Type inference failed for: r0v849, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r0v935, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r1v105, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r1v115, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r1v137, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r1v142, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r1v161, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r2v15, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r2v49, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r2v52, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r302v0, types: [X.26c, X.26d] */
    /* JADX WARN: Type inference failed for: r304v0, types: [X.27d, X.26u, X.27b] */
    /* JADX WARN: Type inference failed for: r309v11 */
    /* JADX WARN: Type inference failed for: r315v1 */
    /* JADX WARN: Type inference failed for: r315v11 */
    /* JADX WARN: Type inference failed for: r315v119 */
    /* JADX WARN: Type inference failed for: r315v12 */
    /* JADX WARN: Type inference failed for: r315v120 */
    /* JADX WARN: Type inference failed for: r315v128 */
    /* JADX WARN: Type inference failed for: r315v129 */
    /* JADX WARN: Type inference failed for: r315v133 */
    /* JADX WARN: Type inference failed for: r315v134 */
    /* JADX WARN: Type inference failed for: r315v135 */
    /* JADX WARN: Type inference failed for: r315v136, types: [com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer] */
    /* JADX WARN: Type inference failed for: r315v137 */
    /* JADX WARN: Type inference failed for: r315v138 */
    /* JADX WARN: Type inference failed for: r315v139 */
    /* JADX WARN: Type inference failed for: r315v140 */
    /* JADX WARN: Type inference failed for: r315v142 */
    /* JADX WARN: Type inference failed for: r315v143 */
    /* JADX WARN: Type inference failed for: r315v146 */
    /* JADX WARN: Type inference failed for: r315v147, types: [com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase] */
    /* JADX WARN: Type inference failed for: r315v148, types: [com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase] */
    /* JADX WARN: Type inference failed for: r315v149 */
    /* JADX WARN: Type inference failed for: r315v151, types: [com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase] */
    /* JADX WARN: Type inference failed for: r315v152 */
    /* JADX WARN: Type inference failed for: r315v154 */
    /* JADX WARN: Type inference failed for: r315v156 */
    /* JADX WARN: Type inference failed for: r315v157 */
    /* JADX WARN: Type inference failed for: r315v159 */
    /* JADX WARN: Type inference failed for: r315v161 */
    /* JADX WARN: Type inference failed for: r315v163, types: [java.lang.Object, com.fasterxml.jackson.databind.ser.std.MapSerializer] */
    /* JADX WARN: Type inference failed for: r315v164 */
    /* JADX WARN: Type inference failed for: r315v165 */
    /* JADX WARN: Type inference failed for: r315v166 */
    /* JADX WARN: Type inference failed for: r315v170 */
    /* JADX WARN: Type inference failed for: r315v171 */
    /* JADX WARN: Type inference failed for: r315v172 */
    /* JADX WARN: Type inference failed for: r315v173 */
    /* JADX WARN: Type inference failed for: r315v174 */
    /* JADX WARN: Type inference failed for: r315v175 */
    /* JADX WARN: Type inference failed for: r315v176 */
    /* JADX WARN: Type inference failed for: r315v177 */
    /* JADX WARN: Type inference failed for: r315v178 */
    /* JADX WARN: Type inference failed for: r315v179 */
    /* JADX WARN: Type inference failed for: r315v180 */
    /* JADX WARN: Type inference failed for: r315v181 */
    /* JADX WARN: Type inference failed for: r315v182 */
    /* JADX WARN: Type inference failed for: r315v183 */
    /* JADX WARN: Type inference failed for: r315v184 */
    /* JADX WARN: Type inference failed for: r315v2 */
    /* JADX WARN: Type inference failed for: r315v32 */
    /* JADX WARN: Type inference failed for: r315v37 */
    /* JADX WARN: Type inference failed for: r315v47 */
    /* JADX WARN: Type inference failed for: r315v48 */
    /* JADX WARN: Type inference failed for: r315v5 */
    /* JADX WARN: Type inference failed for: r315v55 */
    /* JADX WARN: Type inference failed for: r315v56 */
    /* JADX WARN: Type inference failed for: r315v59 */
    /* JADX WARN: Type inference failed for: r315v7 */
    /* JADX WARN: Type inference failed for: r315v8 */
    /* JADX WARN: Type inference failed for: r315v99 */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.24r] */
    /* JADX WARN: Type inference failed for: r3v27, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.3pX] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.3pX] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.JsonSerializer A00(X.24S r301, X.C26c r302, X.AnonymousClass251 r303, X.C27b r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 10338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27b.A00(X.24S, X.26c, X.251, X.27b, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public static Object A01(24S r301) {
        Object A002 = C67p.A00(r301);
        if (A002 != null) {
            Class<?> cls = A002.getClass();
            if (cls.isArray()) {
                return new Kpq(cls, A002, Array.getLength(A002));
            }
        }
        return A002;
    }

    public static Iterator A02(C27d c27d) {
        return new 43H(c27d._factoryConfig._additionalSerializers).iterator();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.27d, X.27b] */
    @Override // X.C27d
    public C27b A09(28V r302) {
        if (this._factoryConfig == r302) {
            return this;
        }
        Class<?> cls = getClass();
        if (cls == C27b.class) {
            return new C27d(r302);
        }
        throw 0Pz.A07("Subtype of BeanSerializerFactory (", cls.getName(), ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
    }
}
