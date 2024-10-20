package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntryState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: LE7.class */
public abstract class LE7 {
    public Activity A00;
    public Bundle A01;
    public Lifecycle.State A02;
    public LifecycleOwner A03;
    public C3034Jgx A04;
    public C3047JhG A05;
    public L2u A06;
    public Function1 A07;
    public Function1 A08;
    public boolean A09;
    public Parcelable[] A0A;
    public int A0B;
    public final Context A0C;
    public final LifecycleObserver A0D;
    public final java.util.Map A0E;
    public final java.util.Map A0F;
    public final java.util.Map A0G;
    public final java.util.Map A0H;
    public final C01i A0I;
    public final C07a A0J;
    public final 0Xs A0K;
    public final 0Xs A0L;
    public final C06g A0M;
    public final List A0N;
    public final java.util.Map A0O;
    public final java.util.Map A0P;
    public final CopyOnWriteArrayList A0Q;
    public final 0zV A0R;
    public final 16K A0S;
    public final C15t A0T;
    public final C15t A0U;

    public LE7(Context context) {
        Object obj;
        this.A0C = context;
        Iterator it = 0AK.A0A(context, M63.A00).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (!(obj instanceof Activity));
        this.A00 = (Activity) obj;
        this.A0J = new C07a();
        C0ty c0ty = C0ty.A00;
        0Ro A00 = 0Du.A00(c0ty);
        this.A0K = A00;
        this.A0T = new 0Xr((C2a2) null, A00);
        0Ro A002 = 0Du.A00(c0ty);
        this.A0L = A002;
        this.A0U = new 0Xr((C2a2) null, A002);
        this.A0O = 1BK.A1C();
        this.A0P = 1BK.A1C();
        this.A0E = 1BK.A1C();
        this.A0F = 1BK.A1C();
        this.A0Q = JQx.A14();
        this.A02 = Lifecycle.State.INITIALIZED;
        this.A0D = new LQt(this, 0);
        this.A0M = new JZh(this);
        L2u l2u = new L2u();
        this.A06 = l2u;
        this.A0H = 1BK.A1C();
        this.A0G = 1BK.A1C();
        l2u.A01(new JhN(l2u));
        this.A06.A01(new JhO(this.A0C));
        this.A0N = AnonymousClass001.A0s();
        this.A0I = JR4.A01(this, 12);
        0KW A003 = 0KV.A00(0S2.A01, 1, 0);
        this.A0S = A003;
        this.A0R = new 0PX((C2a2) null, A003);
    }

    private LQw A00(int i) {
        Object obj;
        ListIterator A1F = AbH.A1F(this.A0J);
        while (true) {
            if (!A1F.hasPrevious()) {
                obj = null;
                break;
            }
            obj = A1F.previous();
            if (((LQw) obj).A02.A00 == i) {
                break;
            }
        }
        LQw lQw = (LQw) obj;
        if (lQw != null) {
            return lQw;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("No destination with ID ");
        A0k.append(i);
        A0k.append(" is on the NavController's back stack. The current destination is ");
        A0k.append(A0B());
        throw 1BL.A0d(A0k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r303 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.L94] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.L94 A01(X.LE7 r301, int r302) {
        /*
            r0 = r301
            X.JhG r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Ld
            r0 = 0
            r303 = r0
        Lb:
            r0 = r303
            return r0
        Ld:
            r0 = r303
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r302
            if (r0 == r1) goto Lb
            r0 = r301
            X.07a r0 = r0.A0J
            java.lang.Object r0 = r0.A0R()
            X.LQw r0 = (X.LQw) r0
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
            r0 = r305
            X.L94 r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3b
        L32:
            r0 = r301
            X.JhG r0 = r0.A05
            r303 = r0
            r0 = r303
            X.11T.A0D(r0)
        L3b:
            r0 = r303
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r302
            if (r0 == r1) goto Lb
            r0 = r303
            boolean r0 = r0 instanceof X.C3047JhG
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5a
            r0 = r303
            X.JhG r0 = (X.C3047JhG) r0
            r303 = r0
        L53:
            r0 = r303
            r1 = r302
            r2 = 1
            X.L94 r0 = r0.A06(r1, r2)
            return r0
        L5a:
            r0 = r303
            X.JhG r0 = r0.A01
            r303 = r0
            r0 = r303
            X.11T.A0D(r0)
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE7.A01(X.LE7, int):X.L94");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x040f, code lost:
    
        if (r303.A03 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0412, code lost:
    
        r325 = androidx.lifecycle.Lifecycle.State.CREATED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0417, code lost:
    
        r0 = r303.A04;
        r0 = X.11T.A02(java.util.UUID.randomUUID());
        X.1BK.A1J(r0, r313 ? 1 : 0, r325);
        r315 = new X.LQw(r0, r0, (android.os.Bundle) null, r325, r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04b4, code lost:
    
        r325 = r303.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0451, code lost:
    
        r0.addFirst(r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0458, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x046c, code lost:
    
        if (r0.hasNext() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x046f, code lost:
    
        r0 = X.JQx.A0b(r0);
        r0 = r303.A0H.get(r303.A06.A00(r0.A02.A07));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04a0, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04a3, code lost:
    
        ((X.LBV) r0).A06(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04d0, code lost:
    
        throw X.0Pz.A07("NavigatorBackStack for ", r304.A07, " should already be created");
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04d1, code lost:
    
        r0.addAll(r0);
        r0.add(r302);
        r0 = X.0QD.A0P(r302, r0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04fc, code lost:
    
        if (r0.hasNext() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04ff, code lost:
    
        r0 = X.JQx.A0b(r0);
        r0 = r0.A02.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0512, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0515, code lost:
    
        r303.A05(r0, r303.A00(((X.L94) r0).A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0531, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0377, code lost:
    
        r315 = r318.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ad, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024f, code lost:
    
        r0 = r303.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025f, code lost:
    
        if (r303.A03 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0262, code lost:
    
        r323 = androidx.lifecycle.Lifecycle.State.CREATED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r0 = new X.C07a();
        r315 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0267, code lost:
    
        r0 = r303.A04;
        r318 = r307;
        r0 = X.11T.A02(java.util.UUID.randomUUID());
        X.7zR.A1N(r317, r323);
        r319 = new X.LQw(r0, r301, (android.os.Bundle) null, r323, r317, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x029f, code lost:
    
        r323 = r303.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02a9, code lost:
    
        r318 = r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b3, code lost:
    
        r318 = r307;
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if ((r304 instanceof X.C3047JhG) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        r317 = r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        X.11T.A0D(r317);
        r317 = r317.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
    
        if (r317 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        r0 = X.AbH.A1F(r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (r0.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        r319 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (X.11T.A0O(((X.LQw) r319).A02, r317) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        if (r319 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r318 = r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        r0.addFirst(r319);
        r0 = r303.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
    
        if (X.7zM.A1b(r0) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0015, code lost:
    
        if ((r307 instanceof X.MBv) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
    
        if (((X.LQw) r0.A0Q()).A02 != r317) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        r313 = true;
        A06((X.LQw) r0.A0Q(), r303, new X.C07a(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0135, code lost:
    
        if (r317 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
    
        if (r317 != r304) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0148, code lost:
    
        if (r0.isEmpty() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014b, code lost:
    
        r307 = ((X.LQw) r0.A0O()).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        r0 = r303.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015d, code lost:
    
        if (r307 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0174, code lost:
    
        if (A01(r303, r307.A00) == r307) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0177, code lost:
    
        r307 = r307.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0180, code lost:
    
        if (r307 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0185, code lost:
    
        if (r301 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r0.isEmpty() != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0188, code lost:
    
        r319 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0196, code lost:
    
        if (r301.isEmpty() == r313) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019d, code lost:
    
        r0 = X.AbH.A1F(r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01af, code lost:
    
        if (r0.hasPrevious() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b2, code lost:
    
        r323 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d4, code lost:
    
        if (X.11T.A0O(((X.LQw) r323).A02, r307) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d9, code lost:
    
        if (r323 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01dc, code lost:
    
        r0 = r303.A0C;
        r0 = r307.A01(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f5, code lost:
    
        if (r303.A03 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f8, code lost:
    
        r321 = androidx.lifecycle.Lifecycle.State.CREATED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fd, code lost:
    
        r0 = r303.A04;
        r0 = X.11T.A02(java.util.UUID.randomUUID());
        X.11T.A0F(r321, 3);
        r323 = new X.LQw(r0, r0, (android.os.Bundle) null, r321, r307, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0245, code lost:
    
        r321 = r303.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x023b, code lost:
    
        r0.addFirst(r323);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if ((((X.LQw) r0.A0Q()).A02 instanceof X.MBv) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0199, code lost:
    
        r319 = r301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02c6, code lost:
    
        if (r0.isEmpty() != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02c9, code lost:
    
        r318 = ((X.LQw) r0.A0O()).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02da, code lost:
    
        r0 = r303.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ea, code lost:
    
        if (r0.isEmpty() != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0303, code lost:
    
        if ((((X.LQw) r0.A0Q()).A02 instanceof X.C3047JhG) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0306, code lost:
    
        r0 = ((X.LQw) r0.A0Q()).A02;
        X.11T.A0I(r0, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0335, code lost:
    
        if (((X.C3047JhG) r0).A06(r318.A00, false) != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0338, code lost:
    
        A06((X.LQw) r0.A0Q(), r303, new X.C07a(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0359, code lost:
    
        r318 = (X.LQw) r0.A0P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0365, code lost:
    
        if (r318 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0368, code lost:
    
        r318 = (X.LQw) r0.A0P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0374, code lost:
    
        if (r318 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        if (A0A(r303, ((X.LQw) r0.A0Q()).A02.A00, true, false) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0390, code lost:
    
        if (X.11T.A0O(r315, r303.A05) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0393, code lost:
    
        r0 = X.AbH.A1F(r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03a5, code lost:
    
        if (r0.hasPrevious() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03a8, code lost:
    
        r315 = r0.previous();
        r0 = ((X.LQw) r315).A02;
        r0 = r303.A05;
        X.11T.A0D(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03d6, code lost:
    
        if (X.11T.A0O(r0, r0) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03db, code lost:
    
        if (r315 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03de, code lost:
    
        r0 = r303.A0C;
        r0 = r303.A05;
        X.11T.A0D(r0);
        r0 = r303.A05;
        X.11T.A0D(r0);
        r0 = r0.A01(r301);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(android.os.Bundle r301, X.LQw r302, X.LE7 r303, X.L94 r304, java.util.List r305) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE7.A02(android.os.Bundle, X.LQw, X.LE7, X.L94, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x043f, code lost:
    
        if (r321 != null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0585 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea A[LOOP:1: B:19:0x00dc->B:21:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0533 A[Catch: all -> 0x0686, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0686, blocks: (B:81:0x04f0, B:82:0x04f7, B:83:0x0500, B:85:0x050f, B:86:0x0515, B:88:0x051e, B:89:0x0525, B:92:0x0533, B:93:0x053c, B:94:0x0543, B:95:0x054a, B:97:0x0553, B:101:0x055f, B:103:0x056c, B:105:0x0574, B:107:0x057b), top: B:80:0x04f0 }] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Je, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(android.os.Bundle r301, X.LE7 r302, X.L94 r303, X.Ktm r304) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE7.A03(android.os.Bundle, X.LE7, X.L94, X.Ktm):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x08e9, code lost:
    
        if (r305 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05c4, code lost:
    
        if (r306 != null) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04f6  */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.L94] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(android.os.Bundle r301, X.LE7 r302, X.C3047JhG r303) {
        /*
            Method dump skipped, instructions count: 2836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE7.A04(android.os.Bundle, X.LE7, X.JhG):void");
    }

    private final void A05(LQw lQw, LQw lQw2) {
        this.A0O.put(lQw, lQw2);
        java.util.Map map = this.A0P;
        if (map.get(lQw2) == null) {
            map.put(lQw2, DKD.A14());
        }
        Object obj = map.get(lQw2);
        11T.A0D(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public static final void A06(LQw lQw, LE7 le7, C07a c07a, boolean z) {
        C3034Jgx c3034Jgx;
        Set set;
        C07a c07a2 = le7.A0J;
        LQw lQw2 = (LQw) c07a2.A0Q();
        if (!11T.A0O(lQw2, lQw)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Attempted to pop ");
            A0k.append(lQw.A02);
            A0k.append(", which is not the top of the back stack (");
            throw AnonymousClass001.A0N(AnonymousClass002.A0K(lQw2.A02, A0k));
        }
        c07a2.removeLast();
        LBV lbv = (LBV) le7.A0H.get(le7.A06.A00(lQw2.A02.A07));
        boolean z2 = true;
        if ((lbv == null || (set = (Set) lbv.A05.getValue()) == null || !set.contains(lQw2)) && !le7.A0P.containsKey(lQw2)) {
            z2 = false;
        }
        Lifecycle.State currentState = lQw2.getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (z) {
                lQw2.A03(state);
                c07a.addFirst(new NavBackStackEntryState(lQw2));
            }
            if (z2) {
                lQw2.A03(state);
            } else {
                lQw2.A03(Lifecycle.State.DESTROYED);
                le7.A0E(lQw2);
            }
        }
        if (z || z2 || (c3034Jgx = le7.A04) == null) {
            return;
        }
        String str = lQw2.A09;
        11T.A0F(str, 0);
        ViewModelStore viewModelStore = (ViewModelStore) c3034Jgx.A00.remove(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    public static final void A07(LE7 le7) {
        C07a c07a;
        while (true) {
            c07a = le7.A0J;
            if (c07a.isEmpty() || !(((LQw) c07a.A0Q()).A02 instanceof C3047JhG)) {
                break;
            } else {
                A06((LQw) c07a.A0Q(), le7, new C07a(), false);
            }
        }
        Object A0R = c07a.A0R();
        if (A0R != null) {
            le7.A0N.add(A0R);
        }
        le7.A0B++;
        le7.A0D();
        int i = le7.A0B - 1;
        le7.A0B = i;
        if (i == 0) {
            List list = le7.A0N;
            ArrayList A10 = 7zO.A10(list, 0);
            list.clear();
            Iterator it = A10.iterator();
            while (it.hasNext()) {
                LQw A0b = JQx.A0b(it);
                Iterator it2 = le7.A0Q.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    A0b.A01();
                    throw AnonymousClass001.A0Q("onDestinationChanged");
                }
                le7.A0S.D5H(A0b);
            }
            le7.A0K.D5H(1BK.A17(c07a));
            le7.A0L.D5H(le7.A0C());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r305 > 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A08(X.LE7 r301) {
        /*
            r0 = r301
            X.06g r0 = r0.A0M
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            X.07a r0 = r0.A0J
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L59
            r0 = r304
            java.util.Iterator r0 = r0.iterator()
            r304 = r0
        L23:
            r0 = r304
            boolean r0 = r0.hasNext()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5e
            r0 = r304
            X.LQw r0 = X.JQx.A0b(r0)
            X.L94 r0 = r0.A02
            r307 = r0
            r0 = r307
            boolean r0 = r0 instanceof X.C3047JhG
            r1 = 1
            r0 = r0 ^ r1
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L23
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            r0 = r305
            if (r0 >= 0) goto L23
            X.C0s8.A17()
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L59:
            r0 = 0
            r303 = r0
            goto L64
        L5e:
            r0 = r305
            r1 = r303
            if (r0 <= r1) goto L59
        L64:
            r0 = r302
            r1 = r303
            r0.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE7.A08(X.LE7):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0089, code lost:
    
        if (r313 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v183, types: [X.L94] */
    /* JADX WARN: Type inference failed for: r0v187, types: [X.L94] */
    /* JADX WARN: Type inference failed for: r0v48, types: [X.0Je, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A09(android.os.Bundle r302, X.Ktm r303, int r304) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE7.A09(android.os.Bundle, X.Ktm, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0303, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[LOOP:1: B:14:0x00a3->B:102:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x049a A[EDGE_INSN: B:74:0x049a->B:75:0x049a BREAK  A[LOOP:1: B:14:0x00a3->B:102:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v143, types: [X.0Je, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.0Je, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A0A(X.LE7 r301, int r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE7.A0A(X.LE7, int, boolean, boolean):boolean");
    }

    public L94 A0B() {
        LQw lQw = (LQw) this.A0J.A0R();
        if (lQw != null) {
            return lQw.A02;
        }
        return null;
    }

    public final List A0C() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A1A = 1BK.A1A(this.A0H);
        while (A1A.hasNext()) {
            Iterable iterable = (Iterable) ((LBV) A1A.next()).A05.getValue();
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (Object obj : iterable) {
                LQw lQw = (LQw) obj;
                if (!A0s.contains(lQw) && !lQw.A01.isAtLeast(Lifecycle.State.STARTED)) {
                    A0s2.add(obj);
                }
            }
            0QU.A0t(A0s2, A0s);
        }
        C07a c07a = this.A0J;
        ArrayList A0s3 = AnonymousClass001.A0s();
        for (Object obj2 : c07a) {
            LQw lQw2 = (LQw) obj2;
            if (!A0s.contains(lQw2) && lQw2.A01.isAtLeast(Lifecycle.State.STARTED)) {
                A0s3.add(obj2);
            }
        }
        0QU.A0t(A0s3, A0s);
        ArrayList A0s4 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((LQw) next).A02 instanceof C3047JhG)) {
                A0s4.add(next);
            }
        }
        return A0s4;
    }

    public final void A0D() {
        AtomicInteger atomicInteger;
        Set set;
        ArrayList A10 = 7zO.A10(this.A0J, 0);
        if (A10.isEmpty()) {
            return;
        }
        L94 l94 = ((LQw) 0QD.A0F(A10)).A02;
        ArrayList A0s = AnonymousClass001.A0s();
        if (l94 instanceof MBv) {
            Iterator it = 0QD.A0T(A10).iterator();
            while (it.hasNext()) {
                L94 l942 = JQx.A0b(it).A02;
                A0s.add(l942);
                if (!(l942 instanceof MBv) && !(l942 instanceof C3047JhG)) {
                    break;
                }
            }
        }
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it2 = 0QD.A0T(A10).iterator();
        while (it2.hasNext()) {
            LQw A0b = JQx.A0b(it2);
            Lifecycle.State state = A0b.A01;
            L94 l943 = A0b.A02;
            if (l94 != null && l943.A00 == l94.A00) {
                if (state != Lifecycle.State.RESUMED) {
                    LBV lbv = (LBV) this.A0H.get(this.A06.A00(l943.A07));
                    A0u.put(A0b, (1BK.A1X((lbv == null || (set = (Set) lbv.A05.getValue()) == null) ? null : Boolean.valueOf(set.contains(A0b)), true) || ((atomicInteger = (AtomicInteger) this.A0P.get(A0b)) != null && atomicInteger.get() == 0)) ? Lifecycle.State.STARTED : Lifecycle.State.RESUMED);
                }
                L94 l944 = (L94) 0QD.A0E(A0s);
                if (l944 != null && l944.A00 == l943.A00) {
                    if (A0s.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    A0s.remove(0);
                }
                l94 = l94.A01;
            } else if (!7zM.A1b(A0s) || l943.A00 != ((L94) 0QD.A0D(A0s)).A00) {
                A0b.A03(Lifecycle.State.CREATED);
            } else {
                if (A0s.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                L94 l945 = (L94) A0s.remove(0);
                if (state == Lifecycle.State.RESUMED) {
                    A0b.A03(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (state != state2) {
                        A0u.put(A0b, state2);
                    }
                }
                C3047JhG c3047JhG = l945.A01;
                if (c3047JhG != null) {
                    JQy.A1P(c3047JhG, A0s);
                }
            }
        }
        Iterator it3 = A10.iterator();
        while (it3.hasNext()) {
            LQw A0b2 = JQx.A0b(it3);
            Lifecycle.State state3 = (Lifecycle.State) A0u.get(A0b2);
            if (state3 != null) {
                A0b2.A03(state3);
            } else {
                A0b2.A02();
            }
        }
    }

    public final void A0E(LQw lQw) {
        11T.A0F(lQw, 0);
        LQw lQw2 = (LQw) this.A0O.remove(lQw);
        if (lQw2 != null) {
            java.util.Map map = this.A0P;
            AtomicInteger atomicInteger = (AtomicInteger) map.get(lQw2);
            if (atomicInteger != null) {
                int decrementAndGet = atomicInteger.decrementAndGet();
                if (Integer.valueOf(decrementAndGet) == null || decrementAndGet != 0) {
                    return;
                }
                LBV lbv = (LBV) this.A0H.get(this.A06.A00(lQw2.A02.A07));
                if (lbv != null) {
                    lbv.A03(lQw2);
                }
                map.remove(lQw2);
            }
        }
    }
}
