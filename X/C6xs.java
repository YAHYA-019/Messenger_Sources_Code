package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6xs, reason: invalid class name */
/* loaded from: 6xs.class */
public final class C6xs implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final int A02;
    public final C6xN A03 = new C6xN();
    public final C6xN A04;
    public final C6xN A05;
    public final C6xN A06;
    public final C6xN A07;
    public final C6xN A08;
    public final C6xN A09;
    public final boolean A0A;
    public final boolean A0B;
    public final int A0C;
    public final long A0D;
    public final ThreadKey A0E;
    public final 5oY A0F;
    public final C6xk A0G;
    public final C6xN A0H;
    public final 6wV A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.6xN] */
    public C6xs(AnonymousClass845 anonymousClass845) {
        ?? obj = new Object();
        obj.A00 = false;
        this.A07 = obj;
        ?? obj2 = new Object();
        obj2.A00 = "";
        this.A04 = obj2;
        this.A05 = new C6xN();
        this.A09 = new C6xN();
        ?? obj3 = new Object();
        obj3.A00 = false;
        this.A08 = obj3;
        ?? obj4 = new Object();
        obj4.A00 = false;
        this.A0H = obj4;
        ?? obj5 = new Object();
        obj5.A00 = false;
        this.A06 = obj5;
        this.A0F = anonymousClass845.A04;
        this.A0A = anonymousClass845.A07;
        this.A0Q = anonymousClass845.A0G;
        this.A0L = anonymousClass845.A0B;
        this.A0P = anonymousClass845.A0F;
        ThreadKey threadKey = anonymousClass845.A03;
        threadKey.getClass();
        this.A0E = threadKey;
        this.A0M = anonymousClass845.A0C;
        this.A0O = anonymousClass845.A0E;
        this.A0D = anonymousClass845.A02;
        this.A02 = anonymousClass845.A00;
        this.A0J = anonymousClass845.A09;
        this.A0B = anonymousClass845.A08;
        C6xk c6xk = anonymousClass845.A05;
        c6xk.getClass();
        this.A0G = c6xk;
        6wV r0 = anonymousClass845.A06;
        r0.getClass();
        this.A0I = r0;
        this.A0C = anonymousClass845.A01;
        this.A0K = anonymousClass845.A0A;
        this.A0N = anonymousClass845.A0D;
        this.A00 = null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.6xN] */
    public C6xs(ThreadKey threadKey, C6xk c6xk, 6wV r304) {
        ?? obj = new Object();
        obj.A00 = false;
        this.A07 = obj;
        ?? obj2 = new Object();
        obj2.A00 = "";
        this.A04 = obj2;
        this.A05 = new C6xN();
        this.A09 = new C6xN();
        ?? obj3 = new Object();
        obj3.A00 = false;
        this.A08 = obj3;
        ?? obj4 = new Object();
        obj4.A00 = false;
        this.A0H = obj4;
        ?? obj5 = new Object();
        obj5.A00 = false;
        this.A06 = obj5;
        this.A0F = null;
        this.A0A = false;
        this.A0Q = false;
        this.A0L = false;
        this.A0P = false;
        this.A0E = threadKey;
        this.A0M = false;
        this.A0O = false;
        this.A0D = 0L;
        this.A02 = 0;
        this.A0J = false;
        this.A0B = false;
        c6xk.getClass();
        this.A0G = c6xk;
        r304.getClass();
        this.A0I = r304;
        this.A0C = 13;
        this.A0K = false;
        this.A0N = false;
        this.A00 = null;
    }

    public static final void A00(C77n c77n, C77v c77v, 6wV r303) {
        r303.CvI("");
        r303.CuQ(0, 0);
        CharSequence A00 = c77v.A00();
        11T.A0A(A00);
        if (A00.length() > 0) {
            C79s c79s = new C79s(c77v);
            c79s.A00("");
            c77n.ClL(new C77v(c79s));
        }
    }

    public static final boolean A01(C77n c77n, C77v c77v, boolean z) {
        if (c77v.A05 == z) {
            return false;
        }
        C79s c79s = new C79s(c77v);
        c79s.A05 = z;
        c77n.ClL(new C77v(c79s));
        return true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7AO.class, C7Ai.class, 6Sv.class, 7Ae.class, 7Aj.class, 7Ak.class, 7Al.class, 7Am.class, C7Ah.class, 7An.class, 7Ao.class, 7Ap.class, 7Aa.class, C6zq.class, 7Aq.class, 7Ar.class, 7Af.class, 98Y.class, 6Sg.class, 7As.class, 7At.class, 7Au.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "TextPlugin";
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0560, code lost:
    
        if (r319 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01c5, code lost:
    
        if (r316 == null) goto L26;
     */
    /* JADX WARN: Type inference failed for: r0v294, types: [X.5fq, X.5qu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BLY(com.facebook.xapp.messaging.capability.vector.Capabilities r302, X.C77n r303, X.6RU r304, X.6Sh r305) {
        /*
            Method dump skipped, instructions count: 3678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6xs.BLY(com.facebook.xapp.messaging.capability.vector.Capabilities, X.77n, X.6RU, X.6Sh):void");
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (this.A01) {
            return;
        }
        boolean z2 = this.A0A;
        final boolean z3 = this.A0B;
        final int i = this.A02;
        C77v c77v = (C77v) c77n.AUP(C77v.class);
        C6xN c6xN = this.A03;
        C6xN c6xN2 = this.A05;
        C6xN c6xN3 = this.A09;
        C6xN c6xN4 = this.A06;
        C6xN c6xN5 = this.A04;
        C6xN c6xN6 = this.A07;
        C6xN c6xN7 = this.A08;
        11T.A0F(r303, 0);
        11T.A0F(c77v, 5);
        11T.A0F(c6xN, 6);
        11T.A0F(c6xN2, 7);
        11T.A0F(c6xN3, 8);
        11T.A0F(c6xN4, 9);
        11T.A0F(c6xN5, 10);
        11T.A0F(c6xN6, 11);
        11T.A0F(c6xN7, 12);
        final WeakReference weakReference = new WeakReference(r303);
        c6xN.A00 = new Runnable(weakReference) { // from class: X.79i
            public static final String __redex_internal_original_name = "Delegate";
            public final WeakReference A00;

            {
                this.A00 = weakReference;
            }

            @Override // java.lang.Runnable
            public void run() {
                6RU r0 = (6RU) this.A00.get();
                if (r0 != null) {
                    7FI.A02(r0, 7Ak.A02);
                }
            }
        };
        c6xN2.A00 = new C79o(new WeakReference(r303));
        c6xN3.A00 = new Handler(Looper.getMainLooper());
        c6xN4.A00 = true;
        c6xN5.A00 = "";
        c6xN6.A00 = false;
        c6xN7.A00 = false;
        C79q c79q = c77v.A00;
        if (c79q == null) {
            c79q = new C79q(new TextWatcher[0]);
            C79s c79s = new C79s(c77v);
            c79s.A00 = c79q;
            c77n.ClL(new C77v(c79s));
        }
        c79q.A00((6qI) 1Bi.A03(50171));
        if (z2) {
            final Context context = r303.A00;
            c79q.A00(new TextWatcher(context, i, z3) { // from class: X.322
                public final C2n0 A00;

                {
                    this.A00 = new C2n0(context, null, null, -1, -1, i, -1, 1, -1, false, false, false, false, z3, false);
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (editable != null) {
                        C2n0 c2n0 = this.A00;
                        c2n0.A02(editable);
                        c2n0.A01(editable);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
        }
        c79q.A00(new C79t(r303));
        this.A01 = true;
    }
}
