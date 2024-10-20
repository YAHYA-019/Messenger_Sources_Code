package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.memories.model.MemoryViewModel;
import java.util.List;

/* renamed from: X.92m, reason: invalid class name */
/* loaded from: 92m.class */
public final class C92m extends GY8 {
    public final MemoryViewModel A00;
    public final List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92m(06Z r302, MemoryViewModel memoryViewModel, List list) {
        super(r302);
        11T.A0F(list, 2);
        this.A00 = memoryViewModel;
        this.A01 = list;
    }

    public int A0C() {
        return this.A01.size();
    }

    @Override // X.GY8
    public Fragment A0I(int i) {
        MemoryViewModel memoryViewModel = this.A00;
        int i2 = ((C96y) this.A01.get(i)).modeId;
        1pK r0 = new 1pK();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("arg_memory_view_model", new OpaqueParcelable(memoryViewModel));
        A05.putInt("arg_template_mode", i2);
        r0.setArguments(A05);
        return r0;
    }
}
