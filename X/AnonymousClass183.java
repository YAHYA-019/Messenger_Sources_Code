package X;

import java.util.HashSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.183, reason: invalid class name */
/* loaded from: 183.class */
public class AnonymousClass183 {
    public static final /* synthetic */ AnonymousClass183[] A00;
    public static final AnonymousClass183 A01;
    public static final AnonymousClass183 A02;
    public static final AnonymousClass183 A03;
    public static final AnonymousClass183 A04;
    public static final AnonymousClass183 A05;
    public static final AnonymousClass183 A06;
    public static final AnonymousClass183 A07;
    public static final AnonymousClass183 A08;
    public static final AnonymousClass183 A09;
    public static final AnonymousClass183 A0A;
    public static final AnonymousClass183 A0B;
    public static final AnonymousClass183 A0C;
    public static final AnonymousClass183 A0D;

    static {
        final int i = 4;
        AnonymousClass183 anonymousClass183 = new AnonymousClass183(i) { // from class: X.0tx
            public final int A00;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r301 = this;
                    r0 = r301
                    r1 = r302
                    r0.A00 = r1
                    r0 = r302
                    switch(r0) {
                        case 0: goto L51;
                        case 1: goto L5a;
                        case 2: goto L63;
                        case 3: goto L6c;
                        case 4: goto L75;
                        case 5: goto L7d;
                        case 6: goto L85;
                        case 7: goto L8d;
                        case 8: goto L95;
                        case 9: goto L9d;
                        case 10: goto La5;
                        case 11: goto Lae;
                        default: goto L44;
                    }
                L44:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_OXYGEN_PRELOADS_KEY"
                    r303 = r0
                    r0 = 8
                    r304 = r0
                L4a:
                    r0 = r301
                    r1 = r303
                    r2 = r304
                    r0.<init>(r1, r2)
                    return
                L51:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_PORTAL_PLATFORM_KEY"
                    r303 = r0
                    r0 = 9
                    r304 = r0
                    goto L4a
                L5a:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_ANY_PORTAL_KEY"
                    r303 = r0
                    r0 = 10
                    r304 = r0
                    goto L4a
                L63:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_PORTAL_INHOUSE_KEY"
                    r303 = r0
                    r0 = 11
                    r304 = r0
                    goto L4a
                L6c:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_ANY_MILAN_KEY"
                    r303 = r0
                    r0 = 12
                    r304 = r0
                    goto L4a
                L75:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_FB_INHOUSE_KEY"
                    r303 = r0
                    r0 = 0
                    r304 = r0
                    goto L4a
                L7d:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_FB_APP_KEY"
                    r303 = r0
                    r0 = 1
                    r304 = r0
                    goto L4a
                L85:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_FB_FAMILY_KEY"
                    r303 = r0
                    r0 = 2
                    r304 = r0
                    goto L4a
                L8d:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_FB_INHOUSE_OR_APP_OR_FAMILY_KEY"
                    r303 = r0
                    r0 = 3
                    r304 = r0
                    goto L4a
                L95:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_INSTAGRAM_KEY"
                    r303 = r0
                    r0 = 4
                    r304 = r0
                    goto L4a
                L9d:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_OCULUS_PLATFORM_APPS_KEY"
                    r303 = r0
                    r0 = 5
                    r304 = r0
                    goto L4a
                La5:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_OCULUS_STANDALONE_DEVICE_SYSTEM_KEY"
                    r303 = r0
                    r0 = 6
                    r304 = r0
                    goto L4a
                Lae:
                    java.lang.String r0 = "ANY_APP_SIGNED_WITH_WHATSAPP_KEY"
                    r303 = r0
                    r0 = 7
                    r304 = r0
                    goto L4a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0tx.<init>(int):void");
            }

            @Override // X.AnonymousClass183
            public 02Q A00() {
                return 02P.A03(C08u.A0q);
            }

            @Override // X.AnonymousClass183
            public 02Q A01() {
                return 02P.A03(new HashSet() { // from class: X.0vn
                    {
                        addAll(C08u.A0i);
                        addAll(C08u.A0q);
                    }
                });
            }
        };
        A05 = anonymousClass183;
        final int i2 = 5;
        AnonymousClass183 c0tx = new AnonymousClass183
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CONSTRUCTOR (r0v3 'c0tx' X.183) = (r1v1 'i2' int A[DONT_INLINE]) A[DECLARE_VAR, MD:(int):void (m)] call: X.0tx.<init>(int):void type: CONSTRUCTOR in method: X.183.<clinit>():void, file: 183.class
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
            	... 35 more
            */
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass183.m210clinit():void");
    }

    public AnonymousClass183(String str, int i) {
    }

    public static AnonymousClass183 valueOf(String str) {
        return (AnonymousClass183) Enum.valueOf(AnonymousClass183.class, str);
    }

    public static AnonymousClass183[] values() {
        return (AnonymousClass183[]) A00.clone();
    }

    public 02Q A00() {
        return 02P.A00();
    }

    public 02Q A01() {
        return 02P.A00();
    }
}
