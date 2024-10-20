package X;

import com.facebook.iorg.common.zero.IorgDialogDisplayContext;
import java.util.EnumMap;

/* loaded from: EdI.class */
public final class EdI {
    public EnumMap A00 = new EnumMap(IorgDialogDisplayContext.class);

    public EdI() {
        IorgDialogDisplayContext[] values = IorgDialogDisplayContext.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            this.A00.put((EnumMap) values[i2], (IorgDialogDisplayContext) 0);
            i = i2 + 1;
        }
    }
}
