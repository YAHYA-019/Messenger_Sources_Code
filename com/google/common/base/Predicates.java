package com.google.common.base;

import X.0Pz;
import X.4YV;
import X.AnonymousClass001;
import X.JQy;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: Predicates.class */
public abstract class Predicates {

    /* loaded from: Predicates$AndPredicate.class */
    public class AndPredicate implements Predicate, Serializable {
        public static final long serialVersionUID = 0;
        public final List components;

        public AndPredicate(List list) {
            this.components = list;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            boolean z = false;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.components.size()) {
                    z = true;
                    break;
                }
                if (!((Predicate) this.components.get(i2)).apply(obj)) {
                    break;
                }
                i = i2 + 1;
            }
            return z;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            List list = this.components;
            StringBuilder A0o = AnonymousClass001.A0o("Predicates.");
            A0o.append("and");
            A0o.append('(');
            boolean z = true;
            for (Object obj : list) {
                if (!z) {
                    A0o.append(',');
                }
                A0o.append(obj);
                z = false;
            }
            return 4YV.A0x(A0o);
        }
    }

    /* loaded from: Predicates$CompositionPredicate.class */
    public class CompositionPredicate implements Predicate, Serializable {
        public static final long serialVersionUID = 0;
        public final Function f;
        public final Predicate p;

        public CompositionPredicate(Predicate predicate, Function function) {
            this.p = predicate;
            this.f = function;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return this.p.apply(this.f.apply(obj));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.f.equals(compositionPredicate.f) && this.p.equals(compositionPredicate.p)) {
                    z = true;
                }
            }
            return z;
        }

        public int hashCode() {
            return this.f.hashCode() ^ this.p.hashCode();
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(this.p);
            A0k.append("(");
            A0k.append(this.f);
            return AnonymousClass001.A0d(")", A0k);
        }
    }

    /* loaded from: Predicates$InPredicate.class */
    public class InPredicate implements Predicate, Serializable {
        public static final long serialVersionUID = 0;
        public final Collection target;

        public InPredicate(Collection collection) {
            collection.getClass();
            this.target = collection;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            try {
                return this.target.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.target.equals(((InPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Predicates.in(");
            return JQy.A0r(this.target, A0k);
        }
    }

    /* loaded from: Predicates$InstanceOfPredicate.class */
    public class InstanceOfPredicate implements Predicate, Serializable {
        public static final long serialVersionUID = 0;
        public final Class clazz;

        public InstanceOfPredicate(Class cls) {
            this.clazz = cls;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return this.clazz.isInstance(obj);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            boolean z = false;
            if ((obj instanceof InstanceOfPredicate) && this.clazz == ((InstanceOfPredicate) obj).clazz) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            return 0Pz.A0j("Predicates.instanceOf(", this.clazz.getName(), ")");
        }
    }

    /* loaded from: Predicates$IsEqualToPredicate.class */
    public class IsEqualToPredicate implements Predicate, Serializable {
        public static final long serialVersionUID = 0;
        public final Object target;

        public IsEqualToPredicate(Object obj) {
            this.target = obj;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return this.target.equals(obj);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Predicates.equalTo(");
            return JQy.A0r(this.target, A0k);
        }
    }

    /* loaded from: Predicates$NotPredicate.class */
    public class NotPredicate implements Predicate, Serializable {
        public static final long serialVersionUID = 0;
        public final Predicate predicate;

        public NotPredicate(Predicate predicate) {
            this.predicate = predicate;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return !this.predicate.apply(obj);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return this.predicate.hashCode() ^ (-1);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Predicates.not(");
            return JQy.A0r(this.predicate, A0k);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALWAYS_TRUE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: Predicates$ObjectPredicate.class */
    public abstract class ObjectPredicate implements Predicate {
        public static final /* synthetic */ ObjectPredicate[] $VALUES;
        public static final ObjectPredicate ALWAYS_FALSE;
        public static final ObjectPredicate ALWAYS_TRUE;
        public static final ObjectPredicate IS_NULL;
        public static final ObjectPredicate NOT_NULL;

        static {
            final String str = "ALWAYS_TRUE";
            final int i = 0;
            final int i2 = 0;
            ObjectPredicate objectPredicate = new ObjectPredicate(str, i, i2) { // from class: X.308
                public final int A00;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    /*
                        r301 = this;
                        r0 = r301
                        r1 = r304
                        r0.A00 = r1
                        r0 = r304
                        switch(r0) {
                            case 0: goto L30;
                            case 1: goto L3a;
                            case 2: goto L44;
                            default: goto L20;
                        }
                    L20:
                        java.lang.String r0 = "NOT_NULL"
                        r305 = r0
                        r0 = 3
                        r306 = r0
                    L27:
                        r0 = r301
                        r1 = r305
                        r2 = r306
                        r0.<init>(r1, r2)
                        return
                    L30:
                        java.lang.String r0 = "ALWAYS_TRUE"
                        r305 = r0
                        r0 = 0
                        r306 = r0
                        goto L27
                    L3a:
                        java.lang.String r0 = "ALWAYS_FALSE"
                        r305 = r0
                        r0 = 1
                        r306 = r0
                        goto L27
                    L44:
                        java.lang.String r0 = "IS_NULL"
                        r305 = r0
                        r0 = 2
                        r306 = r0
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass308.<init>(java.lang.String, int, int):void");
                }

                @Override // com.google.common.base.Predicate
                public boolean apply(Object obj) {
                    switch (this.A00) {
                        case 0:
                            return true;
                        case 1:
                            return false;
                        case 2:
                            return obj == null;
                        default:
                            return obj != null;
                    }
                }

                @Override // java.lang.Enum
                public String toString() {
                    switch (this.A00) {
                        case 0:
                            return "Predicates.alwaysTrue()";
                        case 1:
                            return "Predicates.alwaysFalse()";
                        case 2:
                            return "Predicates.isNull()";
                        default:
                            return "Predicates.notNull()";
                    }
                }
            };
            ALWAYS_TRUE = objectPredicate;
            final int i3 = 1;
            final String str2 = "ALWAYS_FALSE";
            ObjectPredicate anonymousClass308 = new ObjectPredicate
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR (r0v4 'anonymousClass308' com.google.common.base.Predicates$ObjectPredicate) = (r1v1 'str2' java.lang.String A[DONT_INLINE]), (r0v3 'i3' int A[DONT_INLINE]), (r0v3 'i3' int A[DONT_INLINE]) A[DECLARE_VAR, MD:(java.lang.String, int, int):void (m)] call: X.308.<init>(java.lang.String, int, int):void type: CONSTRUCTOR in method: com.google.common.base.Predicates.ObjectPredicate.<clinit>():void, file: Predicates$ObjectPredicate.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
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
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
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
                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:810)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 52 more
                */
            /*
                X.308 r0 = new X.308
                r301 = r0
                r0 = r301
                java.lang.String r1 = "ALWAYS_TRUE"
                r2 = 0
                r3 = 0
                r0.<init>(r1, r2, r3)
                r0 = r301
                com.google.common.base.Predicates.ObjectPredicate.ALWAYS_TRUE = r0
                r0 = 1
                r302 = r0
                X.308 r0 = new X.308
                r303 = r0
                r0 = r303
                java.lang.String r1 = "ALWAYS_FALSE"
                r2 = r302
                r3 = r302
                r0.<init>(r1, r2, r3)
                r0 = r303
                com.google.common.base.Predicates.ObjectPredicate.ALWAYS_FALSE = r0
                r0 = 2
                r302 = r0
                X.308 r0 = new X.308
                r304 = r0
                r0 = r304
                java.lang.String r1 = "IS_NULL"
                r2 = r302
                r3 = r302
                r0.<init>(r1, r2, r3)
                r0 = r304
                com.google.common.base.Predicates.ObjectPredicate.IS_NULL = r0
                r0 = 3
                r305 = r0
                X.308 r0 = new X.308
                r306 = r0
                r0 = r306
                java.lang.String r1 = "NOT_NULL"
                r2 = r305
                r3 = r305
                r0.<init>(r1, r2, r3)
                r0 = r306
                com.google.common.base.Predicates.ObjectPredicate.NOT_NULL = r0
                r0 = 4
                com.google.common.base.Predicates$ObjectPredicate[] r0 = new com.google.common.base.Predicates.ObjectPredicate[r0]
                r1 = r0
                r2 = r0; r3 = r1; 
                r4 = 0
                r5 = r301
                r3[r4] = r5
                r3 = 1
                r4 = r303
                r2[r3] = r4
                r2 = 2
                r3 = r304
                r1[r2] = r3
                r1 = r0
                r2 = 3
                r3 = r306
                r1[r2] = r3
                com.google.common.base.Predicates.ObjectPredicate.$VALUES = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Predicates.ObjectPredicate.m10995clinit():void");
        }

        public ObjectPredicate(String str, int i) {
        }
    }

    public static Predicate and(Predicate predicate, Predicate predicate2) {
        predicate.getClass();
        predicate2.getClass();
        return new AndPredicate(Arrays.asList(predicate, predicate2));
    }
}
