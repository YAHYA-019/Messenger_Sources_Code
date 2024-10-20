package X;

import android.view.View;
import com.facebook.messaging.inboxfolders.model.FoldersEmptyStateDecorImage;

/* renamed from: X.9br, reason: invalid class name */
/* loaded from: 9br.class */
public final class C9br {
    public final int A00;
    public final int A01;
    public final View.OnClickListener A02;
    public final FoldersEmptyStateDecorImage A03;
    public final String A04;

    public C9br(View.OnClickListener onClickListener, FoldersEmptyStateDecorImage foldersEmptyStateDecorImage, String str, int i, int i2) {
        this.A02 = onClickListener;
        this.A00 = i;
        this.A04 = str;
        this.A03 = foldersEmptyStateDecorImage;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9br)) {
                return false;
            }
            C9br c9br = (C9br) obj;
            if (!11T.A0O(this.A02, c9br.A02) || this.A00 != c9br.A00 || !11T.A0O(this.A04, c9br.A04) || !11T.A0O(this.A03, c9br.A03) || this.A01 != c9br.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C1pq.A04(this.A03, C1pq.A04(this.A04, (C1pq.A03(this.A02) * 31) + this.A00)) * 31) + 1237) * 31) + this.A01;
    }
}
