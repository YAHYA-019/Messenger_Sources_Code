package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: X.469, reason: invalid class name */
/* loaded from: 469.class */
public abstract class AnonymousClass469 {
    public static Uri A00(Context context, int i) {
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i)).appendPath(resources.getResourceTypeName(i)).appendPath(resources.getResourceEntryName(i)).build();
    }

    public Uri A01(Context context) {
        return A00(context, ((C46C) this).A01);
    }

    public AnonymousClass469 A02(float f, int i) {
        return new C46C(((C46C) this).A01, f, i);
    }

    public boolean A03(5rQ r302, float f, int i) {
        r302.A09(((C46C) this).A01, f);
        return true;
    }

    public boolean A04(5rQ r302, int i) {
        C46C c46c = (C46C) this;
        r302.A09(c46c.A01, c46c.A00);
        return true;
    }
}
