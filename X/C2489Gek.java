package X;

import android.content.Intent;
import android.net.Uri;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.Gek, reason: case insensitive filesystem */
/* loaded from: Gek.class */
public final class C2489Gek extends 1Ot {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ C4Dk A02;
    public final /* synthetic */ SettableFuture A03;
    public final /* synthetic */ Integer A04;

    public C2489Gek(Intent intent, Uri uri, C4Dk c4Dk, SettableFuture settableFuture, Integer num) {
        this.A02 = c4Dk;
        this.A00 = intent;
        this.A04 = num;
        this.A01 = uri;
        this.A03 = settableFuture;
    }

    public Executor A00() {
        return C06854i4.A00;
    }

    public void A01() {
        C4Dk c4Dk = this.A02;
        Ini.A02(C4Dk.A04(this.A00, this.A01, c4Dk, this.A04), this, 46);
    }
}
