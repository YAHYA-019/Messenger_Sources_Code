package com.facebook.messaging.database.threads;

import X.0RF;
import X.0fH;
import X.3A8;
import X.3zF;
import X.4xA;
import X.AnonymousClass001;
import X.C00j;
import X.C10654u8;
import X.C15h;
import X.Km0;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.SecureContentDelegateDI;

/* loaded from: MessagesDbContentProvider.class */
public class MessagesDbContentProvider extends 0RF {

    /* loaded from: MessagesDbContentProvider$Impl.class */
    public class Impl extends SecureContentDelegateDI {
        public 3zF A00;
        public C15h A01;
        public C15h A02;
        public C15h A03;
        public C15h A04;

        public Impl(0RF r302) {
            super(r302);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            if (!((Km0) this.A01.get()).A02.equals(uri)) {
                throw AnonymousClass001.A0p();
            }
            if (((C10654u8) this.A03.get()).A00 instanceof 3A8) {
                return 0;
            }
            ((C10654u8) this.A03.get()).A00.AFH();
            return 0;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            C00j.A05("MessagesDbContentProvider.doQuery", 1812944643);
            try {
                Cursor A04 = this.A00.A00(uri).A04(uri, strArr, str, strArr2, str2);
                0fH.A0g(Long.valueOf(C00j.A00(-2003099492)), "MessagesDbContentProvider", "MessagesDbContentProvider.doQuery took %d ms");
                return A04;
            } catch (Throwable th) {
                0fH.A0g(Long.valueOf(C00j.A00(-514915630)), "MessagesDbContentProvider", "MessagesDbContentProvider.doQuery took %d ms");
                throw th;
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            synchronized (this) {
                C00j.A05("MessagesDbContentProvider.onInitialize", -1079197730);
                try {
                    final int i = 0;
                    C15h c15h = new C15h(this, i) { // from class: X.4Xk
                        public final int A00;
                        public final Object A01;

                        {
                            this.A00 = i;
                            this.A01 = this;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
                        
                            if (r306 != null) goto L11;
                         */
                        @Override // X.C15h
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public /* bridge */ /* synthetic */ java.lang.Object get() {
                            /*
                                r301 = this;
                                r0 = r301
                                int r0 = r0.A00
                                r302 = r0
                                r0 = r302
                                switch(r0) {
                                    case 0: goto L95;
                                    case 1: goto L9b;
                                    case 2: goto La1;
                                    default: goto L20;
                                }
                            L20:
                                r0 = 49425(0xc111, float:6.9259E-41)
                                r303 = r0
                            L23:
                                r0 = r301
                                java.lang.Object r0 = r0.A01
                                com.facebook.messaging.database.threads.MessagesDbContentProvider$Impl r0 = (com.facebook.messaging.database.threads.MessagesDbContentProvider.Impl) r0
                                r304 = r0
                                r0 = r304
                                X.0RF r0 = r0.A00
                                r305 = r0
                                r0 = r305
                                android.content.Context r0 = r0.getContext()
                                r306 = r0
                                r0 = r306
                                if (r0 == 0) goto L8d
                                r0 = 83428(0x145e4, float:1.16908E-40)
                                r302 = r0
                                r0 = r306
                                r1 = r302
                                java.lang.Object r0 = X.1Hv.A02(r0, r1)
                                X.1EZ r0 = (X.1EZ) r0
                                r304 = r0
                                r0 = r304
                                com.facebook.auth.viewercontext.ViewerContext r0 = r0.BKF()
                                r306 = r0
                                r0 = r306
                                if (r0 != 0) goto L64
                                r0 = r304
                                com.facebook.auth.viewercontext.ViewerContext r0 = r0.B0c()
                                r306 = r0
                                r0 = r306
                                if (r0 == 0) goto L8d
                            L64:
                                r0 = r306
                                java.lang.String r0 = r0.mUserId
                                r304 = r0
                                r0 = r304
                                if (r0 == 0) goto L8d
                                r0 = 66351(0x1032f, float:9.2978E-41)
                                r302 = r0
                                r0 = r302
                                java.lang.Object r0 = X.1Bi.A03(r0)
                                X.1Fv r0 = (X.1Fv) r0
                                r304 = r0
                                r0 = r304
                                r1 = r306
                                com.facebook.auth.usersession.FbUserSession r0 = r0.A08(r1)
                                r306 = r0
                            L81:
                                r0 = r305
                                android.content.Context r0 = r0.getContext()
                                r1 = r306
                                r2 = r303
                                java.lang.Object r0 = X.1Lo.A03(r0, r1, r2)
                                return r0
                            L8d:
                                com.facebook.auth.usersession.FbUserSession r0 = com.facebook.auth.usersession.FbUserSession.A01
                                r306 = r0
                                goto L81
                            L95:
                                r0 = 131319(0x200f7, float:1.84017E-40)
                                r303 = r0
                                goto L23
                            L9b:
                                r0 = 49346(0xc0c2, float:6.9148E-41)
                                r303 = r0
                                goto L23
                            La1:
                                r0 = 84776(0x14b28, float:1.18796E-40)
                                r303 = r0
                                goto L23
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C4Xk.get():java.lang.Object");
                        }
                    };
                    this.A01 = c15h;
                    final int i2 = 1;
                    this.A03 = new C15h(this, i2) { // from class: X.4Xk
                        public final int A00;
                        public final Object A01;

                        {
                            this.A00 = i2;
                            this.A01 = this;
                        }

                        @Override // X.C15h
                        public /* bridge */ /* synthetic */ Object get() {
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
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
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:819)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:487)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:240)
                                	at jadx.core.dex.regions.SynchronizedRegion.generate(SynchronizedRegion.java:44)
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
                                */
                            /*
                                this = this;
                                r0 = r301
                                int r0 = r0.A00
                                r302 = r0
                                r0 = r302
                                switch(r0) {
                                    case 0: goto L95;
                                    case 1: goto L9b;
                                    case 2: goto La1;
                                    default: goto L20;
                                }
                            L20:
                                r0 = 49425(0xc111, float:6.9259E-41)
                                r303 = r0
                            L23:
                                r0 = r301
                                java.lang.Object r0 = r0.A01
                                com.facebook.messaging.database.threads.MessagesDbContentProvider$Impl r0 = (com.facebook.messaging.database.threads.MessagesDbContentProvider.Impl) r0
                                r304 = r0
                                r0 = r304
                                X.0RF r0 = r0.A00
                                r305 = r0
                                r0 = r305
                                android.content.Context r0 = r0.getContext()
                                r306 = r0
                                r0 = r306
                                if (r0 == 0) goto L8d
                                r0 = 83428(0x145e4, float:1.16908E-40)
                                r302 = r0
                                r0 = r306
                                r1 = r302
                                java.lang.Object r0 = X.1Hv.A02(r0, r1)
                                X.1EZ r0 = (X.1EZ) r0
                                r304 = r0
                                r0 = r304
                                com.facebook.auth.viewercontext.ViewerContext r0 = r0.BKF()
                                r306 = r0
                                r0 = r306
                                if (r0 != 0) goto L64
                                r0 = r304
                                com.facebook.auth.viewercontext.ViewerContext r0 = r0.B0c()
                                r306 = r0
                                r0 = r306
                                if (r0 == 0) goto L8d
                            L64:
                                r0 = r306
                                java.lang.String r0 = r0.mUserId
                                r304 = r0
                                r0 = r304
                                if (r0 == 0) goto L8d
                                r0 = 66351(0x1032f, float:9.2978E-41)
                                r302 = r0
                                r0 = r302
                                java.lang.Object r0 = X.1Bi.A03(r0)
                                X.1Fv r0 = (X.1Fv) r0
                                r304 = r0
                                r0 = r304
                                r1 = r306
                                com.facebook.auth.usersession.FbUserSession r0 = r0.A08(r1)
                                r306 = r0
                            L81:
                                r0 = r305
                                android.content.Context r0 = r0.getContext()
                                r1 = r306
                                r2 = r303
                                java.lang.Object r0 = X.1Lo.A03(r0, r1, r2)
                                return r0
                            L8d:
                                com.facebook.auth.usersession.FbUserSession r0 = com.facebook.auth.usersession.FbUserSession.A01
                                r306 = r0
                                goto L81
                            L95:
                                r0 = 131319(0x200f7, float:1.84017E-40)
                                r303 = r0
                                goto L23
                            L9b:
                                r0 = 49346(0xc0c2, float:6.9148E-41)
                                r303 = r0
                                goto L23
                            La1:
                                r0 = 84776(0x14b28, float:1.18796E-40)
                                r303 = r0
                                goto L23
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C4Xk.get():java.lang.Object");
                        }
                    };
                    final int i3 = 2;
                    this.A04 = new C15h(this, i3) { // from class: X.4Xk
                        public final int A00;
                        public final Object A01;

                        {
                            this.A00 = i3;
                            this.A01 = this;
                        }

                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
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
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:819)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:487)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:240)
                            	at jadx.core.dex.regions.SynchronizedRegion.generate(SynchronizedRegion.java:44)
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
                            */
                        @Override // X.C15h
                        public /* bridge */ /* synthetic */ java.lang.Object get() {
                            /*
                                r301 = this;
                                r0 = r301
                                int r0 = r0.A00
                                r302 = r0
                                r0 = r302
                                switch(r0) {
                                    case 0: goto L95;
                                    case 1: goto L9b;
                                    case 2: goto La1;
                                    default: goto L20;
                                }
                            L20:
                                r0 = 49425(0xc111, float:6.9259E-41)
                                r303 = r0
                            L23:
                                r0 = r301
                                java.lang.Object r0 = r0.A01
                                com.facebook.messaging.database.threads.MessagesDbContentProvider$Impl r0 = (com.facebook.messaging.database.threads.MessagesDbContentProvider.Impl) r0
                                r304 = r0
                                r0 = r304
                                X.0RF r0 = r0.A00
                                r305 = r0
                                r0 = r305
                                android.content.Context r0 = r0.getContext()
                                r306 = r0
                                r0 = r306
                                if (r0 == 0) goto L8d
                                r0 = 83428(0x145e4, float:1.16908E-40)
                                r302 = r0
                                r0 = r306
                                r1 = r302
                                java.lang.Object r0 = X.1Hv.A02(r0, r1)
                                X.1EZ r0 = (X.1EZ) r0
                                r304 = r0
                                r0 = r304
                                com.facebook.auth.viewercontext.ViewerContext r0 = r0.BKF()
                                r306 = r0
                                r0 = r306
                                if (r0 != 0) goto L64
                                r0 = r304
                                com.facebook.auth.viewercontext.ViewerContext r0 = r0.B0c()
                                r306 = r0
                                r0 = r306
                                if (r0 == 0) goto L8d
                            L64:
                                r0 = r306
                                java.lang.String r0 = r0.mUserId
                                r304 = r0
                                r0 = r304
                                if (r0 == 0) goto L8d
                                r0 = 66351(0x1032f, float:9.2978E-41)
                                r302 = r0
                                r0 = r302
                                java.lang.Object r0 = X.1Bi.A03(r0)
                                X.1Fv r0 = (X.1Fv) r0
                                r304 = r0
                                r0 = r304
                                r1 = r306
                                com.facebook.auth.usersession.FbUserSession r0 = r0.A08(r1)
                                r306 = r0
                            L81:
                                r0 = r305
                                android.content.Context r0 = r0.getContext()
                                r1 = r306
                                r2 = r303
                                java.lang.Object r0 = X.1Lo.A03(r0, r1, r2)
                                return r0
                            L8d:
                                com.facebook.auth.usersession.FbUserSession r0 = com.facebook.auth.usersession.FbUserSession.A01
                                r306 = r0
                                goto L81
                            L95:
                                r0 = 131319(0x200f7, float:1.84017E-40)
                                r303 = r0
                                goto L23
                            L9b:
                                r0 = 49346(0xc0c2, float:6.9148E-41)
                                r303 = r0
                                goto L23
                            La1:
                                r0 = 84776(0x14b28, float:1.18796E-40)
                                r303 = r0
                                goto L23
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C4Xk.get():java.lang.Object");
                        }
                    };
                    final int i4 = 3;
                    this.A02 = new C15h(this, i4) { // from class: X.4Xk
                        public final int A00;
                        public final Object A01;

                        {
                            this.A00 = i4;
                            this.A01 = this;
                        }

                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
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
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:819)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:487)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:240)
                            	at jadx.core.dex.regions.SynchronizedRegion.generate(SynchronizedRegion.java:44)
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
                            */
                        @Override // X.C15h
                        public /* bridge */ /* synthetic */ java.lang.Object get() {
                            /*
                                r301 = this;
                                r0 = r301
                                int r0 = r0.A00
                                r302 = r0
                                r0 = r302
                                switch(r0) {
                                    case 0: goto L95;
                                    case 1: goto L9b;
                                    case 2: goto La1;
                                    default: goto L20;
                                }
                            L20:
                                r0 = 49425(0xc111, float:6.9259E-41)
                                r303 = r0
                            L23:
                                r0 = r301
                                java.lang.Object r0 = r0.A01
                                com.facebook.messaging.database.threads.MessagesDbContentProvider$Impl r0 = (com.facebook.messaging.database.threads.MessagesDbContentProvider.Impl) r0
                                r304 = r0
                                r0 = r304
                                X.0RF r0 = r0.A00
                                r305 = r0
                                r0 = r305
                                android.content.Context r0 = r0.getContext()
                                r306 = r0
                                r0 = r306
                                if (r0 == 0) goto L8d
                                r0 = 83428(0x145e4, float:1.16908E-40)
                                r302 = r0
                                r0 = r306
                                r1 = r302
                                java.lang.Object r0 = X.1Hv.A02(r0, r1)
                                X.1EZ r0 = (X.1EZ) r0
                                r304 = r0
                                r0 = r304
                                com.facebook.auth.viewercontext.ViewerContext r0 = r0.BKF()
                                r306 = r0
                                r0 = r306
                                if (r0 != 0) goto L64
                                r0 = r304
                                com.facebook.auth.viewercontext.ViewerContext r0 = r0.B0c()
                                r306 = r0
                                r0 = r306
                                if (r0 == 0) goto L8d
                            L64:
                                r0 = r306
                                java.lang.String r0 = r0.mUserId
                                r304 = r0
                                r0 = r304
                                if (r0 == 0) goto L8d
                                r0 = 66351(0x1032f, float:9.2978E-41)
                                r302 = r0
                                r0 = r302
                                java.lang.Object r0 = X.1Bi.A03(r0)
                                X.1Fv r0 = (X.1Fv) r0
                                r304 = r0
                                r0 = r304
                                r1 = r306
                                com.facebook.auth.usersession.FbUserSession r0 = r0.A08(r1)
                                r306 = r0
                            L81:
                                r0 = r305
                                android.content.Context r0 = r0.getContext()
                                r1 = r306
                                r2 = r303
                                java.lang.Object r0 = X.1Lo.A03(r0, r1, r2)
                                return r0
                            L8d:
                                com.facebook.auth.usersession.FbUserSession r0 = com.facebook.auth.usersession.FbUserSession.A01
                                r306 = r0
                                goto L81
                            L95:
                                r0 = 131319(0x200f7, float:1.84017E-40)
                                r303 = r0
                                goto L23
                            L9b:
                                r0 = 49346(0xc0c2, float:6.9148E-41)
                                r303 = r0
                                goto L23
                            La1:
                                r0 = 84776(0x14b28, float:1.18796E-40)
                                r303 = r0
                                goto L23
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C4Xk.get():java.lang.Object");
                        }
                    };
                    Km0 km0 = (Km0) c15h.get();
                    3zF r0 = new 3zF();
                    this.A00 = r0;
                    String str = km0.A05;
                    final C15h c15h2 = this.A04;
                    r0.A01(new 4xA(c15h2) { // from class: X.4Pr
                        public final C15h A00;

                        {
                            this.A00 = c15h2;
                        }

                        public Cursor A04(Uri uri, String[] strArr, String str2, String[] strArr2, String str3) {
                            return ((4xA) this.A00.get()).A04(uri, strArr, str2, strArr2, str3);
                        }
                    }, str, "thread_summaries");
                    3zF r02 = this.A00;
                    final C15h c15h3 = this.A02;
                    r02.A01(new 4xA(c15h3) { // from class: X.4Pr
                        public final C15h A00;

                        {
                            this.A00 = c15h3;
                        }

                        public Cursor A04(Uri uri, String[] strArr, String str2, String[] strArr2, String str3) {
                            return ((4xA) this.A00.get()).A04(uri, strArr, str2, strArr2, str3);
                        }
                    }, str, "messages");
                    C00j.A01(1360829777);
                } catch (Throwable th) {
                    C00j.A01(-2046991514);
                    throw th;
                }
            }
        }
    }
}
