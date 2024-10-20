package X;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

/* renamed from: X.4A2, reason: invalid class name */
/* loaded from: 4A2.class */
public abstract class C4A2 extends C4A3 {
    public FileFilter A00;
    public Comparator A01;
    public final boolean A02;

    public C4A2(File file, boolean z) {
        super(file);
        this.A02 = z;
        this.A01 = z ? C4A0.A04 : C4A0.A05;
    }
}
