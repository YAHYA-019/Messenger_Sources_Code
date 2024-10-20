package X;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.montageads.models.MontageAdsMediaInfo;
import com.facebook.messaging.business.montageads.models.SingleMontageAd;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Gc0, reason: case insensitive filesystem */
/* loaded from: Gc0.class */
public final class C2398Gc0 extends 1pK implements JLj, 2Ob {
    public static final String __redex_internal_original_name = "MontageAdViewerPageFragment";
    public int A00;
    public FrameLayout A01;
    public ProgressBar A02;
    public FbUserSession A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public IUP A08;
    public IUO A09;
    public FjF A0A;
    public FjE A0B;
    public FjG A0C;
    public IUT A0D;
    public IUS A0E;
    public IUQ A0F;
    public Evv A0G;
    public I5N A0H;
    public EqN A0I;
    public SingleMontageAd A0J;
    public MontageViewerFragment A0K;
    public HGD A0L;
    public Set A0M;
    public boolean A0N;
    public ViewStub A0O;
    public C00i A0P;
    public final Runnable A0Z = new Ipy(this);
    public final Runnable A0a = new Ipz(this);
    public final C00i A0U = AbF.A0S(this, 674);
    public final C00i A0Y = 1BV.A00(670);
    public final C00i A0V = AbF.A0S(this, 675);
    public final C00i A0Q = 1BV.A00(671);
    public final C00i A0R = 1BV.A00(672);
    public final C00i A0W = 1BV.A00(148052);
    public final C00i A0S = 1BV.A00(673);
    public final C00i A0X = AbF.A0S(this, 676);
    public final C00i A0b = 1BQ.A02(99710);
    public final C00i A0T = 1BV.A00(16430);

    private void A03() {
        if (this.A0J != null) {
            ((F9M) 4YU.A0p(this.A06)).A02(this.A0J);
        }
        Set set = this.A0M;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((JL2) it.next()).Bkz();
            }
        }
    }

    public static void A06(C2398Gc0 c2398Gc0) {
        Set<JL2> set = c2398Gc0.A0M;
        if (set != null) {
            for (JL2 jl2 : set) {
                I5N i5n = c2398Gc0.A0H;
                boolean z = true;
                if (!i5n.A05 && (!i5n.A07 || !i5n.A02 || !i5n.A06 || i5n.A01 || i5n.A09 || i5n.A00 || i5n.A03 || i5n.A04 || i5n.A0A || i5n.A08)) {
                    z = false;
                }
                jl2.CC1(z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301.mUserVisibleHint == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isResumed()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            boolean r0 = r0.isVisible()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            boolean r0 = r0.mUserVisibleHint
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L1f
        L1d:
            r0 = 0
            r302 = r0
        L1f:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2398Gc0.A07():boolean");
    }

    public void A1O(boolean z, boolean z2) {
        super.A1O(z, z2);
        I5N i5n = this.A0H;
        if (i5n != null) {
            i5n.A07 = A07();
            I5N.A00(i5n);
        }
        if (!z) {
            Set set = this.A0M;
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((JL2) it.next()).C7i();
                }
            }
            A03();
            return;
        }
        if (this.A0J != null && A07()) {
            ((F9M) 4YU.A0p(this.A06)).A01(this.A0J);
        }
        FjF fjF = this.A0A;
        if (fjF != null) {
            fjF.A00();
        }
    }

    public 1iF A1R() {
        return AbF.A0C(306914883756110L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        FbUserSession A0G = 1BL.A0G(this);
        this.A03 = A0G;
        this.A06 = 1Lo.A02(A0G, this, 99742);
        this.A07 = 1Lo.A02(this.A03, this, 115923);
        this.A0P = 1Lo.A02(this.A03, this, 116010);
        this.A04 = AbF.A0S(this, 668);
        this.A05 = AbF.A0S(this, 669);
    }

    public void A1X() {
        MontageAdsMediaInfo montageAdsMediaInfo = (MontageAdsMediaInfo) this.A0J.A04.get(this.A00);
        this.A01.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{montageAdsMediaInfo.A02, montageAdsMediaInfo.A00}));
        C00i c00i = this.A0T;
        4YU.A0G(c00i).removeCallbacks(this.A0Z);
        4YU.A0G(c00i).postDelayed(this.A0a, 500L);
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            ((JL2) it.next()).BlY(this.A0J, this.A00);
        }
        A06(this);
    }

    public boolean ADo(MotionEvent motionEvent) {
        return AnonymousClass001.A1O(this.A0H.A00 ? 1 : 0);
    }

    @Override // X.JLj
    public void BrD(Throwable th) {
        I5N i5n = this.A0H;
        i5n.A05 = true;
        I5N.A00(i5n);
        C00i c00i = this.A0T;
        4YU.A0G(c00i).removeCallbacks(this.A0a);
        4YU.A0G(c00i).post(this.A0Z);
        AbH.A1K(this.A01, -16777216);
        if (this.A0O.getParent() != null) {
            this.A0O.inflate();
        }
        HGD hgd = this.A0L;
        if (hgd instanceof C2800God) {
            MontageViewerFragment.A0N(((C2800God) hgd).A00);
        }
        F9F f9f = (F9F) this.A0b.get();
        String str = this.A0J.A08;
        String message = th.getMessage();
        1UG A08 = 1BK.A08(1BK.A07(f9f.A04), 1BJ.A00(1752));
        if (A08.isSampled()) {
            A08.A7R("client_token", str);
            A08.A7R("error_message", message);
            A08.BZL();
        }
        ((ICj) 4YU.A0p(this.A0P)).A07(this.A0J.A0A, th.getMessage());
    }

    @Override // X.JLj
    public void BrE() {
    }

    @Override // X.JLj
    public void BrH() {
        this.A0L.A05(this);
    }

    @Override // X.JLj
    public void BrI() {
        if (this.A0J != null) {
            ICj iCj = (ICj) 4YU.A0p(this.A0P);
            SingleMontageAd singleMontageAd = this.A0J;
            synchronized (iCj) {
                if (singleMontageAd != null) {
                    String str = singleMontageAd.A0A;
                    if (!ICj.A02(iCj, str)) {
                        iCj.A00.Bch("ad_id", str);
                        MontageAdsMediaInfo montageAdsMediaInfo = (MontageAdsMediaInfo) singleMontageAd.A04.get(0);
                        if (montageAdsMediaInfo != null) {
                            iCj.A00.Bch("media_id", montageAdsMediaInfo.A06);
                            if (montageAdsMediaInfo.A05 != null) {
                                iCj.A00.Bch("media_type", "VIDEO");
                            } else if (montageAdsMediaInfo.A04 != null) {
                                iCj.A00.Bch("media_type", "PHOTO");
                            }
                        }
                        iCj.A00.Bcf("card_count", 1);
                        iCj.A00.Bcf("card_index", 0);
                    }
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("markerAnnotateMontageAd is called with invalid data ");
                boolean z = true;
                HvT.A01(iCj, A0k, AnonymousClass001.A1U(iCj.A00));
                A0k.append(" Montage Ad Bucket is null ");
                if (singleMontageAd != null) {
                    z = false;
                }
                A0k.append(z);
                0fH.A0n("MontageViewerLoadTTRCTracker", A0k.toString());
            }
        }
        ICj iCj2 = (ICj) 4YU.A0p(this.A0P);
        SingleMontageAd singleMontageAd2 = this.A0J;
        iCj2.A04(singleMontageAd2 == null ? null : singleMontageAd2.A0A);
        this.A0L.A02();
    }

    @Override // X.JLj
    public void BrJ() {
        I5N i5n = this.A0H;
        i5n.A06 = true;
        I5N.A00(i5n);
        C00i c00i = this.A0T;
        4YU.A0G(c00i).removeCallbacks(this.A0a);
        4YU.A0G(c00i).post(this.A0Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1404420621);
        View A08 = AbG.A08(layoutInflater.cloneInContext(getContext()), viewGroup, 2132542718);
        0FI.A08(-237737194, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-1847149481);
        View A0F = 7zL.A0F(this, 2131368412);
        Hot hot = (Hot) ((I3e) this.A0K.A19.get()).A01(Hot.class);
        11T.A0F(A0F, 0);
        hot.A01.remove(A0F);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        IUT iut = this.A0D;
        if (iut != null) {
            IUT.A01(iut);
        }
        0FI.A08(319290500, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1052842173);
        super/*androidx.fragment.app.Fragment*/.onPause();
        I5N i5n = this.A0H;
        i5n.A07 = A07();
        I5N.A00(i5n);
        A03();
        0FI.A08(-1913219744, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1650434109);
        super/*androidx.fragment.app.Fragment*/.onResume();
        I5N i5n = this.A0H;
        i5n.A07 = A07();
        I5N.A00(i5n);
        if (this.A0J != null && A07()) {
            ((F9M) 4YU.A0p(this.A06)).A01(this.A0J);
        }
        0FI.A08(547679890, A02);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v2 ??, still in use, count: 7, list:
          (r313v2 ??) from 0x0496: PHI (r313v3 ??) = (r313v2 ??), (r313v4 ??) binds: [B:89:0x05fe, B:47:0x0443] A[DONT_GENERATE, DONT_INLINE]
          (r313v2 ?? I:X.IUO) from 0x0593: IPUT (r0v102 ?? I:int), (r313v2 ?? I:X.IUO) A[Catch: all -> 0x065a] X.IUO.A00 int
          (r313v2 ?? I:X.IUO) from 0x059a: IPUT (r0v147 ?? I:com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView), (r313v2 ?? I:X.IUO) A[Catch: all -> 0x065a] X.IUO.A03 com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView
          (r313v2 ?? I:X.IUO) from 0x05a1: IPUT (r0v149 ?? I:X.Evv), (r313v2 ?? I:X.IUO) A[Catch: all -> 0x065a] X.IUO.A01 X.Evv
          (r313v2 ?? I:X.IUO) from 0x05bb: IGET (r0v165 ?? I:com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView) = (r313v2 ?? I:X.IUO) A[Catch: all -> 0x065a] X.IUO.A03 com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView
          (r313v2 ?? I:X.IUO) from 0x05f1: INVOKE (r0v175 ?? I:X.IXQ), (r313v2 ?? I:X.IUO) DIRECT call: X.IXQ.<init>(X.IUO):void A[Catch: all -> 0x065a]
          (r313v2 ?? I:X.IUO) from 0x0606: IPUT (r313v2 ?? I:X.IUO), (r301v0 'this' ?? I:X.Gc0 A[IMMUTABLE_TYPE, THIS]) X.Gc0.A09 X.IUO
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
    public void onViewCreated(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v2 ??, still in use, count: 7, list:
          (r313v2 ??) from 0x0496: PHI (r313v3 ??) = (r313v2 ??), (r313v4 ??) binds: [B:89:0x05fe, B:47:0x0443] A[DONT_GENERATE, DONT_INLINE]
          (r313v2 ?? I:X.IUO) from 0x0593: IPUT (r0v102 ?? I:int), (r313v2 ?? I:X.IUO) A[Catch: all -> 0x065a] X.IUO.A00 int
          (r313v2 ?? I:X.IUO) from 0x059a: IPUT (r0v147 ?? I:com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView), (r313v2 ?? I:X.IUO) A[Catch: all -> 0x065a] X.IUO.A03 com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView
          (r313v2 ?? I:X.IUO) from 0x05a1: IPUT (r0v149 ?? I:X.Evv), (r313v2 ?? I:X.IUO) A[Catch: all -> 0x065a] X.IUO.A01 X.Evv
          (r313v2 ?? I:X.IUO) from 0x05bb: IGET (r0v165 ?? I:com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView) = (r313v2 ?? I:X.IUO) A[Catch: all -> 0x065a] X.IUO.A03 com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView
          (r313v2 ?? I:X.IUO) from 0x05f1: INVOKE (r0v175 ?? I:X.IXQ), (r313v2 ?? I:X.IUO) DIRECT call: X.IXQ.<init>(X.IUO):void A[Catch: all -> 0x065a]
          (r313v2 ?? I:X.IUO) from 0x0606: IPUT (r313v2 ?? I:X.IUO), (r301v0 'this' ?? I:X.Gc0 A[IMMUTABLE_TYPE, THIS]) X.Gc0.A09 X.IUO
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
}
