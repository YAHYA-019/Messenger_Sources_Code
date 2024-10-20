package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;

/* renamed from: X.Jmd, reason: case insensitive filesystem */
/* loaded from: Jmd.class */
public final class C3202Jmd extends KeG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3202Jmd(LDF ldf, AutofillContactDataCallback autofillContactDataCallback) {
        super(ldf);
        this.A00 = 4;
        this.A01 = ldf;
        this.A02 = autofillContactDataCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3202Jmd(LDF ldf, java.util.Map map) {
        super(ldf);
        this.A00 = 0;
        this.A01 = ldf;
        this.A02 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3202Jmd(Context context, LDF ldf) {
        super(ldf);
        this.A00 = 3;
        this.A01 = ldf;
        this.A02 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3202Jmd(Bundle bundle, LDF ldf, int i) {
        super(ldf);
        this.A00 = i;
        this.A01 = ldf;
        this.A02 = bundle;
    }
}
