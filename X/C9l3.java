package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rollcall.model.RollCallArgs;
import com.facebook.messaging.rollcall.presentation.viewer.RollCallUnsendEntryFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9l3, reason: invalid class name */
/* loaded from: 9l3.class */
public final class C9l3 {
    public boolean A00;
    public final Context A01;
    public final LiveData A02;
    public final LiveData A03;
    public final MutableLiveData A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final RollCallArgs A0B;
    public final 9gY A0C;

    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C9l3(Context context, FbUserSession fbUserSession, RollCallArgs rollCallArgs, Capabilities capabilities) {
        1BK.A1K(rollCallArgs, 2, capabilities);
        this.A01 = context;
        this.A0B = rollCallArgs;
        this.A05 = fbUserSession;
        this.A07 = 1HG.A00(context, 68511);
        this.A08 = 1Lm.A01(fbUserSession, 67662);
        this.A09 = 1Bq.A00(68021);
        this.A0A = 1Bq.A00(68524);
        this.A06 = 1BK.A0C();
        ?? liveData = new LiveData(new 8LS(false, (String) null, false, false));
        this.A04 = liveData;
        1Bu.A06(context, 68528);
        9gY r0 = new 9gY(context, fbUserSession, rollCallArgs, capabilities);
        this.A0C = r0;
        LiveData liveData2 = r0.A01;
        this.A03 = 9D1.A00(liveData2, (LiveData) liveData, new AW4(this, 37));
        this.A02 = Transformations.map(liveData2, new AR2(this, 36));
    }

    public static final 8LS A00(C9l3 c9l3) {
        8LS r301 = (8LS) c9l3.A04.getValue();
        if (r301 == null) {
            r301 = new 8LS(false, (String) null, false, false);
        }
        return r301;
    }

    public static final boolean A01(8L5 r301) {
        List list = (List) r301.A02;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((8KM) it.next()).A0C) {
                return true;
            }
        }
        return false;
    }

    public final void A02(06Z r302, Integer num, String str, boolean z) {
        9gY r0 = this.A0C;
        ((9YY) 1Br.A0B(((C9kf) 1Lm.A05(r0.A00, r0.A02, 68527)).A07)).A00(new 9uX(str), str, false);
        9hP r02 = (9hP) 1Br.A0B(this.A07);
        ThreadKey threadKey = this.A0B.A00;
        11T.A0F(threadKey, 1);
        if (9hP.A00(r302, "unsend_entry_fragment_tag")) {
            C00i c00i = ((9KK) 1Br.A0B(r02.A06)).A00.A00;
            FbSharedPreferences A0S = 1BK.A0S(c00i);
            1G2 r03 = 1NK.A3h;
            if (!A0S.AZn(r03, false)) {
                Bundle A05 = 1BK.A05();
                A05.putParcelable("RollCallUnsendEntryFragment.thread_key", threadKey);
                A05.putBoolean("RollCallUnsendEntryFragment.is_video", z);
                A05.putInt("RollCallUnsendEntryFragment.contribution_type_raw_value", 1 - num.intValue() != 0 ? 1 : 0);
                RollCallUnsendEntryFragment rollCallUnsendEntryFragment = new RollCallUnsendEntryFragment();
                rollCallUnsendEntryFragment.setArguments(A05);
                rollCallUnsendEntryFragment.A0m(r302, "unsend_entry_fragment_tag");
                1Ql.A01(1BL.A0U(c00i), r03, true);
            }
        }
    }
}
