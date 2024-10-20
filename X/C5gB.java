package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5gB, reason: invalid class name */
/* loaded from: 5gB.class */
public final class C5gB {
    public final java.util.Map A00;

    public C5gB() {
        5gE r0 = new 5gE() { // from class: X.5gD
            public final 5gF A00 = 5gF.A00;

            public void A6W(7eH r302, 5PP r303) {
                11T.A0F(r302, 0);
                11T.A0F(r303, 1);
                List list = (List) ((82X) r303).A01;
                JSONObject jSONObject = new JSONObject();
                ArrayList arrayList = new ArrayList(C1A3.A1D(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C82g) it.next()).A01));
                }
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next());
                    }
                    jSONObject.put("magic_word_lengths", jSONArray);
                } catch (JSONException unused) {
                }
                ArrayList arrayList2 = new ArrayList(C1A3.A1D(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C82g) it3.next()).A02));
                }
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        jSONArray2.put(it4.next());
                    }
                    jSONObject.put("magic_word_offsets", jSONArray2);
                } catch (JSONException unused2) {
                }
                ArrayList arrayList3 = new ArrayList(C1A3.A1D(list, 10));
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((C82g) it5.next()).A03);
                }
                try {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        jSONArray3.put(it6.next());
                    }
                    jSONObject.put("magic_word_emojis", jSONArray3);
                } catch (JSONException unused3) {
                }
                try {
                    r302.A00.put("word_effects", jSONObject);
                } catch (JSONException unused4) {
                }
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        };
        5gE r02 = new 5gE() { // from class: X.5gG
            public final C5gH A00 = C5gH.A00;

            public void A6W(7eH r302, 5PP r303) {
                C97e c97e;
                11T.A0H(r302, r303);
                5aU r03 = ((5vF) r303).A01;
                JSONObject A12 = AnonymousClass001.A12();
                11T.A0F(r03, 0);
                7mH r04 = 7mH.$redex_init_class;
                switch (r03.ordinal()) {
                    case 1:
                        c97e = C97e.LOVE;
                        break;
                    case 2:
                        c97e = C97e.GIFTWRAP;
                        break;
                    case 3:
                        c97e = C97e.CELEBRATION;
                        break;
                    case 4:
                        c97e = C97e.FIRE;
                        break;
                    case 5:
                    default:
                        c97e = C97e.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                        break;
                    case 6:
                        c97e = C97e.AVATAR_LOVE;
                        break;
                    case 7:
                        c97e = C97e.AVATAR_ANGRY;
                        break;
                    case 8:
                        c97e = C97e.AVATAR_LAUGH;
                        break;
                    case 9:
                        c97e = C97e.AVATAR_CRY;
                        break;
                }
                try {
                    A12.put("power_up_style", c97e.toString());
                } catch (JSONException unused) {
                }
                try {
                    r302.A00.put("power_up", A12);
                } catch (JSONException unused2) {
                }
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        };
        5gE r03 = new 5gE() { // from class: X.5gI
            public final C5gJ A00 = C5gJ.A00;

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x01ca
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                */
            /* JADX WARN: Multi-variable type inference failed */
            public void A6W(X.7eH r302, X.5PP r303) {
                /*
                    Method dump skipped, instructions count: 494
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5gI.A6W(X.7eH, X.5PP):void");
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        };
        A4t a4t = new A4t();
        C5gK c5gK = C5gK.A00;
        03Y r04 = new 03Y(5gC.class, C0s8.A14(r0, r02, r03, a4t, c5gK));
        03Y r05 = new 03Y(C5ft.class, C0s8.A14(new 5gE() { // from class: X.5gG
            public final C5gH A00 = C5gH.A00;

            public void A6W(7eH r302, 5PP r303) {
                C97e c97e;
                11T.A0H(r302, r303);
                5aU r032 = ((5vF) r303).A01;
                JSONObject A12 = AnonymousClass001.A12();
                11T.A0F(r032, 0);
                7mH r042 = 7mH.$redex_init_class;
                switch (r032.ordinal()) {
                    case 1:
                        c97e = C97e.LOVE;
                        break;
                    case 2:
                        c97e = C97e.GIFTWRAP;
                        break;
                    case 3:
                        c97e = C97e.CELEBRATION;
                        break;
                    case 4:
                        c97e = C97e.FIRE;
                        break;
                    case 5:
                    default:
                        c97e = C97e.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                        break;
                    case 6:
                        c97e = C97e.AVATAR_LOVE;
                        break;
                    case 7:
                        c97e = C97e.AVATAR_ANGRY;
                        break;
                    case 8:
                        c97e = C97e.AVATAR_LAUGH;
                        break;
                    case 9:
                        c97e = C97e.AVATAR_CRY;
                        break;
                }
                try {
                    A12.put("power_up_style", c97e.toString());
                } catch (JSONException unused) {
                }
                try {
                    r302.A00.put("power_up", A12);
                } catch (JSONException unused2) {
                }
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        }, new 5gM(), new 5gE() { // from class: X.5gO
            public final C5g2 A00 = C5g2.A00;

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
            
                if (r306 == null) goto L55;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A6W(X.7eH r302, X.5PP r303) {
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5gO.A6W(X.7eH, X.5PP):void");
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        }, new 5gE() { // from class: X.5gI
            public final C5gJ A00 = C5gJ.A00;

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x01ca
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                */
            public void A6W(X.7eH r302, X.5PP r303) {
                /*
                    Method dump skipped, instructions count: 494
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5gI.A6W(X.7eH, X.5PP):void");
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        }, c5gK));
        List singletonList = Collections.singletonList(new 5gE() { // from class: X.5gI
            public final C5gJ A00 = C5gJ.A00;

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x01ca
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                */
            public void A6W(X.7eH r302, X.5PP r303) {
                /*
                    Method dump skipped, instructions count: 494
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5gI.A6W(X.7eH, X.5PP):void");
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        });
        11T.A0A(singletonList);
        03Y r06 = new 03Y(5gP.class, singletonList);
        List singletonList2 = Collections.singletonList(new 5gE() { // from class: X.5gI
            public final C5gJ A00 = C5gJ.A00;

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x01ca
                */
            public void A6W(X.7eH r302, X.5PP r303) {
                /*
                    Method dump skipped, instructions count: 494
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5gI.A6W(X.7eH, X.5PP):void");
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        });
        11T.A0A(singletonList2);
        03Y r07 = new 03Y(5gQ.class, singletonList2);
        List singletonList3 = Collections.singletonList(new 5gE() { // from class: X.5gO
            public final C5g2 A00 = C5g2.A00;

            public void A6W(7eH v, 5PP v2) {
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
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
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
                    */
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5gO.A6W(X.7eH, X.5PP):void");
            }

            public /* bridge */ /* synthetic */ C5g3 Asj() {
                return this.A00;
            }
        });
        11T.A0A(singletonList3);
        this.A00 = 04R.A09(new 03Y[]{r04, r05, r06, r07, new 03Y(5gR.class, singletonList3)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5wd A00(C5fv c5fv) {
        List<5gE> list = (List) this.A00.get(c5fv.getClass());
        C5g9 c5g9 = null;
        if (list != null) {
            7eH r306 = null;
            for (5gE r0 : list) {
                5PP AxW = c5fv.AxW(r0.Asj());
                if (AxW != null) {
                    if (r306 == null) {
                        r306 = new 7eH();
                    }
                    r0.A6W(r306, AxW);
                }
            }
            if (r306 != null) {
                c5g9 = new C5g9(r306.A00);
            }
        }
        return c5g9;
    }

    public final String A01(C5fv c5fv) {
        C5wd A00 = A00(c5fv);
        if (A00 == null) {
            return null;
        }
        return A00.A00.toString();
    }
}
