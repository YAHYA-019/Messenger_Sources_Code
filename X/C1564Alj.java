package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MediatorLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.messaging.emoji.composerwithtext.EmojiPickerBottomSheet;
import com.facebook.messaging.magicwords.creation.longclick.MagicWordsLongClickBottomSheet;
import com.facebook.messaging.magicwords.model.MagicWord;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Alj, reason: case insensitive filesystem */
/* loaded from: Alj.class */
public final class C1564Alj extends 1pK implements 1pN {
    public static final CAf A0I = new Object();
    public static final String __redex_internal_original_name = "MagicWordsCreationFragment";
    public Dialog A00;
    public Dialog A01;
    public FbUserSession A02;
    public LithoView A03;
    public C6T A04;
    public C5ic A05;
    public 1pI A06;
    public final CkN A0E = new CkN(this);
    public final Bes A0F = new Bes(this);
    public final Ber A0D = new Ber(this);
    public final Bet A0G = new Bet(this);
    public final C5xv A0H = CxE.A00(this, 56);
    public final 1Br A07 = 7zN.A0I(this);
    public final 1Br A0B = 1Bu.A02(this, 1081);
    public final 1Br A08 = 1Bq.A00(66067);
    public final 1Br A09 = 1HG.A01(this, 100189);
    public final 1Br A0A = 1Bu.A02(this, 67734);
    public final C2iw A0C = new Object();

    public static final void A03(1Iw r301, Bes bes, MigColorScheme migColorScheme, C22a c22a, ImmutableList.Builder builder, Collection collection, int i) {
        if (collection.isEmpty()) {
            return;
        }
        if (C5yc.A00((C5yc) 1Bi.A03(66467)).AZk(36315700837033301L)) {
            builder.m11011add((Object) new C55c(null, null, 2K5.A04, migColorScheme, null, r301.A0D(i), null, null, null, 1, i, true));
        }
        Context context = r301.A0D;
        int A04 = 3yG.A04(4YU.A0C(context), 24.0f);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MagicWord magicWord = (MagicWord) it.next();
            C6ka AjQ = c22a.AjQ(magicWord.A02, A04);
            if (AjQ != null) {
                AnonymousClass557 A0p = 7zL.A0p();
                String str = magicWord.A03;
                A0p.A00 = str.hashCode();
                CharSequence BdF = 7zQ.A0u().BdF(context.getResources().getDimensionPixelSize(2KV.A07.textSizeResId), str);
                11T.A0A(BdF);
                A0p.A03(C5z6.A01(BdF, 3));
                A0p.A05 = new C58x(new 9bM(AjQ, (Integer) null, 0), migColorScheme.B9I());
                A0p.A02 = new Cvq(bes, magicWord, 2);
                AbJ.A1S(A0p, migColorScheme, builder);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C1564Alj c1564Alj) {
        1pI r0 = c1564Alj.A06;
        if (r0 != null) {
            if (!r0.BVa()) {
                return;
            }
            View view = c1564Alj.mView;
            ((InputMethodManager) 1Br.A0B(c1564Alj.A09)).hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
            1pI r02 = c1564Alj.A06;
            if (r02 != null) {
                r02.CeH("magic_words_fragment_tag");
                return;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(C1564Alj c1564Alj) {
        ImmutableList A0z;
        LithoView lithoView = c1564Alj.A03;
        String str = "lithoView";
        if (lithoView != null) {
            1Iw A0U = AbF.A0U(lithoView);
            C6T c6t = c1564Alj.A04;
            if (c6t == null) {
                str = "magicWordsViewData";
            } else {
                MigColorScheme A0m = 7zQ.A0m(c1564Alj.A07);
                LithoView lithoView2 = c1564Alj.A03;
                if (lithoView2 != null) {
                    WeakReference A14 = 7zL.A14(lithoView2);
                    CkN ckN = c1564Alj.A0E;
                    C5xv c5xv = c1564Alj.A0H;
                    Bes bes = c1564Alj.A0F;
                    Bet bet = c1564Alj.A0G;
                    06Z A08 = 7zN.A08(c1564Alj);
                    C22a c22a = (C22a) 1Br.A0B(c1564Alj.A08);
                    C2iw c2iw = c1564Alj.A0C;
                    7zT.A11(2, A0m, ckN, c5xv, bes);
                    11T.A0F(bet, 7);
                    7zR.A1Q(c22a, c2iw);
                    QF8 qf8 = new QF8(A0U, new C2021Azi());
                    C2021Azi c2021Azi = qf8.A01;
                    c2021Azi.A06 = A0m;
                    BitSet bitSet = qf8.A02;
                    bitSet.set(0);
                    MediatorLiveData mediatorLiveData = c6t.A06;
                    BlG blG = (BlG) mediatorLiveData.getValue();
                    c2021Azi.A00 = blG != null ? blG.A00 : 0;
                    bitSet.set(9);
                    LinkedHashMap A1C = 1BK.A1C();
                    BlG blG2 = (BlG) mediatorLiveData.getValue();
                    if (blG2 != null) {
                        A1C.putAll(blG2.A01);
                    }
                    Iterator it = c6t.A0K.iterator();
                    while (it.hasNext()) {
                        MagicWord magicWord = (MagicWord) it.next();
                        String str2 = magicWord.A03;
                        11T.A0A(str2);
                        String A13 = 1BK.A13(str2);
                        MagicWord magicWord2 = (MagicWord) A1C.get(A13);
                        if (magicWord2 != null && R0q.A00(magicWord, magicWord2)) {
                            A1C.remove(A13);
                        }
                    }
                    A1C.putAll(c6t.A0L);
                    Collection values = A1C.values();
                    11T.A0A(values);
                    if (values.isEmpty()) {
                        A0z = ImmutableList.of();
                    } else {
                        ImmutableList.Builder A0h = 4YU.A0h();
                        ArrayList A0s = AnonymousClass001.A0s();
                        for (Object obj : values) {
                            if (((MagicWord) obj).A00 == 3) {
                                A0s.add(obj);
                            }
                        }
                        A03(A0U, bes, A0m, c22a, A0h, A0s, 2131958992);
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        for (Object obj2 : values) {
                            if (((MagicWord) obj2).A00 == 0) {
                                A0s2.add(obj2);
                            }
                        }
                        A03(A0U, bes, A0m, c22a, A0h, A0s2, 2131958975);
                        int i = 9GF.A00;
                        int i2 = 9GF.A01;
                        LightColorScheme.A00();
                        A0z = AbG.A0z(A0h, new C55g(C1u7.A0A, A0m, 2KE.A04, BUF.A00(7zL.A0A(A0U), A0m, 2131958988), i, i2, i2, 1322466006L, false));
                    }
                    11T.A0A(A0z);
                    c2021Azi.A09 = A0z;
                    bitSet.set(5);
                    c2021Azi.A08 = c6t.A01;
                    bitSet.set(3);
                    c2021Azi.A0A = c6t.A02;
                    bitSet.set(4);
                    c2021Azi.A0B = A14;
                    bitSet.set(7);
                    c2021Azi.A04 = ckN;
                    bitSet.set(1);
                    c2021Azi.A07 = c5xv;
                    bitSet.set(8);
                    c2021Azi.A05 = bet;
                    bitSet.set(6);
                    c2021Azi.A01 = A08;
                    bitSet.set(2);
                    qf8.A0V();
                    qf8.A1w(c2iw);
                    lithoView.A0y(qf8.A2W());
                    return;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        if (r0.get(X.1BK.A13(r0.toString())) == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A08(X.C1564Alj r301) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1564Alj.A08(X.Alj):boolean");
    }

    public void A16() {
        long A0r;
        super.A16();
        C6T c6t = this.A04;
        if (c6t == null) {
            11T.A0L("magicWordsViewData");
            throw 0Q8.createAndThrow();
        }
        LinkedHashMap linkedHashMap = c6t.A0L;
        if (linkedHashMap.isEmpty() && c6t.A0K.isEmpty()) {
            return;
        }
        Object value = c6t.A07.getValue();
        if (value == null) {
            throw 1BK.A0h();
        }
        ThreadKey threadKey = (ThreadKey) value;
        if (!((2rT) 1Br.A0B(c6t.A0A)).A02(threadKey) && !threadKey.A0z()) {
            BlZ blZ = (BlZ) 1Br.A0B(c6t.A0E);
            FbUserSession fbUserSession = c6t.A08;
            HashSet hashSet = c6t.A0K;
            11T.A0F(hashSet, 3);
            ArrayList A0t = AnonymousClass001.A0t(linkedHashMap.size());
            Iterator A0x = AnonymousClass001.A0x(linkedHashMap);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                2Jd r0 = new 2Jd(56);
                r0.A09("emoji", ((MagicWord) A0z.getValue()).A02);
                r0.A09("magic_word", ((MagicWord) A0z.getValue()).A03);
                A0t.add(r0);
            }
            ArrayList A0z2 = 1BL.A0z(hashSet);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                A0z2.add(((MagicWord) it.next()).A03);
            }
            GraphQlCallInput dgU = new DgU(37);
            dgU.A09("thread_id", 1BK.A0w(threadKey));
            dgU.A0A("magic_words_to_add", A0t);
            dgU.A0A("magic_words_to_remove", A0z2);
            AbstractC05414dq A04 = 1VX.A04(blZ.A00, fbUserSession);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A01(dgU, "input");
            5Dh A00 = 5Dh.A00(A0M, new C01643sd(Q8B.class, "MessengerSetMagicWords", null, "input", "fbandroid", 2100944780, 128, 2828539721L, 2828539721L, false, true));
            4YU.A1J(A00, 442780740380519L);
            A04.A06(A00);
            return;
        }
        Beu beu = (Beu) 1Br.A0B(c6t.A0G);
        FbUserSession fbUserSession2 = c6t.A08;
        HashSet hashSet2 = c6t.A0K;
        7zR.A1N(threadKey, hashSet2);
        Set entrySet = linkedHashMap.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(4YV.A01(entrySet));
        Iterator it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry A0z3 = AnonymousClass001.A0z(it2);
            linkedHashMap2.put(A0z3.getKey(), 4YW.A0A("emoji", ((MagicWord) A0z3.getValue()).A02, 1BK.A1G("creation_timestamp_ms", String.valueOf(((MagicWord) A0z3.getValue()).A01))));
        }
        ArrayList A1E = C1A3.A1E(hashSet2);
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            A1E.add(((MagicWord) it3.next()).A03);
        }
        List A0V = 0QD.A0V(A1E);
        if (!threadKey.A0z()) {
            MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession2, beu.A00, 82467);
            if (threadKey.A1K()) {
                A0r = threadKey.A02;
            } else {
                if (!threadKey.A1F()) {
                    throw new UnsupportedOperationException();
                }
                A0r = threadKey.A0r();
            }
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            1Um.A02(A0O, new CyB(4, A0r, mailboxFeature, linkedHashMap2, A0V, A0P), A0P, false);
            return;
        }
        MailboxFeature mailboxFeature2 = (MailboxFeature) 4YU.A0o(fbUserSession2, beu.A00, 65961);
        1Bi.A03(68077);
        String A002 = 5QA.A00(threadKey);
        1Um A0O2 = 1BK.A0O(mailboxFeature2, 0);
        MailboxFutureImpl A0P2 = 1BK.A0P(A0O2);
        int A003 = 4uZ.A00(A0P2, (1X9) null);
        TraceInfo A02 = 4uZ.A02(A0P2, (LoggingOption) null, "MailboxSDK", "setThreadMagicWordsWithThreadIdentifier");
        if (!A0O2.Cj2(new Cyb(A0P2, linkedHashMap2, mailboxFeature2, A0V, A002, A003, 0))) {
            A0P2.cancel(false);
            4uZ.A03(A003);
            4uZ.A05((LoggingOption) null, A02, "MailboxSDK", "setThreadMagicWordsWithThreadIdentifier");
        }
        PlatformLogger.platformEventLog(5);
    }

    public 1iF A1R() {
        return AbF.A0C(442780740380519L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A02 = 1BM.A01(this);
        this.A05 = 7zQ.A0l();
    }

    public boolean Bkd() {
        return A08(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.onAttachFragment(fragment);
        if (fragment instanceof MagicWordsLongClickBottomSheet) {
            Ber ber = this.A0D;
            11T.A0F(ber, 0);
            ((MagicWordsLongClickBottomSheet) fragment).A00 = ber;
        } else if (fragment instanceof EmojiPickerBottomSheet) {
            ((EmojiPickerBottomSheet) fragment).A00 = new CkS(fragment, this, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int A02 = 0FI.A02(82029673);
        11T.A0F(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            ((1tC) 1Bn.A0A(16838)).A03(window, 7zQ.A0m(this.A07));
        }
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132542471, false);
        0FI.A08(-1166170362, A02);
        return A0G;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        C6T c6t = this.A04;
        if (c6t != null) {
            bundle.putParcelableArrayList("added_words_key", 1BK.A17(c6t.A0L.values()));
            C6T c6t2 = this.A04;
            if (c6t2 != null) {
                bundle.putParcelableArrayList("removed_words_key", 1BK.A17(c6t2.A0K));
                C6T c6t3 = this.A04;
                if (c6t3 != null) {
                    bundle.putParcelable("emoji_key", c6t3.A01);
                    C6T c6t4 = this.A04;
                    if (c6t4 != null) {
                        bundle.putCharSequence("input_text_key", c6t4.A02);
                        C6T c6t5 = this.A04;
                        if (c6t5 != null) {
                            bundle.putBoolean("draft_in_progress_key", c6t5.A03);
                            C6T c6t6 = this.A04;
                            if (c6t6 != null) {
                                bundle.putInt("suggestion_composer_state_key", c6t6.A00);
                                return;
                            }
                        }
                    }
                }
            }
        }
        11T.A0L("magicWordsViewData");
        throw 0Q8.createAndThrow();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v0 ??, still in use, count: 5, list:
          (r315v0 ??) from 0x0147: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:48:0x022f, B:49:0x0232, B:29:0x012d] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ??) from 0x0147: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:48:0x022f, B:49:0x0232, B:29:0x012d] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ?? I:X.C6T) from 0x00da: IPUT (r315v0 ?? I:X.C6T), (r301v0 'this' ?? I:X.Alj A[IMMUTABLE_TYPE, THIS]) X.Alj.A04 X.C6T
          (r315v0 ?? I:X.C6T) from 0x01d1: IGET (r0v86 ?? I:java.util.LinkedHashMap) = (r315v0 ?? I:X.C6T) X.C6T.A0L java.util.LinkedHashMap
          (r315v0 ?? I:X.C6T) from 0x0223: IGET (r0v90 ?? I:java.util.HashSet) = (r315v0 ?? I:X.C6T) X.C6T.A0K java.util.HashSet
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v0 ??, still in use, count: 5, list:
          (r315v0 ??) from 0x0147: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:48:0x022f, B:49:0x0232, B:29:0x012d] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ??) from 0x0147: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:48:0x022f, B:49:0x0232, B:29:0x012d] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ?? I:X.C6T) from 0x00da: IPUT (r315v0 ?? I:X.C6T), (r301v0 'this' ?? I:X.Alj A[IMMUTABLE_TYPE, THIS]) X.Alj.A04 X.C6T
          (r315v0 ?? I:X.C6T) from 0x01d1: IGET (r0v86 ?? I:java.util.LinkedHashMap) = (r315v0 ?? I:X.C6T) X.C6T.A0L java.util.LinkedHashMap
          (r315v0 ?? I:X.C6T) from 0x0223: IGET (r0v90 ?? I:java.util.HashSet) = (r315v0 ?? I:X.C6T) X.C6T.A0K java.util.HashSet
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
