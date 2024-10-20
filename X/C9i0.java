package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9i0, reason: invalid class name */
/* loaded from: 9i0.class */
public final class C9i0 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C9i0(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 16979);
        this.A01 = 1Bu.A03(r0, 67527);
    }

    private final void A00(FragmentActivity fragmentActivity, Integer num, C00m c00m, C00m c00m2, int i, int i2, int i3) {
        1Br.A0C(this.A01);
        DR6 A01 = C5ic.A01(fragmentActivity, 7zQ.A0m(this.A00));
        A01.A00(i);
        A01.A06(i2);
        C9oG.A02(A01, c00m, 22, i3);
        if (num != null) {
            C9oG.A01(A01, c00m2, 21, num.intValue());
        }
        AJd.A03(A01, LifecycleOwnerKt.getLifecycleScope(fragmentActivity), 32);
    }

    public final void A01(FragmentActivity fragmentActivity, GoogleAuthController googleAuthController, 99K r304, C00m c00m, C00m c00m2, C00m c00m3, Function1 function1) {
        int i;
        Integer num;
        C00m c00m4;
        int i2;
        int i3;
        11T.A0F(r304, 2);
        if (r304 instanceof C8rp) {
            0fH.A0j("GDriveErrorDialogHandler", "handle sign in action");
            Intent intent = ((C8rp) r304).A00;
            if (intent != null) {
                LQp lQp = googleAuthController.A00;
                if (lQp == null) {
                    0fH.A0n("GoogleAuthController", "observer is null");
                    return;
                }
                1BL.A1I(intent, "Launching intent ", "GoogleAuthController", AnonymousClass001.A0k());
                2aK.A03((Integer) null, (0DE) null, new AJj(intent, lQp, fragmentActivity, (0DR) null, 38), LifecycleOwnerKt.getLifecycleScope(fragmentActivity), 3);
                return;
            }
            return;
        }
        if (r304 instanceof C8ro) {
            0fH.A0j("GDriveErrorDialogHandler", "retry sign in action");
            function1.invoke(((C8ro) r304).A00);
            return;
        }
        C00m c00m5 = c00m2;
        if (r304 instanceof C8rs) {
            0fH.A0j("GDriveErrorDialogHandler", "handle ShowRetryDialog");
            C8rs c8rs = (C8rs) r304;
            i2 = c8rs.A01;
            i3 = c8rs.A00;
            i = 2131957202;
            num = 2131957198;
            c00m4 = c00m;
        } else {
            if (!(r304 instanceof C8rq)) {
                if (r304 instanceof C8rr) {
                    0fH.A0j("GDriveErrorDialogHandler", "handle ShowMoreOptionDialog");
                    C8rr c8rr = (C8rr) r304;
                    A00(fragmentActivity, 2131957209, c00m2, c00m3, c8rr.A01, c8rr.A00, 2131957198);
                    return;
                }
                return;
            }
            0fH.A0j("GDriveErrorDialogHandler", "handle ShowConfirmDialog");
            C8rq c8rq = (C8rq) r304;
            i = 2131957198;
            num = null;
            c00m4 = c00m2;
            c00m5 = null;
            i2 = c8rq.A01;
            i3 = c8rq.A00;
        }
        A00(fragmentActivity, num, c00m4, c00m5, i2, i3, i);
    }

    public final void A02(FragmentActivity fragmentActivity, String str, String str2, C00m c00m) {
        1BL.A1F(str, str2);
        1Br.A0C(this.A01);
        DR6 A01 = C5ic.A01(fragmentActivity, 7zQ.A0m(this.A00));
        A01.A00(2131957190);
        A01.A0J(str);
        C9oG.A00(A01, str2, c00m, 20);
        AJd.A03(A01, LifecycleOwnerKt.getLifecycleScope(fragmentActivity), 31);
    }

    public final void A03(FragmentActivity fragmentActivity, String str, C00m c00m) {
        11T.A0F(str, 1);
        1Br.A0C(this.A01);
        DR6 A01 = C5ic.A01(fragmentActivity, 7zQ.A0m(this.A00));
        A01.A03(1BK.A0v(fragmentActivity, str, 2131957178));
        A01.A06(2131957177);
        C9oG.A02(A01, c00m, 19, 2131957186);
        AJd.A03(A01, 7zO.A0J(fragmentActivity), 30);
    }
}
