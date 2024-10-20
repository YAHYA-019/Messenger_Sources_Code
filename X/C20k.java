package X;

import com.facebook.messaging.communitymessaging.threadfull.model.ThreadFullnessState;
import java.util.LinkedHashMap;

/* renamed from: X.20k, reason: invalid class name */
/* loaded from: 20k.class */
public final class C20k extends C00q implements C00m {
    public static final C20k A00 = new C20k();

    public C20k() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        ThreadFullnessState[] values = ThreadFullnessState.values();
        int length = values.length;
        int A002 = 02J.A00(length);
        if (A002 < 16) {
            A002 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A002);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return linkedHashMap;
            }
            ThreadFullnessState threadFullnessState = values[i2];
            linkedHashMap.put(Integer.valueOf(threadFullnessState.value), threadFullnessState);
            i = i2 + 1;
        }
    }
}
