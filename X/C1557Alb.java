package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.ui.keyboard.CustomKeyboardLayout;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.fb.fragment.LoggingConfiguration;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.lockchat.auth.AuthLockChatState;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.omnipicker.OmnipickerActivity;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Alb, reason: case insensitive filesystem */
/* loaded from: Alb.class */
public class C1557Alb extends 1pK implements 2Oc {
    public static final NavigationTrigger A1B = new NavigationTrigger(AnonymousClass539.A6x, null, "omni_picker", null, null, null, null, null, null, true);
    public static final BP4 A1C = BP4.INBOX;
    public static final String __redex_internal_original_name = "OmniPickerFragment";
    public int A00;
    public int A01;
    public Context A02;
    public 2O4 A03;
    public FbUserSession A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public LithoView A0B;
    public 5xF A0C;
    public ThreadKey A0D;
    public 4iI A0E;
    public ThreadSummary A0F;
    public CNi A0G;
    public C1B A0H;
    public CIq A0I;
    public M4OmnipickerParam A0J;
    public DIz A0K;
    public 5xJ A0L;
    public Cu5 A0N;
    public User A0O;
    public C1gs A0P;
    public Integer A0S;
    public String A0V;
    public ExecutorService A0W;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public 1PA A0g;
    public 1I7 A0h;
    public C1qb A0i;
    public Cc5 A0j;
    public CNd A0k;
    public C5ic A0l;
    public boolean A0n;
    public final C00i A0t = 1BQ.A01();
    public final C00i A0r = 1BQ.A02(84560);
    public final C00i A15 = AbF.A0S(this, 82534);
    public final C00i A16 = 1BV.A00(83474);
    public final C00i A0w = AbH.A0L();
    public final C00i A0p = AbF.A0S(this, 50095);
    public final C00i A10 = 1BV.A00(50179);
    public final C1gb A18 = AbJ.A0Z();
    public final C00i A11 = 1BV.A00(84280);
    public final C00i A1A = AbF.A0S(this, 936);
    public final C00i A17 = 1BV.A00(83459);
    public final C00i A0z = AbH.A0M();
    public final C00i A14 = AbI.A0K();
    public final C00i A0x = 1BV.A00(83462);
    public final C00i A19 = 1BV.A00(83613);
    public final C00i A13 = 1BQ.A02(67528);
    public final C00i A0q = 1BQ.A02(68684);
    public final C00i A0y = 1BV.A00(83460);
    public final C00i A0u = 1BV.A00(66691);
    public final C00i A0v = 1BQ.A02(33196);
    public final C00i A12 = 1BV.A00(68383);
    public final C00i A0o = 1BQ.A02(83479);
    public final C00i A0s = 1BV.A00(84334);
    public ImmutableList A0Q = ImmutableList.of();
    public ImmutableList A0R = ImmutableList.of();
    public String A0U = "";
    public String A0T = "";
    public boolean A0X = false;
    public BP4 A0M = A1C;
    public boolean A0Y = false;
    public boolean A0m = false;

    public static User A03(C1557Alb c1557Alb) {
        1UK r0 = (1UK) c1557Alb.A0u.get();
        new ArrayList(c1557Alb.A0Q);
        User A01 = r0.A01(0S2.A00);
        A01.getClass();
        return A01;
    }

    private void A06() {
        ImmutableList of;
        boolean isEmpty = this.A0Q.isEmpty();
        CNd A1X = A1X();
        if (isEmpty) {
            of = ImmutableList.of();
        } else {
            List A00 = 1UK.A00((1UK) this.A0u.get());
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                A0s.add(AbG.A0t(it).A0k);
            }
            of = ImmutableList.copyOf((Collection) A0s);
        }
        11T.A0F(of, 0);
        ((CQ1) 1Br.A0B(A1X.A07)).A04 = of;
    }

    private void A07() {
        A08();
        ((CN9) this.A07.get()).A02(this.A0Q);
        A06();
        if (this.A0Q.isEmpty()) {
            if (this.A0D != null) {
                this.A0D = null;
                A0R(false);
                C1B c1b = this.A0H;
                if (c1b != null) {
                    OmnipickerActivity.A12((ThreadKey) null, c1b.A00);
                }
            }
            A0G(this);
        }
        A1Z(0S2.A01);
    }

    private void A08() {
        CNd A1X;
        Integer num;
        if (A0W(this)) {
            return;
        }
        if (this.A0Q.isEmpty()) {
            A1X = A1X();
            if (!this.A0n) {
                num = 0S2.A00;
            }
            num = 0S2.A1G;
        } else {
            if (this.A0Q.size() <= 0) {
                return;
            }
            A1X = A1X();
            if (((User) 1BK.A0r(this.A0Q)).A0G()) {
                num = 0S2.A0C;
            } else {
                if (!this.A0n) {
                    num = 0S2.A0N;
                }
                num = 0S2.A1G;
            }
        }
        A1X.A03(num);
    }

    public static void A09(DialogInterface.OnClickListener onClickListener, C1557Alb c1557Alb) {
        Context context = c1557Alb.A02;
        DR6 A01 = C5ic.A01(context, AbI.A0d(context));
        A01.A00(2131954653);
        A01.A06(2131954651);
        A01.A0B((DialogInterface.OnClickListener) null, 2131954652);
        A01.A0D(onClickListener, 2131954650);
        A01.A05();
    }

    public static void A0A(RankingLoggingItem rankingLoggingItem, ThreadSummary threadSummary, C1557Alb c1557Alb, DataSourceIdentifier dataSourceIdentifier, 53N r305, DK4 dk4, int i, int i2) {
        Long A0l;
        53N r310 = r305;
        C6pc A01 = C6pc.A01(dataSourceIdentifier.BFN());
        boolean z = true;
        if ((A01 != C6pc.TINCAN && A01 != C6pc.ARMADILLO) || !C1gb.A02(c1557Alb.A18).AZk(36315254158991980L)) {
            z = false;
        }
        5xF r0 = c1557Alb.A0C;
        String str = c1557Alb.A0T;
        boolean A1X = AbK.A1X(c1557Alb.A0A, threadSummary);
        ThreadKey threadKey = threadSummary.A0n;
        String A0w = threadKey == null ? null : 1BK.A0w(threadKey);
        ThreadKey threadKey2 = threadSummary.A0l;
        if (threadKey2 == null || (A0l = 4YU.A0l(threadKey2)) == null || !6EX.A02(A0l, threadSummary.A06)) {
            r310 = 53N.A03;
        }
        r0.A01(rankingLoggingItem, threadSummary, dataSourceIdentifier, r310, dk4, Integer.valueOf(i), Integer.valueOf(i2), AbF.A15(threadSummary), A0w, str, (String) null, A1X, true);
        c1557Alb.A0I.A03(false);
        A0O(c1557Alb, c1557Alb.A0T);
        A0D(threadKey, c1557Alb, z);
    }

    public static void A0B(ThreadKey threadKey, C1557Alb c1557Alb) {
        if (Objects.equal(c1557Alb.A0D, threadKey)) {
            return;
        }
        boolean z = false;
        if (threadKey == null) {
            c1557Alb.A0d = true;
            if (c1557Alb.A0Q.size() >= 2) {
                z = true;
            }
            Preconditions.checkArgument(z);
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.m11011add((Object) A03(c1557Alb));
            A0C(CN5.A00((CN5) c1557Alb.A08.get(), AbG.A0y(builder, c1557Alb.A0Q), 4YT.A00(1353), (String) null), c1557Alb);
            return;
        }
        c1557Alb.A0d = false;
        C00i c00i = c1557Alb.A12;
        c00i.get();
        if (!7QK.A02()) {
            A0C(threadKey, c1557Alb);
            return;
        }
        C00i c00i2 = c1557Alb.A0o;
        if (((AuthLockChatState) c00i2.get()).A01.get()) {
            return;
        }
        ((AuthLockChatState) c00i2.get()).A01.set(true);
        ((7QK) c00i.get()).A03(c1557Alb.A02, c1557Alb.A04, threadKey, new DBh(threadKey, c1557Alb, 1), new DBg(c1557Alb, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f2, code lost:
    
        if (X.AbG.A0u(r302.A0Q, 0).A0A() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0C(com.facebook.messaging.model.threadkey.ThreadKey r301, X.C1557Alb r302) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557Alb.A0C(com.facebook.messaging.model.threadkey.ThreadKey, X.Alb):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0D(ThreadKey threadKey, C1557Alb c1557Alb, boolean z) {
        if (!z) {
            ((C5xl) c1557Alb.A13.get()).ASY(threadKey).observe(c1557Alb, new CaD(c1557Alb, threadKey, 34));
        }
        C1B c1b = c1557Alb.A0H;
        if (c1b != null) {
            OmnipickerActivity.A12(threadKey, c1b.A00);
            OmnipickerActivity.A15(c1557Alb.A0H.A00);
        }
    }

    public static void A0E(C1557Alb c1557Alb) {
        if (c1557Alb.A0C != null) {
            if (c1557Alb.A0R.isEmpty()) {
                c1557Alb.A0Q(ImmutableList.of());
            } else {
                c1557Alb.A0Q(c1557Alb.A0R);
                c1557Alb.A0R = ImmutableList.of();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.TextView, com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView] */
    public static void A0F(C1557Alb c1557Alb) {
        CNi cNi = c1557Alb.A0G;
        cNi.A0C.getClass();
        ?? r0 = cNi.A0C;
        r0.A0G.clear();
        Editable editableText = r0.getEditableText();
        for (DOS dos : (DOS[]) TokenizedAutoCompleteTextView.A0A(r0, DOS.class)) {
            editableText.removeSpan(dos);
        }
        editableText.clear();
        1Du it = c1557Alb.A0Q.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            CNi cNi2 = c1557Alb.A0G;
            cNi2.A0C.getClass();
            11T.A0D(A0t);
            11T.A0F(A0t, 1);
            cNi2.A0C.A0D(new BJK(A0t));
        }
    }

    public static void A0G(C1557Alb c1557Alb) {
        boolean z = !1JF.A0A(c1557Alb.A0T);
        String A02 = c1557Alb.A0G.A02();
        if (A02 == null) {
            A02 = "";
        }
        c1557Alb.A0T = A02;
        boolean z2 = !1JF.A0A(A02);
        if (z2 != z) {
            A0M(c1557Alb, ImmutableList.of(), false);
        }
        A0N(c1557Alb, (z2 || c1557Alb.A0Q.isEmpty()) ? 0S2.A00 : 0S2.A01);
        c1557Alb.A1X().A02(c1557Alb.A0Q, A02);
        c1557Alb.A0a = c1557Alb.A1X().A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0H(C1557Alb c1557Alb, int i) {
        if (c1557Alb.A0D == null) {
            c1557Alb.A0C.A04((ThreadSummary) null, false);
        } else {
            ((C5xl) c1557Alb.A13.get()).ASY(c1557Alb.A0D).observe(c1557Alb, new C9qk(i, 0, c1557Alb));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0I(C1557Alb c1557Alb, M4OmnipickerParam m4OmnipickerParam) {
        1BK.A0W().A0B(((Bzc) 1Bn.A0A(68697)).A00(c1557Alb.A02, m4OmnipickerParam, ImmutableList.of()), c1557Alb, 1001);
        c1557Alb.A0m = true;
    }

    public static void A0J(C1557Alb c1557Alb, DK4 dk4, User user, int i, int i2) {
        c1557Alb.A0C.A05(53N.A02(user), dk4, user.A13, i, i2);
        c1557Alb.A0Q = ImmutableList.copyOf((Iterable) 2Ri.A03(new D3P(c1557Alb, user, 1), c1557Alb.A0Q));
        if (!5xJ.A01(user)) {
            c1557Alb.A00--;
        } else if (user.A0D()) {
            c1557Alb.A01--;
        }
        c1557Alb.A07();
    }

    public static void A0K(C1557Alb c1557Alb, BOz bOz) {
        if (c1557Alb.A0D == null || c1557Alb.A0Q.isEmpty() || c1557Alb.A0D == null) {
            return;
        }
        if (c1557Alb.A0Q.size() != 0) {
            c1557Alb.A0Q.size();
        }
        5xF r0 = c1557Alb.A0C;
        ImmutableList A08 = c1557Alb.A0L.A08(c1557Alb.A0Q);
        ThreadKey threadKey = c1557Alb.A0D;
        r0.A07(c1557Alb.A0L.A05(threadKey), bOz, A08, (Long) null, 5xJ.A00(threadKey), false, ((AnonymousClass545) c1557Alb.A0A.get()).A04(c1557Alb.A0Q));
    }

    public static void A0L(C1557Alb c1557Alb, User user) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(c1557Alb.A0Q);
        c1557Alb.A0Q = AbG.A0z(builder, user);
        c1557Alb.A0f = true;
        c1557Alb.A07();
        CNi cNi = c1557Alb.A0G;
        cNi.A0C.getClass();
        11T.A0D(user);
        11T.A0F(user, 1);
        cNi.A0C.A0D(new BJK(user));
        if (!5xJ.A01(user)) {
            c1557Alb.A00++;
        } else if (user.A0D()) {
            c1557Alb.A01++;
        }
    }

    public static void A0M(C1557Alb c1557Alb, ImmutableList immutableList, boolean z) {
        C00i c00i = c1557Alb.A10;
        ((C6tg) c00i.get()).A0A(c1557Alb.A02);
        LithoView lithoView = c1557Alb.A0B;
        2dD A00 = C2dB.A00(c1557Alb.A0i);
        C2ki A04 = ((C6tg) c00i.get()).A04(new ChF(7zQ.A0e(), (2Mb) 1Bi.A03(68519), c1557Alb, immutableList, z));
        A04.A2j(true);
        A04.A2Z(c1557Alb.A03);
        A04.A2c(new 2AW());
        A04.A2J(c1557Alb.A0G.A02());
        A04.A2K("omnipicker_home_suggestions_list");
        A00.A2X(A04.A2W());
        lithoView.A0y(A00.A2W());
    }

    public static void A0N(C1557Alb c1557Alb, Integer num) {
        if (c1557Alb.A0S != num) {
            c1557Alb.A0S = num;
            int intValue = num.intValue();
            if (intValue == 0) {
                if (c1557Alb.A0T()) {
                    CNi cNi = c1557Alb.A0G;
                    1hM A00 = cNi.A0S.A00();
                    1Kd.A0D(cNi.A0M, D4q.A00(cNi, 60), A00);
                    c1557Alb.A0b = true;
                } else {
                    c1557Alb.A0G.A03();
                    c1557Alb.A0b = false;
                }
                c1557Alb.A0S(true, 7zM.A1b(c1557Alb.A0Q));
                DPX dpx = c1557Alb.A0G.A0C;
                if (dpx != null) {
                    dpx.requestFocus();
                }
                CNi cNi2 = c1557Alb.A0G;
                cNi2.A0F = false;
                cNi2.A05.setVisibility(4);
                return;
            }
            if (intValue != 1) {
                c1557Alb.A0G.A03();
                CNi cNi3 = c1557Alb.A0G;
                cNi3.A0F = true;
                cNi3.A05.setVisibility(0);
                c1557Alb.A0S(false, true);
                C1B c1b = c1557Alb.A0H;
                if (c1b != null) {
                    OmnipickerActivity.A15(c1b.A00);
                    A0K(c1557Alb, BOz.A08);
                    return;
                }
                return;
            }
            if (c1557Alb.A0T()) {
                CNi cNi4 = c1557Alb.A0G;
                1hM A002 = cNi4.A0S.A00();
                1Kd.A0D(cNi4.A0M, D4q.A00(cNi4, 60), A002);
                c1557Alb.A0b = true;
            } else {
                c1557Alb.A0G.A03();
                c1557Alb.A0b = false;
            }
            DPX dpx2 = c1557Alb.A0G.A0C;
            if (dpx2 != null) {
                dpx2.requestFocus();
            }
            CNi cNi5 = c1557Alb.A0G;
            cNi5.A0F = true;
            cNi5.A05.setVisibility(0);
            c1557Alb.A0S(false, true);
        }
    }

    public static void A0O(C1557Alb c1557Alb, String str) {
        if (c1557Alb.A0C.A0C()) {
            c1557Alb.A0C.A09(c1557Alb.A0I.A02(), str);
            c1557Alb.A0I.A0B.clear();
        }
    }

    public static void A0P(C1557Alb c1557Alb, boolean z) {
        Integer num = (c1557Alb.A0Q.size() <= 0 || !((User) 1BK.A0r(c1557Alb.A0Q)).A0G()) ? z ? 0S2.A01 : c1557Alb.A0n ? 0S2.A1G : 0S2.A00 : 0S2.A0C;
        if (c1557Alb.A1X().A01 != num) {
            c1557Alb.A1X().A03(num);
            A0G(c1557Alb);
        }
    }

    private void A0Q(ImmutableList immutableList) {
        if (this.A0Q.equals(immutableList)) {
            return;
        }
        this.A0Q = immutableList;
        A0F(this);
        this.A00 = 0;
        this.A01 = 0;
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            if (!5xJ.A01(A0t)) {
                this.A00++;
            } else if (A0t.A0D()) {
                this.A01++;
            }
        }
        A07();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (com.facebook.messaging.model.threadkey.ThreadKey.A0l(r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0R(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0D
            r303 = r0
            r0 = r303
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0j(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L36
            r0 = r303
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0f(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L36
            r0 = r303
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0h(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L36
            r0 = r303
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0m(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L36
            r0 = r303
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0l(r0)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L38
        L36:
            r0 = 1
            r304 = r0
        L38:
            r0 = r302
            if (r0 == 0) goto L5f
            r0 = r304
            if (r0 == 0) goto L5f
            r0 = r301
            boolean r0 = r0.A0b
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L5f
            r0 = r301
            X.CNi r0 = r0.A0G
            r303 = r0
            r0 = r303
            r1 = 1
            r0.A0G = r1
            r0 = 0
            r304 = r0
            r0 = r303
            r1 = 0
            r0.A0H = r1
        L5a:
            r0 = r303
            X.CNi.A01(r0)
            return
        L5f:
            r0 = r301
            X.CNi r0 = r0.A0G
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            r1 = 0
            r0.A0G = r1
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557Alb.A0R(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0S(boolean z, boolean z2) {
        06Z r0 = this.mFragmentManager;
        LithoView lithoView = this.A0B;
        if (lithoView == null || r0 == null) {
            return;
        }
        int i = 8;
        if (z) {
            i = 0;
        }
        lithoView.setVisibility(i);
        if (this.A0K != null) {
            C06c A0G = 7zL.A0G(r0);
            Fragment BFQ = this.A0K.BFQ();
            if (z2) {
                A0G.A0K(BFQ);
            } else {
                A0G.A0H(BFQ);
            }
            C06c.A00(A0G, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (X.AbF.A1Y(X.C1gs.A00(r302), 36317259911998570L) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0T() {
        /*
            r301 = this;
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0Q
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L38
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0Q
            r302 = r0
            r0 = r302
            boolean r0 = X.5xJ.A03(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L74
            r0 = r301
            X.1gb r0 = r0.A18
            r302 = r0
            r0 = r302
            X.1CO r0 = X.C1gb.A02(r0)
            r304 = r0
            r0 = 36315254159712881(0x810488001e2271, double:3.029251188169152E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L74
        L38:
            r0 = r301
            boolean r0 = A0V(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L74
            r0 = r301
            X.1gs r0 = r0.A0P
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L5b
            r0 = 66804(0x104f4, float:9.3612E-41)
            r303 = r0
            r0 = r303
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.1gs r0 = (X.C1gs) r0
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0P = r1
        L5b:
            r0 = r302
            X.1CO r0 = X.C1gs.A00(r0)
            r304 = r0
            r0 = 36317259911998570(0x81065b00452c6a, double:3.030519633991138E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.AbF.A1Y(r0, r1)
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 == 0) goto L78
        L74:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L78:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557Alb.A0T():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r301.A0G.A05() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0U(X.C1557Alb r301) {
        /*
            r0 = r301
            java.lang.Integer r0 = r0.A0S
            r302 = r0
            java.lang.Integer r0 = X.0S2.A00
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L3c
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0Q
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3c
            r0 = r301
            java.lang.String r0 = r0.A0T
            r303 = r0
            r0 = r303
            boolean r0 = X.1JF.A0B(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3c
            r0 = r301
            X.CNi r0 = r0.A0G
            r303 = r0
            r0 = r303
            boolean r0 = r0.A05()
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L40
        L3c:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L40:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557Alb.A0U(X.Alb):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (X.AbF.A1Y(X.C1gb.A02(r0), 2342162163202340470L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0V(X.C1557Alb r301) {
        /*
            r0 = r301
            X.1gs r0 = r0.A0P
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1a
            r0 = 66804(0x104f4, float:9.3612E-41)
            r303 = r0
            r0 = r303
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.1gs r0 = (X.C1gs) r0
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0P = r1
        L1a:
            r0 = r302
            boolean r0 = r0.A02()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4a
            r0 = r301
            X.1gb r0 = r0.A18
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0J()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4a
            r0 = r304
            X.1CO r0 = X.C1gb.A02(r0)
            r301 = r0
            r0 = 2342162163202340470(0x2081081400093676, double:4.064868534374758E-152)
            r305 = r0
            r0 = r301
            r1 = r305
            boolean r0 = X.AbF.A1Y(r0, r1)
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 != 0) goto L4e
        L4a:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L4e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557Alb.A0V(X.Alb):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (A0V(r301) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0W(X.C1557Alb r301) {
        /*
            r0 = r301
            X.00i r0 = r0.A14
            X.1SI r0 = X.AbG.A0p(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A09()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L38
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0Q
            r302 = r0
            r0 = r302
            boolean r0 = X.5xJ.A03(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L38
            r0 = r301
            X.CNi r0 = r0.A0G
            r302 = r0
            r0 = r302
            boolean r0 = r0.A05()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L38
            r0 = r301
            boolean r0 = A0V(r0)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L3c
        L38:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L3c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557Alb.A0W(X.Alb):boolean");
    }

    public static boolean A0X(C1557Alb c1557Alb, ImmutableList immutableList) {
        if (!c1557Alb.A0b && immutableList.size() > 1 && ((C1Z) c1557Alb.A19.get()).A00(immutableList)) {
            return true;
        }
        if (!A0W(c1557Alb)) {
            return false;
        }
        int size = immutableList.size();
        1SI A0p = AbG.A0p(c1557Alb.A14);
        return size == 1 ? A0p.A03() : A0p.A02();
    }

    public 1iF A1R() {
        return AbJ.A0D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        String A0t;
        this.A02 = requireContext();
        this.A04 = 1BL.A0G(this);
        this.A0E = (4iI) 1Hv.A02(this.A02, 67720);
        this.A0j = (Cc5) 1Bn.A0E(this.A02, (1BY) null, 83483);
        this.A0h = (1I7) 1Hv.A02(this.A02, 65728);
        this.A0W = (ExecutorService) 1Bi.A03(16456);
        this.A08 = 1Lo.A02(this.A04, this, 83581);
        this.A0l = AbJ.A0c();
        this.A0A = 1Lo.A02(this.A04, this, 49481);
        this.A06 = 1Lo.A02(this.A04, this, 84719);
        this.A07 = 1Lo.A02(this.A04, this, 83461);
        this.A09 = 1Lo.A02(this.A04, this, 68785);
        this.A05 = new 1MV(this.A04, 68275);
        C00i c00i = this.A10;
        ((C6tg) c00i.get()).A0A(this.A02);
        ((C6tg) c00i.get()).A0D(LoggingConfiguration.A00("OmnipickerFragment").A00());
        A1T(((C6tg) c00i.get()).A0A);
        int i = 5;
        if (!((C5ya) 1Br.A0B(((C5yp) 1Br.A0B(((C31) 1Bn.A0A(82796)).A00)).A00)).A00()) {
            i = 0;
        }
        this.A0n = AnonymousClass001.A1P(i);
        if (bundle != null) {
            this.A0M = BP4.values()[bundle.getInt("omnipicker_entry_surface")];
            bundle.getInt("logger_session_funnel_id", -1);
        }
        C1F6 A0P = AbF.A0P(this.A1A);
        Context context = this.A02;
        Bg8 bg8 = new Bg8(this);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            CNi cNi = new CNi(context, A0P, bg8);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0G = cNi;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("typeahead_state");
                CNi cNi2 = this.A0G;
                cNi2.A0E = bundle2.getBoolean("KEY_IS_TINCAN_MODE_ON");
                cNi2.A0G = bundle2.getBoolean("KEY_SHOW_RTC_BUTTON");
                cNi2.A0F = bundle2.getBoolean("KEY_SHOW_ADD_BUTTON");
                A0t = bundle.getString("session_id");
            } else {
                A0t = 1BK.A0t();
            }
            this.A0V = A0t;
            this.A03 = new C1374Afg(this, 9);
            this.A0j.A01 = new C1618Anw(this, 7);
            1P9 r0 = new 1P9(this.A0h);
            D0U.A01(r0, this, 1BJ.A00(378), 24);
            D0U.A01(r0, this, 1BJ.A00(379), 23);
            1PA A02 = r0.A02();
            this.A0g = A02;
            A02.A00();
            1Bn.A0A(83616);
            53M r02 = 53M.A0L;
            5xF r03 = new 5xF(this.A02, this.A04, r02);
            this.A0C = r03;
            if (!r03.A0C()) {
                this.A0C.A08(this.A0M);
            }
            final BW3 bw3 = (BW3) 1Bn.A0A(83480);
            1BK.A1E(this.A0w).execute(new Runnable() { // from class: X.D84
                public static final String __redex_internal_original_name = "OmniPickerFragment$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    C1557Alb c1557Alb = C1557Alb.this;
                    FbUserSession fbUserSession = c1557Alb.A04;
                    Context context2 = c1557Alb.A02;
                    1BL.A1F(fbUserSession, context2);
                    1Br A00 = 1Bq.A00(49352);
                    BW2.A00(context2, fbUserSession, 1Bu.A01(context2, 84349), 1Bq.A00(66265), 1Bu.A01(context2, 33205), 1Bu.A01(context2, 84426), AbG.A0S(), A00, 53M.A0L);
                }
            });
            CIq A00 = ((C1E) 1Bi.A03(83397)).A00(getContext(), r02);
            this.A0I = A00;
            A00.A03(false);
            ((AnonymousClass472) 1Bn.A0E(this.A02, (1BY) null, 67579)).A00(AbJ.A0m().A0k).A01(new Cjr(this, 3));
            1Bn.A0A(49876);
            this.A0L = new 5xJ(this.A04, 7zL.A14(requireContext()));
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CNd A1X() {
        if (this instanceof B7F) {
            B7F b7f = (B7F) this;
            CNd cNd = b7f.A00;
            if (cNd == null) {
                1Bn.A0A(84279);
                cNd = new CNd(b7f.requireContext(), b7f.A04, 53M.A0M, (String) null);
                b7f.A00 = cNd;
            }
            return cNd;
        }
        if (this.A0k == null) {
            Co5 co5 = new Co5(this, 3);
            1Bn.A0A(84279);
            CNd cNd2 = new CNd(requireContext(), this.A04, 53M.A0L, CIR.A00(this.A0C.A02));
            this.A0k = cNd2;
            cNd2.A01(this.A04, co5);
        }
        return this.A0k;
    }

    public void A1Y(Bundle bundle) {
        this.A0c = true;
        this.A0U = bundle.getString("search_text", "");
        this.A0Q = ImmutableList.copyOf((Collection) bundle.getParcelableArrayList("picked_users_key"));
        A08();
        A06();
        A0B((ThreadKey) bundle.getParcelable("selected_thread_key"), this);
        this.A0d = bundle.getBoolean("should_create_pending_thread_key", false);
        this.A0V = bundle.getString("session_id", "");
        this.A00 = bundle.getInt("num_group_xac_ineligible_users_selected", 0);
        this.A01 = bundle.getInt("num_xac_users_selected", 0);
        CNi cNi = this.A0G;
        cNi.A0E = bundle.getBoolean("is_tincan_mode_on");
        CNi.A01(cNi);
        CNi.A00(cNi);
    }

    public void A1Z(Integer num) {
        this.A0j.AEC();
        if (this.A0Q.isEmpty()) {
            return;
        }
        A0N(this, num);
        if (this.A0Q.size() == 1) {
            User A0u = AbG.A0u(this.A0Q, 0);
            if (A0V(this)) {
                1FV A03 = ((CNa) 1Bn.A0E(this.A02, (1BY) null, 82461)).A03(this.A04, A0u, false);
                A03.addListener(new D86(this, A03), 1BK.A1E(this.A0w));
                return;
            } else if (!A0W(this) || !AbG.A0p(this.A14).A03()) {
                UserKey userKey = A0u.A0k;
                A0B(A0W(this) ? ((CbB) this.A15.get()).A00(userKey.id) : AbH.A0l(this.A0E, userKey), this);
                return;
            }
        }
        Cc5 cc5 = this.A0j;
        User A032 = A03(this);
        ImmutableList immutableList = this.A0Q;
        cc5.A00(CED.A00(A032, immutableList, false, A0X(this, immutableList)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1a(boolean z) {
        DIz dIz;
        if (!z && (dIz = this.A0K) != null) {
            if (!dIz.BRG()) {
                A09(CSG.A00(this, ActionId.MESSENGER_QUEUE_CREATION), this);
                return;
            }
            if (this.A0Q.size() >= 2 && (this.A0d || this.A0Z)) {
                CSG A00 = CSG.A00(this, 127);
                CSG A002 = CSG.A00(this, 128);
                Context context = this.A02;
                DR6 A01 = C5ic.A01(context, AbI.A0d(context));
                A01.A00(2131963346);
                A01.A06(2131963344);
                A01.A0B(A002, 2131963345);
                A01.A0D(A00, 2131963343);
                A01.A05();
                return;
            }
            if (this.A0K.Bkd()) {
                return;
            }
            CNi cNi = this.A0G;
            DPX dpx = cNi.A0C;
            if (dpx != null) {
                7zR.A12(dpx, cNi.A0J);
            }
        }
        C1B c1b = this.A0H;
        if (c1b != null) {
            OmnipickerActivity.A16(c1b.A00);
            this.A0I.A03(false);
            if (this.A0Q.isEmpty() && this.A0R.isEmpty()) {
                A0O(this, this.A0T);
            }
            AbI.A1P((C9kO) this.A0q.get(), 20);
            if (this.A0D != null) {
                CaE.A02(this, ((C5xl) this.A13.get()).ASY(this.A0D), ActionId.LEGACY_MARKER);
                return;
            }
            5xF r0 = this.A0C;
            if (this.A0Q.size() != 0) {
                this.A0Q.size();
            }
            r0.A02((ThreadSummary) null, this.A0L.A05(this.A0D), this.A0L.A08(this.A0Q), 5xJ.A00(this.A0D), false, ((AnonymousClass545) this.A0A.get()).A04(this.A0Q));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomKeyboardLayout AgH() {
        return (CustomKeyboardLayout) 7zL.A0F(this, 2131363501);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1318788139);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        if (bundle != null) {
            A1Y(bundle);
        }
        0FI.A08(-680651176, A02);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C1B c1b;
        if (i2 == -1 && i == 1001 && (c1b = this.A0H) != null) {
            c1b.A00.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (!z || i2 == 0) {
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i2);
        loadAnimation.setAnimationListener(new ECJ(this, 0));
        return loadAnimation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x07ae, code lost:
    
        if (r324 == 0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v193, types: [android.widget.TextView, com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView] */
    /* JADX WARN: Type inference failed for: r0v212, types: [com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v345, types: [int[], int[][]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 2027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557Alb.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(453817572);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        this.A0g.A01();
        DIz dIz = this.A0K;
        if (dIz != null && !this.A0Y) {
            dIz.Cn5(null);
        }
        ((C6tg) this.A10.get()).A06();
        0FI.A08(-2098096068, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        DPX dpx;
        int A02 = 0FI.A02(-148981594);
        super/*androidx.fragment.app.Fragment*/.onPause();
        Cu5 cu5 = this.A0N;
        if (cu5 != null) {
            cu5.dismiss();
        }
        CNi cNi = this.A0G;
        if (cNi != null && (dpx = cNi.A0C) != null) {
            7zR.A12(dpx, cNi.A0J);
        }
        DIz dIz = this.A0K;
        if (dIz != null) {
            dIz.BO5();
        }
        0FI.A08(115557445, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        C1B c1b;
        int A02 = 0FI.A02(1585425635);
        super/*androidx.fragment.app.Fragment*/.onResume();
        5xF r0 = this.A0C;
        if (!r0.A0C() && !((CIR) r0.A02.get()).A03 && (c1b = this.A0H) != null) {
            c1b.A00.finish();
        }
        0FI.A08(1608305208, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("selected_thread_key", this.A0D);
        bundle.putParcelableArrayList("picked_users_key", 1BK.A17(this.A0Q));
        bundle.putInt("omnipicker_entry_surface", this.A0M.ordinal());
        bundle.putBoolean("should_create_pending_thread_key", this.A0d);
        AbF.A1I(bundle, this.A0V);
        bundle.putInt("num_group_xac_ineligible_users_selected", this.A00);
        bundle.putInt("num_xac_users_selected", this.A01);
        bundle.putBoolean("is_tincan_mode_on", this.A0G.A05());
        Bundle A05 = 1BK.A05();
        CNi cNi = this.A0G;
        A05.putBoolean("KEY_IS_TINCAN_MODE_ON", cNi.A0E);
        A05.putBoolean("KEY_SHOW_RTC_BUTTON", cNi.A0G);
        A05.putBoolean("KEY_SHOW_ADD_BUTTON", cNi.A0F);
        bundle.putBundle("typeahead_state", A05);
        bundle.putString("search_text", this.A0G.A02());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(1199742742);
        super/*androidx.fragment.app.Fragment*/.onStart();
        this.A0I.A03(true);
        0FI.A08(1589654911, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(-1663895591);
        super/*androidx.fragment.app.Fragment*/.onStop();
        if (!this.A0m) {
            this.A0I.A03(false);
        }
        this.A0m = false;
        0FI.A08(-880371075, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        1BK.A0U(this.A0z).markerStart(26425574);
        A1X();
        CNi cNi = this.A0G;
        TextWatcher bji = new BJI(this, 1);
        cNi.A0C.getClass();
        cNi.A0C.addTextChangedListener(bji);
        A1X().A02(this.A0Q, "");
        if (bundle == null) {
            A0E(this);
        }
        CNi cNi2 = this.A0G;
        Bg5 bg5 = new Bg5(this);
        cNi2.A0C.getClass();
        cNi2.A0C.A09 = new BmE(cNi2, bg5);
        CNi cNi3 = this.A0G;
        Bg6 bg6 = new Bg6(this);
        cNi3.A0C.getClass();
        cNi3.A0C.A0A = new BmF(cNi3, bg6);
        CNi cNi4 = this.A0G;
        cNi4.A02 = CZF.A00(this, 27);
        cNi4.A01 = CZF.A00(this, 28);
        cNi4.A00 = CZF.A00(this, 29);
        1Kd.A0F(D4q.A00(this, 67), ((C4j) this.A16.get()).A00(), this.A0W);
        A0N(this, 0S2.A00);
    }
}
