package com.facebook.maps;

import X.0DA;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1UG;
import X.7zL;
import X.AbF;
import X.AnonymousClass001;
import X.C00i;
import X.C01s;
import X.C3167Jl4;
import X.C47j;
import X.C47r;
import X.DKE;
import X.DKG;
import X.GEY;
import X.JNf;
import X.JQy;
import X.JlH;
import X.KOh;
import X.KSe;
import X.Ket;
import X.Kex;
import X.L7k;
import X.L88;
import X.LTU;
import X.MFR;
import X.MKs;
import X.RpX;
import X.S5s;
import X.S5v;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.maps.bugreporter.MidgardLayerDataReporter;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: FbMapViewDelegate.class */
public class FbMapViewDelegate extends FrameLayout implements MFR, GEY {
    public static boolean A0C;
    public MKs A00;
    public MapOptions A01;
    public LTU A02;
    public boolean A03;
    public boolean A04;
    public L88 A05;
    public final C00i A06;
    public final Ket A07;
    public final JlH A08;
    public final Queue A09;
    public final C00i A0A;
    public final MidgardLayerDataReporter A0B;

    public FbMapViewDelegate(Context context) {
        super(context);
        this.A09 = AbF.A1F();
        this.A04 = true;
        this.A08 = JQy.A0W(this, (MapOptions) null);
        this.A0A = 1BQ.A01();
        this.A07 = (Ket) 1Bi.A03(131228);
        this.A06 = 1BQ.A02(16501);
        this.A0B = (MidgardLayerDataReporter) 1Bi.A03(131124);
        A00(19152862);
    }

    public FbMapViewDelegate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = AbF.A1F();
        this.A04 = true;
        this.A08 = JQy.A0W(this, MapOptions.A00(attributeSet));
        this.A0A = 1BQ.A01();
        this.A07 = (Ket) 1Bi.A03(131228);
        this.A06 = 1BQ.A02(16501);
        this.A0B = (MidgardLayerDataReporter) 1Bi.A03(131124);
        A00(19152862);
    }

    public FbMapViewDelegate(Context context, MapOptions mapOptions) {
        super(context);
        this.A09 = AbF.A1F();
        this.A04 = true;
        this.A08 = JQy.A0W(this, mapOptions);
        this.A0A = 1BQ.A01();
        this.A07 = (Ket) 1Bi.A03(131228);
        this.A06 = 1BQ.A02(16501);
        this.A0B = (MidgardLayerDataReporter) 1Bi.A03(131124);
        A00(19152862);
    }

    public FbMapViewDelegate(Context context, MapOptions mapOptions, int i) {
        super(context);
        this.A09 = AbF.A1F();
        this.A04 = true;
        this.A08 = JQy.A0W(this, mapOptions);
        this.A0A = 1BQ.A01();
        this.A07 = (Ket) 1Bi.A03(131228);
        this.A06 = 1BQ.A02(16501);
        this.A0B = (MidgardLayerDataReporter) 1Bi.A03(131124);
        A00(i);
    }

    private void A00(int i) {
        Context context = getContext();
        this.A05 = (L88) 1Bn.A0E(context, (1BY) null, 131141);
        this.A02 = new LTU(context, this, (C01s) this.A0A.get(), (Kex) 1Bn.A0A(131229), DKE.A0d(), (UserFlowLogger) 1Bi.A03(16705));
        synchronized (MapboxTTRC.class) {
            C47r A02 = ((C47j) 1Br.A0B(MapboxTTRC.sTTRCTraceProvider.A00)).A02(i);
            if (MapboxTTRC.sTTRCTrace != null) {
                MapboxTTRC.fail("trace in progress already");
            }
            0fH.A0j("MapboxTTRC", "Starting Mapbox TTRC trace");
            MapboxTTRC.sTTRCTrace = A02;
            A02.A7Q("style_loaded");
            MapboxTTRC.sTTRCTrace.A7Q("map_rendered");
        }
        this.A05.A01();
        A07(this);
    }

    public final void A01() {
        JNf jNf;
        LTU ltu = this.A02;
        if (ltu != null && (jNf = ltu.A02) != null) {
            String str = "mapDelegate";
            LatLngBounds latLngBounds = jNf.B5F().A00().A04;
            L7k l7k = ltu.A04;
            if (l7k == null) {
                str = "falcoLogger";
            } else {
                JNf jNf2 = ltu.A02;
                if (jNf2 != null) {
                    double A00 = LTU.A00(jNf2);
                    LatLng latLng = latLngBounds.A00;
                    double d = latLng.A00;
                    LatLng latLng2 = latLngBounds.A01;
                    double d2 = latLng2.A01;
                    double d3 = latLng2.A00;
                    double d4 = latLng.A01;
                    if (ltu.A02 != null) {
                        1UG A08 = 1BK.A08(1Br.A02(l7k.A01), 1BJ.A00(1288));
                        if (A08.isSampled()) {
                            A08.A7R("map_sessionid", l7k.A04);
                            A08.A7R("map_type", "fb_vector");
                            A08.A5c(l7k.A00, "surface");
                            A08.A7R("entry_point", l7k.A02);
                            A08.A5Z("zoom_level", Double.valueOf(A00));
                            JQy.A1E(C3167Jl4.A00(d, d2), A08, Double.valueOf(d3), d4);
                            A08.A6J("presented_ids", (Map) null);
                            A08.A7h("presented_cluster_ids", (List) null);
                            A08.A7T((0DA) null, "extra_struct");
                            A08.BZL();
                        }
                        MapboxTTRC.cancel("maps_perf_logger_on_destroy");
                        KSe kSe = ltu.A0E;
                        UserFlowLogger userFlowLogger = kSe.A01;
                        if (userFlowLogger != null) {
                            userFlowLogger.flowEndSuccess(kSe.A00);
                        }
                        kSe.A01 = null;
                        ltu.A09.removeCallbacksAndMessages(null);
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        MKs mKs = this.A00;
        if (mKs != null) {
            mKs.onDestroy();
        }
    }

    public final void A02() {
        if (this.A02 != null) {
            MapboxTTRC.cancel("maps_perf_logger_on_pause");
        }
    }

    public final void A03() {
        this.A00.getClass();
        this.A02.getClass();
        this.A02.markerStart(19136515);
        this.A02.Bcp(19136515);
    }

    public final void A04() {
        this.A00.getClass();
        this.A02.getClass();
        this.A02.markerStart(19136514);
        try {
            this.A00.onStart();
        } finally {
            this.A02.Bcp(19136514);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v2 ??, still in use, count: 7, list:
          (r315v2 ??) from 0x06a6: PHI (r315v3 ??) = (r315v2 ??), (r315v2 ??) binds: [B:394:0x05ae, B:396:0x05b3] A[DONT_GENERATE, DONT_INLINE]
          (r315v2 ??) from 0x06a6: PHI (r315v3 ??) = (r315v2 ??), (r315v2 ??) binds: [B:394:0x05ae, B:396:0x05b3] A[DONT_GENERATE, DONT_INLINE]
          (r315v2 ?? I:X.JlI) from 0x0581: IPUT (r0v72 ?? I:boolean), (r315v2 ?? I:X.JlI) A[Catch: all -> 0x078c] X.JlI.A03 boolean
          (r315v2 ?? I:java.lang.Object) from 0x058e: INVOKE (r0v154 ?? I:X.LWV), (r315v2 ?? I:java.lang.Object), (r2v2 ?? I:int) DIRECT call: X.LWV.<init>(java.lang.Object, int):void A[Catch: all -> 0x078c]
          (r315v2 ?? I:X.JlI) from 0x0595: INVOKE (r315v2 ?? I:X.JlI), (r0v154 ?? I:X.MFR) VIRTUAL call: X.JlI.AvV(X.MFR):void A[Catch: all -> 0x078c]
          (r315v2 ?? I:X.JlI) from 0x05a2: IPUT (r0v158 ?? I:X.LAt), (r315v2 ?? I:X.JlI) A[Catch: all -> 0x078c] X.JlI.A01 X.LAt
          (r315v2 ?? I:X.JlI) from 0x05a7: IGET (r0v161 ?? I:X.Jl9) = (r315v2 ?? I:X.JlI) A[Catch: all -> 0x078c] X.JlI.A00 X.Jl9
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
    public final void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v2 ??, still in use, count: 7, list:
          (r315v2 ??) from 0x06a6: PHI (r315v3 ??) = (r315v2 ??), (r315v2 ??) binds: [B:394:0x05ae, B:396:0x05b3] A[DONT_GENERATE, DONT_INLINE]
          (r315v2 ??) from 0x06a6: PHI (r315v3 ??) = (r315v2 ??), (r315v2 ??) binds: [B:394:0x05ae, B:396:0x05b3] A[DONT_GENERATE, DONT_INLINE]
          (r315v2 ?? I:X.JlI) from 0x0581: IPUT (r0v72 ?? I:boolean), (r315v2 ?? I:X.JlI) A[Catch: all -> 0x078c] X.JlI.A03 boolean
          (r315v2 ?? I:java.lang.Object) from 0x058e: INVOKE (r0v154 ?? I:X.LWV), (r315v2 ?? I:java.lang.Object), (r2v2 ?? I:int) DIRECT call: X.LWV.<init>(java.lang.Object, int):void A[Catch: all -> 0x078c]
          (r315v2 ?? I:X.JlI) from 0x0595: INVOKE (r315v2 ?? I:X.JlI), (r0v154 ?? I:X.MFR) VIRTUAL call: X.JlI.AvV(X.MFR):void A[Catch: all -> 0x078c]
          (r315v2 ?? I:X.JlI) from 0x05a2: IPUT (r0v158 ?? I:X.LAt), (r315v2 ?? I:X.JlI) A[Catch: all -> 0x078c] X.JlI.A01 X.LAt
          (r315v2 ?? I:X.JlI) from 0x05a7: IGET (r0v161 ?? I:X.Jl9) = (r315v2 ?? I:X.JlI) A[Catch: all -> 0x078c] X.JlI.A00 X.Jl9
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

    public final void A06(Bundle bundle) {
        this.A00.getClass();
        MapOptions mapOptions = this.A01;
        mapOptions.getClass();
        bundle.putString("state_map_source", mapOptions.A04.toString());
        this.A00.onSaveInstanceState(bundle);
    }

    public final void A07(MFR mfr) {
        MKs mKs = this.A00;
        if (mKs != null) {
            mKs.AvV(mfr);
        } else {
            this.A09.add(mfr);
        }
    }

    public boolean ADj(Integer num, int i, int i2) {
        return this.A03;
    }

    public void C5X(JNf jNf) {
        if (this.A01.A04 == KOh.A02) {
            MapboxMap mapboxMap = ((RpX) jNf).A02;
            this.A0B.A01.add(7zL.A14(mapboxMap));
            mapboxMap.addOnCameraIdleListener(new S5s(this));
            mapboxMap.addOnCameraMoveStartedListener(new S5v(this));
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        Object obj = this.A00;
        if (obj != null) {
            this.A04 = AnonymousClass001.A1O(((View) obj).getVisibility());
        }
        return this.A04;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.A04 = z;
        MKs mKs = this.A00;
        if (mKs != null) {
            ((View) mKs).setVisibility(DKG.A00(z ? 1 : 0));
        }
    }
}
