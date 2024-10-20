package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.litho.LithoView;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.EmojiSet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9lz, reason: invalid class name */
/* loaded from: 9lz.class */
public final class C9lz {
    public int A00;
    public ViewGroup A01;
    public LithoView A02;
    public LithoView A03;
    public 9Q0 A04;
    public BottomSheetBehavior A05;
    public List A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final ViewTreeObserver.OnGlobalLayoutListener A0C;
    public final C74a A0D;
    public final 6yQ A0E;
    public final 7HB A0F;
    public final 7HC A0G;
    public final AYp A0H;
    public final AYq A0I;
    public final 6qY A0J;
    public final List A0K;
    public final FbUserSession A0L;
    public final 9MO A0M;
    public final AYp A0N;
    public final Set A0O;
    public final Function1 A0P;
    public final Function1 A0Q;
    public final Function1 A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public C9lz(FbUserSession fbUserSession, C74a c74a, 6yQ r304, 7HB r305, 7HC r306, AYp aYp, AYq aYq, 6qY r309, Set set, boolean z, boolean z2, boolean z3) {
        1BL.A1F(fbUserSession, set);
        this.A0L = fbUserSession;
        this.A0O = set;
        this.A0U = z;
        this.A0E = r304;
        this.A0H = aYp;
        this.A0J = r309;
        this.A0G = r306;
        this.A0I = aYq;
        this.A0F = r305;
        this.A0D = c74a;
        this.A0T = z2;
        this.A0S = z3;
        this.A06 = AnonymousClass001.A0s();
        this.A07 = AnonymousClass001.A0s();
        this.A0K = AnonymousClass001.A0s();
        this.A0C = new FYE(this, 9);
        this.A0N = new A8p(this);
        this.A0M = new 9MO(this);
        this.A0P = AV0.A00(this, 32);
        this.A0Q = AV0.A00(this, 33);
        this.A0R = AV0.A00(this, 34);
    }

    public static final ImmutableList A00(C9lz c9lz, ImmutableList immutableList) {
        ImmutableList.Builder A0h = 4YU.A0h();
        2KY A0u = 7zQ.A0u();
        if (!c9lz.A09) {
            ArrayList A0s = AnonymousClass001.A0s();
            int size = c9lz.A06.size();
            for (int i = 0; i < size; i++) {
                BasicEmoji A02 = 2KY.A02(A0u, 1BK.A14(c9lz.A06, i));
                if (A02 != null) {
                    A0s.add(A02);
                }
            }
            A0h.m11011add((Object) new EmojiSet(new EmojiSet.Metadata(3E2.A06, A0s), 0, 0, 2131968238));
        }
        A0h.m11011add((Object) new EmojiSet(new EmojiSet.Metadata(3E2.A08, immutableList), 0, 0, 2131964220));
        A0h.addAll(A0u.AJg());
        return 1Fj.A01(A0h);
    }

    public static final void A01(LithoView lithoView, C9lz c9lz, ImmutableList immutableList) {
        LithoView lithoView2 = c9lz.A02;
        if (lithoView2 == null) {
            11T.A0L("customEmojiPickerView");
            throw 0Q8.createAndThrow();
        }
        8Rz r0 = new 8Rz(lithoView.A09, new C8km());
        6yQ r02 = c9lz.A0E;
        C8km c8km = r0.A01;
        c8km.A01 = r02;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        c8km.A05 = c9lz.A09 ? C0uA.A00 : c9lz.A0O;
        bitSet.set(7);
        c8km.A06 = c9lz.A0P;
        bitSet.set(1);
        c8km.A03 = c9lz.A0N;
        bitSet.set(2);
        c8km.A08 = c9lz.A0U;
        bitSet.set(8);
        c8km.A04 = immutableList;
        bitSet.set(3);
        c8km.A07 = c9lz.A0S;
        bitSet.set(4);
        c8km.A00 = 7zL.A0D(r02.B66(4YU.A08(lithoView)));
        bitSet.set(5);
        c8km.A02 = c9lz.A0M;
        bitSet.set(6);
        7zP.A18(r0, bitSet, r0.A03);
        lithoView2.A0y(c8km);
    }

    public static final void A02(C9lz c9lz) {
        LithoView lithoView = c9lz.A03;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            11T.A0A(r0);
            LithoView lithoView2 = c9lz.A03;
            if (lithoView2 == null) {
                11T.A0L("customReactionsTrayContainerView");
                throw 0Q8.createAndThrow();
            }
            2cM A00 = 2cK.A00(r0);
            A00.A2c();
            A00.A2e(new 8WV(c9lz.A0Q, c9lz.A0R));
            lithoView2.A0y(7zL.A0V(A00, new 8bT(c9lz.A0E, new 9MP(c9lz), 1BL.A0a(c9lz.A06), c9lz.A0T)));
        }
    }

    public final void A03(LithoView lithoView, String str) {
        11T.A0F(lithoView, 0);
        this.A02 = lithoView;
        if (!this.A0U || str.length() != 0) {
            if (str.length() > 0) {
                this.A0G.A00(this.A0L, new A8o(lithoView, this), str);
                return;
            } else {
                7zN.A11(lithoView);
                A01(lithoView, this, A00(this, 1BK.A0b()));
                return;
            }
        }
        7HB r0 = this.A0F;
        FbUserSession fbUserSession = this.A0L;
        9YP r02 = new 9YP(lithoView, this);
        ImmutableList immutableList = ((7JL) 4YU.A0o(fbUserSession, r0.A02, 68068)).A00;
        if (immutableList != null) {
            if (immutableList.size() > 18) {
                immutableList = immutableList.subList(0, 18);
                11T.A0A(immutableList);
            }
            r02.A00(immutableList);
            return;
        }
        1IB A0M = 4YU.A0M(1BK.A05(), 7HB.A05, (BlueServiceOperationFactory) 1Br.A0B(r0.A03), "fetch_recent_emoji", true);
        11T.A0A(A0M);
        DeJ deJ = new DeJ(r02, r0, 3);
        r0.A00 = A0M;
        r0.A01 = deJ;
        1Br.A0D(r0.A04, deJ, A0M);
    }
}
