package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.244, reason: invalid class name */
/* loaded from: 244.class */
public class AnonymousClass244 extends AnonymousClass245 implements Serializable {
    public static final AnonymousClass248 A00;
    public static final C24m DEFAULT_BASE;
    public static final long serialVersionUID = 2;
    public final C25l _coercionConfigs;
    public final C25b _configOverrides;
    public C26L _deserializationConfig;
    public C27S _deserializationContext;
    public AbstractC01023pf _injectableValues;
    public final AnonymousClass259 _jsonFactory;
    public C25a _mixIns;
    public Set _registeredModuleTypes;
    public final ConcurrentHashMap _rootDeserializers;
    public C25p _serializationConfig;
    public C26u _serializerFactory;
    public C26a _serializerProvider;
    public 25Y _subtypeResolver;
    public 24R _typeFactory;

    static {
        AnonymousClass247 anonymousClass247 = new AnonymousClass247();
        A00 = anonymousClass247;
        24R r0 = 24R.A06;
        C24d c24d = C24d.A03;
        Locale locale = Locale.getDefault();
        DEFAULT_BASE = new C24m(C24e.A01, anonymousClass247, null, new C24k(), null, C24h.A00, null, r0, c24d, locale, null);
    }

    public AnonymousClass244() {
        this(null, null, null);
    }

    public AnonymousClass244(AnonymousClass259 anonymousClass259) {
        this(anonymousClass259, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.25Y] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.24n] */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.26c, X.26a] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.27T, X.27S] */
    public AnonymousClass244(AnonymousClass259 anonymousClass259, C27S c27s, C26a c26a) {
        this._rootDeserializers = new ConcurrentHashMap(64, 0.6f, 2);
        if (anonymousClass259 == null) {
            this._jsonFactory = new AnonymousClass259(this);
        } else {
            this._jsonFactory = anonymousClass259;
            if (anonymousClass259._objectCodec == null) {
                anonymousClass259._objectCodec = this;
            }
        }
        this._subtypeResolver = new Object();
        25Z r0 = new 25Z();
        this._typeFactory = 24R.A06;
        C25a c25a = new C25a();
        this._mixIns = c25a;
        C24m c24m = DEFAULT_BASE;
        ?? obj = new Object();
        c24m = c24m._classIntrospector != obj ? new C24m(c24m._defaultBase64, c24m._annotationIntrospector, c24m._propertyNamingStrategy, c24m._accessorNaming, obj, c24m._typeValidator, c24m._typeResolverBuilder, c24m._typeFactory, c24m._dateFormat, c24m._locale, c24m._timeZone) : c24m;
        C25b c25b = new C25b();
        this._configOverrides = c25b;
        C25l c25l = new C25l();
        this._coercionConfigs = c25l;
        25Y r02 = this._subtypeResolver;
        C25p c25p = new C25p(c24m, c25b, c25a, r02, r0);
        this._serializationConfig = c25p;
        C26L c26l = new C26L(c24m, c25l, c25b, c25a, r02, r0);
        this._deserializationConfig = c26l;
        AnonymousClass260 anonymousClass260 = AnonymousClass260.A0O;
        if (c25p.A09(anonymousClass260)) {
            AnonymousClass260[] anonymousClass260Arr = {anonymousClass260};
            long j = c25p._mapperFeatures;
            long j2 = anonymousClass260Arr[0]._mask;
            long j3 = -1;
            long j4 = j & (j2 ^ j3);
            this._serializationConfig = j4 != j ? new C25p(c25p, c25p._serFeatures, c25p._generatorFeatures, c25p._generatorFeaturesToChange, c25p._formatWriteFeatures, c25p._formatWriteFeaturesToChange, j4) : c25p;
            AnonymousClass260[] anonymousClass260Arr2 = {anonymousClass260};
            long j5 = c26l._mapperFeatures;
            long j6 = j5 & (anonymousClass260Arr2[0]._mask ^ j3);
            this._deserializationConfig = j6 != j5 ? new C26L(c26l, c26l._deserFeatures, c26l._parserFeatures, c26l._parserFeaturesToChange, c26l._formatReadFeatures, c26l._formatReadFeaturesToChange, j6) : c26l;
        }
        this._serializerProvider = new C26c();
        this._deserializationContext = new C27T(AnonymousClass275.A00);
        this._serializerFactory = C27b.A00;
    }

    private C42h A01(AbstractC01033pi abstractC01033pi, 24S r303) {
        C26L c26l = this._deserializationConfig;
        int i = c26l._parserFeaturesToChange;
        if (i != 0) {
            abstractC01033pi.A1G(c26l._parserFeatures, i);
        }
        C42h A1I = abstractC01033pi.A1I();
        if (A1I == null) {
            A1I = abstractC01033pi.A1K();
            if (A1I == null) {
                throw 4DO.A00(abstractC01033pi, r303, "No content to map due to end-of-input");
            }
        }
        return A1I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.27T, X.27S] */
    public static 24X A02(AbstractC01033pi abstractC01033pi, AnonymousClass244 anonymousClass244) {
        try {
            24S A09 = anonymousClass244._typeFactory.A09(24X.class);
            C26L c26l = anonymousClass244._deserializationConfig;
            int i = c26l._parserFeaturesToChange;
            if (i != 0) {
                abstractC01033pi.A1G(c26l._parserFeatures, i);
            }
            C42h A1I = abstractC01033pi.A1I();
            if (A1I == null) {
                A1I = abstractC01033pi.A1K();
                if (A1I == null) {
                    C10554tt c10554tt = C10554tt.A00;
                    abstractC01033pi.close();
                    return c10554tt;
                }
            }
            ?? c27t = new C27T(abstractC01033pi, c26l, anonymousClass244._deserializationContext);
            C09924rw c09924rw = A1I == C42h.A09 ? C09924rw.A00 : (24X) c27t.A0q(abstractC01033pi, A09, anonymousClass244.A0G(c27t, A09), null);
            if (c26l.A0F(C26O.A0E)) {
                A04(abstractC01033pi, A09);
            }
            abstractC01033pi.close();
            return c09924rw;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    abstractC01033pi.close();
                    throw th2;
                } catch (Throwable th3) {
                    7kF.A00(th, th3);
                    throw th2;
                }
            }
        }
    }

    private final void A03(28Q r302, Object obj) {
        C25p c25p = this._serializationConfig;
        if (c25p.A0G(26D.A01) && (obj instanceof Closeable)) {
            Closeable closeable = (Closeable) obj;
            try {
                A0L(c25p).A0b(r302, obj);
                try {
                    closeable.close();
                } catch (Exception e) {
                    e = e;
                    closeable = null;
                    27C.A0B(r302, closeable, e);
                    throw 0Q8.createAndThrow();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            try {
                A0L(c25p).A0b(r302, obj);
            } catch (Exception e3) {
                27C.A0C(r302, e3);
                throw 0Q8.createAndThrow();
            }
        }
        r302.close();
    }

    public static final void A04(AbstractC01033pi abstractC01033pi, 24S r302) {
        C42h A1K = abstractC01033pi.A1K();
        if (A1K != null) {
            Class cls = r302 == null ? null : r302._class;
            2LD c2cb = new C2cb(abstractC01033pi, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", A1K, 27C.A06(cls)));
            ((4DO) c2cb)._targetType = cls;
            throw c2cb;
        }
    }

    public static final void A05(String str, Object obj) {
        if (obj == null) {
            throw 1BK.A0f("argument \"%s\" is null", new Object[]{str});
        }
    }

    public JsonDeserializer A0G(C27T c27t, 24S r303) {
        JsonDeserializer jsonDeserializer = (JsonDeserializer) this._rootDeserializers.get(r303);
        if (jsonDeserializer == null) {
            jsonDeserializer = c27t.A0J(r303);
            if (jsonDeserializer == null) {
                c27t.A0D(r303, AnonymousClass001.A0Z(r303, AbstractC00603o4.A00(339), AnonymousClass001.A0k()));
                throw 0Q8.createAndThrow();
            }
            this._rootDeserializers.put(r303, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    public 24X A0H(Object obj) {
        if (obj == null) {
            return C09924rw.A00;
        }
        C26a A0L = A0L(this._serializationConfig.A0E(26D.A0A));
        28P A05 = C26c.A05(this);
        if (this._deserializationConfig.A0F(C26O.A0M)) {
            A05.A08 = true;
        }
        try {
            A0L.A0b(A05, obj);
            4rL A002 = 28P.A00(A05.A02, A05);
            try {
                24X A0B = A0B(A002);
                A002.close();
                return A0B;
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.24X A0I(java.lang.String r302) {
        /*
            r301 = this;
            java.lang.String r0 = "content"
            r303 = r0
            r0 = r303
            r1 = r302
            A05(r0, r1)
            r0 = r301
            X.259 r0 = r0._jsonFactory     // Catch: java.io.IOException -> L1a X.2LD -> L1e
            r303 = r0
            r0 = r303
            r1 = r302
            X.42f r0 = r0.A05(r1)     // Catch: java.io.IOException -> L1a X.2LD -> L1e
            r303 = r0
            r0 = r303
            r1 = r301
            X.24X r0 = A02(r0, r1)     // Catch: java.io.IOException -> L1a X.2LD -> L1e
            return r0
        L1a:
            X.2cb r0 = X.C2cb.A01(r0)
            throw r0
        L1e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass244.A0I(java.lang.String):X.24X");
    }

    public 24X A0J(byte[] bArr) {
        A05("content", bArr);
        return A02(this._jsonFactory.A04(bArr), this);
    }

    public 2DM A0K() {
        return new 2DM(this._deserializationConfig._nodeFactory);
    }

    public C26a A0L(C25p c25p) {
        if (!(this instanceof AnonymousClass243)) {
            return this._serializerProvider.A0a(c25p, this._serializerFactory);
        }
        AnonymousClass243 anonymousClass243 = (AnonymousClass243) this;
        return new 4iJ(anonymousClass243.mJsonLogger, c25p, anonymousClass243._serializerProvider, anonymousClass243._serializerFactory, anonymousClass243.mHumanReadableFormatEnabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.27T, X.27S] */
    public Object A0M(AbstractC01033pi abstractC01033pi, C26L c26l, 24S r304) {
        C42h A01 = A01(abstractC01033pi, r304);
        ?? c27t = new C27T(abstractC01033pi, c26l, this._deserializationContext);
        Object obj = null;
        if (A01 == C42h.A09) {
            obj = A0G(c27t, r304).Azd(c27t);
        } else if (A01 != C42h.A01 && A01 != C42h.A02) {
            obj = c27t.A0q(abstractC01033pi, r304, A0G(c27t, r304), null);
        }
        abstractC01033pi.A1g();
        if (c26l.A0F(C26O.A0E)) {
            A04(abstractC01033pi, r304);
        }
        return obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v4 ??, still in use, count: 3, list:
          (r311v4 ??) from 0x0122: PHI (r311v3 ??) = (r311v1 ??), (r311v4 ??) binds: [B:62:0x00f4, B:73:0x011f] A[DONT_GENERATE, DONT_INLINE]
          (r311v4 ?? I:X.81f) from 0x011a: IPUT (r0v89 ?? I:java.util.List), (r311v4 ?? I:X.81f) A[Catch: all -> 0x01bd] X.81f._unresolvedIds java.util.List
          (r311v4 ?? I:X.81f) from 0x011f: INVOKE (r311v4 ?? I:X.81f) VIRTUAL call: X.81f.A09():void A[Catch: all -> 0x01bd, MD:():void (m)]
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
    public java.lang.Object A0N(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v4 ??, still in use, count: 3, list:
          (r311v4 ??) from 0x0122: PHI (r311v3 ??) = (r311v1 ??), (r311v4 ??) binds: [B:62:0x00f4, B:73:0x011f] A[DONT_GENERATE, DONT_INLINE]
          (r311v4 ?? I:X.81f) from 0x011a: IPUT (r0v89 ?? I:java.util.List), (r311v4 ?? I:X.81f) A[Catch: all -> 0x01bd] X.81f._unresolvedIds java.util.List
          (r311v4 ?? I:X.81f) from 0x011f: INVOKE (r311v4 ?? I:X.81f) VIRTUAL call: X.81f.A09():void A[Catch: all -> 0x01bd, MD:():void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public Object A0O(AbstractC01033pi abstractC01033pi, 24S r303) {
        A05(K92.__redex_internal_original_name, abstractC01033pi);
        return A0M(abstractC01033pi, this._deserializationConfig, r303);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0P(X.C24a r302, java.lang.Class r303) {
        /*
            r301 = this;
            r0 = r302
            if (r0 != 0) goto L8
            r0 = 0
            r304 = r0
        L6:
            r0 = r304
            return r0
        L8:
            java.lang.Class<X.24a> r0 = X.C24a.class
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.isAssignableFrom(r1)     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L30
            r0 = r302
            java.lang.Class r0 = r0.getClass()     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r305 = r0
            r0 = r303
            r1 = r305
            boolean r0 = r0.isAssignableFrom(r1)     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L30
            goto L6f
        L30:
            r0 = r302
            X.42h r0 = r0.AAi()     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r304 = r0
            X.42h r0 = X.C42h.A07     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L73
            r0 = r302
            boolean r0 = r0 instanceof X.3Ba
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L73
            r0 = r302
            r305 = r0
            r0 = r302
            X.3Ba r0 = (X.3Ba) r0     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0._value     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L6
            r0 = r303
            r1 = r304
            boolean r0 = r0.isInstance(r1)     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L73
            goto L71
        L6f:
            r0 = r302
            return r0
        L71:
            r0 = r304
            return r0
        L73:
            r0 = r302
            X.24X r0 = (X.24X) r0     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r302 = r0
            X.3AW r0 = new X.3AW     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r305 = r0
            r0 = r305
            r1 = r301
            r2 = r302
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L8c X.2LD -> La3
            r0 = r301
            r1 = r305
            r2 = r303
            java.lang.Object r0 = r0.A0E(r1, r2)     // Catch: java.io.IOException -> L8c X.2LD -> La3
            return r0
        L8c:
            r304 = move-exception
            r0 = r304
            java.lang.String r0 = r0.getMessage()
            r305 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r307 = r0
            r0 = r307
            r1 = r305
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r307
            throw r0
        La3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass244.A0P(X.24a, java.lang.Class):java.lang.Object");
    }

    public Object A0Q(5BC r302, String str) {
        A05("content", str);
        return A0R(24R.A02((43K) null, 24R.A05, this._typeFactory, r302._type), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0R(X.24S r302, java.lang.String r303) {
        /*
            r301 = this;
            java.lang.String r0 = "content"
            r304 = r0
            r0 = r304
            r1 = r303
            A05(r0, r1)
            r0 = r301
            X.259 r0 = r0._jsonFactory     // Catch: java.io.IOException -> L1b X.2LD -> L1f
            r304 = r0
            r0 = r304
            r1 = r303
            X.42f r0 = r0.A05(r1)     // Catch: java.io.IOException -> L1b X.2LD -> L1f
            r304 = r0
            r0 = r301
            r1 = r304
            r2 = r302
            java.lang.Object r0 = r0.A0N(r1, r2)     // Catch: java.io.IOException -> L1b X.2LD -> L1f
            return r0
        L1b:
            X.2cb r0 = X.C2cb.A01(r0)
            throw r0
        L1f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass244.A0R(X.24S, java.lang.String):java.lang.Object");
    }

    public Object A0S(InputStream inputStream, Class cls) {
        A05("src", inputStream);
        return A0N(this._jsonFactory.A03(inputStream), this._typeFactory.A09(cls));
    }

    public Object A0T(Class cls, Object obj) {
        Object obj2;
        24S A09 = this._typeFactory.A09(cls);
        C26a A0L = A0L(this._serializationConfig.A0E(26D.A0A));
        28P A05 = C26c.A05(this);
        if (this._deserializationConfig.A0F(C26O.A0M)) {
            A05.A08 = true;
        }
        try {
            A0L.A0b(A05, obj);
            4rL A002 = 28P.A00(A05.A02, A05);
            C26L c26l = this._deserializationConfig;
            C42h A01 = A01(A002, A09);
            if (A01 == C42h.A09) {
                C27T c27t = new C27T(A002, c26l, this._deserializationContext);
                obj2 = A0G(c27t, A09).Azd(c27t);
            } else if (A01 == C42h.A01 || A01 == C42h.A02) {
                obj2 = null;
            } else {
                C27T c27t2 = new C27T(A002, c26l, this._deserializationContext);
                obj2 = A0G(c27t2, A09).A0M(A002, c27t2);
            }
            A002.close();
            return obj2;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public Object A0U(Class cls, byte[] bArr) {
        A05("src", bArr);
        return A0N(this._jsonFactory.A04(bArr), this._typeFactory.A09(cls));
    }

    public Object A0V(String str, Class cls) {
        A05("content", str);
        return A0R(this._typeFactory.A09(cls), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A0W(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            X.259 r0 = r0._jsonFactory
            X.3sK r0 = r0.A08()
            r303 = r0
            X.3sL r0 = new X.3sL
            r304 = r0
            r0 = r304
            r1 = r303
            r0.<init>(r1)
            r0 = r301
            X.259 r0 = r0._jsonFactory     // Catch: java.io.IOException -> L42 X.2LD -> L46
            r303 = r0
            r0 = r303
            r1 = r304
            X.3sP r0 = r0.A07(r1)     // Catch: java.io.IOException -> L42 X.2LD -> L46
            r305 = r0
            r0 = r301
            X.25p r0 = r0._serializationConfig     // Catch: java.io.IOException -> L42 X.2LD -> L46
            r303 = r0
            r0 = r303
            r1 = r305
            r0.A0F(r1)     // Catch: java.io.IOException -> L42 X.2LD -> L46
            r0 = r301
            r1 = r305
            r2 = r302
            r0.A03(r1, r2)     // Catch: java.io.IOException -> L42 X.2LD -> L46
            r0 = r304
            X.3sM r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.A06()
            r303 = r0
            r0 = r305
            r0.A07()
            r0 = r303
            return r0
        L42:
            X.2cb r0 = X.C2cb.A01(r0)
            throw r0
        L46:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass244.A0W(java.lang.Object):java.lang.String");
    }

    public void A0X(C26O c26o) {
        C26L c26l;
        C26L c26l2 = this._deserializationConfig;
        int i = c26l2._deserFeatures;
        int i2 = i & (c26o._mask ^ (-1));
        if (i2 == i) {
            c26l = c26l2;
        } else {
            c26l = new C26L(c26l2, i2, c26l2._parserFeatures, c26l2._parserFeaturesToChange, c26l2._formatReadFeatures, c26l2._formatReadFeaturesToChange, c26l2._mapperFeatures);
        }
        this._deserializationConfig = c26l;
    }

    public void A0Y(C28b c28b) {
        String A02;
        A05("module", c28b);
        if (c28b.A01() == null) {
            throw AnonymousClass001.A0L("Module without defined name");
        }
        if (c28b.A00() == null) {
            throw AnonymousClass001.A0L("Module without defined version");
        }
        Iterator it = Collections.emptyList().iterator();
        while (it.hasNext()) {
            A0Y((C28b) it.next());
        }
        if (this._serializationConfig.A09(AnonymousClass260.A0G) && (A02 = c28b.A02()) != null) {
            Set set = this._registeredModuleTypes;
            if (set == null) {
                set = new LinkedHashSet();
                this._registeredModuleTypes = set;
            }
            if (!set.add(A02)) {
                return;
            }
        }
        c28b.A03(new C28d(this));
    }

    public void A0Z(File file, Object obj) {
        Integer num = 0S2.A00;
        A05("outputFile", file);
        AnonymousClass259 anonymousClass259 = this._jsonFactory;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        3sO r0 = new 3sO(new 3sN(true, fileOutputStream), anonymousClass259.A08(), true);
        r0.A00 = num;
        28Q A01 = AnonymousClass259.A01(anonymousClass259, r0, fileOutputStream);
        this._serializationConfig.A0F(A01);
        A03(A01, obj);
    }

    public void A0a(OutputStream outputStream, Object obj) {
        Integer num = 0S2.A00;
        A05("out", outputStream);
        AnonymousClass259 anonymousClass259 = this._jsonFactory;
        3sO r0 = new 3sO(new 3sN(true, outputStream), anonymousClass259.A08(), false);
        r0.A00 = num;
        28Q A01 = AnonymousClass259.A01(anonymousClass259, r0, outputStream);
        this._serializationConfig.A0F(A01);
        A03(A01, obj);
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00ab: THROW (r0 I:java.lang.Throwable), block:B:60:0x00ab */
    public byte[] A0b(Object obj) {
        Throwable th;
        try {
            try {
                3DX r0 = new 3DX(this._jsonFactory.A08());
                try {
                    Integer num = 0S2.A00;
                    AnonymousClass259 anonymousClass259 = this._jsonFactory;
                    3sO r02 = new 3sO(new 3sN(true, r0), anonymousClass259.A08(), false);
                    r02.A00 = num;
                    28Q A01 = AnonymousClass259.A01(anonymousClass259, r02, r0);
                    this._serializationConfig.A0F(A01);
                    A03(A01, obj);
                    byte[] A05 = r0.A05();
                    r0.A01();
                    3sK r03 = r0.A03;
                    if (r03 != null) {
                        byte[] bArr = r0.A01;
                        if (bArr != null) {
                            r03.A00.set(2, bArr);
                            r0.A01 = null;
                        }
                    }
                    return A05;
                } finally {
                }
            } catch (IOException unused) {
                throw C2cb.A01(th);
            }
        } catch (2LD unused2) {
            throw th;
        }
    }
}
