package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.MediaResourceList;
import com.facebook.messaging.sharedalbum.repository.RepositoryHelperKt;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9iC, reason: invalid class name */
/* loaded from: 9iC.class */
public final class C9iC {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;

    public C9iC(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A07 = 1Bu.A03(r0, 16428);
        this.A06 = 1Bu.A03(r0, 83430);
        this.A01 = 1Bu.A03(r0, 68433);
        this.A04 = 1Bu.A03(r0, 67786);
        this.A05 = 7zM.A0O();
        this.A03 = 1Bu.A03(r0, 65937);
        this.A02 = 1Bu.A03(r0, 68630);
    }

    private final boolean A00(MediaResourceList mediaResourceList, C00m c00m) {
        Iterator it = mediaResourceList.A00.iterator();
        while (it.hasNext()) {
            if (4YU.A0Z(it).A07 >= ((9XD) 1Br.A0B(this.A02)).A00() * 16) {
                c00m.invoke();
                return true;
            }
        }
        return false;
    }

    public void A01(Context context, Parcelable parcelable, 06Z r304, ThreadKey threadKey, String str, C00m c00m, C00m c00m2) {
        1BK.A1J(threadKey, 1, r304);
        if (((C6jQ) 1Br.A0B(this.A03)).A0G) {
            A05(threadKey, new ARe(context, parcelable, threadKey, this, str, c00m, new AKt(threadKey, r304, this, context, str, 1), c00m2));
        } else {
            c00m.invoke();
        }
    }

    public void A02(Parcelable parcelable, FbUserSession fbUserSession, ThreadKey threadKey, String str, C00m c00m) {
        9gL r315;
        5P5 r313;
        int i;
        7zT.A1S(fbUserSession, threadKey, str);
        11T.A0F(c00m, 4);
        if (str.length() != 0) {
            Object obj = parcelable;
            if (parcelable != null) {
                1BY r0 = this.A00.A00;
                Integer num = 1Lo.A05;
                1MV r02 = new 1MV(fbUserSession, r0, 68590);
                if (threadKey.A0z()) {
                    r315 = (9gL) r02.get();
                    r313 = (5P5) 1Br.A0B(r315.A03);
                    i = 6;
                } else {
                    obj = 9dR.A01(parcelable);
                    if (obj == null) {
                        return;
                    }
                    r315 = (9gL) r02.get();
                    r313 = (5P5) 1Br.A0B(r315.A03);
                    i = 5;
                }
                RepositoryHelperKt.A05(threadKey, r313, new AV9(obj, r315, c00m, str, i));
            }
        }
    }

    public void A03(ThreadKey threadKey, MediaResourceList mediaResourceList, String str, C00m c00m, C00m c00m2) {
        7zT.A1S(threadKey, str, mediaResourceList);
        C3o5.A0k(c00m, 4, c00m2);
        if (str.length() <= 0 || !1BK.A1Y(mediaResourceList.A00) || A00(mediaResourceList, c00m2)) {
            return;
        }
        9gL r0 = (9gL) 4YU.A0n(1Br.A03(this.A07), this.A00, 68590);
        RepositoryHelperKt.A05(threadKey, (5P5) 1Br.A0B(r0.A03), new ARX(mediaResourceList, r0, c00m, str, 0, 0L));
    }

    public void A04(ThreadKey threadKey, MediaResourceList mediaResourceList, C00m c00m, long j) {
        11T.A0F(mediaResourceList, 2);
        if (!1BK.A1Y(mediaResourceList.A00) || A00(mediaResourceList, c00m)) {
            return;
        }
        9gK r0 = (9gK) 4YU.A0n(1Br.A03(this.A07), this.A00, 68589);
        RepositoryHelperKt.A05(threadKey, (5P5) 1Br.A0B(r0.A03), new ARB(1, j, mediaResourceList, r0));
    }

    public void A05(ThreadKey threadKey, Function1 function1) {
        9gK r0 = (9gK) 4YU.A0n(1Br.A03(this.A07), this.A00, 68589);
        RepositoryHelperKt.A05(threadKey, (5P5) 1Br.A0B(r0.A03), 83U.A01(AV2.A00(function1, 42), r0, 25));
    }
}
