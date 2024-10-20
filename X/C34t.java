package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.inbox.impressiontracker.model.InboxSourceLoggingData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.listview.EmptyListViewItem;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import com.google.common.collect.ImmutableList;

/* renamed from: X.34t, reason: invalid class name */
/* loaded from: 34t.class */
public final class C34t extends 1pK implements CallerContextable {
    public static final String __redex_internal_original_name = "MessengerBubblesInboxFragment";
    public Context A00;
    public View A01;
    public ViewGroup A02;
    public FbUserSession A03;
    public C1qb A04;
    public 2Xo A05;
    public 2SB A06;
    public 2YH A07;
    public 2YW A08;
    public 2Sc A0A;
    public 2Vo A0B;
    public MigColorScheme A0C;
    public EmptyListViewItem A0D;
    public BetterRecyclerView A0E;
    public 1Va A0F;
    public ViewGroup A0I;
    public 2Lk A0J;
    public C1t3 A0K;
    public static final 2SI A0R = 2SI.A04;
    public static final CallerContext A0Q = CallerContext.A06(C34t.class);
    public final 2S3 A0L = new 2S3(this, __redex_internal_original_name);
    public boolean A0G = true;
    public boolean A0H = true;
    public 2S9 A09 = new Object();
    public final 1Br A0O = 1Bq.A00(66105);
    public final 1Br A0N = 1Bq.A00(66102);
    public final 1Br A0M = 1Bu.A00(66552);
    public final C1t1 A0P = new LX7(this, 0);

    public static final void A03(C34t c34t) {
        View view;
        ViewGroup viewGroup = c34t.A0I;
        if (viewGroup == null || (view = c34t.A01) == null) {
            return;
        }
        viewGroup.removeView(view);
        c34t.A01 = null;
    }

    public static final void A06(C34t c34t, 2Sg r302) {
        String str;
        2Xo r0 = c34t.A05;
        if (r0 != null) {
            2YH r02 = c34t.A07;
            String str2 = "inboxImpressionTracker";
            if (r02 != null) {
                ImmutableList immutableList = r302.A01;
                r02.A04(immutableList);
                ClP clP = new ClP(c34t, 0);
                str = "sectionContext";
                if (c34t.A04 != null) {
                    2Ye r03 = new 2Ye();
                    if (c34t.A04 != null) {
                        2Yt r04 = new 2Yt();
                        str = "fbUserSession";
                        FbUserSession fbUserSession = c34t.A03;
                        if (fbUserSession != null) {
                            r04.A00 = fbUserSession;
                            r04.A08 = immutableList;
                            r04.A03 = clP;
                            2YH r05 = c34t.A07;
                            if (r05 != null) {
                                r04.A01 = r05;
                                2YW r06 = c34t.A08;
                                if (r06 == null) {
                                    str = "inboxItemViewBinder";
                                } else {
                                    r04.A02 = r06;
                                    MigColorScheme migColorScheme = c34t.A0C;
                                    str2 = "colorScheme";
                                    if (migColorScheme != null) {
                                        r04.A06 = migColorScheme;
                                        1Va r07 = c34t.A0F;
                                        if (r07 != null) {
                                            r04.A07 = r07;
                                            r03.A00 = r04;
                                            r03.A01 = migColorScheme;
                                            r0.A0R(r03);
                                            return;
                                        }
                                        str = "publisher";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        str = "sectionTree";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A1J() {
        super.A1J();
        if (((2jC) 1Br.A0B(this.A0N)).A01()) {
            ((2jD) 1Br.A0B(this.A0O)).A01();
        }
    }

    public void A1O(boolean z, boolean z2) {
        super.A1O(z, z2);
        2YH r0 = this.A07;
        if (r0 == null) {
            11T.A0L("inboxImpressionTracker");
            throw 0Q8.createAndThrow();
        }
        r0.A06(z);
    }

    public 1iF A1R() {
        return new 1iF(3719985438017145L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v2 ??, still in use, count: 3, list:
          (r306v2 ??) from 0x02a4: PHI (r306v3 ??) = (r306v2 ??), (r306v4 ??) binds: [B:57:0x0289, B:62:0x029e] A[DONT_GENERATE, DONT_INLINE]
          (r306v2 ?? I:java.util.Set) from 0x0282: INVOKE (r0v130 ?? I:boolean) = (r306v2 ?? I:java.util.Set), (r0v127 ?? I:java.lang.Object) INTERFACE call: java.util.Set.contains(java.lang.Object):boolean A[Catch: all -> 0x03c3, MD:(java.lang.Object):boolean (c)]
          (r306v2 ?? I:java.util.Collection) from 0x0295: INVOKE (r0v138 ?? I:java.util.HashSet), (r306v2 ?? I:java.util.Collection) DIRECT call: java.util.HashSet.<init>(java.util.Collection):void A[Catch: all -> 0x03c3, MD:(java.util.Collection<? extends E>):void (c)]
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
    public void A1S(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v2 ??, still in use, count: 3, list:
          (r306v2 ??) from 0x02a4: PHI (r306v3 ??) = (r306v2 ??), (r306v4 ??) binds: [B:57:0x0289, B:62:0x029e] A[DONT_GENERATE, DONT_INLINE]
          (r306v2 ?? I:java.util.Set) from 0x0282: INVOKE (r0v130 ?? I:boolean) = (r306v2 ?? I:java.util.Set), (r0v127 ?? I:java.lang.Object) INTERFACE call: java.util.Set.contains(java.lang.Object):boolean A[Catch: all -> 0x03c3, MD:(java.lang.Object):boolean (c)]
          (r306v2 ?? I:java.util.Collection) from 0x0295: INVOKE (r0v138 ?? I:java.util.HashSet), (r306v2 ?? I:java.util.Collection) DIRECT call: java.util.HashSet.<init>(java.util.Collection):void A[Catch: all -> 0x03c3, MD:(java.util.Collection<? extends E>):void (c)]
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
    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        if (this.A00 == null) {
            2Ln.A00.getValue();
            this.A00 = new ContextThemeWrapper(requireContext(), 2132607934);
            FbUserSession A01 = 1BM.A01(this);
            this.A03 = A01;
            if (A01 != null) {
                Context context2 = this.A00;
                if (context2 != null) {
                    this.A0J = (2Lk) 1Lo.A04(context2, A01, (1BY) null, 16976);
                    FbUserSession fbUserSession = this.A03;
                    if (fbUserSession != null) {
                        Context context3 = this.A00;
                        if (context3 != null) {
                            this.A0K = (C1t3) 1Lo.A04(context3, fbUserSession, (1BY) null, 33086);
                            Context context4 = this.A00;
                            if (context4 != null) {
                                this.A06 = (2SB) 1Bn.A0E(context4, (1BY) null, 17019);
                                2S3 r0 = this.A0L;
                                r0.A00 = context;
                                FbUserSession fbUserSession2 = this.A03;
                                if (fbUserSession2 != null) {
                                    this.A0F = 2SJ.A00(context, fbUserSession2, r0, (ThreadKey) null, A0R);
                                    return;
                                }
                            }
                        }
                    }
                }
                11T.A0L("themedContext");
                throw 0Q8.createAndThrow();
            }
            11T.A0L("fbUserSession");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = 0FI.A02(33788338);
        11T.A0F(layoutInflater, 0);
        this.A0C = (MigColorScheme) 1Bn.A0E(requireContext(), (1BY) null, 16979);
        2Lq r0 = (2Lq) 1Bi.A03(65863);
        Context context = this.A00;
        if (context == null) {
            str = "themedContext";
        } else {
            LayoutInflater cloneInContext = layoutInflater.cloneInContext(context);
            2Lk r02 = this.A0J;
            if (r02 != null) {
                View A00 = r02.A00(cloneInContext, viewGroup, r0);
                11T.A0A(A00);
                0FI.A08(-19124483, A02);
                return A00;
            }
            str = "simpleBackgroundInflater";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(113450734);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        C1t3 c1t3 = this.A0K;
        if (c1t3 == null) {
            11T.A0L("migColorSchemeUpdateAnnouncer");
            throw 0Q8.createAndThrow();
        }
        c1t3.A01(this.A0P);
        0FI.A08(-1755318739, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-310951592);
        this.A0I = null;
        this.A02 = null;
        this.A0E = null;
        this.A01 = null;
        this.A0D = null;
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(1957758274, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        String str;
        int A02 = 0FI.A02(1785050522);
        super/*androidx.fragment.app.Fragment*/.onPause();
        2Lk r0 = this.A0J;
        if (r0 != null) {
            r0.A01();
            2YH r02 = this.A07;
            if (r02 != null) {
                r02.A05(false);
                2YH r03 = this.A07;
                if (r03 != null) {
                    r03.A06(false);
                    2Sc r04 = this.A0A;
                    if (r04 == null) {
                        str = "inboxViewData";
                    } else {
                        r04.A02();
                        2YW r05 = this.A08;
                        if (r05 != null) {
                            r05.A00();
                            0FI.A08(-593761539, A02);
                            return;
                        }
                        str = "inboxItemViewBinder";
                    }
                }
            }
            11T.A0L("inboxImpressionTracker");
            throw 0Q8.createAndThrow();
        }
        str = "simpleBackgroundInflater";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1677045099);
        super/*androidx.fragment.app.Fragment*/.onResume();
        2YH r0 = this.A07;
        String str = "inboxImpressionTracker";
        if (r0 != null) {
            r0.A05(true);
            2YH r02 = this.A07;
            if (r02 != null) {
                r02.A06(this.mUserVisibleHint);
                2Sc r03 = this.A0A;
                if (r03 == null) {
                    str = "inboxViewData";
                } else {
                    r03.A03();
                    2YW r04 = this.A08;
                    if (r04 != null) {
                        r04.A01();
                        0FI.A08(-2031949662, A02);
                        return;
                    }
                    str = "inboxItemViewBinder";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        MigColorScheme migColorScheme = this.A0C;
        if (migColorScheme == null) {
            str = "colorScheme";
        } else {
            MigColorScheme.A00(view, migColorScheme);
            Context context = this.A00;
            if (context != null) {
                final C1qb c1qb = new C1qb(context, null, null, null, 6);
                this.A04 = c1qb;
                final 1Br A00 = 1Bq.A00(17092);
                C2ys c2ys = new C2ys();
                c2ys.A04 = new C2X6(((1Iw) c1qb).A0D, 1, false);
                2XM r0 = new 2XM(2XL.A0E);
                r0.A05 = new 2XO() { // from class: X.3Yz
                    public 2lR AK9(1Iw r302) {
                        C1qb c1qb2 = c1qb;
                        1Br r02 = A00;
                        2SI r03 = C34t.A0R;
                        return new 2lR((2lN) 1Br.A0B(r02), c1qb2);
                    }
                };
                c2ys.A06 = r0.A00();
                2Xm r02 = new 2Xm(c2ys.A00(c1qb), false);
                C1qb c1qb2 = this.A04;
                if (c1qb2 == null) {
                    str = "sectionContext";
                } else {
                    String A0Y = AnonymousClass001.A0Y(this);
                    if (A0Y == null) {
                        A0Y = "";
                    }
                    this.A05 = new 2Xo(c1qb2, r02, (1cU) null, A0Y, false, false, false);
                    this.A0I = (ViewGroup) 1pK.A02(this, 2131368032);
                    this.A02 = (ViewGroup) 1pK.A02(this, 2131364575);
                    this.A0E = (BetterRecyclerView) 1pK.A02(this, 2131368005);
                    this.A0D = (EmptyListViewItem) 1pK.A02(this, 2131368004);
                    final BetterRecyclerView betterRecyclerView = this.A0E;
                    if (betterRecyclerView != null) {
                        betterRecyclerView.A0T = true;
                        2NB r03 = betterRecyclerView.A0y;
                        r03.A00 = 0;
                        r03.A08();
                        betterRecyclerView.A1A(null);
                        2YM r317 = betterRecyclerView.A03;
                        if (r317 == null) {
                            r317 = new 2YM(betterRecyclerView);
                            betterRecyclerView.A03 = r317;
                        }
                        betterRecyclerView.A0F.add(r317);
                        betterRecyclerView.setOverScrollMode(2);
                        0WH r04 = betterRecyclerView.A0E.A00;
                        synchronized (r04) {
                            r04.clear();
                        }
                        C2xd c2xd = (C2xd) 1Bn.A0A(771);
                        Context context2 = this.A00;
                        if (context2 != null) {
                            2S3 r05 = this.A0L;
                            FbUserSession fbUserSession = this.A03;
                            if (fbUserSession != null) {
                                betterRecyclerView.A1F(c2xd.A06(context2, betterRecyclerView, fbUserSession, this, r05));
                                betterRecyclerView.A1F(new 8Dw(this, 1));
                                betterRecyclerView.A1N(new 2YO(this) { // from class: X.3ck
                                    public final /* synthetic */ C34t A00;

                                    {
                                        this.A00 = this;
                                    }

                                    /* JADX WARN: Type inference failed for: r0v17, types: [X.1Q5, java.lang.Object] */
                                    public boolean BiH() {
                                        String str2;
                                        if (betterRecyclerView.getChildCount() <= 0) {
                                            return false;
                                        }
                                        C34t c34t = this.A00;
                                        2SI r06 = C34t.A0R;
                                        2SB r07 = c34t.A06;
                                        if (r07 == null) {
                                            str2 = "messagingAnalyticsLogger";
                                        } else {
                                            r07.A03("thread_list");
                                            1Va r08 = c34t.A0F;
                                            if (r08 != null) {
                                                r08.CZm((1Q5) new Object());
                                                if (c34t.A0G) {
                                                    c34t.A0G = false;
                                                    ((2Vp) 1Br.A0B(c34t.A0M)).A01();
                                                }
                                                if (!c34t.A0H) {
                                                    return false;
                                                }
                                                c34t.A0H = false;
                                                ((2Vp) 1Br.A0B(c34t.A0M)).A00();
                                                return false;
                                            }
                                            str2 = "publisher";
                                        }
                                        11T.A0L(str2);
                                        throw 0Q8.createAndThrow();
                                    }
                                });
                            }
                            str = "fbUserSession";
                        }
                    }
                    1pK.A02(this, 2131368030).setEnabled(false);
                    2YD A09 = ((C2xd) 1Bn.A0A(17153)).A09(new InboxSourceLoggingData("MESSENGER_INBOX2", 0S2.A00, null));
                    C2xd c2xd2 = (C2xd) 1Bn.A0A(773);
                    C2xd c2xd3 = (C2xd) 1Bn.A0A(772);
                    2SI r06 = A0R;
                    Context requireContext = requireContext();
                    FbUserSession fbUserSession2 = this.A03;
                    if (fbUserSession2 != null) {
                        this.A07 = c2xd2.A08(c2xd3.A07(requireContext, fbUserSession2, A09, r06), A09);
                        1Bn.A0A(66544);
                        C2xd c2xd4 = (C2xd) 1Bn.A0A(770);
                        Context requireContext2 = requireContext();
                        FbUserSession fbUserSession3 = this.A03;
                        if (fbUserSession3 != null) {
                            2S3 r07 = this.A0L;
                            BetterRecyclerView betterRecyclerView2 = this.A0E;
                            2S9 r08 = this.A09;
                            1Va r09 = this.A0F;
                            if (r09 != null) {
                                2YP A05 = c2xd4.A05(requireContext2, betterRecyclerView2, fbUserSession3, r07, r08, r09);
                                Context context3 = this.A00;
                                if (context3 != null) {
                                    CallerContext callerContext = A0Q;
                                    String A01 = C1is.A01(A1P());
                                    2YH r010 = this.A07;
                                    if (r010 == null) {
                                        str = "inboxImpressionTracker";
                                    } else {
                                        06Z childFragmentManager = getChildFragmentManager();
                                        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                                        1pI A002 = 1vD.A00(view);
                                        FbUserSession fbUserSession4 = this.A03;
                                        if (fbUserSession4 != null) {
                                            1Va r011 = this.A0F;
                                            if (r011 != null) {
                                                this.A08 = new 2YW(context3, childFragmentManager, viewLifecycleOwner, fbUserSession4, callerContext, r07, A002, r010, A09, A05, r06, (2YX) null, r011, A01);
                                                2Sc r012 = this.A0A;
                                                if (r012 != null) {
                                                    A06(this, r012.A00());
                                                    r02.A00.BeW(this.A0E);
                                                    return;
                                                }
                                                str = "inboxViewData";
                                            }
                                        }
                                    }
                                }
                            }
                            str = "publisher";
                        }
                    }
                    str = "fbUserSession";
                }
            }
            str = "themedContext";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
