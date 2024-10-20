package X;

import com.facebook.user.model.User;
import com.google.common.collect.ImmutableCollection;

/* renamed from: X.3dm, reason: invalid class name */
/* loaded from: 3dm.class */
public final class C3dm implements 1K9 {
    public final /* synthetic */ 2QV A00;
    public final /* synthetic */ boolean A01;

    public C3dm(2QV r302, boolean z) {
        this.A00 = r302;
        this.A01 = z;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        4zI.A03.A02("RtcCallParticipantsManager", "Failed to fetch new users from server", th, new Object[0]);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImmutableCollection immutableCollection = (ImmutableCollection) obj;
        if (09K.A01(immutableCollection)) {
            4zI.A03.A06("RtcCallParticipantsManager", "Successfully finished server fetch for users but yielded no results", AnonymousClass001.A1Z());
            return;
        }
        2QV r0 = this.A00;
        2QX r02 = r0.A0D;
        boolean z = this.A01;
        int i = r02.A00;
        if (i == 0) {
            r02.A03 = false;
            r02.A01 = false;
            r02.A02 = false;
        }
        r02.A00 = i + 1;
        try {
            11T.A0D(immutableCollection);
            1Du it = immutableCollection.iterator();
            while (it.hasNext()) {
                User user = (User) it.next();
                String str = user.A13;
                11T.A0A(str);
                I9O B1U = r0.B1U(str);
                if (B1U != null) {
                    2QV.A02(r0, user, B1U, z);
                }
            }
        } finally {
            int i2 = r02.A00 - 1;
            r02.A00 = i2;
            if (i2 == 0) {
                2QX.A02(r02);
                2QX.A00(r02);
                2QX.A01(r02);
            }
        }
    }
}
