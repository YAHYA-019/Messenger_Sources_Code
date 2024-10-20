package X;

import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: KyA.class */
public abstract class KyA {
    public static final JVA A01 = new Canvas();
    public static final long A00 = 0 << 32;

    public static final TextDirectionHeuristic A00(int i) {
        return i != 0 ? i != 1 ? i != 2 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
