package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.ref.WeakReference;

/* renamed from: X.0ta, reason: invalid class name */
/* loaded from: 0ta.class */
public final class C0ta extends 0Z2 {
    public final 0Yq A00;
    public final 0Yw A01;

    public C0ta(0Yq r302, 0Yr r303, 0Yw r304, 0Yy r305, C0cZ c0cZ) {
        super(r303, r304, r305, c0cZ, "AppThread Binder Codes");
        this.A00 = r302;
        this.A01 = r304;
    }

    public /* bridge */ /* synthetic */ Parcelable A00(Object obj) {
        Parcel parcel = (Parcel) obj;
        0Yw r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        return r0.A01(parcel);
    }

    public /* bridge */ /* synthetic */ boolean A02(C0ti c0ti, C0te c0te, int i) {
        return this.A00.A01();
    }

    public /* bridge */ /* synthetic */ boolean A04(0tZ r302, Object obj) {
        02W.A04(!r302.A0A);
        r302.A09 = obj != null ? new WeakReference(obj) : null;
        r302.A0B = true;
        return true;
    }
}
