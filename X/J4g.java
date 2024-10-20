package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.Comparator;

/* loaded from: J4g.class */
public final class J4g implements Comparator {
    public final int A00;

    public J4g(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        switch (this.A00) {
            case 0:
                return Long.signum(((MediaResource) obj2).A06 - ((MediaResource) obj).A06);
            case 1:
                5N6 r0 = (5N6) obj;
                5N6 r02 = (5N6) obj2;
                long j = r0.A02;
                long j2 = r02.A02;
                if (j - j2 == 0) {
                    return r0.A02(r02);
                }
                i = 1;
                if (j < j2) {
                    return -1;
                }
                return i;
            default:
                i = 0;
                return i;
        }
    }
}
