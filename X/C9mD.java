package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.avatar.socialstickers.model.DisclaimerTriggerSource;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.9mD, reason: invalid class name */
/* loaded from: 9mD.class */
public final class C9mD {
    public ThreadKey A00;
    public String A01;
    public C2a2 A02;
    public final Context A03;
    public final LiveData A04;
    public final LiveData A05;
    public final MediatorLiveData A06;
    public final MutableLiveData A07;
    public final MutableLiveData A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 9sD A0H;
    public final Integer A0I;
    public final C01i A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final MutableLiveData A0M;
    public final FbUserSession A0N;
    public final 9Pg A0O;

    public C9mD(Context context, ThreadKey threadKey, Integer num, boolean z) {
        11T.A0F(threadKey, 2);
        this.A03 = context;
        this.A0I = num;
        this.A0K = threadKey.A1N();
        this.A0J = C01g.A00(C03i.A02, new J9o(this, 13));
        this.A0C = 7zM.A0Z();
        MutableLiveData A0H = 7zL.A0H();
        this.A07 = A0H;
        MutableLiveData A0H2 = 7zL.A0H();
        this.A08 = A0H2;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A06 = mediatorLiveData;
        MutableLiveData A0H3 = 7zL.A0H();
        this.A0M = A0H3;
        this.A0G = 7zM.A0e(context);
        this.A09 = 1Bu.A01(context, 68617);
        FbUserSession A03 = 1Br.A03(this.A0G);
        this.A0N = A03;
        this.A0E = 1Lm.A00(context, A03, 68621);
        this.A0D = 1Lm.A00(context, A03, 68074);
        this.A0A = 1Lm.A01(A03, 116062);
        this.A0F = 1Bu.A01(context, 49988);
        this.A0B = 1Bq.A00(98768);
        this.A0L = ((C9iE) 1Br.A0B(this.A0E)).A05();
        this.A04 = mediatorLiveData;
        this.A01 = "";
        this.A00 = threadKey;
        this.A05 = A0H3;
        ((C9iE) 1Br.A0B(this.A0E)).A00 = z;
        C9qq.A02(A0H, mediatorLiveData, this, ActionId.ON_VIEW_CREATED_END);
        C9qq.A02(A0H2, mediatorLiveData, this, ActionId.DATA_LOAD_START);
        this.A0H = new 9sD(this);
        this.A0O = new 9Pg(threadKey, this);
    }

    public static void A00(C9mD c9mD) {
        C99g c99g = (C99g) c9mD.A07.getValue();
        if (c99g instanceof C91X) {
            C91X c91x = (C91X) c99g;
            A02(c9mD, c91x.A02, c91x.A03);
        }
    }

    public static final void A01(C9mD c9mD) {
        C2a2 c2a2 = c9mD.A02;
        if (c2a2 != null) {
            c2a2.AE0(null);
        }
        c9mD.A02 = 7zM.A1G(2Zo.A02(0S2.A0C), new AJX(c9mD, (0DR) null, 25), 7zN.A0y());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0 */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v2, types: [java.util.AbstractCollection] */
    public static final void A02(C9mD c9mD, List list, boolean z) {
        List list2;
        if (c9mD.A01.length() > 0) {
            list2 = AnonymousClass001.A0s();
            for (Object obj : list) {
                if (0CU.A0T(((8K7) obj).A05.A05, c9mD.A01, true)) {
                    list2.add(obj);
                }
            }
        } else {
            list2 = list;
        }
        MutableLiveData mutableLiveData = c9mD.A07;
        Object value = mutableLiveData.getValue();
        if (!(value instanceof C91X)) {
            value = null;
        }
        C91X c91x = new C91X(null, list2, list, z);
        if (11T.A0O(value, c91x)) {
            return;
        }
        7zS.A1C(mutableLiveData, c9mD.A0C, c91x);
    }

    public final void A03() {
        C91X c91x;
        1Br r0 = this.A0E;
        if (((C9iE) 1Br.A0B(r0)).A05()) {
            return;
        }
        Object value = this.A04.getValue();
        if (!(value instanceof C91X) || (c91x = (C91X) value) == null || c91x.A03) {
            return;
        }
        C9iE c9iE = (C9iE) 1Br.A0B(r0);
        ThreadKey threadKey = this.A00;
        11T.A0F(threadKey, 0);
        ((C9lA) 1Br.A0B(c9iE.A05)).A02(threadKey, null, c9iE.A00);
    }

    public final void A04() {
        1Br r0 = this.A0E;
        C9iE c9iE = (C9iE) 1Br.A0B(r0);
        9sD r02 = this.A0H;
        11T.A0F(r02, 0);
        c9iE.A08.remove(r02);
        C9iE c9iE2 = (C9iE) 1Br.A0B(r0);
        9Pg r03 = this.A0O;
        11T.A0F(r03, 0);
        synchronized (c9iE2) {
            HashSet hashSet = new HashSet(c9iE2.A0A);
            hashSet.remove(r03);
            c9iE2.A0A = hashSet;
        }
        7zP.A1U(this.A02);
    }

    public final void A05() {
        this.A08.setValue(((C2t1) 1Br.A0B(this.A0B)).A0O(new InterstitialTrigger(1082, (String) null), C11184vr.class));
        ((C9iE) 1Br.A0B(this.A0E)).A04(this.A00, this.A0I);
        ((C6i4) 1Br.A0B(this.A0D)).A00(DisclaimerTriggerSource.StickerTrayOpen.A00, this.A00);
        if (((CFy) 1Bn.A0A(68091)).A01(this.A03, this.A0N)) {
            7zP.A0O(this.A0C).A00(this.A0M, AnonymousClass001.A0K());
        }
    }

    public final void A06(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        if (this.A0L) {
            A01(this);
        } else {
            ((C9iE) 1Br.A0B(this.A0E)).A03(this.A0H, threadKey);
        }
        1Br r0 = this.A0E;
        ((C9iE) 1Br.A0B(r0)).A04(threadKey, this.A0I);
        C9iE c9iE = (C9iE) 1Br.A0B(r0);
        9Pg r02 = this.A0O;
        11T.A0F(r02, 0);
        synchronized (c9iE) {
            HashSet hashSet = new HashSet(c9iE.A0A);
            hashSet.add(r02);
            c9iE.A0A = hashSet;
        }
    }

    public final void A07(Sticker sticker) {
        11T.A0F(sticker, 0);
        1Br.A0C(this.A0F);
        if (6Bl.A02(sticker)) {
            ((C6i4) 1Br.A0B(this.A0D)).A00(DisclaimerTriggerSource.StickerSend.A00, this.A00);
        }
    }
}
