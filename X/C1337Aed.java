package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Aed, reason: case insensitive filesystem */
/* loaded from: Aed.class */
public final class C1337Aed extends MutableLiveData {
    public 1PA A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1De A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Hb A0M;
    public final ThreadKey A0N;
    public final Czk A0O;
    public final String A0P;
    public final AtomicBoolean A0Q;
    public final AtomicReference A0R;
    public final C01i A0S;
    public final boolean A0T;
    public final MutableLiveData A0U;
    public final Observer A0V;
    public final C1qM A0W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1337Aed(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, X.1De r304, X.1Hb r305, com.facebook.messaging.model.threadkey.ThreadKey r306, java.lang.String r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337Aed.<init>(android.content.Context, com.facebook.auth.usersession.FbUserSession, X.1De, X.1Hb, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, boolean):void");
    }

    public static final void A00(C1337Aed c1337Aed, boolean z) {
        C00j.A05("ChannelListResource.fetchChannelListAndLiveUpdate", -2040397354);
        try {
            0fH.A0j("ChannelListResource", "Starting channel list fetch and live update");
            0fH.A0j("ChannelListResource", "Fetching channel list and live updates for Msys Channel List Enabled Group");
            if (z) {
                C1x1 A0O = 7zP.A0O(c1337Aed.A0D);
                List list = (List) c1337Aed.A0R.get();
                if (list == null) {
                    list = C0ty.A00;
                }
                A0O.A00(c1337Aed, new C1339Aef(list));
            }
            1Hb r0 = c1337Aed.A0M;
            Integer valueOf = r0 != null ? Integer.valueOf(r0.value) : null;
            22B r02 = (22B) 1Br.A0B(c1337Aed.A0F);
            String str = 1F9.A0B.dbName;
            Long A0l = 4YU.A0l(c1337Aed.A0N);
            boolean z2 = c1337Aed.A0T;
            int i = (-1) >>> 1;
            C00i c00i = c1337Aed.A0H.A00;
            r02.A02(A0l, valueOf, str, (List) null, (List) null, i, false, false, false, z2, true, false, false, ((1Ux) c00i.get()).A02(), ((1Ux) c00i.get()).A03()).addResultCallback(c1337Aed.A0O);
            22I A0C = AbI.A0C(c1337Aed.A0E);
            1Um A0O2 = 1BK.A0O(A0C, 0);
            Czj.A01(A0O2, 1BK.A0P(A0O2), A0C, 8);
            C00j.A01(791196728);
        } catch (Throwable th) {
            C00j.A01(1471748074);
            throw th;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        ((C1336Aec) 7zM.A1B(this.A0S)).A01.AS4();
        C00i c00i = this.A07.A00;
        if (AbK.A0k(c00i).AZk(36315340059452149L) && !AbK.A0k(c00i).AZk(36315340069282618L)) {
            AbI.A0C(this.A0E).A0G((MailboxCallback) null, AbL.A0S(this.A0I), this.A0N.A0r());
        }
        if (AbK.A0k(c00i).AZk(36318428139106900L) && this.A00 == null) {
            1P9 A0B = AbJ.A0B(7zR.A0o(AbI.A04(this.A03), 65728));
            D0U.A01(A0B, this, "com.facebook.orca.ACTION_COMMUNITY_CHANNEL_JOIN_ACTION_START", 9);
            D0U.A01(A0B, this, "com.facebook.orca.ACTION_COMMUNITY_CHANNEL_JOIN_ACTION_FAILED", 10);
            D0U.A01(A0B, this, "com.facebook.orca.ACTION_COMMUNITY_CHANNEL_NAVIGATION_END", 11);
            1PA A02 = A0B.A02();
            A02.A00();
            this.A00 = A02;
        }
        C21S.A00(this.A0W, AbI.A0f(this.A0J));
        MutableLiveData mutableLiveData = this.A0U;
        if (mutableLiveData != null) {
            mutableLiveData.observeForever(this.A0V);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        1PA r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        this.A00 = null;
        11T.A0A(this.A0S.getValue());
        C21S.A01(this.A0W, AbI.A0f(this.A0J));
        MutableLiveData mutableLiveData = this.A0U;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.A0V);
        }
    }
}
