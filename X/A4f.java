package X;

import android.text.format.DateUtils;

/* loaded from: A4f.class */
public final class A4f implements C70y {
    @Override // X.C70y
    public String ATo(long j) {
        if (j < 0) {
            j = 0;
        }
        String formatElapsedTime = DateUtils.formatElapsedTime(j);
        if (formatElapsedTime == null) {
            formatElapsedTime = "";
        }
        return formatElapsedTime;
    }
}
