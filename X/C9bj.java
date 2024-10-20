package X;

import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9bj, reason: invalid class name */
/* loaded from: 9bj.class */
public final class C9bj {
    public final ThreadThemeInfo A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;

    public C9bj(ThreadThemeInfo threadThemeInfo, ImmutableList immutableList, String str, boolean z) {
        this.A02 = str;
        this.A01 = immutableList;
        this.A00 = threadThemeInfo;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9bj)) {
                return false;
            }
            C9bj c9bj = (C9bj) obj;
            if (!11T.A0O(this.A02, c9bj.A02)) {
                return false;
            }
            ImmutableList immutableList = this.A01;
            ImmutableList immutableList2 = c9bj.A01;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            ThreadThemeInfo threadThemeInfo = this.A00;
            ThreadThemeInfo threadThemeInfo2 = c9bj.A00;
            if (threadThemeInfo != null) {
                if (!threadThemeInfo.equals(threadThemeInfo2)) {
                    return false;
                }
            } else if (threadThemeInfo2 != null) {
                return false;
            }
            if (this.A03 != c9bj.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A05(this, this.A02, this.A01, this.A00, Boolean.valueOf(this.A03));
    }
}
