package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7nI, reason: invalid class name */
/* loaded from: 7nI.class */
public abstract class C7nI {
    public static final Set A00;
    public static final Set A01;
    public static final Set A02;

    static {
        ArrayList arrayList = new ArrayList(5);
        Collections.addAll(arrayList, "displayed", "requested_playing", "started_playing", "unpaused", "unmuted");
        A01 = Collections.unmodifiableSet(new HashSet(arrayList));
        ArrayList arrayList2 = new ArrayList(2);
        Collections.addAll(arrayList2, "requested_playing", "unmuted");
        A02 = Collections.unmodifiableSet(new HashSet(arrayList2));
        ArrayList arrayList3 = new ArrayList(1);
        Collections.addAll(arrayList3, "video_chaining_impression");
        A00 = Collections.unmodifiableSet(new HashSet(arrayList3));
    }
}
