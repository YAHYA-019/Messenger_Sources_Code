package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;

/* renamed from: X.3dx, reason: invalid class name */
/* loaded from: 3dx.class */
public final class C3dx implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C3dx(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        0fH.A0v("FriendsInboxUnitItemListener", "Failed to fetch the thread key.", th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        1GU r309;
        AHD aha;
        ThreadKey threadKey = (ThreadKey) obj;
        if (this.A00 != 0) {
            if (threadKey == null) {
                return;
            }
            3xR r0 = (3xR) this.A01;
            RichStatus A03 = r0.A03();
            User A04 = r0.A04();
            C2i8 c2i8 = (C2i8) this.A04;
            if (!C2i8.A02(c2i8).A03() || A03 == null || A04 == null) {
                return;
            }
            r309 = (1GU) 1Br.A0B(c2i8.A04);
            aha = new AHD((EnumC03533yL) this.A02, (C00i) this.A03, c2i8, threadKey, r0, A03, A04);
        } else {
            if (threadKey == null) {
                return;
            }
            2tH r02 = (2tH) this.A01;
            RichStatus richStatus = r02.A01;
            C2i8 c2i82 = (C2i8) this.A04;
            if (!C2i8.A02(c2i82).A03() || richStatus == null || r02.A02 == null) {
                return;
            }
            r309 = (1GU) 1Br.A0B(c2i82.A04);
            aha = new AHA((EnumC03533yL) this.A02, (1Br) this.A03, c2i82, threadKey, r02, richStatus);
        }
        r309.Ciz(aha);
    }
}
