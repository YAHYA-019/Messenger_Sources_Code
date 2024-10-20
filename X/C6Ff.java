package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.threadview.ThreadViewMessagesRecyclerView;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;

/* renamed from: X.6Ff, reason: invalid class name */
/* loaded from: 6Ff.class */
public final class C6Ff extends 6Fg implements 6Fh {
    public int A00;
    public int A01;
    public int A02;
    public Handler A03;
    public Handler A04;
    public 06Z A05;
    public 06Z A06;
    public LinearLayoutManager A07;
    public 2NI A08;
    public InterfaceC00713oe A09;
    public C1qb A0A;
    public 2Xo A0B;
    public 2Xm A0C;
    public C2X1 A0D;
    public ThreadKey A0E;
    public ThreadSummary A0F;
    public C6M7 A0G;
    public 64W A0H;
    public 6Jm A0I;
    public 6MJ A0J;
    public 63X A0K;
    public C6ja A0L;
    public 6MK A0M;
    public ThreadViewMessagesRecyclerView A0N;
    public User A0O;
    public Capabilities A0P;
    public ImmutableList A0Q;
    public ImmutableList A0R;
    public Runnable A0S;
    public Runnable A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final Context A0Z;
    public final 6Fo A0a;
    public final 2O4 A0b;
    public final 82O A0c;
    public final C00i A0e;
    public final C00i A0f;
    public final C00i A0g;
    public final C00i A0h;
    public final C00i A0j;
    public final C62i A0l;
    public final C62h A0m;
    public final 6Fv A0n;
    public final 6Fw A0o;
    public final 63E A0p;
    public final 6Fs A0q;
    public final 6FY A0r;
    public final Runnable A0s;
    public final Runnable A0t;
    public final Runnable A0u;
    public final Runnable A0v;
    public final ArrayDeque A0w;
    public final FbUserSession A0x;
    public final C00i A0y;
    public final 6Fe A0z;
    public final 63D A10;
    public final 6Fa A11;
    public final 6Fc A12;
    public final C6Fl A13;
    public final 6Fm A14;
    public final C00i A0k = new 1BQ(67144);
    public final C00i A0d = new 1BQ(33054);
    public final C00i A0i = new 1BQ(66630);

    /* JADX WARN: Type inference failed for: r0v19, types: [X.6Fl] */
    public C6Ff(Context context, FbUserSession fbUserSession, 2S4 r304, 5zD r305, 6Fe r306, 6FK r307, 63D r308, 6Fa r309, 6Fc r310, 6FY r311) {
        C84r c84r = new C84r(this, 3);
        this.A0l = c84r;
        this.A0t = new 6Fj(this);
        this.A0v = new 6Fk(this);
        this.A13 = new Object() { // from class: X.6Fl
        };
        this.A14 = new 6Fm(this);
        this.A0a = new 6Fo() { // from class: X.6Fn
            public void Bj7() {
                6MK r0 = C6Ff.this.A0M;
                if (r0 != null) {
                    6F2 r02 = r0.A00;
                    ImmutableSet immutableSet = 6F2.A4P;
                    r02.A3c.C6u();
                }
            }
        };
        this.A0s = new 6Fp(this);
        this.A0Q = ImmutableList.of();
        this.A0R = ImmutableList.of();
        this.A0w = new ArrayDeque();
        this.A0V = false;
        this.A0E = null;
        this.A0H = null;
        this.A0P = 5Hr.A06;
        this.A0T = null;
        this.A0c = (82O) 1Bn.A0A(776);
        this.A0g = new 1BV(68011);
        this.A0j = new 1BV(66141);
        this.A0h = new 1BQ(85048);
        this.A0y = new 1BV(16669);
        this.A0u = new 6Fq(this);
        this.A0b = new 6Fr(this);
        this.A0f = new 1BV(context, 49935);
        82O r0 = (82O) 1Bn.A0A(736);
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 777);
        C62o c62o = (C62o) 1Bn.A0E(context, (1BY) null, 49941);
        Integer num = 1Lo.A05;
        this.A0e = new 1MV(fbUserSession, 50111);
        this.A0x = fbUserSession;
        this.A0Z = context;
        C62h A0N = ((82O) 1Bn.A0E(context, (1BY) null, 65586)).A0N(fbUserSession);
        this.A0m = A0N;
        this.A0p = r0.A0P(context, fbUserSession, r304, r308, A0N, c62o);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            6Fs r02 = new 6Fs(context, fbUserSession, c1f6, A0N, r310);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0q = r02;
            r02.A02 = r305;
            r02.A09.A06.A02(r305);
            this.A0r = r311;
            r305.A5y(c84r);
            r307.A00.A03(this);
            this.A11 = r309;
            this.A12 = r310;
            this.A10 = r308;
            this.A0n = (6Fv) r304.A00(50009);
            this.A0o = (6Fw) r304.A00(50010);
            this.A0z = r306;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0372  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(androidx.recyclerview.widget.RecyclerView r301, X.C6Ff r302, int r303) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6Ff.A00(androidx.recyclerview.widget.RecyclerView, X.6Ff, int):void");
    }

    public static void A01(C6Ff c6Ff) {
        ImmutableList immutableList;
        Runnable runnable = c6Ff.A0S;
        if (runnable != null) {
            c6Ff.A03.removeCallbacks(runnable);
            c6Ff.A0S = null;
        }
        if (c6Ff.A0V) {
            return;
        }
        Runnable runnable2 = c6Ff.A0T;
        if (runnable2 != null) {
            runnable2.run();
            c6Ff.A0T = null;
        }
        ArrayDeque arrayDeque = c6Ff.A0w;
        if (arrayDeque.isEmpty()) {
            A00(c6Ff.A0N, c6Ff, 0);
            return;
        }
        Object remove = arrayDeque.remove();
        0fH.A0a(Integer.valueOf(c6Ff.hashCode()), Integer.valueOf(remove.hashCode()), Integer.valueOf(arrayDeque.size()), "MessageListRowItemHistoryLogger", "Helper %s removed entry %s from queue (now length %s)");
        if (remove instanceof 0Mu) {
            0Mu r0 = (0Mu) remove;
            immutableList = (ImmutableList) r0.A00;
            c6Ff.A0T = (Runnable) r0.A01;
        } else {
            immutableList = (ImmutableList) remove;
        }
        c6Ff.A03(immutableList, true);
        Runnable runnable3 = c6Ff.A0t;
        c6Ff.A0S = runnable3;
        c6Ff.A03.postDelayed(runnable3, 250L);
    }

    public static void A02(C6Ff c6Ff) {
        ComponentsSystrace.A02("MessageListSectionsHelper.updateAdapterForThemeUpdate");
        if (c6Ff.A0N != null) {
            boolean BN2 = c6Ff.A0q.A02.BN2();
            if (c6Ff.A0X) {
                if (!BN2) {
                    c6Ff.A0Y = true;
                }
            } else if (BN2) {
                c6Ff.A0N.A1B(c6Ff.A0r);
            }
            c6Ff.A0X = BN2;
        }
        if (c6Ff.A0B != null && c6Ff.A0w.isEmpty()) {
            c6Ff.A03(c6Ff.A0R, true);
        }
        ComponentsSystrace.A01();
        5zD r0 = c6Ff.A0q.A02;
        C6M7 c6m7 = c6Ff.A0G;
        if (c6m7 != null) {
            ThreadViewColorScheme Ad2 = r0.Ad2();
            if (Ad2 == null) {
                Ad2 = ((5Su) 1Br.A0B(c6m7.A03)).A01();
            }
            c6m7.A06.A00(Ad2);
        }
    }

    private void A03(ImmutableList immutableList, boolean z) {
        if (this.A0B == null || this.A0E == null) {
            return;
        }
        6Fs r0 = this.A0q;
        5zD r02 = r0.A02;
        6FY r03 = this.A0r;
        int Aa3 = r02.Aa3(C5yf.A02, 0S2.A00);
        6kH r04 = (6kH) r03.A02.get();
        ImmutableList Ao3 = r02.Ao3();
        int i = r03.A00;
        if (i <= 0) {
            i = ((C4s1) r04.A01.get()).A06();
        }
        r03.A01.setShader(Ao3.size() >= 2 ? new LinearGradient(0.0f, 0.0f, 0.0f, i, 1NS.A03(Ao3), (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, i, Aa3, Aa3, Shader.TileMode.CLAMP));
        C6M7 c6m7 = this.A0G;
        if (c6m7 != null) {
            Capabilities capabilities = this.A0P;
            11T.A0F(capabilities, 0);
            c6m7.A01 = capabilities;
        }
        Context context = this.A0Z;
        ThreadKey threadKey = this.A0E;
        6kI A01 = 6kI.A01(context, this.A06, this.A05, this.A0x, threadKey, this.A0F, this.A0z, this.A10, this.A0m, r0.A03, this.A11, this.A12, r0.A04, this.A0O, this.A0P);
        6kL r05 = new 6kL();
        r05.A0B = immutableList;
        int i2 = this.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        int hashCode = r02.hashCode();
        boolean BWo = ComponentsSystrace.A00.BWo();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) it.next();
            builder.m11011add((Object) new 6EO(anonymousClass624, BWo ? ((C60h) this.A0f.get()).A00(anonymousClass624).name() : null, hashCode, i2));
        }
        r05.A0A = builder.build();
        r05.A03 = this.A0p;
        r05.A07 = A01;
        r05.A04 = r0;
        r05.A00 = r02;
        r05.A09 = this.A0P;
        r05.A02 = r0.A03;
        r05.A08 = r0.A04;
        r05.A05 = this.A13;
        r05.A06 = this.A14;
        r05.A0C = !z;
        r05.A01 = this.A0H;
        2Xo r06 = this.A0B;
        if (z) {
            r06.A0R(r05);
        } else {
            r06.A0Q(r05);
        }
    }

    public ImmutableList A04() {
        int A1h = this.A07.A1h();
        int A1j = this.A07.A1j();
        int min = Math.min(A1h, A1j);
        int max = Math.max(A1h, A1j);
        return (min < 0 || max >= this.A0Q.size()) ? ImmutableList.of() : this.A0Q.subList(min, max + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r302 != r301.A0E) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(com.facebook.messaging.model.threadkey.ThreadKey r302, com.facebook.xapp.messaging.capability.vector.Capabilities r303, com.google.common.collect.ImmutableList r304, java.lang.Runnable r305, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6Ff.A05(com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.xapp.messaging.capability.vector.Capabilities, com.google.common.collect.ImmutableList, java.lang.Runnable, boolean, boolean):void");
    }

    public boolean A06(int i) {
        int height;
        int top;
        ThreadViewMessagesRecyclerView threadViewMessagesRecyclerView;
        View A0c = this.A07.A0c(i);
        boolean z = false;
        if (A0c != null && ((top = A0c.getTop() - this.A0N.getTop()) == (height = this.A0N.getHeight() / 2) || ((top > height && BTh()) || (top < height && (threadViewMessagesRecyclerView = this.A0N) != null && !threadViewMessagesRecyclerView.canScrollVertically(-1))))) {
            z = true;
        }
        return z;
    }

    public boolean BTh() {
        ThreadViewMessagesRecyclerView threadViewMessagesRecyclerView = this.A0N;
        return (threadViewMessagesRecyclerView == null || threadViewMessagesRecyclerView.canScrollVertically(1)) ? false : true;
    }
}
