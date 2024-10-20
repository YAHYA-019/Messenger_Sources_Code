package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: X.5H6, reason: invalid class name */
/* loaded from: 5H6.class */
public abstract class C5H6 {
    public static final Random A00 = new Random();

    public static ArrayList A00() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new 2N8("asl_session_id", new 30N(0)));
        arrayList.add(new 2N8("asl_endpoint", new 30N(1)));
        arrayList.add(new 2N8(TraceFieldType.IsForeground, new 30N(2)));
        arrayList.add(new 2N8("all_thread_names", new J4w(new Object(), 1)));
        return arrayList;
    }
}
