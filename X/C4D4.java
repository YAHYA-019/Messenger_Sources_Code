package X;

/* renamed from: X.4D4, reason: invalid class name */
/* loaded from: 4D4.class */
public interface C4D4 {
    int dumpJavaHeap(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb);

    int dumpJavaHeapAsync(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb, boolean z);

    void initialize(boolean z, boolean z2, int i);

    void prepareForDump(4DD r1, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4);

    int waitForDump(StringBuilder sb);
}
