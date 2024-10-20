package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.3R9, reason: invalid class name */
/* loaded from: 3R9.class */
public final class C3R9 {
    public final java.util.Map A00;

    public C3R9() {
        this.A00 = new 0QO(0);
    }

    public C3R9(java.util.Map map) {
        0QO r0 = new 0QO(map.size());
        this.A00 = r0;
        r0.putAll(map);
    }

    public ParcelableSecondaryData A00() {
        return new ParcelableSecondaryData(ImmutableMap.copyOf(this.A00));
    }

    public void A01(Parcelable parcelable) {
        Class<?> cls = parcelable.getClass();
        boolean z = true;
        if (cls == null) {
            z = false;
        }
        Preconditions.checkArgument(z);
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        Preconditions.checkNotNull(canonicalName, "Unable to determine name of class. Use a dedicated string-key or make your class a top-level class.");
        1BK.A1O(parcelable, this.A00, 1BL.A05(canonicalName) + 31);
    }
}
