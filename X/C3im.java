package X;

import android.util.Pair;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import java.util.Comparator;

/* renamed from: X.3im, reason: invalid class name */
/* loaded from: 3im.class */
public final class C3im implements Comparator {
    public final int A00;

    public C3im(int i) {
        this.A00 = i;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        long j;
        long j2;
        switch (this.A00) {
            case 0:
                1vF r0 = (1vF) obj;
                1vF r02 = (1vF) obj2;
                synchronized (r0) {
                    j = r0.A00;
                }
                synchronized (r02) {
                    j2 = r02.A00;
                }
                if (j < j2) {
                    return -1;
                }
                return j > j2 ? 1 : 0;
            case 1:
                i = ((String) ((Pair) obj2).first).length();
                i2 = ((String) ((Pair) obj).first).length();
                break;
            case 2:
                return -Float.compare(((5US) obj).A00, ((5US) obj2).A00);
            case 3:
                return (((ThreadParticipant) obj).A03 > ((ThreadParticipant) obj2).A03 ? 1 : (((ThreadParticipant) obj).A03 == ((ThreadParticipant) obj2).A03 ? 0 : -1));
            case 4:
                2QW r03 = (2QW) obj;
                2QW r04 = (2QW) obj2;
                11T.A0H(r03, r04);
                int ordinal = r03.ordinal();
                i = 4;
                if (ordinal != 9) {
                    if (ordinal == 8) {
                        i = 3;
                    } else if (ordinal != 7) {
                        i = 1;
                        if (ordinal != 6) {
                            i = 0;
                        }
                    } else {
                        i = 2;
                    }
                }
                int ordinal2 = r04.ordinal();
                i2 = 4;
                if (ordinal2 != 9) {
                    if (ordinal2 == 8) {
                        i2 = 3;
                        break;
                    } else if (ordinal2 == 7) {
                        i2 = 2;
                        break;
                    } else {
                        i2 = 1;
                        if (ordinal2 != 6) {
                            i2 = 0;
                            break;
                        }
                    }
                }
                break;
            case 5:
                i = ((PicSquareUrlWithSize) obj).size;
                i2 = ((PicSquareUrlWithSize) obj2).size;
                break;
            default:
                return 0;
        }
        return i - i2;
    }
}
