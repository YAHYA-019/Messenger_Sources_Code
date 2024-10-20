package X;

import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* loaded from: Buq.class */
public final class Buq {
    public ImmutableList A00 = null;
    public String A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public Buq(Object obj, String str, String str2, String str3) {
        this.A03 = Platform.stringIsNullOrEmpty(str) ? null : str;
        this.A04 = Platform.stringIsNullOrEmpty(str2) ? null : str2;
        this.A01 = Platform.stringIsNullOrEmpty(str3) ? null : str3;
        this.A02 = obj;
    }
}
