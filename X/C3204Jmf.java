package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.IsUrlSavedCallback;
import java.util.List;

/* renamed from: X.Jmf, reason: case insensitive filesystem */
/* loaded from: Jmf.class */
public final class C3204Jmf extends KeG {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3204Jmf(LDF ldf, IsUrlSavedCallback isUrlSavedCallback, String str) {
        super(ldf);
        this.A01 = ldf;
        this.A03 = str;
        this.A02 = isUrlSavedCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3204Jmf(LDF ldf, Integer num, String str) {
        super(ldf);
        this.A01 = ldf;
        this.A02 = num;
        this.A03 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3204Jmf(LDF ldf, String str, List list) {
        super(ldf);
        this.A01 = ldf;
        this.A03 = str;
        this.A02 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3204Jmf(Bundle bundle, LDF ldf, String str) {
        super(ldf);
        this.A01 = ldf;
        this.A03 = str;
        this.A02 = bundle;
    }
}
