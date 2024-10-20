package com.facebook.messaging.reactions;

import X.0FI;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1LI;
import X.1Lo;
import X.1Um;
import X.1YC;
import X.1iF;
import X.2O4;
import X.4YT;
import X.4YU;
import X.5OA;
import X.5lO;
import X.5yW;
import X.65U;
import X.6CU;
import X.6KV;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zP;
import X.82O;
import X.8nO;
import X.AKY;
import X.AUR;
import X.AbE;
import X.AbF;
import X.AbG;
import X.AbK;
import X.AbR;
import X.AnonymousClass001;
import X.BmU;
import X.BrG;
import X.C00i;
import X.C1Y6;
import X.C5pl;
import X.C5xl;
import X.C9g6;
import X.GOp;
import X.GVv;
import X.GXB;
import X.GkM;
import X.GsM;
import X.HGA;
import X.HPU;
import X.HgE;
import X.HtJ;
import X.IAJ;
import X.IKE;
import X.ILT;
import X.IXu;
import X.Iaj;
import X.Iar;
import X.J5v;
import X.J5x;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Transformations;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionsCount;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: M4MessageReactionsReactorsFragment.class */
public class M4MessageReactionsReactorsFragment extends AbstractMessageReactionsReactorsFragment {
    public int A01;
    public FrameLayout A02;
    public FbUserSession A04;
    public 6KV A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public LithoView A0A;
    public Message A0B;
    public ThreadCustomization A0C;
    public ThreadSummary A0D;
    public GkM A0E;
    public C9g6 A0F;
    public HtJ A0G;
    public HGA A0H;
    public Capabilities A0J;
    public MessageReactionsCount A0K;
    public ThreadThemeInfo A0L;
    public Integer A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0Q;
    public boolean A0R;
    public AbR A0S;
    public 65U A0T;
    public boolean A0U;
    public final C00i A0b = AbF.A0S(this, 115451);
    public final C00i A0Y = 1BQ.A02(68549);
    public final C00i A0c = 1BQ.A02(100038);
    public final C00i A0X = 1BQ.A02(67773);
    public final C00i A0V = 1BQ.A02(68470);
    public final C00i A0W = 1BV.A00(83430);
    public final C00i A0d = 1BV.A00(65571);
    public final IXu A0Z = new IXu(this);
    public int A00 = 0;
    public final Map A0a = AnonymousClass001.A0u();
    public 2O4 A03 = new GXB(new J5v(1));
    public MigColorScheme A0I = LightColorScheme.A00();
    public boolean A0P = false;

    public static int A05(M4MessageReactionsReactorsFragment m4MessageReactionsReactorsFragment, String str) {
        ImmutableList A01;
        HtJ htJ = m4MessageReactionsReactorsFragment.A0G;
        if (htJ == null || str == null || (A01 = htJ.A01()) == null || A01.isEmpty()) {
            return 0;
        }
        Iterator it = A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (AnonymousClass001.A0i(it).equals(str)) {
                if (!m4MessageReactionsReactorsFragment.A0Q) {
                    i++;
                }
                return i;
            }
            i++;
        }
        return 0;
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r324v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r324v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r326v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r326v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 324, insn: 0x02d7: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r324 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:265:0x02cf */
    /* JADX WARN: Not initialized variable reg: 326, insn: 0x02ed: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r326 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:266:0x02ed */
    public static void A06(com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment r301) {
        /*
            Method dump skipped, instructions count: 1955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment.A06(com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A07(M4MessageReactionsReactorsFragment m4MessageReactionsReactorsFragment) {
        if (((C5pl) m4MessageReactionsReactorsFragment.A0Y.get()).A01(m4MessageReactionsReactorsFragment.A0D, m4MessageReactionsReactorsFragment.A0J)) {
            MailboxFeature mailboxFeature = (MailboxFeature) 7zN.A0m(m4MessageReactionsReactorsFragment, m4MessageReactionsReactorsFragment.A04, 84159);
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new Iaj(mailboxFeature, A0P, 22), A0P, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(M4MessageReactionsReactorsFragment m4MessageReactionsReactorsFragment) {
        HtJ htJ;
        ImmutableList A01;
        Capabilities capabilities = m4MessageReactionsReactorsFragment.A0J;
        if (capabilities == null || 4YU.A1Y(capabilities, 18) || m4MessageReactionsReactorsFragment.A01 == 0 || (htJ = m4MessageReactionsReactorsFragment.A0G) == null || (A01 = htJ.A01()) == null || A01.isEmpty()) {
            return;
        }
        int size = A01.size();
        int i = m4MessageReactionsReactorsFragment.A01;
        int i2 = i - 1;
        if (size > i2) {
            String str = (String) (m4MessageReactionsReactorsFragment.A0Q ? A01.get(i) : A01.get(i2));
            if (m4MessageReactionsReactorsFragment.A0a.containsKey(str)) {
                return;
            }
            ((GsM) 7zN.A0m(m4MessageReactionsReactorsFragment, m4MessageReactionsReactorsFragment.A04, 84159)).A00((MailboxCallback) null, str).addResultCallback(new Iar(m4MessageReactionsReactorsFragment, 1Bi.A03(16432), str, 9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0C(M4MessageReactionsReactorsFragment m4MessageReactionsReactorsFragment) {
        int andIncrement;
        String A18;
        HgE A00;
        HtJ htJ = m4MessageReactionsReactorsFragment.A0G;
        if (htJ == null || m4MessageReactionsReactorsFragment.A0S == null || m4MessageReactionsReactorsFragment.A0A == null) {
            return;
        }
        IAJ iaj = htJ.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = iaj.A08;
        r0.A08("com.facebook.messaging.reactions.plugins.interfaces.datahandlers.ReactionsReactorsDataHandlerInterfaceSpec", "messaging.reactions.datahandlers.ReactionsReactorsDataHandlerInterfaceSpec", "shouldWaitForLoadCompletion", andIncrement2);
        Exception e = null;
        try {
            IAJ.A00(iaj);
            boolean z = false;
            if (!IAJ.A02(iaj)) {
                if (IAJ.A01(iaj)) {
                    andIncrement = atomicInteger.getAndIncrement();
                    A18 = GOp.A18(r0, "shouldWaitForLoadCompletion", andIncrement);
                    try {
                        try {
                            z = AbK.A0o(iaj.A01.A05).AZk(36315340065809181L);
                        } catch (Exception e2) {
                            e = e2;
                            throw e;
                        }
                    } catch (Throwable th) {
                        r0.A04(e, A18, "messaging.reactions.datahandlers.ReactionsReactorsDataHandlerInterfaceSpec", "shouldWaitForLoadCompletion", andIncrement);
                        throw th;
                    }
                }
                r0.A02((Exception) null, "messaging.reactions.datahandlers.ReactionsReactorsDataHandlerInterfaceSpec", "shouldWaitForLoadCompletion", andIncrement2);
                if (z || m4MessageReactionsReactorsFragment.A0P) {
                    A00 = m4MessageReactionsReactorsFragment.A0G.A00();
                    ImmutableList A01 = m4MessageReactionsReactorsFragment.A0G.A01();
                    if (A00 != null || A01 == null || m4MessageReactionsReactorsFragment.A0J == null) {
                        return;
                    }
                    if (((C5pl) m4MessageReactionsReactorsFragment.A0Y.get()).A01(m4MessageReactionsReactorsFragment.A0D, m4MessageReactionsReactorsFragment.A0J) && m4MessageReactionsReactorsFragment.A0K == null) {
                        return;
                    }
                    m4MessageReactionsReactorsFragment.A0F = m4MessageReactionsReactorsFragment.A0S.A0m(A00, A01, ((User) m4MessageReactionsReactorsFragment.A0W.get()).A13, m4MessageReactionsReactorsFragment.A0U);
                    LithoView lithoView = (LithoView) m4MessageReactionsReactorsFragment.A0A.findViewById(2131365265);
                    Capabilities capabilities = m4MessageReactionsReactorsFragment.A0J;
                    m4MessageReactionsReactorsFragment.A0A = lithoView;
                    ViewGroup.LayoutParams layoutParams = lithoView.getLayoutParams();
                    int i = m4MessageReactionsReactorsFragment.A00;
                    int dimensionPixelSize = 7zO.A0D(m4MessageReactionsReactorsFragment).getDimensionPixelSize(2132279342);
                    int i2 = i * dimensionPixelSize;
                    if (i <= 4) {
                        i2 = dimensionPixelSize * 4;
                    }
                    int i3 = i2 + (dimensionPixelSize * 2);
                    double d = 7zO.A0I(m4MessageReactionsReactorsFragment.getContext()).heightPixels * 0.85d;
                    if (i3 > d) {
                        i3 = (int) d;
                    }
                    layoutParams.height = i3;
                    GkM gkM = new GkM(m4MessageReactionsReactorsFragment.A0A.A09, new 8nO());
                    MigColorScheme migColorScheme = m4MessageReactionsReactorsFragment.A0I;
                    1LI r02 = gkM.A01;
                    ((8nO) r02).A06 = migColorScheme;
                    BitSet bitSet = gkM.A02;
                    bitSet.set(0);
                    ((8nO) r02).A05 = m4MessageReactionsReactorsFragment.A0F;
                    bitSet.set(2);
                    ((8nO) r02).A00 = m4MessageReactionsReactorsFragment.A01;
                    bitSet.set(1);
                    ((8nO) r02).A08 = m4MessageReactionsReactorsFragment.A0Q;
                    bitSet.set(5);
                    ((8nO) r02).A04 = new BmU(m4MessageReactionsReactorsFragment, capabilities);
                    bitSet.set(3);
                    ((8nO) r02).A01 = m4MessageReactionsReactorsFragment.A03;
                    bitSet.set(4);
                    m4MessageReactionsReactorsFragment.A0E = gkM;
                    ThreadThemeInfo threadThemeInfo = m4MessageReactionsReactorsFragment.A0L;
                    if (threadThemeInfo != null) {
                        ((8nO) r02).A07 = threadThemeInfo.A0d;
                    }
                    ThreadSummary threadSummary = m4MessageReactionsReactorsFragment.A0D;
                    if (threadSummary != null) {
                        ((8nO) r02).A03 = threadSummary.A0n;
                        ((8nO) r02).A02 = threadSummary.A0g;
                    }
                    LithoView lithoView2 = m4MessageReactionsReactorsFragment.A0A;
                    7zP.A15(gkM, bitSet, gkM.A03);
                    lithoView2.A0y(r02);
                    return;
                }
                return;
            }
            andIncrement = atomicInteger.getAndIncrement();
            A18 = GOp.A1A(r0, "shouldWaitForLoadCompletion", andIncrement);
            r0.A09(A18, "messaging.reactions.datahandlers.ReactionsReactorsDataHandlerInterfaceSpec", "shouldWaitForLoadCompletion", andIncrement);
            r0.A02((Exception) null, "messaging.reactions.datahandlers.ReactionsReactorsDataHandlerInterfaceSpec", "shouldWaitForLoadCompletion", andIncrement2);
            if (z) {
            }
            A00 = m4MessageReactionsReactorsFragment.A0G.A00();
            ImmutableList A012 = m4MessageReactionsReactorsFragment.A0G.A01();
            if (A00 != null) {
            }
        } catch (Throwable th2) {
            r0.A02(e, "messaging.reactions.datahandlers.ReactionsReactorsDataHandlerInterfaceSpec", "shouldWaitForLoadCompletion", andIncrement2);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
    
        if (r310 == null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0E(com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment r301, com.facebook.xapp.messaging.capability.vector.Capabilities r302, java.lang.Integer r303, java.lang.String r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment.A0E(com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment, com.facebook.xapp.messaging.capability.vector.Capabilities, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (r0.A00(r0.A0Y, r0, r301.A0J, r0.A1T, java.lang.Boolean.valueOf(r0.A2i)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0F(com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A0D
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L59
            r0 = r301
            X.00i r0 = r0.A0c
            java.lang.Object r0 = r0.get()
            X.5pk r0 = (X.C5pk) r0
            r303 = r0
            r0 = r301
            com.facebook.messaging.model.messages.Message r0 = r0.A0B
            r302 = r0
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0V
            r304 = r0
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A0D
            r305 = r0
            r0 = r305
            com.google.common.collect.ImmutableSet r0 = r0.A1T
            r306 = r0
            r0 = r301
            com.facebook.xapp.messaging.capability.vector.Capabilities r0 = r0.A0J
            r307 = r0
            r0 = r305
            boolean r0 = r0.A2i
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r301 = r0
            r0 = r305
            com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType r0 = r0.A0Y
            r308 = r0
            r0 = r303
            r1 = r308
            r2 = r304
            r3 = r307
            r4 = r306
            r5 = r301
            boolean r0 = r0.A00(r1, r2, r3, r4, r5)
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 != 0) goto L5e
        L59:
            r0 = 0
            r310 = r0
            r0 = 0
            r302 = r0
        L5e:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment.A0F(com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment):boolean");
    }

    public 1iF A17() {
        return AbF.A0C(3815554831804296L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-1159957032);
        super.onCreate(bundle);
        this.A04 = 1BL.A0G(this);
        this.A0S = (AbR) 7zO.A0l(this, 600);
        this.A07 = 1BV.A00(67527);
        this.A0T = (65U) 7zN.A0m(this, this.A04, 49952);
        this.A08 = 1Lo.A02(this.A04, this, 81996);
        this.A09 = 1Lo.A02(this.A04, this, 50222);
        this.A06 = 1BQ.A02(82689);
        A0g(2, 2132608326);
        String A00 = 4YT.A00(186);
        boolean z = false;
        if (bundle != null) {
            this.A01 = bundle.getInt(AbE.A00(201));
            this.A0L = (ThreadThemeInfo) bundle.getParcelable("thread_theme_info_key");
            this.A0O = bundle.getBoolean("has_user_removed_reaction");
            this.A0C = (ThreadCustomization) bundle.getParcelable("thread_customization");
            this.A0D = (ThreadSummary) bundle.getParcelable(A00);
        } else {
            this.A01 = 0;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            i = -302215209;
        } else {
            this.A0B = (Message) bundle2.getParcelable(4YT.A00(ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE));
            this.A0D = (ThreadSummary) this.mArguments.getParcelable(A00);
            5yW r0 = (5yW) 1Bi.A03(67347);
            ThreadSummary threadSummary = this.A0D;
            if (threadSummary != null && r0.A03(5OA.A02(threadSummary))) {
                z = true;
            }
            this.A0U = z;
            if (this.A0B.A1V == null || this.A0T == null) {
                i = 1224810458;
            } else {
                Bundle bundle3 = this.mArguments;
                String A002 = 1BJ.A00(187);
                this.A0M = bundle3.containsKey(A002) ? null : Integer.valueOf(this.mArguments.getInt(A002));
                this.A0I = (MigColorScheme) this.mArguments.getParcelable("color_scheme");
                this.A0J = (Capabilities) this.mArguments.getParcelable("thread_capability");
                this.A0Q = this.mArguments.getBoolean("hide_all_tab");
                this.A0R = this.mArguments.getBoolean("should_not_sort_reaction");
                String string = this.mArguments.getString("reaction_clicked");
                this.A0G = new HtJ((HPU) C1Y6.A00(getContext(), "com_facebook_messaging_reactions_plugins_interfaces_datahandlers_ReactionsReactorsDataHandlerInterfaceSpec", "All", new Object[]{this.A0B.A0V, this.A0D, this.A0J, new HgE(), this.A0C, new ArrayListMultimap(), ((User) this.A0W.get()).A13, Boolean.valueOf(this.A0R), this.A0Z}));
                if (A0F(this)) {
                    this.A0K = this.A0B.A0i;
                }
                A06(this);
                if (string != null) {
                    this.A0N = string;
                    this.A01 = A05(this, string);
                }
                Message message = this.A0B;
                String str = message.A1V;
                ThreadKey threadKey = message.A0V;
                if (str != null && threadKey != null && ((C5pl) this.A0Y.get()).A01(this.A0D, this.A0J)) {
                    long A0r = threadKey.A0r();
                    Transformations.distinctUntilChanged(new 6CU(new AKY(str, 1Br.A0B(((BrG) 1Lo.A04(getContext(), this.A04, (1BY) null, 82197)).A00), 27), AUR.A00)).observe(this, new ILT(this, 5));
                    1Bn.A0A(147836);
                    Context context = getContext();
                    FbUserSession fbUserSession = this.A04;
                    boolean A01 = ((5lO) this.A0X.get()).A01(this.A0B.A0V);
                    11T.A0H(context, fbUserSession);
                    GVv gVv = new GVv(context, fbUserSession, null, str, A0r, A01);
                    gVv.A01.observe(this, new ILT(this, 7));
                    HtJ htJ = this.A0G;
                    if (htJ == null) {
                        i = 1044999794;
                    } else if (htJ.A00() == null) {
                        i = -1027210940;
                    } else {
                        this.A03 = new GXB(new J5x(gVv, this, 4));
                    }
                }
                ((C5xl) 1Bi.A03(67528)).ASY(this.A0B.A0V).observe(this, new ILT(this, 8));
                i = 1330983134;
            }
        }
        0FI.A08(i, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1523415473);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542552);
        LithoView lithoView = (LithoView) A08.findViewById(2131365265);
        this.A0A = lithoView;
        lithoView.getClass();
        0FI.A08(1358087767, A02);
        return A08;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(719298416);
        super.onDestroyView();
        6KV r0 = this.A05;
        if (r0 != null) {
            r0.A04();
        }
        0FI.A08(1603930167, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(AbE.A00(201), this.A01);
        bundle.putParcelable("thread_theme_info_key", this.A0L);
        bundle.putBoolean("has_user_removed_reaction", this.A0O);
        bundle.putParcelable("thread_customization", this.A0C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        this.A05 = ((82O) this.A0d.get()).A00(getContext());
        FrameLayout frameLayout = (FrameLayout) 7zL.A0F(this, 2131362343);
        this.A02 = frameLayout;
        frameLayout.setAlpha(0.0f);
        if (this.A02.getLayoutParams() != null) {
            this.A02.getLayoutParams().height = 7zO.A0I(getContext()).heightPixels;
        }
        IKE.A01(this.A02, this, 125);
    }
}
