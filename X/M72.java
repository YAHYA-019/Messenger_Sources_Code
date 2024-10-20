package X;

import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.functions.Function2;

/* loaded from: M72.class */
public final class M72 extends C00q implements Function2 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M72(KMj kMj, String str, int i, boolean z) {
        super(2);
        this.A00 = i;
        this.A02 = str;
        this.A03 = z;
        this.A01 = kMj;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        MLv mLv = (MLv) obj;
        int A03 = AnonymousClass001.A03(obj2) & 3;
        if (i != 0) {
            if (A03 != 2 || !mLv.BBC()) {
                L3f.A02.A02(mLv, null, (KMj) this.A01, this.A02, DalvikInternals.IOPRIO_BACKGROUND, 2, this.A03);
            }
            mLv.D0o();
        } else {
            if (A03 != 2 || !mLv.BBC()) {
                L3f.A02.A01(mLv, null, (KMj) this.A01, this.A02, DalvikInternals.IOPRIO_BACKGROUND, 2, this.A03);
            }
            mLv.D0o();
        }
        return 04S.A00;
    }
}
