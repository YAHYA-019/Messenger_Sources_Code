package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.4go, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4go.class */
public final class C06394go implements InterfaceC06244gU {
    public final InterfaceC06384gn A00;

    public C06394go(InterfaceC06384gn interfaceC06384gn) {
        11T.A0F(interfaceC06384gn, 1);
        this.A00 = interfaceC06384gn;
    }

    @Override // X.InterfaceC06244gU
    public Drawable AJd(Resources resources, C06974ih c06974ih, 2Ea r304) {
        11T.A0F(r304, 1);
        InterfaceC06384gn interfaceC06384gn = this.A00;
        if (interfaceC06384gn.D3e(r304)) {
            return interfaceC06384gn instanceof InterfaceC06244gU ? ((InterfaceC06244gU) interfaceC06384gn).AJd(resources, c06974ih, r304) : interfaceC06384gn.AJc(r304);
        }
        return null;
    }
}
