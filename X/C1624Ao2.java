package X;

import android.view.MotionEvent;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ao2, reason: case insensitive filesystem */
/* loaded from: Ao2.class */
public final class C1624Ao2 extends 5W6 {
    public final /* synthetic */ DI8 A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ boolean A02;

    public C1624Ao2(DI8 di8, ImmutableList immutableList, boolean z) {
        this.A01 = immutableList;
        this.A02 = z;
        this.A00 = di8;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 >= 0.0f) {
            return true;
        }
        ImmutableList immutableList = this.A01;
        int size = immutableList != null ? immutableList.size() : 0;
        int i = 3;
        if (this.A02) {
            i = 2;
        }
        if (size <= i) {
            return true;
        }
        this.A00.Bx8();
        return true;
    }
}
