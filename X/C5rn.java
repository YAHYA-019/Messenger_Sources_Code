package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.5rn, reason: invalid class name */
/* loaded from: 5rn.class */
public final class C5rn {
    public final int A00;
    public final Bundle A01;
    public final CharSequence A02;
    public final String A03;
    public final Set A04;
    public final boolean A05;
    public final CharSequence[] A06;

    public C5rn(Bundle bundle, CharSequence charSequence, String str, Set set, CharSequence[] charSequenceArr, int i, boolean z) {
        this.A03 = str;
        this.A02 = charSequence;
        this.A06 = charSequenceArr;
        this.A05 = z;
        this.A00 = i;
        this.A01 = bundle;
        this.A04 = set;
        if (i == 2 && !z) {
            throw AnonymousClass001.A0L("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
