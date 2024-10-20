package X;

import android.os.Bundle;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;

/* renamed from: X.38d, reason: invalid class name */
/* loaded from: 38d.class */
public final class C38d extends 5Dn {
    public 5Do A00;
    public final Bundle A01;
    public final String A02;

    public C38d(Bundle bundle, String str, String str2, String str3, int i, int i2, long j, long j2) {
        super(str, str2, i, i2, j, j2);
        Preconditions.checkArgument(!Platform.stringIsNullOrEmpty(str3));
        this.A02 = str3;
        this.A01 = bundle;
    }

    public String A00() {
        return this.A02;
    }
}
