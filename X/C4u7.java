package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4u7, reason: invalid class name */
/* loaded from: 4u7.class */
public final class C4u7 implements 0LF {
    public final List A00 = new ArrayList();
    public final /* synthetic */ 4tZ A01;

    public C4u7(4tZ r302) {
        this.A01 = r302;
    }

    public void CY5(File file) {
    }

    public void CYH(File file) {
    }

    public void DA4(File file) {
        4tZ r0 = this.A01;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            String str = ".cnt";
            if (!str.equals(substring)) {
                str = ".tmp";
                if (!str.equals(substring)) {
                    return;
                }
            }
            String substring2 = name.substring(0, lastIndexOf);
            if (str.equals(".tmp")) {
                int lastIndexOf2 = substring2.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return;
                } else {
                    substring2 = substring2.substring(0, lastIndexOf2);
                }
            }
            if (4tZ.A00(r0, substring2).equals(file.getParentFile()) && str == str) {
                this.A00.add(new FbZ(substring2, file));
            }
        }
    }
}
