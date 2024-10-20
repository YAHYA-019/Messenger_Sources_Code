package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* renamed from: X.3Vn, reason: invalid class name */
/* loaded from: 3Vn.class */
public final class C3Vn implements 1xJ {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C3Vn(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ void Cit(Object obj) {
        3cD A00;
        if (this.A00 == 0) {
            AnonymousClass999 anonymousClass999 = (AnonymousClass999) obj;
            C1wv c1wv = (C1wv) this.A01;
            if (c1wv.A0F.contains(this.A02)) {
                ((C1x8) 1Br.A0B(c1wv.A0A)).A04().A03(new 9rX(anonymousClass999, c1wv, 3));
                return;
            } else {
                C1wv.A02(anonymousClass999, c1wv);
                return;
            }
        }
        C1BB c1bb = (C1BB) obj;
        if (!(c1bb instanceof C19k) || (A00 = 3Fy.A00(((C19k) c1bb).A00)) == null) {
            ((1xH) this.A01).A02();
            return;
        }
        String str = A00.A00;
        ((1xH) this.A01).A04(str);
        LockBoxStorageManager.INSTANCE.moveRecoveryCodeFromLegacyToLockBox(this.A02, str);
    }
}
