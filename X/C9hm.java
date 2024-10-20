package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.cameracore.litecamera.richmediaviewer.ardelivery.fb4a.AvatarEffectApplier$load$lambda$1$$inlined$CoroutineExceptionHandler$1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.9hm, reason: invalid class name */
/* loaded from: 9hm.class */
public final class C9hm {
    public static final String A05;
    public String A00;
    public final 1Br A04 = 1Bu.A00(16428);
    public final 1Br A03 = 1Bu.A00(82984);
    public final 1Br A02 = 1Bu.A00(98590);
    public final 1Xo A01 = new 1Xo(1);

    static {
        java.util.Map map = 0BY.A03;
        A05 = C0Bx.A01(C9hm.class);
    }

    public void A00(JHv jHv, String str) {
        11T.A0H(jHv, str);
        FbUserSession A03 = 1Br.A03(this.A04);
        String str2 = this.A00;
        if (str2 != null) {
            AvatarEffectApplier$load$lambda$1$$inlined$CoroutineExceptionHandler$1 avatarEffectApplier$load$lambda$1$$inlined$CoroutineExceptionHandler$1 = new AvatarEffectApplier$load$lambda$1$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, jHv);
            2aK.A03((Integer) null, 0DK.A02(2Zo.A01(), avatarEffectApplier$load$lambda$1$$inlined$CoroutineExceptionHandler$1), new AJc(A03, jHv, this, str, str2, null), 7zN.A0y(), 2);
        }
    }

    public void A01(String str) {
        this.A00 = str;
    }
}
