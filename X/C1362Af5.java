package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import java.util.List;

/* renamed from: X.Af5, reason: case insensitive filesystem */
/* loaded from: Af5.class */
public final class C1362Af5 extends ArrayAdapter {
    public final boolean A00;
    public final boolean A01;
    public final int A02;
    public final MigColorScheme A03;
    public final UserKey A04;

    public C1362Af5(Context context, MigColorScheme migColorScheme, UserKey userKey, List list, int i, boolean z, boolean z2) {
        super(context, 0, list);
        this.A03 = migColorScheme;
        this.A04 = userKey;
        this.A02 = i;
        this.A01 = z;
        this.A00 = z2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        int count = super.getCount();
        if (this.A01) {
            count++;
        }
        if (this.A00) {
            count++;
        }
        return count;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r302 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r302 == 1) goto L8;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r302, android.view.View r303, android.view.ViewGroup r304) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A01
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L50
            r0 = r301
            boolean r0 = r0.A00
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L49
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L50
        L1f:
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r308 = r0
            r0 = r301
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.A03
            r309 = r0
            r0 = r301
            com.facebook.user.model.UserKey r0 = r0.A04
            r310 = r0
            r0 = 0
            r307 = r0
        L34:
            X.BIm r0 = new X.BIm
            r311 = r0
            r0 = r311
            r1 = r308
            r2 = r309
            r3 = r310
            r4 = r307
            r0.<init>(r1, r2, r3, r4)
            r0 = r311
            return r0
        L49:
            r0 = r302
            if (r0 != 0) goto L77
            goto L1f
        L50:
            r0 = r302
            if (r0 != 0) goto L77
            r0 = r301
            boolean r0 = r0.A00
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L77
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r308 = r0
            r0 = r301
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.A03
            r309 = r0
            r0 = r301
            com.facebook.user.model.UserKey r0 = r0.A04
            r310 = r0
            r0 = 1
            r307 = r0
            goto L34
        L77:
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r308 = r0
            r0 = r301
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.A03
            r309 = r0
            r0 = r305
            if (r0 == 0) goto L8c
            r0 = r302
            r1 = -1
            int r0 = r0 + r1
            r302 = r0
        L8c:
            r0 = r301
            boolean r0 = r0.A00
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9b
            r0 = r302
            r1 = -1
            int r0 = r0 + r1
            r302 = r0
        L9b:
            r0 = r301
            r1 = r302
            java.lang.Object r0 = r0.getItem(r1)
            com.facebook.user.model.UserPhoneNumber r0 = (com.facebook.user.model.UserPhoneNumber) r0
            r310 = r0
            r0 = r301
            int r0 = r0.A02
            r307 = r0
            X.BIm r0 = new X.BIm
            r311 = r0
            r0 = r311
            r1 = r308
            r2 = r309
            r3 = r310
            r4 = r307
            r0.<init>(r1, r2, r3, r4)
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1362Af5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
