package X;

import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* renamed from: X.4ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ke.class */
public final class C07684ke {
    public final ThreadThemeInfo A00;

    public C07684ke(ThreadThemeInfo threadThemeInfo) {
        C1pq.A08("threadThemeInfo", threadThemeInfo);
        this.A00 = threadThemeInfo;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C07684ke) && 11T.A0O(this.A00, ((C07684ke) obj).A00));
    }

    public int hashCode() {
        return C1pq.A04(this.A00, 1);
    }
}
