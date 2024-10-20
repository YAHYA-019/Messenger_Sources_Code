package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9kb, reason: invalid class name */
/* loaded from: 9kb.class */
public final class C9kb {
    public final Context A00;
    public final LiveData A01;
    public final MutableLiveData A02;
    public final FbUserSession A03;
    public final 1Br A04 = 7zM.A0Z();
    public final ThreadSummary A05;
    public final String A06;

    public C9kb(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, String str, boolean z) {
        String str2;
        this.A00 = context;
        this.A06 = str;
        this.A05 = threadSummary;
        this.A03 = fbUserSession;
        MutableLiveData A0H = 7zL.A0H();
        this.A02 = A0H;
        this.A01 = A0H;
        C1x1 A0O = 7zP.A0O(this.A04);
        Integer num = 0S2.A01;
        A0O.A00(A0H, new 8LV((Bitmap) null, (UserKey) null, (C2fr) null, num, (String) null, (String) null, (String) null, (String) null, (String) null, true, z, false, true));
        ThreadSummary threadSummary2 = this.A05;
        if (threadSummary2 != null) {
            FbUserSession fbUserSession2 = this.A03;
            Context context2 = this.A00;
            C2fr A0O2 = ((2fZ) 1Lm.A05(context2, fbUserSession2, 17067)).A0O(threadSummary2, 0, false, false, true);
            String str3 = threadSummary2.A20;
            String A0u = 4YU.A0u(context2.getResources(), str3, 2131964026);
            11T.A0A(A0u);
            String str4 = 5OA.A03(threadSummary2) ? threadSummary2.A22 : null;
            MutableLiveData mutableLiveData = this.A02;
            8LV r309 = (8LV) mutableLiveData.getValue();
            r309 = r309 == null ? new 8LV((Bitmap) null, (UserKey) null, (C2fr) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, true, true, false) : r309;
            7zP.A0O(this.A04).A00(mutableLiveData, new 8LV(r309.A00, r309.A01, A0O2, r309.A03, r309.A06, r309.A05, str3, str4, A0u, r309.A09, r309.A0A, r309.A0C, r309.A0B));
        }
        List<String> pathSegments = 7zU.A0C(this.A06).getPathSegments();
        if (pathSegments.size() > 2) {
            String str5 = pathSegments.get(2);
            11T.A0A(str5);
            str2 = str5;
        } else {
            str2 = "communityInviteLinkNoHash";
        }
        A00(this);
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put(KMm.A01, "UTF-8");
        AnonymousClass001.A1A(KMm.A03, A0u2, 6);
        Bitmap A00 = L6v.A00(L6r.A01(num, str, A0u2), 400, 400);
        8LV r3092 = (8LV) A0H.getValue();
        r3092 = r3092 == null ? new 8LV((Bitmap) null, (UserKey) null, (C2fr) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, true, true, false) : r3092;
        7zP.A0O(this.A04).A00(A0H, new 8LV(A00, r3092.A01, r3092.A02, r3092.A03, str, str2, r3092.A07, r3092.A08, r3092.A04, false, r3092.A0A, r3092.A0C, r3092.A0B));
    }

    public static final void A00(C9kb c9kb) {
        MutableLiveData mutableLiveData = c9kb.A02;
        8LV A0L = 7zV.A0L(mutableLiveData);
        C1x1 A0O = 7zP.A0O(c9kb.A04);
        String str = A0L.A06;
        String str2 = A0L.A05;
        Bitmap bitmap = A0L.A00;
        UserKey userKey = A0L.A01;
        String str3 = A0L.A07;
        String str4 = A0L.A08;
        boolean z = A0L.A0A;
        boolean z2 = A0L.A0C;
        String str5 = A0L.A04;
        A0O.A00(mutableLiveData, new 8LV(bitmap, userKey, A0L.A02, A0L.A03, str, str2, str3, str4, str5, true, z, z2, A0L.A0B));
    }

    public static final void A01(C9kb c9kb, String str) {
        MutableLiveData mutableLiveData = c9kb.A02;
        8LV A0L = 7zV.A0L(mutableLiveData);
        A00(c9kb);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(KMm.A01, "UTF-8");
        AnonymousClass001.A1A(KMm.A03, A0u, 6);
        7zP.A0O(c9kb.A04).A00(mutableLiveData, 8LV.A00(L6v.A00(L6r.A01(0S2.A01, str, A0u), 400, 400), A0L, str, A0L.A05));
    }
}
