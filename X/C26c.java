package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: X.26c, reason: invalid class name */
/* loaded from: 26c.class */
public abstract class C26c extends C26d {
    public static final JsonSerializer A01 = new FailingSerializer();
    public static final JsonSerializer A02 = new UnknownSerializer();
    public transient C26K A00;
    public final C25p _config;
    public DateFormat _dateFormat;
    public JsonSerializer _keySerializer;
    public final C01013pe _knownSerializers;
    public JsonSerializer _nullKeySerializer;
    public JsonSerializer _nullValueSerializer;
    public final Class _serializationView;
    public final C26w _serializerCache;
    public final C26u _serializerFactory;
    public final boolean _stdNullValueSerializer;
    public JsonSerializer _unknownTypeSerializer;

    public C26c() {
        this._unknownTypeSerializer = A02;
        this._nullValueSerializer = NullSerializer.A00;
        this._nullKeySerializer = A01;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new C26w();
        this._knownSerializers = null;
        this._serializationView = null;
        this.A00 = null;
        this._stdNullValueSerializer = true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v6 ??, still in use, count: 2, list:
          (r308v6 ??) from 0x00ea: PHI (r308v5 ??) = (r308v4 ??), (r308v6 ??) binds: [B:12:0x00c2, B:17:0x00da] A[DONT_GENERATE, DONT_INLINE]
          (r308v6 ?? I:java.lang.Object) from 0x00dc: INVOKE (r0v35 ?? I:java.util.concurrent.atomic.AtomicReference), (r308v6 ?? I:java.lang.Object) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.set(java.lang.Object):void A[Catch: all -> 0x00e2, MD:(V):void (c)]
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
    public C26c(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v6 ??, still in use, count: 2, list:
          (r308v6 ??) from 0x00ea: PHI (r308v5 ??) = (r308v4 ??), (r308v6 ??) binds: [B:12:0x00c2, B:17:0x00da] A[DONT_GENERATE, DONT_INLINE]
          (r308v6 ?? I:java.lang.Object) from 0x00dc: INVOKE (r0v35 ?? I:java.util.concurrent.atomic.AtomicReference), (r308v6 ?? I:java.lang.Object) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.set(java.lang.Object):void A[Catch: all -> 0x00e2, MD:(V):void (c)]
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

    /* JADX WARN: Multi-variable type inference failed */
    private JsonSerializer A03(24S r302) {
        try {
            JsonSerializer A05 = this._serializerFactory.A05(r302, this);
            if (A05 == 0) {
                return A05;
            }
            C26w c26w = this._serializerCache;
            synchronized (c26w) {
                if (c26w.A00.put(new C43J(r302, false), A05) == null) {
                    c26w.A01.set(null);
                }
                if (A05 instanceof C43M) {
                    ((C43M) A05).Chu(this);
                }
            }
            return A05;
        } catch (IllegalArgumentException e) {
            throw new C2cb(((C26a) this).A00, 27C.A09(e), e);
        }
    }

    private JsonSerializer A04(Class cls) {
        24S A09 = this._config._base._typeFactory.A09(cls);
        try {
            A09 = this._serializerFactory.A05(A09, this);
            if (A09 == null) {
                return A09;
            }
            C26w c26w = this._serializerCache;
            synchronized (c26w) {
                HashMap hashMap = c26w.A00;
                Object put = hashMap.put(new C43J(cls, false), A09);
                Object put2 = hashMap.put(new C43J(A09, false), A09);
                if (put == null || put2 == null) {
                    c26w.A01.set(null);
                }
                if (A09 instanceof C43M) {
                    ((C43M) A09).Chu(this);
                }
            }
            return (JsonSerializer) A09;
        } catch (IllegalArgumentException unused) {
            A0D(A09, 27C.A09(A09));
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.28P, java.lang.Object] */
    public static 28P A05(AnonymousClass245 anonymousClass245) {
        ?? obj = new Object();
        ((28P) obj).A09 = false;
        ((28P) obj).A02 = anonymousClass245;
        ((28P) obj).A01 = 28P.A0E;
        ((28P) obj).A03 = new 3sW((3sY) null, (3sW) null, 0);
        4rI r0 = new 4rI();
        ((28P) obj).A05 = r0;
        ((28P) obj).A04 = r0;
        ((28P) obj).A00 = 0;
        ((28P) obj).A0B = false;
        ((28P) obj).A0A = false;
        ((28P) obj).A0C = false;
        return obj;
    }

    public 24S A0F(24S r302, Class cls) {
        if (r302._class != cls) {
            r302 = this._config._base._typeFactory.A06(r302, cls, true);
        }
        return r302;
    }

    public JsonSerializer A0G(68U r302, 24S r303) {
        JsonSerializer A00 = this._knownSerializers.A00(r303);
        if (A00 == null) {
            A00 = this._serializerCache.A00(r303);
            if (A00 == null) {
                A00 = A03(r303);
                if (A00 == null) {
                    return A0T(r303._class);
                }
            }
        }
        return A0K(r302, A00);
    }

    public JsonSerializer A0H(68U r302, 24S r303) {
        Object A04 = this._serializerFactory.A04(r303, this._keySerializer, this);
        if (A04 instanceof C43M) {
            ((C43M) A04).Chu(this);
        }
        return A0K(r302, (JsonSerializer) A04);
    }

    public JsonSerializer A0I(68U r302, 24S r303) {
        JsonSerializer A00 = this._knownSerializers.A00(r303);
        if (A00 == null) {
            A00 = this._serializerCache.A00(r303);
            if (A00 == null) {
                A00 = A03(r303);
                if (A00 == null) {
                    A00 = A0T(r303._class);
                    return A00;
                }
            }
        }
        if (A00 instanceof C27r) {
            return ((C27r) A00).AJN(r302, this);
        }
        return A00;
    }

    public JsonSerializer A0J(68U r302, 24S r303) {
        if (r303 == null) {
            throw new C2cb(((C26a) this).A00, "Null passed for `valueType` of `findValueSerializer()`", null);
        }
        JsonSerializer A00 = this._knownSerializers.A00(r303);
        if (A00 == null) {
            A00 = this._serializerCache.A00(r303);
            if (A00 == null) {
                A00 = A03(r303);
                if (A00 == null) {
                    return A0T(r303._class);
                }
            }
        }
        return A0K(r302, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer A0K(68U r302, JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = jsonSerializer;
        if (jsonSerializer != 0) {
            boolean z = jsonSerializer instanceof C27r;
            jsonSerializer2 = jsonSerializer;
            if (z) {
                jsonSerializer2 = ((C27r) jsonSerializer).AJN(r302, this);
            }
        }
        return jsonSerializer2;
    }

    public JsonSerializer A0L(68U r302, Class cls) {
        JsonSerializer A012 = this._knownSerializers.A01(cls);
        if (A012 == null) {
            A012 = this._serializerCache.A01(cls);
            if (A012 == null) {
                A012 = this._serializerCache.A00(1BK.A0Y(this._config, cls));
                if (A012 == null) {
                    A012 = A04(cls);
                    if (A012 == null) {
                        return A0T(cls);
                    }
                }
            }
        }
        return A0K(r302, A012);
    }

    public JsonSerializer A0M(68U r302, Class cls) {
        JsonSerializer A012 = this._knownSerializers.A01(cls);
        if (A012 == null) {
            A012 = this._serializerCache.A01(cls);
            if (A012 == null) {
                A012 = this._serializerCache.A00(1BK.A0Y(this._config, cls));
                if (A012 == null) {
                    A012 = A04(cls);
                    if (A012 == null) {
                        A012 = A0T(cls);
                        return A012;
                    }
                }
            }
        }
        if (A012 instanceof C27r) {
            return ((C27r) A012).AJN(r302, this);
        }
        return A012;
    }

    public JsonSerializer A0N(68U r302, Class cls) {
        JsonSerializer A012 = this._knownSerializers.A01(cls);
        if (A012 == null) {
            A012 = this._serializerCache.A01(cls);
            if (A012 == null) {
                A012 = this._serializerCache.A00(this._config._base._typeFactory.A09(cls));
                if (A012 == null) {
                    A012 = A04(cls);
                    if (A012 == null) {
                        return A0T(cls);
                    }
                }
            }
        }
        return A0K(r302, A012);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r307 = (com.fasterxml.jackson.databind.JsonSerializer) r0.A00.get(new X.C43J(r303, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r307 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        r305 = A0N(null, r303);
        r0 = r301._serializerFactory;
        r0 = r301._config;
        r0 = r0.A06(r0._base._typeFactory.A09(r303), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        r305 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(r305, r0.A04(null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        r0 = r301._serializerCache;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0033, code lost:
    
        if (r310 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        if (r0.A00.put(new X.C43J(r303, true), r305) != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0127, code lost:
    
        r0.A01.set(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012d, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0130, code lost:
    
        return r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0036, code lost:
    
        r0 = r301._serializerCache;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        return r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003e, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
    
        if (r310.A03 != r303) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
    
        r310 = r310.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (r310 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e8, code lost:
    
        if (r310.A04 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        r307 = r310.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f4, code lost:
    
        if (r307 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer A0O(X.68U r302, java.lang.Class r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26c.A0O(X.68U, java.lang.Class, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        r309 = (com.fasterxml.jackson.databind.JsonSerializer) r0.A00.get(new X.C43J(r302, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r309 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r303 = A0J(null, r302);
        r0 = r301._serializerFactory.A06(r302, r301._config);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        r303 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(r303, r0.A04(null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        r0 = r301._serializerCache;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0028, code lost:
    
        if (r307 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        if (r0.A00.put(new X.C43J(r302, true), r303) != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0108, code lost:
    
        r0.A01.set(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        return r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002b, code lost:
    
        r0 = r301._serializerCache;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
    
        return r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
    
        if (r307.A04 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        r307 = r307.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ac, code lost:
    
        if (r307 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
    
        if (r302.equals(r307.A00) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
    
        r309 = r307.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d8, code lost:
    
        if (r309 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer A0P(X.24S r302) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26c.A0P(X.24S):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public JsonSerializer A0Q(24S r302) {
        JsonSerializer A00 = this._knownSerializers.A00(r302);
        if (A00 == null) {
            A00 = this._serializerCache.A00(r302);
            if (A00 == null) {
                A00 = A03(r302);
                if (A00 == null) {
                    A00 = A0T(r302._class);
                }
            }
        }
        return A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v2 */
    public JsonSerializer A0R(C24r c24r, Object obj) {
        JsonSerializer jsonSerializer;
        24S A03;
        StringBuilder A0k;
        String str;
        JsonSerializer jsonSerializer2 = null;
        if (!(obj instanceof JsonSerializer)) {
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                jsonSerializer = jsonSerializer2;
                if (cls != JsonSerializer.None.class) {
                    jsonSerializer = jsonSerializer2;
                    if (!27C.A0J(cls)) {
                        if (JsonSerializer.class.isAssignableFrom(cls)) {
                            obj = 27C.A03(cls, this._config.A07());
                        } else {
                            A03 = c24r.A03();
                            A0k = AnonymousClass001.A0k();
                            1BL.A1C(cls, "AnnotationIntrospector returned Class ", A0k);
                            str = "; expected Class<JsonSerializer>";
                        }
                    }
                }
                return jsonSerializer;
            }
            A03 = c24r.A03();
            A0k = AnonymousClass001.A0k();
            A0k.append("AnnotationIntrospector returned serializer definition of type ");
            A0k.append(AnonymousClass001.A0Y(obj));
            str = "; expected type JsonSerializer or Class<JsonSerializer> instead";
            A0D(A03, AnonymousClass001.A0d(str, A0k));
            throw 0Q8.createAndThrow();
        }
        ?? r304 = (JsonSerializer) obj;
        boolean z = r304 instanceof C43M;
        jsonSerializer = r304;
        if (z) {
            ((C43M) r304).Chu(this);
            jsonSerializer = r304;
        }
        return jsonSerializer;
    }

    public JsonSerializer A0S(Class cls) {
        JsonSerializer A012 = this._knownSerializers.A01(cls);
        if (A012 == null) {
            A012 = this._serializerCache.A01(cls);
            if (A012 == null) {
                A012 = this._serializerCache.A00(1BK.A0Y(this._config, cls));
                if (A012 == null) {
                    A012 = A04(cls);
                    if (A012 == null) {
                        A012 = A0T(cls);
                    }
                }
            }
        }
        return A012;
    }

    public JsonSerializer A0T(Class cls) {
        return cls == Object.class ? this._unknownTypeSerializer : new StdSerializer(cls, false);
    }

    public Krb A0U(3eQ r302, Object obj) {
        C26a c26a = (C26a) this;
        java.util.Map map = c26a.A02;
        if (map == null) {
            c26a.A02 = c26a._config.A0G(26D.A08) ? AnonymousClass001.A0u() : new IdentityHashMap();
        } else {
            Krb krb = (Krb) map.get(obj);
            if (krb != null) {
                return krb;
            }
        }
        ArrayList arrayList = c26a.A01;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0t(8);
            c26a.A01 = arrayList;
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                3eQ r0 = (3eQ) arrayList.get(i);
                if (r0.A02(r302)) {
                    r302 = r0;
                    break;
                }
            }
        }
        arrayList.add(r302);
        Krb krb2 = new Krb(r302);
        c26a.A02.put(obj, krb2);
        return krb2;
    }

    public Object A0V(Class cls) {
        Object obj = null;
        if (cls != null) {
            obj = 1BK.A0q(this._config, cls);
        }
        return obj;
    }

    public final void A0W(28Q r302) {
        if (this._stdNullValueSerializer) {
            r302.A0Z();
        } else {
            this._nullValueSerializer.A0A(r302, this, null);
        }
    }

    public final void A0X(28Q r302, Object obj, String str) {
        r302.A0o(str);
        if (obj != null) {
            A0O(null, obj.getClass(), true).A0A(r302, this, obj);
        } else if (this._stdNullValueSerializer) {
            r302.A0Z();
        } else {
            this._nullValueSerializer.A0A(r302, this, null);
        }
    }

    public void A0Y(24S r302, Object obj) {
        if (r302._class.isPrimitive() && 27C.A02(r302._class).isAssignableFrom(obj.getClass())) {
            return;
        }
        A0D(r302, String.format("Incompatible types: declared root type (%s) vs %s", r302, 27C.A07(obj)));
        throw 0Q8.createAndThrow();
    }

    public boolean A0Z(Object obj) {
        C26a c26a = (C26a) this;
        try {
            return obj.equals(null);
        } catch (Throwable th) {
            Class<?> cls = obj.getClass();
            3Af r0 = new 3Af(c26a.A00, c26a.A0A().A09(cls), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", cls.getName(), AnonymousClass001.A0Y(th), 27C.A09(th)));
            r0.initCause(th);
            throw r0;
        }
    }
}
