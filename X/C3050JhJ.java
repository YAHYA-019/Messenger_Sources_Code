package X;

import android.os.Parcelable;

/* renamed from: X.JhJ, reason: case insensitive filesystem */
/* loaded from: JhJ.class */
public final class C3050JhJ extends L53 {
    public final Class A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3050JhJ(Class cls) {
        super(true);
        11T.A0F(cls, 1);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw AnonymousClass002.A0D(" does not implement Parcelable.", JR0.A0t(cls));
        }
        try {
            Class<?> cls2 = Class.forName(0Pz.A0X("[L", cls.getName(), ';'));
            11T.A0I(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
            this.A00 = cls2;
        } catch (ClassNotFoundException unused) {
            throw AnonymousClass001.A0U("[L");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !1BL.A1V(this, obj)) {
            return false;
        }
        return 11T.A0O(this.A00, ((C3050JhJ) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
