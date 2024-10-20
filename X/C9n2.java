package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.avatar.socialstickers.model.DisclaimerTriggerSource;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9n2, reason: invalid class name */
/* loaded from: 9n2.class */
public final class C9n2 {
    public String A00;
    public List A01;
    public ScheduledFuture A02;
    public ScheduledFuture A03;
    public List A04;
    public ScheduledFuture A05;
    public final LiveData A06;
    public final LiveData A07;
    public final FbUserSession A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final ThreadKey A0H;
    public final 9sE A0I;
    public final 79Q A0J;
    public final 2aI A0K;
    public final Context A0L;
    public final MutableLiveData A0M;
    public final MutableLiveData A0N;
    public final 79Q A0O;
    public final boolean A0P;

    public C9n2(Context context, LifecycleOwner lifecycleOwner, ThreadKey threadKey, 79Q r305, 79Q r306, boolean z) {
        11T.A0F(threadKey, 3);
        this.A0L = context;
        this.A0H = threadKey;
        this.A0J = r305;
        this.A0O = r306;
        this.A0P = z;
        this.A0B = 7zM.A0Z();
        MutableLiveData A0H = 7zL.A0H();
        this.A0N = A0H;
        MutableLiveData A0H2 = 7zL.A0H();
        this.A0M = A0H2;
        1Br A0e = 7zM.A0e(context);
        this.A0G = A0e;
        FbUserSession A03 = 1Br.A03(A0e);
        this.A08 = A03;
        this.A09 = 1Lm.A00(context, A03, 68621);
        this.A0D = 1Bu.A01(context, 147815);
        this.A0F = 1Bq.A00(16461);
        this.A0A = 1Bq.A00(68416);
        this.A0E = 1Bu.A01(context, 49988);
        this.A0C = 7zM.A0R();
        this.A0K = 7zO.A16(lifecycleOwner);
        this.A07 = A0H;
        this.A06 = A0H2;
        this.A00 = "";
        this.A0I = new 9sE(this);
    }

    public static final void A00(C9n2 c9n2, String str) {
        boolean z = false;
        A01(c9n2, str, false);
        79Q r0 = c9n2.A0J;
        if (r0 != null) {
            7zO.A1X(c9n2.A03);
            c9n2.A03 = null;
            if (str.length() == 0) {
                A03(c9n2, C0ty.A00, false, false);
            } else {
                ListenableFuture D1r = r0.D1r(new C2636Gjo(str, (Boolean) false));
                A03(c9n2, C0ty.A00, true, false);
                1Br.A0D(c9n2.A0C, AC8.A00(c9n2, 61), D1r);
                c9n2.A03 = ((ScheduledExecutorService) 1Br.A0B(c9n2.A0F)).schedule((Runnable) new AFT(c9n2, D1r), 5000L, TimeUnit.MILLISECONDS);
            }
        }
        93J r02 = (C99m) c9n2.A0N.getValue();
        if ((r02 instanceof 93J) && r02.A01) {
            z = true;
        }
        A04(c9n2, z);
    }

    public static final void A01(C9n2 c9n2, String str, boolean z) {
        79P r0 = c9n2.A0O;
        if (r0 != null) {
            7zO.A1X(c9n2.A02);
            c9n2.A02 = null;
            String A00 = 9E2.A00(str);
            C0ty c0ty = C0ty.A00;
            if (A00 == null) {
                A02(c9n2, c0ty, false);
                return;
            }
            A02(c9n2, c0ty, true);
            11T.A0I(r0, "null cannot be cast to non-null type com.facebook.xapp.messaging.sticker.search.msys.MsysStickerSearchLoader");
            1FV A04 = r0.A04((ImmutableList) null, A00, z);
            1Br.A0D(c9n2.A0C, AC8.A00(c9n2, 62), A04);
            c9n2.A02 = ((ScheduledExecutorService) 1Br.A0B(c9n2.A0F)).schedule((Runnable) new AFU(c9n2, A04), 5000L, TimeUnit.MILLISECONDS);
        }
    }

    public static final void A02(C9n2 c9n2, List list, boolean z) {
        93G r308;
        MutableLiveData mutableLiveData = c9n2.A0M;
        Object value = mutableLiveData.getValue();
        if (!(value instanceof 93G)) {
            value = null;
        }
        if (z) {
            r308 = 93H.A00;
        } else {
            if (list == null) {
                list = C0ty.A00;
            }
            r308 = new 93G(list);
        }
        if (11T.A0O(value, r308)) {
            return;
        }
        7zS.A1C(mutableLiveData, c9n2.A0B, r308);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r0.A01 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(X.C9n2 r301, java.util.List r302, boolean r303, boolean r304) {
        /*
            r0 = r301
            androidx.lifecycle.MutableLiveData r0 = r0.A0N
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.getValue()
            X.99m r0 = (X.C99m) r0
            r306 = r0
            r0 = r301
            r1 = r302
            r0.A04 = r1
            r0 = r306
            boolean r0 = r0 instanceof X.93J
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L37
            r0 = r306
            X.93J r0 = (X.93J) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.A01
            r308 = r0
            r0 = 1
            r307 = r0
            r0 = r308
            if (r0 != 0) goto L3d
        L37:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        L3d:
            r0 = r301
            r1 = r307
            r2 = r303
            r3 = r304
            r0.A05(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9n2.A03(X.9n2, java.util.List, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r0.A02 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A04(X.C9n2 r301, boolean r302) {
        /*
            r0 = r301
            androidx.lifecycle.MutableLiveData r0 = r0.A0N
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.getValue()
            X.99m r0 = (X.C99m) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0 instanceof X.93J
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2d
            r0 = r304
            r303 = r0
            r0 = r304
            X.93J r0 = (X.93J) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A02
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L30
        L2d:
            r0 = 0
            r306 = r0
        L30:
            r0 = r304
            boolean r0 = r0 instanceof X.93K
            r305 = r0
            r0 = r301
            r1 = r302
            r2 = r306
            r3 = r305
            r0.A05(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9n2.A04(X.9n2, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        if (r305 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A05(boolean r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9n2.A05(boolean, boolean, boolean):void");
    }

    public final void A06() {
        C9iE c9iE = (C9iE) 1Br.A0B(this.A09);
        ThreadKey threadKey = this.A0H;
        c9iE.A04(threadKey, null);
        1Br.A0C(this.A0D);
        FbUserSession fbUserSession = this.A08;
        11T.A0F(fbUserSession, 0);
        ((C6i4) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 68074)).A00(DisclaimerTriggerSource.StickerTrayOpen.A00, threadKey);
    }

    public final void A07(String str) {
        this.A00 = str;
        7zO.A1X(this.A05);
        this.A05 = ((ScheduledExecutorService) 1Br.A0B(this.A0F)).schedule((Runnable) new AEE(this), ((AnonymousClass842) 1Br.A0B(this.A0A)).A01(), TimeUnit.MILLISECONDS);
    }
}
